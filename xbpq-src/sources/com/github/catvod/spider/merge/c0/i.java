package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public final class i extends p {
    public i(String str, String str2, String str3) {
        String d;
        com.github.catvod.spider.merge.N.a.k(str);
        com.github.catvod.spider.merge.N.a.k(str2);
        com.github.catvod.spider.merge.N.a.k(str3);
        super.b(cYh.d("09312C34"), str);
        String d2 = cYh.d("1725233D3E392E34");
        super.b(d2, str2);
        String d3 = cYh.d("1429322532372E34");
        super.b(d3, str3);
        if (K(d2)) {
            d = cYh.d("3705031D1E19");
        } else if (!K(d3)) {
            return;
        } else {
            d = cYh.d("340912051217");
        }
        super.b(cYh.d("172523022E292C3538"), d);
    }

    private boolean K(String str) {
        return !com.github.catvod.spider.merge.b0.b.c(super.c(str));
    }

    public final void L(String str) {
        if (str != null) {
            super.b(cYh.d("172523022E292C3538"), str);
        }
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
    public final String t() {
        return cYh.d("44342E3223231735");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.c0.r
    public final void w(Appendable appendable, int i, g gVar) {
        int g = gVar.g();
        String d = cYh.d("1429322532372E34");
        String d2 = cYh.d("1725233D3E392E34");
        appendable.append((g != 1 || K(d2) || K(d)) ? cYh.d("5B71051E140E3E0004") : cYh.d("5B71253E342E1E2024"));
        String d3 = cYh.d("09312C34");
        boolean K = K(d3);
        String d4 = cYh.d("47");
        if (K) {
            appendable.append(d4).append(super.c(d3));
        }
        String d5 = cYh.d("172523022E292C3538");
        if (K(d5)) {
            appendable.append(d4).append(super.c(d5));
        }
        boolean K2 = K(d2);
        String d6 = cYh.d("4772");
        if (K2) {
            appendable.append(d6).append(super.c(d2)).append('\"');
        }
        if (K(d)) {
            appendable.append(d6).append(super.c(d)).append('\"');
        }
        appendable.append('>');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.merge.c0.r
    public final void x(Appendable appendable, int i, g gVar) {
    }
}
