/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.AccessibleObject;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.InterfaceAdapter;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Scriptable;

public abstract class VMBridge {
    static final VMBridge instance = VMBridge.makeInstance();

    private static VMBridge makeInstance() {
        for (int i2 = 0; i2 != 2; ++i2) {
            Class<?> clazz = Kit.classOrNull((new String[]{"org.mozilla.javascript.VMBridge_custom", "org.mozilla.javascript.jdk18.VMBridge_jdk18"})[i2]);
            if (clazz == null || (clazz = (VMBridge)Kit.newInstanceOrNull(clazz)) == null) continue;
            return clazz;
        }
        throw new IllegalStateException("Failed to create VMBridge instance");
    }

    protected abstract Context getContext(Object var1);

    protected abstract Object getInterfaceProxyHelper(ContextFactory var1, Class<?>[] var2);

    protected abstract Object getThreadContextHelper();

    protected abstract Object newInterfaceProxy(Object var1, ContextFactory var2, InterfaceAdapter var3, Object var4, Scriptable var5);

    protected abstract void setContext(Object var1, Context var2);

    protected abstract boolean tryToMakeAccessible(AccessibleObject var1);
}

