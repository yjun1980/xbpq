/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.spider.merge.ai.l;
import com.github.catvod.spider.merge.nIe;
import com.google.gson.annotations.SerializedName;

public final class m {
    @SerializedName(value="type_name")
    private String a;
    @SerializedName(value="vod_id")
    private String b;
    @SerializedName(value="vod_name")
    private String c;
    @SerializedName(value="vod_pic")
    private String d;
    @SerializedName(value="vod_remarks")
    private String e;
    @SerializedName(value="vod_year")
    private String f;
    @SerializedName(value="vod_area")
    private String g;
    @SerializedName(value="vod_actor")
    private String h;
    @SerializedName(value="vod_director")
    private String i;
    @SerializedName(value="vod_content")
    private String j;
    @SerializedName(value="vod_play_from")
    private String k;
    @SerializedName(value="vod_play_url")
    private String l;
    @SerializedName(value="vod_tag")
    private String m;
    @SerializedName(value="style")
    private l n;

    public m() {
    }

    public m(String string, String string2, String string3, String string4, l l2) {
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.n = l2;
    }

    public final void a() {
        this.k = nIe.d("04093D240426");
    }

    public final void b() {
        this.l = nIe.d("04093D24042666203C2D2E022B");
    }
}

