/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import org.mozilla.javascript.commonjs.module.ModuleScript;

public class CachingModuleScriptProviderBase$CachedModuleScript {
    private final ModuleScript moduleScript;
    private final Object validator;

    public CachingModuleScriptProviderBase$CachedModuleScript(ModuleScript moduleScript, Object object) {
        this.moduleScript = moduleScript;
        this.validator = object;
    }

    ModuleScript getModule() {
        return this.moduleScript;
    }

    Object getValidator() {
        return this.validator;
    }
}

