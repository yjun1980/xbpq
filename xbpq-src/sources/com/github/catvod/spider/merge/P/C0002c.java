package com.github.catvod.spider.merge.P;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.P.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0002c implements G {
    protected F a;
    protected List<D> b = new ArrayList(100);
    protected int c = -1;
    protected boolean d;

    public C0002c(F f) {
        this.a = f;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final void a() {
    }

    @Override // com.github.catvod.spider.merge.P.G
    public final F b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.G
    public final String c(D d, D d2) {
        if (d != null && d2 != null) {
            com.github.catvod.spider.merge.S.i b = com.github.catvod.spider.merge.S.i.b(d.g(), d2.g());
            int i = b.a;
            int i2 = b.b;
            if (i >= 0 && i2 >= 0) {
                m();
                do {
                } while (l(1000) >= 1000);
                if (i2 >= this.b.size()) {
                    i2 = this.b.size() - 1;
                }
                StringBuilder sb = new StringBuilder();
                while (i <= i2) {
                    D d3 = (D) this.b.get(i);
                    if (d3.e() == -1) {
                        break;
                    }
                    sb.append(d3.c());
                    i++;
                }
                return sb.toString();
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final void d(int i) {
        m();
        this.c = k(i);
    }

    @Override // com.github.catvod.spider.merge.P.G
    public D e(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int f(int i) {
        return e(i).e();
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int g() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.G
    public final D get(int i) {
        if (i >= 0 && i < this.b.size()) {
            return (D) this.b.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cYh.d("133F2A34397A0E3E25342F7A"));
        sb.append(i);
        sb.append(cYh.d("473F3425773501703330393D0270717F79"));
        sb.append(this.b.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.P.r
    public final int i() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.r
    public final void j() {
        int i = this.c;
        if (!(i >= 0 && (!this.d ? i >= this.b.size() : i >= this.b.size() - 1)) && f(1) == -1) {
            throw new IllegalStateException(cYh.d("04312F3F382E47332E3F242F0A356114181C"));
        }
        if (o(this.c + 1)) {
            this.c = k(this.c + 1);
        }
    }

    protected int k(int i) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    protected final int l(int i) {
        if (this.d) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            D c = this.a.c();
            if (c instanceof J) {
                ((J) c).f(this.b.size());
            }
            this.b.add(c);
            if (c.e() == -1) {
                this.d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        if (this.c == -1) {
            o(0);
            this.c = k(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    public final int n(int i) {
        o(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (true) {
            D d = (D) this.b.get(i);
            if (d.getChannel() == 0 || d.e() == -1) {
                return i;
            }
            i++;
            o(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    public final boolean o(int i) {
        int size = (i - this.b.size()) + 1;
        return size <= 0 || l(size) >= size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.r
    public final int size() {
        return this.b.size();
    }
}
