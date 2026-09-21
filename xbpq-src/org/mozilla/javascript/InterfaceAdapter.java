/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.h1.b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ClassCache;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.VMBridge;
import org.mozilla.javascript.WrapFactory;

public class InterfaceAdapter {
    private final Object proxyHelper;

    private InterfaceAdapter(ContextFactory contextFactory, Class<?> clazz) {
        this.proxyHelper = VMBridge.instance.getInterfaceProxyHelper(contextFactory, new Class[]{clazz});
    }

    public static /* synthetic */ Object a(InterfaceAdapter interfaceAdapter, Object object, Scriptable scriptable, Object object2, Method method, Object[] objectArray, Context context) {
        return interfaceAdapter.lambda$invoke$0(object, scriptable, object2, method, objectArray, context);
    }

    /*
     * WARNING - void declaration
     */
    static Object create(Context object, Class<?> clazz, ScriptableObject scriptableObject) {
        void var1_6;
        if (var1_6.isInterface()) {
            void var0_5;
            void var2_7;
            Scriptable scriptable = ScriptRuntime.getTopCallScope((Context)object);
            ClassCache classCache = ClassCache.get(scriptable);
            Object object2 = (InterfaceAdapter)classCache.getInterfaceAdapter((Class<?>)var1_6);
            ContextFactory contextFactory = ((Context)object).getFactory();
            if (object2 == null) {
                if (var2_7 instanceof Callable) {
                    Method[] methodArray = var1_6.getMethods();
                    object2 = new HashSet();
                    HashSet<String> hashSet = new HashSet<String>();
                    for (Method method : methodArray) {
                        if (InterfaceAdapter.isFunctionalMethodCandidate(method)) {
                            ((HashSet)object2).add(method.getName());
                            if (((HashSet)object2).size() <= 1) continue;
                            break;
                        }
                        hashSet.add(method.getName());
                    }
                    int n2 = !(((HashSet)object2).size() == 1 || ((HashSet)object2).isEmpty() && hashSet.size() == 1) ? 0 : 1;
                    if (n2 == 0) {
                        if (((HashSet)object2).isEmpty() && hashSet.isEmpty()) {
                            throw Context.reportRuntimeErrorById("msg.no.empty.interface.conversion", var1_6.getName());
                        }
                        throw Context.reportRuntimeErrorById("msg.no.function.interface.conversion", var1_6.getName());
                    }
                }
                InterfaceAdapter interfaceAdapter = new InterfaceAdapter(contextFactory, (Class<?>)var1_6);
                classCache.cacheInterfaceAdapter((Class<?>)var1_6, interfaceAdapter);
            } else {
                InterfaceAdapter interfaceAdapter = object2;
            }
            return VMBridge.instance.newInterfaceProxy(var0_5.proxyHelper, contextFactory, (InterfaceAdapter)var0_5, var2_7, scriptable);
        }
        throw new IllegalArgumentException();
    }

    private static boolean isFunctionalMethodCandidate(Method method) {
        if (!(method.getName().equals("equals") || method.getName().equals("hashCode") || method.getName().equals("toString"))) {
            return Modifier.isAbstract(method.getModifiers());
        }
        return false;
    }

    private /* synthetic */ Object lambda$invoke$0(Object object, Scriptable scriptable, Object object2, Method method, Object[] objectArray, Context context) {
        return this.invokeImpl(context, object, scriptable, object2, method, objectArray);
    }

    public Object invoke(ContextFactory contextFactory, Object object, Scriptable scriptable, Object object2, Method method, Object[] objectArray) {
        return contextFactory.call(new b(this, object, scriptable, object2, method, objectArray));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    Object invokeImpl(Context object, Object object2, Scriptable scriptable, Object object3, Method method, Object[] objectArray) {
        void var2_10;
        void var4_13;
        void var3_12;
        void var6_15;
        void var2_3;
        Object object4;
        void var5_14;
        boolean bl = object2 instanceof Callable;
        int n2 = 0;
        Object var10_18 = null;
        if (!bl) {
            Scriptable scriptable2 = (Scriptable)object2;
            object4 = var5_14.getName();
            Object object5 = ScriptableObject.getProperty(scriptable2, (String)object4);
            if (object5 == Scriptable.NOT_FOUND) {
                Context.reportWarning(ScriptRuntime.getMessageById("msg.undefined.function.interface", object4));
                object = var5_14.getReturnType();
                if (object != Void.TYPE) return Context.jsToJava(null, object);
                return null;
            }
            if (!(object5 instanceof Callable)) {
                throw Context.reportRuntimeErrorById("msg.not.function.interface", object4);
            }
        }
        Callable callable = (Callable)var2_3;
        object4 = ((Context)object).getWrapFactory();
        if (var6_15 == null) {
            Object[] objectArray2 = ScriptRuntime.emptyArgs;
        } else {
            int n3 = ((void)var6_15).length;
            while (true) {
                void var2_8 = var6_15;
                if (n2 == n3) break;
                void var2_9 = var6_15[n2];
                if (!(var2_9 instanceof String || var2_9 instanceof Number || var2_9 instanceof Boolean)) {
                    var6_15[n2] = ((WrapFactory)object4).wrap((Context)object, (Scriptable)var3_12, var2_9, null);
                }
                ++n2;
            }
        }
        object = callable.call((Context)object, (Scriptable)var3_12, ((WrapFactory)object4).wrapAsJavaObject((Context)object, (Scriptable)var3_12, var4_13, null), (Object[])var2_10);
        Class<?> clazz = var5_14.getReturnType();
        if (clazz != Void.TYPE) return Context.jsToJava(object, clazz);
        return var10_18;
    }
}

