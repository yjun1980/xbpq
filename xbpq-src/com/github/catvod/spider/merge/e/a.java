/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.e;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.e.d;
import com.github.catvod.spider.merge.e.e;
import com.github.catvod.spider.merge.h.b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a {
    @SerializedName(value="drives")
    private List<a> a;
    @SerializedName(value="params")
    private List<e> b;
    @SerializedName(value="login")
    private d c;
    @SerializedName(value="vodPic")
    private String d;
    @SerializedName(value="name")
    private String e;
    @SerializedName(value="server")
    private String f;
    @SerializedName(value="version")
    private int g;
    @SerializedName(value="path")
    private String h;
    @SerializedName(value="token")
    private String i;
    @SerializedName(value="search")
    private Boolean j;

    public a(String string) {
        this.e = string;
    }

    public final a a() {
        CharSequence charSequence;
        if (this.h == null) {
            boolean bl = TextUtils.isEmpty((CharSequence)this.f);
            String string = "";
            charSequence = bl ? "" : this.f;
            if (TextUtils.isEmpty((CharSequence)(charSequence = Uri.parse((String)charSequence).getPath()))) {
                charSequence = string;
            }
            this.h = charSequence;
        }
        if (this.g == 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e());
            ((StringBuilder)charSequence).append(cYh.d("48313138782A12322D383475143535253E340023"));
            int n2 = com.github.catvod.spider.merge.h.b.h(((StringBuilder)charSequence).toString(), null, null).contains(cYh.d("11626F")) ? 2 : 3;
            this.g = n2;
        }
        return this;
    }

    public final String b(String string) {
        Object object;
        Object object2 = object = this.b;
        if (object == null) {
            object2 = new ArrayList<e>();
        }
        object = object2.iterator();
        while (object.hasNext()) {
            object2 = (e)object.next();
            if (!string.startsWith(((e)object2).b())) continue;
            return ((e)object2).a();
        }
        return "";
    }

    public final List<a> c() {
        List<a> list;
        List<a> list2 = list = this.a;
        if (list == null) {
            list2 = new ArrayList<a>();
        }
        return list2;
    }

    public final HashMap<String, String> d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(cYh.d("322324237A1B00352F25"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E6E6E49606F65616A517E74657709063620233E755263767F646C"));
        String string = TextUtils.isEmpty((CharSequence)this.i) ? "" : this.i;
        if (!string.isEmpty()) {
            string = this.i;
            hashMap.put(cYh.d("2625353938280E2A20253E3509"), string);
        }
        return hashMap;
    }

    public final String e() {
        String string = TextUtils.isEmpty((CharSequence)this.f) ? "" : this.f;
        return string.replace(this.h(), "");
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.g().equals(((a)object).g());
    }

    public final d f() {
        return this.c;
    }

    public final String g() {
        String string = TextUtils.isEmpty((CharSequence)this.e) ? "" : this.e;
        return string;
    }

    public final String h() {
        String string = TextUtils.isEmpty((CharSequence)this.h) ? "" : this.h;
        return string;
    }

    public final String i() {
        String string = TextUtils.isEmpty((CharSequence)this.d) ? cYh.d("0F2435212460487F3260793B1F61397F34350A7F736165694860747E676E4820782530135F616F21393D") : this.d;
        return string;
    }

    public final boolean j() {
        boolean bl = this.g == 3;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String k(String string) {
        HashMap<String, Object> hashMap;
        boolean bl = this.j();
        String string2 = cYh.d("48");
        if (bl) {
            hashMap = new HashMap<String, Object>();
            hashMap.put(cYh.d("0C35382638280323"), string);
            hashMap.put(cYh.d("17312634"), 1);
            hashMap.put(cYh.d("17313334392E"), string2);
            hashMap.put(cYh.d("1735330E273B0035"), 100);
            string = new Gson();
            return string.toJson(hashMap);
        }
        hashMap = new HashMap();
        hashMap.put(cYh.d("0C353826382803"), string);
        hashMap.put(cYh.d("17313539"), string2);
        string = new Gson();
        return string.toJson(hashMap);
    }

    public final String l() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e());
        String string = this.j() ? cYh.d("48313138783C147F323436280438") : cYh.d("48313138782A12322D383475143520233432");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public final void m(String string) {
        this.i = string;
    }
}

