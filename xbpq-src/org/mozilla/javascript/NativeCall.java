/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Arguments;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

public final class NativeCall
extends IdScriptableObject {
    private static final Object CALL_TAG = "Call";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    private static final long serialVersionUID = -7471457301304454454L;
    private Arguments arguments;
    NativeFunction function;
    boolean isStrict;
    Object[] originalArgs;
    transient NativeCall parentActivationCall;

    NativeCall() {
    }

    NativeCall(NativeFunction nativeFunction, Context object, Scriptable object2, Object[] objectArray, boolean bl, boolean bl2, boolean bl3) {
        int n2;
        this.function = nativeFunction;
        this.setParentScope((Scriptable)object2);
        Object[] objectArray2 = objectArray == null ? ScriptRuntime.emptyArgs : objectArray;
        this.originalArgs = objectArray2;
        this.isStrict = bl2;
        int n3 = nativeFunction.getParamAndVarCount();
        int n4 = nativeFunction.getParamCount();
        if (n3 != 0) {
            int n5 = 0;
            if (bl3) {
                if (objectArray.length >= n4) {
                    objectArray2 = new Object[objectArray.length - n4];
                    System.arraycopy(objectArray, n4, objectArray2, 0, objectArray.length - n4);
                    n2 = n5;
                } else {
                    objectArray2 = ScriptRuntime.emptyArgs;
                    n2 = n5;
                }
                while (n2 < n4) {
                    String string = nativeFunction.getParamOrVarName(n2);
                    Object object3 = n2 < objectArray.length ? objectArray[n2] : Undefined.instance;
                    this.defineProperty(string, object3, 4);
                    ++n2;
                }
                this.defineProperty(nativeFunction.getParamOrVarName(n4), (Object)((Context)object).newArray((Scriptable)object2, objectArray2), 4);
            } else {
                for (n2 = 0; n2 < n4; ++n2) {
                    object2 = nativeFunction.getParamOrVarName(n2);
                    object = n2 < objectArray.length ? objectArray[n2] : Undefined.instance;
                    this.defineProperty((String)object2, object, 4);
                }
            }
        }
        if (!super.has("arguments", (Scriptable)this) && !bl) {
            this.arguments = object = new Arguments(this);
            this.defineProperty("arguments", object, 4);
        }
        if (n3 != 0) {
            for (n2 = n4; n2 < n3; ++n2) {
                object = nativeFunction.getParamOrVarName(n2);
                if (super.has((String)object, (Scriptable)this)) continue;
                if (nativeFunction.getParamOrVarConst(n2)) {
                    this.defineProperty((String)object, Undefined.instance, 13);
                    continue;
                }
                if (nativeFunction instanceof InterpretedFunction && !((InterpretedFunction)nativeFunction).hasFunctionNamed((String)object)) continue;
                this.defineProperty((String)object, Undefined.instance, 4);
            }
        }
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeCall().exportAsJSClass(1, scriptable, bl);
    }

    public void defineAttributesForArguments() {
        Arguments arguments = this.arguments;
        if (arguments != null) {
            arguments.defineAttributesForStrictMode();
        }
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(CALL_TAG)) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        if (n2 == 1) {
            if (scriptable2 == null) {
                ScriptRuntime.checkDeprecated(context, "Call");
                idScriptableObject = new NativeCall();
                idScriptableObject.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
                return idScriptableObject;
            }
            throw Context.reportRuntimeErrorById("msg.only.from.new", "Call");
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }

    @Override
    protected int findPrototypeId(String string) {
        return string.equals("constructor") ? 1 : 0;
    }

    @Override
    public String getClassName() {
        return "Call";
    }

    @Override
    protected void initPrototypeId(int n2) {
        if (n2 == 1) {
            this.initPrototypeMethod(CALL_TAG, n2, "constructor", 1);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }
}

