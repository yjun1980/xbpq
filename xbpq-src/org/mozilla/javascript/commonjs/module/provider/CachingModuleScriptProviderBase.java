/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.Reader;
import java.io.Serializable;
import java.net.URI;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.ModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;

public abstract class CachingModuleScriptProviderBase
implements ModuleScriptProvider,
Serializable {
    private static final int loadConcurrencyLevel;
    private static final int loadLockCount;
    private static final int loadLockMask;
    private static final int loadLockShift;
    private static final long serialVersionUID = -1L;
    private final Object[] loadLocks = new Object[loadLockCount];
    private final ModuleSourceProvider moduleSourceProvider;

    static {
        int n2;
        loadConcurrencyLevel = Runtime.getRuntime().availableProcessors() * 8;
        int n3 = 0;
        for (n2 = 1; n2 < loadConcurrencyLevel; n2 <<= 1) {
            ++n3;
        }
        loadLockShift = 32 - n3;
        loadLockMask = n2 - 1;
        loadLockCount = n2;
    }

    protected CachingModuleScriptProviderBase(ModuleSourceProvider moduleSourceProvider) {
        Object[] objectArray;
        for (int i2 = 0; i2 < (objectArray = this.loadLocks).length; ++i2) {
            objectArray[i2] = new Object();
        }
        this.moduleSourceProvider = moduleSourceProvider;
    }

    private static boolean equal(Object object, Object object2) {
        boolean bl = object == null ? object2 == null : object.equals(object2);
        return bl;
    }

    protected static int getConcurrencyLevel() {
        return loadLockCount;
    }

    private static Object getValidator(CachingModuleScriptProviderBase$CachedModuleScript object) {
        object = object == null ? null : ((CachingModuleScriptProviderBase$CachedModuleScript)object).getValidator();
        return object;
    }

    protected abstract CachingModuleScriptProviderBase$CachedModuleScript getLoadedModule(String var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public ModuleScript getModuleScript(Context object, String string, URI serializable, URI object2, Scriptable object3) {
        Object object4 = this.getLoadedModule(string);
        Object object5 = CachingModuleScriptProviderBase.getValidator((CachingModuleScriptProviderBase$CachedModuleScript)object4);
        if ((serializable = serializable == null ? this.moduleSourceProvider.loadSource(string, (Scriptable)object3, object5) : this.moduleSourceProvider.loadSource((URI)serializable, (URI)object2, object5)) == ModuleSourceProvider.NOT_MODIFIED) {
            return ((CachingModuleScriptProviderBase$CachedModuleScript)object4).getModule();
        }
        if (serializable == null) {
            return null;
        }
        object2 = ((ModuleSource)serializable).getReader();
        try {
            int n2 = string.hashCode();
            object3 = this.loadLocks[n2 >>> loadLockShift & loadLockMask];
            synchronized (object3) {
                object4 = this.getLoadedModule(string);
                if (object4 == null) break block14;
            }
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                if (object2 == null) throw throwable2;
                try {
                    ((Reader)object2).close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    throwable.addSuppressed(throwable3);
                }
                throw throwable2;
            }
        }
        {
            block14: {
                if (!CachingModuleScriptProviderBase.equal(object5, CachingModuleScriptProviderBase.getValidator((CachingModuleScriptProviderBase$CachedModuleScript)object4))) {
                    object = ((CachingModuleScriptProviderBase$CachedModuleScript)object4).getModule();
                    // MONITOREXIT @DISABLED, blocks:[7, 11] lbl28 : MonitorExitStatement: MONITOREXIT : var5_8
                    if (object2 == null) return object;
                    ((Reader)object2).close();
                    return object;
                }
            }
            object5 = ((ModuleSource)serializable).getUri();
            object4 = new ModuleScript(((Context)object).compileReader((Reader)object2, ((URI)object5).toString(), 1, ((ModuleSource)serializable).getSecurityDomain()), (URI)object5, ((ModuleSource)serializable).getBase());
            this.putLoadedModule(string, (ModuleScript)object4, ((ModuleSource)serializable).getValidator());
        }
        if (object2 == null) return object4;
        ((Reader)object2).close();
        return object4;
    }

    protected abstract void putLoadedModule(String var1, ModuleScript var2, Object var3);
}

