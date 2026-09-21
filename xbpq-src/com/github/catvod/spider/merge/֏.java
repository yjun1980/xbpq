/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u037f;
import com.github.catvod.spider.merge.\u0780;
import com.github.catvod.spider.merge.\u0781;
import com.github.catvod.spider.merge.\u078c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class \u058f {
    @SerializedName(value="drives")
    private List<\u058f> \u037f;
    @SerializedName(value="params")
    private List<\u0781> \u0528;
    @SerializedName(value="login")
    private \u0780 \u0529;
    @SerializedName(value="vodPic")
    private String \u052a;
    @SerializedName(value="name")
    private String \u052b;
    @SerializedName(value="server")
    private String \u052c;
    @SerializedName(value="version")
    private int \u052d;
    @SerializedName(value="path")
    private String \u052e;
    @SerializedName(value="token")
    private String \u052f;
    @SerializedName(value="search")
    private Boolean \u058f;
    @SerializedName(value="hidden")
    private Boolean \u0620;

    public \u058f(String string) {
        this.\u052b = string;
    }

    public static \u058f \u0786(String string) {
        return (\u058f)new Gson().fromJson(string, \u058f.class);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u058f)) {
            return false;
        }
        object = (\u058f)object;
        return this.\u052e().equals(((\u058f)object).\u052e());
    }

    public \u058f \u037f() {
        if (this.\u052e == null) {
            this.\u078b(Uri.parse((String)this.\u0620()).getPath());
        }
        if (this.\u052d == 0) {
            int n2 = \u078c.\u058f(this.\u078d(), null).contains(SOY.d("0C607F")) ? 2 : 3;
            this.\u078c(n2);
        }
        return this;
    }

    public String \u0528(String string) {
        for (\u0781 \u07812 : this.\u052f()) {
            if (!string.startsWith(\u07812.\u0528())) continue;
            return \u07812.\u037f();
        }
        return "";
    }

    public String \u0529() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052c());
        String string = this.\u0784() ? SOY.d("5533211F5B11097D361300") : SOY.d("5533211F5B070F303D1F17580A33251E");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public List<\u058f> \u052a() {
        List<\u058f> list;
        List<\u058f> list2 = list = this.\u037f;
        if (list == null) {
            list2 = new ArrayList<\u058f>();
        }
        return list2;
    }

    public HashMap<String, String> \u052b() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(SOY.d("2F21340459361D373F02"), SOY.d("373D2B1F181B1B7D645844575205381810180D21713820574B627F464F572D3B3F40404C5A2A67425D573B22211A11201F301A1F00584F61665847415A7A1A3E203A367E711A1D1C1F721613171C157B71351C05153F34594544497C615844594A7202171216083B7E434740546167"));
        if (!this.\u0780().isEmpty()) {
            String string = this.\u052f;
            hashMap.put(SOY.d("3B27251E1B05132830021D1814"), string);
        }
        return hashMap;
    }

    public String \u052c() {
        return this.\u0620().replace(this.\u058f(), "");
    }

    public \u0780 \u052d() {
        return this.\u0529;
    }

    public String \u052e() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052b) ? "" : this.\u052b;
        return string;
    }

    public List<\u0781> \u052f() {
        List<\u0781> list;
        List<\u0781> list2 = list = this.\u0528;
        if (list == null) {
            list2 = new ArrayList<\u0781>();
        }
        return list2;
    }

    public String \u058f() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052e) ? "" : this.\u052e;
        return string;
    }

    public String \u0620() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052c) ? "" : this.\u052c;
        return string;
    }

    public String \u0780() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052f) ? "" : this.\u052f;
        return string;
    }

    public int \u0781() {
        return this.\u052d;
    }

    public String \u0782() {
        String string = TextUtils.isEmpty((CharSequence)this.\u052a) ? SOY.d("12262506074D557D29581D1A1D217F19021F552A7E444445497D614F5B474F7D674212414262331444444A30655804191D") : this.\u052a;
        return string;
    }

    public Boolean \u0783() {
        Boolean bl = this.\u0620;
        boolean bl2 = bl != null && bl != false;
        return bl2;
    }

    public boolean \u0784() {
        boolean bl = this.\u0781() == 3;
        return bl;
    }

    public String \u0785() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052c());
        String string = this.\u0784() ? SOY.d("5533211F5B11097D3D1F0703") : SOY.d("5533211F5B070F303D1F17580A33251E");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public String \u0787(String string) {
        boolean bl = this.\u0784();
        String string2 = SOY.d("55");
        if (bl) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put(SOY.d("113728011B051E21"), string);
            hashMap.put(SOY.d("0A333613"), 1);
            hashMap.put(SOY.d("0A3323131A03"), string2);
            hashMap.put(SOY.d("0A37232904161D37"), 100);
            return new Gson().toJson(hashMap);
        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(SOY.d("113728011B051E"), string);
        hashMap.put(SOY.d("0A33251E"), string2);
        return new Gson().toJson(hashMap);
    }

    public Boolean \u0788() {
        Boolean bl = this.\u058f;
        boolean bl2 = bl == null || bl.booleanValue();
        return bl2;
    }

    public String \u0789() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052c());
        String string = this.\u0784() ? SOY.d("5533211F5B11097D22131505193A") : SOY.d("5533211F5B070F303D1F175809373004171F");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public String \u078a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052c());
        stringBuilder.append(SOY.d("552134170614126D33190C4A"));
        stringBuilder.append(string);
        stringBuilder.append(SOY.d("5C27231A49510E2B2113490113363419"));
        return stringBuilder.toString();
    }

    public void \u078b(String string) {
        String string2 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string2 = "";
        }
        this.\u052e = string2;
    }

    public void \u078c(int n2) {
        this.\u052d = n2;
    }

    public String \u078d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u052c());
        stringBuilder.append(SOY.d("5533211F5B070F303D1F1758093725021D191D21"));
        return stringBuilder.toString();
    }

    public \u037f \u078e() {
        return new \u037f(this.\u052e(), this.\u052e(), SOY.d("4B"));
    }
}

