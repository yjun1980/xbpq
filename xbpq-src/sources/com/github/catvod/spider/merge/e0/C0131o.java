package com.github.catvod.spider.merge.e0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x.C0243a;
import java.util.regex.Pattern;

/* renamed from: com.github.catvod.spider.merge.e0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131o extends N {
    String a;
    Pattern b;

    public C0131o(String str, Pattern pattern) {
        this.a = C0243a.d(str);
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.e0.N
    public final boolean a(com.github.catvod.spider.merge.c0.l lVar, com.github.catvod.spider.merge.c0.l lVar2) {
        return lVar2.o(this.a) && this.b.matcher(lVar2.c(this.a)).find();
    }

    public final String toString() {
        return String.format(cYh.d("3C75322F6A7F140D"), this.a, this.b.toString());
    }
}
