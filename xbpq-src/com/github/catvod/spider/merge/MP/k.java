/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.MP;

import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.MP.i;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;

public class k {
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
    @SerializedName(value="action")
    private String n;
    @SerializedName(value="style")
    private i o;

    public k() {
    }

    public k(String string, String string2, String string3) {
        this.b = string;
        this.c = string2;
        this.n(string3);
    }

    public k(String string, String string2, String string3, String string4) {
        this.b = string;
        this.c = string2;
        this.n(string3);
        this.e = string4;
    }

    public k(String string, String string2, String string3, String string4, i i2) {
        this.b = string;
        this.c = string2;
        this.n(string3);
        this.e = string4;
        this.o = i2;
    }

    public k(String string, String string2, String string3, String string4, i i2, String string5) {
        this.b = string;
        this.c = string2;
        this.n(string3);
        this.e = string4;
        this.o = i2;
        this.n = string5;
    }

    public k(String string, String string2, String string3, boolean bl) {
        this.b = string;
        this.c = string2;
        this.n("https://d.kstore.dev/download/6741/jar/png/GY.png");
        this.e = string3;
        string = bl ? "folder" : "file";
        this.m = string;
    }

    public final String a() {
        return this.j;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.k;
    }

    public final String f() {
        return this.l;
    }

    public final void g(String string) {
        this.a = string;
    }

    public final void h(String string) {
        this.h = string;
    }

    public final void i(String string) {
        this.g = string;
    }

    public final void j(String string) {
        this.j = string;
    }

    public final void k(String string) {
        this.i = string;
    }

    public final void l(String string) {
        this.b = string;
    }

    public final void m(String string) {
        this.c = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(String charSequence) {
        block9: {
            CharSequence charSequence2;
            block11: {
                block10: {
                    block8: {
                        if (charSequence != null) break block8;
                        charSequence = "";
                        break block9;
                    }
                    charSequence = charSequence2 = ((String)charSequence).trim();
                    if (((String)charSequence2).isEmpty()) break block9;
                    charSequence = charSequence2;
                    if (!((String)charSequence2).startsWith("data:")) break block10;
                    charSequence = charSequence2;
                    break block9;
                }
                while (((String)charSequence).contains("&amp;")) {
                    charSequence = ((String)charSequence).replace("&amp;", "&");
                }
                charSequence2 = charSequence = ((String)charSequence).replace("&#038;", "&").replace("&quot;", "\"");
                if (((String)charSequence).startsWith("//")) {
                    charSequence2 = "https:".concat((String)charSequence);
                }
                if (((String)charSequence2).contains("doubanio.com/") || ((String)charSequence2).contains("xhscdn.com/") || ((String)charSequence2).contains("zuoyebang.cc/") || ((String)charSequence2).contains("tu.hxx2023.cc/")) break block11;
                charSequence = charSequence2;
                if (!((String)charSequence2).contains("oss.hxx2023.cc/")) break block9;
            }
            charSequence = charSequence2;
            if (!((String)charSequence2).contains("do=img")) {
                try {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(Proxy.getUrl());
                    ((StringBuilder)charSequence).append("?do=img&url=");
                    ((StringBuilder)charSequence).append(URLEncoder.encode((String)charSequence2, "UTF-8"));
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                catch (Throwable throwable) {
                    charSequence = charSequence2;
                }
            }
        }
        this.d = charSequence;
    }

    public final void o(String string) {
        this.k = string;
    }

    public final void p(String string) {
        this.l = string;
    }

    public final void q(String string) {
        this.e = string;
    }

    public final void r(String string) {
        this.m = string;
    }

    public final void s(String string) {
        this.f = string;
    }
}

