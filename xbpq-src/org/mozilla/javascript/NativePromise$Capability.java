/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.y;

class NativePromise$Capability {
    Object promise;
    private Object rawReject;
    private Object rawResolve;
    Callable reject;
    Callable resolve;

    NativePromise$Capability(Context object, Scriptable scriptable, Object object2) {
        Object object3;
        this.rawResolve = object3 = Undefined.instance;
        this.rawReject = object3;
        if (object2 instanceof Constructable) {
            this.promise = ((Constructable)object2).construct((Context)object, scriptable, new Object[]{new LambdaFunction(scriptable, 2, new y(this))});
            object = this.rawResolve;
            if (object instanceof Callable) {
                this.resolve = (Callable)object;
                object = this.rawReject;
                if (object instanceof Callable) {
                    this.reject = (Callable)object;
                    return;
                }
                throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
            }
            throw ScriptRuntime.typeErrorById("msg.function.expected", new Object[0]);
        }
        throw ScriptRuntime.typeErrorById("msg.constructor.expected", new Object[0]);
    }

    public static /* synthetic */ Object a(NativePromise$Capability nativePromise$Capability, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return nativePromise$Capability.lambda$new$0(context, scriptable, scriptable2, objectArray);
    }

    private Object executor(Object[] objectArray) {
        if (Undefined.isUndefined(this.rawResolve) && Undefined.isUndefined(this.rawReject)) {
            if (objectArray.length > 0) {
                this.rawResolve = objectArray[0];
            }
            if (objectArray.length > 1) {
                this.rawReject = objectArray[1];
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.typeErrorById("msg.promise.capability.state", new Object[0]);
    }

    private /* synthetic */ Object lambda$new$0(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.executor(objectArray);
    }
}

