/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.U;
import com.github.catvod.spider.merge.N.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class i {
    @SerializedName(value="expire")
    private String a;
    @SerializedName(value="login_type")
    private String b;
    @SerializedName(value="thread_num")
    public Integer c;
    @SerializedName(value="refresh_token_expire_time")
    private String d;
    @SerializedName(value="token")
    private String e;
    @SerializedName(value="cookie")
    private String f;
    @SerializedName(value="user_name")
    private String g;
    @SerializedName(value="user_password")
    private String h;

    public final Integer a() {
        Integer n2 = this.c;
        boolean bl = n2 == null;
        if (bl) {
            n2 = com.github.catvod.spider.merge.N.c.e(this.d);
        }
        return n2;
    }

    public final String b() {
        return this.f;
    }

    public final i c() {
        Init.execute(new U(this, 1));
        return this;
    }

    public final void d(String string) {
        this.f = string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

