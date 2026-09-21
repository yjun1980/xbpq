/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.f0;

import android.text.TextUtils;
import java.util.HashMap;

public final class i {
    private final int a;
    private final String b;

    public i() {
        this.a = 500;
        this.b = "";
        new HashMap();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public i(int n2, String string) {
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

