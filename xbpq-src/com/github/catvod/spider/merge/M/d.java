/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.M;

import android.text.TextUtils;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.M.b;
import com.github.catvod.spider.merge.M.c;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class d {
    @SerializedName(value="name")
    private String a;
    @SerializedName(alternate={"parent"}, value="path")
    private String b;
    @SerializedName(value="type")
    private int c;
    @SerializedName(value="size")
    private long d;
    @SerializedName(alternate={"thumbnail"}, value="thumb")
    private String e;
    @SerializedName(alternate={"raw_url"}, value="url")
    private String f;
    @SerializedName(alternate={"updated_at"}, value="modified")
    private String g;

    public static List<d> a(String string) {
        Type type = new c().getType();
        return (List)new Gson().fromJson(string, type);
    }

    public final Date b() {
        try {
            Cloneable cloneable = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
            cloneable = cloneable.parse(this.g);
            return cloneable;
        }
        catch (Exception exception) {
            return new Date();
        }
    }

    public final String c() {
        String string = TextUtils.isEmpty((CharSequence)this.a) ? "" : this.a;
        return string;
    }

    public final String d() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.e);
        String string = "";
        String string2 = bl ? "" : this.e;
        string2 = string2.isEmpty() && this.k() ? "https://s1.ax1x.com/2023/05/04/p9tgI81.png" : (TextUtils.isEmpty((CharSequence)this.e) ? string : this.e);
        return string2;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        CharSequence charSequence;
        if (TextUtils.isEmpty((CharSequence)this.f)) {
            charSequence = "";
        } else if (this.f.startsWith("//")) {
            charSequence = com.github.catvod.spider.merge.C.a.c("http:");
            ((StringBuilder)charSequence).append(this.f);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.f;
        }
        return charSequence;
    }

    public final h g(b b2) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c(b2.g());
        String string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append(this.c());
        return new h(stringBuilder.toString(), this.c(), this.d(), b2.g(), this.k());
    }

    public final h h(String string) {
        return new h(this.i(string), this.c(), this.d(), m.o(this.d), this.k());
    }

    public final String i(String charSequence) {
        charSequence = r.d((String)charSequence, "/");
        ((StringBuilder)charSequence).append(this.c());
        return ((StringBuilder)charSequence).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean j(boolean bl) {
        boolean bl2 = this.c().endsWith(".ts");
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) return false;
        if (this.c().endsWith(".mpg")) return false;
        if (bl) {
            int n2 = this.c;
            bl = bl4;
            if (n2 == 0) return bl;
            if (n2 != 4) return false;
            return bl4;
        }
        int n3 = this.c;
        bl = bl3;
        if (n3 == 0) return bl;
        bl = bl3;
        if (n3 == 2) return bl;
        if (n3 != 5) return false;
        return bl3;
    }

    public final boolean k() {
        int n2 = this.c;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        return bl;
    }

    public final boolean l(boolean bl) {
        block8: {
            block4: {
                boolean bl2;
                block5: {
                    block7: {
                        block6: {
                            boolean bl3 = this.c().endsWith(".ts");
                            bl2 = false;
                            boolean bl4 = false;
                            if (bl3 || this.c().endsWith(".mpg")) break block4;
                            if (!bl) break block5;
                            int n2 = this.c;
                            if (n2 == 2) break block6;
                            bl = bl4;
                            if (n2 != 3) break block7;
                        }
                        bl = true;
                    }
                    return bl;
                }
                int n3 = this.c;
                if (n3 == 3) break block4;
                bl = bl2;
                if (n3 != 4) break block8;
            }
            bl = true;
        }
        return bl;
    }
}

