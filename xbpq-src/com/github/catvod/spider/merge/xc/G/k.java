/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.github.catvod.spider.merge.xc.G.i;
import com.google.gson.annotations.SerializedName;

public class k {
    @SerializedName(value="video_preview_play_info")
    private i a;
    @SerializedName(value="drive_id")
    private String b;
    @SerializedName(value="file_id")
    private String c;

    public final i a() {
        i i2;
        i i4 = i2 = this.a;
        if (i2 == null) {
            i4 = new i();
        }
        return i4;
    }
}

