/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x0.b;
import java.io.IOException;
import okhttp3.RequestBody;

public abstract class a<P extends a<P>>
extends b<P> {
    private long h = Long.MAX_VALUE;

    public a(String string) {
        super(string, 3);
    }

    @Override
    public final RequestBody c() {
        long l2;
        Object object;
        block3: {
            object = this.h();
            try {
                l2 = object.contentLength();
                if (l2 > this.h) break block3;
                return object;
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(iOException);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("3338247134350924243F2316023E26253F7A04312F3F382E47322471302802313534257A1338203F77"));
        stringBuilder.append(this.h);
        stringBuilder.append(cYh.d("4732382532294B703539327A0425332332341370223E392E023E351D3234002429713E2947"));
        stringBuilder.append(l2);
        stringBuilder.append(cYh.d("473238253229"));
        object = new IllegalArgumentException(stringBuilder.toString());
        throw object;
    }
}

