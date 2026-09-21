/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.L.i;
import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.O.j;
import com.github.catvod.spider.merge.O.l;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.RejectedExecutionException;

public class d
extends s {
    private b d;

    public d() {
        int n2 = l.b;
        int n3 = l.c;
        long l2 = l.d;
        this.d = new b(n2, n3, l2, cYh.d("23352730223613142822273B1333293425"));
    }

    public final void c(Runnable runnable, j j2, boolean bl) {
        try {
            this.d.d(runnable, j2, bl);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            i.j.i(this.d.b(runnable, j2));
        }
    }
}

