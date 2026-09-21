package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class L extends N {
    private final Pattern a;

    public L(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return this.a.matcher(lVar2.e0()).find();
    }

    public final String toString() {
        return String.format(cYh.d("5D3D2025343202230E263972422368"), this.a);
    }
}
