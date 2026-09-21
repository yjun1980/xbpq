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
import com.github.catvod.spider.merge.K.h;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

public final class g {
    @SerializedName(value="data")
    private List<g> a;
    @SerializedName(value="id")
    private String b;
    @SerializedName(alternate={"path"}, value="thumbnail")
    private String c;
    @SerializedName(value="title")
    private String d;
    @SerializedName(value="mask")
    private String e;

    public final List<g> a() {
        List<g> list;
        List<g> list2 = list = this.a;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final h b(String charSequence) {
        boolean bl = TextUtils.isEmpty((CharSequence)this.b);
        String string = "";
        String string2 = bl ? "" : this.b;
        String string3 = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            charSequence = "";
        } else {
            charSequence = r.d("http://", (String)charSequence);
            ((StringBuilder)charSequence).append(this.c);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            string = this.e;
        }
        return new h(string2, string3, (String)charSequence, string);
    }
}

