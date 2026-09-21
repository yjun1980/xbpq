package com.github.catvod.spider.merge.d;

import android.util.Base64;
import com.github.catvod.spider.merge.cYh;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058c {

    @SerializedName("data")
    private C0058c a;

    @SerializedName("content")
    private C0058c b;

    @SerializedName("t")
    private String c;

    @SerializedName("ck")
    private String d;

    @SerializedName("codeContent")
    private String e;

    @SerializedName("qrCodeStatus")
    private String f;

    @SerializedName("bizExt")
    private String g;

    public static C0058c g(String str) {
        try {
            C0058c c0058c = (C0058c) new Gson().fromJson(str, C0058c.class);
            return c0058c == null ? new C0058c() : c0058c;
        } catch (Exception unused) {
            return new C0058c();
        }
    }

    public final String a() {
        String str = this.e;
        return str == null ? "" : str;
    }

    public final C0058c b() {
        C0058c c0058c = this.b;
        return c0058c == null ? new C0058c() : c0058c;
    }

    public final C0058c c() {
        C0058c c0058c = this.a;
        return c0058c == null ? new C0058c() : c0058c;
    }

    public final Map<String, String> d() {
        HashMap hashMap = new HashMap();
        String str = this.c;
        if (str == null) {
            str = "";
        }
        hashMap.put(cYh.d("13"), str);
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(cYh.d("043B"), str2);
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
        String str = this.g;
        if (str == null) {
            str = "";
        }
        return ((C0056a) new Gson().fromJson(new String(Base64.decode(str, 0)), C0056a.class)).a().b();
    }

    public final boolean f() {
        String str = this.f;
        if (str == null) {
            str = "";
        }
        if (str.equals(cYh.d("241F0F171E082A1505"))) {
            String str2 = this.g;
            if ((str2 != null ? str2 : "").length() > 0) {
                return true;
            }
        }
        return false;
    }
}
