/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.net.URI;
import java.util.LinkedList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.ModuleScriptProvider;

public class MultiModuleScriptProvider
implements ModuleScriptProvider {
    private final ModuleScriptProvider[] providers;

    public MultiModuleScriptProvider(Iterable<? extends ModuleScriptProvider> object) {
        LinkedList<ModuleScriptProvider> linkedList = new LinkedList<ModuleScriptProvider>();
        object = object.iterator();
        while (object.hasNext()) {
            linkedList.add((ModuleScriptProvider)object.next());
        }
        this.providers = linkedList.toArray(new ModuleScriptProvider[0]);
    }

    @Override
    public ModuleScript getModuleScript(Context context, String string, URI uRI, URI uRI2, Scriptable scriptable) {
        ModuleScriptProvider[] moduleScriptProviderArray = this.providers;
        int n2 = moduleScriptProviderArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ModuleScript moduleScript = moduleScriptProviderArray[i2].getModuleScript(context, string, uRI, uRI2, scriptable);
            if (moduleScript == null) continue;
            return moduleScript;
        }
        return null;
    }
}

