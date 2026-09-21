package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.C0164g;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppYs extends Spider {
    private static HashMap<String, String> c;
    private static final Object d = new Object();
    private static final Pattern e = Pattern.compile(cYh.d("0620280D792A0F206E7F7D6548262E35"));
    private static final Pattern f = Pattern.compile(cYh.d("0620280D792A0F206E7F7C653B7E373E33"));
    private static final Pattern g = Pattern.compile(cYh.d("487E6A0D68744C6D"));
    private static final Pattern h = Pattern.compile(cYh.d("497A692425361B263D273E3E1B2029210B650E34686C"));
    private static final Pattern i = Pattern.compile(cYh.d("0F24352124655D7F6E0A09753A7A"));
    private static final Pattern[] j = {Pattern.compile(cYh.d("0D281D7F7C3212392C3038300E311D7F7C39083D6E213B3B1E3533")), Pattern.compile(cYh.d("17291D7F7C6D5F6931303906497B223F782A0B3138342575133D1D7F2732170C7E2425365A")), Pattern.compile(cYh.d("1D2438220B744C272023223B092A380D7971043F2C7E27360629242378065825333D6A")), Pattern.compile(cYh.d("1E392F3624320E0C6F7A203B1525203F2D233B7E6A32383748677968273B097F1D6E22280B6D")), Pattern.compile(cYh.d("1139310D7971173133263E223B7E6A3238375D6475626475173C20283228480C7E2425365A")), Pattern.compile(cYh.d("0620280D79710428282534353B7E6A3239")), Pattern.compile(cYh.d("482628210B744C22243F253F093D287F3439")), Pattern.compile(cYh.d("1E312F333E34000C6F7A273B152728290B744C332E3C6D6E5363727E273606292423")), Pattern.compile(cYh.d("0D232E3F0B744C33203F2333090C6F7A3439483131383D29083E1D7F273217")), Pattern.compile(cYh.d("0136253C0B744C3D283038360224370D7971043F2C7E0B6512222D6C")), Pattern.compile(cYh.d("1139310D797114292D263B06497B223F783B17396E0D683102297C")), Pattern.compile(cYh.d("0D281D7F7C3E0E3B2E252106497B223E3A753B6F34233B67")), Pattern.compile(cYh.d("1D3C380D79711F3A30292D06497B353E2775173C20283228480C7E2425365A")), Pattern.compile(cYh.d("522A2F3F0B744C28382B78375425790D7971173831")), Pattern.compile(cYh.d("1239256C666D5465673C2E67")), Pattern.compile(cYh.d("0620280D79711F3B3738333F080C6F7A333F1439263F78375425790D79711738310D682F153C7C")), Pattern.compile(cYh.d("173C20280B744C233B33383E063E2A282E06497B223E3A751F282E3E34340A32")), Pattern.compile(cYh.d("1139310D7971013A77616F6A3B7E6A292E2048202D302E3F157F1D6E22280B6D")), Pattern.compile(cYh.d("060C6F7A33221D3A79690B744C332E3C78300E353938")), Pattern.compile(cYh.d("0F3F32250B744C216C200B744C27203F3075062028")), Pattern.compile(cYh.d("83EFDCB5EACB"))};
    private static final Pattern[] k = {Pattern.compile(cYh.d("173C202832285A3E2426")), Pattern.compile(cYh.d("5B3428277733036D63273E3E023F63")), Pattern.compile(cYh.d("5B3428277733036D630A09783A7A7E213B3B1E353373")), Pattern.compile(cYh.d("487FA9F6D1B3C5C1A8C2E9BCE9F5")), Pattern.compile(cYh.d("2F3C321B240A0B31383425064F")), Pattern.compile(cYh.d("5B3927233637020B1D220B093A7A7E2225395A721A0F75074C6F63")), Pattern.compile(cYh.d("5B26283532353C0C320D04074D6F32233467450B1F730A715872"))};
    private String a = "";
    private final HashMap<String, String> b = new HashMap<>();

    private void a(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    a((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        a(jSONArray.getJSONObject(i2), str, arrayList);
                    }
                }
            } catch (JSONException e2) {
                SpiderDebug.log(e2);
            }
        }
    }

    private void b(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArray;
        String str3;
        String[] strArr;
        boolean z;
        int i2;
        boolean z2;
        ArrayList arrayList3;
        AppYs appYs;
        String d2 = cYh.d("4B");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        boolean contains = str.contains(cYh.d("0620287F2732177F20212775"));
        String d3 = cYh.d("0F2435216D75482628217937023E2629792C0E206E393837027F20213E65132931346A2314763438336754627568616351762A342E6706352720252E12273928121C2F1B0F1E06034125333D6A");
        String d4 = cYh.d("0D20267F3F35127E2D2478300A7F3B30783309342429792A0F20");
        String d5 = cYh.d("173133223205062028");
        String d6 = cYh.d("09312C34");
        String d7 = cYh.d("113F250E22280B0F3638233238202D302E3F15");
        String d8 = cYh.d("113F250E3436062332");
        String d9 = cYh.d("03313530");
        String d10 = cYh.d("12222D");
        String str4 = d2;
        String d11 = cYh.d("132931340834063D24");
        String d12 = cYh.d("113F250E34350924243F23");
        String d13 = cYh.d("113F250E3333153522253828");
        String str5 = d4;
        String d14 = cYh.d("113F250E3639133F33");
        String str6 = d5;
        String d15 = cYh.d("113F250E253F0A31333A24");
        ArrayList arrayList6 = arrayList4;
        String d16 = cYh.d("113F250E36280231");
        String str7 = d10;
        String d17 = cYh.d("113F250E2E3F0622");
        ArrayList arrayList7 = arrayList5;
        String d18 = cYh.d("113F250E273304");
        String str8 = d6;
        String d19 = cYh.d("113F250E393B0A35");
        String d20 = cYh.d("113F250E3E3E");
        if (contains) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(d9);
            jSONObject2.put(d20, jSONObject3.optString(d20, str2));
            jSONObject2.put(d19, jSONObject3.getString(d19));
            jSONObject2.put(d18, jSONObject3.getString(d18));
            jSONObject2.put(d11, jSONObject3.optString(d8));
            jSONObject2.put(d17, jSONObject3.optString(d17));
            jSONObject2.put(d16, jSONObject3.optString(d16));
            jSONObject2.put(d15, jSONObject3.optString(d15));
            jSONObject2.put(d14, jSONObject3.optString(d14));
            jSONObject2.put(d13, jSONObject3.optString(d13));
            jSONObject2.put(d12, jSONObject3.optString(d12));
            JSONArray jSONArray2 = jSONObject3.getJSONArray(d7);
            int i3 = 0;
            while (i3 < jSONArray2.length()) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                String str9 = str8;
                String o = o(jSONObject4.getString(str9));
                ArrayList arrayList8 = arrayList7;
                arrayList8.add(o);
                String str10 = str7;
                ArrayList arrayList9 = arrayList6;
                arrayList9.add(jSONObject4.getString(str10));
                String str11 = str6;
                String optString = jSONObject4.optString(str11);
                String str12 = str5;
                if (optString.contains(str12)) {
                    appYs = this;
                    optString = d3;
                } else {
                    appYs = this;
                }
                appYs.b.put(o, optString);
                i3++;
                arrayList7 = arrayList8;
                str7 = str10;
                str6 = str11;
                arrayList6 = arrayList9;
                str8 = str9;
                str5 = str12;
            }
        } else {
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            if (!str.contains(cYh.d("1F37202127"))) {
                ArrayList arrayList10 = arrayList6;
                ArrayList arrayList11 = arrayList7;
                String str16 = str15;
                if (str.contains(cYh.d("49262E35"))) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject(d9);
                    jSONObject2.put(d20, jSONObject5.optString(d20, str2));
                    jSONObject2.put(d19, jSONObject5.getString(d19));
                    jSONObject2.put(d18, jSONObject5.getString(d18));
                    jSONObject2.put(d11, jSONObject5.optString(d8));
                    jSONObject2.put(d17, jSONObject5.optString(d17));
                    jSONObject2.put(d16, jSONObject5.optString(d16));
                    jSONObject2.put(d15, jSONObject5.optString(d15));
                    jSONObject2.put(d14, jSONObject5.optString(d14));
                    jSONObject2.put(d13, jSONObject5.optString(d13));
                    jSONObject2.put(d12, jSONObject5.optString(d12));
                    JSONArray jSONArray3 = jSONObject5.getJSONArray(cYh.d("113F250E273606291E3D3E2913"));
                    int i4 = 0;
                    while (i4 < jSONArray3.length()) {
                        JSONObject jSONObject6 = jSONArray3.getJSONObject(i4);
                        String d21 = cYh.d("173C2028322838392F3738");
                        String o2 = o(jSONObject6.getJSONObject(d21).getString(cYh.d("14382E26")));
                        ArrayList arrayList12 = arrayList11;
                        arrayList12.add(o2);
                        String str17 = str16;
                        ArrayList arrayList13 = arrayList10;
                        arrayList13.add(jSONObject6.getString(str17));
                        try {
                            ArrayList arrayList14 = new ArrayList();
                            str3 = str4;
                            try {
                                String[] split = jSONObject6.getJSONObject(d21).optString(cYh.d("1731332232")).split(str3);
                                String[] split2 = jSONObject6.getJSONObject(d21).optString(cYh.d("173133223268")).split(str3);
                                int length = split.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    try {
                                        String str18 = split[i5];
                                        if (g.matcher(str18).find()) {
                                            Pattern[] patternArr = j;
                                            jSONArray = jSONArray3;
                                            try {
                                                int length2 = patternArr.length;
                                                i2 = length;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 >= length2) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                    int i7 = length2;
                                                    if (patternArr[i6].matcher(str18).find()) {
                                                        z2 = false;
                                                        break;
                                                    } else {
                                                        i6++;
                                                        length2 = i7;
                                                    }
                                                }
                                                if (z2) {
                                                    arrayList14.add(str18);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                SpiderDebug.log(e);
                                                i4++;
                                                jSONArray3 = jSONArray;
                                                arrayList10 = arrayList13;
                                                arrayList11 = arrayList12;
                                                str4 = str3;
                                                str16 = str17;
                                            }
                                        } else {
                                            jSONArray = jSONArray3;
                                            i2 = length;
                                        }
                                        i5++;
                                        jSONArray3 = jSONArray;
                                        length = i2;
                                    } catch (Exception e3) {
                                        e = e3;
                                        jSONArray = jSONArray3;
                                    }
                                }
                                jSONArray = jSONArray3;
                                int length3 = split2.length;
                                int i8 = 0;
                                while (i8 < length3) {
                                    String str19 = split2[i8];
                                    if (g.matcher(str19).find()) {
                                        Pattern[] patternArr2 = j;
                                        int length4 = patternArr2.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length4) {
                                                strArr = split2;
                                                z = true;
                                                break;
                                            }
                                            strArr = split2;
                                            if (patternArr2[i9].matcher(str19).find()) {
                                                z = false;
                                                break;
                                            } else {
                                                i9++;
                                                split2 = strArr;
                                            }
                                        }
                                        if (z) {
                                            arrayList14.add(str19);
                                        }
                                    } else {
                                        strArr = split2;
                                    }
                                    i8++;
                                    split2 = strArr;
                                }
                                if (arrayList14.size() <= 0 || !((String) arrayList14.get(0)).contains(cYh.d("5A"))) {
                                    this.b.put(o2, cYh.d("0F2435216D7548616F60666D49617463796854697B626E6A57606E6E22280B6D"));
                                } else {
                                    String str20 = (String) arrayList14.get(0);
                                    boolean contains2 = str20.contains(cYh.d("0F243521"));
                                    String d22 = cYh.d("49");
                                    String d23 = cYh.d("497E");
                                    try {
                                        if (contains2) {
                                            Matcher matcher = h.matcher(str20);
                                            if (matcher.find()) {
                                                str20 = matcher.group(0).replace(d23, d22).replace(cYh.d("1139317F36351339203F7936082624"), cYh.d("1139317F303B0824283039740B3F3734"));
                                            }
                                        } else if (str20.contains(cYh.d("487F"))) {
                                            Matcher matcher2 = h.matcher(str20);
                                            if (matcher2.find()) {
                                                str20 = cYh.d("0F2435216D") + matcher2.group(0).replace(d23, d22);
                                            }
                                        } else {
                                            Matcher matcher3 = i.matcher(str);
                                            if (matcher3.find()) {
                                                Matcher matcher4 = h.matcher(str);
                                                if (matcher4.find()) {
                                                    StringBuilder sb = new StringBuilder();
                                                    try {
                                                        sb.append(matcher3.group(0));
                                                        sb.append(matcher4.group(0).replace(d23, d22));
                                                        str20 = sb.toString();
                                                        this.b.put(o2, str20);
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        SpiderDebug.log(e);
                                                        i4++;
                                                        jSONArray3 = jSONArray;
                                                        arrayList10 = arrayList13;
                                                        arrayList11 = arrayList12;
                                                        str4 = str3;
                                                        str16 = str17;
                                                    }
                                                }
                                            }
                                        }
                                        this.b.put(o2, str20);
                                    } catch (Exception e5) {
                                        e = e5;
                                        SpiderDebug.log(e);
                                        i4++;
                                        jSONArray3 = jSONArray;
                                        arrayList10 = arrayList13;
                                        arrayList11 = arrayList12;
                                        str4 = str3;
                                        str16 = str17;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                jSONArray = jSONArray3;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            jSONArray = jSONArray3;
                            str3 = str4;
                        }
                        i4++;
                        jSONArray3 = jSONArray;
                        arrayList10 = arrayList13;
                        arrayList11 = arrayList12;
                        str4 = str3;
                        str16 = str17;
                    }
                    arrayList2 = arrayList10;
                    arrayList = arrayList11;
                } else {
                    if (e.matcher(str).find()) {
                        jSONObject2.put(d20, jSONObject.optString(d20, str2));
                        String d24 = cYh.d("1339353D32");
                        jSONObject2.put(d19, jSONObject.getString(d24));
                        jSONObject2.put(d18, jSONObject.getString(cYh.d("0E3D260E22280B")));
                        jSONObject2.put(d11, n(jSONObject.optJSONArray(cYh.d("13293134"))));
                        jSONObject2.put(d17, jSONObject.optString(cYh.d("172523253E3702")));
                        jSONObject2.put(d16, n(jSONObject.optJSONArray(cYh.d("06222430"))));
                        jSONObject2.put(d15, jSONObject.optString(cYh.d("1322343F3C")));
                        jSONObject2.put(d14, n(jSONObject.optJSONArray(cYh.d("0633353E25"))));
                        jSONObject2.put(d13, n(jSONObject.optJSONArray(cYh.d("03393334342E0822"))));
                        jSONObject2.put(d12, jSONObject.optString(cYh.d("0E3E352338")));
                        JSONObject jSONObject7 = jSONObject.getJSONObject(cYh.d("1139253438360E2335"));
                        Iterator<String> keys = jSONObject7.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONArray jSONArray4 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList15 = new ArrayList();
                            for (int i10 = 0; i10 < jSONArray4.length(); i10++) {
                                JSONObject jSONObject8 = jSONArray4.getJSONObject(i10);
                                arrayList15.add(jSONObject8.getString(d24) + cYh.d("43") + jSONObject8.getString(str16));
                            }
                            arrayList11.add(o(next));
                            arrayList10.add(TextUtils.join(cYh.d("44"), arrayList15));
                        }
                    }
                    arrayList = arrayList11;
                    arrayList2 = arrayList10;
                }
                String d25 = cYh.d("437465");
                jSONObject2.put(cYh.d("113F250E273606291E3725350A"), TextUtils.join(d25, arrayList));
                jSONObject2.put(cYh.d("113F250E273606291E242536"), TextUtils.join(d25, arrayList2));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject(d9).getJSONObject(cYh.d("113F250E3E34013F"));
            jSONObject2.put(d20, jSONObject9.optString(d20, str2));
            jSONObject2.put(d19, jSONObject9.getString(d19));
            jSONObject2.put(d18, jSONObject9.getString(d18));
            jSONObject2.put(d11, jSONObject9.optString(d8));
            jSONObject2.put(d17, jSONObject9.optString(d17));
            jSONObject2.put(d16, jSONObject9.optString(d16));
            jSONObject2.put(d15, jSONObject9.optString(d15));
            jSONObject2.put(d14, jSONObject9.optString(d14));
            jSONObject2.put(d13, jSONObject9.optString(d13));
            jSONObject2.put(d12, jSONObject9.optString(d12));
            JSONArray jSONArray5 = jSONObject9.getJSONArray(d7);
            int i11 = 0;
            while (i11 < jSONArray5.length()) {
                JSONObject jSONObject10 = jSONArray5.getJSONObject(i11);
                String str21 = str8;
                String o3 = o(jSONObject10.getString(str21));
                ArrayList arrayList16 = arrayList7;
                arrayList16.add(o3);
                String str22 = str15;
                ArrayList arrayList17 = arrayList6;
                arrayList17.add(jSONObject10.getString(str22));
                String str23 = str14;
                String optString2 = jSONObject10.optString(str23);
                String str24 = str13;
                if (optString2.contains(str24)) {
                    arrayList3 = arrayList17;
                    optString2 = d3;
                } else {
                    arrayList3 = arrayList17;
                }
                this.b.put(o3, optString2);
                i11++;
                str8 = str21;
                arrayList7 = arrayList16;
                str15 = str22;
                str14 = str23;
                str13 = str24;
                arrayList6 = arrayList3;
            }
        }
        arrayList = arrayList7;
        arrayList2 = arrayList6;
        String d252 = cYh.d("437465");
        jSONObject2.put(cYh.d("113F250E273606291E3725350A"), TextUtils.join(d252, arrayList));
        jSONObject2.put(cYh.d("113F250E273606291E242536"), TextUtils.join(d252, arrayList2));
    }

    private void f(String str, JSONObject jSONObject) {
        String str2;
        Object d2;
        String str3;
        int i2;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        boolean z;
        String str6;
        String str7 = str;
        boolean contains = str7.contains(cYh.d("053128352274043F2C"));
        String d3 = cYh.d("173C202802280B");
        String d4 = cYh.d("1731332232");
        String d5 = cYh.d("12222D");
        if (contains) {
            String str8 = str7.split(cYh.d("10347C"))[1];
            boolean contains2 = str8.contains(cYh.d("03252E3522351D296F323837"));
            String d6 = cYh.d("0F3520353228");
            if (!contains2 && !str8.contains(cYh.d("14252E2838740433"))) {
                if (str8.contains(cYh.d("1F3638"))) {
                    JSONObject jSONObject2 = new JSONObject(C0164g.g(str8, null));
                    jSONObject.put(d4, 0);
                    jSONObject.put(d3, "");
                    jSONObject.put(d5, jSONObject2.getString(d5));
                    d2 = cYh.d("1C723334313F153533736D7847313121302F0620287F3B330F312E28223449242E216D6B5665756275764505323425772637243F23785D7261153628137F737F666E47782530252E5D392E7875271A");
                } else {
                    boolean contains3 = str8.contains(cYh.d("0620287F3E3517352F28223449332E3C6D625F"));
                    String d7 = cYh.d("5A");
                    if (contains3) {
                        if (str8.contains(cYh.d("0F242C3D"))) {
                            StringBuilder b = C0059d.b(cYh.d("0F2435212460487F20213E740A633469792E116A7467606248382E3C32750620286E232317357C28247C1239256C656954677060713102297C3530330B3F34271111290212060F685366767722280B6D"));
                            b.append(str8.split(d7)[1]);
                            str7 = new JSONObject(C0164g.g(b.toString(), null)).getString(d5);
                            jSONObject.put(d4, 0);
                        } else {
                            jSONObject.put(d4, 1);
                            jSONObject.put(d3, "");
                            jSONObject.put(d5, str8);
                            jSONObject.put(cYh.d("1231"), cYh.d("2A3F3B383B36067F747F677A30392F35382D146171"));
                            d2 = cYh.d("1C721334313F153533736D780F2435212460487F3422322849392E2132341E252F7F34350A6A7463677512232423782C0E34243E78781A");
                        }
                    } else if (str8.contains(cYh.d("0431357F203101392D347939083D"))) {
                        jSONObject.put(d4, 0);
                        jSONObject.put(d3, "");
                        jSONObject.put(d5, str8);
                        d2 = cYh.d("1C72142232284A112634392E456A63711B3B11366E646F7456626F60676A457C6303323C0222242375604570363A31330B356F323837452D");
                    } else {
                        if (str8.contains(d7) || str8.indexOf(cYh.d("493D72246F")) <= 15) {
                            String d8 = cYh.d("493D3165");
                            if (str8.indexOf(d8) <= 15 && !str8.contains(cYh.d("483F233B782E0823"))) {
                                if (str8.contains(d7)) {
                                    HashMap hashMap = new HashMap();
                                    String d9 = cYh.d("322324237A1B00352F25");
                                    String d10 = cYh.d("2A3F3B383B36067F747F677A263E2523383303");
                                    hashMap.put(d9, d10);
                                    TreeMap treeMap = new TreeMap();
                                    String j2 = C0164g.j(str8, hashMap, treeMap);
                                    String d11 = C0164g.d(treeMap);
                                    String d12 = cYh.d("05392D3835330B396F323837");
                                    String d13 = cYh.d("0A3735277939083D");
                                    str2 = d6;
                                    String d14 = cYh.d("5B38353C3B");
                                    String d15 = cYh.d("12222D6C");
                                    if (d11 == null) {
                                        boolean contains4 = j2.contains(d14);
                                        String d16 = cYh.d("0F2435212460487F2B297938063E3824393D4928382B6D6D5069787E273606292423786512222D6C");
                                        String d17 = cYh.d("0F2435216D7548616F60666D49617463796854697B626E6A57606E6E22280B6D");
                                        String d18 = cYh.d("15352F2332340A39");
                                        String d19 = cYh.d("0F243521");
                                        String d20 = cYh.d("0F2435216D7548273626796B5768713A36344933227E3D330228287E25280A396F213F2A5825333D6A");
                                        if (contains4) {
                                            Pattern[] patternArr = k;
                                            int length = patternArr.length;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 >= length) {
                                                    z = false;
                                                    break;
                                                }
                                                int i4 = length;
                                                if (patternArr[i3].matcher(j2).find()) {
                                                    z = true;
                                                    break;
                                                } else {
                                                    i3++;
                                                    length = i4;
                                                }
                                            }
                                            if (!z) {
                                                if (str8.split(d15)[1].contains(d19)) {
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb = new StringBuilder();
                                                    sb.append(d17);
                                                    str4 = str8.split(d15)[1];
                                                } else if (str8.split(d15)[1].contains(d18)) {
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb2 = new StringBuilder();
                                                    sb2.append(d20);
                                                    str5 = str8.split(d15)[1];
                                                    sb2.append(str5);
                                                    jSONObject.put(d5, sb2.toString());
                                                    d2 = cYh.d("1C721334313F153533736D780F2435216D7548273626796B5768713A36344933227E7527");
                                                } else {
                                                    String str9 = str8.split(d15)[1];
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb = new StringBuilder();
                                                    sb.append(d16);
                                                    str4 = str8.split(d15)[1];
                                                }
                                                sb.append(str4);
                                                str7 = sb.toString();
                                                jSONObject.put(d5, str7);
                                            }
                                            i2 = 1;
                                        } else {
                                            try {
                                                str7 = new JSONObject(j2).optString(d5);
                                            } catch (Exception e2) {
                                                e2.printStackTrace();
                                                str7 = "";
                                            }
                                            if (str7.length() <= 1) {
                                                if (str8.split(d15)[1].contains(d19)) {
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb = new StringBuilder();
                                                    sb.append(d17);
                                                    str4 = str8.split(d15)[1];
                                                } else if (str8.split(d15)[1].contains(d18)) {
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb2 = new StringBuilder();
                                                    sb2.append(d20);
                                                    str5 = str8.split(d15)[1];
                                                    sb2.append(str5);
                                                    jSONObject.put(d5, sb2.toString());
                                                    d2 = cYh.d("1C721334313F153533736D780F2435216D7548273626796B5768713A36344933227E7527");
                                                } else {
                                                    String str10 = str8.split(d15)[1];
                                                    jSONObject.put(d4, 1);
                                                    jSONObject.put(d3, "");
                                                    sb = new StringBuilder();
                                                    sb.append(d16);
                                                    str4 = str8.split(d15)[1];
                                                }
                                                sb.append(str4);
                                                str7 = sb.toString();
                                                jSONObject.put(d5, str7);
                                            }
                                            if (str8.contains(d13)) {
                                                jSONObject.put(d4, 0);
                                                jSONObject.put(d3, "");
                                                jSONObject.put(d5, str7);
                                            } else {
                                                str8.contains(d12);
                                                jSONObject.put(d4, 0);
                                            }
                                        }
                                        jSONObject.put(str3, d2);
                                        return;
                                    }
                                    String str11 = "";
                                    String str12 = d11;
                                    String str13 = j2;
                                    while (true) {
                                        str6 = d13;
                                        if (str12 == null) {
                                            str12 = str11;
                                            break;
                                        }
                                        String str14 = d8;
                                        if (str12.indexOf(d8) > 30) {
                                            break;
                                        }
                                        hashMap.put(d9, d10);
                                        str13 = C0164g.j(str12, hashMap, treeMap);
                                        str11 = str12;
                                        d13 = str6;
                                        str12 = C0164g.d(treeMap);
                                        d8 = str14;
                                    }
                                    if (!str12.contains(cYh.d("5A38352527")) && !str12.contains(d15)) {
                                        boolean contains5 = str8.contains(cYh.d("1027367F3A3D13266F323837"));
                                        jSONObject.put(d4, 0);
                                        jSONObject.put(d3, "");
                                        jSONObject.put(d5, str12);
                                        if (!contains5) {
                                            return;
                                        }
                                    } else if (str13.contains(d14)) {
                                        jSONObject.put(d4, 1);
                                        jSONObject.put(d3, "");
                                        jSONObject.put(d5, str12);
                                        return;
                                    } else {
                                        Object string = new JSONObject(str13).getString(d5);
                                        jSONObject.put(d4, 0);
                                        jSONObject.put(d3, "");
                                        jSONObject.put(d5, string);
                                        if (!str12.contains(str6)) {
                                            str12.contains(d12);
                                            return;
                                        }
                                    }
                                    d2 = cYh.d("1C72142232284A112634392E456A63711A351D392D3D3675527E71737B7A4502243732280222636B757A452D");
                                } else {
                                    i2 = 0;
                                }
                                jSONObject.put(d4, i2);
                                jSONObject.put(d3, "");
                                jSONObject.put(d5, str8);
                                return;
                            }
                        }
                        str2 = d6;
                        if (str8.contains(cYh.d("0F232D7F2E2900336F292E20"))) {
                            Object string2 = new JSONObject(C0164g.g(cYh.d("0F2435212460487F2B2979231437227F2F231D7F7E2425365A") + str8, null)).getString(d5);
                            jSONObject.put(d4, 0);
                            jSONObject.put(d3, "");
                            jSONObject.put(d5, string2);
                            d2 = cYh.d("1C721334313F153533736D784738352527295D7F6E28243D047E22327527");
                        } else {
                            if (!str8.contains(cYh.d("567E33243E3C023E263D3574043F2C"))) {
                                Matcher matcher = Pattern.compile(cYh.d("497A6939232E177E6B78")).matcher(str8);
                                boolean find = matcher.find();
                                jSONObject.put(d4, 0);
                                jSONObject.put(d3, "");
                                if (find) {
                                    str7 = matcher.group(1);
                                    jSONObject.put(d5, str7);
                                }
                                jSONObject.put(d5, str8);
                                return;
                            }
                            jSONObject.put(d4, 0);
                            jSONObject.put(d3, "");
                            jSONObject.put(d5, str8);
                            d2 = cYh.d("1C721334313F153533736D784738352527295D7F6E60792812392734393D0B326F323837452D");
                        }
                    }
                }
                str3 = d6;
                jSONObject.put(str3, d2);
                return;
            }
            str2 = d6;
            JSONObject jSONObject3 = new JSONObject(C0164g.g(cYh.d("0F2435212460487F36262074516079613C3B097E2232783B17206F213F2A5825333D6A") + str8, null));
            jSONObject.put(d4, 0);
            jSONObject.put(d3, "");
            jSONObject.put(d5, jSONObject3.getString(d5));
            d2 = cYh.d("1C72142232284A112634392E456A63711A351D392D3D3675527E71717F0D0E3E253E2029471E1571666A49607A71001530667578771B17202D34003F051B2825786F54676F62617A4F1B09051A164B702D383C3F471724323C354E70023925350A356E666574577E7267656C49687071043B01313338786F54676F62617A341561637902471D242536091570707F67784B723334313F153533736D784738352527295D7F6E213B3B1E35337F332F0834343E2D2349332E3C7576453F3338303309727B737732132431226D754834317F332F0834343E2D2349332E3C757645182E2223785D72613236390F356F3C642F5F7E32243823087E22327527");
            str3 = str2;
            jSONObject.put(str3, d2);
            return;
        }
        jSONObject.put(d4, 1);
        jSONObject.put(d3, "");
        jSONObject.put(d5, str7);
    }

    private HashMap<String, String> g(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(cYh.d("322324237A1B00352F25"), (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127")) || str.contains(cYh.d("012224343C3B09"))) ? cYh.d("233133257868496175717F3E0622356B3E354E") : (str.contains(cYh.d("1D2323")) || str.contains(cYh.d("013B3922")) || str.contains(cYh.d("1F313822")) || str.contains(cYh.d("1F333822")) || str.contains(cYh.d("142A3822")) || str.contains(cYh.d("03283822")) || str.contains(cYh.d("1E243822")) || str.contains(cYh.d("163E3822"))) ? cYh.d("233133257868496174717F3E0622356B3E354E") : str.contains(cYh.d("49262E35")) ? cYh.d("083B2925232A48646F60796A") : cYh.d("23312D273E3148626F60796A"));
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003e, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
    
        if (r2.b.containsKey(r4) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.b.containsKey(r4) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r3 = r2.b.get(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String h(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.regex.Pattern r0 = com.github.catvod.spider.AppYs.f
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.find()
            if (r0 == 0) goto L1d
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.b
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L3e
        L14:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.b
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            goto L40
        L1d:
            java.lang.String r0 = "0620287F2732177F20212775"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "1F37202127"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L40
        L35:
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r2.b
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L3e
            goto L14
        L3e:
            java.lang.String r3 = ""
        L40:
            java.lang.String r0 = "1426282179300F29343F79301F7E223F"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r0 = r3.contains(r0)
            java.lang.String r1 = "0F2435212460487F2B29792A062236382F74043F2C6B636E54636E213B3B1E35337E682F153C7C"
            java.lang.String r1 = com.github.catvod.spider.merge.cYh.d(r1)
            if (r0 != 0) goto L86
            java.lang.String r0 = "1426282179300F343826792C0E20"
            java.lang.String r0 = com.github.catvod.spider.merge.cYh.d(r0)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L5f
            goto L86
        L5f:
            java.lang.String r4 = "0D38323B7937063E25243F2F49332E3C"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L84
            java.lang.String r4 = "117E2B393323107E373827750938252B616C51"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto L78
            goto L84
        L78:
            java.lang.String r4 = "1F7D2F7F3439"
            java.lang.String r4 = com.github.catvod.spider.merge.cYh.d(r4)
            boolean r4 = r3.contains(r4)
            if (r4 == 0) goto Lbe
        L84:
            r3 = r1
            goto Lbe
        L86:
            java.lang.String r3 = "83EAFBB5EDE08FEFF6"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L99
            java.lang.String r3 = "0F2435216D7548273626796B5768713A36344933227E3D330228287E25280A396F213F2A5825333D6A"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            goto Lbe
        L99:
            java.lang.String r3 = "83EAFBB5EDE0"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto Lac
            java.lang.String r3 = "0F2435216D7548273626796B5768713A36344933227E3D330228287E252849202921682F153C7C"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            goto Lbe
        Lac:
            java.lang.String r3 = "80C5EBB9DBDE"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L84
            java.lang.String r3 = "0F2435216D7548273626796B5768713A36344933227E3D330228287E312B49202921682F153C7C"
            java.lang.String r3 = com.github.catvod.spider.merge.cYh.d(r3)
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYs.h(java.lang.String, java.lang.String):java.lang.String");
    }

    private String j(String str, String str2, String str3) {
        boolean contains = str.contains(cYh.d("1F37202127"));
        CharSequence d2 = cYh.d("1F3638");
        CharSequence d3 = cYh.d("483F233B782E0823");
        String d4 = cYh.d("493D3165");
        String d5 = cYh.d("493D72246F");
        String d6 = cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C");
        String d7 = cYh.d("12222D6C");
        if (contains || str.contains(cYh.d("0620287F2732177F20212775")) || str.contains(cYh.d("49262E35"))) {
            if (str3.indexOf(d5) > 15 || str3.indexOf(d4) > 15 || str3.contains(d3)) {
                if (str3.contains(d7)) {
                    StringBuilder b = C0059d.b(d6);
                    b.append(str3.split(d7)[1]);
                    return b.toString();
                }
                return n.a(d6, str3);
            }
            if (!str2.contains(d7) && str3.contains(cYh.d("353F2F360F3309371703"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E783C0623357F253509373938393D11226F3239605F687767783B17396E6E3C3F1E6D2F023F0D123D06351A130504363F300E0519672425365A"), str3);
            }
            if (!str2.contains(d7) && str3.contains(cYh.d("2B04"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E783C507E31282F3E03336F3238374832223B2F75533B6F213F2A5825333D6A"), str3);
            }
            if (!str2.contains(d7) && str3.contains(cYh.d("15352F2332340A39"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E78311232207F253F0922243F3A334933226B656851666E302733486F2A342E673E6614081B03133A083C03192C3578691D1E4125333D6A"), str3);
            }
            if (!str2.contains(d7) && str3.contains(cYh.d("4938353C3B"))) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E66745661767F666F557E73626E605469716167755825333D6A"), str3);
            }
            if (str3.contains(d2)) {
                return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E3D330228287F2E2F093C6F3234750620287E683102297C290E142203180221121761050765390C1B327722280B6D"), str3);
            }
            return d6 + str2 + str3;
        }
        if (!e.matcher(str).find()) {
            return n.a(d6, str3);
        }
        if (str3.indexOf(d5) > 15 || str3.indexOf(d4) > 15 || str3.contains(d3)) {
            if (str3.contains(d7)) {
                StringBuilder b2 = C0059d.b(d6);
                b2.append(str3.split(d7)[1]);
                return b2.toString();
            }
            return n.a(d6, str3);
        }
        if (str3.contains(d2)) {
            if (str3.contains(d7)) {
                StringBuilder b3 = C0059d.b(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E176A6E7E343B0438247F333713246F292E20482827283D22482827283D2249202921682F153C7C"));
                b3.append(str3.split(d7)[1]);
                return b3.toString();
            }
            return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E7830143F2F7F3F3C1E22367F34350A7F2C303874003F7E2425365A"), str3);
        }
        if (str3.contains(cYh.d("1027367F35330B3923383B3349332E3C"))) {
            return n.a(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E78301F7E3130252D0E286F3238375D6475626475173C20283228486F34233B67"), str3.split(d7)[1]);
        }
        if (!str.contains(cYh.d("1D38243F3123"))) {
            String d8 = cYh.d("042A3527");
            if (!str.contains(d8) && !str.contains(cYh.d("567E7065796C547E706166")) && !str.contains(cYh.d("0139356B6F")) && !str.contains(cYh.d("03392D383C2E117E39282D")) && !str.contains(cYh.d("17203B392274113931")) && !str.contains(cYh.d("0620287F6F3E5F216F323837")) && !str.contains(cYh.d("0F312E3A36340D25707F3439")) && !str.contains(d8)) {
                if (!str.contains(cYh.d("0B2838282E")) && !str.contains(cYh.d("0D7E3B3B3D740B392734")) && !str.contains(cYh.d("0B3B3527")) && !str.contains(cYh.d("57687069232C")) && !str.contains(cYh.d("15252E293E340227"))) {
                    return n.a(d6, str3);
                }
                StringBuilder b4 = C0059d.b(cYh.d("0F2435212460487F36262074053128352274043F2C7E246510347C39232E17237B7E782A0B31387F23311E236F2521755825333D6A"));
                b4.append(str3.split(d7)[1]);
                return b4.toString();
            }
        }
        return d6 + str3 + cYh.d("413131216A6B57607161713B04332E24392E5A627663606D52607369712A062332263828036D3020656D5567766467685F");
    }

    private String l(String str, String str2) {
        StringBuilder sb;
        String d2;
        boolean contains = str.contains(cYh.d("49262E35"));
        String d3 = cYh.d("412020363267");
        if (contains) {
            if (str.contains(cYh.d("0E3F31343923123E6F323837"))) {
                sb = new StringBuilder();
                sb.append(str);
                d2 = cYh.d("483C2822236510347C");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                d2 = cYh.d("5827256C");
            }
        } else {
            if (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(cYh.d("143520233432582424292367"));
                sb.append(str2);
                sb.append(cYh.d("4120266C"));
                return sb.toString();
            }
            if (!e.matcher(str).find()) {
                return "";
            }
            if (str.contains(cYh.d("0223243D3B3B12242E")) || str.contains(cYh.d("567E7065796C547E706166")) || str.contains(cYh.d("1D3A3822")) || str.contains(cYh.d("033325")) || str.contains(cYh.d("0B283434")) || str.contains(cYh.d("10352425363349332F")) || str.contains(cYh.d("0F312E3A36340D2570")) || str.contains(cYh.d("0139356B6F")) || str.contains(cYh.d("1D3A2B7F3B330135")) || str.contains(cYh.d("0B3F37346E635F69")) || str.contains(cYh.d("5F347920")) || str.contains(cYh.d("0B3B6F212F2F09")) || str.contains(cYh.d("0F373829")) || str.contains(cYh.d("5262702962")) || str.contains(cYh.d("0B2838282E")) || str.contains(cYh.d("57687069232C")) || str.contains(cYh.d("0339383E2233")) || str.contains(cYh.d("03392D383C2E11")) || str.contains(cYh.d("17203B3922")) || str.contains(cYh.d("06393534242F043128")) || str.contains(cYh.d("1D2A6F323E")) || str.contains(cYh.d("0438393B3834")) || str.contains(cYh.d("103135323F370E")) || str.contains(cYh.d("1139313327")) || str.contains(cYh.d("05383527")) || str.contains(cYh.d("1F36383A3B"))) {
                sb = new StringBuilder();
                sb.append(str);
                d2 = cYh.d("5831226C3B33142467263367");
            } else {
                sb = new StringBuilder();
                sb.append(str);
                d2 = cYh.d("5831226C3B331424672B3A67");
            }
        }
        sb.append(d2);
        sb.append(str2);
        sb.append(d3);
        return sb.toString();
    }

    private boolean m(String str) {
        return str.equals(cYh.d("83ECE7B6C7DC")) || str.equals(cYh.d("81D3C4B9DEE8")) || str.equals(cYh.d("80F6CEB4DFF3"));
    }

    private String n(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return TextUtils.join(cYh.d("4B"), arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    private static String o(String str) {
        synchronized (d) {
            if (c == null) {
                HashMap<String, String> hashMap = new HashMap<>();
                c = hashMap;
                hashMap.put(cYh.d("1E3F343A22"), cYh.d("83ECD9B8D2ED2A"));
                c.put(cYh.d("1621"), cYh.d("8FD5FFB9F9F52A"));
                c.put(cYh.d("0E2128283E"), cYh.d("80D8F0B4F2DD8FD9FB1C"));
                c.put(cYh.d("16393838"), cYh.d("82F5C6B9DEE02A"));
                c.put(cYh.d("0B353527"), cYh.d("83E9D1B9F0DC2A"));
                c.put(cYh.d("143F2924"), cYh.d("81C0DDB6DCCA2A"));
                c.put(cYh.d("1325253E22"), cYh.d("82CCDEB9E6DC2A"));
                c.put(cYh.d("17203527"), cYh.d("370015071A"));
                c.put(cYh.d("0A373527"), cYh.d("8FDAD3B7C9C633060C"));
                c.put(cYh.d("10313224"), cYh.d("82DDCFB7C2EA2A"));
                c.put(cYh.d("05392D3835330B39"), cYh.d("82C3D5B4C4F32A"));
            }
            if (!c.containsKey(str)) {
                return str;
            }
            return c.get(str);
        }
    }

    final String c(String str) {
        StringBuilder b;
        String d2;
        if (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) {
            if (str.contains(cYh.d("03392B3836220E31"))) {
                return cYh.d("0F2435216D7548273626793E0E3A28302F33067E223E3A750620287F2732177F202127751139253438651339256C");
            }
            b = C0059d.b(str);
            d2 = cYh.d("1139253438651339256C");
        } else if (!str.contains(cYh.d("49262E35"))) {
            b = C0059d.b(str);
            d2 = cYh.d("5831226C3B33142467323B3B14237C");
        } else if (str.contains(cYh.d("0E3F31343923123E"))) {
            b = C0059d.b(str);
            d2 = cYh.d("483C28222365132931346A");
        } else {
            b = C0059d.b(str);
            d2 = cYh.d("582438213267");
        }
        b.append(d2);
        return b.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:5|6|(23:11|(1:13)(1:114)|14|(1:113)(1:18)|19|(1:112)(1:23)|24|(1:111)(1:28)|29|(1:110)(1:33)|34|35|(1:109)(1:39)|40|41|42|(2:83|(3:88|(3:100|(1:102)(2:104|105)|103)|106)(1:87))(1:46)|47|(2:69|(5:78|(1:82)|(3:53|(5:56|57|(2:59|60)(2:62|63)|61|54)|64)|65|66)(1:77))|51|(0)|65|66)|115|14|(1:16)|113|19|(1:21)|112|24|(1:26)|111|29|(1:31)|110|34|35|(1:37)|109|40|41|42|(1:44)|83|(1:85)|88|(17:90|92|94|96|98|100|(0)(0)|103|47|(1:49)|69|(1:71)|78|(2:80|82)|(0)|65|66)|106|47|(0)|69|(0)|78|(0)|(0)|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        com.github.catvod.crawler.SpiderDebug.log(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7 A[Catch: Exception -> 0x01be, TryCatch #1 {Exception -> 0x01be, blocks: (B:42:0x0142, B:44:0x0148, B:46:0x0150, B:83:0x0156, B:85:0x015c, B:87:0x0164, B:88:0x0169, B:90:0x016f, B:92:0x0177, B:94:0x0181, B:96:0x018d, B:98:0x0197, B:100:0x01a3, B:102:0x01b7, B:104:0x01b9), top: B:41:0x0142, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b9 A[Catch: Exception -> 0x01be, TRY_LEAVE, TryCatch #1 {Exception -> 0x01be, blocks: (B:42:0x0142, B:44:0x0148, B:46:0x0150, B:83:0x0156, B:85:0x015c, B:87:0x0164, B:88:0x0169, B:90:0x016f, B:92:0x0177, B:94:0x0181, B:96:0x018d, B:98:0x0197, B:100:0x01a3, B:102:0x01b7, B:104:0x01b9), top: B:41:0x0142, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d1 A[Catch: Exception -> 0x02cd, TryCatch #2 {Exception -> 0x02cd, blocks: (B:6:0x004e, B:8:0x006d, B:11:0x007a, B:13:0x0086, B:14:0x009a, B:16:0x00b3, B:18:0x00b9, B:19:0x00c2, B:21:0x00ce, B:23:0x00d4, B:24:0x00dd, B:26:0x00e9, B:28:0x00ef, B:29:0x00f8, B:31:0x0104, B:33:0x010a, B:34:0x0113, B:37:0x011f, B:39:0x0125, B:40:0x012e, B:47:0x01c5, B:49:0x01d1, B:51:0x01d9, B:54:0x021c, B:56:0x0222, B:59:0x0240, B:61:0x02a1, B:62:0x0265, B:65:0x02a9, B:69:0x01de, B:71:0x01e4, B:73:0x01ec, B:75:0x01f6, B:77:0x0202, B:78:0x0207, B:80:0x020d, B:82:0x0215, B:108:0x01bf, B:114:0x008d, B:115:0x0094, B:42:0x0142, B:44:0x0148, B:46:0x0150, B:83:0x0156, B:85:0x015c, B:87:0x0164, B:88:0x0169, B:90:0x016f, B:92:0x0177, B:94:0x0181, B:96:0x018d, B:98:0x0197, B:100:0x01a3, B:102:0x01b7, B:104:0x01b9), top: B:5:0x004e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e4 A[Catch: Exception -> 0x02cd, TryCatch #2 {Exception -> 0x02cd, blocks: (B:6:0x004e, B:8:0x006d, B:11:0x007a, B:13:0x0086, B:14:0x009a, B:16:0x00b3, B:18:0x00b9, B:19:0x00c2, B:21:0x00ce, B:23:0x00d4, B:24:0x00dd, B:26:0x00e9, B:28:0x00ef, B:29:0x00f8, B:31:0x0104, B:33:0x010a, B:34:0x0113, B:37:0x011f, B:39:0x0125, B:40:0x012e, B:47:0x01c5, B:49:0x01d1, B:51:0x01d9, B:54:0x021c, B:56:0x0222, B:59:0x0240, B:61:0x02a1, B:62:0x0265, B:65:0x02a9, B:69:0x01de, B:71:0x01e4, B:73:0x01ec, B:75:0x01f6, B:77:0x0202, B:78:0x0207, B:80:0x020d, B:82:0x0215, B:108:0x01bf, B:114:0x008d, B:115:0x0094, B:42:0x0142, B:44:0x0148, B:46:0x0150, B:83:0x0156, B:85:0x015c, B:87:0x0164, B:88:0x0169, B:90:0x016f, B:92:0x0177, B:94:0x0181, B:96:0x018d, B:98:0x0197, B:100:0x01a3, B:102:0x01b7, B:104:0x01b9), top: B:5:0x004e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020d A[Catch: Exception -> 0x02cd, TryCatch #2 {Exception -> 0x02cd, blocks: (B:6:0x004e, B:8:0x006d, B:11:0x007a, B:13:0x0086, B:14:0x009a, B:16:0x00b3, B:18:0x00b9, B:19:0x00c2, B:21:0x00ce, B:23:0x00d4, B:24:0x00dd, B:26:0x00e9, B:28:0x00ef, B:29:0x00f8, B:31:0x0104, B:33:0x010a, B:34:0x0113, B:37:0x011f, B:39:0x0125, B:40:0x012e, B:47:0x01c5, B:49:0x01d1, B:51:0x01d9, B:54:0x021c, B:56:0x0222, B:59:0x0240, B:61:0x02a1, B:62:0x0265, B:65:0x02a9, B:69:0x01de, B:71:0x01e4, B:73:0x01ec, B:75:0x01f6, B:77:0x0202, B:78:0x0207, B:80:0x020d, B:82:0x0215, B:108:0x01bf, B:114:0x008d, B:115:0x0094, B:42:0x0142, B:44:0x0148, B:46:0x0150, B:83:0x0156, B:85:0x015c, B:87:0x0164, B:88:0x0169, B:90:0x016f, B:92:0x0177, B:94:0x0181, B:96:0x018d, B:98:0x0197, B:100:0x01a3, B:102:0x01b7, B:104:0x01b9), top: B:5:0x004e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r18, java.lang.String r19, boolean r20, java.util.HashMap<java.lang.String, java.lang.String> r21) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYs.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    final String d(String str) {
        StringBuilder b;
        String d2;
        if (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) {
            b = C0059d.b(str);
            d2 = cYh.d("0931376E23350C352F6C");
        } else {
            if (!str.contains(cYh.d("49262E35"))) {
                return "";
            }
            if (str.contains(cYh.d("0E3F31343923123E6F323837"))) {
                b = C0059d.b(str);
                d2 = cYh.d("483C2822236513293134");
            } else {
                b = C0059d.b(str);
                d2 = cYh.d("482438213229");
            }
        }
        b.append(d2);
        return b.toString();
    }

    public String detailContent(List<String> list) {
        try {
            String str = this.a;
            String str2 = i(str) + list.get(0);
            SpiderDebug.log(str2);
            JSONObject jSONObject = new JSONObject(C0164g.g(str2, g(str2)));
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            b(str, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put(cYh.d("0B393225"), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    final String e(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equals(cYh.d("043C202224")) || next.equals(cYh.d("06222430")) || next.equals(cYh.d("0B312F36")) || next.equals(cYh.d("1E352023"))) {
                    try {
                        str2 = str2 + cYh.d("80FDDAB8D7D3") + next + cYh.d("4CB5C4F9BED9CF6D6A") + jSONObject.getString(next).replace(cYh.d("4B"), cYh.d("4C")) + cYh.d("6D");
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (str.contains(cYh.d("49262E35"))) {
            return n.a(str2, cYh.d("6DB6CFC3B2E0E87BA4D4FFB3E4F87C7AB1C6E7B6D7E16A2E0E3D247AB1C6E7B7C2FC6A320E24327ABFF5E3B5C9D76A29043F3334"));
        }
        return (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) ? str2 : cYh.d("82D8C7B6E6E14CB5C4F9BED9CF6D6AB6C3EF82EDF06C3A351139247ABFE5F9B7FAFCB2D3C06D3527273606296AB6ECE68FD9FB6C232C14382E267CBFEDF8A7EDFC67043F2C383471531B7C3C382C0E351E653C7183EDD2B9D5E85A242828225080FDDAB8D7D3043C2022247182D5E9B8D4F25A7BA4C7CBBFEEF76AB6DFEB81D3C47AB1DBF7B6C1C77CBFEDF8A5ECCB7180F7D0B4EEE14CB5C8F6B1D9E27BA7D9CFBEDDD96AB9FAFC82DCEB7AB0D0C8B7FCFB7CBFEDF8A6C5EC7182F5C6B4EEE14CB6ECF7B3E4C77BA4D7C5B3FEF96AB7C9F081D8D97AB1DBF7B6C1C77CBCE5FCA6C7C67181D3CBB7D5C04CB7FADEB2DFDF7BA8CCC5BCFFF56AB7C1DD8FD9FB7AB2E4C9B7D5E4B2E7D67BA4DEF3B2C4D56AB4D9DC82DFF37ABFE5F7B5CBF97CBFE1CCA7CCC67181D3CBB7D5C04CB6C2DBB1D8FD7BA5EDF1BDF7D66AB7D4DF8FD9F37AB0FCE8B5C9F87CBEDFD9A6EBF07182D4FEB6FCFF4CB7FCC0B0E1FBB7D5E4B2E7D65AA6FCCCB3E7D92023323B4CB5C4F9BED9CF6D6AB4F3FD8EC9C77ABEFCFEB6F9FE7CBFE8E0A7E8E97180EECFB4CCE74CB8CAE0B2C1DA7BA7E2C2BFFCED6AB7C0FF81CCED7ABEC5CEB5DAEC7CBFD9E7A4CAEA7181E3F1B4CCE74CB5CCE1B2E0C17BA9F4E8BDE8FDA6D8CE7182DAE1B7DCE582F4E67AB2DFD1B4FAC75DBDCACBA8D1DE230231337AB2DFCFB9C2F96A71556073637C685762707A656A55606A63676B5E7B736166624C6271606071556070677C685761747A656A56646A63676B547B736166684C6271606671556070617C685760787A656A57686A63676A507B7361676C4C6271616271556071657C685760727A656A57626A63676A567B7361676A");
    }

    public String homeContent(boolean z) {
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str11;
        String str12;
        String[] strArr;
        Object obj;
        String str13;
        String str14;
        JSONObject jSONObject2;
        String str15;
        String str16;
        String str17;
        JSONObject jSONObject3;
        String d2 = cYh.d("80FDDAB8D7D3");
        String str18 = "";
        String d3 = cYh.d("01392D25322814");
        String d4 = cYh.d("0B393225");
        String d5 = cYh.d("03313530");
        try {
            String d6 = d(this.a);
            boolean isEmpty = d6.isEmpty();
            String d7 = cYh.d("5A");
            String d8 = cYh.d("3B7B");
            String d9 = cYh.d("6D");
            JSONArray jSONArray2 = null;
            String d10 = cYh.d("13293134083303");
            String d11 = cYh.d("132931340834063D24");
            if (isEmpty) {
                String[] split = e(d6, null).split(d9)[0].split(d8);
                jSONArray2 = new JSONArray();
                for (int i3 = 1; i3 < split.length; i3++) {
                    String[] split2 = split[i3].trim().split(d7);
                    if (split2.length >= 2) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(d11, split2[0].trim());
                        jSONObject4.put(d10, split2[1].trim());
                        jSONArray2.put(jSONObject4);
                    }
                }
            } else {
                SpiderDebug.log(d6);
                JSONObject jSONObject5 = new JSONObject(C0164g.g(d6, g(d6)));
                if (jSONObject5.has(d4) && (jSONObject5.get(d4) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(d4);
                } else if (jSONObject5.has(d5) && (jSONObject5.get(d5) instanceof JSONObject) && jSONObject5.getJSONObject(d5).has(d4) && (jSONObject5.getJSONObject(d5).get(d4) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONObject(d5).getJSONArray(d4);
                } else if (jSONObject5.has(d5) && (jSONObject5.get(d5) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(d5);
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            String d12 = cYh.d("043C202224");
            if (jSONArray2 != null) {
                int i4 = 0;
                while (i4 < jSONArray2.length()) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i4);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject7.getString(d11);
                    if (m(string)) {
                        str2 = d2;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = d6;
                        str5 = d12;
                        str6 = d7;
                        str7 = d8;
                        str8 = d9;
                        str9 = d10;
                        str10 = d11;
                        i2 = i4;
                    } else {
                        i2 = i4;
                        String string2 = jSONObject7.getString(d10);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put(d10, string2);
                        jSONObject8.put(d11, string);
                        JSONObject optJSONObject = jSONObject7.optJSONObject(cYh.d("13293134083F1F24243F33"));
                        if (z) {
                            String[] split3 = e(d6, optJSONObject).split(d9);
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = d6;
                            int i5 = d6.isEmpty() ? 1 : 0;
                            str8 = d9;
                            while (i5 < split3.length) {
                                String trim = split3[i5].trim();
                                if (trim.isEmpty()) {
                                    str12 = d2;
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = d12;
                                    str16 = d7;
                                    str11 = d8;
                                    strArr = split3;
                                    str13 = d10;
                                    str17 = d11;
                                } else {
                                    String[] split4 = trim.split(d8);
                                    str11 = d8;
                                    String trim2 = split4[0].trim();
                                    if (trim2.contains(d2)) {
                                        strArr = split3;
                                        String replace = trim2.replace(d2, str18);
                                        if (replace.equals(d12)) {
                                            trim2 = cYh.d("80E1FAB4C9D1");
                                            str12 = d2;
                                        } else {
                                            str12 = d2;
                                            if (replace.equals(cYh.d("06222430"))) {
                                                trim2 = cYh.d("82CCF1B4DBE0");
                                            } else if (replace.equals(cYh.d("0B312F36"))) {
                                                trim2 = cYh.d("8FFFECB9FFDA");
                                            } else if (replace.equals(cYh.d("1E352023"))) {
                                                trim2 = cYh.d("82E9F5B5ECE7");
                                            }
                                        }
                                        obj = trim2;
                                        trim2 = replace;
                                    } else {
                                        str12 = d2;
                                        strArr = split3;
                                        obj = trim2;
                                    }
                                    JSONObject jSONObject9 = new JSONObject();
                                    str13 = d10;
                                    jSONObject9.put(cYh.d("0C3538"), trim2);
                                    jSONObject9.put(cYh.d("09312C34"), obj);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i6 = 1;
                                    while (i6 < split4.length) {
                                        JSONObject jSONObject10 = new JSONObject();
                                        String[] strArr2 = split4;
                                        String trim3 = split4[i6].trim();
                                        String str19 = d11;
                                        int indexOf = trim3.indexOf(d7);
                                        String str20 = d7;
                                        str = str18;
                                        String d13 = cYh.d("11");
                                        String str21 = d12;
                                        String d14 = cYh.d("09");
                                        if (indexOf == -1) {
                                            try {
                                                if (m(trim3)) {
                                                    jSONObject3 = jSONObject8;
                                                } else {
                                                    jSONObject10.put(d14, trim3);
                                                    jSONObject10.put(d13, trim3);
                                                    jSONObject3 = jSONObject8;
                                                    jSONArray7.put(jSONObject10);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                SpiderDebug.log(e);
                                                return str;
                                            }
                                        } else {
                                            jSONObject3 = jSONObject8;
                                            String substring = trim3.substring(0, indexOf);
                                            if (!m(substring)) {
                                                jSONObject10.put(d14, substring.trim());
                                                jSONObject10.put(d13, trim3.substring(indexOf + 1).trim());
                                                jSONArray7.put(jSONObject10);
                                            }
                                        }
                                        i6++;
                                        jSONObject8 = jSONObject3;
                                        d11 = str19;
                                        split4 = strArr2;
                                        d7 = str20;
                                        str18 = str;
                                        d12 = str21;
                                    }
                                    str14 = str18;
                                    jSONObject2 = jSONObject8;
                                    str15 = d12;
                                    str16 = d7;
                                    str17 = d11;
                                    jSONObject9.put(cYh.d("11312D2432"), jSONArray7);
                                    jSONArray6.put(jSONObject9);
                                }
                                i5++;
                                jSONObject8 = jSONObject2;
                                split3 = strArr;
                                d8 = str11;
                                d2 = str12;
                                d10 = str13;
                                d11 = str17;
                                d7 = str16;
                                str18 = str14;
                                d12 = str15;
                            }
                            str2 = d2;
                            str3 = str18;
                            JSONObject jSONObject11 = jSONObject8;
                            str5 = d12;
                            str6 = d7;
                            str7 = d8;
                            str9 = d10;
                            str10 = d11;
                            if (!jSONObject6.has(d3)) {
                                jSONObject6.put(d3, new JSONObject());
                            }
                            jSONObject6.getJSONObject(d3).put(string2, jSONArray6);
                            jSONObject = jSONObject11;
                        } else {
                            str2 = d2;
                            str3 = str18;
                            str4 = d6;
                            str5 = d12;
                            str6 = d7;
                            str7 = d8;
                            str8 = d9;
                            str9 = d10;
                            str10 = d11;
                            jSONObject = jSONObject8;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject);
                    }
                    i4 = i2 + 1;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    d9 = str8;
                    d6 = str4;
                    d8 = str7;
                    d2 = str2;
                    d10 = str9;
                    d11 = str10;
                    d7 = str6;
                    str18 = str3;
                    d12 = str5;
                }
            }
            str = str18;
            jSONObject6.put(d12, jSONArray3);
            return jSONObject6.toString();
        } catch (Exception e3) {
            e = e3;
            str = str18;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String str = this.a;
            String k2 = k(str);
            if (k2.isEmpty()) {
                k2 = c(str) + cYh.d("0A3F3738327C173126346A6B41313334366741243821326741233530252E5A");
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(k2);
            JSONObject jSONObject = new JSONObject(C0164g.g(k2, g(k2)));
            JSONArray jSONArray = new JSONArray();
            String d2 = cYh.d("113F250E253F0A31333A24");
            String d3 = cYh.d("113F250E273304");
            String d4 = cYh.d("113F250E393B0A35");
            String d5 = cYh.d("113F250E3E3E");
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(cYh.d("03313530"));
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(d5, jSONObject2.getString(cYh.d("093539253B33093B")));
                    jSONObject3.put(d4, jSONObject2.getString(cYh.d("1339353D32")));
                    jSONObject3.put(d3, jSONObject2.getString(cYh.d("173922")));
                    jSONObject3.put(d2, jSONObject2.getString(cYh.d("1424202532")));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList<>();
                a(jSONObject, cYh.d("113C282223"), arrayList);
                if (arrayList.isEmpty()) {
                    a(jSONObject, cYh.d("113F250E3B331424"), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<JSONArray> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONArray next = it.next();
                    for (int i3 = 0; i3 < next.length(); i3++) {
                        JSONObject jSONObject4 = next.getJSONObject(i3);
                        String string = jSONObject4.getString(d5);
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(d5, string);
                            jSONObject5.put(d4, jSONObject4.getString(d4));
                            jSONObject5.put(d3, jSONObject4.getString(d3));
                            jSONObject5.put(d2, jSONObject4.getString(d2));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(cYh.d("0B393225"), jSONArray);
            return jSONObject6.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    final String i(String str) {
        StringBuilder b;
        String d2;
        if (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) {
            if (str.contains(cYh.d("03392B3836220E31"))) {
                return cYh.d("0F2435212460487F3626207403392B3836220E316F32383748313138792A0F206E30272A4826283532353834242536330B6F28356A");
            }
            if (str.contains(cYh.d("566070613323"))) {
                return cYh.d("0F2435216D7548273626796B576171352E7404336E30273349202921783B17206E273E3E023F1E35322E06392D6E3E3E5A");
            }
            b = C0059d.b(str);
            d2 = cYh.d("113925343805033535303E365839256C");
        } else {
            if (!str.contains(cYh.d("49262E35"))) {
                return "";
            }
            if (str.contains(cYh.d("0E3F31343923123E"))) {
                b = C0059d.b(str);
                d2 = cYh.d("4834242536330B19056E2135030F28356A");
            } else {
                b = C0059d.b(str);
                d2 = cYh.d("4834242536330B6F373E33050E347C");
            }
        }
        b.append(d2);
        return b.toString();
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.a = str;
    }

    public boolean isVideoFormat(String str) {
        return m.c(str);
    }

    final String k(String str) {
        StringBuilder b;
        String d2;
        if (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127"))) {
            b = C0059d.b(str);
            d2 = cYh.d("0E3E25342F05113925343865133F2A343967");
        } else {
            if (!str.contains(cYh.d("49262E35"))) {
                return "";
            }
            b = C0059d.b(str);
            d2 = cYh.d("48262E35073205112D3D");
        }
        b.append(d2);
        return b.toString();
    }

    public boolean manualVideoCheck() {
        return true;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String str3 = this.a;
            String j2 = j(str3, h(str3, str), str2);
            JSONObject jSONObject = new JSONObject();
            f(j2, jSONObject);
            return jSONObject.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObject;
        String d2 = cYh.d("113F250E3E3E");
        String d3 = cYh.d("0B393225");
        String d4 = cYh.d("03313530");
        try {
            String l = l(this.a, URLEncoder.encode(str));
            JSONObject jSONObject2 = new JSONObject(C0164g.g(l, g(l)));
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject2.has(d3) && (jSONObject2.get(d3) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONArray(d3);
            } else if (jSONObject2.has(d4) && (jSONObject2.get(d4) instanceof JSONObject) && jSONObject2.getJSONObject(d4).has(d3) && (jSONObject2.getJSONObject(d4).get(d3) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONObject(d4).getJSONArray(d3);
            } else if (jSONObject2.has(d4) && (jSONObject2.get(d4) instanceof JSONArray)) {
                jSONArray = jSONObject2.getJSONArray(d4);
            }
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    boolean has = jSONObject3.has(d2);
                    String d5 = cYh.d("113F250E253F0A31333A24");
                    String d6 = cYh.d("113F250E273304");
                    String d7 = cYh.d("113F250E393B0A35");
                    if (has) {
                        jSONObject = new JSONObject();
                        jSONObject.put(d2, jSONObject3.getString(d2));
                        jSONObject.put(d7, jSONObject3.getString(d7));
                        jSONObject.put(d6, jSONObject3.getString(d6));
                        jSONObject.put(d5, jSONObject3.getString(d5));
                    } else {
                        jSONObject = new JSONObject();
                        jSONObject.put(d2, jSONObject3.getString(cYh.d("093539253B33093B")));
                        jSONObject.put(d7, jSONObject3.getString(cYh.d("1339353D32")));
                        jSONObject.put(d6, jSONObject3.getString(cYh.d("173922")));
                        jSONObject.put(d5, jSONObject3.getString(cYh.d("1424202532")));
                    }
                    jSONArray2.put(jSONObject);
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(d3, jSONArray2);
            return jSONObject4.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }
}
