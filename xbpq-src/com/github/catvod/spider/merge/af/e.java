/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.af;

import android.text.TextUtils;
import java.util.HashMap;

public final class e {
    private final String a;

    public e() {
        this.a = "";
        new HashMap();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public e(String string) {
        this.a = string;
    }

    public final String a() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }
}

