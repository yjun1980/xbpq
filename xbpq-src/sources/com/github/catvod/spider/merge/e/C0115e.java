package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115e {

    @SerializedName("path")
    private String a;

    @SerializedName("pass")
    private String b;

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String b() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }
}
