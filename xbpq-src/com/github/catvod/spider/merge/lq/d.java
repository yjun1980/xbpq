/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.lq;

import android.text.TextUtils;

public final class d {
    private final int a;
    private final String b;

    public d() {
        this.a = 500;
        this.b = "";
    }

    public d(int n2, String string) {
        this.a = n2;
        this.b = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        return string;
    }

    public final int b() {
        return this.a;
    }
}

