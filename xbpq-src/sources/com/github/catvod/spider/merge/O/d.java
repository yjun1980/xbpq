package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class d extends s {
    private b d = new b(l.b, l.c, l.d, cYh.d("23352730223613142822273B1333293425"));

    public final void c(Runnable runnable, j jVar, boolean z) {
        try {
            this.d.d(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            com.github.catvod.spider.merge.L.i.j.i(this.d.b(runnable, jVar));
        }
    }
}
