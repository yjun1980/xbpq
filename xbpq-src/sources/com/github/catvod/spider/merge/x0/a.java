package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x0.a;
import java.io.IOException;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public abstract class a<P extends a<P>> extends b<P> {
    private long h;

    public a(String str) {
        super(str, 3);
        this.h = Long.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.x0.b, com.github.catvod.spider.merge.x0.h
    public final RequestBody c() {
        RequestBody h = h();
        try {
            long contentLength = h.contentLength();
            if (contentLength <= this.h) {
                return h;
            }
            throw new IllegalArgumentException(cYh.d("3338247134350924243F2316023E26253F7A04312F3F382E47322471302802313534257A1338203F77") + this.h + cYh.d("4732382532294B703539327A0425332332341370223E392E023E351D3234002429713E2947") + contentLength + cYh.d("473238253229"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
