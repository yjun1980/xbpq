package com.github.catvod.spider.merge.i;

import com.github.catvod.spider.AList;
import com.github.catvod.spider.merge.e.C0111a;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.github.catvod.spider.merge.i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0151a implements Runnable {
    public final /* synthetic */ AList c;
    public final /* synthetic */ CountDownLatch d;
    public final /* synthetic */ List e;
    public final /* synthetic */ C0111a f;
    public final /* synthetic */ String g;

    public /* synthetic */ RunnableC0151a(AList aList, CountDownLatch countDownLatch, List list, C0111a c0111a, String str) {
        this.c = aList;
        this.d = countDownLatch;
        this.e = list;
        this.f = c0111a;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AList.a(this.c, this.d, this.e, this.f, this.g);
    }
}
