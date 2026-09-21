/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module;

import java.net.URI;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;

public class ModuleScope
extends TopLevel {
    private static final long serialVersionUID = 1L;
    private final URI base;
    private final URI uri;

    public ModuleScope(Scriptable scriptable, URI uRI, URI uRI2) {
        this.uri = uRI;
        this.base = uRI2;
        this.setPrototype(scriptable);
        this.cacheBuiltins(scriptable, false);
    }

    public URI getBase() {
        return this.base;
    }

    public URI getUri() {
        return this.uri;
    }
}

