/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Douyu$1;
import com.github.catvod.spider.Douyu$CachedPlay;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.m;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class Douyu
extends NetPan {
    private static final String[] q = new String[]{"1", "15", "9", "2", "8", "11"};
    private static final String[] r = new String[]{"\u7f51\u6e38\u7ade\u6280", "\u5355\u673a\u70ed\u6e38", "\u624b\u6e38\u4f11\u95f2", "\u5a31\u4e50\u5929\u5730", "\u989c\u503c", "\u79d1\u6280\u6587\u5316"};
    private static final String[] s = new String[]{"1", "19", "181", "208", "201", "134"};
    private final Map<String, String> m = new HashMap<String, String>();
    private final Map<String, List<b>> n = new ConcurrentHashMap<String, List<b>>();
    private final Map<String, Douyu$CachedPlay> o = new ConcurrentHashMap<String, Douyu$CachedPlay>();
    private volatile boolean p;

    private Map<String, List<b>> o() {
        int n2;
        HashMap<String, List<b>> hashMap = new HashMap<String, List<b>>();
        JSONObject jSONObject = q;
        for (n2 = 0; n2 < 6; ++n2) {
            hashMap.put(jSONObject[n2], new ArrayList());
        }
        Object object = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://m.douyu.com/");
        jSONObject = null;
        if (!(object = new JSONObject(com.github.catvod.spider.merge.f0.d.l("https://m.douyu.com/api/cate/list", (Map<String, String>)object, null))).has("error") || object.optInt("error", 0) == 0) {
            jSONObject = object.optJSONObject("data");
        }
        if (jSONObject == null) {
            return hashMap;
        }
        if ((jSONObject = jSONObject.optJSONArray("cate2Info")) == null) {
            return hashMap;
        }
        for (n2 = 0; n2 < jSONObject.length(); ++n2) {
            List<b> list;
            Object object2 = jSONObject.optJSONObject(n2);
            if (object2 == null || (list = hashMap.get(String.valueOf(object2.optInt("cate1Id", 0)))) == null) continue;
            object = String.valueOf(object2.optInt("cate2Id", 0));
            object2 = object2.optString("cate2Name");
            if (TextUtils.isEmpty((CharSequence)object) || "0".equals(object) || TextUtils.isEmpty((CharSequence)object2)) continue;
            list.add(new b((String)object2, (String)object));
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private JSONObject p(String object, String object22, String object3) {
        boolean bl;
        void var2_5;
        String string;
        Object object2;
        Object object4;
        if (TextUtils.isEmpty((CharSequence)object4)) {
            object4 = "0";
        }
        if (object22 == null) {
            String string2 = "";
        }
        if ((object2 = (Douyu$CachedPlay)((ConcurrentHashMap)this.o).get(string = com.github.catvod.spider.merge.I.r.b((String)object, "@", (String)var2_5, "@", (String)object4))) != null && (bl = ((Douyu$CachedPlay)object2).a != null && System.currentTimeMillis() < ((Douyu$CachedPlay)object2).b)) {
            return ((Douyu$CachedPlay)object2).a;
        }
        Locale locale = Locale.US;
        Object object5 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(String.format(locale, "https://www.douyu.com/swf_api/homeH5Enc?rids=%s", object), this.r(), null)).optJSONObject("data");
        if (object5 != null) {
            Object object6;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("room");
            ((StringBuilder)object2).append((String)object);
            String string3 = object5.optString(((StringBuilder)object2).toString());
            object2 = string3;
            if (TextUtils.isEmpty((CharSequence)string3)) {
                object6 = object5.names();
                object2 = string3;
                if (object6 != null) {
                    object2 = string3;
                    if (object6.length() > 0) {
                        object2 = object5.optString(object6.getString(0));
                    }
                }
            }
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                block17: {
                    boolean bl2;
                    string3 = UUID.randomUUID().toString().replace("-", "");
                    long l2 = System.currentTimeMillis() / 1000L;
                    object6 = Context.enter();
                    ((Context)object6).setOptimizationLevel(-1);
                    ScriptableObject scriptableObject = ((Context)object6).initStandardObjects();
                    object5 = new Douyu$1();
                    ScriptableObject.putProperty((Scriptable)scriptableObject, "__javaMd5", object5);
                    ScriptableObject.putProperty((Scriptable)scriptableObject, "__rid", object);
                    ScriptableObject.putProperty((Scriptable)scriptableObject, "__did", (Object)string3);
                    ScriptableObject.putProperty((Scriptable)scriptableObject, "__tt", (Object)String.valueOf(l2));
                    ((Context)object6).evaluateString(scriptableObject, "var CryptoJS={MD5:function(s){return{toString:function(){return __javaMd5(String(s));}};}};", "douyu_md5", 1, null);
                    ((Context)object6).evaluateString(scriptableObject, (String)object2, "douyu_enc", 1, null);
                    object2 = Context.toString(((Context)object6).evaluateString(scriptableObject, "ub98484234(String(__rid),String(__did),String(__tt))", "douyu_sign", 1, null));
                    if (TextUtils.isEmpty((CharSequence)object2) || !(bl2 = ((String)object2).contains("sign="))) break block17;
                    Context.exit();
                    if (!TextUtils.isEmpty((CharSequence)object2)) {
                        object2 = com.github.catvod.spider.merge.I.r.d((String)object2, "&cdn=");
                        ((StringBuilder)object2).append(URLEncoder.encode((String)var2_5, "UTF-8"));
                        ((StringBuilder)object2).append("&rate=");
                        ((StringBuilder)object2).append(URLEncoder.encode((String)object4, "UTF-8"));
                        object4 = ((StringBuilder)object2).toString();
                        Map<String, String> map = this.r();
                        ((HashMap)map).put("Content-Type", "application/x-www-form-urlencoded");
                        object = com.github.catvod.spider.merge.f0.d.h((String)object4, String.format(locale, "https://www.douyu.com/lapi/live/getH5Play/%s", object), map);
                        if (TextUtils.isEmpty((CharSequence)object)) {
                            return null;
                        }
                        if ((object = new JSONObject((String)object)).optInt("error", -1) == 0) {
                            if ((object = object.optJSONObject("data")) != null) {
                                ((ConcurrentHashMap)this.o).put(string, new Douyu$CachedPlay((JSONObject)object, System.currentTimeMillis() + 45000L));
                                if (((ConcurrentHashMap)this.o).size() > 32) {
                                    l2 = System.currentTimeMillis();
                                    for (Map.Entry entry : ((ConcurrentHashMap)this.o).entrySet()) {
                                        if (entry.getValue() != null && ((Douyu$CachedPlay)entry.getValue()).b >= l2) continue;
                                        ((ConcurrentHashMap)this.o).remove(entry.getKey());
                                    }
                                }
                            }
                            return object;
                        }
                        throw new Exception(com.github.catvod.spider.merge.i0.m.g(object.optString("msg"), "getH5Play \u5931\u8d25"));
                    }
                    throw new Exception("\u7b7e\u540d\u5931\u8d25");
                }
                try {
                    object = new Exception("\u7b7e\u540d\u7ed3\u679c\u65e0\u6548");
                    throw object;
                }
                catch (Throwable throwable) {
                    Context.exit();
                    throw throwable;
                }
            }
            throw new Exception("\u7f3a\u5c11\u52a0\u5bc6\u811a\u672c");
        }
        throw new Exception("homeH5Enc \u65e0\u6570\u636e");
    }

    private List<String> q(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                Object object = jSONArray.optJSONObject(i2);
                if (object == null) continue;
                CharSequence charSequence = object.optString("name");
                int n2 = object.optInt("rate", 0);
                object = charSequence;
                if (TextUtils.isEmpty((CharSequence)charSequence)) {
                    object = n2 == 0 ? "\u539f\u753b" : com.github.catvod.spider.merge.I.r.a("\u7801\u7387", n2);
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("|");
                ((StringBuilder)charSequence).append(n2);
                arrayList.add(((StringBuilder)charSequence).toString());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("\u539f\u753b|0");
            arrayList.add("\u9ad8\u6e05|2");
            arrayList.add("\u8d85\u6e05|3");
        }
        return arrayList;
    }

    private Map<String, String> r() {
        return com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36", "Referer", "https://www.douyu.com/");
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        int n2;
        object3 = object3 == null ? null : ((HashMap)object3).get("cateId");
        Object object4 = object3;
        if (TextUtils.isEmpty((CharSequence)object3)) {
            object4 = (String)((HashMap)this.m).get(object);
        }
        if (!TextUtils.isEmpty(object4)) {
            object = object4;
        }
        object3 = object2;
        if (TextUtils.isEmpty((CharSequence)object2)) {
            object3 = "1";
        }
        if ((object4 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(String.format(Locale.US, "https://www.douyu.com/gapi/rkc/directory/mixList/2_%s/%s", object, object3), this.r(), null)).optJSONObject("data")) == null) {
            return com.github.catvod.spider.merge.K.f.o(new ArrayList<h>());
        }
        object2 = new ArrayList();
        JSONArray jSONArray = object4.optJSONArray("rl");
        if (jSONArray != null) {
            for (n2 = 0; n2 < jSONArray.length(); ++n2) {
                String string;
                JSONObject jSONObject = jSONArray.optJSONObject(n2);
                if (jSONObject == null || jSONObject.has("type") && jSONObject.optInt("type", 1) != 1 || TextUtils.isEmpty((CharSequence)(string = jSONObject.optString("rid")))) continue;
                String string2 = com.github.catvod.spider.merge.i0.m.g(jSONObject.optString("rn"), jSONObject.optString("nn"));
                CharSequence charSequence = jSONObject.optString("rs16");
                String string3 = jSONObject.optString("rs1");
                object = jSONObject.optString("av");
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = "";
                } else if (!((String)object).startsWith("http")) {
                    object = com.github.catvod.spider.merge.I.s.a("https://apic.douyucdn.cn/upload/", (String)object, "_middle.jpg");
                }
                object = com.github.catvod.spider.merge.i0.m.g(new String[]{charSequence, string3, object});
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(jSONObject.optString("nn"));
                ((StringBuilder)charSequence).append(" \u00b7 ");
                ((StringBuilder)charSequence).append(com.github.catvod.spider.merge.i0.m.h(String.valueOf(jSONObject.optLong("ol", 0L))));
                ((ArrayList)object2).add(new h(string, string2, (String)object, ((StringBuilder)charSequence).toString()));
            }
        }
        object = com.github.catvod.spider.merge.i0.m.a;
        try {
            n2 = Integer.parseInt((String)object3);
        }
        catch (Exception exception) {
            n2 = 1;
        }
        int n3 = Math.max(object4.optInt("pgcnt", 1), 1);
        int n4 = ((ArrayList)object2).isEmpty() ? 120 : ((ArrayList)object2).size();
        n4 = Math.max(n4, 1);
        object = new f();
        ((f)object).y((List<h>)object2);
        ((f)object).k(n2, n3, n4, n3 * n4);
        return ((f)object).toString();
    }

    public String detailContent(List<String> object) {
        Object object2 = "0";
        String string = object.get(0);
        if (TextUtils.isEmpty((CharSequence)string)) {
            return com.github.catvod.spider.merge.K.f.d("\u623f\u95f4\u53f7\u4e3a\u7a7a");
        }
        Object object3 = String.format(Locale.US, "https://m.douyu.com/api/room/info?rid=%s", string);
        Object object4 = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://m.douyu.com/");
        object = null;
        if ((object4 = new JSONObject(com.github.catvod.spider.merge.f0.d.l((String)object3, (Map<String, String>)object4, null)).optJSONObject("data")) != null && (object = object4.optJSONObject("roomInfo")) == null) {
            object = object4;
        }
        if (object == null) {
            return com.github.catvod.spider.merge.K.f.d("\u65e0\u6cd5\u83b7\u53d6\u623f\u95f4\u4fe1\u606f");
        }
        int n2 = object.optInt("isLive", 0);
        h h2 = new h();
        h2.l(string);
        h2.m(com.github.catvod.spider.merge.i0.m.g(object.optString("roomName"), object.optString("nickname")));
        h2.n(com.github.catvod.spider.merge.i0.m.g(object.optString("roomSrc"), object.optString("avatar")));
        h2.h(object.optString("nickname"));
        h2.g(object.optString("cate2Name"));
        h2.i(object.optString("hn"));
        object3 = "\u76f4\u64ad\u4e2d";
        object4 = n2 == 1 ? "\u76f4\u64ad\u4e2d" : "\u672a\u5f00\u64ad";
        h2.q((String)object4);
        Cloneable cloneable = Locale.CHINA;
        Object object5 = object.optString("nickname");
        String string2 = object.optString("cate2Name");
        Object object6 = object.optString("hn");
        object4 = n2 == 1 ? object3 : "\u672a\u5f00\u64ad";
        h2.j(String.format((Locale)cloneable, "\u4e3b\u64ad\uff1a%s\n\u5206\u533a\uff1a%s\n\u70ed\u5ea6\uff1a%s\n\u72b6\u6001\uff1a%s\n\u623f\u95f4\uff1a%s\n\u516c\u544a\uff1a%s", object5, string2, object6, object4, string, object.optString("notice")));
        if (n2 != 1) {
            h2.o("\u6597\u9c7c");
            h2.p("\u672a\u5f00\u64ad$0");
            return com.github.catvod.spider.merge.K.f.n(h2);
        }
        try {
            object = this.p(string, "", "0");
        }
        catch (Exception exception) {
            object = null;
        }
        if (object != null) {
            object4 = object.optJSONArray("cdnsWithName");
            object3 = this.q(object.optJSONArray("multirates"));
            object = object4;
        } else {
            object = null;
            object3 = this.q(null);
        }
        if (object != null && object.length() != 0) {
            object5 = new ArrayList();
            cloneable = new ArrayList();
            object4 = object2;
            for (n2 = 0; n2 < object.length(); ++n2) {
                object2 = object.optJSONObject(n2);
                if (object2 == null) {
                    object2 = object;
                    object = object4;
                    object4 = object2;
                } else {
                    string2 = object2.optString("cdn");
                    object2 = object2.optString("name");
                    object6 = com.github.catvod.spider.merge.C.a.c("\u7ebf\u8def");
                    ((StringBuilder)object6).append(n2 + 1);
                    String string3 = com.github.catvod.spider.merge.i0.m.g(new String[]{object2, ((StringBuilder)object6).toString()});
                    ArrayList<String> arrayList = new ArrayList<String>();
                    object6 = object3.iterator();
                    object2 = object;
                    object = object4;
                    while (object6.hasNext()) {
                        object4 = ((String)object6.next()).split("\\|", 2);
                        String string4 = object4[0];
                        object4 = ((String[])object4).length > 1 ? object4[1] : object;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string4);
                        stringBuilder.append("$");
                        stringBuilder.append(string);
                        stringBuilder.append("@");
                        stringBuilder.append(string2);
                        stringBuilder.append("@");
                        stringBuilder.append((String)object4);
                        arrayList.add(stringBuilder.toString());
                    }
                    object4 = object2;
                    if (!arrayList.isEmpty()) {
                        ((ArrayList)object5).add(string3);
                        ((ArrayList)cloneable).add(TextUtils.join((CharSequence)"#", arrayList));
                    }
                }
                object2 = object4;
                object4 = object;
                object = object2;
            }
            if (((ArrayList)object5).isEmpty()) {
                return com.github.catvod.spider.merge.K.f.d("\u672a\u89e3\u6790\u5230\u64ad\u653e\u7ebf\u8def");
            }
            h2.o(TextUtils.join((CharSequence)"$$$", (Iterable)object5));
            h2.p(TextUtils.join((CharSequence)"$$$", (Iterable)((Object)cloneable)));
            return com.github.catvod.spider.merge.K.f.n(h2);
        }
        object4 = new ArrayList();
        object2 = object3.iterator();
        while (object2.hasNext()) {
            object = ((String)object2.next()).split("\\|", 2);
            object3 = object[0];
            object = ((String[])object).length > 1 ? object[1] : "0";
            object4.add(com.github.catvod.spider.merge.I.r.b((String)object3, "$", string, "@@", (String)object));
        }
        h2.o("\u7ebf\u8def1");
        h2.p(TextUtils.join((CharSequence)"#", (Iterable)object4));
        return com.github.catvod.spider.merge.K.f.n(h2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String homeContent(boolean bl) {
        Map<String, List<b>> map;
        if (!this.p || ((ConcurrentHashMap)this.n).isEmpty()) {
            synchronized (this) {
                if (!this.p || (bl = ((ConcurrentHashMap)this.n).isEmpty())) {
                    try {
                        map = this.o();
                        ((ConcurrentHashMap)this.n).clear();
                        ((ConcurrentHashMap)this.n).putAll(map);
                        this.p = true;
                    }
                    catch (Exception exception) {}
                }
            }
        }
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        map = new LinkedHashMap<String, List<b>>();
        int n2 = 0;
        while (true) {
            Object object = q;
            if (n2 >= 6) {
                return com.github.catvod.spider.merge.K.f.q(arrayList, map);
            }
            object = object[n2];
            arrayList.add(new com.github.catvod.spider.merge.K.a((String)object, r[n2]));
            List list = (List)((ConcurrentHashMap)this.n).get(object);
            if (list != null && !list.isEmpty()) {
                ArrayList<com.github.catvod.spider.merge.K.c> arrayList2 = new ArrayList<com.github.catvod.spider.merge.K.c>();
                arrayList2.add(new com.github.catvod.spider.merge.K.c("cateId", "\u5206\u7c7b", list));
                ((AbstractMap)map).put((String)object, (List<b>)arrayList2);
            }
            ++n2;
        }
    }

    public String homeVideoContent() {
        return this.categoryContent("1", "1", false, new HashMap<String, String>());
    }

    @Override
    public void init(android.content.Context stringArray, String string) {
        super.init((android.content.Context)stringArray, string);
        int n2 = 0;
        while (true) {
            stringArray = q;
            if (n2 >= 6) break;
            ((HashMap)this.m).put(stringArray[n2], s[n2]);
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String playerContent(String object, String object2, List<String> object3) {
        if (!TextUtils.isEmpty((CharSequence)object2) && !"0".equals(object2)) {
            object3 = ((String)object2).split("@", -1);
            if (((Object)object3).length < 3) {
                object = "\u64ad\u653e\u53c2\u6570\u9519\u8bef";
                return com.github.catvod.spider.merge.K.f.d((String)object);
            }
            object2 = object3[0];
            object = object3[1];
            object3 = object3[2];
            try {
                object2 = this.p((String)object2, (String)object, (String)object3);
                if (object2 == null) {
                    return com.github.catvod.spider.merge.K.f.d("\u5237\u65b0\u64ad\u653e\u5730\u5740\u5931\u8d25");
                }
                object = object2.optString("rtmp_url");
                object3 = object2.optString("rtmp_live");
                if (TextUtils.isEmpty((CharSequence)object)) return com.github.catvod.spider.merge.K.f.d("\u65e0\u53ef\u7528\u76f4\u64ad\u6d41");
                if (!TextUtils.isEmpty((CharSequence)object3)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append("/");
                    ((StringBuilder)object2).append((String)object3);
                    object = object2 = ((StringBuilder)object2).toString();
                    if (((String)object2).startsWith("//")) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("https:");
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                    }
                    object2 = ((String)object).replace("http://", "https://");
                    object = new HashMap();
                    ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                    ((HashMap)object).put("Referer", "https://www.douyu.com/");
                    ((HashMap)object).put("Origin", "https://www.douyu.com");
                    object3 = new f();
                    ((f)object3).w((String)object2);
                    ((f)object3).g((Map<String, String>)object);
                    return ((f)object3).toString();
                }
                return com.github.catvod.spider.merge.K.f.d("\u65e0\u53ef\u7528\u76f4\u64ad\u6d41");
            }
            catch (Exception exception) {
                object2 = com.github.catvod.spider.merge.C.a.c("\u64ad\u653e\u5931\u8d25: ");
                ((StringBuilder)object2).append(exception.getMessage());
                object = ((StringBuilder)object2).toString();
                return com.github.catvod.spider.merge.K.f.d((String)object);
            }
        }
        object = "\u5f53\u524d\u76f4\u64ad\u95f4\u672a\u5f00\u64ad";
        return com.github.catvod.spider.merge.K.f.d((String)object);
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, bl, "1");
    }

    /*
     * Unable to fully structure code
     */
    public String searchContent(String var1_1, boolean var2_2, String var3_3) {
        block10: {
            block9: {
                if (TextUtils.isEmpty((CharSequence)var3_3)) {
                    var3_3 = "1";
                }
                var1_1 = new JSONObject(com.github.catvod.spider.merge.f0.d.l(String.format(Locale.US, "https://www.douyu.com/japi/search/api/searchShow?kw=%s&page=%s&pageSize=20", new Object[]{URLEncoder.encode((String)var1_1, "UTF-8"), var3_3}), this.r(), null)).optJSONObject("data");
                var10_5 = new ArrayList<h>();
                var11_6 = com.github.catvod.spider.merge.i0.m.a;
                try {
                    var7_7 = Integer.parseInt(var3_3);
                }
                catch (Exception var3_4) {
                    var7_7 = 1;
                }
                var9_8 = 20;
                if (var1_1 == null) break block9;
                var5_9 = Math.max(var1_1.optInt("pgcnt", var1_1.optInt("pageCount", 1)), 1);
                var6_10 = var1_1.optInt("count", var1_1.optInt("total", 0));
                var15_11 = var1_1.optJSONArray("relateShow");
                if (var15_11 == null) ** GOTO lbl-1000
                for (var4_12 = 0; var4_12 < var15_11.length(); ++var4_12) {
                    var12_13 = var15_11.optJSONObject(var4_12);
                    if (var12_13 == null || TextUtils.isEmpty((CharSequence)(var11_6 = var12_13.optString("rid")))) continue;
                    var13_14 = com.github.catvod.spider.merge.i0.m.g(new String[]{var12_13.optString("roomName"), var12_13.optString("nickName")});
                    var3_3 = com.github.catvod.spider.merge.i0.m.g(new String[]{var12_13.optString("roomSrc"), var12_13.optString("avatar")});
                    var14_15 = com.github.catvod.spider.merge.i0.m.g(new String[]{var12_13.optString("hot"), var12_13.optString("cateName")});
                    var1_1 = var12_13.optInt("isLive", 0) == 1 ? com.github.catvod.spider.merge.C.a.c("\u76f4\u64ad \u00b7 ") : new StringBuilder();
                    var1_1.append(var12_13.optString("nickName"));
                    var1_1.append(" \u00b7 ");
                    var1_1.append(var14_15);
                    var10_5.add(new h((String)var11_6, var13_14, var3_3, var1_1.toString()));
                }
                if (20 < var15_11.length()) {
                    var4_12 = var15_11.length();
                } else lbl-1000:
                // 2 sources

                {
                    var4_12 = 20;
                }
                break block10;
            }
            var4_12 = 20;
            var6_10 = 0;
            var5_9 = 1;
        }
        var8_16 = var6_10;
        if (var6_10 <= 0) {
            var8_16 = Math.max(var5_9, 1);
            var6_10 = var10_5.isEmpty() != false ? var9_8 : var10_5.size();
            var8_16 = Math.max(var4_12, var6_10) * var8_16;
        }
        var6_10 = var5_9;
        if (var10_5.size() >= var4_12) {
            var6_10 = var5_9;
            if (var5_9 <= var7_7) {
                var6_10 = var7_7 + 1;
            }
        }
        var1_1 = new f();
        var1_1.y(var10_5);
        var1_1.k(var7_7, var6_10, Math.max(var4_12, 1), var8_16);
        return var1_1.toString();
    }
}

