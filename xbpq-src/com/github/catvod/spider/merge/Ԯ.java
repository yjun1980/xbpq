/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.google.gson.annotations.SerializedName;

public class \u052e {
    @SerializedName(value="vod_id")
    private String \u037f;
    @SerializedName(value="vod_name")
    private String \u0528;
    @SerializedName(value="vod_pic")
    private String \u0529;
    @SerializedName(value="vod_remarks")
    private String \u052a;
    @SerializedName(value="vod_play_from")
    private String \u052b;
    @SerializedName(value="vod_play_url")
    private String \u052c;
    @SerializedName(value="vod_tag")
    private String \u052d;

    public \u052e() {
    }

    public \u052e(String string, String string2, String string3, String string4, boolean bl) {
        this.\u037f(string);
        this.\u0528(string2);
        this.\u0529(string3);
        this.\u052c(string4);
        string = bl ? SOY.d("1C3D3D121105") : SOY.d("1C3B3D13");
        this.\u052d(string);
    }

    public void \u037f(String string) {
        this.\u037f = string;
    }

    public void \u0528(String string) {
        this.\u0528 = string;
    }

    public void \u0529(String string) {
        this.\u0529 = string;
    }

    public void \u052a(String string) {
        this.\u052b = string;
    }

    public void \u052b(String string) {
        this.\u052c = string;
    }

    public void \u052c(String string) {
        this.\u052a = string;
    }

    public void \u052d(String string) {
        this.\u052d = string;
    }
}

