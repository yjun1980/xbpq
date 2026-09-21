/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.O;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.O.f;
import com.github.catvod.spider.merge.c1.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.List;

public final class g {
    @SerializedName(value="bvid")
    private String a;
    @SerializedName(value="aid")
    private String b;
    @SerializedName(value="title")
    private String c;
    @SerializedName(value="pic")
    private String d;
    @SerializedName(value="duration")
    private String e;

    public static List<g> a(JsonElement jsonElement) {
        Type type = new f().getType();
        return (List)new Gson().fromJson(jsonElement, type);
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        return string;
    }

    public final h c() {
        h h2 = new h();
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = TextUtils.isEmpty((CharSequence)this.a);
        String string = "";
        CharSequence charSequence = bl ? "" : this.a;
        stringBuilder.append((String)charSequence);
        stringBuilder.append("@");
        charSequence = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        stringBuilder.append((String)charSequence);
        h2.l(stringBuilder.toString());
        charSequence = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        h2.m(com.github.catvod.spider.merge.c1.d.l((String)charSequence).s0());
        stringBuilder = new StringBuilder();
        charSequence = TextUtils.isEmpty((CharSequence)this.e) ? string : this.e;
        stringBuilder.append(((String)charSequence).split(":")[0]);
        stringBuilder.append("\u5206\u9418");
        h2.q(stringBuilder.toString());
        if (this.b().startsWith("//")) {
            charSequence = com.github.catvod.spider.merge.C.a.c("https:");
            ((StringBuilder)charSequence).append(this.b());
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.b();
        }
        h2.n((String)charSequence);
        return h2;
    }
}

