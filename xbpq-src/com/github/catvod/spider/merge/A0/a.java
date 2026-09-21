/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.B.o;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.y.b;
import com.github.catvod.spider.merge.y.e;
import java.util.ArrayList;
import java.util.Objects;

public final class a
extends com.github.catvod.spider.merge.u0.b {
    private boolean g;

    public a(e e2) {
        super(e2);
        this.d = e2.x("title");
        this.e = e2.x("author");
        this.f = e2.p("isLive");
        if (e2.containsKey("keywords")) {
            Object object = e2.t("keywords");
            Objects.requireNonNull(object);
            ArrayList<String> arrayList = new ArrayList<String>(((b)object).size());
            o o2 = o.v;
            object = ((b)object).iterator();
            while (object.hasNext()) {
                arrayList.add(A.d(object.next(), String.class, o2));
            }
        } else {
            new ArrayList();
        }
        e2.x("shortDescription");
        e2.r("averageRating");
        e2.w("viewCount");
        this.g = e2.p("isLiveContent");
    }

    public a(String string) {
        this.a = string;
    }

    public final boolean j() {
        boolean bl = !this.b() && (!this.g || this.e() != 0);
        return bl;
    }
}

