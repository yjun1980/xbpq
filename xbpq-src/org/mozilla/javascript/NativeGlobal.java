/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.TopLevel$NativeErrors;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLLib;

public class NativeGlobal
implements Serializable,
IdFunctionCall {
    private static final Object FTAG = "Global";
    private static final int INVALID_UTF8 = Integer.MAX_VALUE;
    private static final int Id_decodeURI = 1;
    private static final int Id_decodeURIComponent = 2;
    private static final int Id_encodeURI = 3;
    private static final int Id_encodeURIComponent = 4;
    private static final int Id_escape = 5;
    private static final int Id_eval = 6;
    private static final int Id_isFinite = 7;
    private static final int Id_isNaN = 8;
    private static final int Id_isXMLName = 9;
    private static final int Id_new_CommonError = 14;
    private static final int Id_parseFloat = 10;
    private static final int Id_parseInt = 11;
    private static final int Id_unescape = 12;
    private static final int Id_uneval = 13;
    private static final int LAST_SCOPE_FUNCTION_ID = 13;
    private static final String URI_DECODE_RESERVED = ";/?:@&=+$,#";
    static final long serialVersionUID = 6080442165748707530L;

    @Deprecated
    public static EcmaError constructError(Context context, String string, String string2, Scriptable scriptable) {
        return ScriptRuntime.constructError(string, string2);
    }

    @Deprecated
    public static EcmaError constructError(Context context, String string, String string2, Scriptable scriptable, String string3, int n2, int n3, String string4) {
        return ScriptRuntime.constructError(string, string2, string3, n2, string4, n3);
    }

    /*
     * Unable to fully structure code
     */
    private static String decode(String var0, boolean var1_1) {
        var13_2 = var0;
        var12_3 = var0.length();
        var14_4 = null;
        var5_5 = 0;
        var4_6 = 0;
        while (var5_5 != var12_3) {
            block19: {
                block20: {
                    block21: {
                        block27: {
                            block28: {
                                block18: {
                                    block31: {
                                        block29: {
                                            block30: {
                                                block23: {
                                                    block26: {
                                                        block25: {
                                                            block24: {
                                                                block22: {
                                                                    var2_7 = var13_2.charAt(var5_5);
                                                                    if (var2_7 != '%') {
                                                                        var6_9 = var4_6;
                                                                        if (var14_4 != null) {
                                                                            var14_4[var4_6] = var2_7;
                                                                            var6_9 = var4_6 + 1;
                                                                        }
                                                                        ++var5_5;
                                                                        var4_6 = var6_9;
                                                                        continue;
                                                                    }
                                                                    var0 = var14_4;
                                                                    var8_11 = var4_6;
                                                                    if (var14_4 == null) {
                                                                        var0 = new char[var12_3];
                                                                        var13_2.getChars(0, var5_5, (char[])var0, 0);
                                                                        var8_11 = var5_5;
                                                                    }
                                                                    if ((var10_13 = var5_5 + 3) > var12_3) break block19;
                                                                    var9_12 = NativeGlobal.unHex(var13_2.charAt(var5_5 + 1), var13_2.charAt(var5_5 + 2));
                                                                    if (var9_12 < 0) break block20;
                                                                    if ((var9_12 & 128) == 0) {
                                                                        var7_10 = var10_13;
                                                                        while (true) {
                                                                            var2_7 = (char)var9_12;
                                                                            var6_9 = var8_11;
                                                                            var4_6 = var7_10;
                                                                            break block18;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if ((var9_12 & 192) == 128) break block21;
                                                                    if ((var9_12 & 32) != 0) break block22;
                                                                    var4_6 = var9_12 & 31;
                                                                    var6_9 = 1;
                                                                    var7_10 = 128;
                                                                    break block23;
                                                                }
                                                                if ((var9_12 & 16) != 0) break block24;
                                                                var4_6 = var9_12 & 15;
                                                                var6_9 = 2;
                                                                var7_10 = 2048;
                                                                break block23;
                                                            }
                                                            if ((var9_12 & 8) != 0) break block25;
                                                            var4_6 = var9_12 & 7;
                                                            var6_9 = 3;
                                                            var7_10 = 65536;
                                                            break block23;
                                                        }
                                                        if ((var9_12 & 4) != 0) break block26;
                                                        var4_6 = var9_12 & 3;
                                                        var6_9 = 4;
                                                        var7_10 = 0x200000;
                                                        break block23;
                                                    }
                                                    if ((var9_12 & 2) != 0) break block27;
                                                    var6_9 = 5;
                                                    var4_6 = var9_12 & 1;
                                                    var7_10 = 0x4000000;
                                                }
                                                if (var6_9 * 3 + var10_13 > var12_3) break block28;
                                                var9_12 = var4_6;
                                                var4_6 = var10_13;
                                                for (var11_14 = 0; var11_14 != var6_9; ++var11_14) {
                                                    if (var13_2.charAt(var4_6) == '%') {
                                                        var10_13 = NativeGlobal.unHex(var13_2.charAt(var4_6 + 1), var13_2.charAt(var4_6 + 2));
                                                        if (var10_13 >= 0 && (var10_13 & 192) == 128) {
                                                            var9_12 = var9_12 << 6 | var10_13 & 63;
                                                            var4_6 += 3;
                                                            continue;
                                                        }
                                                        throw NativeGlobal.uriError();
                                                    }
                                                    throw NativeGlobal.uriError();
                                                }
                                                if (var9_12 < var7_10 || var9_12 >= 55296 && var9_12 <= 57343) break block29;
                                                if (var9_12 == 65534) break block30;
                                                var6_9 = var9_12;
                                                if (var9_12 != 65535) break block31;
                                            }
                                            var6_9 = 65533;
                                            break block31;
                                        }
                                        var6_9 = 0x7FFFFFFF;
                                    }
                                    var7_10 = var4_6;
                                    var9_12 = var6_9;
                                    if (var6_9 < 65536) ** continue;
                                    if ((var6_9 -= 65536) <= 1048575) {
                                        var3_8 = (char)((var6_9 >>> 10) + 55296);
                                        var2_7 = (char)((var6_9 & 1023) + 56320);
                                        var0[var8_11] = var3_8;
                                        var6_9 = var8_11 + 1;
                                    } else {
                                        throw NativeGlobal.uriError();
                                    }
                                }
                                if (var1_1 && ";/?:@&=+$,#".indexOf(var2_7) >= 0) {
                                    while (true) {
                                        var7_10 = ++var6_9;
                                        if (var5_5 != var4_6) {
                                            var0[var6_9] = var13_2.charAt(var5_5);
                                            ++var5_5;
                                            continue;
                                        }
                                        break;
                                    }
                                } else {
                                    var0[var6_9] = var2_7;
                                    var7_10 = var6_9 + 1;
                                }
                                var14_4 = var0;
                                var5_5 = var4_6;
                                var4_6 = var7_10;
                                continue;
                            }
                            throw NativeGlobal.uriError();
                        }
                        throw NativeGlobal.uriError();
                    }
                    throw NativeGlobal.uriError();
                }
                throw NativeGlobal.uriError();
            }
            throw NativeGlobal.uriError();
        }
        if (var14_4 != null) {
            var13_2 = new String((char[])var14_4, 0, var4_6);
        }
        return var13_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String encode(String string, boolean bl) {
        int n2 = string.length();
        StringBuilder stringBuilder = null;
        byte[] byArray = null;
        int n3 = 0;
        while (n3 != n2) {
            int n4;
            byte[] byArray2;
            StringBuilder stringBuilder2;
            char c2 = string.charAt(n3);
            if (NativeGlobal.encodeUnescaped(c2, bl)) {
                stringBuilder2 = stringBuilder;
                byArray2 = byArray;
                n4 = n3;
                if (stringBuilder != null) {
                    stringBuilder.append(c2);
                    stringBuilder2 = stringBuilder;
                    byArray2 = byArray;
                    n4 = n3;
                }
            } else {
                StringBuilder stringBuilder3 = stringBuilder;
                if (stringBuilder == null) {
                    stringBuilder3 = new StringBuilder(n2 + 3);
                    stringBuilder3.append(string);
                    stringBuilder3.setLength(n3);
                    byArray = new byte[6];
                }
                if ('\udc00' <= c2) {
                    if (c2 <= '\udfff') throw NativeGlobal.uriError();
                }
                int n5 = n3;
                n4 = c2;
                if (c2 >= '\ud800') {
                    if ('\udbff' < c2) {
                        n5 = n3;
                        n4 = c2;
                    } else {
                        n5 = n3 + 1;
                        if (n5 == n2) throw NativeGlobal.uriError();
                        n3 = string.charAt(n5);
                        if (56320 > n3) throw NativeGlobal.uriError();
                        if (n3 > 57343) throw NativeGlobal.uriError();
                        n4 = n3 = 65536 + (n3 - 56320 + (c2 - 55296 << 10));
                    }
                }
                int n6 = NativeGlobal.oneUcs4ToUtf8Char(byArray, n4);
                n3 = 0;
                while (true) {
                    stringBuilder2 = stringBuilder3;
                    byArray2 = byArray;
                    n4 = n5;
                    if (n3 >= n6) break;
                    n4 = byArray[n3] & 0xFF;
                    stringBuilder3.append('%');
                    stringBuilder3.append(NativeGlobal.toHexChar(n4 >>> 4));
                    stringBuilder3.append(NativeGlobal.toHexChar(n4 & 0xF));
                    ++n3;
                }
            }
            n3 = n4 + 1;
            stringBuilder = stringBuilder2;
            byArray = byArray2;
        }
        if (stringBuilder != null) return stringBuilder.toString();
        return string;
    }

    private static boolean encodeUnescaped(char c2, boolean bl) {
        boolean bl2 = true;
        if ('A' <= c2 && c2 <= 'Z' || 'a' <= c2 && c2 <= 'z' || '0' <= c2 && c2 <= '9') {
            return true;
        }
        if ("-_.!~*'()".indexOf(c2) >= 0) {
            return true;
        }
        if (bl) {
            bl = URI_DECODE_RESERVED.indexOf(c2) >= 0 ? bl2 : false;
            return bl;
        }
        return false;
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        Object object;
        NativeGlobal nativeGlobal = new NativeGlobal();
        for (int i2 = 1; i2 <= 13; ++i2) {
            int n2;
            block19: {
                switch (i2) {
                    default: {
                        throw Kit.codeBug();
                    }
                    case 13: {
                        object = "uneval";
                        break;
                    }
                    case 12: {
                        object = "unescape";
                        break;
                    }
                    case 11: {
                        object = "parseInt";
                        n2 = 2;
                        break block19;
                    }
                    case 10: {
                        object = "parseFloat";
                        break;
                    }
                    case 9: {
                        object = "isXMLName";
                        break;
                    }
                    case 8: {
                        object = "isNaN";
                        break;
                    }
                    case 7: {
                        object = "isFinite";
                        break;
                    }
                    case 6: {
                        object = "eval";
                        break;
                    }
                    case 5: {
                        object = "escape";
                        break;
                    }
                    case 4: {
                        object = "encodeURIComponent";
                        break;
                    }
                    case 3: {
                        object = "encodeURI";
                        break;
                    }
                    case 2: {
                        object = "decodeURIComponent";
                        break;
                    }
                    case 1: {
                        object = "decodeURI";
                    }
                }
                n2 = 1;
            }
            object = new IdFunctionObject(nativeGlobal, FTAG, i2, (String)object, n2, scriptable);
            if (bl) {
                ((ScriptableObject)object).sealObject();
            }
            ((IdFunctionObject)object).exportAsScopeProperty();
        }
        ScriptableObject.defineProperty(scriptable, "NaN", ScriptRuntime.NaNobj, 7);
        ScriptableObject.defineProperty(scriptable, "Infinity", ScriptRuntime.wrapNumber(Double.POSITIVE_INFINITY), 7);
        ScriptableObject.defineProperty(scriptable, "undefined", Undefined.instance, 7);
        ScriptableObject.defineProperty(scriptable, "globalThis", scriptable, 2);
        object = ScriptableObject.ensureScriptable(ScriptableObject.getProperty(scriptable, "Error"));
        Scriptable scriptable2 = ScriptableObject.ensureScriptable(ScriptableObject.getProperty((Scriptable)object, "prototype"));
        for (Object object2 : TopLevel$NativeErrors.values()) {
            if (object2 == TopLevel$NativeErrors.Error) continue;
            Object object3 = object2.name();
            object2 = (ScriptableObject)ScriptRuntime.newBuiltinObject(context, scriptable, TopLevel$Builtins.Error, ScriptRuntime.emptyArgs);
            ((ScriptableObject)object2).defineProperty("name", object3, 2);
            ((ScriptableObject)object2).defineProperty("message", "", 2);
            object3 = new IdFunctionObject(nativeGlobal, FTAG, 14, (String)object3, 1, scriptable);
            ((IdFunctionObject)object3).markAsConstructor((Scriptable)object2);
            ((ScriptableObject)object3).setPrototype((Scriptable)object);
            ((ScriptableObject)object2).put("constructor", (Scriptable)object2, object3);
            ((ScriptableObject)object2).setAttributes("constructor", 2);
            ((ScriptableObject)object2).setPrototype(scriptable2);
            if (bl) {
                ((ScriptableObject)object2).sealObject();
                ((ScriptableObject)object3).sealObject();
            }
            ((IdScriptableObject)object3).setAttributes("name", 3);
            ((IdScriptableObject)object3).setAttributes("length", 3);
            ((IdFunctionObject)object3).exportAsScopeProperty();
        }
    }

    static boolean isEvalFunction(Object object) {
        return object instanceof IdFunctionObject && ((IdFunctionObject)(object = (IdFunctionObject)object)).hasTag(FTAG) && ((IdFunctionObject)object).methodId() == 6;
    }

    private static Object js_escape(Object[] object) {
        int n2;
        int n3 = 0;
        String string = ScriptRuntime.toString((Object[])object, 0);
        if (((Object[])object).length > 1) {
            double d2 = ScriptRuntime.toNumber(object[1]);
            if (Double.isNaN(d2) || (double)(n2 = (int)d2) != d2 || (n2 & 0xFFFFFFF8) != 0) {
                throw Context.reportRuntimeErrorById("msg.bad.esc.mask", new Object[0]);
            }
        } else {
            n2 = 7;
        }
        object = null;
        int n4 = string.length();
        while (n3 != n4) {
            Object object2;
            block8: {
                int n5;
                Object object3;
                char c2;
                block11: {
                    block9: {
                        block10: {
                            block7: {
                                c2 = string.charAt(n3);
                                if (n2 == 0 || !(c2 >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' || c2 == '@' || c2 == '*' || c2 == '_' || c2 == '-' || c2 == '.') && ((n2 & 4) == 0 || c2 != '/' && c2 != '+')) break block7;
                                object2 = object;
                                if (object != null) {
                                    ((StringBuilder)object).append(c2);
                                    object2 = object;
                                }
                                break block8;
                            }
                            object3 = object;
                            if (object == null) {
                                object3 = new StringBuilder(n4 + 3);
                                ((StringBuilder)object3).append(string);
                                ((StringBuilder)object3).setLength(n3);
                            }
                            n5 = 2;
                            if (c2 >= '\u0100') break block9;
                            if (c2 != ' ' || n2 != 2) break block10;
                            ((StringBuilder)object3).append('+');
                            object2 = object3;
                            break block8;
                        }
                        ((StringBuilder)object3).append('%');
                        break block11;
                    }
                    ((StringBuilder)object3).append('%');
                    ((StringBuilder)object3).append('u');
                    n5 = 4;
                }
                n5 = (n5 - 1) * 4;
                while (true) {
                    object2 = object3;
                    if (n5 < 0) break;
                    int n6 = c2 >> n5 & 0xF;
                    n6 = n6 < 10 ? (n6 += 48) : (n6 += 55);
                    ((StringBuilder)object3).append((char)n6);
                    n5 -= 4;
                }
            }
            ++n3;
            object = object2;
        }
        object = object == null ? string : ((StringBuilder)object).toString();
        return object;
    }

    private static Object js_eval(Context context, Scriptable scriptable, Object[] objectArray) {
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        return ScriptRuntime.evalSpecial(context, scriptable, scriptable, objectArray, "eval code", 1);
    }

    static Object js_parseFloat(Object[] object) {
        if (((Object[])object).length < 1) {
            return ScriptRuntime.NaNobj;
        }
        int n2 = 0;
        object = ScriptRuntime.toString(object[0]);
        int n3 = ((String)object).length();
        int n4 = 0;
        while (true) {
            block20: {
                int n5;
                int n6;
                if (n4 == n3) {
                    return ScriptRuntime.NaNobj;
                }
                int n7 = ((String)object).charAt(n4);
                if (ScriptRuntime.isStrWhiteSpaceChar(n7)) break block20;
                if (n7 != 43 && n7 != 45) {
                    n6 = n4;
                } else {
                    n6 = n4 + 1;
                    if (n6 == n3) {
                        return ScriptRuntime.NaNobj;
                    }
                    n7 = ((String)object).charAt(n6);
                }
                if (n7 == 73) {
                    if (n6 + 8 <= n3 && ((String)object).regionMatches(n6, "Infinity", 0, 8)) {
                        double d2 = ((String)object).charAt(n4) == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                        return ScriptRuntime.wrapNumber(d2);
                    }
                    return ScriptRuntime.NaNobj;
                }
                n7 = -1;
                int n8 = -1;
                block6: while (true) {
                    int n9;
                    int n10;
                    block24: {
                        block21: {
                            block22: {
                                block23: {
                                    n5 = n6;
                                    if (n6 >= n3) break;
                                    n5 = ((String)object).charAt(n6);
                                    if (n5 == 43) break block21;
                                    if (n5 == 69 || n5 == 101) break block22;
                                    if (n5 == 45) break block21;
                                    if (n5 == 46) break block23;
                                    switch (n5) {
                                        default: {
                                            n5 = n6;
                                            break block6;
                                        }
                                        case 48: 
                                        case 49: 
                                        case 50: 
                                        case 51: 
                                        case 52: 
                                        case 53: 
                                        case 54: 
                                        case 55: 
                                        case 56: 
                                        case 57: {
                                            n5 = n2;
                                            n10 = n7;
                                            n9 = n8;
                                            if (n7 == -1) break block24;
                                            n5 = 1;
                                            n10 = n7;
                                            n9 = n8;
                                            break;
                                        }
                                    }
                                    break block24;
                                }
                                if (n8 != -1) {
                                    n5 = n6;
                                    break;
                                }
                                n9 = n6;
                                n5 = n2;
                                n10 = n7;
                                break block24;
                            }
                            if (n7 != -1) {
                                n5 = n6;
                                break;
                            }
                            if (n6 == n3 - 1) {
                                n5 = n6;
                                break;
                            }
                            n10 = n6;
                            n5 = n2;
                            n9 = n8;
                            break block24;
                        }
                        if (n7 != n6 - 1) {
                            n5 = n6;
                            break;
                        }
                        n5 = n2;
                        n10 = n7;
                        n9 = n8;
                        if (n6 == n3 - 1) {
                            n5 = n6 - 1;
                            break;
                        }
                    }
                    ++n6;
                    n2 = n5;
                    n7 = n10;
                    n8 = n9;
                }
                if (n7 == -1 || n2 != 0) {
                    n7 = n5;
                }
                object = ((String)object).substring(n4, n7);
                try {
                    object = Double.valueOf((String)object);
                    return object;
                }
                catch (NumberFormatException numberFormatException) {
                    return ScriptRuntime.NaNobj;
                }
            }
            ++n4;
        }
    }

    static Object js_parseInt(Context context, Object[] objectArray) {
        block16: {
            double d2;
            int n2;
            int n3;
            String string;
            int n4;
            block18: {
                block19: {
                    int n5;
                    block20: {
                        int n6;
                        int n7;
                        block15: {
                            int n8;
                            block17: {
                                block14: {
                                    block13: {
                                        block12: {
                                            n4 = 0;
                                            n7 = 0;
                                            string = ScriptRuntime.toString(objectArray, 0);
                                            n8 = ScriptRuntime.toInt32(objectArray, 1);
                                            n6 = string.length();
                                            if (n6 == 0) {
                                                return ScriptRuntime.NaNobj;
                                            }
                                            n3 = 0;
                                            while (ScriptRuntime.isStrWhiteSpaceChar(n5 = string.charAt(n3))) {
                                                n3 = n2 = n3 + 1;
                                                if (n2 < n6) continue;
                                                n3 = n2;
                                                break;
                                            }
                                            n2 = n4;
                                            if (n5 == 43) break block12;
                                            n2 = n7;
                                            if (n5 == 45) {
                                                n2 = 1;
                                            }
                                            n4 = n2;
                                            n7 = n3;
                                            if (n2 == 0) break block13;
                                        }
                                        n7 = n3 + 1;
                                        n4 = n2;
                                    }
                                    n5 = 16;
                                    if (n8 != 0) break block14;
                                    n2 = -1;
                                    n3 = n7;
                                    break block15;
                                }
                                if (n8 < 2 || n8 > 36) break block16;
                                n3 = n7;
                                n2 = n8;
                                if (n8 != 16) break block15;
                                n3 = n7;
                                n2 = n8;
                                if (n6 - n7 <= 1) break block15;
                                n3 = n7;
                                n2 = n8;
                                if (string.charAt(n7) != '0') break block15;
                                char c2 = string.charAt(n7 + 1);
                                if (c2 == 'x') break block17;
                                n3 = n7;
                                n2 = n8;
                                if (c2 != 'X') break block15;
                            }
                            n3 = n7 + 2;
                            n2 = n8;
                        }
                        if (n2 != -1) break block18;
                        if (n6 - n3 <= 1 || string.charAt(n3) != '0') break block19;
                        n2 = n3 + 1;
                        n7 = string.charAt(n2);
                        if (n7 == 120 || n7 == 88) break block20;
                        if (48 > n7 || n7 > 57 || context != null && context.getLanguageVersion() >= 150) break block19;
                        n7 = 8;
                        n3 = n2;
                        n2 = n7;
                        break block18;
                    }
                    n3 += 2;
                    n2 = n5;
                    break block18;
                }
                n2 = 10;
            }
            double d3 = d2 = ScriptRuntime.stringPrefixToNumber(string, n3, n2);
            if (n4 != 0) {
                d3 = -d2;
            }
            return ScriptRuntime.wrapNumber(d3);
        }
        return ScriptRuntime.NaNobj;
    }

    private static Object js_unescape(Object[] object) {
        String string = ScriptRuntime.toString(object, 0);
        int n2 = string.indexOf(37);
        object = string;
        if (n2 >= 0) {
            int n3 = string.length();
            object = string.toCharArray();
            int n4 = n2;
            while (n2 != n3) {
                int n5;
                Object object2 = object[n2];
                int n6 = n5 = n2 + 1;
                Object object3 = object2;
                if (object2 == 37) {
                    n6 = n5;
                    object3 = object2;
                    if (n5 != n3) {
                        int n7;
                        if (object[n5] == 117) {
                            n7 = n5 + 1;
                            n2 = n5 + 5;
                        } else {
                            n2 = n5 + 2;
                            n7 = n5;
                        }
                        n6 = n5;
                        object3 = object2;
                        if (n2 <= n3) {
                            int n8 = 0;
                            while (n7 != n2) {
                                n8 = Kit.xDigitToInt((int)object[n7], n8);
                                ++n7;
                            }
                            n6 = n5;
                            object3 = object2;
                            if (n8 >= 0) {
                                object3 = (char)n8;
                                n6 = n2;
                            }
                        }
                    }
                }
                object[n4] = object3;
                ++n4;
                n2 = n6;
            }
            object = new String((char[])object, 0, n4);
        }
        return object;
    }

    private static int oneUcs4ToUtf8Char(byte[] byArray, int n2) {
        int n3 = 1;
        if ((n2 & 0xFFFFFF80) == 0) {
            byArray[0] = (byte)n2;
        } else {
            int n4 = n2 >>> 11;
            n3 = 2;
            while (n4 != 0) {
                n4 >>>= 5;
                ++n3;
            }
            n4 = n3;
            while (--n4 > 0) {
                byArray[n4] = (byte)(n2 & 0x3F | 0x80);
                n2 >>>= 6;
            }
            byArray[0] = (byte)(256 - (1 << 8 - n3) + n2);
        }
        return n3;
    }

    private static char toHexChar(int n2) {
        if (n2 >> 4 != 0) {
            Kit.codeBug();
        }
        n2 = n2 < 10 ? (n2 += 48) : n2 - 10 + 65;
        return (char)n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int unHex(char c2) {
        int n2 = 65;
        if ('A' <= c2 && c2 <= 'F') {
            return c2 - n2 + 10;
        }
        n2 = 97;
        if ('a' <= c2 && c2 <= 'f') {
            return c2 - n2 + 10;
        }
        if ('0' > c2) return -1;
        if (c2 > '9') return -1;
        return c2 - 48;
    }

    private static int unHex(char c2, char c3) {
        int n2 = NativeGlobal.unHex(c2);
        int n3 = NativeGlobal.unHex(c3);
        if (n2 >= 0 && n3 >= 0) {
            return n2 << 4 | n3;
        }
        return -1;
    }

    private static EcmaError uriError() {
        return ScriptRuntime.constructError("URIError", ScriptRuntime.getMessageById("msg.bad.uri", new Object[0]));
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (((IdFunctionObject)object).hasTag(FTAG)) {
            int n2 = ((IdFunctionObject)object).methodId();
            boolean bl = true;
            boolean bl2 = true;
            boolean bl3 = true;
            switch (n2) {
                default: {
                    break;
                }
                case 14: {
                    return NativeError.make(context, scriptable, (IdFunctionObject)object, objectArray);
                }
                case 13: {
                    object = objectArray.length != 0 ? objectArray[0] : Undefined.instance;
                    return ScriptRuntime.uneval(context, scriptable, object);
                }
                case 12: {
                    return NativeGlobal.js_unescape(objectArray);
                }
                case 11: {
                    return NativeGlobal.js_parseInt(context, objectArray);
                }
                case 10: {
                    return NativeGlobal.js_parseFloat(objectArray);
                }
                case 9: {
                    object = objectArray.length == 0 ? Undefined.instance : objectArray[0];
                    return ScriptRuntime.wrapBoolean(XMLLib.extractFromScope(scriptable).isXMLName(context, object));
                }
                case 8: {
                    bl = objectArray.length < 1 ? bl3 : Double.isNaN(ScriptRuntime.toNumber(objectArray[0]));
                    return ScriptRuntime.wrapBoolean(bl);
                }
                case 7: {
                    if (objectArray.length < 1) {
                        return Boolean.FALSE;
                    }
                    return NativeNumber.isFinite(objectArray[0]);
                }
                case 6: {
                    return NativeGlobal.js_eval(context, scriptable, objectArray);
                }
                case 5: {
                    return NativeGlobal.js_escape(objectArray);
                }
                case 3: 
                case 4: {
                    object = ScriptRuntime.toString(objectArray, 0);
                    if (n2 != 3) {
                        bl = false;
                    }
                    return NativeGlobal.encode((String)object, bl);
                }
                case 1: 
                case 2: {
                    object = ScriptRuntime.toString(objectArray, 0);
                    bl = n2 == 1 ? bl2 : false;
                    return NativeGlobal.decode((String)object, bl);
                }
            }
        }
        throw ((IdFunctionObject)object).unknown();
    }
}

