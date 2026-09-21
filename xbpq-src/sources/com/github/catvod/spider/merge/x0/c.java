package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.cYh;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class c extends a<c> {
    private RequestBody i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        com.github.catvod.spider.merge.E.f.e(str, cYh.d("12222D"));
        com.github.catvod.spider.merge.E.e.a(3, cYh.d("0A353539383E"));
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final RequestBody h() {
        RequestBody requestBody = this.i;
        if (requestBody != null) {
            return requestBody;
        }
        throw new NullPointerException(cYh.d("15353024322913122E352E7A04312F3F382E47322471392F0B3C6D712736023132347739063C2D71233202703234231808343871243F1539242277370224293E3329"));
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final h k(String str, Object obj) {
        com.github.catvod.spider.merge.E.f.e(str, cYh.d("0C3538"));
        com.github.catvod.spider.merge.E.f.e(obj, cYh.d("11312D2432"));
        return this;
    }

    public final c w(RequestBody requestBody) {
        com.github.catvod.spider.merge.E.f.e(requestBody, cYh.d("15353024322913122E352E"));
        this.i = requestBody;
        return this;
    }
}
