package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;

/* renamed from: com.github.catvod.spider.merge.e0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125i extends N {
    public final /* synthetic */ int a;
    private final String b;

    public /* synthetic */ C0125i(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        switch (this.a) {
            case 0:
                return lVar2.o(this.b);
            case 1:
                return lVar2.W(this.b);
            default:
                return lVar2.d0().endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return String.format(cYh.d("3C75320C"), this.b);
            case 1:
                return String.format(cYh.d("497532"), this.b);
            default:
                return String.format(cYh.d("4223"), this.b);
        }
    }
}
