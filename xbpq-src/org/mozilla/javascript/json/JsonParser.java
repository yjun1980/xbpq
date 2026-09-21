/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.json;

import com.github.catvod.spider.merge.C.a;
import java.util.ArrayList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.json.JsonParser$ParseException;

public class JsonParser {
    static final boolean $assertionsDisabled = false;
    private Context cx;
    private int length;
    private int pos;
    private Scriptable scope;
    private String src;

    public JsonParser(Context context, Scriptable scriptable) {
        this.cx = context;
        this.scope = scriptable;
    }

    private void consume(char c2) {
        this.consumeWhitespace();
        int n2 = this.pos;
        if (n2 < this.length) {
            CharSequence charSequence = this.src;
            this.pos = n2 + 1;
            char c3 = ((String)charSequence).charAt(n2);
            if (c3 == c2) {
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Expected ");
            ((StringBuilder)charSequence).append(c2);
            ((StringBuilder)charSequence).append(" found ");
            ((StringBuilder)charSequence).append(c3);
            throw new JsonParser$ParseException(((StringBuilder)charSequence).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected ");
        stringBuilder.append(c2);
        stringBuilder.append(" but reached end of stream");
        throw new JsonParser$ParseException(stringBuilder.toString());
    }

    private void consumeWhitespace() {
        int n2;
        while ((n2 = this.pos) < this.length) {
            if ((n2 = (int)this.src.charAt(n2)) != 9 && n2 != 10 && n2 != 13 && n2 != 32) {
                return;
            }
            ++this.pos;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int fromHex(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return (char)(c2 - 48);
        }
        int n2 = 65;
        if (c2 >= 'A' && c2 <= 'F') {
            return (char)(c2 - n2 + 10);
        }
        n2 = 97;
        if (c2 < 'a') return (char)-1;
        if (c2 > 'f') return (char)-1;
        return (char)(c2 - n2 + 10);
    }

    private char nextOrNumberError(int n2) {
        int n3 = this.pos;
        int n4 = this.length;
        if (n3 < n4) {
            String string = this.src;
            this.pos = n3 + 1;
            return string.charAt(n3);
        }
        throw this.numberError(n2, n4);
    }

    private JsonParser$ParseException numberError(int n2, int n3) {
        StringBuilder stringBuilder = a.c("Unsupported number format: ");
        stringBuilder.append(this.src.substring(n2, n3));
        return new JsonParser$ParseException(stringBuilder.toString());
    }

    private Object readArray() {
        int n2;
        this.consumeWhitespace();
        int n3 = this.pos++;
        if (n3 < this.length && this.src.charAt(n3) == ']') {
            return this.cx.newArray(this.scope, 0);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        n3 = 0;
        while ((n2 = this.pos) < this.length) {
            block10: {
                block9: {
                    block6: {
                        block7: {
                            block8: {
                                if ((n2 = (int)this.src.charAt(n2)) == 44) break block6;
                                if (n2 == 93) break block7;
                                if (n3 != 0) break block8;
                                arrayList.add(this.readValue());
                                n3 = 1;
                                break block9;
                            }
                            throw new JsonParser$ParseException("Missing comma in array literal");
                        }
                        if (n3 != 0) {
                            ++this.pos;
                            return this.cx.newArray(this.scope, arrayList.toArray());
                        }
                        throw new JsonParser$ParseException("Unexpected comma in array literal");
                    }
                    if (n3 == 0) break block10;
                    ++this.pos;
                    n3 = 0;
                }
                this.consumeWhitespace();
                continue;
            }
            throw new JsonParser$ParseException("Unexpected comma in array literal");
        }
        throw new JsonParser$ParseException("Unterminated array literal");
    }

    private void readDigits() {
        int n2;
        while ((n2 = this.pos) < this.length && (n2 = (int)this.src.charAt(n2)) >= 48 && n2 <= 57) {
            ++this.pos;
        }
    }

    private Boolean readFalse() {
        int n2 = this.length;
        int n3 = this.pos;
        if (n2 - n3 >= 4 && this.src.charAt(n3) == 'a' && this.src.charAt(this.pos + 1) == 'l' && this.src.charAt(this.pos + 2) == 's' && this.src.charAt(this.pos + 3) == 'e') {
            this.pos += 4;
            return Boolean.FALSE;
        }
        throw new JsonParser$ParseException("Unexpected token: f");
    }

    private Object readNull() {
        int n2 = this.length;
        int n3 = this.pos;
        if (n2 - n3 >= 3 && this.src.charAt(n3) == 'u' && this.src.charAt(this.pos + 1) == 'l' && this.src.charAt(this.pos + 2) == 'l') {
            this.pos += 3;
            return null;
        }
        throw new JsonParser$ParseException("Unexpected token: n");
    }

    private Number readNumber(char c2) {
        double d2;
        int n2;
        block11: {
            block13: {
                block12: {
                    n2 = this.pos - 1;
                    char c3 = c2;
                    if (c2 == '-' && ((c3 = this.nextOrNumberError(n2)) < '0' || c3 > '9')) {
                        throw this.numberError(n2, this.pos);
                    }
                    if (c3 != '0') {
                        this.readDigits();
                    }
                    if ((c2 = (char)this.pos) < this.length && this.src.charAt(c2) == '.') {
                        ++this.pos;
                        c2 = this.nextOrNumberError(n2);
                        if (c2 >= '0' && c2 <= '9') {
                            this.readDigits();
                        } else {
                            throw this.numberError(n2, this.pos);
                        }
                    }
                    if ((c2 = (char)this.pos) >= this.length || (c2 = this.src.charAt(c2)) != 'e' && c2 != 'E') break block11;
                    ++this.pos;
                    c3 = this.nextOrNumberError(n2);
                    if (c3 == '-') break block12;
                    c2 = c3;
                    if (c3 != '+') break block13;
                }
                c2 = this.nextOrNumberError(n2);
            }
            if (c2 >= '0' && c2 <= '9') {
                this.readDigits();
            } else {
                throw this.numberError(n2, this.pos);
            }
        }
        if ((double)(c2 = (char)(d2 = Double.parseDouble(this.src.substring(n2, this.pos)))) == d2) {
            return (int)c2;
        }
        return d2;
    }

    private Object readObject() {
        int n2;
        this.consumeWhitespace();
        Scriptable scriptable = this.cx.newObject(this.scope);
        int n3 = this.pos++;
        if (n3 < this.length && this.src.charAt(n3) == '}') {
            return scriptable;
        }
        n3 = 0;
        while ((n2 = this.pos) < this.length) {
            block13: {
                block12: {
                    Object object;
                    block10: {
                        block11: {
                            object = this.src;
                            this.pos = n2 + 1;
                            if ((n2 = (int)((String)object).charAt(n2)) == 34) break block10;
                            if (n2 != 44) {
                                if (n2 == 125) {
                                    if (n3 != 0) {
                                        return scriptable;
                                    }
                                    throw new JsonParser$ParseException("Unexpected comma in object literal");
                                }
                                throw new JsonParser$ParseException("Unexpected token in object literal");
                            }
                            if (n3 == 0) break block11;
                            n3 = 0;
                            break block12;
                        }
                        throw new JsonParser$ParseException("Unexpected comma in object literal");
                    }
                    if (n3 != 0) break block13;
                    Object object2 = this.readString();
                    this.consume(':');
                    object = this.readValue();
                    object2 = ScriptRuntime.toStringIdOrIndex(object2);
                    if (((ScriptRuntime$StringIdOrIndex)object2).getStringId() == null) {
                        scriptable.put(((ScriptRuntime$StringIdOrIndex)object2).getIndex(), scriptable, object);
                    } else {
                        scriptable.put(((ScriptRuntime$StringIdOrIndex)object2).getStringId(), scriptable, object);
                    }
                    n3 = 1;
                }
                this.consumeWhitespace();
                continue;
            }
            throw new JsonParser$ParseException("Missing comma in object literal");
        }
        throw new JsonParser$ParseException("Unterminated object literal");
    }

    /*
     * Enabled aggressive block sorting
     */
    private String readString() {
        CharSequence charSequence;
        int n2;
        int n3 = this.pos;
        while ((n2 = this.pos) < this.length) {
            charSequence = this.src;
            this.pos = n2 + 1;
            if ((n2 = (int)((String)charSequence).charAt(n2)) <= 31) {
                throw new JsonParser$ParseException("String contains control character");
            }
            if (n2 == 92) break;
            if (n2 != 34) continue;
            return this.src.substring(n3, this.pos - 1);
        }
        charSequence = new StringBuilder();
        block1: while (true) {
            String string;
            block21: {
                block15: {
                    block16: {
                        block17: {
                            block18: {
                                block19: {
                                    char c2;
                                    block14: {
                                        block20: {
                                            if ((n2 = this.pos) >= this.length) {
                                                throw new JsonParser$ParseException("Unterminated string literal");
                                            }
                                            ((StringBuilder)charSequence).append(this.src, n3, n2 - 1);
                                            n3 = this.pos;
                                            if (n3 >= this.length) {
                                                throw new JsonParser$ParseException("Unterminated string");
                                            }
                                            string = this.src;
                                            this.pos = n3 + 1;
                                            c2 = string.charAt(n3);
                                            if (c2 == '\"') break block15;
                                            if (c2 == '/') break block16;
                                            if (c2 == '\\') break block17;
                                            if (c2 == 'b') break block18;
                                            if (c2 == 'f') break block19;
                                            if (c2 == 'n') break block20;
                                            if (c2 != 'r') {
                                                if (c2 != 't') {
                                                    if (c2 != 'u') {
                                                        charSequence = new StringBuilder();
                                                        ((StringBuilder)charSequence).append("Unexpected character in string: '\\");
                                                        ((StringBuilder)charSequence).append(c2);
                                                        ((StringBuilder)charSequence).append("'");
                                                        throw new JsonParser$ParseException(((StringBuilder)charSequence).toString());
                                                    }
                                                    n2 = this.length;
                                                    n3 = this.pos;
                                                    if (n2 - n3 < 5) {
                                                        charSequence = a.c("Invalid character code: \\u");
                                                        ((StringBuilder)charSequence).append(this.src.substring(this.pos));
                                                        throw new JsonParser$ParseException(((StringBuilder)charSequence).toString());
                                                    }
                                                    if ((n3 = JsonParser.fromHex(this.src.charAt(n3 + 0)) << 12 | JsonParser.fromHex(this.src.charAt(this.pos + 1)) << 8 | JsonParser.fromHex(this.src.charAt(this.pos + 2)) << 4 | JsonParser.fromHex(this.src.charAt(this.pos + 3))) < 0) {
                                                        charSequence = a.c("Invalid character code: ");
                                                        string = this.src;
                                                        n3 = this.pos;
                                                        ((StringBuilder)charSequence).append(string.substring(n3, n3 + 4));
                                                        throw new JsonParser$ParseException(((StringBuilder)charSequence).toString());
                                                    }
                                                    this.pos += 4;
                                                    c2 = (char)n3;
                                                    break block14;
                                                } else {
                                                    c2 = '\t';
                                                }
                                                break block14;
                                            } else {
                                                c2 = '\r';
                                            }
                                            break block14;
                                        }
                                        c2 = '\n';
                                    }
                                    ((StringBuilder)charSequence).append(c2);
                                    break block21;
                                }
                                ((StringBuilder)charSequence).append('\f');
                                break block21;
                            }
                            ((StringBuilder)charSequence).append('\b');
                            break block21;
                        }
                        ((StringBuilder)charSequence).append('\\');
                        break block21;
                    }
                    ((StringBuilder)charSequence).append('/');
                    break block21;
                }
                ((StringBuilder)charSequence).append('\"');
            }
            n2 = this.pos;
            do {
                int n4 = this.pos;
                n3 = n2;
                if (n4 >= this.length) continue block1;
                string = this.src;
                this.pos = n4 + 1;
                n3 = string.charAt(n4);
                if (n3 <= 31) {
                    throw new JsonParser$ParseException("String contains control character");
                }
                if (n3 != 92) continue;
                n3 = n2;
                continue block1;
            } while (n3 != 34);
            break;
        }
        ((StringBuilder)charSequence).append(this.src, n2, this.pos - 1);
        return ((StringBuilder)charSequence).toString();
    }

    private Boolean readTrue() {
        int n2 = this.length;
        int n3 = this.pos;
        if (n2 - n3 >= 3 && this.src.charAt(n3) == 'r' && this.src.charAt(this.pos + 1) == 'u' && this.src.charAt(this.pos + 2) == 'e') {
            this.pos += 3;
            return Boolean.TRUE;
        }
        throw new JsonParser$ParseException("Unexpected token: t");
    }

    private Object readValue() {
        this.consumeWhitespace();
        int n2 = this.pos;
        if (n2 < this.length) {
            CharSequence charSequence = this.src;
            this.pos = n2 + 1;
            char c2 = ((String)charSequence).charAt(n2);
            if (c2 != '\"') {
                if (c2 != '-') {
                    if (c2 != '[') {
                        if (c2 != 'f') {
                            if (c2 != 'n') {
                                if (c2 != 't') {
                                    if (c2 != '{') {
                                        switch (c2) {
                                            default: {
                                                charSequence = new StringBuilder();
                                                ((StringBuilder)charSequence).append("Unexpected token: ");
                                                ((StringBuilder)charSequence).append(c2);
                                                throw new JsonParser$ParseException(((StringBuilder)charSequence).toString());
                                            }
                                            case '0': 
                                            case '1': 
                                            case '2': 
                                            case '3': 
                                            case '4': 
                                            case '5': 
                                            case '6': 
                                            case '7': 
                                            case '8': 
                                            case '9': {
                                                return this.readNumber(c2);
                                            }
                                        }
                                    }
                                    return this.readObject();
                                }
                                return this.readTrue();
                            }
                            return this.readNull();
                        }
                        return this.readFalse();
                    }
                    return this.readArray();
                }
                return this.readNumber(c2);
            }
            return this.readString();
        }
        throw new JsonParser$ParseException("Empty JSON string");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object parseValue(String object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                if (object != null) {
                    block5: {
                        try {
                            this.pos = 0;
                            this.length = ((String)object).length();
                            this.src = object;
                            object = this.readValue();
                            this.consumeWhitespace();
                            int n2 = this.pos;
                            int n3 = this.length;
                            if (n2 < n3) break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return object;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected end of stream at char ");
                    stringBuilder.append(this.pos);
                    object = new JsonParser$ParseException(stringBuilder.toString());
                    throw object;
                }
                object = new JsonParser$ParseException("Input string may not be null");
                throw object;
            }
            throw throwable2;
        }
    }
}

