/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Objects;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Token$CommentType;

class TokenStream {
    static final boolean $assertionsDisabled = false;
    private static final char BYTE_ORDER_MARK = '\ufeff';
    private static final int EOF_CHAR = -1;
    private static final char NUMERIC_SEPARATOR = '_';
    private static final int REPORT_NUMBER_FORMAT_ERROR = -2;
    private ObjToIntMap allStrings;
    private BigInteger bigInt;
    private int commentCursor = -1;
    private String commentPrefix = "";
    Token$CommentType commentType;
    int cursor;
    private boolean dirtyLine;
    private boolean hitEOF = false;
    private boolean isBinary;
    private boolean isHex;
    private boolean isOctal;
    private boolean isOldOctal;
    private int lineEndChar = -1;
    private int lineStart = 0;
    int lineno;
    private double number;
    private Parser parser;
    private int quoteChar;
    private StringBuilder rawString = new StringBuilder();
    String regExpFlags;
    private char[] sourceBuffer;
    int sourceCursor;
    private int sourceEnd;
    private Reader sourceReader;
    private String sourceString;
    private String string = "";
    private char[] stringBuffer = new char[128];
    private int stringBufferTop;
    int tokenBeg;
    int tokenEnd;
    private final int[] ungetBuffer;
    private int ungetCursor;
    private boolean xmlIsAttribute;
    private boolean xmlIsTagContent;
    private int xmlOpenTagsCount;

    TokenStream(Parser parser, Reader reader, String string, int n2) {
        this.allStrings = new ObjToIntMap(50);
        this.ungetBuffer = new int[3];
        this.parser = parser;
        this.lineno = n2;
        if (reader != null) {
            if (string != null) {
                Kit.codeBug();
            }
            this.sourceReader = reader;
            this.sourceBuffer = new char[512];
            this.sourceEnd = 0;
        } else {
            if (string == null) {
                Kit.codeBug();
            }
            this.sourceString = string;
            this.sourceEnd = string.length();
        }
        this.cursor = 0;
        this.sourceCursor = 0;
    }

    private void addToString(int n2) {
        char[] cArray;
        int n3 = this.stringBufferTop;
        int n4 = Character.charCount(n2);
        int n5 = n3 + n4;
        if (n5 >= (cArray = this.stringBuffer).length) {
            char[] cArray2 = new char[cArray.length * 2];
            System.arraycopy(cArray, 0, cArray2, 0, n3);
            this.stringBuffer = cArray2;
        }
        if (n4 == 1) {
            this.stringBuffer[n3] = (char)n2;
        } else {
            this.stringBuffer[n3] = Character.highSurrogate(n2);
            this.stringBuffer[n3 + 1] = Character.lowSurrogate(n2);
        }
        this.stringBufferTop = n5;
    }

    private boolean canUngetChar() {
        boolean bl;
        int n2 = this.ungetCursor;
        boolean bl2 = bl = true;
        if (n2 != 0) {
            bl2 = this.ungetBuffer[n2 - 1] != 10 ? bl : false;
        }
        return bl2;
    }

    private final int charAt(int n2) {
        if (n2 < 0) {
            return -1;
        }
        String string = this.sourceString;
        if (string != null) {
            if (n2 >= this.sourceEnd) {
                return -1;
            }
            return string.charAt(n2);
        }
        int n3 = n2;
        if (n2 >= this.sourceEnd) {
            n3 = this.sourceCursor;
            try {
                boolean bl = this.fillSourceBuffer();
                if (!bl) {
                    return -1;
                }
                n3 = n2 - (n3 - this.sourceCursor);
            }
            catch (IOException iOException) {
                return -1;
            }
        }
        return this.sourceBuffer[n3];
    }

    private static String convertLastCharToHex(String string) {
        int n2 = string.length() - 1;
        StringBuilder stringBuilder = new StringBuilder(string.substring(0, n2));
        stringBuilder.append("\\u");
        string = Integer.toHexString(string.charAt(n2));
        for (int i2 = 0; i2 < 4 - string.length(); ++i2) {
            stringBuilder.append('0');
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private boolean fillSourceBuffer() {
        Object object;
        int n2;
        char[] cArray;
        if (this.sourceString != null) {
            Kit.codeBug();
        }
        if (this.sourceEnd == this.sourceBuffer.length) {
            if (this.lineStart != 0 && !this.isMarkingComment()) {
                cArray = this.sourceBuffer;
                n2 = this.lineStart;
                System.arraycopy(cArray, n2, cArray, 0, this.sourceEnd - n2);
                int n3 = this.sourceEnd;
                n2 = this.lineStart;
                this.sourceEnd = n3 - n2;
                this.sourceCursor -= n2;
                this.lineStart = 0;
            } else {
                object = this.sourceBuffer;
                cArray = new char[((Object)object).length * 2];
                System.arraycopy(object, 0, cArray, 0, this.sourceEnd);
                this.sourceBuffer = cArray;
            }
        }
        object = this.sourceReader;
        cArray = this.sourceBuffer;
        n2 = this.sourceEnd;
        if ((n2 = ((Reader)object).read(cArray, n2, cArray.length - n2)) < 0) {
            return false;
        }
        this.sourceEnd += n2;
        return true;
    }

    private int getChar() {
        return this.getChar(true, false);
    }

    private int getChar(boolean bl) {
        return this.getChar(bl, false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int getChar(boolean bl, boolean bl2) {
        Object object;
        block11: {
            int n2;
            int n3 = this.ungetCursor;
            if (n3 != 0) {
                void var3_4;
                ++this.cursor;
                int[] nArray = this.ungetBuffer;
                this.ungetCursor = --var3_4;
                return nArray[var3_4];
            }
            while (true) {
                Object object2;
                if ((object2 = this.sourceString) != null) {
                    object = this.sourceCursor;
                    if (object == this.sourceEnd) {
                        this.hitEOF = true;
                        return -1;
                    }
                    ++this.cursor;
                    object = ((String)object2).codePointAt((int)object);
                    n2 = this.sourceCursor;
                    this.sourceCursor = Character.charCount(object) + n2;
                } else {
                    if (this.sourceCursor == this.sourceEnd && !this.fillSourceBuffer()) {
                        this.hitEOF = true;
                        return -1;
                    }
                    ++this.cursor;
                    object2 = this.sourceBuffer;
                    object = this.sourceCursor;
                    this.sourceCursor = object + 1;
                    object = object2[object];
                }
                if (!bl2 && (n2 = this.lineEndChar) >= 0) {
                    if (n2 == 13 && object == 10) {
                        this.lineEndChar = 10;
                        continue;
                    }
                    this.lineEndChar = -1;
                    this.lineStart = this.sourceCursor - 1;
                    ++this.lineno;
                }
                if (object <= 127) {
                    if (object != 10) {
                        n2 = object;
                        if (object != 13) return n2;
                    }
                    break block11;
                }
                if (object == 65279) {
                    return object;
                }
                if (!bl || !TokenStream.isJSFormatChar(object)) break;
            }
            n2 = object;
            if (!ScriptRuntime.isJSLineTerminator(object)) return n2;
        }
        this.lineEndChar = object;
        return 10;
    }

    private int getCharIgnoreLineEnd() {
        return this.getChar(true, true);
    }

    private int getCharIgnoreLineEnd(boolean bl) {
        return this.getChar(bl, true);
    }

    private String getStringFromBuffer() {
        this.tokenEnd = this.cursor;
        return new String(this.stringBuffer, 0, this.stringBufferTop);
    }

    private int getTemplateLiteralChar() {
        int n2;
        int n3 = n2 = this.getCharIgnoreLineEnd(false);
        if (n2 == 10) {
            n3 = this.lineEndChar;
            if (n3 != 13) {
                if (n3 != 8232 && n3 != 8233) {
                    n3 = n2;
                }
            } else {
                n3 = n2;
                if (this.charAt(this.cursor) == 10) {
                    this.getCharIgnoreLineEnd(false);
                    n3 = n2;
                }
            }
            this.lineEndChar = -1;
            this.lineStart = this.sourceCursor - 1;
            ++this.lineno;
        }
        this.rawString.append((char)n3);
        return n3;
    }

    private static boolean isAlpha(int n2) {
        boolean bl = true;
        boolean bl2 = true;
        if (n2 <= 90) {
            bl = 65 <= n2 ? bl2 : false;
            return bl;
        }
        if (97 > n2 || n2 > 122) {
            bl = false;
        }
        return bl;
    }

    private static boolean isDigit(int n2) {
        boolean bl = 48 <= n2 && n2 <= 57;
        return bl;
    }

    private static boolean isDigit(int n2, int n3) {
        boolean bl = n2 == 10 && TokenStream.isDigit(n3) || n2 == 16 && TokenStream.isHexDigit(n3) || n2 == 8 && TokenStream.isOctalDigit(n3) || n2 == 2 && TokenStream.isDualDigit(n3);
        return bl;
    }

    private static boolean isDualDigit(int n2) {
        boolean bl = 48 == n2 || n2 == 49;
        return bl;
    }

    private static boolean isHexDigit(int n2) {
        boolean bl = 48 <= n2 && n2 <= 57 || 97 <= n2 && n2 <= 102 || 65 <= n2 && n2 <= 70;
        return bl;
    }

    private static boolean isJSFormatChar(int n2) {
        boolean bl = n2 > 127 && Character.getType((char)n2) == 16;
        return bl;
    }

    private static boolean isJSSpace(int n2) {
        boolean bl;
        block4: {
            block6: {
                block5: {
                    bl = false;
                    boolean bl2 = false;
                    if (n2 > 127) break block4;
                    if (n2 == 32 || n2 == 9 || n2 == 12) break block5;
                    bl = bl2;
                    if (n2 != 11) break block6;
                }
                bl = true;
            }
            return bl;
        }
        if (n2 == 160 || n2 == 65279 || Character.getType((char)n2) == 12) {
            bl = true;
        }
        return bl;
    }

    static boolean isKeyword(String string, int n2, boolean bl) {
        bl = TokenStream.stringToKeyword(string, n2, bl) != 0;
        return bl;
    }

    private boolean isMarkingComment() {
        boolean bl = this.commentCursor != -1;
        return bl;
    }

    private static boolean isOctalDigit(int n2) {
        boolean bl = 48 <= n2 && n2 <= 55;
        return bl;
    }

    private static boolean isValidIdentifierName(String object) {
        object = ((String)object).codePoints().toArray();
        int n2 = ((Object)object).length;
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            Object object2 = object[n3];
            if (n4 == 0 ? object2 != 36 && object2 != 95 && !Character.isUnicodeIdentifierStart((int)object2) : object2 != 36 && object2 != 8204 && object2 != 8205 && !Character.isUnicodeIdentifierPart((int)object2)) {
                return false;
            }
            ++n3;
            ++n4;
        }
        return true;
    }

    private void markCommentStart() {
        this.markCommentStart("");
    }

    private void markCommentStart(String string) {
        if (this.parser.compilerEnv.isRecordingComments() && this.sourceReader != null) {
            this.commentPrefix = string;
            this.commentCursor = this.sourceCursor - 1;
        }
    }

    private boolean matchChar(int n2) {
        int n3 = this.getCharIgnoreLineEnd();
        if (n3 == n2) {
            this.tokenEnd = this.cursor;
            return true;
        }
        this.ungetCharIgnoreLineEnd(n3);
        return false;
    }

    private boolean matchTemplateLiteralChar(int n2) {
        int n3 = this.getTemplateLiteralChar();
        if (n3 == n2) {
            return true;
        }
        this.ungetTemplateLiteralChar(n3);
        return false;
    }

    private int peekChar() {
        int n2 = this.getChar();
        this.ungetChar(n2);
        return n2;
    }

    private int peekTemplateLiteralChar() {
        int n2 = this.getTemplateLiteralChar();
        this.ungetTemplateLiteralChar(n2);
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean readCDATA() {
        block0: while (true) {
            int n2 = this.getChar();
            do {
                if (n2 == -1) {
                    this.stringBufferTop = 0;
                    this.string = null;
                    this.parser.addError("msg.XML.bad.form");
                    return false;
                }
                this.addToString(n2);
                if (n2 != 93 || this.peekChar() != 93) continue block0;
                n2 = this.getChar();
                this.addToString(n2);
            } while (this.peekChar() != 62);
            break;
        }
        this.addToString(this.getChar());
        return true;
    }

    private int readDigits(int n2, int n3) {
        int n4;
        block6: {
            n4 = n3;
            if (TokenStream.isDigit(n2, n3)) {
                this.addToString(n3);
                n3 = n4 = this.getChar();
                if (n4 == -1) {
                    return -1;
                }
                while (true) {
                    if (n3 == 95) {
                        n3 = this.getChar();
                        if (n3 != 10 && n3 != -1) {
                            if (!TokenStream.isDigit(n2, n3)) {
                                this.ungetChar(n3);
                                return 95;
                            }
                            this.addToString(95);
                            continue;
                        }
                        return -2;
                    }
                    n4 = n3;
                    if (!TokenStream.isDigit(n2, n3)) break block6;
                    this.addToString(n3);
                    n3 = n4 = this.getChar();
                    if (n4 == -1) break;
                }
                return -1;
            }
        }
        return n4;
    }

    private boolean readEntity() {
        int n2 = this.getChar();
        int n3 = 1;
        while (n2 != -1) {
            this.addToString(n2);
            if (n2 != 60) {
                if (n2 == 62) {
                    n3 = n2 = n3 - 1;
                    if (n2 == 0) {
                        return true;
                    }
                }
            } else {
                ++n3;
            }
            n2 = this.getChar();
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readPI() {
        int n2;
        while ((n2 = this.getChar()) != -1) {
            this.addToString(n2);
            if (n2 != 63 || this.peekChar() != 62) continue;
            this.addToString(this.getChar());
            return true;
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readQuotedString(int n2) {
        int n3;
        while ((n3 = this.getChar()) != -1) {
            this.addToString(n3);
            if (n3 != n2) continue;
            return true;
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean readXmlComment() {
        block0: while (true) {
            int n2 = this.getChar();
            do {
                if (n2 == -1) {
                    this.stringBufferTop = 0;
                    this.string = null;
                    this.parser.addError("msg.XML.bad.form");
                    return false;
                }
                this.addToString(n2);
                if (n2 != 45 || this.peekChar() != 45) continue block0;
                n2 = this.getChar();
                this.addToString(n2);
            } while (this.peekChar() != 62);
            break;
        }
        this.addToString(this.getChar());
        return true;
    }

    private void skipLine() {
        int n2;
        while ((n2 = this.getChar()) != -1 && n2 != 10) {
        }
        this.ungetChar(n2);
        this.tokenEnd = this.cursor;
    }

    private static int stringToKeyword(String string, int n2, boolean bl) {
        if (n2 < 200) {
            return TokenStream.stringToKeywordForJS(string);
        }
        return TokenStream.stringToKeywordForES(string, bl);
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    private static int stringToKeywordForES(String string, boolean bl) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 45;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1544803905: {
                if (!string.equals("default")) break;
                n4 = 45;
                break;
            }
            case 1380938712: {
                if (!string.equals("function")) break;
                n4 = 44;
                break;
            }
            case 902025516: {
                if (!string.equals("instanceof")) break;
                n4 = 43;
                break;
            }
            case 547812385: {
                if (!string.equals("debugger")) break;
                n4 = 42;
                break;
            }
            case 502623545: {
                if (!string.equals("interface")) break;
                n4 = 41;
                break;
            }
            case 114974605: {
                if (!string.equals("yield")) break;
                n4 = 40;
                break;
            }
            case 113101617: {
                if (!string.equals("while")) break;
                n4 = 39;
                break;
            }
            case 110339814: {
                if (!string.equals("throw")) break;
                n4 = 38;
                break;
            }
            case 109801339: {
                if (!string.equals("super")) break;
                n4 = 37;
                break;
            }
            case 97196323: {
                if (!string.equals("false")) break;
                n4 = 36;
                break;
            }
            case 94844771: {
                if (!string.equals("const")) break;
                n4 = 35;
                break;
            }
            case 94742904: {
                if (!string.equals("class")) break;
                n4 = 34;
                break;
            }
            case 94432955: {
                if (!string.equals("catch")) break;
                n4 = 33;
                break;
            }
            case 94001407: {
                if (!string.equals("break")) break;
                n4 = 32;
                break;
            }
            case 93223254: {
                if (!string.equals("await")) break;
                n4 = 31;
                break;
            }
            case 3649734: {
                if (!string.equals("with")) break;
                n4 = 30;
                break;
            }
            case 3625364: {
                if (!string.equals("void")) break;
                n4 = 29;
                break;
            }
            case 3569038: {
                if (!string.equals("true")) break;
                n4 = 28;
                break;
            }
            case 3559070: {
                if (!string.equals("this")) break;
                n4 = 27;
                break;
            }
            case 3392903: {
                if (!string.equals("null")) break;
                n4 = 26;
                break;
            }
            case 3118337: {
                if (!string.equals("enum")) break;
                n4 = 25;
                break;
            }
            case 3116345: {
                if (!string.equals("else")) break;
                n4 = 24;
                break;
            }
            case 3046192: {
                if (!string.equals("case")) break;
                n4 = 23;
                break;
            }
            case 116519: {
                if (!string.equals("var")) break;
                n4 = 22;
                break;
            }
            case 115131: {
                if (!string.equals("try")) break;
                n4 = 21;
                break;
            }
            case 108960: {
                if (!string.equals("new")) break;
                n4 = 20;
                break;
            }
            case 107035: {
                if (!string.equals("let")) break;
                n4 = 19;
                break;
            }
            case 101577: {
                if (!string.equals("for")) break;
                n4 = 18;
                break;
            }
            case 3365: {
                if (!string.equals("in")) break;
                n4 = 17;
                break;
            }
            case 3357: {
                if (!string.equals("if")) break;
                n4 = 16;
                break;
            }
            case 3211: {
                if (!string.equals("do")) break;
                n4 = 15;
                break;
            }
            case -314497661: {
                if (!string.equals("private")) break;
                n4 = 14;
                break;
            }
            case -567202649: {
                if (!string.equals("continue")) break;
                n4 = 13;
                break;
            }
            case -608539730: {
                if (!string.equals("protected")) break;
                n4 = 12;
                break;
            }
            case -807062458: {
                if (!string.equals("package")) break;
                n4 = 11;
                break;
            }
            case -853259901: {
                if (!string.equals("finally")) break;
                n4 = 10;
                break;
            }
            case -858802543: {
                if (!string.equals("typeof")) break;
                n4 = 9;
                break;
            }
            case -889473228: {
                if (!string.equals("switch")) break;
                n4 = 8;
                break;
            }
            case -892481938: {
                if (!string.equals("static")) break;
                n4 = 7;
                break;
            }
            case -915384400: {
                if (!string.equals("implements")) break;
                n4 = 6;
                break;
            }
            case -934396624: {
                if (!string.equals("return")) break;
                n4 = 5;
                break;
            }
            case -977423767: {
                if (!string.equals("public")) break;
                n4 = 4;
                break;
            }
            case -1184795739: {
                if (!string.equals("import")) break;
                n4 = 3;
                break;
            }
            case -1289153612: {
                if (!string.equals("export")) break;
                n4 = 2;
                break;
            }
            case -1305664359: {
                if (!string.equals("extends")) break;
                n4 = 1;
                break;
            }
            case -1335458389: {
                if (!string.equals("delete")) break;
                n4 = 0;
            }
        }
        int n5 = Integer.MIN_VALUE;
        block90: do {
            switch (n5 == Integer.MIN_VALUE ? n4 : n5) {
                default: {
                    return 0;
                }
                case 45: {
                    return 120;
                }
                case 44: {
                    return 113;
                }
                case 43: {
                    return 53;
                }
                case 42: {
                    return 164;
                }
                case 41: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 40: {
                    return 73;
                }
                case 39: {
                    return 121;
                }
                case 38: {
                    return 50;
                }
                case 36: {
                    return 44;
                }
                case 35: {
                    return 158;
                }
                case 33: {
                    return 128;
                }
                case 32: {
                    return 124;
                }
                case 30: {
                    return 127;
                }
                case 29: {
                    return 130;
                }
                case 27: {
                    return 43;
                }
                case 26: {
                    return 42;
                }
                case 24: {
                    return 117;
                }
                case 23: {
                    return 119;
                }
                case 22: {
                    return 126;
                }
                case 21: {
                    return 84;
                }
                case 20: {
                    return 30;
                }
                case 19: {
                    return 157;
                }
                case 18: {
                    return 123;
                }
                case 17: {
                    return 52;
                }
                case 16: {
                    return 116;
                }
                case 15: {
                    return 122;
                }
                case 14: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 13: {
                    return 125;
                }
                case 12: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 11: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 10: {
                    return 129;
                }
                case 9: {
                    return 32;
                }
                case 8: {
                    return 118;
                }
                case 7: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 6: {
                    if (!bl) return 0;
                    n5 = 1;
                    continue block90;
                }
                case 5: {
                    return 4;
                }
                case 4: {
                    if (!bl) return 0;
                }
                case 1: 
                case 2: 
                case 3: 
                case 25: 
                case 31: 
                case 34: 
                case 37: {
                    return 131;
                }
                case 0: {
                    return 31;
                }
                case 28: 
            }
            break;
        } while (true);
        if (n3 != 0) return n3 & 0xFF;
        return 0;
    }

    private static int stringToKeywordForJS(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 53;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1732898850: {
                if (!string.equals("abstract")) break;
                n4 = 60;
                break;
            }
            case 1544803905: {
                if (!string.equals("default")) break;
                n4 = 59;
                break;
            }
            case 1380938712: {
                if (!string.equals("function")) break;
                n4 = 58;
                break;
            }
            case 1052746378: {
                if (!string.equals("transient")) break;
                n4 = 57;
                break;
            }
            case 902025516: {
                if (!string.equals("instanceof")) break;
                n4 = 56;
                break;
            }
            case 547812385: {
                if (!string.equals("debugger")) break;
                n4 = 55;
                break;
            }
            case 502623545: {
                if (!string.equals("interface")) break;
                n4 = 54;
                break;
            }
            case 114974605: {
                if (!string.equals("yield")) break;
                n4 = 53;
                break;
            }
            case 113101617: {
                if (!string.equals("while")) break;
                n4 = 52;
                break;
            }
            case 110339814: {
                if (!string.equals("throw")) break;
                n4 = 51;
                break;
            }
            case 109801339: {
                if (!string.equals("super")) break;
                n4 = 50;
                break;
            }
            case 109413500: {
                if (!string.equals("short")) break;
                n4 = 49;
                break;
            }
            case 97526364: {
                if (!string.equals("float")) break;
                n4 = 48;
                break;
            }
            case 97436022: {
                if (!string.equals("final")) break;
                n4 = 47;
                break;
            }
            case 97196323: {
                if (!string.equals("false")) break;
                n4 = 46;
                break;
            }
            case 94844771: {
                if (!string.equals("const")) break;
                n4 = 45;
                break;
            }
            case 94742904: {
                if (!string.equals("class")) break;
                n4 = 44;
                break;
            }
            case 94432955: {
                if (!string.equals("catch")) break;
                n4 = 43;
                break;
            }
            case 94001407: {
                if (!string.equals("break")) break;
                n4 = 42;
                break;
            }
            case 64711720: {
                if (!string.equals("boolean")) break;
                n4 = 41;
                break;
            }
            case 3649734: {
                if (!string.equals("with")) break;
                n4 = 40;
                break;
            }
            case 3625364: {
                if (!string.equals("void")) break;
                n4 = 39;
                break;
            }
            case 3569038: {
                if (!string.equals("true")) break;
                n4 = 38;
                break;
            }
            case 3559070: {
                if (!string.equals("this")) break;
                n4 = 37;
                break;
            }
            case 3392903: {
                if (!string.equals("null")) break;
                n4 = 36;
                break;
            }
            case 3327612: {
                if (!string.equals("long")) break;
                n4 = 35;
                break;
            }
            case 3178851: {
                if (!string.equals("goto")) break;
                n4 = 34;
                break;
            }
            case 3118337: {
                if (!string.equals("enum")) break;
                n4 = 33;
                break;
            }
            case 3116345: {
                if (!string.equals("else")) break;
                n4 = 32;
                break;
            }
            case 3052374: {
                if (!string.equals("char")) break;
                n4 = 31;
                break;
            }
            case 3046192: {
                if (!string.equals("case")) break;
                n4 = 30;
                break;
            }
            case 3039496: {
                if (!string.equals("byte")) break;
                n4 = 29;
                break;
            }
            case 116519: {
                if (!string.equals("var")) break;
                n4 = 28;
                break;
            }
            case 115131: {
                if (!string.equals("try")) break;
                n4 = 27;
                break;
            }
            case 108960: {
                if (!string.equals("new")) break;
                n4 = 26;
                break;
            }
            case 107035: {
                if (!string.equals("let")) break;
                n4 = 25;
                break;
            }
            case 104431: {
                if (!string.equals("int")) break;
                n4 = 24;
                break;
            }
            case 101577: {
                if (!string.equals("for")) break;
                n4 = 23;
                break;
            }
            case 3365: {
                if (!string.equals("in")) break;
                n4 = 22;
                break;
            }
            case 3357: {
                if (!string.equals("if")) break;
                n4 = 21;
                break;
            }
            case 3211: {
                if (!string.equals("do")) break;
                n4 = 20;
                break;
            }
            case -314497661: {
                if (!string.equals("private")) break;
                n4 = 19;
                break;
            }
            case -567202649: {
                if (!string.equals("continue")) break;
                n4 = 18;
                break;
            }
            case -608539730: {
                if (!string.equals("protected")) break;
                n4 = 17;
                break;
            }
            case -807062458: {
                if (!string.equals("package")) break;
                n4 = 16;
                break;
            }
            case -853259901: {
                if (!string.equals("finally")) break;
                n4 = 15;
                break;
            }
            case -858802543: {
                if (!string.equals("typeof")) break;
                n4 = 14;
                break;
            }
            case -874432947: {
                if (!string.equals("throws")) break;
                n4 = 13;
                break;
            }
            case -889473228: {
                if (!string.equals("switch")) break;
                n4 = 12;
                break;
            }
            case -892481938: {
                if (!string.equals("static")) break;
                n4 = 11;
                break;
            }
            case -915384400: {
                if (!string.equals("implements")) break;
                n4 = 10;
                break;
            }
            case -934396624: {
                if (!string.equals("return")) break;
                n4 = 9;
                break;
            }
            case -977423767: {
                if (!string.equals("public")) break;
                n4 = 8;
                break;
            }
            case -1052618729: {
                if (!string.equals("native")) break;
                n4 = 7;
                break;
            }
            case -1184795739: {
                if (!string.equals("import")) break;
                n4 = 6;
                break;
            }
            case -1289153612: {
                if (!string.equals("export")) break;
                n4 = 5;
                break;
            }
            case -1305664359: {
                if (!string.equals("extends")) break;
                n4 = 4;
                break;
            }
            case -1325958191: {
                if (!string.equals("double")) break;
                n4 = 3;
                break;
            }
            case -1335458389: {
                if (!string.equals("delete")) break;
                n4 = 2;
                break;
            }
            case -1466596076: {
                if (!string.equals("synchronized")) break;
                n4 = 1;
                break;
            }
            case -1888027236: {
                if (!string.equals("volatile")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 120;
                break;
            }
            case 58: {
                n3 = 113;
                break;
            }
            case 55: {
                n3 = 164;
                break;
            }
            case 53: {
                n3 = 73;
                break;
            }
            case 52: {
                n3 = 121;
                break;
            }
            case 51: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 45: {
                n3 = 158;
                break;
            }
            case 43: {
                n3 = 128;
                break;
            }
            case 42: {
                n3 = 124;
                break;
            }
            case 40: {
                n3 = 127;
                break;
            }
            case 39: {
                n3 = 130;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 117;
                break;
            }
            case 30: {
                n3 = 119;
                break;
            }
            case 28: {
                n3 = 126;
                break;
            }
            case 27: {
                n3 = 84;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 25: {
                n3 = 157;
                break;
            }
            case 23: {
                n3 = 123;
                break;
            }
            case 22: {
                n3 = 52;
                break;
            }
            case 21: {
                n3 = 116;
                break;
            }
            case 20: {
                n3 = 122;
                break;
            }
            case 18: {
                n3 = 125;
                break;
            }
            case 15: {
                n3 = 129;
                break;
            }
            case 14: {
                n3 = 32;
                break;
            }
            case 12: {
                n3 = 118;
                break;
            }
            case 9: {
                n3 = 4;
                break;
            }
            case 0: 
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 16: 
            case 17: 
            case 19: 
            case 24: 
            case 29: 
            case 31: 
            case 33: 
            case 34: 
            case 35: 
            case 41: 
            case 44: 
            case 47: 
            case 48: 
            case 49: 
            case 50: 
            case 54: 
            case 57: 
            case 60: {
                n3 = 131;
                break;
            }
            case 2: {
                n3 = 31;
            }
            case 56: 
        }
        if (n3 == 0) {
            return 0;
        }
        return n3 & 0xFF;
    }

    private final String substring(int n2, int n3) {
        String string = this.sourceString;
        if (string != null) {
            return string.substring(n2, n3);
        }
        return new String(this.sourceBuffer, n2, n3 - n2);
    }

    private void ungetChar(int n2) {
        int n3 = this.ungetCursor;
        if (n3 != 0 && this.ungetBuffer[n3 - 1] == 10) {
            Kit.codeBug();
        }
        int[] nArray = this.ungetBuffer;
        n3 = this.ungetCursor;
        this.ungetCursor = n3 + 1;
        nArray[n3] = n2;
        --this.cursor;
    }

    private void ungetCharIgnoreLineEnd(int n2) {
        int[] nArray = this.ungetBuffer;
        int n3 = this.ungetCursor;
        this.ungetCursor = n3 + 1;
        nArray[n3] = n2;
        --this.cursor;
    }

    private void ungetTemplateLiteralChar(int n2) {
        this.ungetCharIgnoreLineEnd(n2);
        StringBuilder stringBuilder = this.rawString;
        stringBuilder.setLength(stringBuilder.length() - 1);
    }

    final boolean eof() {
        return this.hitEOF;
    }

    final String getAndResetCurrentComment() {
        if (this.sourceString != null) {
            if (this.isMarkingComment()) {
                Kit.codeBug();
            }
            return this.sourceString.substring(this.tokenBeg, this.tokenEnd);
        }
        if (!this.isMarkingComment()) {
            Kit.codeBug();
        }
        StringBuilder stringBuilder = new StringBuilder(this.commentPrefix);
        stringBuilder.append(this.sourceBuffer, this.commentCursor, this.getTokenLength() - this.commentPrefix.length());
        this.commentCursor = -1;
        return stringBuilder.toString();
    }

    final BigInteger getBigInt() {
        return this.bigInt;
    }

    public Token$CommentType getCommentType() {
        return this.commentType;
    }

    public int getCursor() {
        return this.cursor;
    }

    int getFirstXMLToken() {
        this.xmlOpenTagsCount = 0;
        this.xmlIsAttribute = false;
        this.xmlIsTagContent = false;
        if (!this.canUngetChar()) {
            return -1;
        }
        this.ungetChar(60);
        return this.getNextXMLToken();
    }

    final String getLine() {
        int n2 = this.sourceCursor;
        int n3 = this.lineEndChar;
        if (n3 >= 0) {
            int n4;
            n2 = n4 = n2 - 1;
            if (n3 == 10) {
                n2 = n4;
                if (this.charAt(n4 - 1) == 13) {
                    n2 = n4 - 1;
                }
            }
        } else {
            int n5;
            n2 -= this.lineStart;
            while ((n5 = this.charAt(this.lineStart + n2)) != -1 && !ScriptRuntime.isJSLineTerminator(n5)) {
                ++n2;
            }
            n2 += this.lineStart;
        }
        return this.substring(this.lineStart, n2);
    }

    final String getLine(int n2, int[] nArray) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        block8: {
            n7 = this.cursor + this.ungetCursor - n2;
            if (n7 > (n2 = this.sourceCursor)) {
                return null;
            }
            n6 = 0;
            n5 = 0;
            while (n7 > 0) {
                int n8 = this.charAt(n2 - 1);
                int n9 = n7;
                n4 = n6;
                n3 = n5;
                int n10 = n2;
                if (ScriptRuntime.isJSLineTerminator(n8)) {
                    n5 = n7;
                    n3 = n2;
                    if (n8 == 10) {
                        n5 = n7;
                        n3 = n2;
                        if (this.charAt(n2 - 2) == 13) {
                            n5 = n7 - 1;
                            n3 = n2 - 1;
                        }
                    }
                    n4 = n6 + 1;
                    n2 = n3 - 1;
                    n10 = n3;
                    n3 = n2;
                    n9 = n5;
                }
                n7 = n9 - 1;
                n2 = n10 - 1;
                n6 = n4;
                n5 = n3;
            }
            n7 = 0;
            while (n2 > 0) {
                if (!ScriptRuntime.isJSLineTerminator(this.charAt(n2 - 1))) {
                    --n2;
                    ++n7;
                    continue;
                }
                break block8;
            }
            n2 = 0;
        }
        n4 = this.lineno;
        n3 = this.lineEndChar >= 0 ? 1 : 0;
        nArray[0] = n4 - n6 + n3;
        nArray[1] = n7;
        if (n6 == 0) {
            return this.getLine();
        }
        return this.substring(n2, n5);
    }

    final int getLineno() {
        return this.lineno;
    }

    /*
     * Enabled aggressive block sorting
     */
    int getNextXMLToken() {
        block24: {
            int n2;
            this.tokenBeg = this.cursor;
            this.stringBufferTop = 0;
            while ((n2 = this.getChar()) != -1) {
                block30: {
                    block31: {
                        block29: {
                            block25: {
                                block22: {
                                    block26: {
                                        block27: {
                                            block28: {
                                                if (!this.xmlIsTagContent) break block25;
                                                if (n2 == 9 || n2 == 10 || n2 == 13 || n2 == 32) break block26;
                                                if (n2 == 34 || n2 == 39) break block27;
                                                if (n2 == 47) break block28;
                                                if (n2 == 123) break block29;
                                                this.addToString(n2);
                                                if (n2 != 61) {
                                                    if (n2 == 62) {
                                                        this.xmlIsTagContent = false;
                                                    }
                                                    this.xmlIsAttribute = false;
                                                    break block22;
                                                } else {
                                                    this.xmlIsAttribute = true;
                                                }
                                                break block22;
                                            }
                                            this.addToString(n2);
                                            if (this.peekChar() == 62) {
                                                this.addToString(this.getChar());
                                                this.xmlIsTagContent = false;
                                                --this.xmlOpenTagsCount;
                                            }
                                            break block22;
                                        }
                                        this.addToString(n2);
                                        if (!this.readQuotedString(n2)) {
                                            return -1;
                                        }
                                        break block22;
                                    }
                                    this.addToString(n2);
                                }
                                if (this.xmlIsTagContent || this.xmlOpenTagsCount != 0) continue;
                                this.string = this.getStringFromBuffer();
                                return 152;
                            }
                            if (n2 == 60) break block30;
                            if (n2 != 123) break block31;
                        }
                        this.ungetChar(n2);
                        this.string = this.getStringFromBuffer();
                        return 149;
                    }
                    this.addToString(n2);
                    continue;
                }
                this.addToString(n2);
                n2 = this.peekChar();
                if (n2 != 33) {
                    block23: {
                        if (n2 != 47) {
                            if (n2 != 63) {
                                this.xmlIsTagContent = true;
                                n2 = this.xmlOpenTagsCount + 1;
                                break block23;
                            } else {
                                this.addToString(this.getChar());
                                if (this.readPI()) continue;
                                return -1;
                            }
                        }
                        this.addToString(this.getChar());
                        n2 = this.xmlOpenTagsCount;
                        if (n2 == 0) break block24;
                        this.xmlIsTagContent = true;
                    }
                    this.xmlOpenTagsCount = --n2;
                    continue;
                }
                this.addToString(this.getChar());
                n2 = this.peekChar();
                if (n2 != 45) {
                    if (n2 != 91) {
                        if (this.readEntity()) continue;
                        return -1;
                    }
                    this.addToString(this.getChar());
                    if (this.getChar() == 67 && this.getChar() == 68 && this.getChar() == 65 && this.getChar() == 84 && this.getChar() == 65 && this.getChar() == 91) {
                        this.addToString(67);
                        this.addToString(68);
                        this.addToString(65);
                        this.addToString(84);
                        this.addToString(65);
                        this.addToString(91);
                        if (this.readCDATA()) continue;
                        return -1;
                    }
                    break block24;
                } else {
                    this.addToString(this.getChar());
                    n2 = this.getChar();
                    if (n2 == 45) {
                        this.addToString(n2);
                        if (this.readXmlComment()) continue;
                        return -1;
                    }
                }
                break block24;
            }
            this.tokenEnd = this.cursor;
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return -1;
    }

    final double getNumber() {
        return this.number;
    }

    final int getOffset() {
        int n2;
        int n3 = n2 = this.sourceCursor - this.lineStart;
        if (this.lineEndChar >= 0) {
            n3 = n2 - 1;
        }
        return n3;
    }

    final char getQuoteChar() {
        return (char)this.quoteChar;
    }

    String getRawString() {
        if (this.rawString.length() == 0) {
            return "";
        }
        return this.rawString.toString();
    }

    final String getSourceString() {
        return this.sourceString;
    }

    final String getString() {
        return this.string;
    }

    /*
     * Unable to fully structure code
     */
    final int getToken() {
        block186: {
            block154: {
                block189: {
                    block188: {
                        block187: {
                            block185: {
                                block153: {
                                    block152: {
                                        block182: {
                                            block183: {
                                                block184: {
                                                    block166: {
                                                        block167: {
                                                            block168: {
                                                                block169: {
                                                                    block170: {
                                                                        block171: {
                                                                            block172: {
                                                                                block173: {
                                                                                    block174: {
                                                                                        block157: {
                                                                                            block163: {
                                                                                                block165: {
                                                                                                    block164: {
                                                                                                        block162: {
                                                                                                            block151: {
                                                                                                                block155: {
                                                                                                                    block156: {
                                                                                                                        do {
                                                                                                                            if ((var6_1 = this.getChar()) == -1) {
                                                                                                                                var3_4 = this.cursor;
                                                                                                                                this.tokenBeg = var3_4 - 1;
                                                                                                                                this.tokenEnd = var3_4;
                                                                                                                                return 0;
                                                                                                                            }
                                                                                                                            var8_2 = 1;
                                                                                                                            var9_3 = 1;
                                                                                                                            if (var6_1 != 10) continue;
                                                                                                                            this.dirtyLine = false;
                                                                                                                            var3_5 = this.cursor;
                                                                                                                            this.tokenBeg = var3_5 - 1;
                                                                                                                            this.tokenEnd = var3_5;
                                                                                                                            return 1;
                                                                                                                        } while (TokenStream.isJSSpace(var6_1));
                                                                                                                        if (var6_1 != 45) {
                                                                                                                            this.dirtyLine = true;
                                                                                                                        }
                                                                                                                        var3_6 = this.cursor;
                                                                                                                        this.tokenBeg = var3_6 - 1;
                                                                                                                        this.tokenEnd = var3_6;
                                                                                                                        if (var6_1 == 64) {
                                                                                                                            return 151;
                                                                                                                        }
                                                                                                                        if (var6_1 != 92) break block155;
                                                                                                                        var4_7 = this.getChar();
                                                                                                                        if (var4_7 != 117) break block156;
                                                                                                                        this.stringBufferTop = 0;
                                                                                                                        var5_8 = 1;
                                                                                                                        var3_6 = 1;
                                                                                                                        break block151;
                                                                                                                    }
                                                                                                                    this.ungetChar(var4_7);
                                                                                                                    var4_7 = 92;
                                                                                                                    var3_6 = 0;
lbl34:
                                                                                                                    // 3 sources

                                                                                                                    while (true) {
                                                                                                                        var6_1 = 0;
                                                                                                                        var5_8 = var3_6;
                                                                                                                        var3_6 = var6_1;
                                                                                                                        break block151;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var5_8 = !Character.isUnicodeIdentifierStart(var6_1) && var6_1 != 36 && var6_1 != 95 ? 0 : 1;
                                                                                                                var4_7 = var6_1;
                                                                                                                var3_6 = var5_8;
                                                                                                                if (var5_8 == 0) ** GOTO lbl34
                                                                                                                this.stringBufferTop = 0;
                                                                                                                this.addToString(var6_1);
                                                                                                                var4_7 = var6_1;
                                                                                                                var3_6 = var5_8;
                                                                                                                ** while (true)
                                                                                                            }
                                                                                                            if (var5_8 == 0) break block157;
                                                                                                            var5_8 = var3_6;
                                                                                                            while (true) {
                                                                                                                block158: {
                                                                                                                    block161: {
                                                                                                                        block159: {
                                                                                                                            block160: {
                                                                                                                                if (var3_6 == 0) break block158;
                                                                                                                                if (!this.matchTemplateLiteralChar(123)) break block159;
                                                                                                                                var3_6 = 0;
                                                                                                                                do {
                                                                                                                                    if ((var6_1 = this.getTemplateLiteralChar()) == 125) {
                                                                                                                                        var4_7 = var3_6;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    var3_6 = var4_7 = Kit.xDigitToInt(var6_1, var3_6);
                                                                                                                                } while (var4_7 >= 0);
                                                                                                                                if (var4_7 < 0) break block160;
                                                                                                                                var3_6 = var4_7;
                                                                                                                                if (var4_7 <= 0x10FFFF) break block161;
                                                                                                                            }
                                                                                                                            this.parser.reportError("msg.invalid.escape");
                                                                                                                            var4_7 = var6_1;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        var4_7 = 0;
                                                                                                                        var6_1 = 0;
                                                                                                                        while (true) {
                                                                                                                            var3_6 = var4_7;
                                                                                                                            if (var6_1 == 4) break;
                                                                                                                            var3_6 = Kit.xDigitToInt(this.getChar(), var4_7);
                                                                                                                            if (var3_6 < 0) {
                                                                                                                                this.parser.reportError("msg.invalid.escape");
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            ++var6_1;
                                                                                                                            var4_7 = var3_6;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (var3_6 < 0) {
                                                                                                                        this.parser.addError("msg.invalid.escape");
                                                                                                                        return -1;
                                                                                                                    }
                                                                                                                    this.addToString(var3_6);
                                                                                                                    var3_6 = 0;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                var6_1 = this.getChar();
                                                                                                                if (var6_1 == 92) {
                                                                                                                    var3_6 = this.getChar();
                                                                                                                    if (var3_6 == 117) {
                                                                                                                        var5_8 = 1;
                                                                                                                        var3_6 = 1;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    this.parser.addError("msg.illegal.character", var3_6);
                                                                                                                    return -1;
                                                                                                                }
                                                                                                                var4_7 = var6_1;
                                                                                                                if (var6_1 == -1) break;
                                                                                                                var4_7 = var6_1;
                                                                                                                if (var6_1 == 65279) break;
                                                                                                                if (!Character.isUnicodeIdentifierPart(var6_1) && var6_1 != 36) {
                                                                                                                    var4_7 = var6_1;
                                                                                                                    break;
                                                                                                                }
                                                                                                                this.addToString(var6_1);
                                                                                                            }
                                                                                                            this.ungetChar(var4_7);
                                                                                                            var12_9 = this.getStringFromBuffer();
                                                                                                            if (var5_8 == 0 || this.parser.compilerEnv.getLanguageVersion() >= 200) break block162;
                                                                                                            var11_11 = var12_9;
                                                                                                            if (TokenStream.isKeyword(var12_9, this.parser.compilerEnv.getLanguageVersion(), this.parser.inUseStrictDirective())) {
                                                                                                                var11_11 = TokenStream.convertLastCharToHex(var12_9);
                                                                                                            }
                                                                                                            break block163;
                                                                                                        }
                                                                                                        var4_7 = TokenStream.stringToKeyword(var12_9, this.parser.compilerEnv.getLanguageVersion(), this.parser.inUseStrictDirective());
                                                                                                        var11_11 = var12_9;
                                                                                                        if (var4_7 == 0) break block163;
                                                                                                        if (var4_7 == 157) break block164;
                                                                                                        var3_6 = var4_7;
                                                                                                        if (var4_7 != 73) break block165;
                                                                                                    }
                                                                                                    var3_6 = var4_7;
                                                                                                    if (this.parser.compilerEnv.getLanguageVersion() < 170) {
                                                                                                        var11_11 = var4_7 == 157 ? "let" : "yield";
                                                                                                        this.string = var11_11;
                                                                                                        var3_6 = 39;
                                                                                                    }
                                                                                                }
                                                                                                this.string = (String)this.allStrings.intern(var12_9);
                                                                                                if (var3_6 != 131) {
                                                                                                    return var3_6;
                                                                                                }
                                                                                                if (this.parser.compilerEnv.getLanguageVersion() >= 200) {
                                                                                                    return var3_6;
                                                                                                }
                                                                                                var11_11 = var12_9;
                                                                                                if (!this.parser.compilerEnv.isReservedKeywordAsIdentifier()) {
                                                                                                    return var3_6;
                                                                                                }
                                                                                            }
                                                                                            if (var5_8 != 0 && this.parser.compilerEnv.getLanguageVersion() >= 200 && !TokenStream.isValidIdentifierName(var11_11)) {
                                                                                                this.parser.reportError("msg.invalid.escape");
                                                                                                return -1;
                                                                                            }
                                                                                            this.string = (String)this.allStrings.intern(var11_11);
                                                                                            return 39;
                                                                                        }
                                                                                        if (TokenStream.isDigit(var4_7) || var4_7 == 46 && TokenStream.isDigit(this.peekChar())) break block166;
                                                                                        if (var4_7 == 34 || var4_7 == 39) break block167;
                                                                                        if (var4_7 == 35 && this.cursor == 1 && this.peekChar() == 33 && !this.parser.calledByCompileFunction) {
                                                                                            this.skipLine();
                                                                                            return 165;
                                                                                        }
                                                                                        if (var4_7 == 33) break block168;
                                                                                        if (var4_7 == 91) break block169;
                                                                                        if (var4_7 == 96) break block170;
                                                                                        if (var4_7 == 37) break block171;
                                                                                        if (var4_7 == 38) break block172;
                                                                                        if (var4_7 == 93) break block173;
                                                                                        if (var4_7 == 94) break block174;
                                                                                        switch (var4_7) {
                                                                                            default: {
                                                                                                switch (var4_7) {
                                                                                                    default: {
                                                                                                        switch (var4_7) {
                                                                                                            default: {
                                                                                                                this.parser.addError("msg.illegal.character", var4_7);
                                                                                                                return -1;
                                                                                                            }
                                                                                                            case 126: {
                                                                                                                return 27;
                                                                                                            }
                                                                                                            case 125: {
                                                                                                                return 89;
                                                                                                            }
                                                                                                            case 124: {
                                                                                                                if (this.matchChar(124)) {
                                                                                                                    return 108;
                                                                                                                }
                                                                                                                if (this.matchChar(61)) {
                                                                                                                    return 94;
                                                                                                                }
                                                                                                                return 9;
                                                                                                            }
                                                                                                            case 123: 
                                                                                                        }
                                                                                                        return 88;
                                                                                                    }
                                                                                                    case 63: {
                                                                                                        return 106;
                                                                                                    }
                                                                                                    case 62: {
                                                                                                        if (this.matchChar(62)) {
                                                                                                            if (this.matchChar(62)) {
                                                                                                                if (this.matchChar(61)) {
                                                                                                                    return 99;
                                                                                                                }
                                                                                                                return 20;
                                                                                                            }
                                                                                                            if (this.matchChar(61)) {
                                                                                                                return 98;
                                                                                                            }
                                                                                                            return 19;
                                                                                                        }
                                                                                                        if (this.matchChar(61)) {
                                                                                                            return 17;
                                                                                                        }
                                                                                                        return 16;
                                                                                                    }
                                                                                                    case 61: {
                                                                                                        if (this.matchChar(61)) {
                                                                                                            if (this.matchChar(61)) {
                                                                                                                return 46;
                                                                                                            }
                                                                                                            return 12;
                                                                                                        }
                                                                                                        if (this.matchChar(62)) {
                                                                                                            return 168;
                                                                                                        }
                                                                                                        return 93;
                                                                                                    }
                                                                                                    case 60: {
                                                                                                        if (this.matchChar(33)) {
                                                                                                            if (this.matchChar(45)) {
                                                                                                                if (this.matchChar(45)) {
                                                                                                                    this.tokenBeg = this.cursor - 4;
                                                                                                                    this.skipLine();
                                                                                                                    this.commentType = Token$CommentType.HTML;
                                                                                                                    return 165;
                                                                                                                }
                                                                                                                this.ungetCharIgnoreLineEnd(45);
                                                                                                            }
                                                                                                            this.ungetCharIgnoreLineEnd(33);
                                                                                                        }
                                                                                                        if (this.matchChar(60)) {
                                                                                                            if (this.matchChar(61)) {
                                                                                                                return 97;
                                                                                                            }
                                                                                                            return 18;
                                                                                                        }
                                                                                                        if (this.matchChar(61)) {
                                                                                                            return 15;
                                                                                                        }
                                                                                                        return 14;
                                                                                                    }
                                                                                                    case 59: {
                                                                                                        return 85;
                                                                                                    }
                                                                                                    case 58: 
                                                                                                }
                                                                                                if (this.matchChar(58)) {
                                                                                                    return 148;
                                                                                                }
                                                                                                return 107;
                                                                                            }
                                                                                            case 47: {
                                                                                                this.markCommentStart();
                                                                                                if (this.matchChar(47)) {
                                                                                                    this.tokenBeg = this.cursor - 2;
                                                                                                    this.skipLine();
                                                                                                    this.commentType = Token$CommentType.LINE;
                                                                                                    return 165;
                                                                                                }
                                                                                                if (!this.matchChar(42)) ** GOTO lbl251
                                                                                                this.tokenBeg = this.cursor - 2;
                                                                                                if (!this.matchChar(42)) ** GOTO lbl236
                                                                                                this.commentType = Token$CommentType.JSDOC;
                                                                                                while (true) {
                                                                                                    var3_6 = 1;
                                                                                                    ** GOTO lbl239
                                                                                                    break;
                                                                                                }
lbl236:
                                                                                                // 1 sources

                                                                                                this.commentType = Token$CommentType.BLOCK_COMMENT;
                                                                                                while (true) {
                                                                                                    var3_6 = 0;
lbl239:
                                                                                                    // 2 sources

                                                                                                    do {
                                                                                                        if ((var4_7 = this.getChar()) == -1) {
                                                                                                            this.tokenEnd = this.cursor - 1;
                                                                                                            this.parser.addError("msg.unterminated.comment");
                                                                                                            return 165;
                                                                                                        }
                                                                                                        if (var4_7 == 42) ** continue;
                                                                                                        if (var4_7 != 47) ** GOTO lbl249
                                                                                                    } while (var3_6 == 0);
                                                                                                    this.tokenEnd = this.cursor;
                                                                                                    return 165;
lbl249:
                                                                                                    // 1 sources

                                                                                                    this.tokenEnd = this.cursor;
                                                                                                }
lbl251:
                                                                                                // 1 sources

                                                                                                if (this.matchChar(61)) {
                                                                                                    return 103;
                                                                                                }
                                                                                                return 24;
                                                                                            }
                                                                                            case 46: {
                                                                                                if (this.matchChar(46)) {
                                                                                                    if (this.parser.compilerEnv.getLanguageVersion() >= 180 && this.matchChar(46)) {
                                                                                                        return 174;
                                                                                                    }
                                                                                                    return 147;
                                                                                                }
                                                                                                if (this.matchChar(40)) {
                                                                                                    return 150;
                                                                                                }
                                                                                                return 112;
                                                                                            }
                                                                                            case 45: {
                                                                                                if (this.matchChar(61)) {
                                                                                                    var3_6 = 101;
                                                                                                } else if (this.matchChar(45)) {
                                                                                                    if (!this.dirtyLine && this.matchChar(62)) {
                                                                                                        this.markCommentStart("--");
                                                                                                        this.skipLine();
                                                                                                        this.commentType = Token$CommentType.HTML;
                                                                                                        return 165;
                                                                                                    }
                                                                                                    var3_6 = 111;
                                                                                                } else {
                                                                                                    var3_6 = 22;
                                                                                                }
                                                                                                this.dirtyLine = true;
                                                                                                return var3_6;
                                                                                            }
                                                                                            case 44: {
                                                                                                return 92;
                                                                                            }
                                                                                            case 43: {
                                                                                                if (this.matchChar(61)) {
                                                                                                    return 100;
                                                                                                }
                                                                                                if (this.matchChar(43)) {
                                                                                                    return 110;
                                                                                                }
                                                                                                return 21;
                                                                                            }
                                                                                            case 42: {
                                                                                                if (this.parser.compilerEnv.getLanguageVersion() >= 200 && this.matchChar(42)) {
                                                                                                    if (this.matchChar(61)) {
                                                                                                        return 105;
                                                                                                    }
                                                                                                    return 75;
                                                                                                }
                                                                                                if (this.matchChar(61)) {
                                                                                                    return 102;
                                                                                                }
                                                                                                return 23;
                                                                                            }
                                                                                            case 41: {
                                                                                                return 91;
                                                                                            }
                                                                                            case 40: 
                                                                                        }
                                                                                        return 90;
                                                                                    }
                                                                                    if (this.matchChar(61)) {
                                                                                        return 95;
                                                                                    }
                                                                                    return 10;
                                                                                }
                                                                                return 87;
                                                                            }
                                                                            if (this.matchChar(38)) {
                                                                                return 109;
                                                                            }
                                                                            if (this.matchChar(61)) {
                                                                                return 96;
                                                                            }
                                                                            return 11;
                                                                        }
                                                                        if (this.matchChar(61)) {
                                                                            return 104;
                                                                        }
                                                                        return 25;
                                                                    }
                                                                    return 170;
                                                                }
                                                                return 86;
                                                            }
                                                            if (this.matchChar(61)) {
                                                                if (this.matchChar(61)) {
                                                                    return 47;
                                                                }
                                                                return 13;
                                                            }
                                                            return 26;
                                                        }
                                                        this.quoteChar = var4_7;
                                                        this.stringBufferTop = 0;
                                                        var3_6 = this.getCharIgnoreLineEnd(false);
                                                        block39: while (var3_6 != this.quoteChar) {
                                                            block175: {
                                                                block176: {
                                                                    block177: {
                                                                        block178: {
                                                                            block179: {
                                                                                block180: {
                                                                                    block181: {
                                                                                        if (var3_6 == -1) {
                                                                                            while (true) {
                                                                                                var5_8 = 1;
                                                                                                var4_7 = var3_6;
                                                                                                var3_6 = var5_8;
                                                                                                break;
                                                                                            }
                                                                                        } else {
                                                                                            var4_7 = var3_6;
                                                                                            if (var3_6 == 10) {
                                                                                                if ((var4_7 = this.lineEndChar) == 10 || var4_7 == 13) ** continue;
                                                                                                if (var4_7 != 8232 && var4_7 != 8233) {
                                                                                                    var4_7 = var3_6;
                                                                                                }
                                                                                            }
                                                                                            var3_6 = 0;
                                                                                        }
                                                                                        if (var3_6 != 0) {
                                                                                            this.ungetCharIgnoreLineEnd(var4_7);
                                                                                            this.tokenEnd = this.cursor;
                                                                                            this.parser.addError("msg.unterminated.string.lit");
                                                                                            return -1;
                                                                                        }
                                                                                        var3_6 = var4_7;
                                                                                        if (var4_7 != 92) break block175;
                                                                                        var4_7 = this.getChar();
                                                                                        if (var4_7 == 10) break block176;
                                                                                        if (var4_7 == 98) break block177;
                                                                                        if (var4_7 == 102) break block178;
                                                                                        if (var4_7 == 110) break block179;
                                                                                        if (var4_7 == 114) break block180;
                                                                                        if (var4_7 == 120) break block181;
                                                                                        switch (var4_7) {
                                                                                            default: {
                                                                                                var3_6 = var4_7;
                                                                                                if (48 > var4_7) break block175;
                                                                                                var3_6 = var4_7;
                                                                                                if (var4_7 < 56) {
                                                                                                    var6_1 = var4_7 - 48;
                                                                                                    var5_8 = this.getChar();
                                                                                                    var3_6 = var6_1;
                                                                                                    var4_7 = var5_8;
                                                                                                    if (48 <= var5_8) {
                                                                                                        var3_6 = var6_1;
                                                                                                        var4_7 = var5_8;
                                                                                                        if (var5_8 < 56) {
                                                                                                            var6_1 = var6_1 * 8 + var5_8 - 48;
                                                                                                            var5_8 = this.getChar();
                                                                                                            var3_6 = var6_1;
                                                                                                            var4_7 = var5_8;
                                                                                                            if (48 <= var5_8) {
                                                                                                                var3_6 = var6_1;
                                                                                                                var4_7 = var5_8;
                                                                                                                if (var5_8 < 56) {
                                                                                                                    var3_6 = var6_1;
                                                                                                                    var4_7 = var5_8;
                                                                                                                    if (var6_1 <= 31) {
                                                                                                                        var3_6 = var6_1 * 8 + var5_8 - 48;
                                                                                                                        var4_7 = this.getChar();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    this.ungetChar(var4_7);
                                                                                                    break;
                                                                                                }
                                                                                                break block175;
                                                                                            }
                                                                                            case 118: {
                                                                                                var3_6 = 11;
                                                                                                break;
                                                                                            }
                                                                                            case 117: {
                                                                                                var6_1 = this.stringBufferTop;
                                                                                                this.addToString(117);
                                                                                                if (!this.matchChar(123)) ** GOTO lbl406
                                                                                                var4_7 = 0;
                                                                                                while (true) {
                                                                                                    if ((var5_8 = this.getChar()) != 125) ** GOTO lbl396
                                                                                                    this.addToString(var5_8);
                                                                                                    ** GOTO lbl397
lbl396:
                                                                                                    // 1 sources

                                                                                                    if ((var4_7 = Kit.xDigitToInt(var5_8, var4_7)) >= 0) ** GOTO lbl404
lbl397:
                                                                                                    // 2 sources

                                                                                                    if (var4_7 < 0) ** GOTO lbl400
                                                                                                    var3_6 = var4_7;
                                                                                                    if (var4_7 <= 0x10FFFF) ** GOTO lbl417
lbl400:
                                                                                                    // 2 sources

                                                                                                    this.parser.reportError("msg.invalid.escape");
                                                                                                    var3_6 = var5_8;
                                                                                                    continue block39;
lbl404:
                                                                                                    // 1 sources

                                                                                                    this.addToString(var5_8);
                                                                                                }
lbl406:
                                                                                                // 1 sources

                                                                                                var3_6 = 0;
                                                                                                for (var4_7 = 0; var4_7 != 4; ++var4_7) {
                                                                                                    var5_8 = this.getChar();
                                                                                                    var3_6 = Kit.xDigitToInt(var5_8, var3_6);
                                                                                                    if (var3_6 < 0) {
                                                                                                        if (this.parser.compilerEnv.getLanguageVersion() >= 200) {
                                                                                                            this.parser.reportError("msg.invalid.escape");
                                                                                                        }
                                                                                                        var3_6 = var5_8;
                                                                                                        continue block39;
                                                                                                    }
                                                                                                    this.addToString(var5_8);
                                                                                                }
lbl417:
                                                                                                // 2 sources

                                                                                                this.stringBufferTop = var6_1;
                                                                                                break block175;
                                                                                            }
                                                                                            case 116: {
                                                                                                var3_6 = 9;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break block175;
                                                                                    }
                                                                                    var5_8 = this.getChar();
                                                                                    var3_6 = Kit.xDigitToInt(var5_8, 0);
                                                                                    if (var3_6 < 0) {
                                                                                        this.addToString(120);
                                                                                        var3_6 = var5_8;
                                                                                        continue;
                                                                                    }
                                                                                    var4_7 = this.getChar();
                                                                                    var3_6 = var6_1 = Kit.xDigitToInt(var4_7, var3_6);
                                                                                    if (var6_1 < 0) {
                                                                                        this.addToString(120);
                                                                                        this.addToString(var5_8);
                                                                                        var3_6 = var4_7;
                                                                                        continue;
                                                                                    }
                                                                                    break block175;
                                                                                }
                                                                                var3_6 = 13;
                                                                                break block175;
                                                                            }
                                                                            var3_6 = 10;
                                                                            break block175;
                                                                        }
                                                                        var3_6 = 12;
                                                                        break block175;
                                                                    }
                                                                    var3_6 = 8;
                                                                    break block175;
                                                                }
                                                                var3_6 = this.getChar();
                                                                continue;
                                                            }
                                                            this.addToString(var3_6);
                                                            var3_6 = this.getChar(false);
                                                        }
                                                        var11_12 = this.getStringFromBuffer();
                                                        this.string = (String)this.allStrings.intern(var11_12);
                                                        return 41;
                                                    }
                                                    this.stringBufferTop = 0;
                                                    this.isBinary = false;
                                                    this.isOctal = false;
                                                    this.isOldOctal = false;
                                                    this.isHex = false;
                                                    var7_15 = this.parser.compilerEnv.getLanguageVersion() >= 200 ? 1 : 0;
                                                    var3_6 = var4_7;
                                                    if (var4_7 != 48) break block182;
                                                    var3_6 = this.getChar();
                                                    if (var3_6 == 120 || var3_6 == 88) break block183;
                                                    if (var7_15 != 0 && (var3_6 == 111 || var3_6 == 79)) {
                                                        this.isOctal = true;
                                                        var3_6 = this.getChar();
lbl474:
                                                        // 2 sources

                                                        while (true) {
                                                            var4_7 = var3_6;
                                                            var3_6 = 8;
                                                            break block152;
                                                            break;
                                                        }
                                                    }
                                                    if (var7_15 == 0 || var3_6 != 98 && var3_6 != 66) break block184;
                                                    this.isBinary = true;
                                                    var4_7 = this.getChar();
                                                    var3_6 = 2;
                                                    break block152;
                                                }
                                                if (TokenStream.isDigit(var3_6)) {
                                                    this.isOldOctal = true;
                                                    ** continue;
                                                }
                                                this.addToString(48);
                                                break block182;
                                            }
                                            var3_6 = 16;
                                            this.isHex = true;
                                            var4_7 = this.getChar();
                                            break block152;
                                        }
                                        var5_8 = 10;
                                        var4_7 = var3_6;
                                        var3_6 = var5_8;
                                    }
                                    var10_16 = this.stringBufferTop;
                                    if (var3_6 != 10 && var3_6 != 16 && (var3_6 != 8 || this.isOldOctal)) {
                                        var5_8 = var4_7;
                                        if (var3_6 != 2) {
                                            while (true) {
                                                var6_1 = var3_6;
                                                var4_7 = var5_8;
                                                if (!TokenStream.isDigit(var5_8)) break block153;
                                                if (var5_8 >= 56) {
                                                    var12_10 = this.parser;
                                                    var11_13 = var5_8 == 56 ? "8" : "9";
                                                    var12_10.addWarning("msg.bad.octal.literal", (String)var11_13);
                                                    var4_7 = this.readDigits(10, var5_8);
                                                    if (var4_7 == -2) {
                                                        this.parser.addError("msg.caught.nfe");
                                                        return -1;
                                                    }
                                                    var6_1 = 10;
                                                    break block153;
                                                }
                                                this.addToString(var5_8);
                                                var5_8 = this.getChar();
                                            }
                                        }
                                    }
                                    var5_8 = this.readDigits(var3_6, var4_7);
                                    var6_1 = var3_6;
                                    var4_7 = var5_8;
                                    if (var5_8 == -2) {
                                        this.parser.addError("msg.caught.nfe");
                                        return -1;
                                    }
                                }
                                if (this.stringBufferTop == var10_16 && (this.isBinary || this.isOctal || this.isHex)) {
                                    this.parser.addError("msg.caught.nfe");
                                    return -1;
                                }
                                if (var7_15 == 0 || var4_7 != 110) break block185;
                                var5_8 = this.getChar();
                                var4_7 = 1;
                                var3_6 = var8_2;
                                break block186;
                            }
                            var3_6 = var9_3;
                            var5_8 = var4_7;
                            if (var6_1 != 10) break block154;
                            if (var4_7 == 46 || var4_7 == 101) break block187;
                            var3_6 = var9_3;
                            var5_8 = var4_7;
                            if (var4_7 != 69) break block154;
                        }
                        var3_6 = var4_7;
                        if (var4_7 == 46) {
                            this.addToString(var4_7);
                            var3_6 = var4_7 = this.readDigits(var6_1, this.getChar());
                            if (var4_7 == -2) {
                                this.parser.addError("msg.caught.nfe");
                                return -1;
                            }
                        }
                        if (var3_6 != 101) {
                            var5_8 = var3_6;
                            if (var3_6 != 69) lbl-1000:
                            // 2 sources

                            {
                                while (true) {
                                    var3_6 = 0;
                                    break block154;
                                    break;
                                }
                            }
                        }
                        this.addToString(var3_6);
                        var4_7 = this.getChar();
                        if (var4_7 == 43) break block188;
                        var3_6 = var4_7;
                        if (var4_7 != 45) break block189;
                    }
                    this.addToString(var4_7);
                    var3_6 = this.getChar();
                }
                if (!TokenStream.isDigit(var3_6)) {
                    this.parser.addError("msg.missing.exponent");
                    return -1;
                }
                var5_8 = var3_6 = this.readDigits(var6_1, var3_6);
                ** while (var3_6 != -2)
lbl571:
                // 1 sources

                this.parser.addError("msg.caught.nfe");
                return -1;
            }
            var4_7 = 0;
        }
        this.ungetChar(var5_8);
        this.string = var12_10 = this.getStringFromBuffer();
        var8_2 = var12_10.indexOf(95);
        var11_13 = var12_10;
        if (var8_2 != -1) {
            var11_13 = var12_10.toCharArray();
            for (var5_8 = var8_2 + 1; var5_8 < ((Object)var11_13).length; ++var5_8) {
                var7_15 = var8_2;
                if (var11_13[var5_8] != 95) {
                    var11_13[var8_2] = var11_13[var5_8];
                    var7_15 = var8_2 + 1;
                }
                var8_2 = var7_15;
            }
            var11_13 = new String((char[])var11_13, 0, var8_2);
        }
        if (var4_7 != 0) {
            this.bigInt = new BigInteger((String)var11_13, var6_1);
            return 83;
        }
        if (var6_1 == 10 && var3_6 == 0) {
            try {
                var1_17 = Double.parseDouble((String)var11_13);
            }
            catch (NumberFormatException var11_14) {
                this.parser.addError("msg.caught.nfe");
                return -1;
            }
        } else {
            var1_17 = ScriptRuntime.stringPrefixToNumber((String)var11_13, 0, var6_1);
        }
        this.number = var1_17;
        return 40;
    }

    public int getTokenBeg() {
        return this.tokenBeg;
    }

    public int getTokenEnd() {
        return this.tokenEnd;
    }

    public int getTokenLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    final boolean isNumericBinary() {
        return this.isBinary;
    }

    final boolean isNumericHex() {
        return this.isHex;
    }

    final boolean isNumericOctal() {
        return this.isOctal;
    }

    final boolean isNumericOldOctal() {
        return this.isOldOctal;
    }

    boolean isXMLAttribute() {
        return this.xmlIsAttribute;
    }

    String readAndClearRegExpFlags() {
        String string = this.regExpFlags;
        this.regExpFlags = null;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    void readRegExp(int n2) {
        int n3;
        int n4;
        block16: {
            int n5;
            n4 = this.tokenBeg;
            this.stringBufferTop = 0;
            if (n2 == 103) {
                this.addToString(61);
            } else {
                if (n2 != 24) {
                    Kit.codeBug();
                }
                if (this.peekChar() == 42) {
                    this.tokenEnd = this.cursor - 1;
                    this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
                    this.parser.reportError("msg.unterminated.re.lit");
                    return;
                }
            }
            n2 = 0;
            while (true) {
                block19: {
                    block17: {
                        block18: {
                            if ((n5 = this.getChar()) == 47 && n2 == 0) break block16;
                            if (n5 == 10 || n5 == -1) break;
                            if (n5 != 92) break block17;
                            this.addToString(n5);
                            n5 = this.getChar();
                            if (n5 == 10) break block18;
                            n3 = n5;
                            if (n5 != -1) break block19;
                        }
                        this.ungetChar(n5);
                        this.tokenEnd = this.cursor - 1;
                        this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
                        this.parser.reportError("msg.unterminated.re.lit");
                        return;
                    }
                    if (n5 == 91) {
                        n2 = 1;
                        n3 = n5;
                    } else {
                        n3 = n5;
                        if (n5 == 93) {
                            n2 = 0;
                            n3 = n5;
                        }
                    }
                }
                this.addToString(n3);
            }
            this.ungetChar(n5);
            this.tokenEnd = this.cursor - 1;
            this.string = new String(this.stringBuffer, 0, this.stringBufferTop);
            this.parser.reportError("msg.unterminated.re.lit");
            return;
        }
        n3 = this.stringBufferTop;
        while (true) {
            if (this.matchChar(103)) {
                this.addToString(103);
                continue;
            }
            n2 = 105;
            if (!this.matchChar(105)) {
                n2 = 109;
                if (!this.matchChar(109)) {
                    n2 = 115;
                    if (!this.matchChar(115)) {
                        n2 = 121;
                        if (!this.matchChar(121)) break;
                    }
                }
            }
            this.addToString(n2);
        }
        this.tokenEnd = n4 + this.stringBufferTop + 2;
        if (TokenStream.isAlpha(this.peekChar())) {
            this.parser.reportError("msg.invalid.re.flag", String.valueOf(Character.toChars(this.peekChar())));
        }
        this.string = new String(this.stringBuffer, 0, n3);
        this.regExpFlags = new String(this.stringBuffer, n3, this.stringBufferTop - n3);
    }

    /*
     * Unable to fully structure code
     */
    int readTemplateLiteral(boolean var1_1) {
        block27: {
            block28: {
                block29: {
                    block30: {
                        block31: {
                            block32: {
                                block34: {
                                    block33: {
                                        block35: {
                                            this.rawString.setLength(0);
                                            this.stringBufferTop = 0;
                                            var4_2 = false;
                                            block9: while (true) {
                                                var2_3 = this.getTemplateLiteralChar();
                                                var6_6 = null;
                                                var7_7 = null;
                                                var5_5 = null;
                                                if (var2_3 == -1) break block27;
                                                if (var2_3 == 36) break block28;
                                                if (var2_3 != 92) {
                                                    if (var2_3 != 96) lbl-1000:
                                                    // 11 sources

                                                    {
                                                        while (true) {
                                                            this.addToString(var2_3);
                                                            continue block9;
                                                            break;
                                                        }
                                                    }
                                                    var6_6 = this.rawString;
                                                    var6_6.setLength(var6_6.length() - 1);
                                                    if (!var4_2) {
                                                        var5_5 = this.getStringFromBuffer();
                                                    }
                                                    this.string = var5_5;
                                                    return 170;
                                                }
                                                var2_3 = this.getTemplateLiteralChar();
                                                if (var2_3 == 10) continue;
                                                if (var2_3 == 98) break block29;
                                                if (var2_3 == 102) break block30;
                                                if (var2_3 == 110) break block31;
                                                if (var2_3 == 114) break block32;
                                                if (var2_3 == 120) break block33;
                                                if (var2_3 == 8232 || var2_3 == 8233) continue;
                                                switch (var2_3) {
                                                    default: {
                                                        block4 : switch (var2_3) {
                                                            default: {
                                                                break;
                                                            }
                                                            case 118: {
                                                                var2_3 = 11;
                                                                break;
                                                            }
                                                            case 117: {
                                                                if (!this.matchTemplateLiteralChar(123)) ** GOTO lbl63
                                                                var2_3 = 0;
                                                                while (true) {
                                                                    if (this.peekTemplateLiteralChar() != 96) ** GOTO lbl45
                                                                    var3_4 = -1;
                                                                    ** GOTO lbl51
lbl45:
                                                                    // 1 sources

                                                                    var3_4 = this.getTemplateLiteralChar();
                                                                    if (var3_4 == -1) {
                                                                        this.parser.reportError("msg.syntax");
                                                                        return -1;
                                                                    }
                                                                    if (var3_4 != 125) ** GOTO lbl61
                                                                    var3_4 = var2_3;
lbl51:
                                                                    // 2 sources

                                                                    if (var3_4 < 0 || var3_4 > 0x10FFFF) ** GOTO lbl57
                                                                    var2_3 = var3_4;
                                                                    if (var3_4 <= 65535) ** GOTO lbl-1000
                                                                    this.addToString(Character.highSurrogate(var3_4));
                                                                    var2_3 = Character.lowSurrogate(var3_4);
                                                                    break block4;
lbl57:
                                                                    // 1 sources

                                                                    if (!var1_1) {
                                                                        this.parser.reportError("msg.syntax");
                                                                        return -1;
                                                                    }
                                                                    ** GOTO lbl83
lbl61:
                                                                    // 1 sources

                                                                    var2_3 = Kit.xDigitToInt(var3_4, var2_3);
                                                                }
lbl63:
                                                                // 1 sources

                                                                var2_3 = 0;
                                                                for (var3_4 = 0; var3_4 < 4; ++var3_4) {
                                                                    if (this.peekTemplateLiteralChar() != 96) ** GOTO lbl68
                                                                    var3_4 = -1;
                                                                    ** GOTO lbl71
lbl68:
                                                                    // 1 sources

                                                                    var2_3 = Kit.xDigitToInt(this.getTemplateLiteralChar(), var2_3);
                                                                }
                                                                var3_4 = var2_3;
lbl71:
                                                                // 2 sources

                                                                var2_3 = var3_4;
                                                                if (var3_4 >= 0) ** GOTO lbl-1000
                                                                if (!var1_1) {
                                                                    this.parser.reportError("msg.syntax");
                                                                    return -1;
                                                                }
                                                                ** GOTO lbl83
                                                            }
                                                            case 116: {
                                                                var2_3 = 9;
                                                                break;
                                                            }
                                                        }
                                                        ** GOTO lbl-1000
                                                    }
                                                    case 49: 
                                                    case 50: 
                                                    case 51: 
                                                    case 52: 
                                                    case 53: 
                                                    case 54: 
                                                    case 55: 
                                                    case 56: 
                                                    case 57: {
                                                        if (!var1_1) ** GOTO lbl86
lbl83:
                                                        // 5 sources

                                                        while (true) {
                                                            var4_2 = true;
                                                            continue block9;
                                                            break;
                                                        }
lbl86:
                                                        // 1 sources

                                                        this.parser.reportError("msg.syntax");
                                                        return -1;
                                                    }
                                                    case 48: 
                                                }
                                                break;
                                            }
                                            var2_3 = this.peekTemplateLiteralChar();
                                            if (var2_3 < 48 || var2_3 > 57) break block35;
                                            if (var1_1) ** GOTO lbl83
                                            this.parser.reportError("msg.syntax");
                                            return -1;
                                        }
                                        var2_3 = 0;
                                        ** GOTO lbl-1000
                                    }
                                    var2_3 = 0;
                                    for (var3_4 = 0; var3_4 < 2; ++var3_4) {
                                        if (this.peekTemplateLiteralChar() == 96) {
                                            var3_4 = -1;
                                            break block34;
                                        }
                                        var2_3 = Kit.xDigitToInt(this.getTemplateLiteralChar(), var2_3);
                                    }
                                    var3_4 = var2_3;
                                }
                                var2_3 = var3_4;
                                if (var3_4 >= 0) ** GOTO lbl-1000
                                ** while (var1_1)
lbl110:
                                // 1 sources

                                this.parser.reportError("msg.syntax");
                                return -1;
                            }
                            var2_3 = 13;
                            ** GOTO lbl-1000
                        }
                        var2_3 = 10;
                        ** GOTO lbl-1000
                    }
                    var2_3 = 12;
                    ** GOTO lbl-1000
                }
                var2_3 = 8;
                ** GOTO lbl-1000
            }
            if (this.matchTemplateLiteralChar(123)) ** break;
            ** while (true)
            var5_5 = this.rawString;
            var5_5.setLength(var5_5.length() - 2);
            var5_5 = var4_2 != false ? var6_6 : this.getStringFromBuffer();
            this.string = var5_5;
            this.tokenEnd = this.cursor - 1;
            return 172;
        }
        var5_5 = var4_2 != false ? var7_7 : this.getStringFromBuffer();
        this.string = var5_5;
        this.tokenEnd = this.cursor - 1;
        this.parser.reportError("msg.unexpected.eof");
        return -1;
    }

    String tokenToString(int n2) {
        return "";
    }
}

