package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public class u extends p {
    public u(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean M(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Override // com.github.catvod.spider.merge.c0.r
    /* renamed from: K */
    public u j() {
        return (u) super.j();
    }

    public final String L() {
        return I();
    }

    @Override // com.github.catvod.spider.merge.c0.p, com.github.catvod.spider.merge.c0.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.c0.p, com.github.catvod.spider.merge.c0.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public String t() {
        return cYh.d("4424242923");
    }

    @Override // com.github.catvod.spider.merge.c0.r
    public final String toString() {
        return u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.c0.r
    public void w(Appendable appendable, int i, g gVar) {
        boolean f = gVar.f();
        if (f && this.d == 0) {
            r rVar = this.c;
            if ((rVar instanceof l) && ((l) rVar).m0().a() && !com.github.catvod.spider.merge.b0.b.c(I())) {
                r(appendable, i, gVar);
            }
        }
        n.d(appendable, I(), gVar, false, f && !l.h0(this.c), f && (this.c instanceof h));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.c0.r
    public void x(Appendable appendable, int i, g gVar) {
    }
}
