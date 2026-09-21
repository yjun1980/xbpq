/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.AList
 */
package com.github.catvod.spider.merge.i;

import com.github.catvod.spider.AList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class a
implements Runnable {
    public final AList c;
    public final CountDownLatch d;
    public final List e;
    public final com.github.catvod.spider.merge.e.a f;
    public final String g;

    public /* synthetic */ a(AList aList, CountDownLatch countDownLatch, List list, com.github.catvod.spider.merge.e.a a2, String string) {
        this.c = aList;
        this.d = countDownLatch;
        this.e = list;
        this.f = a2;
        this.g = string;
    }

    @Override
    public final void run() {
        AList.a((AList)this.c, (CountDownLatch)this.d, (List)this.e, (com.github.catvod.spider.merge.e.a)this.f, (String)this.g);
    }
}

