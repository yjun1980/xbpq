/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.github.catvod.spider.merge.UY;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class X {
    public final int a;
    public final String b;
    public Object c;

    public X() {
        this.a = 500;
        this.b = "";
        this.c = new HashMap();
    }

    public X(int n2, String string) {
        this.a = n2;
        this.b = string;
    }

    public X(int n2, String string, Map map) {
        this.a = n2;
        this.b = string;
        this.c = map;
    }

    public static X a(String string) {
        return new X(2, string);
    }

    public String b() {
        String string;
        String string2 = string = this.b;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string2 = "";
        }
        return string2;
    }
}

