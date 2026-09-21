/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.i0.m;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Huya
extends NetPan {
    private static final Pattern o = Pattern.compile("HNF_GLOBAL_INIT\\s*=\\s*([{].*?[}])\\s*</script>", 32);
    private static final String[] p = new String[]{"1", "2", "3", "8"};
    private static final String[] q = new String[]{"\u7f51\u6e38", "\u5355\u673a", "\u624b\u6e38", "\u5a31\u4e50"};
    private static final String[] r = new String[]{"1", "2793", "2336", "2165"};
    private static final Map<String, String> s;
    private final Map<String, String> m = new HashMap<String, String>();
    private final Map<String, List<b>> n = new HashMap<String, List<b>>();

    static {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        s = linkedHashMap;
        linkedHashMap.put("AL", "\u963f\u91cc");
        linkedHashMap.put("TX", "\u817e\u8baf");
        linkedHashMap.put("HW", "\u534e\u4e3a");
        linkedHashMap.put("HS", "\u706b\u5c71");
        linkedHashMap.put("WS", "\u7f51\u5bbf");
        linkedHashMap.put("HY", "\u864e\u7259");
    }

    private JSONObject o(String object) {
        if (TextUtils.isEmpty((CharSequence)(object = com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.B.e.c("https://m.huya.com/", (String)object), com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://m.huya.com/"), null)))) {
            return null;
        }
        if (!((Matcher)(object = o.matcher((CharSequence)object))).find()) {
            return null;
        }
        return new JSONObject(((Matcher)object).group(1));
    }

    private List<b> p(String string) {
        ArrayList<b> arrayList = new ArrayList<b>();
        JSONArray jSONArray = new JSONObject(com.github.catvod.spider.merge.f0.d.l(com.github.catvod.spider.merge.B.e.c("https://live.cdn.huya.com/liveconfig/game/bussLive?bussType=", string), this.q(), null)).optJSONArray("data");
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                Object object = jSONArray.optJSONObject(i2);
                if (object == null || object.optInt("isHide", 0) == 1) continue;
                String string2 = String.valueOf(object.optInt("gid", (int)object.optDouble("gid", 0.0)));
                object = object.optString("gameFullName");
                if (TextUtils.isEmpty((CharSequence)string2) || "0".equals(string2) || TextUtils.isEmpty((CharSequence)object)) continue;
                arrayList.add(new b((String)object, string2));
                if (i2 != 0) continue;
                ((HashMap)this.m).put(string, string2);
            }
        }
        if (!arrayList.isEmpty()) {
            ((HashMap)this.n).put(string, arrayList);
        }
        return arrayList;
    }

    private Map<String, String> q() {
        return com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36", "Referer", "https://www.huya.com/");
    }

    /*
     * WARNING - void declaration
     */
    private String r(String charSequence2, String object, String object22) {
        Iterator iterator;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        for (String string : ((String)charSequence2).split("&")) {
            int n2;
            if (TextUtils.isEmpty((CharSequence)string) || (n2 = string.indexOf(61)) <= 0) continue;
            linkedHashMap.put(string.substring(0, n2), URLDecoder.decode(string.substring(n2 + 1), "UTF-8"));
        }
        linkedHashMap.put("ver", "1");
        linkedHashMap.put("sv", "2401090219");
        long l2 = Long.parseLong((String)((Object)iterator));
        String string = String.valueOf(System.currentTimeMillis() + l2);
        linkedHashMap.put("seqid", string);
        linkedHashMap.put("uid", iterator);
        linkedHashMap.put("uuid", String.valueOf(Math.abs((System.nanoTime() ^ System.currentTimeMillis()) % 0xFFFFFFFFL)));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("|");
        stringBuilder.append((String)linkedHashMap.get("ctype"));
        stringBuilder.append("|");
        stringBuilder.append((String)linkedHashMap.get("t"));
        String string2 = com.github.catvod.spider.merge.J.j.c(stringBuilder.toString());
        String string3 = (String)linkedHashMap.get("fm");
        if (string3 != null) {
            void var3_8;
            linkedHashMap.put("wsSecret", com.github.catvod.spider.merge.J.j.c(new String(Base64.decode((String)string3, (int)0), StandardCharsets.UTF_8).replace("$0", (CharSequence)((Object)iterator)).replace("$1", (CharSequence)var3_8).replace("$2", string2).replace("$3", (CharSequence)linkedHashMap.get("wsTime"))));
            linkedHashMap.remove("fm");
            linkedHashMap.remove("txyp");
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getValue() == null) continue;
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append('&');
                }
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append(URLEncoder.encode((String)entry.getValue(), "UTF-8"));
            }
            return stringBuilder2.toString();
        }
        throw new Exception("\u7f3a\u5c11 fm \u53c2\u6570");
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        int n2;
        int n3;
        object3 = object3 == null ? null : object3.get("cateId");
        JSONObject jSONObject = object3;
        if (TextUtils.isEmpty((CharSequence)object3)) {
            jSONObject = (String)((HashMap)this.m).get(object);
        }
        object3 = TextUtils.isEmpty(jSONObject) ? object : jSONObject;
        object = object2;
        if (TextUtils.isEmpty((CharSequence)object2)) {
            object = "1";
        }
        if ((object3 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(String.format(Locale.US, "https://www.huya.com/cache.php?m=LiveList&do=getLiveListByPage&gameId=%s&tagAll=0&page=%s", object3, object), this.q(), null)).optJSONObject("data")) == null) {
            return com.github.catvod.spider.merge.K.f.o(new ArrayList<h>());
        }
        object2 = new ArrayList();
        JSONArray jSONArray = object3.optJSONArray("datas");
        if (jSONArray != null) {
            for (n3 = 0; n3 < jSONArray.length(); ++n3) {
                String string;
                jSONObject = jSONArray.optJSONObject(n3);
                if (jSONObject == null || TextUtils.isEmpty((CharSequence)(string = jSONObject.optString("profileRoom")))) continue;
                String string2 = com.github.catvod.spider.merge.i0.m.g(jSONObject.optString("introduction"), jSONObject.optString("roomName"), jSONObject.optString("nick"));
                String string3 = jSONObject.optString("screenshot");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(jSONObject.optString("nick"));
                stringBuilder.append(" \u00b7 ");
                stringBuilder.append(com.github.catvod.spider.merge.i0.m.h(jSONObject.optString("totalCount")));
                ((ArrayList)object2).add(new h(string, string2, string3, stringBuilder.toString()));
            }
        }
        jSONObject = com.github.catvod.spider.merge.i0.m.a;
        try {
            n3 = Integer.parseInt((String)object);
        }
        catch (Exception exception) {
            n3 = 1;
        }
        int n4 = Math.max(object3.optInt("totalPage", 1), 1);
        int n5 = Math.max(object3.optInt("pageSize", 120), 1);
        int n6 = n2 = object3.optInt("totalCount", ((ArrayList)object2).size());
        if (n2 <= 0) {
            n6 = n4 * n5;
        }
        object = new f();
        ((f)object).y((List<h>)object2);
        ((f)object).k(n3, n4, n5, n6);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        Object object2;
        String string = object.get(0);
        if (TextUtils.isEmpty((CharSequence)string)) {
            return com.github.catvod.spider.merge.K.f.d("\u623f\u95f4\u53f7\u4e3a\u7a7a");
        }
        object = this.o(string);
        if (object == null) {
            return com.github.catvod.spider.merge.K.f.d("\u65e0\u6cd5\u83b7\u53d6\u623f\u95f4\u4fe1\u606f");
        }
        Object object3 = object.optJSONObject("roomInfo");
        if (object3 == null) {
            return com.github.catvod.spider.merge.K.f.d("\u623f\u95f4\u4fe1\u606f\u7f3a\u5931");
        }
        int n2 = object3.optInt("eLiveStatus", 0);
        object = object2 = object3.optJSONObject("tLiveInfo");
        if (object2 == null) {
            object = object3.optJSONObject("tRecentLive");
        }
        if (object == null) {
            return com.github.catvod.spider.merge.K.f.d("\u623f\u95f4\u672a\u5f00\u64ad\u6216\u4e0d\u5b58\u5728");
        }
        h h2 = new h();
        h2.l(string);
        h2.m(com.github.catvod.spider.merge.i0.m.g(object.optString("sIntroduction"), object.optString("sRoomName"), object.optString("sNick")));
        h2.n(object.optString("sScreenshot"));
        h2.h(object.optString("sNick"));
        h2.g(object.optString("sGameFullName"));
        h2.i(com.github.catvod.spider.merge.i0.m.h(String.valueOf(object.optLong("lUserCount", 0L))));
        object3 = "\u76f4\u64ad\u4e2d";
        object2 = n2 == 2 ? "\u76f4\u64ad\u4e2d" : "\u672a\u5f00\u64ad";
        h2.q((String)object2);
        Object object4 = Locale.CHINA;
        Object object5 = object.optString("sNick");
        CharSequence charSequence = object.optString("sGameFullName");
        Object object6 = com.github.catvod.spider.merge.i0.m.h(String.valueOf(object.optLong("lUserCount", 0L)));
        object2 = n2 == 2 ? object3 : "\u672a\u5f00\u64ad";
        h2.j(String.format((Locale)object4, "\u4e3b\u64ad\uff1a%s\n\u5206\u533a\uff1a%s\n\u4eba\u6c14\uff1a%s\n\u72b6\u6001\uff1a%s\n\u623f\u95f4\uff1a%s", object5, charSequence, object6, object2, string));
        if (n2 != 2) {
            h2.o("\u864e\u7259");
            h2.p("\u672a\u5f00\u64ad$0");
            return com.github.catvod.spider.merge.K.f.n(h2);
        }
        if ((object = object.optJSONObject("tLiveStreamInfo")) == null) {
            return com.github.catvod.spider.merge.K.f.d("\u65e0\u6d41\u4fe1\u606f");
        }
        object2 = object.optJSONObject("vStreamInfo");
        if (object2 == null) {
            return com.github.catvod.spider.merge.K.f.d("\u65e0\u6d41\u7ebf\u8def");
        }
        object3 = object2.optJSONArray("value");
        if (object3 != null && object3.length() != 0) {
            int n3;
            object = object.optJSONObject("vBitRateInfo");
            object2 = new ArrayList();
            if (object != null && (object4 = object.optJSONArray("value")) != null) {
                for (n2 = 0; n2 < object4.length(); ++n2) {
                    object = object4.optJSONObject(n2);
                    if (object == null) continue;
                    charSequence = object.optString("sDisplayName");
                    n3 = object.optInt("iBitRate", 0);
                    object = charSequence;
                    if (TextUtils.isEmpty((CharSequence)charSequence)) {
                        if (n3 > 0) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(n3);
                            ((StringBuilder)object).append("K");
                            object = ((StringBuilder)object).toString();
                        } else {
                            object = "\u539f\u753b";
                        }
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append("|");
                    ((StringBuilder)charSequence).append(n3);
                    ((ArrayList)object2).add(((StringBuilder)charSequence).toString());
                }
            }
            if (((ArrayList)object2).isEmpty()) {
                ((ArrayList)object2).add("\u539f\u753b|0");
                ((ArrayList)object2).add("\u8d85\u6e05|2000");
                ((ArrayList)object2).add("\u6d41\u7545|500");
            }
            object5 = new ArrayList();
            object6 = new ArrayList();
            object = object3;
            for (n2 = 0; n2 < object.length(); ++n2) {
                object3 = object.optJSONObject(n2);
                if (object3 == null || TextUtils.isEmpty((CharSequence)(object4 = object3.optString("sCdnType")))) continue;
                boolean bl = TextUtils.isEmpty((CharSequence)object3.optString("sFlvUrl")) ^ true;
                n3 = TextUtils.isEmpty((CharSequence)object3.optString("sHlsUrl")) ^ 1;
                if (!bl && n3 == 0) continue;
                object3 = s;
                object3 = object3.containsKey(object4) ? (String)((LinkedHashMap)object3).get(object4) : object4;
                ArrayList<String> arrayList = new ArrayList<String>();
                Iterator iterator = ((ArrayList)object2).iterator();
                while (iterator.hasNext()) {
                    StringBuilder stringBuilder;
                    charSequence = ((String)iterator.next()).split("\\|", 2);
                    CharSequence charSequence2 = charSequence[0];
                    charSequence = ((CharSequence)charSequence).length > 1 ? charSequence[1] : "0";
                    if (bl) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append((String)charSequence2);
                        stringBuilder.append(" FLV$");
                        stringBuilder.append(string);
                        stringBuilder.append("@");
                        stringBuilder.append((String)object4);
                        stringBuilder.append("@flv@");
                        stringBuilder.append((String)charSequence);
                        arrayList.add(stringBuilder.toString());
                    }
                    if (n3 == 0) continue;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append((String)charSequence2);
                    stringBuilder.append(" HLS$");
                    stringBuilder.append(string);
                    stringBuilder.append("@");
                    stringBuilder.append((String)object4);
                    stringBuilder.append("@hls@");
                    stringBuilder.append((String)charSequence);
                    arrayList.add(stringBuilder.toString());
                }
                if (arrayList.isEmpty()) continue;
                ((ArrayList)object5).add(object3);
                ((ArrayList)object6).add(TextUtils.join((CharSequence)"#", arrayList));
            }
            if (((ArrayList)object5).isEmpty()) {
                return com.github.catvod.spider.merge.K.f.d("\u672a\u89e3\u6790\u5230\u64ad\u653e\u5730\u5740");
            }
            h2.o(TextUtils.join((CharSequence)"$$$", (Iterable)object5));
            h2.p(TextUtils.join((CharSequence)"$$$", (Iterable)object6));
            return com.github.catvod.spider.merge.K.f.n(h2);
        }
        return com.github.catvod.spider.merge.K.f.d("\u5f53\u524d\u65e0\u53ef\u7528\u7ebf\u8def");
    }

    public String homeContent(boolean bl) {
        Object object;
        ArrayList<a> arrayList = new ArrayList<a>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>> linkedHashMap = new LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>>();
        for (int i2 = 0; i2 < ((String[])(object = p)).length; ++i2) {
            ArrayList<com.github.catvod.spider.merge.K.c> arrayList2;
            String string;
            block4: {
                block3: {
                    string = object[i2];
                    arrayList.add(new a(string, q[i2]));
                    arrayList2 = (ArrayList<com.github.catvod.spider.merge.K.c>)((HashMap)this.n).get(string);
                    if (arrayList2 == null) break block3;
                    object = arrayList2;
                    if (!arrayList2.isEmpty()) break block4;
                }
                object = this.p(string);
            }
            if (object.isEmpty()) continue;
            arrayList2 = new ArrayList<com.github.catvod.spider.merge.K.c>();
            arrayList2.add(new com.github.catvod.spider.merge.K.c("cateId", "\u5206\u7c7b", (List<b>)object));
            ((AbstractMap)linkedHashMap).put(string, arrayList2);
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        return this.categoryContent("1", "1", false, new HashMap<String, String>());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context stringArray, String string) {
        int n2;
        super.init((Context)stringArray, string);
        int n3 = 0;
        for (n2 = 0; n2 < (stringArray = p).length; ++n2) {
            ((HashMap)this.m).put(stringArray[n2], r[n2]);
        }
        int n4 = stringArray.length;
        n2 = n3;
        while (n2 < n4) {
            string = stringArray[n2];
            try {
                this.p(string);
            }
            catch (Exception exception) {}
            ++n2;
        }
        return;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String object, String object2, List<String> object3) {
        String string;
        String string2;
        String string3;
        Object object4;
        block27: {
            block26: {
                void var6_10;
                JSONArray jSONArray;
                Object object5;
                block25: {
                    if (!TextUtils.isEmpty((CharSequence)object2) && !"0".equals(object2)) {
                        block24: {
                            if (((Object)(object2 = ((String)object2).split("@"))).length < 4) {
                                object = "\u64ad\u653e\u53c2\u6570\u9519\u8bef";
                                return com.github.catvod.spider.merge.K.f.d((String)object);
                            }
                            object = object2[0];
                            object5 = object2[1];
                            object3 = object2[2];
                            object4 = object2[3];
                            try {
                                object = this.o((String)object);
                                if (object != null) break block24;
                                object = "\u5237\u65b0\u623f\u95f4\u4fe1\u606f\u5931\u8d25";
                                return com.github.catvod.spider.merge.K.f.d((String)object);
                            }
                            catch (Exception exception) {
                                throw new RuntimeException(exception);
                            }
                        }
                        if ((object = object.optJSONObject("roomInfo")) != null && object.optInt("eLiveStatus", 0) == 2) {
                            if ((object = object.optJSONObject("tLiveInfo")) == null) {
                                object = "\u65e0\u76f4\u64ad\u4fe1\u606f";
                                return com.github.catvod.spider.merge.K.f.d((String)object);
                            }
                            if ((object = object.optJSONObject("tLiveStreamInfo")) == null) {
                                object = "\u65e0\u6d41\u4fe1\u606f";
                                return com.github.catvod.spider.merge.K.f.d((String)object);
                            }
                            if ((object = object.optJSONObject("vStreamInfo")) == null) {
                                return com.github.catvod.spider.merge.K.f.d("\u65e0\u6d41\u7ebf\u8def");
                            }
                            jSONArray = object.optJSONArray("value");
                            if (jSONArray == null) {
                                return com.github.catvod.spider.merge.K.f.d("\u65e0\u6d41\u7ebf\u8def");
                            }
                            break block25;
                        } else {
                            object = "\u4e3b\u64ad\u672a\u5f00\u64ad";
                            return com.github.catvod.spider.merge.K.f.d((String)object);
                        }
                    }
                    object = "\u5f53\u524d\u76f4\u64ad\u95f4\u672a\u5f00\u64ad";
                    return com.github.catvod.spider.merge.K.f.d((String)object);
                }
                object2 = null;
                int n2 = 0;
                while (true) {
                    object = object2;
                    if (n2 >= jSONArray.length() || (object = jSONArray.optJSONObject(n2)) != null && ((String)object5).equalsIgnoreCase(object.optString("sCdnType"))) break;
                    ++n2;
                }
                Object object6 = object;
                if (object == null) {
                    JSONObject jSONObject = jSONArray.optJSONObject(0);
                }
                if (var6_10 == null) {
                    object = "\u7ebf\u8def\u4e0d\u5b58\u5728";
                    return com.github.catvod.spider.merge.K.f.d((String)object);
                }
                string3 = var6_10.optString("sStreamName");
                if ("hls".equalsIgnoreCase((String)object3)) {
                    object3 = var6_10.optString("sHlsUrl");
                    object2 = var6_10.optString("sHlsUrlSuffix");
                    object = "sHlsAntiCode";
                } else {
                    object3 = var6_10.optString("sFlvUrl");
                    object2 = var6_10.optString("sFlvUrlSuffix");
                    object = "sFlvAntiCode";
                }
                string2 = var6_10.optString((String)object);
                if (!(TextUtils.isEmpty((CharSequence)object3) || TextUtils.isEmpty((CharSequence)string3) || TextUtils.isEmpty((CharSequence)string2))) {
                    object = "";
                    Object object7 = new JSONObject();
                    object7.put("appId", 5002);
                    object7.put("byPass", 3);
                    object7.put("context", (Object)"");
                    object7.put("version", (Object)"2.4");
                    JSONObject jSONObject = new JSONObject();
                    object7.put("data", (Object)jSONObject);
                    Map<String, String> map = this.q();
                    ((HashMap)map).put("Content-Type", "application/json");
                    object7 = com.github.catvod.spider.merge.f0.d.i("https://udblgn.huya.com/web/anonymousLogin", object7.toString(), map);
                    JSONObject jSONObject2 = new JSONObject(((i)object7).a());
                    object7 = jSONObject2.optJSONObject("data");
                    if (object7 != null) {
                        object = object7.optString("uid");
                    }
                    boolean bl = TextUtils.isEmpty((CharSequence)object);
                    if (bl) break block26;
                    break block27;
                }
                object = "\u6d41\u53c2\u6570\u7f3a\u5931";
                return com.github.catvod.spider.merge.K.f.d((String)object);
                catch (Exception exception) {}
            }
            object = String.valueOf(System.currentTimeMillis() % 100000000L + 1400000000000L);
        }
        try {
            string = this.r(string2, (String)object, string3);
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(".");
        ((StringBuilder)object).append((String)object2);
        object = object2 = com.github.catvod.spider.merge.I.r.c((StringBuilder)object, "?", string);
        if (!"0".equals(object4)) {
            object = object2;
            if (!TextUtils.isEmpty((CharSequence)object4)) {
                object = com.github.catvod.spider.merge.I.s.a((String)object2, "&ratio=", (String)object4);
            }
        }
        object2 = object;
        if (((String)object).startsWith("//")) {
            object2 = com.github.catvod.spider.merge.B.e.c("https:", (String)object);
        }
        object = ((String)object2).replace("http://", "https://");
        object2 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://m.huya.com/");
        ((HashMap)object2).put("Origin", "https://m.huya.com");
        object3 = new f();
        ((f)object3).w((String)object);
        ((f)object3).g((Map<String, String>)object2);
        return ((f)object3).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    public String searchContent(String object, boolean bl, String string) {
        int n2;
        JSONObject jSONObject = com.github.catvod.spider.merge.i0.m.a;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Exception exception) {
            n2 = 1;
        }
        n2 = Math.max(n2 - 1, 0);
        string = com.github.catvod.spider.merge.f0.d.l(String.format(Locale.US, "https://search.cdn.huya.com/?m=Search&do=getSearchContent&q=%s&uid=0&v=4&typ=-5&livestate=0&rows=40&start=%s", URLEncoder.encode((String)object, "UTF-8"), n2 * 40), this.q(), null);
        object = string;
        if (string != null) {
            object = string;
            if (string.startsWith("\ufeff")) {
                object = string.substring(1);
            }
        }
        if ((string = (object = new JSONObject((String)object)).optJSONObject("response")) != null) {
            object = string;
        }
        string = object.optJSONObject("3");
        object = new ArrayList();
        if (string != null && (string = string.optJSONArray("docs")) != null) {
            for (n2 = 0; n2 < string.length(); ++n2) {
                String string2;
                jSONObject = string.optJSONObject(n2);
                if (jSONObject == null || TextUtils.isEmpty((CharSequence)(string2 = jSONObject.optString("room_id")))) continue;
                String string3 = com.github.catvod.spider.merge.i0.m.g(jSONObject.optString("game_introduction"), jSONObject.optString("game_roomName"), jSONObject.optString("game_nick"));
                String string4 = jSONObject.optString("game_screenshot");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(jSONObject.optString("game_nick"));
                stringBuilder.append(" \u00b7 ");
                stringBuilder.append(jSONObject.optString("gameName"));
                stringBuilder.append(" \u00b7 ");
                stringBuilder.append(com.github.catvod.spider.merge.i0.m.h(jSONObject.optString("game_total_count")));
                ((ArrayList)object).add(new h(string2, string3, string4, stringBuilder.toString()));
            }
        }
        return com.github.catvod.spider.merge.K.f.o((List<h>)object);
    }
}

