/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.O;

public final class C0
extends RuntimeException {
    public C0() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final O a() {
        return new O(this.getMessage());
    }
}

