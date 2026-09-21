package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class f {

    @SerializedName("token_type")
    private String a;

    @SerializedName("access_token")
    private String b;

    @SerializedName("refresh_token")
    private String c;

    public static f d(String str) {
        f fVar = (f) new Gson().fromJson(str, f.class);
        return fVar == null ? new f() : fVar;
    }

    public final f a() {
        this.c = "";
        this.b = "";
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.a) ? "" : this.a);
        sb.append(cYh.d("47"));
        sb.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        return sb.toString();
    }

    public final String c() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final f e() {
        l.g(p.o().s(), toString());
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
