/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.FormBody$Builder
 *  okhttp3.RequestBody
 */
package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.x0.a;
import com.github.catvod.spider.merge.x0.h;
import java.util.ArrayList;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.RequestBody;

public final class d
extends a<d> {
    private List<com.github.catvod.spider.merge.u0.a> i;

    public d(String string) {
        super(string);
    }

    @Override
    public final RequestBody h() {
        Object object = this.i;
        FormBody.Builder builder = new FormBody.Builder();
        if (object != null) {
            object = ((ArrayList)object).iterator();
            while (object.hasNext()) {
                com.github.catvod.spider.merge.u0.a a2 = (com.github.catvod.spider.merge.u0.a)object.next();
                if (a2.c()) {
                    builder.addEncoded(a2.a(), a2.b().toString());
                    continue;
                }
                builder.add(a2.a(), a2.b().toString());
            }
        }
        return builder.build();
    }

    @Override
    public final h k(String arrayList, Object list) {
        List<com.github.catvod.spider.merge.u0.a> list2 = list;
        if (list == null) {
            list2 = "";
        }
        list2 = new com.github.catvod.spider.merge.u0.a((String)((Object)arrayList), list2);
        list = this.i;
        arrayList = list;
        if (list == null) {
            arrayList = new ArrayList<com.github.catvod.spider.merge.u0.a>();
            this.i = arrayList;
        }
        arrayList.add((com.github.catvod.spider.merge.u0.a)((Object)list2));
        return this;
    }

    @Override
    public final String q() {
        ArrayList<com.github.catvod.spider.merge.u0.a> arrayList = new ArrayList<com.github.catvod.spider.merge.u0.a>();
        List list = this.t();
        List<com.github.catvod.spider.merge.u0.a> list2 = this.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        list = com.github.catvod.spider.merge.A0.a.b(arrayList);
        return com.github.catvod.spider.merge.x.a.b(this.u(), list).toString();
    }

    public final String toString() {
        return com.github.catvod.spider.merge.x.a.b(this.u(), this.i).toString();
    }
}

