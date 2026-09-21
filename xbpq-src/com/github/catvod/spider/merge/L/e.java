/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.L;

import android.text.TextUtils;
import com.github.catvod.spider.merge.G1.d;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public final class e {
    @SerializedName(value="default_drive_id")
    private String a;
    @SerializedName(value="user_id")
    private String b;
    @SerializedName(value="backup_drive_id")
    private String c;
    @SerializedName(value="resource_drive_id")
    private String d;
    @SerializedName(value="sbox_drive_id")
    private String e;

    public static e c(String object) {
        e e2 = (e)com.github.catvod.spider.merge.G1.d.a((String)object, e.class);
        object = e2;
        if (e2 == null) {
            object = new e();
        }
        return object;
    }

    public final e a() {
        this.a = "";
        this.d = "";
        return this;
    }

    public final String b() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String toString() {
        return new Gson().toJson((Object)this);
    }
}

