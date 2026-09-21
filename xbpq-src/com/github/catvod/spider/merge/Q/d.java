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
import com.github.catvod.spider.merge.Q.a;
import com.github.catvod.spider.merge.Q.b;
import com.github.catvod.spider.merge.Q.c;
import com.github.catvod.spider.merge.i0.m;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {
    @SerializedName(value="jump_id")
    private String a;
    @SerializedName(value="id")
    private String b;
    @SerializedName(alternate={"path"}, value="thumbnail")
    private String c;
    @SerializedName(value="title")
    private String d;
    @SerializedName(value="mask")
    private String e;
    @SerializedName(value="description")
    private String f;
    @SerializedName(value="playlist")
    private c g;
    @SerializedName(value="year")
    private String h;
    @SerializedName(value="area")
    private String i;
    @SerializedName(value="types")
    private List<c> j;
    @SerializedName(value="actors")
    private List<c> k;
    @SerializedName(value="directors")
    private List<c> l;
    @SerializedName(value="source_list_source")
    private List<b> m;
    @SerializedName(value="dataList")
    private List<d> n;

    public final String a() {
        List<c> list = this.k;
        list = list == null ? "" : this.h(list, true);
        return list;
    }

    public final String b() {
        String string;
        String string2 = string = this.i;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final List<d> c() {
        List<d> list;
        List<d> list2 = list = this.n;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        return list2;
    }

    public final String d() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.f);
        String string = "";
        if (!bl) {
            string = this.f.replace("\u3000", "");
        }
        return string;
    }

    public final String e() {
        List<c> list = this.l;
        list = list == null ? "" : this.h(list, true);
        return list;
    }

    public final String f(String charSequence) {
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            charSequence = "";
        } else {
            charSequence = r.d("http://", (String)charSequence);
            ((StringBuilder)charSequence).append(this.c);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }

    public final String g() {
        List<c> list = this.j;
        list = list == null ? "" : this.h(list, false);
        return list;
    }

    public final String h(List<c> object, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            stringBuilder.append(((c)object.next()).c(bl));
            stringBuilder.append(" ");
        }
        return com.github.catvod.spider.merge.i0.m.D(stringBuilder.toString());
    }

    public final String i() {
        ArrayList<String> arrayList = new ArrayList<String>();
        List<b> list = this.m;
        Object object = list;
        if (list == null) {
            object = Collections.emptyList();
        }
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(((b)object.next()).b());
        }
        return TextUtils.join((CharSequence)"$$$", arrayList);
    }

    public final String j() {
        ArrayList<String> arrayList = new ArrayList<String>();
        List<b> list = this.m;
        List<b> list2 = list;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        for (b b2 : list2) {
            list2 = new ArrayList<b>();
            for (a a2 : b2.a()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.a());
                stringBuilder.append("$");
                stringBuilder.append(a2.b());
                ((ArrayList)list2).add((b)((Object)stringBuilder.toString()));
            }
            arrayList.add(TextUtils.join((CharSequence)"#", list2));
        }
        return TextUtils.join((CharSequence)"$$$", arrayList);
    }

    public final String k() {
        String string;
        String string2 = string = this.h;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final h l(String string) {
        boolean bl = TextUtils.isEmpty((CharSequence)this.a);
        String string2 = "";
        String string3 = bl ? "" : this.a;
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            string2 = this.d;
        }
        return new h(string3, string2, this.f(string));
    }

    public final h m(String object) {
        boolean bl = TextUtils.isEmpty((CharSequence)this.b);
        String string = "";
        String string2 = bl ? "" : this.b;
        String string3 = TextUtils.isEmpty((CharSequence)this.d) ? "" : this.d;
        String string4 = this.f((String)object);
        object = TextUtils.isEmpty((CharSequence)this.e) ? ((object = this.g) == null ? string : com.github.catvod.spider.merge.Q.c.a((c)object)) : this.e;
        return new h(string2, string3, string4, (String)object);
    }
}

