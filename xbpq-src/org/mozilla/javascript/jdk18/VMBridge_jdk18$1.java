/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.jdk18;

import com.github.catvod.spider.merge.C.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.jdk18.VMBridge_jdk18;

class VMBridge_jdk18$1
implements InvocationHandler {
    final VMBridge_jdk18 this$0;
    final InterfaceAdapter val$adapter;
    final ContextFactory val$cf;
    final Object val$target;
    final Scriptable val$topScope;

    VMBridge_jdk18$1(VMBridge_jdk18 vMBridge_jdk18, Object object, InterfaceAdapter interfaceAdapter, ContextFactory contextFactory, Scriptable scriptable) {
        this.this$0 = vMBridge_jdk18;
        this.val$target = object;
        this.val$adapter = interfaceAdapter;
        this.val$cf = contextFactory;
        this.val$topScope = scriptable;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objectArray) {
        if (method.getDeclaringClass() == Object.class) {
            String string = method.getName();
            if (string.equals("equals")) {
                boolean bl = false;
                if (object == objectArray[0]) {
                    bl = true;
                }
                return bl;
            }
            if (string.equals("hashCode")) {
                return this.val$target.hashCode();
            }
            if (string.equals("toString")) {
                object = a.c("Proxy[");
                ((StringBuilder)object).append(this.val$target.toString());
                ((StringBuilder)object).append("]");
                return ((StringBuilder)object).toString();
            }
        }
        return this.val$adapter.invoke(this.val$cf, this.val$target, this.val$topScope, object, method, objectArray);
    }
}

