/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e0.N;

public final class k
extends N {
    public final int a;
    private final String b;

    public k(String string, int n2) {
        this.a = n2;
        if (n2 != 1) {
            com.github.catvod.spider.merge.N.a.i(string);
            this.b = com.github.catvod.spider.merge.x.a.c(string);
            return;
        }
        this.b = com.github.catvod.spider.merge.x.a.c(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(l iterator, l l2) {
        switch (this.a) {
            default: {
                return com.github.catvod.spider.merge.x.a.c(l2.T()).contains(this.b);
            }
            case 0: {
                iterator = l2.d().f().iterator();
                do {
                    if (!iterator.hasNext()) return false;
                } while (!com.github.catvod.spider.merge.x.a.c(iterator.next().a()).startsWith(this.b));
                return true;
            }
        }
    }

    public final String toString() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                String string = this.b;
                return String.format(cYh.d("3C0E64220A"), string);
            }
        }
        String string = this.b;
        return String.format(cYh.d("5D332E3F233B0E3E3215362E067864227E"), string);
    }
}

