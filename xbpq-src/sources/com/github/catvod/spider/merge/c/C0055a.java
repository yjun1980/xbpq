package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.merge.cYh;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055a {

    @SerializedName("type_id")
    private String a;

    @SerializedName("type_name")
    private String b;

    @SerializedName("type_flag")
    private String c = cYh.d("56");

    public C0055a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0055a) {
            return this.a.equals(((C0055a) obj).a);
        }
        return false;
    }
}
