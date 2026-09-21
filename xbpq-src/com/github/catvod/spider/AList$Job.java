/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import com.github.catvod.spider.AList;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.M.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

class AList$Job
implements Callable<List<h>> {
    private final b a;
    private final String b;
    final AList c;

    public AList$Job(AList aList, b b2, String string) {
        this.c = aList;
        this.a = b2;
        this.b = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<h> call() {
        try {
            ArrayList<h> arrayList = new ArrayList<h>();
            AList aList = this.c;
            b b2 = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b2.e());
            Object object = b2.j() ? "/api/fs/search" : "/api/public/search";
            stringBuilder.append((String)object);
            object = AList.a(aList, b2, stringBuilder.toString(), this.a.k(this.b));
            AList aList2 = this.c;
            boolean bl = this.a.j();
            Objects.requireNonNull(aList2);
            if (bl) {
                JSONObject jSONObject = new JSONObject((String)object);
                object = jSONObject.getJSONObject("data").getJSONArray("content");
            } else {
                JSONObject jSONObject = new JSONObject((String)object);
                object = jSONObject.getJSONArray("data");
            }
            object = d.a(object.toString()).iterator();
            while (true) {
                if (!object.hasNext()) {
                    return arrayList;
                }
                d d2 = (d)object.next();
                if (d2.j(this.a.j())) continue;
                arrayList.add(d2.g(this.a));
            }
        }
        catch (Exception exception) {
            return Collections.emptyList();
        }
    }
}

