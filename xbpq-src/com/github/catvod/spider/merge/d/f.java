/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.l;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class f {
    @SerializedName(value="token_type")
    private String a;
    @SerializedName(value="access_token")
    private String b;
    @SerializedName(value="refresh_token")
    private String c;

    public static f d(String object) {
        f f2 = (f)new Gson().fromJson((String)object, f.class);
        object = f2;
        if (f2 == null) {
            object = new f();
        }
        return object;
    }

    public final f a() {
        this.c = "";
        this.b = "";
        return this;
    }

    public final String b() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = TextUtils.isEmpty((CharSequence)this.a);
        String string = "";
        String string2 = bl ? "" : this.a;
        stringBuilder.append(string2);
        stringBuilder.append(cYh.d("47"));
        string2 = TextUtils.isEmpty((CharSequence)this.b) ? string : this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.c) ? "" : this.c;
        return string;
    }

    public final f e() {
        l.g(p.o().s(), this.toString());
        return this;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

