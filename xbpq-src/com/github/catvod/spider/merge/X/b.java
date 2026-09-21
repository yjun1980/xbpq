/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.X.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class b {
    @SerializedName(value="url")
    private String a;
    @SerializedName(value="gmtCreate")
    private String b;
    @SerializedName(value="fileInfos")
    private List<a> c;

    public final String a() {
        return this.c.get(0).a();
    }

    public final h b() {
        return new h(this.a, this.c.get(0).a(), "https://is1-ssl.mzstatic.com/image/thumb/Purple211/v4/48/5e/29/485e292b-ed09-47b8-8c41-3402a7fb8936/AppIcon-0-1x_U007epad-0-1-0-85-220-0.png/350x350.png", this.b);
    }
}

