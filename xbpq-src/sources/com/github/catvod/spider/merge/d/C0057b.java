package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.cYh;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057b {

    @SerializedName("redirectUri")
    private String a;

    public final String a() {
        return (TextUtils.isEmpty(this.a) ? "" : this.a).split(cYh.d("043F25346A"))[1];
    }
}
