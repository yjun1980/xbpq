/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.c.g;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.e.a;
import com.github.catvod.spider.merge.e.b;
import com.github.catvod.spider.merge.j.o;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c {
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

    public static List<c> a(String string) {
        Type type = new b().getType();
        return (List)new Gson().fromJson(string, type);
    }

    public static c m(c c2, String string) {
        c c3 = new c();
        c3.a = cYh.d("81C2ECB7C3E482D8D6B9F6F2");
        c3.b = c2.b;
        c3.e = string;
        return c3;
    }

    public final Date b() {
        try {
            Cloneable cloneable = new SimpleDateFormat(cYh.d("1E2938287A172A7D2535700E4018096B3A375D23327F0409340A"), Locale.getDefault());
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

    public final String d(String string) {
        String string2 = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        if (!string2.isEmpty() || !this.k()) {
            string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        }
        return string;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        CharSequence charSequence;
        if (TextUtils.isEmpty((CharSequence)this.f)) {
            charSequence = "";
        } else if (this.f.startsWith(cYh.d("487F"))) {
            charSequence = com.github.catvod.spider.merge.d.d.b(cYh.d("0F2435216D"));
            ((StringBuilder)charSequence).append(this.f);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = this.f;
        }
        return charSequence;
    }

    public final g g(a a2, String string) {
        return new g(this.i(a2.g()), this.c(), this.d(string), a2.g(), this.k());
    }

    public final g h(String string, String string2) {
        return new g(this.i(string), this.c(), this.d(string2), o.c(this.d), this.k());
    }

    public final String i(String string) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d.d.b(string);
        string = TextUtils.isEmpty((CharSequence)this.b) ? "" : this.b;
        stringBuilder.append(string);
        stringBuilder.append(cYh.d("48"));
        stringBuilder.append(this.c());
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean j(boolean bl) {
        boolean bl2 = this.c().endsWith(cYh.d("492432"));
        boolean bl3 = true;
        boolean bl4 = true;
        if (bl2) return false;
        if (this.c().endsWith(cYh.d("493D3136"))) return false;
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
                            boolean bl3 = this.c().endsWith(cYh.d("492432"));
                            bl2 = false;
                            boolean bl4 = false;
                            if (bl3 || this.c().endsWith(cYh.d("493D3136"))) break block4;
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

