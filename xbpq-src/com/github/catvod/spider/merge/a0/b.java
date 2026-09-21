/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.a0;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.a0.d;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public final class b {
    @SerializedName(value="id")
    public String a;
    @SerializedName(value="name")
    public String b;
    @SerializedName(value="coType")
    public int c;
    @SerializedName(value="coSuffix")
    public String d;
    @SerializedName(value="size")
    public long e;
    @SerializedName(value="udTime")
    public String f;
    @SerializedName(value="thumbnailURL")
    public String g;
    @SerializedName(value="bthumbnailURL")
    public String h;
    @SerializedName(value="presentURL")
    public String i;
    @SerializedName(value="presentLURL")
    public String j;
    @SerializedName(value="presentHURL")
    public String k;
    @SerializedName(value="safestate")
    public int l;
    @SerializedName(value="auditResult")
    public int m;
    @SerializedName(value="flvState")
    public Object n;
    @SerializedName(value="dlTimes")
    public int o;
    @SerializedName(value="path")
    public String p;
    @SerializedName(value="cdnDownLoadUrl")
    public Object q;
    @SerializedName(value="ifCdn")
    public Object r;
    @SerializedName(value="extInfo")
    public d s;
    @SerializedName(value="illegalType")
    public Object t;
    @SerializedName(value="illegalResult")
    public Object u;

    public final String a() {
        return com.github.catvod.spider.merge.i0.m.A(this.b);
    }

    public final String b() {
        String string = com.github.catvod.spider.merge.i0.m.x(this.a());
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("[");
        stringBuilder.append(com.github.catvod.spider.merge.i0.m.o(this.e));
        stringBuilder.append("]");
        return TextUtils.join((CharSequence)" ", Arrays.asList(string, stringBuilder.toString(), this.a(), "")).trim();
    }
}

