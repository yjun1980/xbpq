/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;

public final class k {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;

    public k(long l2, String string, String string2, boolean bl) {
        this.a = string;
        string = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string = "\u672a\u547d\u540d";
        }
        this.b = string;
        this.c = bl;
        this.d = l2;
    }
}

