package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class K extends N {
    private final Pattern a;

    public K(Pattern pattern) {
        this.a = pattern;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return this.a.matcher(lVar2.p0()).find();
    }

    public final String toString() {
        return String.format(cYh.d("5D3D20253432022369742473"), this.a);
    }
}
