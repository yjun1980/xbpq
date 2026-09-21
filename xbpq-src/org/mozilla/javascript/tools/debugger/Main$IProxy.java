/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.debugger.ScopeProvider;

class Main$IProxy
implements Runnable,
ScopeProvider {
    public static final int EXIT_ACTION = 1;
    public static final int SCOPE_PROVIDER = 2;
    private Scriptable scope;
    private final int type;

    public Main$IProxy(int n2) {
        this.type = n2;
    }

    public static ScopeProvider newScopeProvider(Scriptable scriptable) {
        Main$IProxy main$IProxy = new Main$IProxy(2);
        main$IProxy.scope = scriptable;
        return main$IProxy;
    }

    @Override
    public Scriptable getScope() {
        if (this.type != 2) {
            Kit.codeBug();
        }
        if (this.scope == null) {
            Kit.codeBug();
        }
        return this.scope;
    }

    @Override
    public void run() {
        if (this.type != 1) {
            Kit.codeBug();
        }
        System.exit(0);
    }
}

