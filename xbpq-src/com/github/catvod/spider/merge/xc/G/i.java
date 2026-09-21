/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.xc.G;

import com.github.catvod.spider.merge.xc.G.j;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public class i {
    @SerializedName(value="quick_video_list")
    private List<j> a;
    @SerializedName(value="live_transcoding_task_list")
    private List<j> b;
    @SerializedName(value="live_transcoding_subtitle_task_list")
    private List<j> c;

    public final List a() {
        List<j> list;
        List<j> list2 = list = this.c;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final List b() {
        List<j> list = this.a;
        if (list != null && !list.isEmpty()) {
            return this.a;
        }
        List<j> list2 = this.b;
        list = list2;
        if (list2 == null) {
            list = Collections.emptyList();
        }
        return list;
    }
}

