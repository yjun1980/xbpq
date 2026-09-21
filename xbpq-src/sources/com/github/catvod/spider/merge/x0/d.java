package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.x.C0243a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.FormBody;
import okhttp3.RequestBody;

/* loaded from: classes.dex */
public final class d extends a<d> {
    private List<com.github.catvod.spider.merge.u0.a> i;

    public d(String str) {
        super(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.u0.a>, java.util.ArrayList] */
    @Override // com.github.catvod.spider.merge.x0.h
    public final RequestBody h() {
        ?? r0 = this.i;
        FormBody.Builder builder = new FormBody.Builder();
        if (r0 != 0) {
            Iterator it = r0.iterator();
            while (it.hasNext()) {
                com.github.catvod.spider.merge.u0.a aVar = (com.github.catvod.spider.merge.u0.a) it.next();
                if (aVar.c()) {
                    builder.addEncoded(aVar.a(), aVar.b().toString());
                } else {
                    builder.add(aVar.a(), aVar.b().toString());
                }
            }
        }
        return builder.build();
    }

    @Override // com.github.catvod.spider.merge.x0.h
    public final h k(String str, Object obj) {
        if (obj == null) {
            obj = "";
        }
        com.github.catvod.spider.merge.u0.a aVar = new com.github.catvod.spider.merge.u0.a(str, obj);
        List list = this.i;
        if (list == null) {
            list = new ArrayList();
            this.i = list;
        }
        list.add(aVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.x0.b
    public final String q() {
        ArrayList arrayList = new ArrayList();
        List<com.github.catvod.spider.merge.u0.a> t = t();
        List<com.github.catvod.spider.merge.u0.a> list = this.i;
        if (t != null) {
            arrayList.addAll(t);
        }
        if (list != null) {
            arrayList.addAll(list);
        }
        return C0243a.b(u(), com.github.catvod.spider.merge.A0.a.b(arrayList)).toString();
    }

    public final String toString() {
        return C0243a.b(u(), this.i).toString();
    }
}
