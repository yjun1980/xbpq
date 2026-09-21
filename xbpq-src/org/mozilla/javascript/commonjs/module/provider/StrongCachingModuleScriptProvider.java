/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;

public class StrongCachingModuleScriptProvider
extends CachingModuleScriptProviderBase {
    private static final long serialVersionUID = 1L;
    private final Map<String, CachingModuleScriptProviderBase$CachedModuleScript> modules = new ConcurrentHashMap<String, CachingModuleScriptProviderBase$CachedModuleScript>(16, 0.75f, CachingModuleScriptProviderBase.getConcurrencyLevel());

    public StrongCachingModuleScriptProvider(ModuleSourceProvider moduleSourceProvider) {
        super(moduleSourceProvider);
    }

    @Override
    protected CachingModuleScriptProviderBase$CachedModuleScript getLoadedModule(String string) {
        return this.modules.get(string);
    }

    @Override
    protected void putLoadedModule(String string, ModuleScript moduleScript, Object object) {
        this.modules.put(string, new CachingModuleScriptProviderBase$CachedModuleScript(moduleScript, object));
    }
}

