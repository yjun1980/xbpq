package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("value")
    private List<b> c;

    public c(String str, String str2, List<b> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
