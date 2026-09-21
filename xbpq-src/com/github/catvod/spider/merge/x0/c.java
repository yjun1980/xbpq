/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.E.e;
import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.x0.a;
import com.github.catvod.spider.merge.x0.h;
import okhttp3.RequestBody;

public final class c
extends a<c> {
    private RequestBody i;

    public c(String string) {
        f.e(string, cYh.d("12222D"));
        e.a(3, cYh.d("0A353539383E"));
        super(string);
    }

    @Override
    public final RequestBody h() {
        RequestBody requestBody = this.i;
        if (requestBody != null) {
            return requestBody;
        }
        throw new NullPointerException(cYh.d("15353024322913122E352E7A04312F3F382E47322471392F0B3C6D712736023132347739063C2D71233202703234231808343871243F1539242277370224293E3329"));
    }

    @Override
    public final h k(String string, Object object) {
        f.e(string, cYh.d("0C3538"));
        f.e(object, cYh.d("11312D2432"));
        return this;
    }

    public final c w(RequestBody requestBody) {
        f.e(requestBody, cYh.d("15353024322913122E352E"));
        this.i = requestBody;
        return this;
    }
}

