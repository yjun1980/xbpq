/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

final class NativeBoolean
extends IdScriptableObject {
    private static final Object BOOLEAN_TAG = "Boolean";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final long serialVersionUID = -3716996899943880933L;
    private boolean booleanValue;

    NativeBoolean(boolean bl) {
        this.booleanValue = bl;
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeBoolean(false).exportAsJSClass(4, scriptable, bl);
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(BOOLEAN_TAG)) {
            return super.execIdCall((IdFunctionObject)object, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        if (n2 == 1) {
            n2 = objectArray.length;
            boolean bl = false;
            if (!(n2 == 0 || objectArray[0] instanceof ScriptableObject && ((ScriptableObject)objectArray[0]).avoidObjectDetection())) {
                bl = ScriptRuntime.toBoolean(objectArray[0]);
            }
            if (scriptable2 == null) {
                return new NativeBoolean(bl);
            }
            return ScriptRuntime.wrapBoolean(bl);
        }
        boolean bl = IdScriptableObject.ensureType((Object)scriptable2, NativeBoolean.class, (IdFunctionObject)object).booleanValue;
        if (n2 != 2) {
            if (n2 != 3) {
                if (n2 == 4) {
                    return ScriptRuntime.wrapBoolean(bl);
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            object = bl ? "(new Boolean(true))" : "(new Boolean(false))";
            return object;
        }
        object = bl ? "true" : "false";
        return object;
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 3;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
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
            case 3: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 2;
            }
            case 0: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Boolean";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        if (clazz == ScriptRuntime.BooleanClass) {
            return ScriptRuntime.wrapBoolean(this.booleanValue);
        }
        return super.getDefaultValue(clazz);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        String string;
        int n3 = 0;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) throw new IllegalArgumentException(String.valueOf(n2));
                    string = "valueOf";
                } else {
                    string = "toSource";
                }
            } else {
                string = "toString";
            }
        } else {
            string = "constructor";
            n3 = 1;
        }
        this.initPrototypeMethod(BOOLEAN_TAG, n2, string, n3);
    }
}

