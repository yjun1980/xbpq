/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.RegExpProxy;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.regexp.GlobData;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.NativeRegExpInstantiator;
import org.mozilla.javascript.regexp.RECompiled;
import org.mozilla.javascript.regexp.SubString;

public class RegExpImpl
implements RegExpProxy {
    protected String input;
    protected SubString lastMatch;
    protected SubString lastParen;
    protected SubString leftContext;
    protected boolean multiline;
    protected SubString[] parens;
    protected SubString rightContext;

    private static NativeRegExp createRegExp(Context object, Scriptable object2, Object[] objectArray, int n2, boolean bl) {
        block4: {
            Scriptable scriptable;
            block5: {
                block2: {
                    block3: {
                        scriptable = ScriptableObject.getTopLevelScope((Scriptable)object2);
                        if (objectArray.length == 0 || objectArray[0] == Undefined.instance) break block2;
                        if (!(objectArray[0] instanceof NativeRegExp)) break block3;
                        object = (NativeRegExp)objectArray[0];
                        break block4;
                    }
                    String string = ScriptRuntime.toString(objectArray[0]);
                    if (n2 < objectArray.length) {
                        objectArray[0] = string;
                        object2 = ScriptRuntime.toString(objectArray[n2]);
                    } else {
                        object2 = null;
                    }
                    object2 = NativeRegExp.compileRE((Context)object, string, (String)object2, bl);
                    break block5;
                }
                object2 = NativeRegExp.compileRE((Context)object, "", "", false);
            }
            object = NativeRegExpInstantiator.withLanguageVersionScopeCompiled(((Context)object).getLanguageVersion(), scriptable, (RECompiled)object2);
        }
        return object;
    }

    private static void do_replace(GlobData object, Context context, RegExpImpl regExpImpl) {
        StringBuilder stringBuilder = ((GlobData)object).charBuf;
        String string = ((GlobData)object).repstr;
        int n2 = ((GlobData)object).dollar;
        Object object2 = 0;
        if (n2 != -1) {
            int n3;
            object = new int[1];
            int n4 = 0;
            do {
                stringBuilder.append(string, n4, n2);
                SubString subString = RegExpImpl.interpretDollar(context, regExpImpl, string, n2, (int[])object);
                if (subString != null) {
                    object2 = subString.length;
                    if (object2 > 0) {
                        String string2 = subString.str;
                        n4 = subString.index;
                        stringBuilder.append(string2, n4, object2 + n4);
                    }
                    object2 = object[0] + n2;
                    n2 += object[0];
                } else {
                    object2 = n2++;
                }
                n3 = string.indexOf(36, n2);
                n4 = object2;
                n2 = n3;
            } while (n3 >= 0);
        }
        if ((n2 = string.length()) > object2) {
            stringBuilder.append(string, (int)object2, n2);
        }
    }

    private static int find_split(Context context, Scriptable scriptable, String string, String string2, int n2, RegExpProxy regExpProxy, Scriptable scriptable2, int[] nArray, int[] nArray2, boolean[] blArray, String[][] stringArray) {
        int n3 = nArray[0];
        int n4 = string.length();
        int n5 = -1;
        if (n2 == 120 && scriptable2 == null && string2.length() == 1 && string2.charAt(0) == ' ') {
            n5 = n3;
            if (n3 == 0) {
                for (n5 = n3; n5 < n4 && Character.isWhitespace(string.charAt(n5)); ++n5) {
                }
                nArray[0] = n5;
            }
            if (n5 == n4) {
                return -1;
            }
            for (n2 = n5; n2 < n4 && !Character.isWhitespace(string.charAt(n2)); ++n2) {
            }
            for (n5 = n2; n5 < n4 && Character.isWhitespace(string.charAt(n5)); ++n5) {
            }
            nArray2[0] = n5 - n2;
            return n2;
        }
        if (n3 > n4) {
            return -1;
        }
        if (scriptable2 != null) {
            return regExpProxy.find_split(context, scriptable, string, string2, scriptable2, nArray, nArray2, blArray, stringArray);
        }
        if (n2 != 0 && n2 < 130 && n4 == 0) {
            return -1;
        }
        if (string2.length() == 0) {
            if (n2 == 120) {
                if (n3 == n4) {
                    nArray2[0] = 1;
                    return n3;
                }
                return n3 + 1;
            }
            n2 = n3 == n4 ? n5 : n3 + 1;
            return n2;
        }
        if (nArray[0] >= n4) {
            return n4;
        }
        n5 = string.indexOf(string2, nArray[0]);
        n2 = n4;
        if (n5 != -1) {
            n2 = n5;
        }
        return n2;
    }

    private static SubString interpretDollar(Context object, RegExpImpl regExpImpl, String string, int n2, int[] nArray) {
        int n3;
        if (string.charAt(n2) != '$') {
            Kit.codeBug();
        }
        if ((n3 = object.getLanguageVersion()) != 0 && n3 <= 140 && n2 > 0 && string.charAt(n2 - 1) == '\\') {
            return null;
        }
        int n4 = n2 + 1;
        int n5 = string.length();
        if (n4 >= n5) {
            return null;
        }
        char c2 = string.charAt(n4);
        if (NativeRegExp.isDigit(c2)) {
            int n6;
            int n7;
            block18: {
                if (n3 != 0 && n3 <= 140) {
                    if (c2 == '0') {
                        return null;
                    }
                    n3 = n2;
                    n4 = 0;
                    while (true) {
                        n7 = n4;
                        n6 = ++n3;
                        if (n3 >= n5) break block18;
                        c2 = string.charAt(n3);
                        n7 = n4;
                        n6 = n3;
                        if (!NativeRegExp.isDigit(c2)) break block18;
                        n7 = c2 - 48 + n4 * 10;
                        if (n7 < n4) {
                            n7 = n4;
                            n6 = n3;
                            break block18;
                        }
                        n4 = n7;
                    }
                }
                n7 = c2 - 48;
                object = regExpImpl.parens;
                n4 = object == null ? 0 : ((SubString[])object).length;
                if (n7 > n4) {
                    return null;
                }
                n3 = n2 + 2;
                if (n3 < n5 && NativeRegExp.isDigit(c2 = string.charAt(n3)) && (n6 = c2 - 48 + n7 * 10) <= n4) {
                    ++n3;
                    n4 = n6;
                } else {
                    n4 = n7;
                }
                n7 = n4;
                n6 = n3;
                if (n4 == 0) {
                    return null;
                }
            }
            nArray[0] = n6 - n2;
            return regExpImpl.getParenSubString(n7 - 1);
        }
        nArray[0] = 2;
        if (c2 != '$') {
            if (c2 != '+') {
                if (c2 != '`') {
                    if (c2 != '&') {
                        if (c2 != '\'') {
                            return null;
                        }
                        return regExpImpl.rightContext;
                    }
                    return regExpImpl.lastMatch;
                }
                if (n3 == 120) {
                    object = regExpImpl.leftContext;
                    object.index = 0;
                    object.length = regExpImpl.lastMatch.index;
                }
                return regExpImpl.leftContext;
            }
            return regExpImpl.lastParen;
        }
        return new SubString("$");
    }

    private static Object matchOrReplace(Context object, Scriptable scriptable, Scriptable object2, Object[] objectArray, RegExpImpl regExpImpl, GlobData globData, NativeRegExp nativeRegExp) {
        block7: {
            int n2;
            String string;
            block9: {
                boolean bl;
                block8: {
                    string = globData.str;
                    bl = (nativeRegExp.getFlags() & 1) != 0;
                    globData.global = bl;
                    objectArray = new int[1];
                    objectArray[0] = false;
                    object2 = null;
                    n2 = globData.mode;
                    if (n2 != 4) break block8;
                    n2 = (object = nativeRegExp.executeRegExp((Context)object, scriptable, regExpImpl, string, (int[])objectArray, 0)) != null && object.equals(Boolean.TRUE) ? regExpImpl.leftContext.length : -1;
                    object = n2;
                    break block7;
                }
                if (!bl) break block9;
                nativeRegExp.lastIndex = ScriptRuntime.zeroObj;
                n2 = 0;
                while (objectArray[0] <= string.length()) {
                    block10: {
                        block11: {
                            object2 = nativeRegExp.executeRegExp((Context)object, scriptable, regExpImpl, string, (int[])objectArray, 0);
                            if (object2 == null || !object2.equals(Boolean.TRUE)) break block10;
                            int n3 = globData.mode;
                            if (n3 == 1) {
                                RegExpImpl.match_glob(globData, (Context)object, scriptable, n2, regExpImpl);
                            } else {
                                if (n3 != 2 && n3 != 3) {
                                    Kit.codeBug();
                                }
                                SubString subString = regExpImpl.lastMatch;
                                n3 = globData.leftIndex;
                                int n4 = subString.index;
                                globData.leftIndex = n4 + subString.length;
                                RegExpImpl.replace_glob(globData, (Context)object, scriptable, regExpImpl, n3, n4 - n3);
                            }
                            if (regExpImpl.lastMatch.length != 0) break block11;
                            if (objectArray[0] == string.length()) break block10;
                            objectArray[0] = objectArray[0] + true;
                        }
                        ++n2;
                        continue;
                    }
                    object = object2;
                    break block7;
                }
                object = object2;
                break block7;
            }
            n2 = n2 == 2 ? 0 : 1;
            object = nativeRegExp.executeRegExp((Context)object, scriptable, regExpImpl, string, (int[])objectArray, n2);
        }
        return object;
    }

    private static void match_glob(GlobData object, Context object2, Scriptable scriptable, int n2, RegExpImpl regExpImpl) {
        if (((GlobData)object).arrayobj == null) {
            ((GlobData)object).arrayobj = ((Context)object2).newArray(scriptable, 0);
        }
        object2 = regExpImpl.lastMatch.toString();
        object = ((GlobData)object).arrayobj;
        object.put(n2, (Scriptable)object, object2);
    }

    private static void replace_glob(GlobData globData, Context context, Scriptable object, RegExpImpl regExpImpl, int n2, int n3) {
        int n4;
        int n5;
        Object object2 = globData.lambda;
        if (object2 != null) {
            Object object3 = regExpImpl.parens;
            n5 = object3 == null ? 0 : ((SubString[])object3).length;
            object2 = new Object[n5 + 3];
            object2[0] = regExpImpl.lastMatch.toString();
            for (n4 = 0; n4 < n5; ++n4) {
                SubString subString = object3[n4];
                object2[n4 + 1] = subString != null ? subString.toString() : Undefined.instance;
            }
            object2[n5 + 1] = regExpImpl.leftContext.length;
            object2[n5 + 2] = globData.str;
            if (regExpImpl != ScriptRuntime.getRegExpProxy(context)) {
                Kit.codeBug();
            }
            object3 = new RegExpImpl();
            object3.multiline = regExpImpl.multiline;
            object3.input = regExpImpl.input;
            ScriptRuntime.setRegExpProxy(context, (RegExpProxy)object3);
            try {
                object = ScriptableObject.getTopLevelScope((Scriptable)object);
                object = ScriptRuntime.toString(globData.lambda.call(context, (Scriptable)object, (Scriptable)object, (Object[])object2));
                n5 = ((String)object).length();
            }
            finally {
                ScriptRuntime.setRegExpProxy(context, regExpImpl);
            }
        } else {
            object2 = null;
            n4 = globData.repstr.length();
            int n6 = globData.dollar;
            n5 = n4;
            object = object2;
            if (n6 >= 0) {
                int n7;
                int[] nArray = new int[1];
                do {
                    if ((object = RegExpImpl.interpretDollar(context, regExpImpl, globData.repstr, n6, nArray)) != null) {
                        n7 = ((SubString)object).length;
                        n5 = nArray[0];
                        n6 += nArray[0];
                        n5 = n7 - n5 + n4;
                    } else {
                        ++n6;
                        n5 = n4;
                    }
                    n7 = globData.repstr.indexOf(36, n6);
                    n4 = n5;
                    n6 = n7;
                } while (n7 >= 0);
                object = object2;
            }
        }
        n5 = n5 + n3 + regExpImpl.rightContext.length;
        object2 = globData.charBuf;
        if (object2 == null) {
            globData.charBuf = object2 = new StringBuilder(n5);
        } else {
            ((StringBuilder)object2).ensureCapacity(((StringBuilder)object2).length() + n5);
        }
        ((StringBuilder)object2).append(regExpImpl.leftContext.str, n2, n3 + n2);
        if (globData.lambda != null) {
            ((StringBuilder)object2).append((String)object);
        } else {
            RegExpImpl.do_replace(globData, context, regExpImpl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Object action(Context object, Scriptable object2, Scriptable object3, Object[] objectArray, int n2) {
        GlobData globData;
        block14: {
            Object object4;
            int n3;
            int n4;
            block13: {
                block12: {
                    String string;
                    NativeRegExp nativeRegExp;
                    globData = new GlobData();
                    globData.mode = n2;
                    globData.str = ScriptRuntime.toString(object3);
                    n4 = Integer.MAX_VALUE;
                    if (n2 == 1) break block12;
                    if (n2 != 2 && n2 != 3) {
                        if (n2 != 4) throw Kit.codeBug();
                        if (((Context)object).getLanguageVersion() >= 160) return RegExpImpl.matchOrReplace((Context)object, (Scriptable)object2, (Scriptable)object3, objectArray, this, globData, RegExpImpl.createRegExp((Context)object, (Scriptable)object2, objectArray, n4, false));
                        n4 = 1;
                        return RegExpImpl.matchOrReplace((Context)object, (Scriptable)object2, (Scriptable)object3, objectArray, this, globData, RegExpImpl.createRegExp((Context)object, (Scriptable)object2, objectArray, n4, false));
                    }
                    n4 = objectArray.length > 0 && objectArray[0] instanceof NativeRegExp ? 1 : 0;
                    n3 = n4;
                    if (((Context)object).getLanguageVersion() < 160) {
                        n3 = objectArray.length > 2 ? 1 : 0;
                        n3 = n4 | n3;
                    }
                    if (n3 != 0) {
                        nativeRegExp = RegExpImpl.createRegExp((Context)object, (Scriptable)object2, objectArray, 2, true);
                        if (3 == n2) {
                            if ((nativeRegExp.getFlags() & 1) == 0) throw ScriptRuntime.typeError("replaceAll must be called with a global RegExp");
                        }
                        object4 = null;
                    } else {
                        object4 = objectArray.length < 1 ? Undefined.instance : objectArray[0];
                        object4 = ScriptRuntime.toString(object4);
                        nativeRegExp = null;
                    }
                    Object object5 = objectArray.length < 2 ? Undefined.instance : objectArray[1];
                    if (object5 instanceof Function && (((Context)object).getLanguageVersion() < 200 || !(object5 instanceof NativeRegExp))) {
                        object5 = (Function)object5;
                        string = null;
                    } else {
                        string = ScriptRuntime.toString(object5);
                        object5 = null;
                    }
                    globData.lambda = object5;
                    globData.repstr = string;
                    n4 = string == null ? -1 : string.indexOf(36);
                    globData.dollar = n4;
                    globData.charBuf = null;
                    globData.leftIndex = 0;
                    if (n3 == 0) break block13;
                    object3 = RegExpImpl.matchOrReplace((Context)object, (Scriptable)object2, (Scriptable)object3, objectArray, this, globData, nativeRegExp);
                    if (globData.charBuf == null) {
                        if (globData.global) return globData.str;
                        if (object3 == null) return globData.str;
                        if (!Boolean.TRUE.equals(object3)) {
                            return globData.str;
                        }
                        object3 = this.leftContext;
                        RegExpImpl.replace_glob(globData, (Context)object, (Scriptable)object2, this, ((SubString)object3).index, ((SubString)object3).length);
                    }
                    break block14;
                }
                if (((Context)object).getLanguageVersion() < 160) {
                    n4 = 1;
                }
                object = RegExpImpl.matchOrReplace((Context)object, (Scriptable)object2, (Scriptable)object3, objectArray, this, globData, RegExpImpl.createRegExp((Context)object, (Scriptable)object2, objectArray, n4, false));
                object2 = globData.arrayobj;
                if (object2 != null) return object2;
                return object;
            }
            object3 = globData.str;
            n3 = ((String)object3).length();
            int n5 = ((String)object4).length();
            n4 = -1;
            int n6 = 0;
            while (true) {
                n4 = ((String)object4).isEmpty() ? (n4 == -1 ? 0 : (n6 < n3 ? n6 + 1 : -1)) : ((String)object3).indexOf((String)object4, n6);
                if (n4 == -1) {
                    if (globData.charBuf != null) break;
                    return object3;
                }
                this.parens = null;
                this.lastParen = null;
                this.leftContext = new SubString((String)object3, 0, n4);
                this.lastMatch = new SubString((String)object3, n4, n5);
                int n7 = n4 + n5;
                this.rightContext = new SubString((String)object3, n7, n3 - n4 - n5);
                RegExpImpl.replace_glob(globData, (Context)object, (Scriptable)object2, this, n6, n4 - n6);
                if (n2 != 3) break;
                n6 = n7;
            }
        }
        object2 = this.rightContext;
        object = globData.charBuf;
        object3 = ((SubString)object2).str;
        n2 = ((SubString)object2).index;
        ((StringBuilder)object).append((CharSequence)object3, n2, ((SubString)object2).length + n2);
        return globData.charBuf.toString();
    }

    @Override
    public Object compileRegExp(Context context, String string, String string2) {
        return NativeRegExp.compileRE(context, string, string2, false);
    }

    @Override
    public int find_split(Context object, Scriptable scriptable, String string, String object2, Scriptable object3, int[] nArray, int[] nArray2, boolean[] blArray, String[][] stringArray) {
        int n2;
        int n3;
        int n4;
        block5: {
            n4 = nArray[0];
            n3 = string.length();
            n2 = ((Context)object).getLanguageVersion();
            object2 = (NativeRegExp)object3;
            while (true) {
                int n5 = nArray[0];
                nArray[0] = ++n4;
                object3 = ((NativeRegExp)object2).executeRegExp((Context)object, scriptable, this, string, nArray, 0);
                if (!Boolean.TRUE.equals(object3)) {
                    nArray[0] = n5;
                    nArray2[0] = 1;
                    blArray[0] = false;
                    return n3;
                }
                n4 = nArray[0];
                nArray[0] = n5;
                blArray[0] = true;
                nArray2[0] = this.lastMatch.length;
                if (nArray2[0] != 0 || n4 != nArray[0]) break;
                if (n4 != n3) continue;
                if (n2 == 120) {
                    nArray2[0] = 1;
                } else {
                    n4 = -1;
                }
                break block5;
            }
            n4 -= nArray2[0];
        }
        object = this.parens;
        n2 = object == null ? 0 : ((SubString[])object).length;
        stringArray[0] = new String[n2];
        for (n3 = 0; n3 < n2; ++n3) {
            object = this.getParenSubString(n3);
            stringArray[0][n3] = ((SubString)object).toString();
        }
        return n4;
    }

    SubString getParenSubString(int n2) {
        Object object = this.parens;
        if (object != null && n2 < ((SubString[])object).length && (object = object[n2]) != null) {
            return object;
        }
        return new SubString();
    }

    @Override
    public boolean isRegExp(Scriptable scriptable) {
        return scriptable instanceof NativeRegExp;
    }

    @Override
    public Object js_split(Context context, Scriptable scriptable, String string, Object[] object) {
        Scriptable scriptable2 = context.newArray(scriptable, 0);
        boolean bl = ((Object[])object).length > 1 && object[1] != Undefined.instance;
        long l2 = 0L;
        if (bl) {
            l2 = ScriptRuntime.toUint32(object[1]);
            if (l2 == 0L) {
                return scriptable2;
            }
            if (l2 > (long)string.length()) {
                l2 = string.length() + 1;
            }
        }
        if (((Object[])object).length >= 1 && object[0] != Undefined.instance) {
            int n2;
            Scriptable scriptable3;
            RegExpProxy regExpProxy;
            int[] nArray = new int[1];
            if (object[0] instanceof Scriptable) {
                regExpProxy = ScriptRuntime.getRegExpProxy(context);
                if (regExpProxy == null || !regExpProxy.isRegExp(scriptable3 = (Scriptable)object[0])) {
                    scriptable3 = null;
                }
            } else {
                regExpProxy = null;
                scriptable3 = null;
            }
            if (scriptable3 == null) {
                object = ScriptRuntime.toString(object[0]);
                nArray[0] = ((String)object).length();
            } else {
                object = null;
            }
            int[] nArray2 = new int[]{0};
            boolean[] blArray = new boolean[]{false};
            String[][] stringArray = new String[][]{null};
            int n3 = context.getLanguageVersion();
            int n4 = 0;
            while (!((n2 = RegExpImpl.find_split(context, scriptable, string, (String)object, n3, regExpProxy, scriptable3, nArray2, nArray, blArray, stringArray)) < 0 || bl && (long)n4 >= l2 || n2 > string.length())) {
                int n5;
                String string2 = string.length() == 0 ? string : string.substring(nArray2[0], n2);
                scriptable2.put(n4, scriptable2, (Object)string2);
                n4 = n5 = n4 + 1;
                if (scriptable3 != null) {
                    n4 = n5;
                    if (blArray[0]) {
                        int n6 = stringArray[0].length;
                        int n7 = 0;
                        n4 = n5;
                        for (n5 = n7; !(n5 >= n6 || bl && (long)n4 >= l2); ++n5) {
                            scriptable2.put(n4, scriptable2, (Object)stringArray[0][n5]);
                            ++n4;
                        }
                        blArray[0] = false;
                    }
                }
                nArray2[0] = n2 + nArray[0];
                if (n3 >= 130 || n3 == 0 || bl || nArray2[0] != string.length()) continue;
                break;
            }
            return scriptable2;
        }
        scriptable2.put(0, scriptable2, (Object)string);
        return scriptable2;
    }

    @Override
    public Scriptable wrapRegExp(Context context, Scriptable scriptable, Object object) {
        return NativeRegExpInstantiator.withLanguageVersionScopeCompiled(context.getLanguageVersion(), scriptable, (RECompiled)object);
    }
}

