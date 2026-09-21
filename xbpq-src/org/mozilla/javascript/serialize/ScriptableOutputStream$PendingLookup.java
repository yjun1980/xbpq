/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.serialize;

import java.io.Serializable;

class ScriptableOutputStream$PendingLookup
implements Serializable {
    private static final long serialVersionUID = -2692990309789917727L;
    private String name;

    ScriptableOutputStream$PendingLookup(String string) {
        this.name = string;
    }

    String getName() {
        return this.name;
    }
}

