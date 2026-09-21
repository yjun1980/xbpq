package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.AbstractC0158a;
import com.github.catvod.spider.merge.k.C0164g;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppYsV2 extends Spider {
    private static final Pattern d = Pattern.compile(cYh.d("0620280D792A0F206E7F7D6548262E35"));
    private static final Pattern e;
    private static final Pattern f;
    protected static final Pattern[] g;
    private String a = "";
    protected final HashMap<String, ArrayList<String>> b = new HashMap<>();
    private String[] c = null;

    static {
        Pattern.compile(cYh.d("0620280D792A0F206E7F7C653B7E373E33"));
        Pattern.compile(cYh.d("487E6A0D68744C6D"));
        e = Pattern.compile(cYh.d("497A692425361B263D273E3E1B2029210B650E34686C"));
        f = Pattern.compile(cYh.d("0F24352124655D7F6E0A09753A7A"));
        g = new Pattern[]{Pattern.compile(cYh.d("173C202832285A3E2426")), Pattern.compile(cYh.d("5B3428277733036D63273E3E023F63")), Pattern.compile(cYh.d("5B3428277733036D630A09783A7A7E213B3B1E353373")), Pattern.compile(cYh.d("487FA9F6D1B3C5C1A8C2E9BCE9F5")), Pattern.compile(cYh.d("2F3C321B240A0B31383425064F")), Pattern.compile(cYh.d("5B3927233637020B1D220B093A7A7E2225395A721A0F75074C6F63")), Pattern.compile(cYh.d("5B26283532353C0C320D04074D6F32233467450B1F730A715872"))};
    }

    private void b(JSONObject jSONObject, String str, ArrayList<JSONArray> arrayList) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    b((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        b(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e2) {
                SpiderDebug.log(e2);
            }
        }
    }

    private void c(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator<String> it;
        String str3;
        StringBuilder sb;
        String str4;
        ArrayList arrayList3;
        String str5;
        String str6;
        ArrayList arrayList4;
        StringBuilder sb2;
        String group;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str7;
        ArrayList arrayList7;
        String str8;
        String str9;
        String str10;
        ArrayList arrayList8;
        String d2 = cYh.d("4B");
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        boolean contains = str.contains(cYh.d("0620287F2732177F20212775"));
        String d3 = cYh.d("173133223205062028");
        String d4 = cYh.d("09312C34");
        String d5 = cYh.d("043F2534");
        String d6 = cYh.d("113F250E22280B0F3638233238202D302E3F15");
        String d7 = cYh.d("113F250E3436062332");
        String d8 = cYh.d("03313530");
        String d9 = cYh.d("132931340834063D24");
        String str11 = d2;
        String d10 = cYh.d("33");
        String str12 = d3;
        String d11 = cYh.d("12222D");
        ArrayList arrayList11 = arrayList9;
        String d12 = cYh.d("113F250E34350924243F23");
        String str13 = d11;
        String d13 = cYh.d("113F250E3333153522253828");
        ArrayList arrayList12 = arrayList10;
        String d14 = cYh.d("113F250E3639133F33");
        String str14 = d10;
        String d15 = cYh.d("113F250E253F0A31333A24");
        String str15 = d4;
        String d16 = cYh.d("113F250E36280231");
        String str16 = d5;
        String d17 = cYh.d("113F250E2E3F0622");
        String d18 = cYh.d("113F250E393B0A35");
        String d19 = cYh.d("113F250E273304");
        String d20 = cYh.d("113F250E3E3E");
        if (contains) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(d8);
            String fixCover = fixCover(jSONObject3.getString(d19), str);
            jSONObject2.put(d20, jSONObject3.optString(d20, str2));
            jSONObject2.put(d18, jSONObject3.getString(d18));
            jSONObject2.put(d19, fixCover);
            jSONObject2.put(d9, jSONObject3.optString(d7));
            jSONObject2.put(d17, jSONObject3.optString(d17));
            jSONObject2.put(d16, jSONObject3.optString(d16));
            jSONObject2.put(d15, jSONObject3.optString(d15));
            jSONObject2.put(d14, jSONObject3.optString(d14));
            jSONObject2.put(d13, jSONObject3.optString(d13));
            jSONObject2.put(d12, jSONObject3.optString(d12));
            JSONArray jSONArray = jSONObject3.getJSONArray(d6);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String str17 = str16;
                String trim = jSONObject4.optString(str17).trim();
                if (trim.isEmpty()) {
                    str9 = str15;
                    trim = jSONObject4.getString(str9).trim();
                } else {
                    str9 = str15;
                }
                String str18 = str14;
                if (this.a.indexOf(str18) < 0) {
                    arrayList8 = arrayList12;
                    arrayList8.add(trim);
                    str10 = str13;
                } else {
                    str10 = str13;
                    arrayList8 = arrayList12;
                    arrayList8.add(jSONObject4.getString(str10));
                }
                ArrayList arrayList13 = arrayList11;
                arrayList13.add(jSONObject4.getString(str10));
                String str19 = str12;
                String trim2 = jSONObject4.optString(str19).trim();
                ArrayList<String> arrayList14 = this.b.get(trim);
                if (arrayList14 == null) {
                    arrayList14 = new ArrayList<>();
                    this.b.put(trim, arrayList14);
                }
                if (!trim2.isEmpty() && !arrayList14.contains(trim2)) {
                    arrayList14.add(trim2);
                }
                i++;
                str16 = str17;
                str15 = str9;
                arrayList12 = arrayList8;
                str14 = str18;
                str13 = str10;
                str12 = str19;
                arrayList11 = arrayList13;
            }
            arrayList5 = arrayList11;
            arrayList6 = arrayList12;
        } else {
            String str20 = str12;
            ArrayList arrayList15 = arrayList11;
            String str21 = str13;
            ArrayList arrayList16 = arrayList12;
            String str22 = str14;
            String str23 = str15;
            String str24 = str16;
            if (!str.contains(cYh.d("1F37202127"))) {
                ArrayList arrayList17 = arrayList15;
                ArrayList arrayList18 = arrayList16;
                String str25 = str22;
                String str26 = str21;
                if (str.contains(cYh.d("49262E35"))) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject(d8);
                    String fixCover2 = fixCover(jSONObject5.getString(d19), str);
                    jSONObject2.put(d20, jSONObject5.optString(d20, str2));
                    jSONObject2.put(d18, jSONObject5.getString(d18));
                    jSONObject2.put(d19, fixCover2);
                    jSONObject2.put(d9, jSONObject5.optString(d7));
                    jSONObject2.put(d17, jSONObject5.optString(d17));
                    jSONObject2.put(d16, jSONObject5.optString(d16));
                    jSONObject2.put(d15, jSONObject5.optString(d15));
                    jSONObject2.put(d14, jSONObject5.optString(d14));
                    jSONObject2.put(d13, jSONObject5.optString(d13));
                    jSONObject2.put(d12, jSONObject5.optString(d12));
                    JSONArray jSONArray2 = jSONObject5.getJSONArray(cYh.d("113F250E273606291E3D3E2913"));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                        String d21 = cYh.d("173C2028322838392F3738");
                        String trim3 = jSONObject6.getJSONObject(d21).optString(cYh.d("01222E3C")).trim();
                        if (trim3.isEmpty()) {
                            trim3 = jSONObject6.getJSONObject(d21).optString(cYh.d("14382E26")).trim();
                        }
                        String str27 = str25;
                        if (this.a.indexOf(str27) < 0) {
                            arrayList3 = arrayList18;
                            arrayList3.add(trim3);
                            str5 = str26;
                        } else {
                            arrayList3 = arrayList18;
                            str5 = str26;
                            arrayList3.add(jSONObject6.getString(str5));
                        }
                        ArrayList arrayList19 = arrayList17;
                        arrayList19.add(jSONObject6.getString(str5));
                        try {
                            arrayList4 = new ArrayList();
                            str6 = str11;
                        } catch (Exception e2) {
                            e = e2;
                            str6 = str11;
                        }
                        try {
                            String[] split = jSONObject6.getJSONObject(d21).optString(cYh.d("1731332232")).split(str6);
                            String[] split2 = jSONObject6.getJSONObject(d21).optString(cYh.d("173133223268")).split(str6);
                            arrayList4.addAll(Arrays.asList(split));
                            arrayList4.addAll(Arrays.asList(split2));
                            ArrayList<String> arrayList20 = this.b.get(trim3);
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList<>();
                                this.b.put(trim3, arrayList20);
                            }
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                String str28 = (String) it2.next();
                                if (str28.contains(cYh.d("0F243521"))) {
                                    Matcher matcher = e.matcher(str28);
                                    if (matcher.find()) {
                                        str28 = matcher.group(0);
                                    }
                                } else if (str28.contains(cYh.d("487F"))) {
                                    Matcher matcher2 = e.matcher(str28);
                                    if (matcher2.find()) {
                                        sb2 = new StringBuilder();
                                        sb2.append(cYh.d("0F2435216D"));
                                        group = matcher2.group(0);
                                        sb2.append(group);
                                        str28 = sb2.toString();
                                    }
                                } else {
                                    Matcher matcher3 = f.matcher(str);
                                    if (matcher3.find()) {
                                        Matcher matcher4 = e.matcher(str);
                                        if (matcher4.find()) {
                                            sb2 = new StringBuilder();
                                            sb2.append(matcher3.group(0));
                                            group = matcher4.group(0);
                                            sb2.append(group);
                                            str28 = sb2.toString();
                                        }
                                    }
                                }
                                String trim4 = str28.replace(cYh.d("497E"), cYh.d("49")).trim();
                                if (!trim4.isEmpty() && !arrayList20.contains(trim4)) {
                                    arrayList20.add(trim4);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            SpiderDebug.log(e);
                            i2++;
                            arrayList18 = arrayList3;
                            str26 = str5;
                            arrayList17 = arrayList19;
                            str11 = str6;
                            str25 = str27;
                        }
                        i2++;
                        arrayList18 = arrayList3;
                        str26 = str5;
                        arrayList17 = arrayList19;
                        str11 = str6;
                        str25 = str27;
                    }
                    arrayList = arrayList17;
                    arrayList2 = arrayList18;
                } else {
                    String str29 = str25;
                    String str30 = str26;
                    if (d.matcher(str).find()) {
                        String fixCover3 = fixCover(jSONObject.getString(cYh.d("0E3D260E22280B")), str);
                        jSONObject2.put(d20, jSONObject.optString(d20, str2));
                        String d22 = cYh.d("1339353D32");
                        jSONObject2.put(d18, jSONObject.getString(d22));
                        jSONObject2.put(d19, fixCover3);
                        jSONObject2.put(d9, n(jSONObject.optJSONArray(cYh.d("13293134"))));
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
                            ArrayList<String> arrayList21 = this.b.get(next);
                            if (arrayList21 == null) {
                                arrayList21 = new ArrayList<>();
                                this.b.put(next, arrayList21);
                            }
                            JSONArray jSONArray3 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList22 = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArray3.length()) {
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i3);
                                String str31 = str30;
                                String string = jSONObject8.getString(str31);
                                String d23 = cYh.d("12222D6C");
                                boolean contains2 = string.contains(d23);
                                String d24 = cYh.d("43");
                                if (contains2) {
                                    int indexOf = string.indexOf(d23) + 4;
                                    String trim5 = string.substring(0, indexOf).trim();
                                    if (!trim5.isEmpty() && !arrayList21.contains(trim5)) {
                                        arrayList21.add(trim5);
                                    }
                                    it = keys;
                                    str3 = str29;
                                    if (this.a.indexOf(str3) < 0) {
                                        str4 = jSONObject8.getString(d22) + d24 + string.substring(indexOf).trim();
                                    } else {
                                        sb = new StringBuilder();
                                        sb.append(string.substring(indexOf).trim());
                                        sb.append(d24);
                                        string = string.substring(indexOf).trim();
                                        sb.append(string);
                                        str4 = sb.toString();
                                    }
                                } else {
                                    it = keys;
                                    str3 = str29;
                                    if (this.a.indexOf(str3) < 0) {
                                        str4 = jSONObject8.getString(d22) + d24 + string;
                                    } else {
                                        sb = new StringBuilder();
                                        sb.append(string);
                                        sb.append(d24);
                                        sb.append(string);
                                        str4 = sb.toString();
                                    }
                                }
                                arrayList22.add(str4);
                                i3++;
                                str29 = str3;
                                str30 = str31;
                                keys = it;
                            }
                            arrayList18.add(next);
                            arrayList17.add(TextUtils.join(cYh.d("44"), arrayList22));
                            keys = keys;
                        }
                    }
                    arrayList = arrayList17;
                    arrayList2 = arrayList18;
                }
                String d25 = cYh.d("437465");
                jSONObject2.put(cYh.d("113F250E273606291E3725350A"), TextUtils.join(d25, arrayList2));
                jSONObject2.put(cYh.d("113F250E273606291E242536"), TextUtils.join(d25, arrayList));
            }
            JSONObject jSONObject9 = jSONObject.getJSONObject(d8).getJSONObject(cYh.d("113F250E3E34013F"));
            String fixCover4 = fixCover(jSONObject9.getString(d19), str);
            jSONObject2.put(d20, jSONObject9.optString(d20, str2));
            jSONObject2.put(d18, jSONObject9.getString(d18));
            jSONObject2.put(d19, fixCover4);
            jSONObject2.put(d9, jSONObject9.optString(d7));
            jSONObject2.put(d17, jSONObject9.optString(d17));
            jSONObject2.put(d16, jSONObject9.optString(d16));
            jSONObject2.put(d15, jSONObject9.optString(d15));
            jSONObject2.put(d14, jSONObject9.optString(d14));
            jSONObject2.put(d13, jSONObject9.optString(d13));
            jSONObject2.put(d12, jSONObject9.optString(d12));
            JSONArray jSONArray4 = jSONObject9.getJSONArray(d6);
            int i4 = 0;
            while (i4 < jSONArray4.length()) {
                JSONObject jSONObject10 = jSONArray4.getJSONObject(i4);
                String str32 = str24;
                String trim6 = jSONObject10.optString(str32).trim();
                if (trim6.isEmpty()) {
                    str7 = str23;
                    trim6 = jSONObject10.getString(str7).trim();
                } else {
                    str7 = str23;
                }
                String str33 = str22;
                if (this.a.indexOf(str33) < 0) {
                    arrayList7 = arrayList16;
                    arrayList7.add(trim6);
                    str8 = str21;
                } else {
                    arrayList7 = arrayList16;
                    str8 = str21;
                    arrayList7.add(jSONObject10.getString(str8));
                }
                ArrayList arrayList23 = arrayList15;
                arrayList23.add(jSONObject10.getString(str8));
                String str34 = str20;
                String trim7 = jSONObject10.optString(str34).trim();
                ArrayList<String> arrayList24 = this.b.get(trim6);
                if (arrayList24 == null) {
                    arrayList24 = new ArrayList<>();
                    this.b.put(trim6, arrayList24);
                }
                if (!trim7.isEmpty() && !arrayList24.contains(trim7)) {
                    arrayList24.add(trim7);
                }
                i4++;
                str24 = str32;
                str23 = str7;
                arrayList16 = arrayList7;
                str22 = str33;
                str21 = str8;
                str20 = str34;
                arrayList15 = arrayList23;
            }
            arrayList5 = arrayList15;
            arrayList6 = arrayList16;
        }
        arrayList2 = arrayList6;
        arrayList = arrayList5;
        String d252 = cYh.d("437465");
        jSONObject2.put(cYh.d("113F250E273606291E3725350A"), TextUtils.join(d252, arrayList2));
        jSONObject2.put(cYh.d("113F250E273606291E242536"), TextUtils.join(d252, arrayList));
    }

    private String d() {
        String[] strArr = this.c;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    private static HashMap<String, String> i(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(cYh.d("322324237A1B00352F25"), str.contains(cYh.d("113F257F6E3F57636F323837")) ? cYh.d("2A3F3B383B36067F747F677A4F1C283F22225C70003F3328083925716174576B611F322212236164771812392D357817351174691973471131213B3F3035231A3E2E4865726679695170691A1F0E2A1C6D713B330C35611632390C3F68711432153F2C34786B57636F61796A4960611C38380E3C2471043B01313338786F54676F6261") : (str.contains(cYh.d("0620287F2732177F202127")) || str.contains(cYh.d("1F37202127")) || str.contains(cYh.d("012224343C3B09"))) ? cYh.d("233133257868496175717F3E0622356B3E354E") : (str.contains(cYh.d("1D2323")) || str.contains(cYh.d("013B3922")) || str.contains(cYh.d("1F313822")) || str.contains(cYh.d("1F333822")) || str.contains(cYh.d("142A3822")) || str.contains(cYh.d("03283822")) || str.contains(cYh.d("1E243822")) || str.contains(cYh.d("163E3822"))) ? cYh.d("233133257868496174717F3E0622356B3E354E") : str.contains(cYh.d("49262E35")) ? cYh.d("083B2925232A48646F60796A") : cYh.d("23312D273E3148626F60796A"));
        return hashMap;
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
            if (!d.matcher(str).find()) {
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

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get(cYh.d("14393534"));
            String str2 = map.get(cYh.d("173922"));
            HashMap<String, String> i = i(str);
            AbstractC0158a abstractC0158a = new AbstractC0158a() { // from class: com.github.catvod.spider.AppYsV2.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.github.catvod.spider.merge.k.AbstractC0160c
                public final void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.k.AbstractC0160c
                protected final /* bridge */ /* synthetic */ void onResponse(Response response) {
                }
            };
            C0164g.c(C0164g.b(), str2, i, abstractC0158a);
            if (abstractC0158a.getResult().code() != 200) {
                return null;
            }
            String str3 = abstractC0158a.getResult().headers().get(cYh.d("243F2F253234137D1528273F"));
            if (str3 == null) {
                str3 = cYh.d("0620313D3E390624283E3975083335342377142433343637");
            }
            System.out.println(str2);
            System.out.println(str3);
            return new Object[]{200, str3, abstractC0158a.getResult().body().byteStream()};
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean m(String str) {
        return this.a.indexOf(cYh.d("46")) >= 0 && (str.equals(cYh.d("83ECE7B6C7DC")) || str.equals(cYh.d("81D3C4B9DEE8")) || str.equals(cYh.d("80F6CEB4DFF3")));
    }

    private String n(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(cYh.d("4B"), arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    protected final String a(String str) {
        String[] strArr = this.c;
        if (strArr.length > 1) {
            strArr[1].equals(cYh.d("09363527"));
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:5|6|(23:11|(1:13)(1:114)|14|(1:113)(1:18)|19|(1:112)(1:23)|24|(1:111)(1:28)|29|(1:110)(1:33)|34|35|(1:109)(1:39)|40|41|42|(2:83|(3:88|(3:100|(1:102)(2:104|105)|103)|106)(1:87))(1:46)|47|(2:69|(5:78|(1:82)|(3:54|(6:57|58|(1:60)(1:63)|61|62|55)|64)|65|66)(1:77))(1:51)|52|(0)|65|66)|115|14|(1:16)|113|19|(1:21)|112|24|(1:26)|111|29|(1:31)|110|34|35|(1:37)|109|40|41|42|(1:44)|83|(1:85)|88|(17:90|92|94|96|98|100|(0)(0)|103|47|(1:49)|69|(1:71)|78|(2:80|82)|(0)|65|66)|106|47|(0)|69|(0)|78|(0)|(0)|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c4, code lost:
    
        com.github.catvod.crawler.SpiderDebug.log(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc A[Catch: Exception -> 0x01c3, TryCatch #2 {Exception -> 0x01c3, blocks: (B:42:0x0147, B:44:0x014d, B:46:0x0155, B:83:0x015b, B:85:0x0161, B:87:0x0169, B:88:0x016e, B:90:0x0174, B:92:0x017c, B:94:0x0186, B:96:0x0192, B:98:0x019c, B:100:0x01a8, B:102:0x01bc, B:104:0x01be), top: B:41:0x0147, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01be A[Catch: Exception -> 0x01c3, TRY_LEAVE, TryCatch #2 {Exception -> 0x01c3, blocks: (B:42:0x0147, B:44:0x014d, B:46:0x0155, B:83:0x015b, B:85:0x0161, B:87:0x0169, B:88:0x016e, B:90:0x0174, B:92:0x017c, B:94:0x0186, B:96:0x0192, B:98:0x019c, B:100:0x01a8, B:102:0x01bc, B:104:0x01be), top: B:41:0x0147, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d6 A[Catch: Exception -> 0x02eb, TryCatch #1 {Exception -> 0x02eb, blocks: (B:6:0x0050, B:8:0x006f, B:11:0x007c, B:13:0x0088, B:14:0x009c, B:16:0x00b5, B:18:0x00bb, B:19:0x00c4, B:21:0x00d0, B:23:0x00d6, B:24:0x00df, B:26:0x00eb, B:28:0x00f1, B:29:0x00fa, B:31:0x0106, B:33:0x010c, B:34:0x0115, B:37:0x0121, B:39:0x0127, B:40:0x0130, B:47:0x01ca, B:49:0x01d6, B:52:0x0207, B:55:0x0221, B:57:0x0227, B:60:0x0247, B:61:0x026d, B:62:0x02b0, B:63:0x0271, B:65:0x02bf, B:69:0x01df, B:71:0x01e5, B:73:0x01ed, B:75:0x01f7, B:77:0x0203, B:78:0x020c, B:80:0x0212, B:82:0x021a, B:108:0x01c4, B:114:0x008f, B:115:0x0096, B:42:0x0147, B:44:0x014d, B:46:0x0155, B:83:0x015b, B:85:0x0161, B:87:0x0169, B:88:0x016e, B:90:0x0174, B:92:0x017c, B:94:0x0186, B:96:0x0192, B:98:0x019c, B:100:0x01a8, B:102:0x01bc, B:104:0x01be), top: B:5:0x0050, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5 A[Catch: Exception -> 0x02eb, TryCatch #1 {Exception -> 0x02eb, blocks: (B:6:0x0050, B:8:0x006f, B:11:0x007c, B:13:0x0088, B:14:0x009c, B:16:0x00b5, B:18:0x00bb, B:19:0x00c4, B:21:0x00d0, B:23:0x00d6, B:24:0x00df, B:26:0x00eb, B:28:0x00f1, B:29:0x00fa, B:31:0x0106, B:33:0x010c, B:34:0x0115, B:37:0x0121, B:39:0x0127, B:40:0x0130, B:47:0x01ca, B:49:0x01d6, B:52:0x0207, B:55:0x0221, B:57:0x0227, B:60:0x0247, B:61:0x026d, B:62:0x02b0, B:63:0x0271, B:65:0x02bf, B:69:0x01df, B:71:0x01e5, B:73:0x01ed, B:75:0x01f7, B:77:0x0203, B:78:0x020c, B:80:0x0212, B:82:0x021a, B:108:0x01c4, B:114:0x008f, B:115:0x0096, B:42:0x0147, B:44:0x014d, B:46:0x0155, B:83:0x015b, B:85:0x0161, B:87:0x0169, B:88:0x016e, B:90:0x0174, B:92:0x017c, B:94:0x0186, B:96:0x0192, B:98:0x019c, B:100:0x01a8, B:102:0x01bc, B:104:0x01be), top: B:5:0x0050, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0212 A[Catch: Exception -> 0x02eb, TryCatch #1 {Exception -> 0x02eb, blocks: (B:6:0x0050, B:8:0x006f, B:11:0x007c, B:13:0x0088, B:14:0x009c, B:16:0x00b5, B:18:0x00bb, B:19:0x00c4, B:21:0x00d0, B:23:0x00d6, B:24:0x00df, B:26:0x00eb, B:28:0x00f1, B:29:0x00fa, B:31:0x0106, B:33:0x010c, B:34:0x0115, B:37:0x0121, B:39:0x0127, B:40:0x0130, B:47:0x01ca, B:49:0x01d6, B:52:0x0207, B:55:0x0221, B:57:0x0227, B:60:0x0247, B:61:0x026d, B:62:0x02b0, B:63:0x0271, B:65:0x02bf, B:69:0x01df, B:71:0x01e5, B:73:0x01ed, B:75:0x01f7, B:77:0x0203, B:78:0x020c, B:80:0x0212, B:82:0x021a, B:108:0x01c4, B:114:0x008f, B:115:0x0096, B:42:0x0147, B:44:0x014d, B:46:0x0155, B:83:0x015b, B:85:0x0161, B:87:0x0169, B:88:0x016e, B:90:0x0174, B:92:0x017c, B:94:0x0186, B:96:0x0192, B:98:0x019c, B:100:0x01a8, B:102:0x01bc, B:104:0x01be), top: B:5:0x0050, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String categoryContent(java.lang.String r19, java.lang.String r20, boolean r21, java.util.HashMap<java.lang.String, java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AppYsV2.categoryContent(java.lang.String, java.lang.String, boolean, java.util.HashMap):java.lang.String");
    }

    public String detailContent(List<String> list) {
        try {
            String d2 = d();
            String str = j(d2) + list.get(0);
            SpiderDebug.log(str);
            String g2 = C0164g.g(str, i(str));
            a(g2);
            JSONObject jSONObject = new JSONObject(g2);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            c(d2, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put(cYh.d("0B393225"), jSONArray);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    final String e(String str) {
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

    final String f(String str) {
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

    public String fixCover(String str, String str2) {
        try {
            if (this.a.indexOf(cYh.d("13")) < 0) {
                return str;
            }
            return cYh.d("17222E292E60487F253E6A3B172018220168412328253267") + str2 + cYh.d("412028326A") + str;
        } catch (Exception unused) {
            return str;
        }
    }

    final String g(String str, JSONObject jSONObject) {
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

    protected final JSONObject h(ArrayList arrayList, String str) {
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (true) {
            boolean hasNext = it.hasNext();
            String d2 = cYh.d("173C202802280B");
            String d3 = cYh.d("1731332232");
            String d4 = cYh.d("12222D");
            JSONObject jSONObject = null;
            boolean z = true;
            if (!hasNext) {
                if (str2.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(d3, 1);
                jSONObject2.put(d2, str2);
                jSONObject2.put(d4, str);
                return jSONObject2;
            }
            String str3 = (String) it.next();
            if (!str3.isEmpty() && !str3.equals(cYh.d("09252D3D"))) {
                String a = n.a(str3, str);
                String g2 = C0164g.g(a, null);
                a(g2);
                if (str3.contains(cYh.d("53696F6364694964767F63685D6979686F"))) {
                    HashMap hashMap = new HashMap();
                    C0164g.j(a, null, hashMap);
                    String d5 = C0164g.d(hashMap);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(d3, 0);
                    jSONObject3.put(d2, "");
                    jSONObject3.put(d4, d5);
                    return jSONObject3;
                }
                try {
                    jSONObject = m.e(str, g2);
                } catch (Throwable unused) {
                }
                if (jSONObject != null && jSONObject.has(d4)) {
                    String d6 = cYh.d("0F3520353228");
                    if (jSONObject.has(d6)) {
                        jSONObject.put(d6, jSONObject.getJSONObject(d6).toString());
                        return jSONObject;
                    }
                }
                if (g2.contains(cYh.d("5B38353C3B"))) {
                    Pattern[] patternArr = g;
                    int length = patternArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        if (patternArr[i].matcher(g2).find()) {
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        str2 = str3;
                    }
                }
            }
        }
    }

    public String homeContent(boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
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
        String d2;
        String d3 = cYh.d("80FDDAB8D7D3");
        String str18 = "";
        String d4 = cYh.d("01392D25322814");
        String d5 = cYh.d("0B393225");
        String d6 = cYh.d("03313530");
        try {
            String f2 = f(d());
            boolean isEmpty = f2.isEmpty();
            String d7 = cYh.d("5A");
            String d8 = cYh.d("3B7B");
            String d9 = cYh.d("6D");
            JSONArray jSONArray2 = null;
            String d10 = cYh.d("13293134083303");
            String d11 = cYh.d("132931340834063D24");
            if (isEmpty) {
                String[] split = g(f2, null).split(d9)[0].split(d8);
                jSONArray2 = new JSONArray();
                for (int i2 = 1; i2 < split.length; i2++) {
                    String[] split2 = split[i2].trim().split(d7);
                    if (split2.length >= 2) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(d11, split2[0].trim());
                        jSONObject4.put(d10, split2[1].trim());
                        jSONArray2.put(jSONObject4);
                    }
                }
            } else {
                SpiderDebug.log(f2);
                String g2 = C0164g.g(f2, i(f2));
                a(g2);
                JSONObject jSONObject5 = new JSONObject(g2);
                if (jSONObject5.has(d5) && (jSONObject5.get(d5) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(d5);
                } else if (jSONObject5.has(d6) && (jSONObject5.get(d6) instanceof JSONObject) && jSONObject5.getJSONObject(d6).has(d5) && (jSONObject5.getJSONObject(d6).get(d5) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONObject(d6).getJSONArray(d5);
                } else if (jSONObject5.has(d6) && (jSONObject5.get(d6) instanceof JSONArray)) {
                    jSONArray2 = jSONObject5.getJSONArray(d6);
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            String d12 = cYh.d("043C202224");
            if (jSONArray2 != null) {
                int i3 = 0;
                while (i3 < jSONArray2.length()) {
                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject7.getString(d11);
                    if (m(string)) {
                        str2 = d3;
                        str3 = str18;
                        jSONArray = jSONArray3;
                        str4 = f2;
                        str5 = d12;
                        str6 = d7;
                        str7 = d8;
                        str8 = d9;
                        str9 = d10;
                        str10 = d11;
                        i = i3;
                    } else {
                        i = i3;
                        String string2 = jSONObject7.getString(d10);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put(d10, string2);
                        jSONObject8.put(d11, string);
                        JSONObject optJSONObject = jSONObject7.optJSONObject(cYh.d("13293134083F1F24243F33"));
                        if (z) {
                            String[] split3 = g(f2, optJSONObject).split(d9);
                            JSONArray jSONArray6 = new JSONArray();
                            str4 = f2;
                            int i4 = f2.isEmpty() ? 1 : 0;
                            str8 = d9;
                            while (i4 < split3.length) {
                                String trim = split3[i4].trim();
                                if (trim.isEmpty()) {
                                    str12 = d3;
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
                                    if (trim2.contains(d3)) {
                                        strArr = split3;
                                        String replace = trim2.replace(d3, str18);
                                        if (replace.equals(d12)) {
                                            trim2 = cYh.d("80E1FAB4C9D1");
                                            str12 = d3;
                                        } else {
                                            str12 = d3;
                                            if (replace.equals(cYh.d("06222430"))) {
                                                d2 = cYh.d("82CCF1B4DBE0");
                                            } else if (replace.equals(cYh.d("0B312F36"))) {
                                                d2 = cYh.d("8FFFECB9FFDA");
                                            } else if (replace.equals(cYh.d("1E352023"))) {
                                                d2 = cYh.d("82E9F5B5ECE7");
                                            }
                                            trim2 = d2;
                                        }
                                        obj = trim2;
                                        trim2 = replace;
                                    } else {
                                        str12 = d3;
                                        strArr = split3;
                                        obj = trim2;
                                    }
                                    JSONObject jSONObject9 = new JSONObject();
                                    str13 = d10;
                                    jSONObject9.put(cYh.d("0C3538"), trim2);
                                    jSONObject9.put(cYh.d("09312C34"), obj);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i5 = 1;
                                    while (i5 < split4.length) {
                                        JSONObject jSONObject10 = new JSONObject();
                                        String[] strArr2 = split4;
                                        String trim3 = split4[i5].trim();
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
                                        i5++;
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
                                i4++;
                                jSONObject8 = jSONObject2;
                                split3 = strArr;
                                d8 = str11;
                                d3 = str12;
                                d10 = str13;
                                d11 = str17;
                                d7 = str16;
                                str18 = str14;
                                d12 = str15;
                            }
                            str2 = d3;
                            str3 = str18;
                            jSONObject = jSONObject8;
                            str5 = d12;
                            str6 = d7;
                            str7 = d8;
                            str9 = d10;
                            str10 = d11;
                            if (!jSONObject6.has(d4)) {
                                jSONObject6.put(d4, new JSONObject());
                            }
                            jSONObject6.getJSONObject(d4).put(string2, jSONArray6);
                        } else {
                            str2 = d3;
                            str3 = str18;
                            jSONObject = jSONObject8;
                            str4 = f2;
                            str5 = d12;
                            str6 = d7;
                            str7 = d8;
                            str8 = d9;
                            str9 = d10;
                            str10 = d11;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject);
                    }
                    i3 = i + 1;
                    jSONArray3 = jSONArray;
                    jSONArray2 = jSONArray4;
                    d9 = str8;
                    f2 = str4;
                    d8 = str7;
                    d3 = str2;
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
            String d2 = d();
            String k = k(d2);
            if (k.isEmpty()) {
                k = e(d2) + cYh.d("0A3F3738327C173126346A6B41313334366741243821326741233530252E5A");
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(k);
            String g2 = C0164g.g(k, i(k));
            a(g2);
            JSONObject jSONObject = new JSONObject(g2);
            JSONArray jSONArray = new JSONArray();
            String d3 = cYh.d("113F250E253F0A31333A24");
            String d4 = cYh.d("113F250E273304");
            String d5 = cYh.d("113F250E393B0A35");
            String d6 = cYh.d("113F250E3E3E");
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(cYh.d("03313530"));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    String fixCover = fixCover(jSONObject2.getString(cYh.d("173922")), k);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(d6, jSONObject2.getString(cYh.d("093539253B33093B")));
                    jSONObject3.put(d5, jSONObject2.getString(cYh.d("1339353D32")));
                    jSONObject3.put(d4, fixCover);
                    jSONObject3.put(d3, jSONObject2.getString(cYh.d("1424202532")));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList<>();
                b(jSONObject, cYh.d("113C282223"), arrayList);
                if (arrayList.isEmpty()) {
                    b(jSONObject, cYh.d("113F250E3B331424"), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<JSONArray> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONArray next = it.next();
                    for (int i2 = 0; i2 < next.length(); i2++) {
                        JSONObject jSONObject4 = next.getJSONObject(i2);
                        String string = jSONObject4.getString(d6);
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            String fixCover2 = fixCover(jSONObject4.getString(d4), k);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(d6, string);
                            jSONObject5.put(d5, jSONObject4.getString(d5));
                            jSONObject5.put(d4, fixCover2);
                            jSONObject5.put(d3, jSONObject4.getString(d3));
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

    public void init(Context context, String str) {
        String d2 = cYh.d("5C6B");
        if (str.indexOf(d2) >= 0) {
            this.a = str.split(d2).length > 1 ? str.split(d2)[1] : "";
            str = str.split(d2)[0];
        }
        super.init(context, str);
        try {
            this.c = str.split(cYh.d("447362"));
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return m.c(str);
    }

    final String j(String str) {
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
        JSONObject h;
        try {
            boolean c = m.c(str2);
            String d2 = cYh.d("12222D");
            String d3 = cYh.d("1731332232");
            if (!c && (m.d(str2) || this.a.indexOf(cYh.d("11")) < 0)) {
                ArrayList<String> arrayList = this.b.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.isEmpty() && (h = h(arrayList, str2)) != null) {
                    return h.toString();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(d3, 1);
                jSONObject.put(cYh.d("0D28"), cYh.d("56"));
                jSONObject.put(d2, str2);
                return jSONObject.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(d3, 0);
            jSONObject2.put(cYh.d("173C202802280B"), "");
            jSONObject2.put(d2, str2);
            return jSONObject2.toString();
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObject;
        String string;
        String d2 = cYh.d("113F250E3E3E");
        String d3 = cYh.d("0B393225");
        String d4 = cYh.d("03313530");
        try {
            String l = l(d(), URLEncoder.encode(str));
            String g2 = C0164g.g(l, i(l));
            a(g2);
            JSONObject jSONObject2 = new JSONObject(g2);
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
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    boolean has = jSONObject3.has(d2);
                    String d5 = cYh.d("113F250E253F0A31333A24");
                    String d6 = cYh.d("113F250E393B0A35");
                    String d7 = cYh.d("113F250E273304");
                    if (has) {
                        String fixCover = fixCover(jSONObject3.getString(d7), l);
                        jSONObject = new JSONObject();
                        jSONObject.put(d2, jSONObject3.getString(d2));
                        jSONObject.put(d6, jSONObject3.getString(d6));
                        jSONObject.put(d7, fixCover);
                        string = jSONObject3.getString(d5);
                    } else {
                        String fixCover2 = fixCover(jSONObject3.getString(cYh.d("173922")), l);
                        jSONObject = new JSONObject();
                        jSONObject.put(d2, jSONObject3.getString(cYh.d("093539253B33093B")));
                        jSONObject.put(d6, jSONObject3.getString(cYh.d("1339353D32")));
                        jSONObject.put(d7, fixCover2);
                        string = jSONObject3.getString(cYh.d("1424202532"));
                    }
                    jSONObject.put(d5, string);
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
