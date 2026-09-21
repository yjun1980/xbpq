/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.n;

public class T {
    protected volatile j0 a;
    private volatile n b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j0 a(j0 j02) {
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = j02;
                    this.b = n.b;
                }
                catch (O o2) {
                    this.a = j02;
                    this.b = n.b;
                }
            }
            return this.a;
        }
    }

    public final j0 b(j0 j02) {
        j0 j03 = this.a;
        this.b = null;
        this.a = j02;
        return j03;
    }
}

