/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.File;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.commonjs.module.provider.ModuleSource;
import org.mozilla.javascript.commonjs.module.provider.ModuleSourceProvider;

public abstract class ModuleSourceProviderBase
implements ModuleSourceProvider,
Serializable {
    private static final long serialVersionUID = 1L;

    private static String ensureTrailingSlash(String string) {
        if (!string.endsWith("/")) {
            string = string.concat("/");
        }
        return string;
    }

    private ModuleSource loadFromPathArray(String string, Scriptable scriptable, Object object) {
        long l2 = ScriptRuntime.toUint32(ScriptableObject.getProperty(scriptable, "length"));
        int n2 = l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
        for (int i2 = 0; i2 < n2; ++i2) {
            Serializable serializable;
            URI uRI;
            String string2 = ModuleSourceProviderBase.ensureTrailingSlash(ScriptableObject.getTypedProperty(scriptable, i2, String.class));
            try {
                serializable = uRI = new URI(string2);
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new MalformedURLException(uRISyntaxException.getMessage());
            }
            if (!uRI.isAbsolute()) {
                serializable = new File(string2);
                serializable = ((File)serializable).toURI().resolve("");
            }
            if ((serializable = this.loadFromUri(serializable.resolve(string), (URI)serializable, object)) == null) continue;
            return serializable;
        }
        return null;
    }

    protected boolean entityNeedsRevalidation(Object object) {
        return true;
    }

    protected ModuleSource loadFromFallbackLocations(String string, Object object) {
        return null;
    }

    protected ModuleSource loadFromPrivilegedLocations(String string, Object object) {
        return null;
    }

    protected abstract ModuleSource loadFromUri(URI var1, URI var2, Object var3);

    @Override
    public ModuleSource loadSource(String string, Scriptable object, Object object2) {
        if (!this.entityNeedsRevalidation(object2)) {
            return ModuleSourceProvider.NOT_MODIFIED;
        }
        ModuleSource moduleSource = this.loadFromPrivilegedLocations(string, object2);
        if (moduleSource != null) {
            return moduleSource;
        }
        if (object != null && (object = this.loadFromPathArray(string, (Scriptable)object, object2)) != null) {
            return object;
        }
        return this.loadFromFallbackLocations(string, object2);
    }

    @Override
    public ModuleSource loadSource(URI uRI, URI uRI2, Object object) {
        return this.loadFromUri(uRI, uRI2, object);
    }
}

