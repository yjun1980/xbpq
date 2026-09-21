package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends u {
    public d(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.c0.u, com.github.catvod.spider.merge.c0.r
    /* renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d j() {
        return (d) super.j();
    }

    @Override // com.github.catvod.spider.merge.c0.u, com.github.catvod.spider.merge.c0.r
    public final String t() {
        return cYh.d("44332530233B");
    }

    @Override // com.github.catvod.spider.merge.c0.u, com.github.catvod.spider.merge.c0.r
    final void w(Appendable appendable, int i, g gVar) {
        appendable.append(cYh.d("5B711A12131B33111A")).append(I());
    }

    @Override // com.github.catvod.spider.merge.c0.u, com.github.catvod.spider.merge.c0.r
    final void x(Appendable appendable, int i, g gVar) {
        try {
            appendable.append(cYh.d("3A0D7F"));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.b(e);
        }
    }
}
