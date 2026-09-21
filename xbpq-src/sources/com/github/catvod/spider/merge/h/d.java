package com.github.catvod.spider.merge.h;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d {
    private final int a;
    private final String b;

    public d() {
        this.a = 500;
        this.b = "";
    }

    public d(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final int b() {
        return this.a;
    }
}
