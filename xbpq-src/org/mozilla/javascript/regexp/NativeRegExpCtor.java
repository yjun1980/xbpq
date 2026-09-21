/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import java.util.Objects;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.NativeRegExpInstantiator;
import org.mozilla.javascript.regexp.RegExpImpl;

class NativeRegExpCtor
extends BaseFunction {
    private static final int DOLLAR_ID_BASE = 12;
    private static final int Id_AMPERSAND = 6;
    private static final int Id_BACK_QUOTE = 10;
    private static final int Id_DOLLAR_1 = 13;
    private static final int Id_DOLLAR_2 = 14;
    private static final int Id_DOLLAR_3 = 15;
    private static final int Id_DOLLAR_4 = 16;
    private static final int Id_DOLLAR_5 = 17;
    private static final int Id_DOLLAR_6 = 18;
    private static final int Id_DOLLAR_7 = 19;
    private static final int Id_DOLLAR_8 = 20;
    private static final int Id_DOLLAR_9 = 21;
    private static final int Id_PLUS = 8;
    private static final int Id_QUOTE = 12;
    private static final int Id_STAR = 2;
    private static final int Id_UNDERSCORE = 4;
    private static final int Id_input = 3;
    private static final int Id_lastMatch = 5;
    private static final int Id_lastParen = 7;
    private static final int Id_leftContext = 9;
    private static final int Id_multiline = 1;
    private static final int Id_rightContext = 11;
    private static final int MAX_INSTANCE_ID = 21;
    private static final long serialVersionUID = -5733330028285400526L;
    private int inputAttr = 4;
    private int multilineAttr = 4;
    private int starAttr = 4;
    private int underscoreAttr = 4;

    NativeRegExpCtor() {
    }

    private static RegExpImpl getImpl() {
        return (RegExpImpl)ScriptRuntime.getRegExpProxy(Context.getCurrentContext());
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (objectArray.length > 0 && objectArray[0] instanceof NativeRegExp && (objectArray.length == 1 || objectArray[1] == Undefined.instance)) {
            return objectArray[0];
        }
        return this.construct(context, scriptable, objectArray);
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        NativeRegExp nativeRegExp = NativeRegExpInstantiator.withLanguageVersion(context.getLanguageVersion());
        nativeRegExp.compile(context, scriptable, objectArray);
        ScriptRuntime.setBuiltinProtoAndParent(nativeRegExp, scriptable, TopLevel$Builtins.RegExp);
        return nativeRegExp;
    }

    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1998898196: {
                if (!string.equals("lastParen")) break;
                n3 = 20;
                break;
            }
            case 1996129487: {
                if (!string.equals("lastMatch")) break;
                n3 = 19;
                break;
            }
            case 100358090: {
                if (!string.equals("input")) break;
                n3 = 18;
                break;
            }
            case 1212: {
                if (!string.equals("$`")) break;
                n3 = 17;
                break;
            }
            case 1211: {
                if (!string.equals("$_")) break;
                n3 = 16;
                break;
            }
            case 1173: {
                if (!string.equals("$9")) break;
                n3 = 15;
                break;
            }
            case 1172: {
                if (!string.equals("$8")) break;
                n3 = 14;
                break;
            }
            case 1171: {
                if (!string.equals("$7")) break;
                n3 = 13;
                break;
            }
            case 1170: {
                if (!string.equals("$6")) break;
                n3 = 12;
                break;
            }
            case 1169: {
                if (!string.equals("$5")) break;
                n3 = 11;
                break;
            }
            case 1168: {
                if (!string.equals("$4")) break;
                n3 = 10;
                break;
            }
            case 1167: {
                if (!string.equals("$3")) break;
                n3 = 9;
                break;
            }
            case 1166: {
                if (!string.equals("$2")) break;
                n3 = 8;
                break;
            }
            case 1165: {
                if (!string.equals("$1")) break;
                n3 = 7;
                break;
            }
            case 1159: {
                if (!string.equals("$+")) break;
                n3 = 6;
                break;
            }
            case 1158: {
                if (!string.equals("$*")) break;
                n3 = 5;
                break;
            }
            case 1155: {
                if (!string.equals("$'")) break;
                n3 = 4;
                break;
            }
            case 1154: {
                if (!string.equals("$&")) break;
                n3 = 3;
                break;
            }
            case -223254616: {
                if (!string.equals("leftContext")) break;
                n3 = 2;
                break;
            }
            case -1206239059: {
                if (!string.equals("multiline")) break;
                n3 = 1;
                break;
            }
            case -1304775693: {
                if (!string.equals("rightContext")) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 5;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 17: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 4;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 19;
                break;
            }
            case 12: {
                n3 = 18;
                break;
            }
            case 11: {
                n3 = 17;
                break;
            }
            case 10: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 15;
                break;
            }
            case 8: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 0: {
                n3 = 11;
            }
        }
        if (n3 == 0) {
            return super.findInstanceIdInfo(string);
        }
        n2 = n3 != 1 ? (n3 != 2 ? (n3 != 3 ? (n3 != 4 ? 5 : this.underscoreAttr) : this.inputAttr) : this.starAttr) : this.multilineAttr;
        return IdScriptableObject.instanceIdInfo(n2, super.getMaxInstanceId() + n3);
    }

    @Override
    public int getArity() {
        return 2;
    }

    @Override
    public String getFunctionName() {
        return "RegExp";
    }

    @Override
    protected String getInstanceIdName(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (1 <= n3 && n3 <= 21) {
            switch (n3) {
                default: {
                    return new String(new char[]{'$', (char)(n3 - 12 - 1 + 49)});
                }
                case 12: {
                    return "$'";
                }
                case 11: {
                    return "rightContext";
                }
                case 10: {
                    return "$`";
                }
                case 9: {
                    return "leftContext";
                }
                case 8: {
                    return "$+";
                }
                case 7: {
                    return "lastParen";
                }
                case 6: {
                    return "$&";
                }
                case 5: {
                    return "lastMatch";
                }
                case 4: {
                    return "$_";
                }
                case 3: {
                    return "input";
                }
                case 2: {
                    return "$*";
                }
                case 1: 
            }
            return "multiline";
        }
        return super.getInstanceIdName(n2);
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        int n3 = n2 - super.getMaxInstanceId();
        if (1 <= n3 && n3 <= 21) {
            Object object = NativeRegExpCtor.getImpl();
            switch (n3) {
                default: {
                    object = ((RegExpImpl)object).getParenSubString(n3 - 12 - 1);
                    break;
                }
                case 11: 
                case 12: {
                    object = ((RegExpImpl)object).rightContext;
                    break;
                }
                case 9: 
                case 10: {
                    object = ((RegExpImpl)object).leftContext;
                    break;
                }
                case 7: 
                case 8: {
                    object = ((RegExpImpl)object).lastParen;
                    break;
                }
                case 5: 
                case 6: {
                    object = ((RegExpImpl)object).lastMatch;
                    break;
                }
                case 3: 
                case 4: {
                    object = ((RegExpImpl)object).input;
                    break;
                }
                case 1: 
                case 2: {
                    return ScriptRuntime.wrapBoolean(((RegExpImpl)object).multiline);
                }
            }
            object = object == null ? "" : object.toString();
            return object;
        }
        return super.getInstanceIdValue(n2);
    }

    @Override
    public int getLength() {
        return 2;
    }

    @Override
    protected int getMaxInstanceId() {
        return super.getMaxInstanceId() + 21;
    }

    @Override
    protected void setInstanceIdAttributes(int n2, int n3) {
        int n4 = n2 - super.getMaxInstanceId();
        switch (n4) {
            default: {
                n4 = n4 - 12 - 1;
                if (n4 < 0 || n4 > 8) break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                return;
            }
            case 4: {
                this.underscoreAttr = n3;
                return;
            }
            case 3: {
                this.inputAttr = n3;
                return;
            }
            case 2: {
                this.starAttr = n3;
                return;
            }
            case 1: {
                this.multilineAttr = n3;
                return;
            }
        }
        super.setInstanceIdAttributes(n2, n3);
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        int n3 = n2 - super.getMaxInstanceId();
        switch (n3) {
            default: {
                n3 = n3 - 12 - 1;
                if (n3 < 0 || n3 > 8) break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                return;
            }
            case 3: 
            case 4: {
                NativeRegExpCtor.getImpl().input = ScriptRuntime.toString(object);
                return;
            }
            case 1: 
            case 2: {
                NativeRegExpCtor.getImpl().multiline = ScriptRuntime.toBoolean(object);
                return;
            }
        }
        super.setInstanceIdValue(n2, object);
    }
}

