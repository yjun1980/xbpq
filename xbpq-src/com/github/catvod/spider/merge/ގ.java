/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class \u078e {
    private String \u037f;
    private String \u0528;
    private String \u0529;
    private String \u052a;
    private Pattern \u052b;
    private String \u052c;
    private Pattern \u052d;
    private LinkedHashMap<String, String> \u052e = new LinkedHashMap();
    private JSONObject \u052f;
    private String \u058f;
    private String \u0620;
    private Pattern \u0780;
    private String \u0781;
    private Pattern \u0782;
    private String \u0783;
    private Pattern \u0784;
    private String \u0785;
    private Pattern \u0786;
    private String \u0787;
    private String \u0788;
    private String \u0789;
    private String \u078a;
    private Pattern \u078b;
    private String \u078c;
    private Pattern \u078d;
    private String \u078e;
    private Pattern \u078f;
    private String \u0790;
    private Pattern \u0791;
    private String \u0792;
    private String \u0793;
    private String \u0794;
    private Pattern \u0795;
    private String \u0796;
    private Pattern \u0797;
    private String \u0798;
    private Pattern \u0799;
    private String \u079a;
    private Pattern \u079b;
    private String \u079c;
    private Pattern \u079d;
    private String \u079e;
    private Pattern \u079f;
    private String \u07a0;
    private Pattern \u07a1;
    private String \u07a2;
    private Pattern \u07a3;
    private String \u07a4;
    private Pattern \u07a5;
    private String \u07b1;
    private String \u0860;
    private Pattern \u0861;
    private String \u0862;
    private String \u0863;
    private String \u0864;
    private Pattern \u0865;
    private String \u0866;
    private Pattern \u0867;
    private boolean \u0868;
    private String \u0869;
    private String \u086a;
    private String \u08a0;
    private String \u08a1;
    private String \u08a2;
    private Pattern \u08a3;
    private String \u08a4;
    private Pattern \u08a5;
    private String \u08a6;
    private Pattern \u08a7;
    private String \u08a8;
    private Pattern \u08a9;
    private boolean \u08aa;
    private String \u08ab;
    private String \u08ac;

    private static String \u037f(Pattern object, String string) {
        if (object == null) {
            return string;
        }
        try {
            object = ((Pattern)object).matcher(string);
            if (((Matcher)object).find()) {
                object = ((Matcher)object).group(1).trim();
                return object;
            }
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static \u078e \u0528(String object) {
        try {
            JSONObject jSONObject = new JSONObject((String)object);
            \u078e \u078e2 = new \u078e();
            \u078e2.\u037f = jSONObject.optString(SOY.d("0F33"));
            \u078e2.\u0528 = jSONObject.optString(SOY.d("123D3C13210516")).trim();
            \u078e2.\u0529 = jSONObject.optString(SOY.d("193325133A181E37")).trim();
            \u078e2.\u052a = jSONObject.optString(SOY.d("193325133A161737")).trim();
            \u078e2.\u052b = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("193325133A16173703"));
            \u078e2.\u052c = jSONObject.optString(SOY.d("193325133D13")).trim();
            \u078e2.\u052d = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("193325133D1328"));
            JSONObject jSONObject2 = jSONObject.optJSONObject(SOY.d("1933251339161427301A"));
            if (jSONObject2 != null) {
                object = jSONObject2.keys();
                while (object.hasNext()) {
                    String string = (String)object.next();
                    \u078e2.\u052e.put(string.trim(), jSONObject2.getString(string).trim());
                }
            }
            \u078e2.\u052f = jSONObject.optJSONObject(SOY.d("1C3B3D021105"));
            \u078e2.\u058f = jSONObject.optString(SOY.d("123D3C1322181E1C3E1211")).trim();
            \u078e2.\u0620 = jSONObject.optString(SOY.d("123D3C1322181E1C301B11")).trim();
            \u078e2.\u0780 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("123D3C1322181E1C301B1125"));
            \u078e2.\u0781 = jSONObject.optString(SOY.d("123D3C1322181E1B35")).trim();
            \u078e2.\u0782 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("123D3C1322181E1B3524"));
            \u078e2.\u0783 = jSONObject.optString(SOY.d("123D3C1322181E1B3C11")).trim();
            \u078e2.\u0784 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("123D3C1322181E1B3C1126"));
            \u078e2.\u0785 = jSONObject.optString(SOY.d("123D3C1322181E1F30041F")).trim();
            \u078e2.\u0786 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("123D3C1322181E1F30041F25"));
            \u078e2.\u0787 = jSONObject.optString(SOY.d("19332513210516")).trim();
            \u078e2.\u0788 = jSONObject.optString(SOY.d("1933251321051660")).trim();
            \u078e2.\u0789 = jSONObject.optString(SOY.d("1933251322181E1C3E1211")).trim();
            \u078e2.\u078a = jSONObject.optString(SOY.d("1933251322181E1C301B11")).trim();
            \u078e2.\u078b = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1933251322181E1C301B1125"));
            \u078e2.\u078c = jSONObject.optString(SOY.d("1933251322181E1B35")).trim();
            \u078e2.\u078d = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1933251322181E1B3524"));
            \u078e2.\u078e = jSONObject.optString(SOY.d("1933251322181E1B3C11")).trim();
            \u078e2.\u078f = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1933251322181E1B3C1126"));
            \u078e2.\u0790 = jSONObject.optString(SOY.d("1933251322181E1F30041F")).trim();
            \u078e2.\u0791 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1933251322181E1F30041F25"));
            \u078e2.\u0792 = jSONObject.optString(SOY.d("1E26040418"));
            \u078e2.\u0793 = jSONObject.optString(SOY.d("1E261F191012"));
            \u078e2.\u0794 = jSONObject.optString(SOY.d("1E261F171912"));
            \u078e2.\u0795 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E261F17191228"));
            \u078e2.\u0796 = jSONObject.optString(SOY.d("1E26181B13"));
            \u078e2.\u0797 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E26181B1325"));
            \u078e2.\u0798 = jSONObject.optString(SOY.d("1E2612170012"));
            \u078e2.\u0799 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E261217001228"));
            \u078e2.\u079a = jSONObject.optString(SOY.d("1E2608131505"));
            \u078e2.\u079b = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E260813150528"));
            \u078e2.\u079c = jSONObject.optString(SOY.d("1E2610041116"));
            \u078e2.\u079d = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E261004111628"));
            \u078e2.\u079e = jSONObject.optString(SOY.d("1E261C17061C"));
            \u078e2.\u079f = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E261C17061C28"));
            \u078e2.\u07a0 = jSONObject.optString(SOY.d("1E261015001808"));
            \u078e2.\u07a1 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E26101500180800"));
            \u078e2.\u07a2 = jSONObject.optString(SOY.d("1E26151F061219263E04"));
            \u078e2.\u07a3 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E26151F061219263E0426"));
            \u078e2.\u07a4 = jSONObject.optString(SOY.d("1E2615130714"));
            \u078e2.\u07a5 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E261513071428"));
            \u078e2.\u07b1 = jSONObject.optString(SOY.d("1E2617041B1A343D3513"));
            \u078e2.\u0860 = jSONObject.optString(SOY.d("1E2617041B1A34333C13"));
            \u078e2.\u0861 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E2617041B1A34333C1326"));
            \u078e2.\u0862 = jSONObject.optString(SOY.d("1E2604041839153634"));
            \u078e2.\u0863 = jSONObject.optString(SOY.d("1E26040418240F301F191012"));
            \u078e2.\u0864 = jSONObject.optString(SOY.d("1E260404183E1E"));
            \u078e2.\u0865 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E260404183E1E00"));
            \u078e2.\u0866 = jSONObject.optString(SOY.d("1E26040418391B3F34"));
            \u078e2.\u0867 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("1E26040418391B3F3424"));
            \u078e2.\u0868 = jSONObject.optBoolean(SOY.d("1E2614061D251F24340407"), false);
            \u078e2.\u0869 = jSONObject.optString(SOY.d("0A3E300F210516"));
            \u078e2.\u086a = jSONObject.optString(SOY.d("0A3E300F2116"));
            \u078e2.\u08a0 = jSONObject.optString(SOY.d("09373004171F2F203D"));
            \u078e2.\u08a1 = jSONObject.optString(SOY.d("093107191039153634")).trim();
            \u078e2.\u08a2 = jSONObject.optString(SOY.d("0931071910391B3F34")).trim();
            \u078e2.\u08a3 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("0931071910391B3F3424"));
            \u078e2.\u08a4 = jSONObject.optString(SOY.d("09310719103E1E")).trim();
            \u078e2.\u08a5 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("09310719103E1E00"));
            \u078e2.\u08a6 = jSONObject.optString(SOY.d("09310719103E1735")).trim();
            \u078e2.\u08a7 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("09310719103E173503"));
            \u078e2.\u08a8 = jSONObject.optString(SOY.d("09310719103A1B203A")).trim();
            \u078e2.\u08a9 = com.github.catvod.spider.merge.\u078e.\u08a1(jSONObject, SOY.d("09310719103A1B203A24"));
            \u078e2.\u08aa = jSONObject.optBoolean(SOY.d("37333F03151B293C381012"), false);
            \u078e2.\u08ab = jSONObject.optString(SOY.d("093C38101220152035"));
            \u078e2.\u08ac = jSONObject.optString(SOY.d("1C3B3D0211052D3D2312"));
            return \u078e2;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }

    private static Pattern \u08a1(JSONObject object, String string) {
        if (((String)(object = object.optString(string).trim())).isEmpty()) {
            return null;
        }
        try {
            object = Pattern.compile((String)object);
            return object;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }

    public String \u0529() {
        return this.\u052c;
    }

    public String \u052a(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u052d, string);
    }

    public LinkedHashMap<String, String> \u052b() {
        return this.\u052e;
    }

    public String \u052c() {
        return this.\u052a;
    }

    public String \u052d(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u052b, string);
    }

    public String \u052e() {
        return this.\u0529;
    }

    public String \u052f() {
        return this.\u0787;
    }

    public String \u058f() {
        return this.\u0788;
    }

    public String \u0620() {
        return this.\u078c;
    }

    public String \u0780(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u078d, string);
    }

    public String \u0781() {
        return this.\u078e;
    }

    public String \u0782(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u078f, string);
    }

    public String \u0783() {
        return this.\u0790;
    }

    public String \u0784(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u078b, string);
    }

    public String \u0785() {
        return this.\u078a;
    }

    public String \u0786(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u078b, string);
    }

    public String \u0787() {
        return this.\u0789;
    }

    public String \u0788() {
        return this.\u07a0;
    }

    public String \u0789(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u07a1, string);
    }

    public String \u078a() {
        return this.\u079c;
    }

    public String \u078b(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u079d, string);
    }

    public String \u078c() {
        return this.\u0798;
    }

    public String \u078d(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0799, string);
    }

    public String \u078e() {
        return this.\u07a4;
    }

    public String \u078f(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u07a5, string);
    }

    public String \u0790() {
        return this.\u07a2;
    }

    public String \u0791(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u07a3, string);
    }

    public boolean \u0792() {
        return this.\u0868;
    }

    public String \u0793() {
        return this.\u0860;
    }

    public String \u0794(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0861, string);
    }

    public String \u0795() {
        return this.\u07b1;
    }

    public String \u0796() {
        return this.\u0796;
    }

    public String \u0797(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0797, string);
    }

    public String \u0798() {
        return this.\u079e;
    }

    public String \u0799(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u079f, string);
    }

    public String \u079a() {
        return this.\u0794;
    }

    public String \u079b(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0795, string);
    }

    public String \u079c() {
        return this.\u0793;
    }

    public String \u079d() {
        return this.\u0792;
    }

    public String \u079e() {
        return this.\u0864;
    }

    public String \u079f(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0865, string);
    }

    public String \u07a0() {
        return this.\u0866;
    }

    public String \u07a1(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0867, string);
    }

    public String \u07a2() {
        return this.\u0862;
    }

    public String \u07a3() {
        return this.\u0863;
    }

    public String \u07a4() {
        return this.\u079a;
    }

    public String \u07a5(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u079b, string);
    }

    public JSONObject \u07b1() {
        return this.\u052f;
    }

    public String \u0860() {
        return this.\u08ac;
    }

    public String \u0861() {
        return this.\u0528;
    }

    public String \u0862() {
        return this.\u0781;
    }

    public String \u0863(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0782, string);
    }

    public String \u0864() {
        return this.\u0783;
    }

    public String \u0865(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0784, string);
    }

    public String \u0866() {
        return this.\u0785;
    }

    public String \u0867(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0786, string);
    }

    public String \u0868() {
        return this.\u0620;
    }

    public String \u0869(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u0780, string);
    }

    public String \u086a() {
        return this.\u058f;
    }

    public boolean \u08a0() {
        return this.\u08aa;
    }

    public String \u08a2() {
        return this.\u086a;
    }

    public String \u08a3() {
        return this.\u0869;
    }

    public String \u08a4() {
        return this.\u08a0;
    }

    public String \u08a5() {
        return this.\u08a4;
    }

    public String \u08a6(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u08a5, string);
    }

    public String \u08a7() {
        return this.\u08a6;
    }

    public String \u08a8(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u08a7, string);
    }

    public String \u08a9() {
        return this.\u08a8;
    }

    public String \u08aa(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u08a9, string);
    }

    public String \u08ab() {
        return this.\u08a2;
    }

    public String \u08ac(String string) {
        return com.github.catvod.spider.merge.\u078e.\u037f(this.\u08a3, string);
    }

    public String \u08ad() {
        return this.\u08a1;
    }

    public String \u08ae() {
        return this.\u08ab;
    }

    public String \u08af() {
        return this.\u037f;
    }
}

