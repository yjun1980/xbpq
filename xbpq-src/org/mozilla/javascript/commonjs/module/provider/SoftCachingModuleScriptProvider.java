/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.ReferenceQueue;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase$CachedModuleScript;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider$ScriptReference;

public class SoftCachingModuleScriptProvider
extends CachingModuleScriptProviderBase {
    private static final long serialVersionUID = 1L;
    private transient ReferenceQueue<Script> scriptRefQueue = new ReferenceQueue();
    private transient ConcurrentMap<String, SoftCachingModuleScriptProvider$ScriptReference> scripts = new ConcurrentHashMap<String, SoftCachingModuleScriptProvider$ScriptReference>(16, 0.75f, CachingModuleScriptProviderBase.getConcurrencyLevel());

    public SoftCachingModuleScriptProvider(ModuleSourceProvider moduleSourceProvider) {
        super(moduleSourceProvider);
    }

    private void readObject(ObjectInputStream object) {
        this.scriptRefQueue = new ReferenceQueue();
        this.scripts = new ConcurrentHashMap<String, SoftCachingModuleScriptProvider$ScriptReference>();
        for (Map.Entry entry : ((Map)((ObjectInputStream)((Object)object)).readObject()).entrySet()) {
            CachingModuleScriptProviderBase$CachedModuleScript cachingModuleScriptProviderBase$CachedModuleScript = (CachingModuleScriptProviderBase$CachedModuleScript)entry.getValue();
            this.putLoadedModule((String)entry.getKey(), cachingModuleScriptProviderBase$CachedModuleScript.getModule(), cachingModuleScriptProviderBase$CachedModuleScript.getValidator());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.scripts.entrySet()) {
            CachingModuleScriptProviderBase$CachedModuleScript cachingModuleScriptProviderBase$CachedModuleScript = ((SoftCachingModuleScriptProvider$ScriptReference)entry.getValue()).getCachedModuleScript();
            if (cachingModuleScriptProviderBase$CachedModuleScript == null) continue;
            hashMap.put(entry.getKey(), cachingModuleScriptProviderBase$CachedModuleScript);
        }
        objectOutputStream.writeObject(hashMap);
    }

    @Override
    protected CachingModuleScriptProviderBase$CachedModuleScript getLoadedModule(String object) {
        object = (object = (SoftCachingModuleScriptProvider$ScriptReference)this.scripts.get(object)) != null ? ((SoftCachingModuleScriptProvider$ScriptReference)object).getCachedModuleScript() : null;
        return object;
    }

    @Override
    public ModuleScript getModuleScript(Context context, String string, URI uRI, URI uRI2, Scriptable scriptable) {
        SoftCachingModuleScriptProvider$ScriptReference softCachingModuleScriptProvider$ScriptReference;
        while ((softCachingModuleScriptProvider$ScriptReference = (SoftCachingModuleScriptProvider$ScriptReference)this.scriptRefQueue.poll()) != null) {
            this.scripts.remove(softCachingModuleScriptProvider$ScriptReference.getModuleId(), softCachingModuleScriptProvider$ScriptReference);
        }
        return super.getModuleScript(context, string, uRI, uRI2, scriptable);
    }

    @Override
    protected void putLoadedModule(String string, ModuleScript moduleScript, Object object) {
        this.scripts.put(string, new SoftCachingModuleScriptProvider$ScriptReference(moduleScript.getScript(), string, moduleScript.getUri(), moduleScript.getBase(), object, this.scriptRefQueue));
    }
}

