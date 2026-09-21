/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.google.gson.Gson
 *  com.google.gson.annotations.SerializedName
 */
package com.github.catvod.spider.merge.d;

import android.util.Base64;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

public final class c {
    @SerializedName(value="data")
    private c a;
    @SerializedName(value="content")
    private c b;
    @SerializedName(value="t")
    private String c;
    @SerializedName(value="ck")
    private String d;
    @SerializedName(value="codeContent")
    private String e;
    @SerializedName(value="qrCodeStatus")
    private String f;
    @SerializedName(value="bizExt")
    private String g;

    public static c g(String object) {
        block3: {
            try {
                Object object2 = new Gson();
                object2 = (c)object2.fromJson((String)object, c.class);
                object = object2;
                if (object2 != null) break block3;
            }
            catch (Exception exception) {
                return new c();
            }
            object = new c();
        }
        return object;
    }

    public final String a() {
        String string;
        String string2 = string = this.e;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    public final c b() {
        c c2;
        c c3 = c2 = this.b;
        if (c2 == null) {
            c3 = new c();
        }
        return c3;
    }

    public final c c() {
        c c2;
        c c3 = c2 = this.a;
        if (c2 == null) {
            c3 = new c();
        }
        return c3;
    }

    public final Map<String, String> d() {
        String string;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String string2 = string = this.c;
        if (string == null) {
            string2 = "";
        }
        hashMap.put(cYh.d("13"), string2);
        string2 = string = this.d;
        if (string == null) {
            string2 = "";
        }
        hashMap.put(cYh.d("043B"), string2);
        hashMap.put(cYh.d("0620311F363702"), cYh.d("063C2828223438343338213F"));
        hashMap.put(cYh.d("06203114392E15312F3232"), cYh.d("103523"));
        hashMap.put(cYh.d("0E230C3E35330B35"), cYh.d("01312D2232"));
        hashMap.put(cYh.d("0B312F36"), cYh.d("1D381E1219"));
        hashMap.put(cYh.d("15353524253432222D"), "");
        hashMap.put(cYh.d("01222E3C04331335"), cYh.d("5262"));
        hashMap.put(cYh.d("05393B013628063D32"), "");
        hashMap.put(cYh.d("0931373D36340025203632"), cYh.d("1D386C1219"));
        hashMap.put(cYh.d("093137013B3B13362E233A"), cYh.d("2A312218392E023C"));
        return hashMap;
    }

    public final String e() {
        String string;
        String string2 = string = this.g;
        if (string == null) {
            string2 = "";
        }
        string2 = new String(Base64.decode((String)string2, (int)0));
        return ((a)new Gson().fromJson(string2, a.class)).a().b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        String string = this.f;
        String string2 = "";
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        if (!string3.equals(cYh.d("241F0F171E082A1505"))) return false;
        string3 = this.g;
        if (string3 == null) {
            string3 = string2;
        }
        if (string3.length() <= 0) return false;
        return true;
    }
}

