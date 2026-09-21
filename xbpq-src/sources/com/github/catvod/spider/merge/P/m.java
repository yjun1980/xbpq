package com.github.catvod.spider.merge.P;

/* loaded from: classes.dex */
public final class m extends C0002c {
    public m(F f) {
        super(f);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.P.C0002c, com.github.catvod.spider.merge.P.G
    public final D e(int i) {
        m();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            return p(-i);
        }
        int i2 = this.c;
        for (int i3 = 1; i3 < i; i3++) {
            int i4 = i2 + 1;
            if (o(i4)) {
                i2 = n(i4);
            }
        }
        return (D) this.b.get(i2);
    }

    @Override // com.github.catvod.spider.merge.P.C0002c
    protected final int k(int i) {
        return n(i);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List<com.github.catvod.spider.merge.P.D>, java.util.ArrayList] */
    protected final D p(int i) {
        if (i != 0) {
            int i2 = this.c;
            if (i2 - i >= 0) {
                for (int i3 = 1; i3 <= i && i2 > 0; i3++) {
                    i2--;
                    o(i2);
                    if (i2 >= size()) {
                        i2 = size() - 1;
                    } else {
                        while (i2 >= 0) {
                            D d = (D) this.b.get(i2);
                            if (d.e() != -1 && d.getChannel() != 0) {
                                i2--;
                            }
                        }
                    }
                }
                if (i2 < 0) {
                    return null;
                }
                return (D) this.b.get(i2);
            }
        }
        return null;
    }
}
