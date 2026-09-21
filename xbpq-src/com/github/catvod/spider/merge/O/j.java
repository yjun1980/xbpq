/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public final class j {
    private final int[] a = new int[]{46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};
    @SerializedName(value="img_url")
    private String b;
    @SerializedName(value="sub_url")
    private String c;

    public final String a(LinkedHashMap<String, Object> object) {
        boolean bl = TextUtils.isEmpty((CharSequence)this.b);
        CharSequence charSequence = "";
        Object object2 = bl ? "" : this.b;
        object2 = Uri.parse((String)object2).getLastPathSegment().split("\\.");
        String string2 = object2[0];
        object2 = TextUtils.isEmpty((CharSequence)this.c) ? charSequence : this.c;
        object2 = e.c(string2, Uri.parse((String)object2).getLastPathSegment().split("\\.")[0]);
        charSequence = new StringBuilder();
        for (int i2 = 0; i2 < 32; ++i2) {
            ((StringBuilder)charSequence).append(object2.charAt(this.a[i2]));
        }
        object2 = ((StringBuilder)charSequence).toString();
        charSequence = new StringBuilder();
        ((AbstractMap)object).put((String)"wts", System.currentTimeMillis() / 1000L);
        for (String string2 : ((LinkedHashMap)object).keySet()) {
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("=");
            ((StringBuilder)charSequence).append(URLEncoder.encode(((LinkedHashMap)object).get(string2).toString()));
            ((StringBuilder)charSequence).append("&");
        }
        object = m.D(((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append((String)object2);
        return s.a((String)object, "&w_rid=", m.b(((StringBuilder)charSequence).toString()));
    }
}

