package com.github.catvod.parser;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MixWeb {
    public static HashMap<String, ArrayList<String>> a = new HashMap<>();
    static HashMap<String, ArrayList<String>> b = null;

    public static Object[] loadHtml(String str, String str2) {
        String d = cYh.d("45");
        String d2 = cYh.d("3204077C6F");
        try {
            String str3 = new String(Base64.decode(str2, 10), d2);
            String d3 = cYh.d("6D6C60353839132931347732133D2D6F5D660F242C3D69505B38243033646D6C35382336026EA9F6F4BCF9C07D7E2333133C246F5D660A35353077321324317C322B1239376C7519083E3534392E4A043821327847332E3F233F09247C73233F1F246E3923370B6B61323F3B152324256A2F13366C69757A486E4B6D3A3F13316139232E177D24202233116D63097A0F267D023E3A2A062428333B3F4570223E392E023E356C7513226D043C223606242418126B5772617E69505B3D2425367A09312C346A7815352F3532280222637134350924243F2367452724333C33132C28347A39083D312D3E3F4A233530393E456E4B6D3A3F1331613F3637026D63273E3F10202E23237847332E3F233F09247C7320330324296C333F113922347A2D0E34353975646D6C6E39323B036E4B6D353503297F5B6B290422282123646D262023773B17390023253B1E6D1A723D2214731C6A5D2C06226124253637237C73742F153C62736C50113133713E3C15312C341F2E0A3C7C7375616D362E237F2C062261386A6A5C397D302733262233302E740B352F3623325C396A7A7E216D262023770F351C7C302733262233302E010E0D6A24253637237A5B3E3C15312C341F2E0A3C7C383128063D241923370B7B636D3E3C15312C347729063E253338225A77203D3B35107D323225331724327136360B3F367C243B0A356C3E253300392F7136360B3F367C3135153D3276773C15312C343535153424236A7D577761303B36082727243B361433333432345A773523223F4070363435310E24203D3B351036343D3B2904222434396740243324327D473D2E2B36360B3F363722360B232223323F096D6625252F0277612225395A726A0405164C727F6D78330122203C3264456B4B2C5D3E0833343C3234137E36233E2E02782837253B0A3509253A364E6B4B6D78290422282123646D6C6E33383E1E6E4B6D7832133D2D6F");
            StringBuilder sb = new StringBuilder();
            if (a.containsKey(str)) {
                ArrayList<String> arrayList = a.get(str);
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append(d);
                    sb.append(arrayList.get(i));
                    sb.append(d);
                    if (i < arrayList.size() - 1) {
                        sb.append(cYh.d("4B"));
                    }
                }
            }
            return new Object[]{200, cYh.d("133539257832133D2D6A77390F313322322E5A72140511775F72"), new ByteArrayInputStream(d3.replace(cYh.d("4425333D74"), str3).replace(cYh.d("443A392274"), sb.toString()).toString().getBytes(d2))};
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject parse(LinkedHashMap<String, HashMap<String, String>> linkedHashMap, String str, String str2, String str3) {
        try {
            HashMap<String, ArrayList<String>> hashMap = b;
            String d = cYh.d("57");
            String d2 = cYh.d("13293134");
            if (hashMap == null) {
                b = new HashMap<>();
                for (String str4 : linkedHashMap.keySet()) {
                    HashMap<String, String> hashMap2 = linkedHashMap.get(str4);
                    if (hashMap2.get(d2).equals(d)) {
                        try {
                            JSONArray jSONArray = new JSONObject(hashMap2.get(cYh.d("022835"))).getJSONArray(cYh.d("013C2036"));
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                ArrayList<String> arrayList = b.get(string);
                                if (arrayList == null) {
                                    arrayList = new ArrayList<>();
                                    b.put(string, arrayList);
                                }
                                arrayList.add(str4);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = b.get(str2);
            String d3 = cYh.d("12222D");
            if (arrayList3 == null || arrayList3.isEmpty()) {
                Iterator<String> it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    HashMap<String, String> hashMap3 = linkedHashMap.get(it.next());
                    if (hashMap3.get(d2).equals(d)) {
                        arrayList2.add(hashMap3.get(d3));
                    }
                }
            } else {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    HashMap<String, String> hashMap4 = linkedHashMap.get(arrayList3.get(i2));
                    if (hashMap4.get(d2).equals(d)) {
                        arrayList2.add(hashMap4.get(d3));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                a.put(str2, arrayList2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(d3, cYh.d("17222E292E60487F253E6A170E281634357C013C20366A") + str2 + cYh.d("4125333D6A") + Base64.encodeToString(str3.getBytes(), 10));
                jSONObject.put(cYh.d("1731332232"), 1);
                jSONObject.put(cYh.d("1231"), cYh.d("2A3F3B383B36067F747F677A4F07283F33351023611F037A56606F616C7A30392F676361472877657E7A2620313D320D02320A3823755263767F646C47780A1903172B7C613D3E31027006343431087961123F28083D247E666A527E717F677457701230313B15396E64646D496377"));
                return jSONObject;
            }
        } catch (Throwable th) {
            SpiderDebug.log(th);
        }
        return new JSONObject();
    }
}
