package com.github.catvod.spider.merge.d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.o;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    @SerializedName("items")
    private List<e> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public e(String str) {
        this.c = str;
    }

    public final String a() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String b() {
        String[] strArr = new String[3];
        boolean isEmpty = TextUtils.isEmpty(this.j);
        String str = "";
        String d = cYh.d("3A");
        String d2 = cYh.d("3C");
        strArr[0] = isEmpty ? "" : n.b(C0059d.b(d2), this.j, d);
        strArr[1] = f();
        if (this.i != 0.0d) {
            StringBuilder b = C0059d.b(d2);
            b.append(o.c(this.i));
            b.append(d);
            str = b.toString();
        }
        strArr[2] = str;
        return TextUtils.join(cYh.d("47"), Arrays.asList(strArr)).trim();
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? "" : this.g;
    }

    public final String d() {
        return TextUtils.isEmpty(this.c) ? "" : this.c;
    }

    public final List<e> e() {
        List<e> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String g() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String h() {
        return TextUtils.isEmpty(this.f) ? "" : this.f;
    }

    public final e i(String str) {
        this.j = str;
        return this;
    }
}
