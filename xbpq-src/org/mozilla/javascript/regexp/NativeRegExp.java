/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import com.github.catvod.spider.merge.G1.a;
import java.util.Objects;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.regexp.CompilerState;
import org.mozilla.javascript.regexp.NativeRegExpCtor;
import org.mozilla.javascript.regexp.NativeRegExpInstantiator;
import org.mozilla.javascript.regexp.REBackTrackData;
import org.mozilla.javascript.regexp.RECharSet;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.REGlobalData;
import org.mozilla.javascript.regexp.RENode;
import org.mozilla.javascript.regexp.REProgState;
import org.mozilla.javascript.regexp.RegExpImpl;
import org.mozilla.javascript.regexp.SubString;

public class NativeRegExp
extends IdScriptableObject {
    static final boolean $assertionsDisabled = false;
    private static final int ANCHOR_BOL = -2;
    private static final int INDEX_LEN = 2;
    private static final int Id_compile = 1;
    private static final int Id_dotAll = 7;
    private static final int Id_exec = 4;
    private static final int Id_flags = 3;
    private static final int Id_global = 4;
    private static final int Id_ignoreCase = 5;
    private static final int Id_lastIndex = 1;
    private static final int Id_multiline = 6;
    private static final int Id_prefix = 6;
    private static final int Id_source = 2;
    private static final int Id_sticky = 8;
    private static final int Id_test = 5;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    public static final int JSREG_DOTALL = 8;
    public static final int JSREG_FOLD = 2;
    public static final int JSREG_GLOB = 1;
    public static final int JSREG_MULTILINE = 4;
    public static final int JSREG_STICKY = 16;
    public static final int MATCH = 1;
    private static final int MAX_INSTANCE_ID = 8;
    private static final int MAX_PROTOTYPE_ID = 8;
    public static final int PREFIX = 2;
    private static final Object REGEXP_TAG = new Object();
    private static final byte REOP_ALNUM = 9;
    private static final byte REOP_ALT = 31;
    private static final byte REOP_ALTPREREQ = 53;
    private static final byte REOP_ALTPREREQ2 = 55;
    private static final byte REOP_ALTPREREQi = 54;
    private static final byte REOP_ASSERT = 41;
    private static final byte REOP_ASSERTNOTTEST = 44;
    private static final byte REOP_ASSERTTEST = 43;
    private static final byte REOP_ASSERT_NOT = 42;
    private static final byte REOP_BACKREF = 13;
    private static final byte REOP_BOL = 2;
    private static final byte REOP_CLASS = 22;
    private static final byte REOP_DIGIT = 7;
    private static final byte REOP_DOT = 6;
    private static final byte REOP_EMPTY = 1;
    private static final byte REOP_END = 57;
    private static final byte REOP_ENDCHILD = 49;
    private static final byte REOP_EOL = 3;
    private static final byte REOP_FLAT = 14;
    private static final byte REOP_FLAT1 = 15;
    private static final byte REOP_FLAT1i = 17;
    private static final byte REOP_FLATi = 16;
    private static final byte REOP_JUMP = 32;
    private static final byte REOP_LPAREN = 29;
    private static final byte REOP_MINIMALOPT = 47;
    private static final byte REOP_MINIMALPLUS = 46;
    private static final byte REOP_MINIMALQUANT = 48;
    private static final byte REOP_MINIMALREPEAT = 52;
    private static final byte REOP_MINIMALSTAR = 45;
    private static final byte REOP_NCLASS = 23;
    private static final byte REOP_NONALNUM = 10;
    private static final byte REOP_NONDIGIT = 8;
    private static final byte REOP_NONSPACE = 12;
    private static final byte REOP_OPT = 28;
    private static final byte REOP_PLUS = 27;
    private static final byte REOP_QUANT = 25;
    private static final byte REOP_REPEAT = 51;
    private static final byte REOP_RPAREN = 30;
    private static final byte REOP_SIMPLE_END = 23;
    private static final byte REOP_SIMPLE_START = 1;
    private static final byte REOP_SPACE = 11;
    private static final byte REOP_STAR = 26;
    private static final byte REOP_UCFLAT1 = 18;
    private static final byte REOP_UCFLAT1i = 19;
    private static final byte REOP_WBDRY = 4;
    private static final byte REOP_WNONBDRY = 5;
    private static final int SymbolId_match = 7;
    private static final int SymbolId_search = 8;
    public static final int TEST = 0;
    private static final boolean debug = false;
    private static final long serialVersionUID = 4965263491464903264L;
    Object lastIndex;
    private int lastIndexAttr;
    private RECompiled re;

    NativeRegExp() {
        this.lastIndex = ScriptRuntime.zeroObj;
        this.lastIndexAttr = 6;
    }

    NativeRegExp(Scriptable scriptable, RECompiled rECompiled) {
        Double d2 = ScriptRuntime.zeroObj;
        this.lastIndex = d2;
        this.lastIndexAttr = 6;
        this.re = rECompiled;
        this.setLastIndex(d2);
        ScriptRuntime.setBuiltinProtoAndParent(this, scriptable, TopLevel$Builtins.RegExp);
    }

    private static void addCharacterRangeToCharSet(RECharSet object, char c2, char c3) {
        int n2 = c2 / 8;
        int n3 = c3 / 8;
        if (c3 < ((RECharSet)object).length && c2 <= c3) {
            c2 = (char)(c2 & 7);
            c3 = (char)(c3 & 7);
            if (n2 == n3) {
                object = ((RECharSet)object).bits;
                object[n2] = (byte)(255 >> 7 - (c3 - c2) << c2 | object[n2]);
            } else {
                byte[] byArray = ((RECharSet)object).bits;
                byArray[n2] = (byte)(255 << c2 | byArray[n2]);
                c2 = (char)n2;
                while ((c2 = (char)(c2 + 1)) < n3) {
                    ((RECharSet)object).bits[c2] = -1;
                }
                object = ((RECharSet)object).bits;
                object[n3] = (byte)(object[n3] | 255 >> 7 - c3);
            }
            return;
        }
        throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
    }

    private static void addCharacterToCharSet(RECharSet object, char c2) {
        int n2 = c2 / 8;
        if (c2 < ((RECharSet)object).length) {
            object = ((RECharSet)object).bits;
            object[n2] = (byte)(1 << (c2 & 7) | object[n2]);
            return;
        }
        throw ScriptRuntime.constructError("SyntaxError", "invalid range in character class");
    }

    private static int addIndex(byte[] byArray, int n2, int n3) {
        if (n3 >= 0) {
            if (n3 <= 65535) {
                byArray[n2] = (byte)(n3 >> 8);
                byArray[n2 + 1] = (byte)n3;
                return n2 + 2;
            }
            throw Context.reportRuntimeError("Too complex regexp");
        }
        throw Kit.codeBug();
    }

    private void appendFlags(StringBuilder stringBuilder) {
        if ((this.re.flags & 1) != 0) {
            stringBuilder.append('g');
        }
        if ((this.re.flags & 2) != 0) {
            stringBuilder.append('i');
        }
        if ((this.re.flags & 4) != 0) {
            stringBuilder.append('m');
        }
        if ((this.re.flags & 8) != 0) {
            stringBuilder.append('s');
        }
        if ((this.re.flags & 0x10) != 0) {
            stringBuilder.append('y');
        }
    }

    private static boolean backrefMatcher(REGlobalData rEGlobalData, int n2, String string, int n3) {
        long[] lArray = rEGlobalData.parens;
        if (lArray != null && n2 < lArray.length) {
            int n4 = rEGlobalData.parensIndex(n2);
            if (n4 == -1) {
                return true;
            }
            n2 = rEGlobalData.cp;
            int n5 = rEGlobalData.parensLength(n2);
            if (n2 + n5 > n3) {
                return false;
            }
            if ((rEGlobalData.regexp.flags & 2) != 0) {
                for (n2 = 0; n2 < n5; ++n2) {
                    char c2;
                    char c3 = string.charAt(n4 + n2);
                    if (c3 == (c2 = string.charAt(rEGlobalData.cp + n2)) || NativeRegExp.upcase(c3) == NativeRegExp.upcase(c2)) continue;
                    return false;
                }
            } else if (!string.regionMatches(n4, string, n2, n5)) {
                return false;
            }
            rEGlobalData.cp += n5;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean calculateBitmapSize(CompilerState var0, RENode var1_1, char[] var2_2, int var3_3, int var4_4) {
        var1_1.bmsize = 0;
        var1_1.sense = true;
        if (var3_3 == var4_4) {
            return true;
        }
        var8_5 = var3_3;
        if (var2_2[var3_3] == '^') {
            var8_5 = var3_3 + 1;
            var1_1.sense = false;
        }
        var10_6 = 0;
        var7_7 = 0;
        var9_8 = 0;
        while (var8_5 != var4_4) {
            block35: {
                block34: {
                    block36: {
                        block37: {
                            var3_3 = var2_2[var8_5];
                            var11_11 = 92;
                            if (var3_3 != 92) {
                                var6_10 = var8_5 + 1;
                                var3_3 = var2_2[var8_5];
lbl18:
                                // 8 sources

                                while (true) {
                                    var8_5 = var3_3;
                                    var3_3 = var6_10;
                                    break block34;
                                    break;
                                }
                            }
                            var3_3 = var8_5 + 1;
                            var6_10 = var3_3 + 1;
                            if ((var3_3 = var2_2[var3_3]) == 68 || var3_3 == 83 || var3_3 == 87) break block35;
                            if (var3_3 == 102) break block36;
                            if (var3_3 == 110) break block37;
                            switch (var3_3) {
                                default: {
                                    block3 : switch (var3_3) {
                                        default: {
                                            switch (var3_3) {
                                                default: {
                                                    var8_5 = var6_10;
lbl34:
                                                    // 4 sources

                                                    while (true) {
                                                        var6_10 = var8_5;
                                                        break block3;
                                                        break;
                                                    }
                                                }
                                                case 120: {
                                                    var8_5 = 2;
                                                    ** GOTO lbl45
                                                }
                                                case 118: {
                                                    var3_3 = 11;
                                                    break block3;
                                                }
                                                case 117: {
                                                    var8_5 = 4;
lbl45:
                                                    // 2 sources

                                                    var12_12 = 0;
                                                    var3_3 = 0;
                                                    while (true) {
                                                        if (var12_12 >= var8_5 || var6_10 >= var4_4) ** GOTO lbl18
                                                        var13_13 = var6_10 + 1;
                                                        var3_3 = Kit.xDigitToInt(var2_2[var6_10], var3_3);
                                                        ++var12_12;
                                                        if (var3_3 < 0) {
                                                            var6_10 = var13_13 - var12_12;
                                                            var3_3 = var11_11;
                                                            break block3;
                                                        }
                                                        var6_10 = var13_13;
                                                    }
                                                }
                                                case 116: {
                                                    var3_3 = 9;
                                                    break block3;
                                                }
                                                case 114: {
                                                    var3_3 = 13;
                                                    break block3;
                                                }
                                            }
                                        }
                                        case 100: {
                                            if (var7_7 != 0) {
                                                var1_1.bmsize = 65536;
                                                return true;
                                            }
                                            var3_3 = 57;
                                            break;
                                        }
                                        case 99: {
                                            if (var6_10 < var4_4 && NativeRegExp.isControlLetter(var2_2[var6_10])) {
                                                var3_3 = var6_10 + 1;
                                                var6_10 = var2_2[var6_10];
                                                var8_5 = var11_11;
                                            } else {
                                                var3_3 = var6_10 - 1;
                                                var8_5 = var11_11;
                                            }
                                            break block34;
                                        }
                                        case 98: {
                                            var3_3 = 8;
                                            break;
                                        }
                                    }
                                    ** GOTO lbl18
                                }
                                case 48: 
                                case 49: 
                                case 50: 
                                case 51: 
                                case 52: 
                                case 53: 
                                case 54: 
                                case 55: {
                                    var12_12 = var3_3 - 48;
                                    var13_13 = var2_2[var6_10];
                                    var8_5 = var6_10;
                                    var3_3 = var12_12;
                                    if (48 > var13_13) ** GOTO lbl34
                                    var8_5 = var6_10;
                                    var3_3 = var12_12;
                                    if (var13_13 > 55) ** GOTO lbl34
                                    var11_11 = var6_10 + 1;
                                    var8_5 = var13_13 - 48 + var12_12 * 8;
                                    var12_12 = var2_2[var11_11];
                                    var6_10 = var11_11;
                                    var3_3 = var8_5;
                                    if (48 > var12_12) ** GOTO lbl18
                                    var6_10 = var11_11;
                                    var3_3 = var8_5;
                                    if (var12_12 > 55) ** GOTO lbl18
                                    var6_10 = var11_11 + 1;
                                    var3_3 = var12_12 - 48 + var8_5 * 8;
                                    if (var3_3 <= 255) {
                                        var8_5 = var6_10;
                                        ** continue;
                                    }
                                    --var6_10;
                                    var3_3 = var8_5;
                                    break;
                                }
                            }
                            ** GOTO lbl18
                        }
                        var3_3 = 10;
                        ** GOTO lbl18
                    }
                    var3_3 = 12;
                    ** continue;
                }
                if (var7_7 != 0) {
                    if (var9_8 > var8_5) {
                        NativeRegExp.reportError("msg.bad.range", "");
                        return false;
                    }
                    var11_11 = 0;
                } else {
                    var11_11 = var7_7;
                    if (var3_3 < var4_4 - 1) {
                        var11_11 = var7_7;
                        if (var2_2[var3_3] == '-') {
                            var9_8 = (char)var8_5;
                            var7_7 = 1;
                            var8_5 = ++var3_3;
                            continue;
                        }
                    }
                }
                var6_10 = var8_5;
                if ((var0.flags & 2) != 0 && (var7_7 = (int)NativeRegExp.upcase(var5_9 = (char)var8_5)) >= (var6_10 = (int)NativeRegExp.downcase(var5_9))) {
                    var6_10 = var7_7;
                }
                var7_7 = var11_11;
                var8_5 = var3_3;
                if (var6_10 <= var10_6) continue;
                var10_6 = var6_10;
                var7_7 = var11_11;
                var8_5 = var3_3;
                continue;
                {
                    ** case 115:
                    ** case 119:
                }
            }
            var1_1.bmsize = 65536;
            return true;
        }
        var1_1.bmsize = var10_6 + 1;
        return true;
    }

    private static boolean classMatcher(REGlobalData rEGlobalData, RECharSet rECharSet, char c2) {
        boolean bl;
        if (!rECharSet.converted) {
            NativeRegExp.processCharSet(rEGlobalData, rECharSet);
        }
        int n2 = rECharSet.length;
        boolean bl2 = bl = true;
        if (n2 != 0) {
            bl2 = bl;
            if (c2 < n2) {
                bl2 = (rECharSet.bits[c2 >> 3] & 1 << (c2 & 7)) == 0 ? bl : false;
            }
        }
        return rECharSet.sense ^ bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static RECompiled compileRE(Context var0, String var1_1, String var2_2, boolean var3_3) {
        block33: {
            block31: {
                block32: {
                    block34: {
                        var9_4 = new RECompiled((String)var1_1);
                        var8_5 = var1_1.length();
                        if (var2_2 != null) {
                            var7_6 = 0;
                            var6_7 = 0;
                            while (true) {
                                var5_9 /* !! */  = var6_7;
                                if (var7_6 < var2_2.length()) {
                                    var4_8 = var2_2.charAt(var7_6);
                                    if (var4_8 == 'g') {
                                        var5_9 /* !! */  = 1;
                                    } else if (var4_8 == 'i') {
                                        var5_9 /* !! */  = 2;
                                    } else if (var4_8 == 'm') {
                                        var5_9 /* !! */  = 4;
                                    } else if (var4_8 == 's') {
                                        var5_9 /* !! */  = 8;
                                    } else if (var4_8 == 'y') {
                                        var5_9 /* !! */  = 16;
                                    } else {
                                        NativeRegExp.reportError("msg.invalid.re.flag", String.valueOf(var4_8));
                                        var5_9 /* !! */  = 0;
                                    }
                                    if ((var6_7 & var5_9 /* !! */ ) != 0) {
                                        NativeRegExp.reportError("msg.invalid.re.flag", String.valueOf(var4_8));
                                    }
                                    var6_7 |= var5_9 /* !! */ ;
                                    ++var7_6;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var5_9 /* !! */  = 0;
                        }
                        var9_4.flags = var5_9 /* !! */ ;
                        var2_2 = new CompilerState((Context)var0, var9_4.source, var8_5, var5_9 /* !! */ );
                        if (var3_3 && var8_5 > 0) {
                            var2_2.result = var0 = new RENode(14);
                            var0.chr = var2_2.cpbegin[0];
                            var0.length = var8_5;
                            var0.flatIndex = 0;
                            var2_2.progLength += 5;
                            var1_1 = var2_2;
                        } else {
                            if (!NativeRegExp.parseDisjunction((CompilerState)var2_2)) {
                                return null;
                            }
                            var1_1 = var2_2;
                            if (var2_2.maxBackReference > var2_2.parenCount) {
                                var0 = new CompilerState((Context)var0, var9_4.source, var8_5, var5_9 /* !! */ );
                                var0.backReferenceLimit = var0.parenCount;
                                var1_1 = var0;
                                if (!NativeRegExp.parseDisjunction((CompilerState)var0)) {
                                    return null;
                                }
                            }
                        }
                        var9_4.program = new byte[var1_1.progLength + 1];
                        var5_9 /* !! */  = var1_1.classCount;
                        if (var5_9 /* !! */  != 0) {
                            var9_4.classList = new RECharSet[var5_9 /* !! */ ];
                            var9_4.classCount = var5_9 /* !! */ ;
                        }
                        var5_9 /* !! */  = NativeRegExp.emitREBytecode((CompilerState)var1_1, var9_4, 0, var1_1.result);
                        var0 = var9_4.program;
                        var0[var5_9 /* !! */ ] = 57;
                        var9_4.parenCount = var1_1.parenCount;
                        var5_9 /* !! */  = (int)var0[0];
                        if (var5_9 /* !! */  == 2) break block31;
                        if (var5_9 /* !! */  == 31) break block32;
                        switch (var5_9 /* !! */ ) {
                            default: {
                                break block33;
                            }
                            case 18: 
                            case 19: {
                                var5_9 /* !! */  = NativeRegExp.getIndex((byte[])var0, 1);
                                ** GOTO lbl73
                            }
                            case 15: 
                            case 17: {
                                var5_9 /* !! */  = var0[1] & 255;
lbl73:
                                // 2 sources

                                var5_9 /* !! */  = (char)var5_9 /* !! */ ;
                                break block34;
                            }
                            case 14: 
                            case 16: 
                        }
                        var5_9 /* !! */  = NativeRegExp.getIndex((byte[])var0, 1);
                        var5_9 /* !! */  = var9_4.source[var5_9 /* !! */ ];
                    }
                    var9_4.anchorCh = var5_9 /* !! */ ;
                    break block33;
                }
                var0 = var1_1.result;
                if (var0.kid.op != 2 || var0.kid2.op != 2) break block33;
            }
            var9_4.anchorCh = -2;
        }
        return var9_4;
    }

    private static void doFlat(CompilerState compilerState, char c2) {
        RENode rENode;
        compilerState.result = rENode = new RENode(14);
        rENode.chr = c2;
        rENode.length = 1;
        rENode.flatIndex = -1;
        compilerState.progLength += 3;
    }

    private static char downcase(char c2) {
        if (c2 < '\u0080') {
            char c3 = c2;
            if ('A' <= c2) {
                c3 = c2;
                if (c2 <= 'Z') {
                    c3 = (char)(c2 + 32);
                }
            }
            return c3;
        }
        char c4 = Character.toLowerCase(c2);
        if (c4 >= '\u0080') {
            c2 = c4;
        }
        return c2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static int emitREBytecode(CompilerState compilerState, RECompiled rECompiled, int n2, RENode rENode) {
        byte[] byArray = rECompiled.program;
        int n3 = n2;
        while (rENode != null) {
            block17: {
                block18: {
                    RENode rENode2;
                    int n4;
                    int n5;
                    block19: {
                        block29: {
                            block22: {
                                block20: {
                                    block21: {
                                        block28: {
                                            block27: {
                                                block23: {
                                                    block26: {
                                                        block24: {
                                                            block25: {
                                                                n2 = n3 + 1;
                                                                byArray[n3] = n5 = rENode.op;
                                                                n4 = 1;
                                                                if (n5 == 1) break block17;
                                                                if (n5 == 22) break block18;
                                                                if (n5 == 25) break block19;
                                                                if (n5 == 29) break block20;
                                                                n3 = n2;
                                                                if (n5 == 31) break block21;
                                                                n3 = n2;
                                                                if (n5 == 13) break block22;
                                                                if (n5 == 14) break block23;
                                                                if (n5 == 41) break block24;
                                                                if (n5 == 42) break block25;
                                                                switch (n5) {
                                                                    default: {
                                                                        break block17;
                                                                    }
                                                                    case 53: 
                                                                    case 54: 
                                                                    case 55: {
                                                                        n3 = n5 == 54 ? n4 : 0;
                                                                        char c2 = rENode.chr;
                                                                        n4 = c2;
                                                                        if (n3 != 0) {
                                                                            n4 = NativeRegExp.upcase(c2);
                                                                        }
                                                                        NativeRegExp.addIndex(byArray, n2, n4);
                                                                        n4 = n2 + 2;
                                                                        n2 = n3 != 0 ? (int)NativeRegExp.upcase((char)rENode.index) : rENode.index;
                                                                        NativeRegExp.addIndex(byArray, n4, n2);
                                                                        n3 = n4 + 2;
                                                                        break;
                                                                    }
                                                                }
                                                                break block21;
                                                            }
                                                            n4 = NativeRegExp.emitREBytecode(compilerState, rECompiled, n2 + 2, rENode.kid);
                                                            n3 = n4 + 1;
                                                            byArray[n4] = 44;
                                                            break block26;
                                                        }
                                                        n4 = NativeRegExp.emitREBytecode(compilerState, rECompiled, n2 + 2, rENode.kid);
                                                        n3 = n4 + 1;
                                                        byArray[n4] = 43;
                                                    }
                                                    NativeRegExp.resolveForwardJump(byArray, n2, n3);
                                                    n2 = n3;
                                                    break block17;
                                                }
                                                if (rENode.flatIndex != -1) {
                                                    while ((rENode2 = rENode.next) != null && rENode2.op == 14 && (n4 = rENode.flatIndex) + (n3 = rENode.length) == rENode2.flatIndex) {
                                                        rENode.length = n3 + rENode2.length;
                                                        rENode.next = rENode2.next;
                                                    }
                                                }
                                                if ((n3 = rENode.flatIndex) == -1 || rENode.length <= 1) break block27;
                                                byArray[n2 - 1] = (compilerState.flags & 2) != 0 ? 16 : 14;
                                                n2 = NativeRegExp.addIndex(byArray, NativeRegExp.addIndex(byArray, n2, n3), rENode.length);
                                                break block17;
                                            }
                                            n4 = rENode.chr;
                                            if (n4 >= 256) break block28;
                                            byArray[n2 - 1] = (compilerState.flags & 2) != 0 ? 17 : 15;
                                            n3 = n2 + 1;
                                            byArray[n2] = (byte)n4;
                                            n2 = n3;
                                            break block17;
                                        }
                                        byArray[n2 - 1] = (compilerState.flags & 2) != 0 ? 19 : 18;
                                        break block29;
                                    }
                                    rENode2 = rENode.kid2;
                                    n2 = NativeRegExp.emitREBytecode(compilerState, rECompiled, n3 + 2, rENode.kid);
                                    n4 = n2 + 1;
                                    byArray[n2] = 32;
                                    n2 = n4 + 2;
                                    NativeRegExp.resolveForwardJump(byArray, n3, n2);
                                    n2 = NativeRegExp.emitREBytecode(compilerState, rECompiled, n2, rENode2);
                                    n3 = n2 + 1;
                                    byArray[n2] = 32;
                                    n2 = n3 + 2;
                                    NativeRegExp.resolveForwardJump(byArray, n4, n2);
                                    NativeRegExp.resolveForwardJump(byArray, n3, n2);
                                    break block17;
                                }
                                n2 = NativeRegExp.emitREBytecode(compilerState, rECompiled, NativeRegExp.addIndex(byArray, n2, rENode.parenIndex), rENode.kid);
                                n3 = n2 + 1;
                                byArray[n2] = 30;
                            }
                            n4 = rENode.parenIndex;
                            n2 = n3;
                        }
                        n2 = NativeRegExp.addIndex(byArray, n2, n4);
                        break block17;
                    }
                    n3 = rENode.min;
                    if (n3 == 0 && rENode.max == -1) {
                        n5 = rENode.greedy ? 26 : 45;
                        byArray[n2 - 1] = n5;
                    } else if (n3 == 0 && rENode.max == 1) {
                        n5 = rENode.greedy ? 28 : 47;
                        byArray[n2 - 1] = n5;
                    } else if (n3 == 1 && rENode.max == -1) {
                        n5 = rENode.greedy ? 27 : 46;
                        byArray[n2 - 1] = n5;
                    } else {
                        if (!rENode.greedy) {
                            byArray[n2 - 1] = 48;
                        }
                        n2 = NativeRegExp.addIndex(byArray, NativeRegExp.addIndex(byArray, n2, n3), rENode.max + 1);
                    }
                    n3 = NativeRegExp.addIndex(byArray, NativeRegExp.addIndex(byArray, n2, rENode.parenCount), rENode.parenIndex);
                    rENode2 = rENode.kid;
                    n4 = NativeRegExp.emitREBytecode(compilerState, rECompiled, n3 + 2, rENode2);
                    n2 = n4 + 1;
                    byArray[n4] = 49;
                    NativeRegExp.resolveForwardJump(byArray, n3, n2);
                    break block17;
                }
                if (!rENode.sense) {
                    byArray[n2 - 1] = 23;
                }
                n2 = NativeRegExp.addIndex(byArray, n2, rENode.index);
                rECompiled.classList[rENode.index] = new RECharSet(rENode.bmsize, rENode.startIndex, rENode.kidlen, rENode.sense);
            }
            rENode = rENode.next;
            n3 = --n2;
        }
        return n3;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    private static String escapeRegExp(Object object) {
        Object object2;
        String string = ScriptRuntime.toString(object);
        int n2 = string.indexOf(47);
        object = null;
        int n3 = 0;
        while (n2 > -1) {
            int n4;
            block7: {
                block6: {
                    if (n2 == n3) break block6;
                    object2 = object;
                    n4 = n3;
                    if (string.charAt(n2 - 1) == '\\') break block7;
                }
                object2 = object;
                if (object == null) {
                    object2 = new StringBuilder();
                }
                ((StringBuilder)object2).append(string, n3, n2);
                ((StringBuilder)object2).append("\\/");
                n4 = n2 + 1;
            }
            n2 = string.indexOf(47, n2 + 1);
            object = object2;
            n3 = n4;
        }
        object2 = string;
        if (object != null) {
            ((StringBuilder)object).append(string, n3, string.length());
            object2 = ((StringBuilder)object).toString();
        }
        return object2;
    }

    /*
     * Exception decompiling
     */
    private static boolean executeREBytecode(Context var0, REGlobalData var1_1, String var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[SWITCH], 18[CASE]], but top level block is 38[DOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static boolean flatNIMatcher(REGlobalData rEGlobalData, int n2, int n3, String string, int n4) {
        if (rEGlobalData.cp + n3 > n4) {
            return false;
        }
        char[] cArray = rEGlobalData.regexp.source;
        for (n4 = 0; n4 < n3; ++n4) {
            char c2 = cArray[n2 + n4];
            char c3 = string.charAt(rEGlobalData.cp + n4);
            if (c2 == c3 || NativeRegExp.upcase(c2) == NativeRegExp.upcase(c3)) continue;
            return false;
        }
        rEGlobalData.cp += n3;
        return true;
    }

    private static boolean flatNMatcher(REGlobalData rEGlobalData, int n2, int n3, String string, int n4) {
        if (rEGlobalData.cp + n3 > n4) {
            return false;
        }
        for (n4 = 0; n4 < n3; ++n4) {
            if (rEGlobalData.regexp.source[n2 + n4] == string.charAt(rEGlobalData.cp + n4)) continue;
            return false;
        }
        rEGlobalData.cp += n3;
        return true;
    }

    private static int getDecimalValue(char c2, CompilerState compilerState, int n2, String string) {
        char c3;
        int n3 = compilerState.cp;
        char[] cArray = compilerState.cpbegin;
        int n4 = c2 - 48;
        boolean bl = false;
        while ((c2 = (char)compilerState.cp) != compilerState.cpend && NativeRegExp.isDigit(c3 = cArray[c2])) {
            boolean bl2 = bl;
            c2 = (char)n4;
            if (!bl) {
                c2 = (char)(c3 - 48 + n4 * 10);
                if (c2 < n2) {
                    bl2 = bl;
                } else {
                    c2 = (char)n2;
                    bl2 = true;
                }
            }
            ++compilerState.cp;
            bl = bl2;
            n4 = c2;
        }
        if (bl) {
            NativeRegExp.reportError(string, String.valueOf(cArray, n3, compilerState.cp - n3));
        }
        return n4;
    }

    private static RegExpImpl getImpl(Context context) {
        return (RegExpImpl)ScriptRuntime.getRegExpProxy(context);
    }

    private static int getIndex(byte[] byArray, int n2) {
        byte by = byArray[n2];
        return byArray[n2 + 1] & 0xFF | (by & 0xFF) << 8;
    }

    private static int getOffset(byte[] byArray, int n2) {
        return NativeRegExp.getIndex(byArray, n2);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        NativeRegExp nativeRegExp = NativeRegExpInstantiator.withLanguageVersion(context.getLanguageVersion());
        nativeRegExp.re = NativeRegExp.compileRE(context, "", null, false);
        nativeRegExp.activatePrototypeMap(8);
        nativeRegExp.setParentScope(scriptable);
        nativeRegExp.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        NativeRegExpCtor nativeRegExpCtor = new NativeRegExpCtor();
        nativeRegExp.defineProperty("constructor", (Object)nativeRegExpCtor, 2);
        ScriptRuntime.setFunctionProtoAndParent((BaseFunction)nativeRegExpCtor, context, scriptable);
        nativeRegExpCtor.setImmunePrototypeProperty(nativeRegExp);
        if (bl) {
            nativeRegExp.sealObject();
            nativeRegExpCtor.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "RegExp", nativeRegExpCtor, 2);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, nativeRegExpCtor);
    }

    private static boolean isControlLetter(char c2) {
        boolean bl = 'a' <= c2 && c2 <= 'z' || 'A' <= c2 && c2 <= 'Z';
        return bl;
    }

    static boolean isDigit(char c2) {
        boolean bl = '0' <= c2 && c2 <= '9';
        return bl;
    }

    private static boolean isLineTerm(char c2) {
        return ScriptRuntime.isJSLineTerminator(c2);
    }

    private static boolean isREWhiteSpace(int n2) {
        return ScriptRuntime.isJSWhitespaceOrLineTerminator(n2);
    }

    private static boolean isWord(char c2) {
        boolean bl = 'a' <= c2 && c2 <= 'z' || 'A' <= c2 && c2 <= 'Z' || NativeRegExp.isDigit(c2) || c2 == '_';
        return bl;
    }

    private static boolean matchRegExp(Context context, REGlobalData rEGlobalData, RECompiled rECompiled, String string, int n2, int n3, boolean bl) {
        int n4 = rECompiled.parenCount;
        rEGlobalData.parens = (long[])(n4 != 0 ? new long[n4] : null);
        rEGlobalData.backTrackStackTop = null;
        rEGlobalData.stateStackTop = null;
        bl = bl || (rECompiled.flags & 4) != 0;
        rEGlobalData.multiline = bl;
        rEGlobalData.regexp = rECompiled;
        int n5 = rECompiled.anchorCh;
        n4 = n2;
        while (n4 <= n3) {
            int n6 = n4;
            if (n5 >= 0) {
                while (true) {
                    if (n4 == n3) {
                        return false;
                    }
                    char c2 = string.charAt(n4);
                    n6 = n4;
                    if (c2 == n5) break;
                    if ((rEGlobalData.regexp.flags & 2) != 0 && NativeRegExp.upcase(c2) == NativeRegExp.upcase((char)n5)) {
                        n6 = n4;
                        break;
                    }
                    if ((rEGlobalData.regexp.flags & 0x10) != 0) {
                        return false;
                    }
                    ++n4;
                }
            }
            rEGlobalData.cp = n6;
            rEGlobalData.skipped = n6 - n2;
            for (n4 = 0; n4 < rECompiled.parenCount; ++n4) {
                rEGlobalData.parens[n4] = -1L;
            }
            bl = NativeRegExp.executeREBytecode(context, rEGlobalData, string, n3);
            rEGlobalData.backTrackStackTop = null;
            rEGlobalData.stateStackTop = null;
            if (bl) {
                return true;
            }
            if (n5 == -2 && !rEGlobalData.multiline) {
                rEGlobalData.skipped = n3;
                return false;
            }
            if ((rEGlobalData.regexp.flags & 0x10) != 0) {
                return false;
            }
            n4 = rEGlobalData.skipped + n2 + 1;
        }
        return false;
    }

    private static boolean parseAlternative(CompilerState compilerState) {
        int n2;
        char[] cArray = compilerState.cpbegin;
        RENode rENode = null;
        RENode rENode2 = null;
        block0: while ((n2 = compilerState.cp) != compilerState.cpend && cArray[n2] != '|' && (compilerState.parenNesting == 0 || cArray[n2] != ')')) {
            RENode rENode3;
            if (!NativeRegExp.parseTerm(compilerState)) {
                return false;
            }
            if (rENode == null) {
                rENode2 = rENode3 = compilerState.result;
            } else {
                rENode2.next = compilerState.result;
                rENode3 = rENode;
            }
            while (true) {
                RENode rENode4 = rENode2.next;
                rENode = rENode3;
                if (rENode4 == null) continue block0;
                rENode2 = rENode4;
            }
        }
        rENode2 = rENode;
        if (rENode == null) {
            rENode2 = new RENode(1);
        }
        compilerState.result = rENode2;
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean parseDisjunction(CompilerState var0) {
        if (!NativeRegExp.parseAlternative(var0)) {
            return false;
        }
        var2_2 = var0.cp;
        var4_1 /* !! */  = var0.cpbegin;
        if (var2_2 != var4_1 /* !! */ .length && var4_1 /* !! */ [var2_2] == '|') {
            var0.cp = var2_2 + 1;
            var6_3 = new RENode(31);
            var6_3.kid = var0.result;
            if (!NativeRegExp.parseDisjunction(var0)) {
                return false;
            }
            var6_3.kid2 = var5_4 = var0.result;
            var0.result = var6_3;
            var4_1 /* !! */  = (char[])var6_3.kid;
            var2_2 = var4_1 /* !! */ .op;
            if (var2_2 == 14 && var5_4.op == 14) {
                var1_5 = (var0.flags & 2) == 0 ? 53 : 54;
                var6_3.op = (byte)var1_5;
                var6_3.chr = var4_1 /* !! */ .chr;
                var2_2 = var5_4.chr;
lbl20:
                // 2 sources

                while (true) {
                    var6_3.index = var2_2;
lbl22:
                    // 2 sources

                    while (true) {
                        var2_2 = var0.progLength + 13;
                        ** GOTO lbl35
                        break;
                    }
                    break;
                }
            } else {
                if (var2_2 == 22 && (var3_6 = var4_1 /* !! */ .index) < 256 && var5_4.op == 14 && (var0.flags & 2) == 0) {
                    var6_3.op = (byte)55;
                    var6_3.chr = var5_4.chr;
                    var6_3.index = var3_6;
                    ** continue;
                }
                if (var2_2 == 14 && var5_4.op == 22 && (var2_2 = var5_4.index) < 256 && (var0.flags & 2) == 0) {
                    var6_3.op = (byte)55;
                    var6_3.chr = var4_1 /* !! */ .chr;
                    ** continue;
                }
                var2_2 = var0.progLength + 9;
            }
lbl35:
            // 2 sources

            var0.progLength = var2_2;
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    private static boolean parseTerm(CompilerState var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[CASE]], but top level block is 14[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static REProgState popProgState(REGlobalData rEGlobalData) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.stateStackTop = rEProgState.previous;
        return rEProgState;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void processCharSet(REGlobalData rEGlobalData, RECharSet rECharSet) {
        synchronized (rECharSet) {
            if (!rECharSet.converted) {
                NativeRegExp.processCharSetImpl(rEGlobalData, rECharSet);
                rECharSet.converted = true;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void processCharSetImpl(REGlobalData var0, RECharSet var1_1) {
        var7_2 = var1_1.startIndex;
        var13_3 = var1_1.strlength + var7_2;
        var1_1.bits = new byte[(var1_1.length + 7) / 8];
        if (var7_2 == var13_3) {
            return;
        }
        var8_4 = var7_2;
        if (var0.regexp.source[var7_2] == '^') {
            var8_4 = var7_2 + 1;
        }
        var7_2 = 0;
        var3_5 = '\u0000';
        block17: while (var8_4 != var13_3) {
            block54: {
                block55: {
                    block56: {
                        block52: {
                            block57: {
                                block58: {
                                    var15_15 = var0.regexp.source;
                                    var9_10 = var15_15[var8_4];
                                    var2_6 = '\\';
                                    if (var9_10 != 92) {
                                        var9_10 = var8_4 + 1;
                                        var2_6 = var15_15[var8_4];
                                        var8_4 = var9_10;
lbl19:
                                        // 4 sources

                                        while (true) {
                                            var9_10 = var8_4;
                                            break block52;
                                            break;
                                        }
                                    }
                                    var9_10 = var8_4 + 1;
                                    var8_4 = var9_10 + 1;
                                    var4_7 = var15_15[var9_10];
                                    if (var4_7 == 'D') break block54;
                                    if (var4_7 == 'S') break block55;
                                    if (var4_7 == 'W') break block56;
                                    if (var4_7 == 'f') break block57;
                                    if (var4_7 == 110) break block58;
                                    block0 : switch (var4_7) {
                                        default: {
                                            switch (var4_7) {
                                                default: {
                                                    switch (var4_7) {
                                                        default: {
                                                            var2_6 = var4_7;
                                                            break block0;
                                                        }
                                                        case 'x': {
                                                            var10_11 = 2;
                                                            ** GOTO lbl60
                                                        }
                                                        case 'w': {
                                                            var9_10 = var7_2;
                                                            if (var7_2 != 0) {
                                                                NativeRegExp.addCharacterToCharSet(var1_1, '-');
                                                                var9_10 = 0;
                                                            }
                                                            var10_11 = var1_1.length - 1;
                                                            while (true) {
                                                                var7_2 = var9_10;
                                                                if (var10_11 < 0) continue block17;
                                                                var2_6 = (char)var10_11;
                                                                if (NativeRegExp.isWord(var2_6)) {
                                                                    NativeRegExp.addCharacterToCharSet(var1_1, var2_6);
                                                                }
                                                                --var10_11;
                                                            }
                                                        }
                                                        case 'v': {
                                                            var2_6 = '\u000b';
                                                            break block0;
                                                        }
                                                        case 'u': {
                                                            var10_11 = 4;
lbl60:
                                                            // 2 sources

                                                            var9_10 = 0;
                                                            for (var11_12 = 0; var11_12 < var10_11 && var8_4 < var13_3; ++var11_12) {
                                                                var15_15 = var0.regexp.source;
                                                                var12_13 = var8_4 + 1;
                                                                if ((var8_4 = NativeRegExp.toASCIIHexDigit(var15_15[var8_4])) < 0) {
                                                                    var8_4 = var12_13 - (var11_12 + 1);
                                                                    var9_10 = var2_6;
                                                                    break;
                                                                }
                                                                var9_10 = var9_10 << 4 | var8_4;
                                                                var8_4 = var12_13;
                                                            }
                                                            var2_6 = (char)var9_10;
                                                            break block0;
                                                        }
                                                        case 't': {
                                                            var2_6 = '\t';
                                                            break block0;
                                                        }
                                                        case 's': {
                                                            var9_10 = var7_2;
                                                            if (var7_2 != 0) {
                                                                NativeRegExp.addCharacterToCharSet(var1_1, '-');
                                                                var9_10 = 0;
                                                            }
                                                            var10_11 = var1_1.length - 1;
                                                            while (true) {
                                                                var7_2 = var9_10;
                                                                if (var10_11 < 0) continue block17;
                                                                if (NativeRegExp.isREWhiteSpace(var10_11)) {
                                                                    NativeRegExp.addCharacterToCharSet(var1_1, (char)var10_11);
                                                                }
                                                                --var10_11;
                                                            }
                                                        }
                                                        case 'r': 
                                                    }
                                                    var2_6 = '\r';
                                                    break block0;
                                                }
                                                case 'd': {
                                                    var9_10 = var7_2;
                                                    if (var7_2 != 0) {
                                                        NativeRegExp.addCharacterToCharSet(var1_1, '-');
                                                        var9_10 = 0;
                                                    }
                                                    NativeRegExp.addCharacterRangeToCharSet(var1_1, '0', '9');
                                                    var7_2 = var9_10;
                                                    continue block17;
                                                }
                                                case 'c': {
                                                    if (var8_4 < var13_3 && NativeRegExp.isControlLetter(var15_15[var8_4])) {
                                                        var2_6 = (char)(var0.regexp.source[var8_4] & 31);
                                                        var9_10 = var8_4 + 1;
                                                        break;
                                                    }
                                                    --var8_4;
                                                    break block0;
                                                }
                                                case 'b': {
                                                    var2_6 = '\b';
                                                    var9_10 = var8_4;
                                                    break;
                                                }
                                            }
                                            break block52;
                                        }
                                        case '0': 
                                        case '1': 
                                        case '2': 
                                        case '3': 
                                        case '4': 
                                        case '5': 
                                        case '6': 
                                        case '7': {
                                            var12_13 = var4_7 - 48;
                                            var14_14 = var15_15[var8_4];
                                            var10_11 = var12_13;
                                            var9_10 = var8_4;
                                            if ('0' <= var14_14) {
                                                var10_11 = var12_13;
                                                var9_10 = var8_4;
                                                if (var14_14 <= '7') {
                                                    var11_12 = var8_4 + 1;
                                                    var8_4 = var12_13 * 8 + (var14_14 - 48);
                                                    var12_13 = var15_15[var11_12];
                                                    var10_11 = var8_4;
                                                    var9_10 = var11_12;
                                                    if (48 <= var12_13) {
                                                        var10_11 = var8_4;
                                                        var9_10 = var11_12;
                                                        if (var12_13 <= 55) {
                                                            var9_10 = var11_12 + 1;
                                                            var10_11 = var12_13 - 48 + var8_4 * 8;
                                                            if (var10_11 > 255) {
                                                                --var9_10;
                                                                var10_11 = var8_4;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var2_6 = (char)var10_11;
                                            var8_4 = var9_10;
                                            break;
                                        }
                                    }
                                    ** GOTO lbl19
                                }
                                var2_6 = '\n';
                                ** GOTO lbl19
                            }
                            var2_6 = '\f';
                            ** continue;
                        }
                        if (var7_2 != 0) {
                            if ((var0.regexp.flags & 2) != 0) {
                                var4_7 = var3_5;
                                while (var4_7 <= var2_6) {
                                    NativeRegExp.addCharacterToCharSet(var1_1, var4_7);
                                    var6_9 = NativeRegExp.upcase(var4_7);
                                    var5_8 = NativeRegExp.downcase(var4_7);
                                    if (var4_7 != var6_9) {
                                        NativeRegExp.addCharacterToCharSet(var1_1, var6_9);
                                    }
                                    if (var4_7 != var5_8) {
                                        NativeRegExp.addCharacterToCharSet(var1_1, var5_8);
                                    }
                                    var4_7 = var5_8 = (char)(var4_7 + '\u0001');
                                    if (var5_8 != '\u0000') continue;
                                    break;
                                }
                            } else {
                                NativeRegExp.addCharacterRangeToCharSet(var1_1, var3_5, var2_6);
                            }
                            var7_2 = 0;
                            var8_4 = var9_10;
                            continue;
                        }
                        if ((var0.regexp.flags & 2) != 0) {
                            NativeRegExp.addCharacterToCharSet(var1_1, NativeRegExp.upcase(var2_6));
                            NativeRegExp.addCharacterToCharSet(var1_1, NativeRegExp.downcase(var2_6));
                        } else {
                            NativeRegExp.addCharacterToCharSet(var1_1, var2_6);
                        }
                        var8_4 = var9_10;
                        if (var9_10 >= var13_3 - 1) continue;
                        var8_4 = var9_10;
                        if (var0.regexp.source[var9_10] != '-') continue;
                        var8_4 = var9_10 + 1;
                        var7_2 = 1;
                        var3_5 = var2_6;
                        continue;
                    }
                    var9_10 = var7_2;
                    if (var7_2 != 0) {
                        NativeRegExp.addCharacterToCharSet(var1_1, '-');
                        var9_10 = 0;
                    }
                    var10_11 = var1_1.length - 1;
                    while (true) {
                        var7_2 = var9_10;
                        if (var10_11 < 0) continue block17;
                        var2_6 = (char)var10_11;
                        if (!NativeRegExp.isWord(var2_6)) {
                            NativeRegExp.addCharacterToCharSet(var1_1, var2_6);
                        }
                        --var10_11;
                    }
                }
                var9_10 = var7_2;
                if (var7_2 != 0) {
                    NativeRegExp.addCharacterToCharSet(var1_1, '-');
                    var9_10 = 0;
                }
                var10_11 = var1_1.length - 1;
                while (true) {
                    var7_2 = var9_10;
                    if (var10_11 < 0) continue block17;
                    if (!NativeRegExp.isREWhiteSpace(var10_11)) {
                        NativeRegExp.addCharacterToCharSet(var1_1, (char)var10_11);
                    }
                    --var10_11;
                }
            }
            var9_10 = var7_2;
            if (var7_2 != 0) {
                NativeRegExp.addCharacterToCharSet(var1_1, '-');
                var9_10 = 0;
            }
            NativeRegExp.addCharacterRangeToCharSet(var1_1, '\u0000', '/');
            NativeRegExp.addCharacterRangeToCharSet(var1_1, ':', (char)(var1_1.length - 1));
            var7_2 = var9_10;
        }
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte by, int n2) {
        REProgState rEProgState = rEGlobalData.stateStackTop;
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, by, n2, rEGlobalData.cp, rEProgState.continuationOp, rEProgState.continuationPc);
    }

    private static void pushBackTrackState(REGlobalData rEGlobalData, byte by, int n2, int n3, int n4, int n5) {
        rEGlobalData.backTrackStackTop = new REBackTrackData(rEGlobalData, by, n2, n3, n4, n5);
    }

    private static void pushProgState(REGlobalData rEGlobalData, int n2, int n3, int n4, REBackTrackData rEBackTrackData, int n5, int n6) {
        rEGlobalData.stateStackTop = new REProgState(rEGlobalData.stateStackTop, n2, n3, n4, rEBackTrackData, n5, n6);
    }

    private static NativeRegExp realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeRegExp.class, idFunctionObject);
    }

    private static boolean reopIsSimple(int n2) {
        boolean bl = true;
        if (n2 < 1 || n2 > 23) {
            bl = false;
        }
        return bl;
    }

    private static void reportError(String string, String string2) {
        throw ScriptRuntime.constructError("SyntaxError", ScriptRuntime.getMessageById(string, string2));
    }

    private static void reportWarning(Context context, String string, String string2) {
        if (context.hasFeature(11)) {
            Context.reportWarning(ScriptRuntime.getMessageById(string, string2));
        }
    }

    private static void resolveForwardJump(byte[] byArray, int n2, int n3) {
        if (n2 <= n3) {
            NativeRegExp.addIndex(byArray, n2, n3 - n2);
            return;
        }
        throw Kit.codeBug();
    }

    private void setLastIndex(Object object) {
        if ((this.lastIndexAttr & 1) == 0) {
            this.lastIndex = object;
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.modify.readonly", "lastIndex");
    }

    /*
     * Unable to fully structure code
     */
    private static int simpleMatch(REGlobalData var0, String var1_1, int var2_2, byte[] var3_3, int var4_4, int var5_5, boolean var6_6) {
        block40: {
            var12_7 = var0.cp++;
            var11_8 = 0;
            var15_9 = 0;
            var16_10 = 0;
            var9_11 = var4_4;
            switch (var2_2) {
                default: {
                    throw Kit.codeBug();
                }
                case 22: 
                case 23: {
                    var9_11 = NativeRegExp.getIndex(var3_3, var4_4);
                    var10_12 = var0.cp;
                    var14_15 = var15_9;
                    var2_2 = var4_4 += 2;
                    if (var10_12 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (!NativeRegExp.classMatcher(var0, var0.regexp.classList[var9_11], var1_1.charAt(var10_12))) break block40;
                    ** GOTO lbl136
                }
                case 19: {
                    var8_16 = (char)NativeRegExp.getIndex(var3_3, var4_4);
                    var9_11 = var0.cp;
                    var14_15 = var15_9;
                    var2_2 = var4_4 += 2;
                    if (var9_11 == var5_5) break block40;
                    var7_18 = var1_1.charAt(var9_11);
                    var9_11 = var4_4;
                    if (var8_16 == var7_18) ** GOTO lbl148
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (NativeRegExp.upcase(var8_16) != NativeRegExp.upcase(var7_18)) break block40;
                    ** GOTO lbl136
                }
                case 18: {
                    var9_11 = (char)NativeRegExp.getIndex(var3_3, var4_4);
                    var10_13 = var0.cp;
                    var14_15 = var15_9;
                    var2_2 = var4_4 += 2;
                    if (var10_13 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var1_1.charAt(var10_13) != var9_11) break block40;
                    ** GOTO lbl136
                }
                case 17: {
                    var9_11 = var4_4 + 1;
                    var7_19 = (char)(var3_3[var4_4] & 255);
                    var14_15 = var16_10;
                    var2_2 = var9_11;
                    if (var12_7 == var5_5) break block40;
                    var8_17 = var1_1.charAt(var12_7);
                    if (var7_19 == var8_17) ** GOTO lbl53
                    var14_15 = var16_10;
                    var2_2 = var9_11;
                    if (NativeRegExp.upcase(var7_19) != NativeRegExp.upcase(var8_17)) break block40;
lbl53:
                    // 2 sources

                    ++var0.cp;
                    var14_15 = 1;
                    var2_2 = var9_11;
                    break block40;
                }
                case 16: {
                    var9_11 = NativeRegExp.getIndex(var3_3, var4_4);
                    var2_2 = var4_4 + 2;
                    var4_4 = NativeRegExp.getIndex(var3_3, var2_2);
                    var2_2 += 2;
                    var14_15 = (int)NativeRegExp.flatNIMatcher(var0, var9_11, var4_4, var1_1, var5_5);
                    break block40;
                }
                case 15: {
                    var9_11 = var4_4 + 1;
                    var4_4 = (char)(var3_3[var4_4] & 255);
                    var14_15 = var16_10;
                    var2_2 = var9_11;
                    if (var12_7 != var5_5) {
                        var14_15 = var16_10;
                        var2_2 = var9_11;
                        if (var1_1.charAt(var12_7) == var4_4) {
                            break;
                        }
                    }
                    break block40;
                }
                case 14: {
                    var9_11 = NativeRegExp.getIndex(var3_3, var4_4);
                    var2_2 = var4_4 + 2;
                    var4_4 = NativeRegExp.getIndex(var3_3, var2_2);
                    var2_2 += 2;
                    var14_15 = (int)NativeRegExp.flatNMatcher(var0, var9_11, var4_4, var1_1, var5_5);
                    break block40;
                }
                case 13: {
                    var9_11 = NativeRegExp.getIndex(var3_3, var4_4);
                    var2_2 = var4_4 + 2;
                    var14_15 = NativeRegExp.backrefMatcher(var0, var9_11, var1_1, var5_5);
                    break block40;
                }
                case 12: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (NativeRegExp.isREWhiteSpace(var1_1.charAt(var12_7))) break block40;
                    ** GOTO lbl136
                }
                case 11: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (!NativeRegExp.isREWhiteSpace(var1_1.charAt(var12_7))) break block40;
                    var9_11 = var4_4;
                    ** GOTO lbl148
                }
                case 10: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (NativeRegExp.isWord(var1_1.charAt(var12_7))) break block40;
                    ** GOTO lbl136
                }
                case 9: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (!NativeRegExp.isWord(var1_1.charAt(var12_7))) break block40;
                    ** GOTO lbl136
                }
                case 8: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (NativeRegExp.isDigit(var1_1.charAt(var12_7))) break block40;
                    ** GOTO lbl136
                }
                case 7: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (!NativeRegExp.isDigit(var1_1.charAt(var12_7))) break block40;
lbl136:
                    // 8 sources

                    var9_11 = var4_4;
                    ** GOTO lbl148
                }
                case 6: {
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var12_7 == var5_5) break block40;
                    var9_11 = var4_4;
                    if ((var0.regexp.flags & 8) != 0) ** GOTO lbl148
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (NativeRegExp.isLineTerm(var1_1.charAt(var12_7))) break block40;
                    var9_11 = var4_4;
lbl148:
                    // 5 sources

                    ++var0.cp;
                    break;
                }
                case 5: {
                    var2_2 = var12_7 != 0 && NativeRegExp.isWord(var1_1.charAt(var12_7 - 1)) ? 0 : 1;
                    var13_20 = var0.cp;
                    var10_14 = var11_8;
                    var9_11 = var2_2;
                    if (var13_20 >= var5_5) ** GOTO lbl172
                    var10_14 = var11_8;
                    var9_11 = var2_2;
                    if (!NativeRegExp.isWord(var1_1.charAt(var13_20))) ** GOTO lbl172
                    var9_11 = var2_2;
                    ** GOTO lbl171
                }
                case 4: {
                    var2_2 = var12_7 != 0 && NativeRegExp.isWord(var1_1.charAt(var12_7 - 1)) ? 0 : 1;
                    var13_21 = var0.cp;
                    var9_11 = var2_2;
                    if (var13_21 >= var5_5) ** GOTO lbl171
                    var10_14 = var11_8;
                    var9_11 = var2_2;
                    if (NativeRegExp.isWord(var1_1.charAt(var13_21))) ** GOTO lbl172
                    var9_11 = var2_2;
lbl171:
                    // 3 sources

                    var10_14 = 1;
lbl172:
                    // 4 sources

                    var14_15 = var10_14 ^ var9_11;
                    var2_2 = var4_4;
                    break block40;
                }
                case 3: {
                    var9_11 = var4_4;
                    if (var12_7 == var5_5) break;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var0.multiline) {
                        var9_11 = var4_4;
                        if (NativeRegExp.isLineTerm(var1_1.charAt(var12_7))) break;
                        var14_15 = var15_9;
                        var2_2 = var4_4;
                    }
                    break block40;
                }
                case 2: {
                    var9_11 = var4_4;
                    if (var12_7 == 0) break;
                    var14_15 = var15_9;
                    var2_2 = var4_4;
                    if (var0.multiline) {
                        var9_11 = var4_4;
                        if (NativeRegExp.isLineTerm(var1_1.charAt(var12_7 - 1))) break;
                        var14_15 = var15_9;
                        var2_2 = var4_4;
                    }
                    break block40;
                }
                case 1: 
            }
            var14_15 = 1;
            var2_2 = var9_11;
        }
        if (var14_15 != 0) {
            if (!var6_6) {
                var0.cp = var12_7;
            }
            return var2_2;
        }
        var0.cp = var12_7;
        return -1;
    }

    private static int toASCIIHexDigit(int n2) {
        if (n2 < 48) {
            return -1;
        }
        if (n2 <= 57) {
            return n2 - 48;
        }
        if (97 <= (n2 |= 0x20) && n2 <= 102) {
            return n2 - 97 + 10;
        }
        return -1;
    }

    private static char upcase(char c2) {
        if (c2 < '\u0080') {
            char c3 = c2;
            if ('a' <= c2) {
                c3 = c2;
                if (c2 <= 'z') {
                    c3 = (char)(c2 - 32);
                }
            }
            return c3;
        }
        char c4 = Character.toUpperCase(c2);
        if (c4 >= '\u0080') {
            c2 = c4;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    Scriptable compile(Context object, Scriptable object2, Object[] object3) {
        if (((Object[])object3).length > 0 && object3[0] instanceof NativeRegExp) {
            if (((Object[])object3).length > 1 && object3[1] != Undefined.instance) {
                throw ScriptRuntime.typeErrorById("msg.bad.regexp.compile", new Object[0]);
            }
            object = (NativeRegExp)object3[0];
            this.re = ((NativeRegExp)object).re;
            object = ((NativeRegExp)object).lastIndex;
        } else {
            void var3_6;
            object2 = ((Object[])object3).length != 0 && !(object3[0] instanceof Undefined) ? NativeRegExp.escapeRegExp(object3[0]) : "";
            if (((Object[])object3).length > 1 && object3[1] != Undefined.instance) {
                String string = ScriptRuntime.toString(object3[1]);
            } else {
                Object var3_5 = null;
            }
            this.re = NativeRegExp.compileRE((Context)object, (String)object2, (String)var3_6, false);
            object = ScriptRuntime.zeroObj;
        }
        this.setLastIndex(object);
        return this;
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context object2, Scriptable object3, Scriptable object4, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(REGEXP_TAG)) {
            return super.execIdCall((IdFunctionObject)object, (Context)object2, (Scriptable)object3, (Scriptable)object4, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 8: {
                object = (Scriptable)NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).execSub((Context)object2, (Scriptable)object3, objectArray, 1);
                object = object == null ? Integer.valueOf(-1) : object.get("index", (Scriptable)object);
                return object;
            }
            case 7: {
                return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).execSub((Context)object2, (Scriptable)object3, objectArray, 1);
            }
            case 6: {
                return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).execSub((Context)object2, (Scriptable)object3, objectArray, 2);
            }
            case 5: {
                object2 = NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).execSub((Context)object2, (Scriptable)object3, objectArray, 0);
                object = Boolean.TRUE;
                if (!((Boolean)object).equals(object2)) {
                    object = Boolean.FALSE;
                }
                return object;
            }
            case 4: {
                return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).execSub((Context)object2, (Scriptable)object3, objectArray, 1);
            }
            case 3: {
                return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).toString();
            }
            case 2: {
                if (object4 != object3 && object4 instanceof NativeObject) {
                    object = object4.get("source", (Scriptable)object4);
                    object3 = Scriptable.NOT_FOUND;
                    boolean bl = object.equals(object3);
                    object2 = "undefined";
                    object = bl ? "undefined" : NativeRegExp.escapeRegExp(object);
                    if (!(object4 = object4.get("flags", (Scriptable)object4)).equals(object3)) {
                        object2 = object4.toString();
                    }
                    return a.a("/", (String)object, "/", (String)object2);
                }
                return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).toString();
            }
            case 1: 
        }
        return NativeRegExp.realThis((Scriptable)object4, (IdFunctionObject)object).compile((Context)object2, (Scriptable)object3, objectArray);
    }

    Object execSub(Context object, Scriptable object2, Object[] object3, int n2) {
        int n3;
        Object object4;
        RegExpImpl regExpImpl;
        block3: {
            block4: {
                block2: {
                    regExpImpl = NativeRegExp.getImpl((Context)object);
                    if (((Object[])object3).length != 0) break block2;
                    object3 = object4 = regExpImpl.input;
                    if (object4 != null) break block3;
                    object3 = Undefined.instance;
                    break block4;
                }
                object3 = object3[0];
            }
            object3 = ScriptRuntime.toString(object3);
        }
        n3 = ((n3 = this.re.flags) & 1) == 0 && (n3 & 0x10) == 0 ? 0 : 1;
        double d2 = 0.0;
        if (n3 != 0 && ((d2 = ScriptRuntime.toInteger(this.lastIndex)) < 0.0 || (double)((String)object3).length() < d2)) {
            this.setLastIndex(ScriptRuntime.zeroObj);
            return null;
        }
        object4 = new int[1];
        object4[0] = (int)d2;
        object2 = this.executeRegExp((Context)object, (Scriptable)object2, regExpImpl, (String)object3, (int[])object4, n2);
        if (n3 != 0) {
            object = object2 != null && object2 != Undefined.instance ? Double.valueOf((double)object4[0]) : ScriptRuntime.zeroObj;
            this.setLastIndex(object);
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    Object executeRegExp(Context var1_1, Scriptable var2_2, RegExpImpl var3_3, String var4_4, int[] var5_5, int var6_6) {
        var18_7 = new REGlobalData();
        var7_8 = var5_5 /* !! */ [0];
        var10_9 = var4_4.length();
        if (var7_8 > var10_9) {
            var7_8 = var10_9;
        }
        var14_10 = NativeRegExp.matchRegExp((Context)var1_1, var18_7, this.re, var4_4, var7_8, var10_9, var3_3.multiline);
        var17_11 = null;
        if (!var14_10) {
            if (var6_6 != 2) {
                return null;
            }
            return Undefined.instance;
        }
        var5_5 /* !! */ [0] = var12_12 = var18_7.cp;
        var11_13 = var12_12 - (var18_7.skipped + var7_8);
        var13_14 = var12_12 - var11_13;
        if (var6_6 == 0) {
            var15_15 = Boolean.TRUE;
            var16_16 = null;
        } else {
            var15_15 = var1_1.newArray((Scriptable)var2_2, 0);
            var15_15.put(0, (Scriptable)var15_15, (Object)var4_4.substring(var13_14, var13_14 + var11_13));
            var16_16 = var15_15;
        }
        var8_17 = this.re.parenCount;
        if (var8_17 == 0) {
            var3_3.parens = null;
            var5_5 /* !! */  = (int[])new SubString();
            while (true) {
                break;
            }
        } else {
            var3_3.parens = new SubString[var8_17];
            var8_17 = 0;
            var2_2 = var17_11;
            while (true) {
                var5_5 /* !! */  = (int[])var2_2;
                if (var8_17 >= this.re.parenCount) ** continue;
                var9_18 = var18_7.parensIndex(var8_17);
                if (var9_18 != -1) {
                    var3_3.parens[var8_17] = var2_2 = new SubString(var4_4, var9_18, var18_7.parensLength(var8_17));
                    var5_5 /* !! */  = (int[])var2_2;
                    if (var6_6 != 0) {
                        var9_18 = var8_17 + 1;
                        var5_5 /* !! */  = (int[])var2_2.toString();
lbl41:
                        // 2 sources

                        while (true) {
                            var16_16.put(var9_18, (Scriptable)var16_16, (Object)var5_5 /* !! */ );
                            var5_5 /* !! */  = (int[])var2_2;
                            break;
                        }
                    }
                } else {
                    var5_5 /* !! */  = (int[])var2_2;
                    if (var6_6 != 0) {
                        var9_18 = var8_17 + 1;
                        var5_5 /* !! */  = (int[])Undefined.instance;
                        ** continue;
                    }
                }
                ++var8_17;
                var2_2 = var5_5 /* !! */ ;
            }
        }
        var3_3.lastParen = var5_5 /* !! */ ;
        if (var6_6 != 0) {
            var16_16.put("index", (Scriptable)var16_16, (Object)(var18_7.skipped + var7_8));
            var16_16.put("input", (Scriptable)var16_16, (Object)var4_4);
        }
        if (var3_3.lastMatch == null) {
            var3_3.lastMatch = new SubString();
            var3_3.leftContext = new SubString();
            var3_3.rightContext = new SubString();
        }
        var2_2 = var3_3.lastMatch;
        var2_2.str = var4_4;
        var2_2.index = var13_14;
        var2_2.length = var11_13;
        var3_3.leftContext.str = var4_4;
        if (var1_1.getLanguageVersion() == 120) {
            var1_1 = var3_3.leftContext;
            var1_1.index = var7_8;
            var1_1.length = var18_7.skipped;
        } else {
            var1_1 = var3_3.leftContext;
            var1_1.index = 0;
            var1_1.length = var7_8 + var18_7.skipped;
        }
        var1_1 = var3_3.rightContext;
        var1_1.str = var4_4;
        var1_1.index = var12_12;
        var1_1.length = var10_9 - var12_12;
        return var15_15;
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 6;
        int n4 = 7;
        int n5 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1992807388: {
                if (!string.equals("lastIndex")) break;
                n5 = 7;
                break;
            }
            case 880063522: {
                if (!string.equals("ignoreCase")) break;
                n5 = 6;
                break;
            }
            case 97513095: {
                if (!string.equals("flags")) break;
                n5 = 5;
                break;
            }
            case -892259863: {
                if (!string.equals("sticky")) break;
                n5 = 4;
                break;
            }
            case -896505829: {
                if (!string.equals("source")) break;
                n5 = 3;
                break;
            }
            case -1206239059: {
                if (!string.equals("multiline")) break;
                n5 = 2;
                break;
            }
            case -1243020381: {
                if (!string.equals("global")) break;
                n5 = 1;
                break;
            }
            case -1326019688: {
                if (!string.equals("dotAll")) break;
                n5 = 0;
            }
        }
        switch (n5) {
            default: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 1;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 1: {
                n3 = 4;
                break;
            }
            case 0: {
                n3 = 7;
            }
            case 2: 
        }
        if (n3 == 0) {
            return super.findInstanceIdInfo(string);
        }
        n5 = n4;
        switch (n3) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                n5 = this.lastIndexAttr;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        return IdScriptableObject.instanceIdInfo(n5, n3);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 5;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 950491699: {
                if (!string.equals("compile")) break;
                n4 = 5;
                break;
            }
            case 3556498: {
                if (!string.equals("test")) break;
                n4 = 4;
                break;
            }
            case 3127441: {
                if (!string.equals("exec")) break;
                n4 = 3;
                break;
            }
            case -980110702: {
                if (!string.equals("prefix")) break;
                n4 = 2;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 1;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 5: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 6;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 4: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.MATCH.equals(symbol)) {
            return 7;
        }
        if (SymbolKey.SEARCH.equals(symbol)) {
            return 8;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "RegExp";
    }

    int getFlags() {
        return this.re.flags;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        switch (n2) {
            default: {
                return super.getInstanceIdName(n2);
            }
            case 8: {
                return "sticky";
            }
            case 7: {
                return "dotAll";
            }
            case 6: {
                return "multiline";
            }
            case 5: {
                return "ignoreCase";
            }
            case 4: {
                return "global";
            }
            case 3: {
                return "flags";
            }
            case 2: {
                return "source";
            }
            case 1: 
        }
        return "lastIndex";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        switch (n2) {
            default: {
                return super.getInstanceIdValue(n2);
            }
            case 8: {
                bl4 = bl5;
                if ((this.re.flags & 0x10) != 0) {
                    bl4 = true;
                }
                return ScriptRuntime.wrapBoolean(bl4);
            }
            case 7: {
                bl4 = bl;
                if ((this.re.flags & 8) != 0) {
                    bl4 = true;
                }
                return ScriptRuntime.wrapBoolean(bl4);
            }
            case 6: {
                bl4 = bl2;
                if ((this.re.flags & 4) != 0) {
                    bl4 = true;
                }
                return ScriptRuntime.wrapBoolean(bl4);
            }
            case 5: {
                bl4 = bl3;
                if ((this.re.flags & 2) != 0) {
                    bl4 = true;
                }
                return ScriptRuntime.wrapBoolean(bl4);
            }
            case 4: {
                if ((this.re.flags & 1) != 0) {
                    bl4 = true;
                }
                return ScriptRuntime.wrapBoolean(bl4);
            }
            case 3: {
                StringBuilder stringBuilder = new StringBuilder();
                this.appendFlags(stringBuilder);
                return stringBuilder.toString();
            }
            case 2: {
                return new String(this.re.source);
            }
            case 1: 
        }
        return this.lastIndex;
    }

    @Override
    protected int getMaxInstanceId() {
        return 8;
    }

    @Override
    public String getTypeOf() {
        return "object";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block10: {
            if (var1_1 == 7) {
                this.initPrototypeMethod(NativeRegExp.REGEXP_TAG, var1_1, SymbolKey.MATCH, "[Symbol.match]", 1);
                return;
            }
            if (var1_1 == 8) {
                this.initPrototypeMethod(NativeRegExp.REGEXP_TAG, var1_1, SymbolKey.SEARCH, "[Symbol.search]", 1);
                return;
            }
            var2_2 = 1;
            switch (var1_1) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(var1_1));
                }
                case 6: {
                    var3_3 = "prefix";
                    break block10;
                }
                case 5: {
                    var3_3 = "test";
                    break block10;
                }
                case 4: {
                    var3_3 = "exec";
                    break block10;
                }
                case 3: {
                    var3_3 = "toSource";
                    ** GOTO lbl27
                }
                case 2: {
                    var3_3 = "toString";
lbl27:
                    // 2 sources

                    var2_2 = 0;
                    break block10;
                }
                case 1: 
            }
            var3_3 = "compile";
            var2_2 = 2;
        }
        this.initPrototypeMethod(NativeRegExp.REGEXP_TAG, var1_1, var3_3, var2_2);
    }

    @Override
    protected void setInstanceIdAttributes(int n2, int n3) {
        if (n2 != 1) {
            super.setInstanceIdAttributes(n2, n3);
            return;
        }
        this.lastIndexAttr = n3;
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        switch (n2) {
            default: {
                super.setInstanceIdValue(n2, object);
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return;
            }
            case 1: 
        }
        this.setLastIndex(object);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        char[] cArray = this.re.source;
        if (cArray.length != 0) {
            stringBuilder.append(cArray);
        } else {
            stringBuilder.append("(?:)");
        }
        stringBuilder.append('/');
        this.appendFlags(stringBuilder);
        return stringBuilder.toString();
    }
}

