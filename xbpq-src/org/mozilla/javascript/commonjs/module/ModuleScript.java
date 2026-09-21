/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module;

import java.io.Serializable;
import java.net.URI;
import org.mozilla.javascript.Script;

public class ModuleScript
implements Serializable {
    private static final long serialVersionUID = 1L;
    private final URI base;
    private final Script script;
    private final URI uri;

    public ModuleScript(Script script, URI uRI, URI uRI2) {
        this.script = script;
        this.uri = uRI;
        this.base = uRI2;
    }

    public URI getBase() {
        return this.base;
    }

    public Script getScript() {
        return this.script;
    }

    public URI getUri() {
        return this.uri;
    }

    public boolean isSandboxed() {
        URI uRI;
        URI uRI2 = this.base;
        boolean bl = uRI2 != null && (uRI = this.uri) != null && !uRI2.relativize(uRI).isAbsolute();
        return bl;
    }
}

