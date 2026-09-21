package com.github.catvod.spider.merge.e;

import android.text.TextUtils;
import com.github.catvod.spider.merge.c.g;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.j.o;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113c {

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"parent"}, value = "path")
    private String b;

    @SerializedName("type")
    private int c;

    @SerializedName("size")
    private long d;

    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String e;

    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f;

    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String g;

    public static List<C0113c> a(String str) {
        return (List) new Gson().fromJson(str, new C0112b().getType());
    }

    public static C0113c m(C0113c c0113c, String str) {
        C0113c c0113c2 = new C0113c();
        c0113c2.a = cYh.d("81C2ECB7C3E482D8D6B9F6F2");
        c0113c2.b = c0113c.b;
        c0113c2.e = str;
        return c0113c2;
    }

    public final Date b() {
        try {
            return new SimpleDateFormat(cYh.d("1E2938287A172A7D2535700E4018096B3A375D23327F0409340A"), Locale.getDefault()).parse(this.g);
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final String d(String str) {
        return ((TextUtils.isEmpty(this.e) ? "" : this.e).isEmpty() && k()) ? str : TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final long e() {
        return this.d;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f)) {
            return "";
        }
        if (!this.f.startsWith(cYh.d("487F"))) {
            return this.f;
        }
        StringBuilder b = C0059d.b(cYh.d("0F2435216D"));
        b.append(this.f);
        return b.toString();
    }

    public final g g(C0111a c0111a, String str) {
        return new g(i(c0111a.g()), c(), d(str), c0111a.g(), k());
    }

    public final g h(String str, String str2) {
        return new g(i(str), c(), d(str2), o.c(this.d), k());
    }

    public final String i(String str) {
        StringBuilder b = C0059d.b(str);
        b.append(TextUtils.isEmpty(this.b) ? "" : this.b);
        b.append(cYh.d("48"));
        b.append(c());
        return b.toString();
    }

    public final boolean j(boolean z) {
        if (!c().endsWith(cYh.d("492432")) && !c().endsWith(cYh.d("493D3136"))) {
            if (z) {
                int i = this.c;
                return i == 0 || i == 4;
            }
            int i2 = this.c;
            if (i2 == 0 || i2 == 2 || i2 == 5) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        return this.c == 1;
    }

    public final boolean l(boolean z) {
        if (!c().endsWith(cYh.d("492432")) && !c().endsWith(cYh.d("493D3136"))) {
            if (z) {
                int i = this.c;
                return i == 2 || i == 3;
            }
            int i2 = this.c;
            if (i2 != 3 && i2 != 4) {
                return false;
            }
        }
        return true;
    }
}
