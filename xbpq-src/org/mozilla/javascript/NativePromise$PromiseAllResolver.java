/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.ArrayList;
import org.mozilla.javascript.A;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IteratorLikeIterable$Itr;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.NativePromise$Capability;
import org.mozilla.javascript.NativePromise$PromiseElementResolver;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.z;

class NativePromise$PromiseAllResolver {
    private static final int MAX_PROMISES = 0x200000;
    NativePromise$Capability capability;
    boolean failFast;
    IteratorLikeIterable$Itr iterator;
    int remainingElements = 1;
    Scriptable thisObj;
    final ArrayList<Object> values = new ArrayList();

    NativePromise$PromiseAllResolver(IteratorLikeIterable$Itr iteratorLikeIterable$Itr, Scriptable scriptable, NativePromise$Capability nativePromise$Capability, boolean bl) {
        this.iterator = iteratorLikeIterable$Itr;
        this.thisObj = scriptable;
        this.capability = nativePromise$Capability;
        this.failFast = bl;
    }

    public static /* synthetic */ Object a(NativePromise$PromiseAllResolver nativePromise$PromiseAllResolver, NativePromise$PromiseElementResolver nativePromise$PromiseElementResolver, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return nativePromise$PromiseAllResolver.lambda$resolve$1(nativePromise$PromiseElementResolver, context, scriptable, scriptable2, objectArray);
    }

    public static /* synthetic */ Object b(NativePromise$PromiseAllResolver nativePromise$PromiseAllResolver, NativePromise$PromiseElementResolver nativePromise$PromiseElementResolver, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return nativePromise$PromiseAllResolver.lambda$resolve$0(nativePromise$PromiseElementResolver, context, scriptable, scriptable2, objectArray);
    }

    private /* synthetic */ Object lambda$resolve$0(NativePromise$PromiseElementResolver nativePromise$PromiseElementResolver, Context context, Scriptable scriptable, Scriptable object, Object[] object2) {
        object = ((Object[])object2).length > 0 ? object2[0] : Undefined.instance;
        object2 = object;
        if (!this.failFast) {
            object2 = context.newObject(scriptable);
            object2.put("status", (Scriptable)object2, (Object)"fulfilled");
            object2.put("value", (Scriptable)object2, object);
        }
        return nativePromise$PromiseElementResolver.resolve(context, scriptable, object2, this);
    }

    private /* synthetic */ Object lambda$resolve$1(NativePromise$PromiseElementResolver nativePromise$PromiseElementResolver, Context context, Scriptable scriptable, Scriptable object, Object[] objectArray) {
        Scriptable scriptable2 = context.newObject(scriptable);
        scriptable2.put("status", scriptable2, (Object)" rejected");
        object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
        scriptable2.put("reason", scriptable2, object);
        return nativePromise$PromiseElementResolver.resolve(context, scriptable, scriptable2, this);
    }

    void finalResolution(Context context, Scriptable scriptable) {
        Scriptable scriptable2 = context.newArray(scriptable, this.values.toArray());
        this.capability.resolve.call(context, scriptable, Undefined.SCRIPTABLE_UNDEFINED, new Object[]{scriptable2});
    }

    Object resolve(Context context, Scriptable scriptable) {
        Callable callable = ScriptRuntime.getPropFunctionAndThis(this.thisObj, "resolve", context, scriptable);
        Scriptable scriptable2 = ScriptRuntime.lastStoredScriptable(context);
        for (int i2 = 0; i2 != 0x200000; ++i2) {
            Object object;
            boolean bl;
            Object object2;
            block7: {
                object2 = Undefined.instance;
                try {
                    bl = this.iterator.hasNext();
                    if (!bl) break block7;
                }
                catch (Throwable throwable) {
                    this.iterator.setDone(true);
                    throw throwable;
                }
                object = this.iterator.next();
            }
            object = object2;
            if (!bl) {
                this.remainingElements = i2 = this.remainingElements - 1;
                if (i2 == 0) {
                    this.finalResolution(context, scriptable);
                }
                return this.capability.promise;
            }
            this.values.add(object2);
            Object object3 = callable.call(context, scriptable, scriptable2, new Object[]{object});
            NativePromise$PromiseElementResolver nativePromise$PromiseElementResolver = new NativePromise$PromiseElementResolver(i2);
            object2 = new LambdaFunction(scriptable, 1, new A(this, nativePromise$PromiseElementResolver));
            object = this.capability.reject;
            if (!this.failFast) {
                object = new LambdaFunction(scriptable, 1, new z(this, nativePromise$PromiseElementResolver));
                ((BaseFunction)object).setStandardPropertyAttributes(3);
            }
            ++this.remainingElements;
            ScriptRuntime.getPropFunctionAndThis(object3, "then", context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), new Object[]{object2, object});
        }
        throw ScriptRuntime.rangeErrorById("msg.promise.all.toobig", new Object[0]);
    }
}

