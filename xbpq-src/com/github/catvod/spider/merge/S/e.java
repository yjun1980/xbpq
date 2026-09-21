/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.S;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.G1.d;
import com.github.catvod.spider.merge.I.S;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.S.b;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public final class e {
    @SerializedName(value="pdir_fid")
    private String a;
    @SerializedName(value="cookie")
    private String b;
    @SerializedName(value="member_type")
    private String c;
    public Integer d;
    private long e;

    public static void a(e e2) {
        Objects.requireNonNull(e2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cookie>>");
        stringBuilder.append(e2.b);
        SpiderDebug.log((String)stringBuilder.toString());
        Objects.requireNonNull(s0.o());
        com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("quark_user"), e2.toString());
    }

    public static e h(String object) {
        e e2 = (e)com.github.catvod.spider.merge.G1.d.a((String)object, e.class);
        object = e2;
        if (e2 == null) {
            object = new e();
            ((e)object).e = 0L;
        }
        return object;
    }

    public final e b() {
        this.a = "";
        this.b = "";
        this.d = null;
        this.e = 0L;
        m.y("\u5938\u514b cookie\u5df2\u6e05\u7a7a\uff01");
        return this;
    }

    public final Integer c() {
        Integer n2 = this.d;
        boolean bl = n2 == null;
        if (bl) {
            n2 = com.github.catvod.spider.merge.S.b.e(this.c);
        }
        return n2;
    }

    public final String d() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final long f() {
        return this.e;
    }

    public final String g() {
        return this.c;
    }

    public final e i() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("cookie>>");
        stringBuilder.append(this.b);
        SpiderDebug.log((String)stringBuilder.toString());
        Init.execute(new S(this, 3));
        return this;
    }

    public final void j(String string) {
        this.b = string;
    }

    public final void k(String string) {
        this.a = string;
    }

    public final void l(long l2) {
        this.e = l2;
    }

    public final void m(String string) {
        this.c = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

