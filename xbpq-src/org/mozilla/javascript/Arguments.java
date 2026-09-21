/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Arguments$ThrowTypeError;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.TopLevel$Builtins;
import org.mozilla.javascript.UniqueTag;

final class Arguments
extends IdScriptableObject {
    private static final String FTAG = "Arguments";
    private static final int Id_callee = 1;
    private static final int Id_caller = 3;
    private static final int Id_length = 2;
    private static final int MAX_INSTANCE_ID = 3;
    private static final long serialVersionUID = 4275508002492040609L;
    private NativeCall activation;
    private Object[] args;
    private int calleeAttr = 2;
    private Object calleeObj;
    private int callerAttr = 2;
    private Object callerObj;
    private int lengthAttr = 2;
    private Object lengthObj;

    public Arguments(NativeCall object) {
        this.activation = object;
        Scriptable scriptable = ((ScriptableObject)object).getParentScope();
        this.setParentScope(scriptable);
        this.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        Object[] objectArray = ((NativeCall)object).originalArgs;
        this.args = objectArray;
        this.lengthObj = objectArray.length;
        this.calleeObj = object = ((NativeCall)object).function;
        int n2 = ((NativeFunction)object).getLanguageVersion();
        object = n2 <= 130 && n2 != 0 ? null : Scriptable.NOT_FOUND;
        this.callerObj = object;
        this.defineProperty(SymbolKey.ITERATOR, TopLevel.getBuiltinPrototype(ScriptableObject.getTopLevelScope(scriptable), TopLevel$Builtins.Array).get("values", scriptable), 2);
    }

    private Object arg(int n2) {
        Object[] objectArray;
        if (n2 >= 0 && (objectArray = this.args).length > n2) {
            return objectArray[n2];
        }
        return Scriptable.NOT_FOUND;
    }

    private Object getFromActivation(int n2) {
        String string = this.activation.function.getParamOrVarName(n2);
        NativeCall nativeCall = this.activation;
        return nativeCall.get(string, (Scriptable)nativeCall);
    }

    private void putIntoActivation(int n2, Object object) {
        String string = this.activation.function.getParamOrVarName(n2);
        NativeCall nativeCall = this.activation;
        nativeCall.put(string, (Scriptable)nativeCall, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void removeArg(int n2) {
        synchronized (this) {
            Object[] objectArray = this.args;
            Object object = objectArray[n2];
            Object object2 = Scriptable.NOT_FOUND;
            if (object != object2) {
                if (objectArray == this.activation.originalArgs) {
                    this.args = (Object[])objectArray.clone();
                }
                this.args[n2] = object2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void replaceArg(int n2, Object object) {
        if (this.sharedWithActivation(n2)) {
            this.putIntoActivation(n2, object);
        }
        synchronized (this) {
            Object[] objectArray = this.args;
            if (objectArray == this.activation.originalArgs) {
                this.args = (Object[])objectArray.clone();
            }
            this.args[n2] = object;
            return;
        }
    }

    private boolean sharedWithActivation(int n2) {
        if (Context.getContext().isStrictMode()) {
            return false;
        }
        NativeFunction nativeFunction = this.activation.function;
        int n3 = nativeFunction.getParamCount();
        if (n2 < n3) {
            if (n2 < n3 - 1) {
                String string = nativeFunction.getParamOrVarName(n2);
                ++n2;
                while (n2 < n3) {
                    if (string.equals(nativeFunction.getParamOrVarName(n2))) {
                        return false;
                    }
                    ++n2;
                }
            }
            return true;
        }
        return false;
    }

    void defineAttributesForStrictMode() {
        if (!Context.getContext().isStrictMode()) {
            return;
        }
        this.setGetterOrSetter("caller", 0, new Arguments$ThrowTypeError("caller"), true);
        this.setGetterOrSetter("caller", 0, new Arguments$ThrowTypeError("caller"), false);
        this.setGetterOrSetter("callee", 0, new Arguments$ThrowTypeError("callee"), true);
        this.setGetterOrSetter("callee", 0, new Arguments$ThrowTypeError("callee"), false);
        this.setAttributes("caller", 6);
        this.setAttributes("callee", 6);
        this.callerObj = null;
        this.calleeObj = null;
    }

    @Override
    protected void defineOwnProperty(Context object, Object object2, ScriptableObject scriptableObject, boolean bl) {
        int n2;
        super.defineOwnProperty((Context)object, object2, scriptableObject, bl);
        if (ScriptRuntime.isSymbol(object2)) {
            return;
        }
        double d2 = ScriptRuntime.toNumber(object2);
        if (d2 != (double)(n2 = (int)d2)) {
            return;
        }
        object2 = this.arg(n2);
        if (object2 == (object = Scriptable.NOT_FOUND)) {
            return;
        }
        if (ScriptableObject.isAccessorDescriptor(scriptableObject)) {
            this.removeArg(n2);
            return;
        }
        object2 = ScriptableObject.getProperty((Scriptable)scriptableObject, "value");
        if (object2 == object) {
            return;
        }
        this.replaceArg(n2, object2);
        if (ScriptableObject.isFalse(ScriptableObject.getProperty((Scriptable)scriptableObject, "writable"))) {
            this.removeArg(n2);
        }
    }

    @Override
    public void delete(int n2) {
        if (n2 >= 0 && n2 < this.args.length) {
            this.removeArg(n2);
        }
        super.delete(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int findInstanceIdInfo(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 0;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case -1106363674: {
                if (!string.equals("length")) break;
                n4 = 2;
                break;
            }
            case -1367775349: {
                if (!string.equals("caller")) break;
                n4 = 1;
                break;
            }
            case -1367775362: {
                if (!string.equals("callee")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n4 = n3;
                break;
            }
            case 2: {
                n4 = 2;
                break;
            }
            case 1: {
                n4 = 3;
                break;
            }
            case 0: {
                n4 = 1;
            }
        }
        if (Context.getContext().isStrictMode() && (n4 == 1 || n4 == 3)) {
            return super.findInstanceIdInfo(string);
        }
        if (n4 == 0) {
            return super.findInstanceIdInfo(string);
        }
        if (n4 != 1) {
            if (n4 != 2) {
                if (n4 != 3) throw new IllegalStateException();
                n3 = this.callerAttr;
                return IdScriptableObject.instanceIdInfo(n3, n4);
            } else {
                n3 = this.lengthAttr;
            }
            return IdScriptableObject.instanceIdInfo(n3, n4);
        } else {
            n3 = this.calleeAttr;
        }
        return IdScriptableObject.instanceIdInfo(n3, n4);
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        Object object = this.arg(n2);
        if (object == Scriptable.NOT_FOUND) {
            return super.get(n2, scriptable);
        }
        if (this.sharedWithActivation(n2)) {
            return this.getFromActivation(n2);
        }
        return object;
    }

    @Override
    public String getClassName() {
        return FTAG;
    }

    @Override
    Object[] getIds(boolean bl, boolean bl2) {
        Object[] objectArray = super.getIds(bl, bl2);
        Object[] objectArray2 = this.args;
        Object object = objectArray;
        if (objectArray2.length != 0) {
            int n2;
            int n3;
            int n4 = objectArray2.length;
            boolean[] blArray = new boolean[n4];
            int n5 = objectArray2.length;
            int n6 = 0;
            for (n3 = 0; n3 != objectArray.length; ++n3) {
                object = objectArray[n3];
                n2 = n5;
                if (object instanceof Integer) {
                    int n7 = (Integer)object;
                    n2 = n5;
                    if (n7 >= 0) {
                        n2 = n5;
                        if (n7 < this.args.length) {
                            n2 = n5;
                            if (!blArray[n7]) {
                                blArray[n7] = true;
                                n2 = n5 - 1;
                            }
                        }
                    }
                }
                n5 = n2;
            }
            n3 = n5;
            if (!bl) {
                n2 = 0;
                while (true) {
                    n3 = n5;
                    if (n2 >= n4) break;
                    n3 = n5;
                    if (!blArray[n2]) {
                        n3 = n5;
                        if (super.has(n2, (Scriptable)this)) {
                            blArray[n2] = true;
                            n3 = n5 - 1;
                        }
                    }
                    ++n2;
                    n5 = n3;
                }
            }
            object = objectArray;
            if (n3 != 0) {
                object = new Object[objectArray.length + n3];
                System.arraycopy(objectArray, 0, object, n3, objectArray.length);
                n4 = 0;
                for (n2 = n6; n2 != this.args.length; ++n2) {
                    n5 = n4;
                    if (!blArray[n2]) {
                        object[n4] = n2;
                        n5 = n4 + 1;
                    }
                    n4 = n5;
                }
                if (n4 != n3) {
                    Kit.codeBug();
                }
            }
        }
        return object;
    }

    @Override
    protected String getInstanceIdName(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return null;
                }
                return "caller";
            }
            return "length";
        }
        return "callee";
    }

    @Override
    protected Object getInstanceIdValue(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                Object object;
                if (n2 != 3) {
                    return super.getInstanceIdValue(n2);
                }
                Object object2 = this.callerObj;
                if (object2 == UniqueTag.NULL_VALUE) {
                    object = null;
                } else {
                    object = object2;
                    if (object2 == null) {
                        NativeCall nativeCall = this.activation.parentActivationCall;
                        object = object2;
                        if (nativeCall != null) {
                            object = nativeCall.get("arguments", (Scriptable)nativeCall);
                        }
                    }
                }
                return object;
            }
            return this.lengthObj;
        }
        return this.calleeObj;
    }

    @Override
    protected int getMaxInstanceId() {
        return 3;
    }

    @Override
    protected ScriptableObject getOwnPropertyDescriptor(Context object, Object object2) {
        if (!ScriptRuntime.isSymbol(object2) && !(object2 instanceof Scriptable)) {
            int n2;
            double d2 = ScriptRuntime.toNumber(object2);
            if (d2 != (double)(n2 = (int)d2)) {
                return super.getOwnPropertyDescriptor((Context)object, object2);
            }
            Object object3 = this.arg(n2);
            if (object3 == Scriptable.NOT_FOUND) {
                return super.getOwnPropertyDescriptor((Context)object, object2);
            }
            if (this.sharedWithActivation(n2)) {
                object3 = this.getFromActivation(n2);
            }
            if (super.has(n2, (Scriptable)this)) {
                object = super.getOwnPropertyDescriptor((Context)object, object2);
                ((ScriptableObject)object).put("value", (Scriptable)object, object3);
                return object;
            }
            object = object2 = this.getParentScope();
            if (object2 == null) {
                object = this;
            }
            return ScriptableObject.buildDataDescriptor((Scriptable)object, object3, 0);
        }
        return super.getOwnPropertyDescriptor((Context)object, object2);
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        if (this.arg(n2) != Scriptable.NOT_FOUND) {
            return true;
        }
        return super.has(n2, scriptable);
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        if (this.arg(n2) == Scriptable.NOT_FOUND) {
            super.put(n2, scriptable, object);
        } else {
            this.replaceArg(n2, object);
        }
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        super.put(string, scriptable, object);
    }

    @Override
    protected void setInstanceIdAttributes(int n2, int n3) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    super.setInstanceIdAttributes(n2, n3);
                    return;
                }
                this.callerAttr = n3;
                return;
            }
            this.lengthAttr = n3;
            return;
        }
        this.calleeAttr = n3;
    }

    @Override
    protected void setInstanceIdValue(int n2, Object object) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    super.setInstanceIdValue(n2, object);
                    return;
                }
                if (object == null) {
                    object = UniqueTag.NULL_VALUE;
                }
                this.callerObj = object;
                return;
            }
            this.lengthObj = object;
            return;
        }
        this.calleeObj = object;
    }
}

