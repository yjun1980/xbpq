/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.AccessController;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory$1;
import org.mozilla.javascript.ContextFactory$1GlobalSetterImpl;
import org.mozilla.javascript.ContextFactory$GlobalSetter;
import org.mozilla.javascript.ContextFactory$Listener;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.xml.XMLLib$Factory;

public class ContextFactory {
    private static ContextFactory global = new ContextFactory();
    private static volatile boolean hasCustomGlobal;
    private ClassLoader applicationClassLoader;
    private boolean disabledListening;
    private volatile Object listeners;
    private final Object listenersLock = new Object();
    private volatile boolean sealed;

    static /* synthetic */ ContextFactory access$000() {
        return global;
    }

    static /* synthetic */ ContextFactory access$002(ContextFactory contextFactory) {
        global = contextFactory;
        return contextFactory;
    }

    public static ContextFactory getGlobal() {
        return global;
    }

    public static ContextFactory$GlobalSetter getGlobalSetter() {
        synchronized (ContextFactory.class) {
            if (!hasCustomGlobal) {
                hasCustomGlobal = true;
                ContextFactory$1GlobalSetterImpl contextFactory$1GlobalSetterImpl = new ContextFactory$1GlobalSetterImpl();
                return contextFactory$1GlobalSetterImpl;
            }
            IllegalStateException illegalStateException = new IllegalStateException();
            throw illegalStateException;
        }
    }

    public static boolean hasExplicitGlobal() {
        return hasCustomGlobal;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void initGlobal(ContextFactory object) {
        synchronized (ContextFactory.class) {
            Throwable throwable2;
            block6: {
                if (object != null) {
                    block5: {
                        try {
                            if (hasCustomGlobal) break block5;
                            hasCustomGlobal = true;
                            global = object;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        return;
                    }
                    object = new IllegalStateException();
                    throw object;
                }
                object = new IllegalArgumentException();
                throw object;
            }
            throw throwable2;
        }
    }

    private static boolean isDom3Present() {
        Class<?> clazz = Kit.classOrNull("org.w3c.dom.Node");
        if (clazz == null) {
            return false;
        }
        try {
            clazz.getMethod("getUserData", String.class);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void addListener(ContextFactory$Listener object) {
        this.checkNotSealed();
        Object object2 = this.listenersLock;
        synchronized (object2) {
            if (!this.disabledListening) {
                this.listeners = Kit.addListener(this.listeners, object);
                return;
            }
            object = new IllegalStateException();
            throw object;
        }
    }

    public final <T> T call(ContextAction<T> contextAction) {
        return Context.call(this, contextAction);
    }

    protected final void checkNotSealed() {
        if (!this.sealed) {
            return;
        }
        throw new IllegalStateException();
    }

    protected GeneratedClassLoader createClassLoader(ClassLoader classLoader) {
        return AccessController.doPrivileged(new ContextFactory$1(this, classLoader));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void disableContextListening() {
        this.checkNotSealed();
        Object object = this.listenersLock;
        synchronized (object) {
            this.disabledListening = true;
            this.listeners = null;
            return;
        }
    }

    protected Object doTopCall(Callable object, Context object2, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        object = object2 = object.call((Context)object2, scriptable, scriptable2, objectArray);
        if (object2 instanceof ConsString) {
            object = object2.toString();
        }
        return object;
    }

    @Deprecated
    public final Context enter() {
        return this.enterContext(null);
    }

    public Context enterContext() {
        return this.enterContext(null);
    }

    public final Context enterContext(Context context) {
        return Context.enter(context, this);
    }

    @Deprecated
    public final void exit() {
        Context.exit();
    }

    public final ClassLoader getApplicationClassLoader() {
        return this.applicationClassLoader;
    }

    protected XMLLib$Factory getE4xImplementationFactory() {
        if (ContextFactory.isDom3Present()) {
            return XMLLib$Factory.create("org.mozilla.javascript.xmlimpl.XMLLibImpl");
        }
        return null;
    }

    protected boolean hasFeature(Context context, int n2) {
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        boolean bl6 = bl;
        boolean bl7 = bl2;
        boolean bl8 = bl3;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            case 21: 
            case 22: {
                return false;
            }
            case 20: {
                return true;
            }
            case 17: 
            case 18: 
            case 19: {
                return false;
            }
            case 16: {
                bl7 = context.getLanguageVersion() >= 200 ? bl5 : false;
                return bl7;
            }
            case 15: {
                bl6 = context.getLanguageVersion() <= 170 ? bl : false;
            }
            case 14: {
                return bl6;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                return false;
            }
            case 6: {
                n2 = context.getLanguageVersion();
                bl7 = bl2;
                if (n2 != 0) {
                    bl7 = n2 >= 160 ? bl2 : false;
                }
            }
            case 5: {
                return bl7;
            }
            case 4: {
                bl8 = context.getLanguageVersion() == 120 ? bl3 : false;
            }
            case 3: {
                return bl8;
            }
            case 2: {
                return false;
            }
            case 1: 
        }
        n2 = context.getLanguageVersion();
        bl7 = bl4;
        if (n2 != 100) {
            bl7 = bl4;
            if (n2 != 110) {
                bl7 = n2 == 120 ? bl4 : false;
            }
        }
        return bl7;
    }

    public final void initApplicationClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            if (Kit.testIfCanLoadRhinoClasses(classLoader)) {
                if (this.applicationClassLoader == null) {
                    this.checkNotSealed();
                    this.applicationClassLoader = classLoader;
                    return;
                }
                throw new IllegalStateException("applicationClassLoader can only be set once");
            }
            throw new IllegalArgumentException("Loader can not resolve Rhino classes");
        }
        throw new IllegalArgumentException("loader is null");
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    protected Context makeContext() {
        return new Context(this);
    }

    protected void observeInstructionCount(Context context, int n2) {
    }

    protected void onContextCreated(Context context) {
        Object object = this.listeners;
        int n2 = 0;
        ContextFactory$Listener contextFactory$Listener;
        while ((contextFactory$Listener = (ContextFactory$Listener)Kit.getListener(object, n2)) != null) {
            contextFactory$Listener.contextCreated(context);
            ++n2;
        }
        return;
    }

    protected void onContextReleased(Context context) {
        Object object = this.listeners;
        int n2 = 0;
        ContextFactory$Listener contextFactory$Listener;
        while ((contextFactory$Listener = (ContextFactory$Listener)Kit.getListener(object, n2)) != null) {
            contextFactory$Listener.contextReleased(context);
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void removeListener(ContextFactory$Listener object) {
        this.checkNotSealed();
        Object object2 = this.listenersLock;
        synchronized (object2) {
            if (!this.disabledListening) {
                this.listeners = Kit.removeListener(this.listeners, object);
                return;
            }
            object = new IllegalStateException();
            throw object;
        }
    }

    public final void seal() {
        this.checkNotSealed();
        this.sealed = true;
    }
}

