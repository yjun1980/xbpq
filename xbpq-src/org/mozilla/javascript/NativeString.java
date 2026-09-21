/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;

final class NativeString
extends IdScriptableObject {
    private static final int ConstructorId_charAt = -5;
    private static final int ConstructorId_charCodeAt = -6;
    private static final int ConstructorId_concat = -14;
    private static final int ConstructorId_equalsIgnoreCase = -30;
    private static final int ConstructorId_fromCharCode = -1;
    private static final int ConstructorId_fromCodePoint = -2;
    private static final int ConstructorId_indexOf = -7;
    private static final int ConstructorId_lastIndexOf = -8;
    private static final int ConstructorId_localeCompare = -35;
    private static final int ConstructorId_match = -31;
    private static final int ConstructorId_raw = -3;
    private static final int ConstructorId_replace = -33;
    private static final int ConstructorId_replaceAll = -34;
    private static final int ConstructorId_search = -32;
    private static final int ConstructorId_slice = -15;
    private static final int ConstructorId_split = -9;
    private static final int ConstructorId_substr = -13;
    private static final int ConstructorId_substring = -10;
    private static final int ConstructorId_toLocaleLowerCase = -36;
    private static final int ConstructorId_toLowerCase = -11;
    private static final int ConstructorId_toUpperCase = -12;
    private static final int Id_anchor = 28;
    private static final int Id_at = 52;
    private static final int Id_big = 21;
    private static final int Id_blink = 22;
    private static final int Id_bold = 16;
    private static final int Id_charAt = 5;
    private static final int Id_charCodeAt = 6;
    private static final int Id_codePointAt = 46;
    private static final int Id_concat = 14;
    private static final int Id_constructor = 1;
    private static final int Id_endsWith = 43;
    private static final int Id_equals = 29;
    private static final int Id_equalsIgnoreCase = 30;
    private static final int Id_fixed = 18;
    private static final int Id_fontcolor = 26;
    private static final int Id_fontsize = 25;
    private static final int Id_includes = 41;
    private static final int Id_indexOf = 7;
    private static final int Id_italics = 17;
    private static final int Id_lastIndexOf = 8;
    private static final int Id_length = 1;
    private static final int Id_link = 27;
    private static final int Id_localeCompare = 35;
    private static final int Id_match = 31;
    private static final int Id_normalize = 44;
    private static final int Id_padEnd = 48;
    private static final int Id_padStart = 47;
    private static final int Id_repeat = 45;
    private static final int Id_replace = 33;
    private static final int Id_replaceAll = 34;
    private static final int Id_search = 32;
    private static final int Id_slice = 15;
    private static final int Id_small = 20;
    private static final int Id_split = 9;
    private static final int Id_startsWith = 42;
    private static final int Id_strike = 19;
    private static final int Id_sub = 24;
    private static final int Id_substr = 13;
    private static final int Id_substring = 10;
    private static final int Id_sup = 23;
    private static final int Id_toLocaleLowerCase = 36;
    private static final int Id_toLocaleUpperCase = 37;
    private static final int Id_toLowerCase = 11;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_toUpperCase = 12;
    private static final int Id_trim = 38;
    private static final int Id_trimEnd = 51;
    private static final int Id_trimLeft = 39;
    private static final int Id_trimRight = 40;
    private static final int Id_trimStart = 50;
    private static final int Id_valueOf = 4;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PROTOTYPE_ID = 52;
    private static final Object STRING_TAG = "String";
    private static final int SymbolId_iterator = 49;
    private static final long serialVersionUID = 920268368584188687L;
    private CharSequence string;

    NativeString(CharSequence charSequence) {
        this.string = charSequence;
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object object) {
        Scriptable scriptable;
        Scriptable scriptable2 = scriptable = this.getParentScope();
        if (scriptable == null) {
            scriptable2 = this;
        }
        scriptable = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent((ScriptableObject)scriptable, scriptable2, TopLevel$Builtins.Object);
        ((ScriptableObject)scriptable).defineProperty("value", object, 0);
        object = Boolean.FALSE;
        ((ScriptableObject)scriptable).defineProperty("writable", object, 0);
        ((ScriptableObject)scriptable).defineProperty("enumerable", Boolean.TRUE, 0);
        ((ScriptableObject)scriptable).defineProperty("configurable", object, 0);
        return scriptable;
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeString("").exportAsJSClass(52, scriptable, bl);
    }

    private static String js_concat(String string, Object[] object) {
        int n2;
        int n3 = ((Object[])object).length;
        if (n3 == 0) {
            return string;
        }
        int n4 = 0;
        if (n3 == 1) {
            return string.concat(ScriptRuntime.toString(object[0]));
        }
        int n5 = string.length();
        String[] stringArray = new String[n3];
        for (n2 = 0; n2 != n3; ++n2) {
            String string2;
            stringArray[n2] = string2 = ScriptRuntime.toString(object[n2]);
            n5 += string2.length();
        }
        object = new StringBuilder(n5);
        ((StringBuilder)object).append(string);
        for (n2 = n4; n2 != n3; ++n2) {
            ((StringBuilder)object).append(stringArray[n2]);
        }
        return ((StringBuilder)object).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int js_indexOf(int n2, String string, Object[] objectArray) {
        double d2;
        String string2;
        int n3;
        block12: {
            double d3;
            int n4;
            block14: {
                block13: {
                    block10: {
                        block11: {
                            block9: {
                                n3 = 0;
                                n4 = 0;
                                string2 = ScriptRuntime.toString(objectArray, 0);
                                d3 = ScriptRuntime.toInteger(objectArray, 1);
                                if (n2 != 42 && n2 != 43 && string2.length() == 0) {
                                    if (!(d3 > (double)string.length())) return (int)d3;
                                    return string.length();
                                }
                                if (n2 != 42 && n2 != 43 && d3 > (double)string.length()) {
                                    return -1;
                                }
                                if (!(d3 < 0.0)) break block9;
                                d2 = 0.0;
                                break block10;
                            }
                            if (d3 > (double)string.length()) break block11;
                            d2 = d3;
                            if (n2 != 43) break block10;
                            if (Double.isNaN(d3)) break block11;
                            d2 = d3;
                            if (!(d3 > (double)string.length())) break block10;
                        }
                        d2 = string.length();
                    }
                    if (43 != n2) break block12;
                    if (objectArray.length == 0 || objectArray.length == 1) break block13;
                    d3 = d2;
                    if (objectArray.length != 2) break block14;
                    d3 = d2;
                    if (objectArray[1] != Undefined.instance) break block14;
                }
                d3 = string.length();
            }
            if (!string.substring(0, (int)d3).endsWith(string2)) return -1;
            return n4;
        }
        if (n2 != 42) {
            return string.indexOf(string2, (int)d2);
        }
        if (!string.startsWith(string2, (int)d2)) return -1;
        return n3;
    }

    private static int js_lastIndexOf(String string, Object[] objectArray) {
        double d2;
        String string2 = ScriptRuntime.toString(objectArray, 0);
        double d3 = ScriptRuntime.toNumber(objectArray, 1);
        if (!Double.isNaN(d3) && !(d3 > (double)string.length())) {
            d2 = d3;
            if (d3 < 0.0) {
                d2 = 0.0;
            }
        } else {
            d2 = string.length();
        }
        return string.lastIndexOf(string2, (int)d2);
    }

    private static String js_pad(Context object, Scriptable object2, IdFunctionObject object3, Object[] objectArray, boolean bl) {
        object3 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible((Context)object, object2, (IdFunctionObject)object3));
        long l2 = ScriptRuntime.toLength(objectArray, 0);
        if (l2 <= (long)((String)object3).length()) {
            return object3;
        }
        if (objectArray.length >= 2 && !Undefined.isUndefined(objectArray[1])) {
            object = object2 = ScriptRuntime.toString(objectArray[1]);
            if (((String)object2).length() < 1) {
                return object3;
            }
        } else {
            object = " ";
        }
        int n2 = (int)(l2 - (long)((String)object3).length());
        object2 = new StringBuilder();
        do {
            ((StringBuilder)object2).append((String)object);
        } while (((StringBuilder)object2).length() < n2);
        ((StringBuilder)object2).setLength(n2);
        if (bl) {
            ((StringBuilder)object2).append((String)object3);
            return ((StringBuilder)object2).toString();
        }
        return ((StringBuilder)object2).insert(0, (String)object3).toString();
    }

    private static CharSequence js_raw(Context context, Scriptable scriptable, Object[] objectArray) {
        int n2 = objectArray.length;
        int n3 = 0;
        Object object = n2 > 0 ? objectArray[0] : Undefined.instance;
        long l2 = NativeArray.getLengthProperty(context, scriptable = ScriptRuntime.toObject(context, scriptable, ScriptRuntime.getObjectProp(ScriptRuntime.toObject(context, scriptable, object), "raw", context)));
        if (l2 <= Integer.MAX_VALUE) {
            int n4 = (int)l2;
            if (n4 <= 0) {
                return "";
            }
            object = new StringBuilder();
            while (true) {
                ((StringBuilder)object).append(ScriptRuntime.toString(ScriptRuntime.getObjectIndex(scriptable, n3, context)));
                n2 = n3 + 1;
                if (n2 == n4) {
                    return object;
                }
                n3 = n2;
                if (objectArray.length <= n2) continue;
                ((StringBuilder)object).append(ScriptRuntime.toString(objectArray[n2]));
                n3 = n2;
            }
        }
        throw ScriptRuntime.rangeError("raw.length > 2147483647");
    }

    private static String js_repeat(Context object, Scriptable object2, IdFunctionObject idFunctionObject, Object[] objectArray) {
        object = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible((Context)object, object2, idFunctionObject));
        double d2 = ScriptRuntime.toInteger(objectArray, 0);
        if (!(d2 < 0.0) && d2 != Double.POSITIVE_INFINITY) {
            if (d2 != 0.0 && ((String)object).length() != 0) {
                long l2 = (long)((String)object).length() * (long)d2;
                if (!(d2 > 2.147483647E9) && l2 <= Integer.MAX_VALUE) {
                    int n2;
                    object2 = new StringBuilder((int)l2);
                    ((StringBuilder)object2).append((String)object);
                    int n3 = (int)d2;
                    for (n2 = 1; n2 <= n3 / 2; n2 *= 2) {
                        ((StringBuilder)object2).append((CharSequence)object2);
                    }
                    if (n2 < n3) {
                        ((StringBuilder)object2).append(((StringBuilder)object2).substring(0, (n3 - n2) * ((String)object).length()));
                    }
                    return ((StringBuilder)object2).toString();
                }
                throw ScriptRuntime.rangeError("Invalid size or count value");
            }
            return "";
        }
        throw ScriptRuntime.rangeError("Invalid count value");
    }

    private static CharSequence js_slice(CharSequence charSequence, Object[] objectArray) {
        double d2;
        double d3;
        int n2 = objectArray.length;
        double d4 = 0.0;
        double d5 = n2 < 1 ? 0.0 : ScriptRuntime.toInteger(objectArray[0]);
        n2 = charSequence.length();
        if (d5 < 0.0) {
            d3 = d5 += (double)n2;
            if (d5 < 0.0) {
                d3 = 0.0;
            }
        } else {
            d2 = n2;
            d3 = d5;
            if (d5 > d2) {
                d3 = d2;
            }
        }
        if (objectArray.length >= 2 && objectArray[1] != Undefined.instance) {
            d2 = ScriptRuntime.toInteger(objectArray[1]);
            if (d2 < 0.0) {
                d5 = d2 += (double)n2;
                if (d2 < 0.0) {
                    d5 = d4;
                }
            } else {
                d4 = n2;
                d5 = d2;
                if (d2 > d4) {
                    d5 = d4;
                }
            }
            d4 = d5;
            if (d5 < d3) {
                d4 = d3;
            }
        } else {
            d4 = n2;
        }
        return charSequence.subSequence((int)d3, (int)d4);
    }

    private static CharSequence js_substr(CharSequence charSequence, Object[] object) {
        double d2;
        double d3;
        block8: {
            double d4;
            if (((Object[])object).length < 1) {
                return charSequence;
            }
            d3 = ScriptRuntime.toInteger(object[0]);
            int n2 = charSequence.length();
            double d5 = 0.0;
            if (d3 < 0.0) {
                d2 = d3 += (double)n2;
                if (d3 < 0.0) {
                    d2 = 0.0;
                }
            } else {
                d4 = n2;
                d2 = d3;
                if (d3 > d4) {
                    d2 = d4;
                }
            }
            d3 = d4 = (double)n2;
            if (((Object[])object).length <= 1) break block8;
            object = object[1];
            d3 = d4;
            if (!Undefined.isUndefined(object)) {
                d3 = ScriptRuntime.toInteger(object);
                if (d3 < 0.0) {
                    d3 = d5;
                }
                if ((d3 += d2) > d4) {
                    d3 = d4;
                }
            }
        }
        return charSequence.subSequence((int)d2, (int)d3);
    }

    private static CharSequence js_substring(Context context, CharSequence charSequence, Object[] objectArray) {
        double d2;
        double d3;
        int n2 = charSequence.length();
        double d4 = ScriptRuntime.toInteger(objectArray, 0);
        double d5 = 0.0;
        if (d4 < 0.0) {
            d3 = 0.0;
        } else {
            d2 = n2;
            d3 = d4;
            if (d4 > d2) {
                d3 = d2;
            }
        }
        if (objectArray.length > 1 && objectArray[1] != Undefined.instance) {
            d4 = ScriptRuntime.toInteger(objectArray[1]);
            if (!(d4 < 0.0) && !(d4 > (d5 = (double)n2))) {
                d5 = d4;
            }
            d2 = d3;
            d4 = d5;
            if (d5 < d3) {
                if (context.getLanguageVersion() != 120) {
                    d2 = d5;
                    d4 = d3;
                } else {
                    d4 = d3;
                    d2 = d3;
                }
            }
        } else {
            d4 = n2;
            d2 = d3;
        }
        return charSequence.subSequence((int)d2, (int)d4);
    }

    private static NativeString realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        return IdScriptableObject.ensureType(scriptable, NativeString.class, idFunctionObject);
    }

    private static String tagify(Context object, Scriptable object2, IdFunctionObject object3, String string, String string2, Object[] objectArray) {
        object2 = ScriptRuntime.toString(ScriptRuntimeES6.requireObjectCoercible((Context)object, object2, (IdFunctionObject)object3));
        object = new StringBuilder();
        ((StringBuilder)object).append('<');
        ((StringBuilder)object).append(string);
        if (string2 != null && string2.length() > 0) {
            object3 = ScriptRuntime.toString(objectArray, 0).replace("\"", "&quot;");
            ((StringBuilder)object).append(' ');
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("=\"");
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append('\"');
        }
        ((StringBuilder)object).append('>');
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("</");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append('>');
        return ((StringBuilder)object).toString();
    }

    /*
     * Exception decompiling
     */
    @Override
    public Object execIdCall(IdFunctionObject var1_1, Context var2_2, Scriptable var3_3, Scriptable var4_4, Object[] var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 6[SWITCH]
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

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object object = STRING_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -1, "fromCharCode", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -2, "fromCodePoint", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -3, "raw", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -5, "charAt", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -6, "charCodeAt", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -7, "indexOf", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -8, "lastIndexOf", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -9, "split", 3);
        this.addIdFunctionProperty(idFunctionObject, object, -10, "substring", 3);
        this.addIdFunctionProperty(idFunctionObject, object, -11, "toLowerCase", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -12, "toUpperCase", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -13, "substr", 3);
        this.addIdFunctionProperty(idFunctionObject, object, -14, "concat", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -15, "slice", 3);
        this.addIdFunctionProperty(idFunctionObject, object, -30, "equalsIgnoreCase", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -31, "match", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -32, "search", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -33, "replace", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -34, "replaceAll", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -35, "localeCompare", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -36, "toLocaleLowerCase", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        if (string.equals("length")) {
            return IdScriptableObject.instanceIdInfo(7, 1);
        }
        return super.findInstanceIdInfo(string);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 21;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 2112490563: {
                if (!string.equals("italics")) break;
                n4 = 50;
                break;
            }
            case 1943291465: {
                if (!string.equals("indexOf")) break;
                n4 = 49;
                break;
            }
            case 1743158238: {
                if (!string.equals("endsWith")) break;
                n4 = 48;
                break;
            }
            case 1507829577: {
                if (!string.equals("trimLeft")) break;
                n4 = 47;
                break;
            }
            case 1094496948: {
                if (!string.equals("replace")) break;
                n4 = 46;
                break;
            }
            case 1042795819: {
                if (!string.equals("localeCompare")) break;
                n4 = 45;
                break;
            }
            case 757893007: {
                if (!string.equals("padStart")) break;
                n4 = 44;
                break;
            }
            case 530542161: {
                if (!string.equals("substring")) break;
                n4 = 43;
                break;
            }
            case 397153782: {
                if (!string.equals("charCodeAt")) break;
                n4 = 42;
                break;
            }
            case 366554320: {
                if (!string.equals("fontsize")) break;
                n4 = 41;
                break;
            }
            case 257797441: {
                if (!string.equals("equalsIgnoreCase")) break;
                n4 = 40;
                break;
            }
            case 236609293: {
                if (!string.equals("normalize")) break;
                n4 = 39;
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 38;
                break;
            }
            case 109648666: {
                if (!string.equals("split")) break;
                n4 = 37;
                break;
            }
            case 109548807: {
                if (!string.equals("small")) break;
                n4 = 36;
                break;
            }
            case 109526418: {
                if (!string.equals("slice")) break;
                n4 = 35;
                break;
            }
            case 103668165: {
                if (!string.equals("match")) break;
                n4 = 34;
                break;
            }
            case 97445748: {
                if (!string.equals("fixed")) break;
                n4 = 33;
                break;
            }
            case 93826908: {
                if (!string.equals("blink")) break;
                n4 = 32;
                break;
            }
            case 90259659: {
                if (!string.equals("includes")) break;
                n4 = 31;
                break;
            }
            case 3568674: {
                if (!string.equals("trim")) break;
                n4 = 30;
                break;
            }
            case 3321850: {
                if (!string.equals("link")) break;
                n4 = 29;
                break;
            }
            case 3029637: {
                if (!string.equals("bold")) break;
                n4 = 28;
                break;
            }
            case 114254: {
                if (!string.equals("sup")) break;
                n4 = 27;
                break;
            }
            case 114240: {
                if (!string.equals("sub")) break;
                n4 = 26;
                break;
            }
            case 97536: {
                if (!string.equals("big")) break;
                n4 = 25;
                break;
            }
            case 3123: {
                if (!string.equals("at")) break;
                n4 = 24;
                break;
            }
            case -399551817: {
                if (!string.equals("toUpperCase")) break;
                n4 = 23;
                break;
            }
            case -467511597: {
                if (!string.equals("lastIndexOf")) break;
                n4 = 22;
                break;
            }
            case -495016608: {
                if (!string.equals("trimStart")) break;
                n4 = 21;
                break;
            }
            case -496262374: {
                if (!string.equals("trimRight")) break;
                n4 = 20;
                break;
            }
            case -726908483: {
                if (!string.equals("toLocaleUpperCase")) break;
                n4 = 19;
                break;
            }
            case -891529231: {
                if (!string.equals("substr")) break;
                n4 = 18;
                break;
            }
            case -891985998: {
                if (!string.equals("strike")) break;
                n4 = 17;
                break;
            }
            case -906336856: {
                if (!string.equals("search")) break;
                n4 = 16;
                break;
            }
            case -934531685: {
                if (!string.equals("repeat")) break;
                n4 = 15;
                break;
            }
            case -995871928: {
                if (!string.equals("padEnd")) break;
                n4 = 14;
                break;
            }
            case -1059745447: {
                if (!string.equals("trimEnd")) break;
                n4 = 13;
                break;
            }
            case -1137582698: {
                if (!string.equals("toLowerCase")) break;
                n4 = 12;
                break;
            }
            case -1233067443: {
                if (!string.equals("replaceAll")) break;
                n4 = 11;
                break;
            }
            case -1295482945: {
                if (!string.equals("equals")) break;
                n4 = 10;
                break;
            }
            case -1305276618: {
                if (!string.equals("codePointAt")) break;
                n4 = 9;
                break;
            }
            case -1354795244: {
                if (!string.equals("concat")) break;
                n4 = 8;
                break;
            }
            case -1361633751: {
                if (!string.equals("charAt")) break;
                n4 = 7;
                break;
            }
            case -1413299531: {
                if (!string.equals("anchor")) break;
                n4 = 6;
                break;
            }
            case -1464939364: {
                if (!string.equals("toLocaleLowerCase")) break;
                n4 = 5;
                break;
            }
            case -1536328588: {
                if (!string.equals("fontcolor")) break;
                n4 = 4;
                break;
            }
            case -1555538761: {
                if (!string.equals("startsWith")) break;
                n4 = 3;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
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
            case 50: {
                n3 = 17;
                break;
            }
            case 49: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 33;
                break;
            }
            case 45: {
                n3 = 35;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 43: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 6;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 4;
                break;
            }
            case 37: {
                n3 = 9;
                break;
            }
            case 36: {
                n3 = 20;
                break;
            }
            case 35: {
                n3 = 15;
                break;
            }
            case 34: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 38;
                break;
            }
            case 29: {
                n3 = 27;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 52;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 40;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 17: {
                n3 = 19;
                break;
            }
            case 16: {
                n3 = 32;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 11;
                break;
            }
            case 11: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 28;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 4: {
                n3 = 26;
                break;
            }
            case 3: {
                n3 = 42;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 25: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 49;
        }
        return 0;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        if (n2 >= 0 && n2 < this.string.length()) {
            return String.valueOf(this.string.charAt(n2));
        }
        return super.get(n2, scriptable);
    }

    @Override
    public int getAttributes(int n2) {
        if (n2 >= 0 && n2 < this.string.length()) {
            n2 = 5;
            if (Context.getContext().getLanguageVersion() < 200) {
                n2 = 7;
            }
            return n2;
        }
        return super.getAttributes(n2);
    }

    @Override
    public String getClassName() {
        return "String";
    }

    @Override
    protected Object[] getIds(boolean bl, boolean bl2) {
        Object[] objectArray = Context.getCurrentContext();
        if (objectArray != null && objectArray.getLanguageVersion() >= 200) {
            Object[] objectArray2 = super.getIds(bl, bl2);
            int n2 = objectArray2.length;
            objectArray = new Object[this.string.length() + n2];
            for (n2 = 0; n2 < this.string.length(); ++n2) {
                objectArray[n2] = n2;
            }
            System.arraycopy(objectArray2, 0, objectArray, n2, objectArray2.length);
            return objectArray;
        }
        return super.getIds(bl, bl2);
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 == 1) {
            return "length";
        }
        return super.getInstanceIdName(n2);
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 == 1) {
            return ScriptRuntime.wrapInt(this.string.length());
        }
        return super.getInstanceIdValue(n2);
    }

    int getLength() {
        return this.string.length();
    }

    @Override
    protected int getMaxInstanceId() {
        return 1;
    }

    @Override
    protected ScriptableObject getOwnPropertyDescriptor(Context context, Object object) {
        if (!(object instanceof Symbol) && context != null && context.getLanguageVersion() >= 200) {
            int n2;
            ScriptRuntime$StringIdOrIndex scriptRuntime$StringIdOrIndex = ScriptRuntime.toStringIdOrIndex(object);
            if (scriptRuntime$StringIdOrIndex.stringId == null && (n2 = scriptRuntime$StringIdOrIndex.index) >= 0 && n2 < this.string.length()) {
                return this.defaultIndexPropertyDescriptor(String.valueOf(this.string.charAt(scriptRuntime$StringIdOrIndex.index)));
            }
        }
        return super.getOwnPropertyDescriptor(context, object);
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        if (n2 >= 0 && n2 < this.string.length()) {
            return true;
        }
        return super.has(n2, scriptable);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block55: {
            block54: {
                if (var1_1 == 49) {
                    this.initPrototypeMethod(NativeString.STRING_TAG, var1_1, SymbolKey.ITERATOR, "[Symbol.iterator]", 0);
                    return;
                }
                switch (var1_1) {
                    default: {
                        throw new IllegalArgumentException(String.valueOf(var1_1));
                    }
                    case 52: {
                        var3_2 = "at";
                        break block54;
                    }
                    case 51: {
                        var3_2 = "trimEnd";
                        ** GOTO lbl158
                    }
                    case 50: {
                        var3_2 = "trimStart";
                        ** GOTO lbl158
                    }
                    case 48: {
                        var3_2 = "padEnd";
                        break block54;
                    }
                    case 47: {
                        var3_2 = "padStart";
                        break block54;
                    }
                    case 46: {
                        var3_2 = "codePointAt";
                        break block54;
                    }
                    case 45: {
                        var3_2 = "repeat";
                        break block54;
                    }
                    case 44: {
                        var3_2 = "normalize";
                        ** GOTO lbl158
                    }
                    case 43: {
                        var3_2 = "endsWith";
                        break block54;
                    }
                    case 42: {
                        var3_2 = "startsWith";
                        break block54;
                    }
                    case 41: {
                        var3_2 = "includes";
                        break block54;
                    }
                    case 40: {
                        var3_2 = "trimRight";
                        ** GOTO lbl158
                    }
                    case 39: {
                        var3_2 = "trimLeft";
                        ** GOTO lbl158
                    }
                    case 38: {
                        var3_2 = "trim";
                        ** GOTO lbl158
                    }
                    case 37: {
                        var3_2 = "toLocaleUpperCase";
                        ** GOTO lbl158
                    }
                    case 36: {
                        var3_2 = "toLocaleLowerCase";
                        ** GOTO lbl158
                    }
                    case 35: {
                        var3_2 = "localeCompare";
                        break block54;
                    }
                    case 34: {
                        var3_2 = "replaceAll";
                        ** GOTO lbl136
                    }
                    case 33: {
                        var3_2 = "replace";
                        ** GOTO lbl136
                    }
                    case 32: {
                        var3_2 = "search";
                        break block54;
                    }
                    case 31: {
                        var3_2 = "match";
                        break block54;
                    }
                    case 30: {
                        var3_2 = "equalsIgnoreCase";
                        break block54;
                    }
                    case 29: {
                        var3_2 = "equals";
                        break block54;
                    }
                    case 28: {
                        var3_2 = "anchor";
                        ** GOTO lbl158
                    }
                    case 27: {
                        var3_2 = "link";
                        ** GOTO lbl158
                    }
                    case 26: {
                        var3_2 = "fontcolor";
                        ** GOTO lbl158
                    }
                    case 25: {
                        var3_2 = "fontsize";
                        ** GOTO lbl158
                    }
                    case 24: {
                        var3_2 = "sub";
                        ** GOTO lbl158
                    }
                    case 23: {
                        var3_2 = "sup";
                        ** GOTO lbl158
                    }
                    case 22: {
                        var3_2 = "blink";
                        ** GOTO lbl158
                    }
                    case 21: {
                        var3_2 = "big";
                        ** GOTO lbl158
                    }
                    case 20: {
                        var3_2 = "small";
                        ** GOTO lbl158
                    }
                    case 19: {
                        var3_2 = "strike";
                        ** GOTO lbl158
                    }
                    case 18: {
                        var3_2 = "fixed";
                        ** GOTO lbl158
                    }
                    case 17: {
                        var3_2 = "italics";
                        ** GOTO lbl158
                    }
                    case 16: {
                        var3_2 = "bold";
                        ** GOTO lbl158
                    }
                    case 15: {
                        var3_2 = "slice";
                        ** GOTO lbl136
                    }
                    case 14: {
                        var3_2 = "concat";
                        break block54;
                    }
                    case 13: {
                        var3_2 = "substr";
                        ** GOTO lbl136
                    }
                    case 12: {
                        var3_2 = "toUpperCase";
                        ** GOTO lbl158
                    }
                    case 11: {
                        var3_2 = "toLowerCase";
                        ** GOTO lbl158
                    }
                    case 10: {
                        var3_2 = "substring";
                        ** GOTO lbl136
                    }
                    case 9: {
                        var3_2 = "split";
lbl136:
                        // 6 sources

                        var2_3 = 2;
                        break block55;
                    }
                    case 8: {
                        var3_2 = "lastIndexOf";
                        break block54;
                    }
                    case 7: {
                        var3_2 = "indexOf";
                        break block54;
                    }
                    case 6: {
                        var3_2 = "charCodeAt";
                        break block54;
                    }
                    case 5: {
                        var3_2 = "charAt";
                        break block54;
                    }
                    case 4: {
                        var3_2 = "valueOf";
                        ** GOTO lbl158
                    }
                    case 3: {
                        var3_2 = "toSource";
                        ** GOTO lbl158
                    }
                    case 2: {
                        var3_2 = "toString";
lbl158:
                        // 26 sources

                        var2_3 = 0;
                        break block55;
                    }
                    case 1: 
                }
                var3_2 = "constructor";
            }
            var2_3 = 1;
        }
        this.initPrototypeMethod(NativeString.STRING_TAG, var1_1, var3_2, null, var2_3);
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        if (n2 >= 0 && n2 < this.string.length()) {
            return;
        }
        super.put(n2, scriptable, object);
    }

    public CharSequence toCharSequence() {
        return this.string;
    }

    public String toString() {
        CharSequence charSequence = this.string;
        charSequence = charSequence instanceof String ? (String)charSequence : charSequence.toString();
        return charSequence;
    }
}

