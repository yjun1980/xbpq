/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.Q;

import android.text.TextUtils;
import com.github.catvod.spider.merge.I.r;
import com.google.gson.annotations.SerializedName;

public final class c {
    @SerializedName(alternate={"name"}, value="title")
    private String a;

    static /* bridge */ /* synthetic */ String a(c c2) {
        return c2.b();
    }

    private String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String c(boolean bl) {
        String string = bl ? String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", r.c(new StringBuilder(), this.b(), "/{pg}"), this.b(), this.b()) : this.b();
        return string;
    }
}

