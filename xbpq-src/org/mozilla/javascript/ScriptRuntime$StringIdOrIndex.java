/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class ScriptRuntime$StringIdOrIndex {
    final int index;
    final String stringId;

    ScriptRuntime$StringIdOrIndex(int n2) {
        this.stringId = null;
        this.index = n2;
    }

    ScriptRuntime$StringIdOrIndex(String string) {
        this.stringId = string;
        this.index = -1;
    }

    public int getIndex() {
        return this.index;
    }

    public String getStringId() {
        return this.stringId;
    }
}

