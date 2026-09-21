package com.github.catvod.spider.merge.e;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h.C0149b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111a {

    @SerializedName("drives")
    private List<C0111a> a;

    @SerializedName("params")
    private List<C0115e> b;

    @SerializedName("login")
    private C0114d c;

    @SerializedName("vodPic")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("server")
    private String f;

    @SerializedName("version")
    private int g;

    @SerializedName("path")
    private String h;

    @SerializedName("token")
    private String i;

    @SerializedName("search")
    private Boolean j;

    public C0111a(String str) {
        this.e = str;
    }

    public final C0111a a() {
        if (this.h == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f) ? "" : this.f).getPath();
            this.h = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.g == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(e());
            sb.append(cYh.d("48313138782A12322D383475143535253E340023"));
            this.g = C0149b.h(sb.toString(), null, null).contains(cYh.d("11626F")) ? 2 : 3;
        }
        return this;
    }

    public final String b(String str) {
        List<C0115e> list = this.b;
        if (list == null) {
            list = new ArrayList();
        }
        for (C0115e c0115e : list) {
            if (str.startsWith(c0115e.b())) {
                return c0115e.a();
            }
        }
        return "";
    }

    public final List<C0111a> c() {
        List<C0111a> list = this.a;
        return list == null ? new ArrayList() : list;
    }

    public final HashMap<String, String> d() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(cYh.d("322324237A1B00352F25"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C"));
        if (!(TextUtils.isEmpty(this.i) ? "" : this.i).isEmpty()) {
            hashMap.put(cYh.d("2625353938280E2A20253E3509"), this.i);
        }
        return hashMap;
    }

    public final String e() {
        return (TextUtils.isEmpty(this.f) ? "" : this.f).replace(h(), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0111a) {
            return g().equals(((C0111a) obj).g());
        }
        return false;
    }

    public final C0114d f() {
        return this.c;
    }

    public final String g() {
        return TextUtils.isEmpty(this.e) ? "" : this.e;
    }

    public final String h() {
        return TextUtils.isEmpty(this.h) ? "" : this.h;
    }

    public final String i() {
        return TextUtils.isEmpty(this.d) ? cYh.d("0F2435212460487F3260793B1F61397F34350A7F736165694860747E676E4820782530135F616F21393D") : this.d;
    }

    public final boolean j() {
        return this.g == 3;
    }

    public final String k(String str) {
        HashMap hashMap;
        Gson gson;
        boolean j = j();
        String d = cYh.d("48");
        if (j) {
            hashMap = new HashMap();
            hashMap.put(cYh.d("0C35382638280323"), str);
            hashMap.put(cYh.d("17312634"), 1);
            hashMap.put(cYh.d("17313334392E"), d);
            hashMap.put(cYh.d("1735330E273B0035"), 100);
            gson = new Gson();
        } else {
            hashMap = new HashMap();
            hashMap.put(cYh.d("0C353826382803"), str);
            hashMap.put(cYh.d("17313539"), d);
            gson = new Gson();
        }
        return gson.toJson(hashMap);
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(e());
        sb.append(j() ? cYh.d("48313138783C147F323436280438") : cYh.d("48313138782A12322D383475143520233432"));
        return sb.toString();
    }

    public final void m(String str) {
        this.i = str;
    }
}
