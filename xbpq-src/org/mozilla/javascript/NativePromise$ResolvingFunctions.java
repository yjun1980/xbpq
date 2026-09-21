/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.B;
import org.mozilla.javascript.C;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.D;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel$NativeErrors;
import org.mozilla.javascript.Undefined;

class NativePromise$ResolvingFunctions {
    private boolean alreadyResolved = false;
    LambdaFunction reject;
    LambdaFunction resolve;

    NativePromise$ResolvingFunctions(Scriptable scriptable, NativePromise nativePromise) {
        this.resolve = new LambdaFunction(scriptable, 1, new C(this, nativePromise));
        this.reject = new LambdaFunction(scriptable, 1, new D(this, nativePromise));
    }

    public static /* synthetic */ Object a(NativePromise$ResolvingFunctions nativePromise$ResolvingFunctions, NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return nativePromise$ResolvingFunctions.lambda$new$0(nativePromise, context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ void b(NativePromise nativePromise, Context context, Scriptable scriptable, Object object, Object object2) {
        NativePromise$ResolvingFunctions.lambda$resolve$2(nativePromise, context, scriptable, object, object2);
    }

    public static /* synthetic */ Object c(NativePromise$ResolvingFunctions nativePromise$ResolvingFunctions, NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return nativePromise$ResolvingFunctions.lambda$new$1(nativePromise, context, scriptable, scriptable2, objectArray);
    }

    private /* synthetic */ Object lambda$new$0(NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable object, Object[] objectArray) {
        object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        return this.resolve(context, scriptable, nativePromise, object);
    }

    private /* synthetic */ Object lambda$new$1(NativePromise nativePromise, Context context, Scriptable scriptable, Scriptable object, Object[] objectArray) {
        object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        return this.reject(context, scriptable, nativePromise, object);
    }

    private static /* synthetic */ void lambda$resolve$2(NativePromise nativePromise, Context context, Scriptable scriptable, Object object, Object object2) {
        NativePromise.access$200(nativePromise, context, scriptable, object, (Callable)object2);
    }

    private Object reject(Context context, Scriptable scriptable, NativePromise nativePromise, Object object) {
        if (this.alreadyResolved) {
            return Undefined.instance;
        }
        this.alreadyResolved = true;
        return NativePromise.access$000(nativePromise, context, scriptable, object);
    }

    private Object resolve(Context context, Scriptable scriptable, NativePromise nativePromise, Object object) {
        if (this.alreadyResolved) {
            return Undefined.instance;
        }
        this.alreadyResolved = true;
        if (object == nativePromise) {
            return NativePromise.access$000(nativePromise, context, scriptable, ScriptRuntime.newNativeError(context, scriptable, TopLevel$NativeErrors.TypeError, new Object[]{"No promise self-resolution"}));
        }
        if (!ScriptRuntime.isObject(object)) {
            return NativePromise.access$100(nativePromise, context, scriptable, object);
        }
        Object object2 = ScriptableObject.getProperty(ScriptableObject.ensureScriptable(object), "then");
        if (!(object2 instanceof Callable)) {
            return NativePromise.access$100(nativePromise, context, scriptable, object);
        }
        context.enqueueMicrotask(new B(nativePromise, context, scriptable, object, object2));
        return Undefined.instance;
    }
}

