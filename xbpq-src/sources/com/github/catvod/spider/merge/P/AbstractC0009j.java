package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.C0167a;

/* renamed from: com.github.catvod.spider.merge.P.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0009j implements InterfaceC0003d {
    protected final int a;
    protected int b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0009j(int i) {
        this.a = i;
    }

    public static AbstractC0009j k(C0005f c0005f) {
        int a = C0167a.a(c0005f.e());
        if (a == 0) {
            int g = c0005f.g();
            int h = c0005f.h();
            byte[] c = c0005f.c();
            c0005f.a();
            return new C0008i(g, h, c);
        }
        if (a == 1) {
            int g2 = c0005f.g();
            int h2 = c0005f.h();
            char[] d = c0005f.d();
            c0005f.a();
            return new C0006g(g2, h2, d);
        }
        if (a != 2) {
            throw new UnsupportedOperationException(cYh.d("293F3571253F0633293433"));
        }
        int g3 = c0005f.g();
        int h3 = c0005f.h();
        int[] f = c0005f.f();
        c0005f.a();
        return new C0007h(g3, h3, f);
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final void d(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int g() {
        return -1;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int i() {
        return this.b;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final void j() {
        int i = this.a;
        int i2 = this.b;
        if (i - i2 == 0) {
            throw new IllegalStateException(cYh.d("04312F3F382E47332E3F242F0A356114181C"));
        }
        this.b = i2 + 1;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int size() {
        return this.a;
    }

    public final String toString() {
        return h(com.github.catvod.spider.merge.S.i.b(0, this.a - 1));
    }
}
