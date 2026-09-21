/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.net.URI;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript;

class SoftCachingModuleScriptProvider$ScriptReference
extends SoftReference<Script> {
    private final URI base;
    private final String moduleId;
    private final URI uri;
    private final Object validator;

    SoftCachingModuleScriptProvider$ScriptReference(Script script, String string, URI uRI, URI uRI2, Object object, ReferenceQueue<Script> referenceQueue) {
        super(script, referenceQueue);
        this.moduleId = string;
        this.uri = uRI;
        this.base = uRI2;
        this.validator = object;
    }

    CachingModuleScriptProviderBase$CachedModuleScript getCachedModuleScript() {
        Script script = (Script)((Reference)this).get();
        if (script == null) {
            return null;
        }
        return new CachingModuleScriptProviderBase$CachedModuleScript(new ModuleScript(script, this.uri, this.base), this.validator);
    }

    String getModuleId() {
        return this.moduleId;
    }
}

