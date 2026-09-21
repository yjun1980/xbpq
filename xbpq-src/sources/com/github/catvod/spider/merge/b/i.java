package com.github.catvod.spider.merge.b;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ p d;

    public /* synthetic */ i(p pVar, int i) {
        this.c = i;
        this.d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                p.d(this.d);
                return;
            default:
                p.a(this.d);
                return;
        }
    }
}
