/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.github.catvod.crawler.Spider
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Douban$6;
import com.github.catvod.spider.Douban$7;
import com.github.catvod.spider.Douban$8;
import com.github.catvod.spider.Douban$CategoryResult;
import com.github.catvod.spider.Douban$HomeSource;
import com.github.catvod.spider.Douban$MDoubanResult;
import com.github.catvod.spider.Douban$MUrlBuilder;
import com.github.catvod.spider.Douban$PageCache;
import com.github.catvod.spider.Douban$SubjectCache;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.K.b;
import com.github.catvod.spider.merge.K.c;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.f0.d;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Douban
extends Spider {
    private static final ExecutorService a = Executors.newCachedThreadPool();
    private static final Map<String, Douban$PageCache> b = new HashMap<String, Douban$PageCache>();
    private static final Map<String, Douban$SubjectCache> c = new HashMap<String, Douban$SubjectCache>();
    private static final Pattern d = Pattern.compile("(\\d{4})[-/.]\\d{1,2}[-/.]\\d{1,2}");
    private static final Pattern e = Pattern.compile("\\d{4}");
    private static final Pattern f = Pattern.compile("\\d{4}[-/.\u5e74]\\d{1,2}");
    private static final Pattern g = Pattern.compile("^(\\d{4})");
    private static final Pattern h = Pattern.compile("\\((\\d{4})\\)|\\[(\\d{4})\\]|[\\-\\s](\\d{4})[\\-\\s]|(\\d{4})\u5e74");

    private JSONObject A(String string) {
        block5: {
            HashMap<String, String> hashMap;
            block4: {
                hashMap = "?";
                try {
                    if (!string.contains("?")) break block4;
                    hashMap = "&";
                }
                catch (Exception exception) {
                    return null;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://frodo.douban.com/api/v2");
            stringBuilder.append(string);
            stringBuilder.append((String)((Object)hashMap));
            stringBuilder.append("apikey=");
            stringBuilder.append("0ac44ae016490db2204ce0a042db2916");
            string = stringBuilder.toString();
            hashMap = new HashMap<String, String>();
            hashMap.put("Host", "frodo.douban.com");
            hashMap.put("Connection", "Keep-Alive");
            hashMap.put("Referer", "https://servicewechat.com/wx2f9b06c1de1ccfca/84/page-frame.html");
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat");
            string = com.github.catvod.spider.merge.f0.d.l(string, hashMap, null);
            if (!com.github.catvod.spider.merge.R0.e.b(string)) break block5;
            return null;
        }
        string = new JSONObject(string);
        return string;
    }

    private String[][] B() {
        String[] stringArray = new String[]{"2020\u5e74\u4ee3", "2020\u5e74\u4ee3"};
        String[] stringArray2 = new String[]{"90\u5e74\u4ee3", "90\u5e74\u4ee3"};
        String[] stringArray3 = new String[]{"70\u5e74\u4ee3", "70\u5e74\u4ee3"};
        return new String[][]{{"\u5168\u90e8", ""}, {"2026", "2026"}, {"2025", "2025"}, {"2024", "2024"}, {"2023", "2023"}, {"2022", "2022"}, {"2021", "2021"}, {"2020", "2020"}, {"2019", "2019"}, stringArray, {"2010\u5e74\u4ee3", "2010\u5e74\u4ee3"}, {"2000\u5e74\u4ee3", "2000\u5e74\u4ee3"}, stringArray2, {"80\u5e74\u4ee3", "80\u5e74\u4ee3"}, stringArray3, {"60\u5e74\u4ee3", "60\u5e74\u4ee3"}, {"\u66f4\u65e9", "\u66f4\u65e9"}};
    }

    static /* bridge */ /* synthetic */ String a(Douban douban, JSONObject jSONObject) {
        return douban.o(jSONObject);
    }

    static /* bridge */ /* synthetic */ JSONObject b(Douban douban, String string) {
        return douban.A(string);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static JSONObject c(Douban object, String string, String string2) {
        void var0_3;
        Objects.requireNonNull(object);
        Object var0_1 = null;
        try {
            JSONObject jSONObject;
            String string3;
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            hashMap.put("Referer", string3);
            hashMap.put("Accept", "*/*");
            hashMap.put("Connection", "keep-alive");
            string3 = com.github.catvod.spider.merge.f0.d.l((String)jSONObject, hashMap, null);
            if (!com.github.catvod.spider.merge.R0.e.b(string3)) {
                JSONObject jSONObject2 = jSONObject = new JSONObject(string3);
            }
            return var0_3;
        }
        catch (Exception exception) {
            return var0_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static JSONObject d(Douban object, String string) {
        Objects.requireNonNull(object);
        if (com.github.catvod.spider.merge.R0.e.b(string)) return null;
        if (string.matches("\\d+")) {
            Douban$SubjectCache douban$SubjectCache;
            long l2 = System.currentTimeMillis();
            Map<String, Douban$SubjectCache> map = c;
            synchronized (map) {
                douban$SubjectCache = (Douban$SubjectCache)((HashMap)map).get(string);
                if (douban$SubjectCache != null && l2 - douban$SubjectCache.b < 21600000L) {
                    return douban$SubjectCache.a;
                }
            }
            douban$SubjectCache = object.A(com.github.catvod.spider.merge.B.e.c("/subject/", string));
            object = douban$SubjectCache;
            if (douban$SubjectCache == null) return object;
            synchronized (map) {
                object = new Douban$SubjectCache((JSONObject)douban$SubjectCache, l2);
                ((HashMap)map).put(string, (Douban$SubjectCache)object);
                return douban$SubjectCache;
            }
        }
        return null;
    }

    static /* bridge */ /* synthetic */ String e(String string) {
        return Douban.g(string);
    }

    private List<h> f() {
        ArrayList<Douban$HomeSource> arrayList = new ArrayList<Douban$HomeSource>();
        arrayList.add(new Douban$HomeSource("hot_movie"));
        arrayList.add(new Douban$HomeSource("hot_tv"));
        arrayList.add(new Douban$HomeSource("hot_show"));
        ArrayList<h> arrayList2 = new ArrayList<h>();
        HashSet<String> hashSet = new HashSet<String>();
        while (arrayList2.size() < 120) {
            int n2 = 0;
            for (int i2 = 0; i2 < 5; ++i2) {
                Object object;
                block13: {
                    int n3 = (new int[]{0, 0, 1, 1, 2})[i2];
                    if (n3 != 0) {
                        if (n3 != 1) {
                            int[] nArray = object = new int[3];
                            object[0] = 2;
                            nArray[1] = 0;
                            nArray[2] = 1;
                        } else {
                            int[] nArray = object = new int[3];
                            object[0] = 1;
                            nArray[1] = 0;
                            nArray[2] = 2;
                        }
                    } else {
                        int[] nArray = object = new int[3];
                        object[0] = 0;
                        nArray[1] = 1;
                        nArray[2] = 2;
                    }
                    int n4 = ((int[])object).length;
                    block2: for (n3 = 0; n3 < n4; ++n3) {
                        Douban$HomeSource douban$HomeSource = (Douban$HomeSource)arrayList.get(object[n3]);
                        block3: while (true) {
                            Object object2;
                            int n5;
                            if (((ArrayList)douban$HomeSource.b).size() - douban$HomeSource.d < 1 && !douban$HomeSource.g) {
                                if ((n5 = douban$HomeSource.e++) <= douban$HomeSource.f && (object2 = this.n(douban$HomeSource.a, n5, Collections.singletonMap("slug", "all"))) != null && !((ArrayList)((Douban$CategoryResult)object2).a).isEmpty()) {
                                    douban$HomeSource.f = ((Douban$CategoryResult)object2).c;
                                    Iterator iterator = ((ArrayList)((Douban$CategoryResult)object2).a).iterator();
                                    while (true) {
                                        if (!iterator.hasNext()) continue block3;
                                        object2 = (h)iterator.next();
                                        if (object2 == null || !((HashSet)douban$HomeSource.c).add(((h)object2).c())) continue;
                                        ((ArrayList)douban$HomeSource.b).add((h)object2);
                                    }
                                }
                                douban$HomeSource.g = true;
                            }
                            while (douban$HomeSource.d < ((ArrayList)douban$HomeSource.b).size()) {
                                object2 = douban$HomeSource.b;
                                n5 = douban$HomeSource.d;
                                douban$HomeSource.d = n5 + 1;
                                if ((object2 = (h)((ArrayList)object2).get(n5)) == null || hashSet.contains(((h)object2).c())) continue;
                                hashSet.add(((h)object2).c());
                                object = object2;
                                break block13;
                            }
                            if (douban$HomeSource.g) continue block2;
                        }
                    }
                    object = null;
                }
                if (object == null) {
                    return arrayList2;
                }
                arrayList2.add((h)object);
                ++n2;
                if (arrayList2.size() < 120) continue;
                return arrayList2;
            }
            if (n2 != 0) continue;
            return arrayList2;
        }
        return arrayList2;
    }

    private static String g(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        try {
            string = URLEncoder.encode(string2, "UTF-8").replace("+", "%20");
            return string;
        }
        catch (Exception exception) {
            return "";
        }
    }

    private String h(String object) {
        if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
            return "";
        }
        if (!((Matcher)(object = d.matcher((CharSequence)object))).find()) {
            return "";
        }
        String string = ((Matcher)object).group(1);
        Locale locale = Locale.US;
        return r.b(string, ".", String.format(locale, "%02d", Integer.parseInt(((Matcher)object).group(2))), ".", String.format(locale, "%02d", Integer.parseInt(((Matcher)object).group(3))));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private Map i(String object, int n2) {
        Object object2;
        HashMap<Object, String> hashMap = new HashMap<Object, String>();
        int n3 = !"hot_tv".equals(object) && !"hot_show".equals(object) ? 0 : 1;
        if (n3 == 0) {
            return hashMap;
        }
        object = "hot_show".equals(object) ? "show" : "tv";
        JSONObject jSONObject2 = new ArrayList();
        for (n3 = n2; n3 < n2 + 40; n3 += 20) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("https://m.douban.com/rexxar/api/v2/subject/recent_hot/tv?start=");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append("&limit=");
            ((StringBuilder)object2).append(20);
            ((StringBuilder)object2).append("&category=");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("&type=");
            ((StringBuilder)object2).append((String)object);
            jSONObject2.add(((StringBuilder)object2).toString());
        }
        object = new ArrayList();
        for (JSONObject jSONObject2 : jSONObject2) {
            ((ArrayList)object).add(a.submit(new Douban$8(this, (String)jSONObject2)));
        }
        jSONObject2 = new ArrayList();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            object2 = (Future)object.next();
            try {
                jSONObject2.add((JSONObject)object2.get());
            }
            catch (Exception exception) {
                jSONObject2.add(null);
            }
        }
        for (JSONObject jSONObject2 : jSONObject2) {
            if (jSONObject2 == null || (jSONObject2 = jSONObject2.optJSONArray("items")) == null) continue;
            for (n2 = 0; n2 < jSONObject2.length(); ++n2) {
                Object object3 = jSONObject2.optJSONObject(n2);
                if (object3 == null) continue;
                object2 = object3.optString("id");
                object3 = object3.optString("episodes_info");
                if (!com.github.catvod.spider.merge.R0.e.d((CharSequence)object2) || !com.github.catvod.spider.merge.R0.e.d((CharSequence)object3)) continue;
                hashMap.put(object2, ((String)object3).trim());
            }
        }
        return hashMap;
    }

    private Douban$MDoubanResult j(Douban$MUrlBuilder object, int n2, String iterator) {
        int n3;
        int n4 = (int)Math.ceil((double)40 / 20.0);
        Object object2 = new ArrayList<String>();
        for (n3 = 0; n3 < n4; ++n3) {
            ((ArrayList)object2).add(object.build(n3 * 20 + n2, 20));
        }
        object = new ArrayList();
        JSONArray jSONArray = ((ArrayList)object2).iterator();
        while (jSONArray.hasNext()) {
            object2 = (String)jSONArray.next();
            ((ArrayList)object).add(a.submit(new Douban$7(this, (String)object2, (String)((Object)iterator))));
        }
        iterator = new ArrayList();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            object2 = (Future)object.next();
            try {
                ((ArrayList)((Object)iterator)).add((JSONObject)object2.get());
            }
            catch (Exception exception) {
                ((ArrayList)((Object)iterator)).add(null);
            }
        }
        object = new ArrayList();
        iterator = ((ArrayList)((Object)iterator)).iterator();
        n2 = 0;
        while (iterator.hasNext()) {
            object2 = (JSONObject)iterator.next();
            if (object2 == null) continue;
            jSONArray = object2.optJSONArray("items");
            if (jSONArray != null) {
                for (n3 = 0; n3 < jSONArray.length(); ++n3) {
                    ((ArrayList)object).add(jSONArray.optJSONObject(n3));
                }
            }
            n2 = Math.max(n2, Math.max(object2.optInt("total", 0), object2.optInt("count", 0)));
        }
        return new Douban$MDoubanResult((List<JSONObject>)object, n2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<JSONObject> k(String var1_1, int var2_3, Map<String, String> var3_4, Douban$MUrlBuilder var4_5, String var5_6) {
        var7_7 = new ArrayList<JSONObject>();
        if (var4_5 == null) ** GOTO lbl7
        try {
            var7_7.addAll(this.j(var4_5, (int)var2_3, (String)var5_6).a);
            return var7_7;
lbl7:
            // 1 sources

            var6_8 = "anime".equals(var1_1);
            if (var6_8) {
                var1_1 = Douban.t((Map<String, String>)var3_4, new String[]{"\u7c7b\u578b", "\u5730\u533a", "\u5e74\u4ee3", "\u5e73\u53f0"}, "\u52a8\u753b");
                var4_5 = (String)var3_4.get("sort");
                var3_4 = new StringBuilder();
                var3_4.append("/tv/recommend?tags=");
                var3_4.append(Douban.g((String)var1_1));
                var3_4.append("&sort=");
                var3_4.append((String)var4_5);
                var3_4.append("&start=");
                var3_4.append(var2_3);
                var3_4.append("&count=");
                var3_4.append(40);
                var1_1 = this.A(var3_4.toString());
                if (var1_1 == null) return var7_7;
                if ((var1_1 = var1_1.optJSONArray("items")) == null) return var7_7;
                var2_3 = 0;
                while (var2_3 < var1_1.length()) {
                    var7_7.add(var1_1.optJSONObject(var2_3));
                    ++var2_3;
                }
                return var7_7;
            }
        }
        catch (Exception var1_2) {
            return var7_7;
        }
        {
            if (!"show_filter".equals(var1_1)) ** GOTO lbl-1000
            var1_1 = Douban.t((Map<String, String>)var3_4, new String[]{"\u7c7b\u578b", "\u5730\u533a", "\u5e74\u4ee3"}, "\u7efc\u827a");
            var3_4 = (String)var3_4.get("sort");
            var4_5 = new Iterator<String>();
            var4_5.append("/tv/recommend?tags=");
            var4_5.append(Douban.g((String)var1_1));
            var4_5.append("&sort=");
            var4_5.append((String)var3_4);
            var4_5.append("&start=");
            var4_5.append(var2_3);
            var4_5.append("&count=");
            var4_5.append(40);
            var1_1 = this.A(var4_5.toString());
            if (var1_1 == null) return var7_7;
            if ((var1_1 = var1_1.optJSONArray("items")) == null) return var7_7;
            var2_3 = 0;
            while (var2_3 < var1_1.length()) {
                var7_7.add(var1_1.optJSONObject(var2_3));
                ++var2_3;
            }
            return var7_7;
        }
lbl-1000:
        // 1 sources

        {
            var6_8 = "top_250".equals(var1_1);
            if (!var6_8) ** GOTO lbl-1000
            var1_1 = new StringBuilder();
            var1_1.append("/subject_collection/movie_top250/items?start=");
            var1_1.append(var2_3);
            var1_1.append("&count=");
            var1_1.append(40);
            var4_5 = this.A(var1_1.toString());
            if (var4_5 == null) return var7_7;
            var1_1 = var3_4 = var4_5.optJSONArray("subject_collection_items");
            if (var3_4 == null) {
                var1_1 = var4_5.optJSONArray("items");
            }
            if (var1_1 == null) return var7_7;
            var2_3 = 0;
            while (var2_3 < var1_1.length()) {
                var7_7.add(var1_1.optJSONObject(var2_3));
                ++var2_3;
            }
            return var7_7;
        }
lbl-1000:
        // 1 sources

        {
            if (!"hot_movie".equals(var1_1) && !"hot_tv".equals(var1_1)) {
                if ("hot_show".equals(var1_1) == false) return var7_7;
            }
            if (!(var6_8 = "all".equals(var3_4 = (String)var3_4.get("slug")))) ** GOTO lbl-1000
            var3_4 = new ArrayList();
            for (String var5_6 : this.r((String)var1_1)) {
                var1_1 = new StringBuilder();
                var1_1.append("/subject_collection/");
                var1_1.append(var5_6);
                var1_1.append("/items?start=");
                var1_1.append(var2_3);
                var1_1.append("&count=");
                var1_1.append(40);
                var3_4.add(var1_1.toString());
            }
            var4_5 = ((ArrayList)this.z((List<String>)var3_4)).iterator();
            block10: while (true) {
                if (var4_5.hasNext() == false) return var7_7;
                var5_6 = (JSONObject)var4_5.next();
                if (var5_6 == null) continue;
                var1_1 = var3_4 = var5_6.optJSONArray("subject_collection_items");
                if (var3_4 == null) {
                    var1_1 = var5_6.optJSONArray("items");
                }
                if (var1_1 == null) continue;
                var2_3 = 0;
                while (true) {
                    if (var2_3 < var1_1.length()) ** break;
                    continue block10;
                    var7_7.add(var1_1.optJSONObject(var2_3));
                    ++var2_3;
                }
                break;
            }
        }
lbl-1000:
        // 1 sources

        {
            var1_1 = new StringBuilder();
            var1_1.append("/subject_collection/");
            var1_1.append((String)var3_4);
            var1_1.append("/items?start=");
            var1_1.append(var2_3);
            var1_1.append("&count=");
            var1_1.append(40);
            var4_5 = this.A(var1_1.toString());
            if (var4_5 == null) return var7_7;
            var1_1 = var3_4 = var4_5.optJSONArray("subject_collection_items");
            if (var3_4 == null) {
                var1_1 = var4_5.optJSONArray("items");
            }
            if (var1_1 == null) return var7_7;
            var2_3 = 0;
            while (var2_3 < var1_1.length()) {
                var7_7.add(var1_1.optJSONObject(var2_3));
                ++var2_3;
            }
            return var7_7;
        }
    }

    private c l(String string, String string2, String[][] stringArray) {
        ArrayList<b> arrayList = new ArrayList<b>();
        for (String[] stringArray2 : stringArray) {
            arrayList.add(new b(stringArray2[0], stringArray2[1]));
        }
        return new c(string, string2, arrayList);
    }

    private static String m(String ... stringArray) {
        for (String string : stringArray) {
            if (!com.github.catvod.spider.merge.R0.e.d(string)) continue;
            return string;
        }
        return "";
    }

    /*
     * Exception decompiling
     */
    private Douban$CategoryResult n(String var1_1, int var2_4, Map<String, String> var3_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 40[TRYBLOCK] [72 : 2996->2998)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private String o(JSONObject object) {
        Object object2 = object.optJSONObject("subject");
        object2 = object2 != null ? object2.optString("id") : "";
        object = object.optString("id");
        if (((String)object2).matches("\\d+")) {
            return ((String)object2).trim();
        }
        if (((String)object).matches("\\d+")) {
            return ((String)object).trim();
        }
        return "";
    }

    private boolean p(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.optJSONObject("subject");
        if (com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("episodes_info"))) {
            return true;
        }
        if (com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("episodes_count"))) {
            return true;
        }
        if (com.github.catvod.spider.merge.R0.e.d(jSONObject.optString("current_episode"))) {
            return true;
        }
        if (jSONObject2 != null) {
            if (com.github.catvod.spider.merge.R0.e.d(jSONObject2.optString("episodes_info"))) {
                return true;
            }
            if (com.github.catvod.spider.merge.R0.e.d(jSONObject2.optString("episodes_count"))) {
                return true;
            }
        }
        return false;
    }

    private boolean q(JSONObject jSONObject) {
        Object object = jSONObject.optJSONObject("subject");
        boolean bl = false;
        object = object != null ? Douban.m(object.optString("pubdate"), object.optString("release_date")) : "";
        Object object2 = object;
        if (com.github.catvod.spider.merge.R0.e.b((CharSequence)object)) {
            object2 = Douban.m(jSONObject.optString("pubdate"), jSONObject.optString("release_date"));
        }
        boolean bl2 = bl;
        if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object2)) {
            bl2 = bl;
            if (f.matcher((CharSequence)object2).find()) {
                bl2 = true;
            }
        }
        return bl2;
    }

    private List<String> r(String string) {
        if ("hot_movie".equals(string)) {
            return Arrays.asList("movie_real_time_hotest", "movie_weekly_best");
        }
        if ("hot_tv".equals(string)) {
            return Arrays.asList("tv_real_time_hotest", "tv_chinese_best_weekly", "tv_global_best_weekly");
        }
        return Arrays.asList("tv_variety_show", "show_chinese_best_weekly");
    }

    private static String s(String ... stringArray) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : stringArray) {
            if (!com.github.catvod.spider.merge.R0.e.d(string)) continue;
            arrayList.add(string);
        }
        return com.github.catvod.spider.merge.R0.e.f(arrayList);
    }

    private static String t(Map<String, String> map, String[] stringArray, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = map.get(stringArray[i2]);
            if (!com.github.catvod.spider.merge.R0.e.d(string2)) continue;
            arrayList.add(string2);
        }
        arrayList.add(string);
        return com.github.catvod.spider.merge.R0.e.f(arrayList);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private h u(JSONObject var1_1, int var2_3) {
        try {
            var14_4 = var1_1 /* !! */ .optJSONObject("subject");
            var8_5 = var1_1 /* !! */ .optString("title");
            var12_6 = "";
            var7_7 = var14_4 != null ? var14_4.optString("title") : "";
            var13_8 = Douban.m(new String[]{var8_5, var7_7, "\u672a\u77e5"});
            if (com.github.catvod.spider.merge.R0.e.b(this.o(var1_1 /* !! */ ))) {
                return null;
            }
            var7_7 = var1_1 /* !! */ .optJSONObject("rating");
            var10_9 = var7_7;
            if (var7_7 == null) {
                var10_9 = var7_7;
                if (var14_4 != null) {
                    var10_9 = var14_4.optJSONObject("rating");
                }
            }
            var7_7 = var8_5 = var1_1 /* !! */ .optJSONObject("cover");
            if (var8_5 == null) {
                var7_7 = var1_1 /* !! */ .optJSONObject("pic");
            }
            var8_5 = var7_7;
            if (var7_7 == null) {
                var8_5 = var7_7;
                if (var14_4 != null) {
                    var8_5 = var14_4.optJSONObject("pic");
                }
            }
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)(var7_7 = var8_5 == null ? "" : Douban.m(new String[]{var8_5.optString("url"), var8_5.optString("normal")})))) {
                return null;
            }
            var15_10 = var7_7.replaceAll("img\\d\\.doubanio\\.com", "img1.doubanio.com");
            if (var14_4 == null) ** GOTO lbl-1000
            if (com.github.catvod.spider.merge.R0.e.d(var14_4.optString("pubdate"))) {
                var8_5 = var14_4.optString("pubdate");
lbl29:
                // 2 sources

                while (true) {
                    var7_7 = "";
                    break;
                }
            } else {
                if (com.github.catvod.spider.merge.R0.e.d(var14_4.optString("release_date"))) {
                    var8_5 = var14_4.optString("release_date");
                    ** continue;
                }
                if (com.github.catvod.spider.merge.R0.e.d(var14_4.optString("year"))) {
                    var7_7 = var14_4.optString("year");
                    var8_5 = "";
                } else lbl-1000:
                // 2 sources

                {
                    var8_5 = "";
                    var7_7 = "";
                }
            }
            var9_11 = var8_5;
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)var8_5)) {
                var9_11 = var1_1 /* !! */ .optString("pubdate");
            }
            var11_12 = var9_11;
            if (com.github.catvod.spider.merge.R0.e.b(var9_11)) {
                var11_12 = var1_1 /* !! */ .optString("release_date");
            }
            var8_5 = var7_7;
            if (com.github.catvod.spider.merge.R0.e.b(var11_12)) {
                var8_5 = var7_7;
                if (com.github.catvod.spider.merge.R0.e.b((CharSequence)var7_7)) {
                    var8_5 = var1_1 /* !! */ .optString("year");
                }
            }
            var9_11 = var8_5;
            if (!com.github.catvod.spider.merge.R0.e.b(var11_12)) ** GOTO lbl-1000
            var9_11 = var8_5;
            if (!com.github.catvod.spider.merge.R0.e.b((CharSequence)var8_5)) ** GOTO lbl-1000
            var7_7 = Douban.h.matcher(var13_8);
            var9_11 = var8_5;
            if (!var7_7.find()) ** GOTO lbl-1000
            var5_13 = 1;
            while (true) {
                block31: {
                    var9_11 = var8_5;
                    if (var5_13 > 4) break;
                    if (var7_7.group(var5_13) == null) break block31;
                    var9_11 = var7_7.group(var5_13);
                    break;
                }
                ++var5_13;
            }
        }
        catch (Exception var1_2) {
            return null;
        }
lbl-1000:
        // 5 sources

        {
            var16_14 = Douban.e;
            var7_7 = var16_14.matcher(var11_12);
            var8_5 = var12_6;
            if (var7_7.find()) {
                var8_5 = var7_7.group();
            }
            var7_7 = var8_5;
            if (var8_5.isEmpty()) {
                var12_6 = var16_14.matcher(var9_11);
                var7_7 = var8_5;
                if (var12_6.find()) {
                    var7_7 = var12_6.group();
                }
            }
            var12_6 = var7_7;
            if (var2_3 == 1) {
                var11_12 = this.h(var11_12);
                var8_5 = var11_12;
                if (var11_12.isEmpty()) {
                    var8_5 = this.h(var9_11);
                }
                var12_6 = var7_7;
                if (!var8_5.isEmpty()) {
                    var12_6 = var8_5;
                }
            }
            var7_7 = var8_5 = "0";
            if (var10_9 == null) ** GOTO lbl99
            var7_7 = var8_5;
            if (!var10_9.has("value")) ** GOTO lbl99
            var3_15 = var10_9.optDouble("value", 0.0);
            var7_7 = var8_5;
        }
        if (!(var3_15 > 0.0)) ** GOTO lbl99
        {
            var7_7 = String.format(Locale.US, "%.1f", new Object[]{var3_15});
lbl99:
            // 4 sources

            if (var6_16 = var12_6.isEmpty()) {
                var8_5 = new StringBuilder();
                var8_5.append((String)var7_7);
                var7_7 = var8_5;
            } else {
                var8_5 = new StringBuilder();
                var8_5.append((String)var12_6);
                var8_5.append(" / ");
                var8_5.append((String)var7_7);
                var7_7 = var8_5;
            }
            var7_7.append("\u5206");
            var7_7 = var7_7.toString();
            var9_11 = this.y(var1_1 /* !! */ , var14_4);
            var8_5 = var1_1 /* !! */ .optString("card_subtitle");
            var1_1 /* !! */  = var8_5;
            if (com.github.catvod.spider.merge.R0.e.b((CharSequence)var8_5)) {
                var1_1 /* !! */  = var7_7;
            }
            var8_5 = new StringBuilder();
            var8_5.append(var15_10);
            var8_5.append("@Referer=https://api.douban.com/@User-Agent=");
            var8_5.append("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            var11_12 = var8_5.toString();
            var10_9 = new StringBuilder();
            var10_9.append(var13_8);
            var10_9.append("%%");
            var10_9.append((String)var1_1 /* !! */ );
            var8_5 = new h(var10_9.toString(), var13_8, var11_12, (String)var7_7);
            var8_5.s(var9_11);
            return var8_5;
        }
    }

    private void v(JSONObject jSONObject, List<JSONObject> list, Set<String> set) {
        JSONArray jSONArray;
        JSONArray jSONArray2 = jSONArray = jSONObject.optJSONArray("subject_collection_items");
        if (jSONArray == null) {
            jSONArray2 = jSONObject.optJSONArray("items");
        }
        this.x(jSONArray2, list, set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(List<JSONObject> list, Set<String> set, List<JSONObject> jSONObject) {
        Iterator iterator = jSONObject.iterator();
        while (iterator.hasNext()) {
            Object object;
            jSONObject = (JSONObject)iterator.next();
            if (jSONObject == null || com.github.catvod.spider.merge.R0.e.b((CharSequence)(object = this.o(jSONObject))) || !set.add((String)object)) continue;
            try {
                object = jSONObject.optJSONObject("pic");
                if (object != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("url", (Object)Douban.m(object.optString("large"), object.optString("normal")));
                    jSONObject2.put("normal", (Object)object.optString("normal"));
                    jSONObject.put("pic", (Object)jSONObject2);
                }
                if (((Matcher)(object = g.matcher(jSONObject.optString("card_subtitle")))).find()) {
                    jSONObject.put("year", (Object)((Matcher)object).group(1));
                }
                jSONObject.put("_fromMDouban", true);
            }
            catch (Exception exception) {}
            list.add(jSONObject);
        }
        return;
    }

    private void x(JSONArray jSONArray, List<JSONObject> list, Set<String> set) {
        if (jSONArray == null) {
            return;
        }
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            String string;
            JSONObject jSONObject = jSONArray.optJSONObject(i2);
            if (jSONObject == null || com.github.catvod.spider.merge.R0.e.b(string = this.o(jSONObject)) || !set.add(string)) continue;
            list.add(jSONObject);
        }
    }

    private String y(JSONObject object, JSONObject jSONObject) {
        String string;
        String string2 = string = object.optString("episodes_info");
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            string2 = string;
            if (jSONObject != null) {
                string2 = jSONObject.optString("episodes_info");
            }
        }
        if (com.github.catvod.spider.merge.R0.e.d(string2)) {
            return string2.trim().replaceAll("\u66f4\u65b0\u81f3\u7b2c(\\d+)\u96c6", "\u66f4\u65b0\u81f3$1\u96c6").replaceAll("\u5171(\\d+)\u96c6", "\u5168$1\u96c6").replaceAll("(\\d+)\u96c6\u5168", "\u5168$1\u96c6");
        }
        string2 = string = object.optString("episodes_count");
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            string2 = string;
            if (jSONObject != null) {
                string2 = jSONObject.optString("episodes_count");
            }
        }
        string = object.optString("current_episode");
        object = string;
        if (com.github.catvod.spider.merge.R0.e.b(string)) {
            object = string;
            if (jSONObject != null) {
                object = jSONObject.optString("current_episode");
            }
        }
        if (com.github.catvod.spider.merge.R0.e.d((CharSequence)object)) {
            return s.a("\u66f4\u65b0\u81f3", (String)object, "\u96c6");
        }
        if (com.github.catvod.spider.merge.R0.e.d(string2)) {
            return s.a("\u5168", string2, "\u96c6");
        }
        return "";
    }

    private List<JSONObject> z(List<String> arrayList) {
        Object object = new ArrayList<Future<JSONObject>>();
        for (String object2 : arrayList) {
            ((ArrayList)object).add(a.submit(new Douban$6(this, object2)));
        }
        arrayList = new ArrayList<JSONObject>();
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            Future future = (Future)object.next();
            try {
                arrayList.add((JSONObject)future.get());
            }
            catch (Exception exception) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> hashMap) {
        int n2;
        try {
            n2 = Integer.parseInt((String)object2);
        }
        catch (Exception exception) {
            n2 = 1;
        }
        object2 = hashMap;
        if (hashMap == null) {
            object2 = new HashMap<String, String>();
        }
        object2 = this.n((String)object, n2, (Map<String, String>)object2);
        object = new f();
        ((f)object).y(((Douban$CategoryResult)object2).a);
        ((f)object).k(n2, Math.max(1, ((Douban$CategoryResult)object2).c), 40, ((Douban$CategoryResult)object2).b);
        return ((f)object).toString();
    }

    public String homeContent(boolean bl) {
        List<h> list;
        ArrayList<a> arrayList = new ArrayList<a>();
        arrayList.add(new a("movie", "\u9009\u7535\u5f71"));
        arrayList.add(new a("tv", "\u9009\u5267\u96c6"));
        arrayList.add(new a("show", "\u9009\u7efc\u827a"));
        arrayList.add(new a("anime", "\u52a8\u6f2b\u5267\u96c6"));
        arrayList.add(new a("movie_filter", "\u7535\u5f71\u7b5b\u9009"));
        arrayList.add(new a("tv_filter", "\u7535\u89c6\u5267\u7b5b\u9009"));
        arrayList.add(new a("show_filter", "\u7efc\u827a\u7b5b\u9009"));
        arrayList.add(new a("top_250", "\u7535\u5f71Top250"));
        try {
            list = this.f();
        }
        catch (Exception exception) {
            list = new ArrayList<h>();
        }
        if (bl) {
            LinkedHashMap<String, List<c>> linkedHashMap = new LinkedHashMap<String, List<c>>();
            Object object = new String[]{"\u6700\u65b0", "\u6700\u65b0"};
            ((AbstractMap)linkedHashMap).put("movie", Arrays.asList(this.l("category", "\u7c7b\u578b", new String[][]{{"\u70ed\u95e8", "\u70ed\u95e8"}, object, {"\u8c46\u74e3\u9ad8\u5206", "\u8c46\u74e3\u9ad8\u5206"}, {"\u51b7\u95e8\u4f73\u7247", "\u51b7\u95e8\u4f73\u7247"}}), this.l("type", "\u5730\u533a", new String[][]{{"\u5168\u90e8", "\u5168\u90e8"}, {"\u534e\u8bed", "\u534e\u8bed"}, {"\u6b27\u7f8e", "\u6b27\u7f8e"}, {"\u97e9\u56fd", "\u97e9\u56fd"}, {"\u65e5\u672c", "\u65e5\u672c"}})));
            ((AbstractMap)linkedHashMap).put("tv", Arrays.asList(this.l("type", "\u7c7b\u578b", new String[][]{{"\u7efc\u5408", "tv"}, {"\u56fd\u4ea7\u5267", "tv_domestic"}, {"\u6b27\u7f8e\u5267", "tv_american"}, {"\u65e5\u5267", "tv_japanese"}, {"\u97e9\u5267", "tv_korean"}, {"\u52a8\u6f2b", "tv_animation"}, {"\u7eaa\u5f55\u7247", "tv_documentary"}})));
            object = new String[]{"\u56fd\u5185", "show_domestic"};
            ((AbstractMap)linkedHashMap).put("show", Arrays.asList(this.l("type", "\u7c7b\u578b", new String[][]{{"\u7efc\u5408", "show"}, object, {"\u56fd\u5916", "show_foreign"}})));
            object = new String[]{"\u5168\u90e8\u7c7b\u578b", ""};
            Object object2 = new String[]{"\u65e5\u672c\u52a8\u753b", "\u65e5\u672c\u52a8\u753b"};
            Object object3 = new String[]{"\u56fd\u4ea7\u52a8\u753b", "\u56fd\u4ea7\u52a8\u753b"};
            Object object4 = new String[]{"\u5267\u573a\u7248", "\u5267\u573a\u7248"};
            object2 = this.l("\u7c7b\u578b", "\u7c7b\u578b", new String[][]{object, {"\u52a8\u753b", "\u52a8\u753b"}, object2, object3, {"\u6b27\u7f8e\u52a8\u753b", "\u6b27\u7f8e\u52a8\u753b"}, object4, {"\u756a\u5267", "\u756a\u5267"}});
            object = this.l("\u5730\u533a", "\u5730\u533a", new String[][]{{"\u5168\u90e8\u5730\u533a", ""}, {"\u65e5\u672c", "\u65e5\u672c"}, {"\u4e2d\u56fd\u5927\u9646", "\u4e2d\u56fd\u5927\u9646"}, {"\u7f8e\u56fd", "\u7f8e\u56fd"}, {"\u6b27\u7f8e", "\u6b27\u7f8e"}});
            object4 = new String[]{"2022", "2022"};
            object3 = new String[]{"2010\u5e74\u4ee3", "2010\u5e74\u4ee3"};
            ((AbstractMap)linkedHashMap).put("anime", Arrays.asList(object2, object, this.l("\u5e74\u4ee3", "\u5e74\u4ee3", new String[][]{{"\u5168\u90e8\u5e74\u4ee3", ""}, {"2026", "2026"}, {"2025", "2025"}, {"2024", "2024"}, {"2023", "2023"}, object4, {"2021", "2021"}, {"2020", "2020"}, object3}), this.l("sort", "\u6392\u5e8f", new String[][]{{"\u8fd1\u671f\u70ed\u5ea6", "U"}, {"\u7efc\u5408\u6392\u5e8f", "T"}, {"\u9996\u64ad\u65f6\u95f4", "R"}, {"\u9ad8\u5206\u4f18\u5148", "S"}})));
            String[] stringArray = new String[]{"\u559c\u5267", "\u559c\u5267"};
            String[] stringArray2 = new String[]{"\u7231\u60c5", "\u7231\u60c5"};
            String[] stringArray3 = new String[]{"\u72af\u7f6a", "\u72af\u7f6a"};
            String[] stringArray4 = new String[]{"\u5192\u9669", "\u5192\u9669"};
            object4 = new String[]{"\u6218\u4e89", "\u6218\u4e89"};
            object = new String[]{"\u4f20\u8bb0", "\u4f20\u8bb0"};
            object2 = new String[]{"\u6b4c\u821e", "\u6b4c\u821e"};
            object3 = new String[]{"\u60c5\u8272", "\u60c5\u8272"};
            Object object5 = new String[]{"\u897f\u90e8", "\u897f\u90e8"};
            object = this.l("genre", "\u7c7b\u578b", new String[][]{{"\u5168\u90e8", ""}, stringArray, stringArray2, {"\u52a8\u4f5c", "\u52a8\u4f5c"}, {"\u79d1\u5e7b", "\u79d1\u5e7b"}, {"\u52a8\u753b", "\u52a8\u753b"}, {"\u60ac\u7591", "\u60ac\u7591"}, stringArray3, {"\u60ca\u609a", "\u60ca\u609a"}, stringArray4, {"\u97f3\u4e50", "\u97f3\u4e50"}, {"\u5386\u53f2", "\u5386\u53f2"}, {"\u5947\u5e7b", "\u5947\u5e7b"}, {"\u6050\u6016", "\u6050\u6016"}, object4, object, object2, {"\u6b66\u4fa0", "\u6b66\u4fa0"}, object3, {"\u707e\u96be", "\u707e\u96be"}, object5, {"\u7eaa\u5f55\u7247", "\u7eaa\u5f55\u7247"}, {"\u77ed\u7247", "\u77ed\u7247"}});
            object4 = new String[]{"\u5168\u90e8", ""};
            object3 = new String[]{"\u97e9\u56fd", "\u97e9\u56fd"};
            object5 = new String[]{"\u4e2d\u56fd\u53f0\u6e7e", "\u4e2d\u56fd\u53f0\u6e7e"};
            stringArray4 = new String[]{"\u897f\u73ed\u7259", "\u897f\u73ed\u7259"};
            stringArray2 = new String[]{"\u5370\u5ea6", "\u5370\u5ea6"};
            object2 = new String[]{"\u4fc4\u7f57\u65af", "\u4fc4\u7f57\u65af"};
            object2 = this.l("region", "\u5730\u533a", new String[][]{object4, {"\u534e\u8bed", "\u534e\u8bed"}, {"\u6b27\u7f8e", "\u6b27\u7f8e"}, object3, {"\u65e5\u672c", "\u65e5\u672c"}, {"\u4e2d\u56fd\u5927\u9646", "\u4e2d\u56fd\u5927\u9646"}, {"\u7f8e\u56fd", "\u7f8e\u56fd"}, {"\u4e2d\u56fd\u9999\u6e2f", "\u4e2d\u56fd\u9999\u6e2f"}, object5, {"\u82f1\u56fd", "\u82f1\u56fd"}, {"\u6cd5\u56fd", "\u6cd5\u56fd"}, {"\u5fb7\u56fd", "\u5fb7\u56fd"}, {"\u610f\u5927\u5229", "\u610f\u5927\u5229"}, stringArray4, stringArray2, {"\u6cf0\u56fd", "\u6cf0\u56fd"}, object2, {"\u52a0\u62ff\u5927", "\u52a0\u62ff\u5927"}, {"\u6fb3\u5927\u5229\u4e9a", "\u6fb3\u5927\u5229\u4e9a"}, {"\u7231\u5c14\u5170", "\u7231\u5c14\u5170"}, {"\u745e\u5178", "\u745e\u5178"}, {"\u5df4\u897f", "\u5df4\u897f"}, {"\u4e39\u9ea6", "\u4e39\u9ea6"}});
            object3 = this.l("year", "\u5e74\u4ee3", this.B());
            object5 = new String[]{"\u8bc4\u5206", "S"};
            object4 = new String[]{"\u65f6\u95f4", "R"};
            ((AbstractMap)linkedHashMap).put("movie_filter", Arrays.asList(object, object2, object3, this.l("sort", "\u6392\u5e8f", new String[][]{{"\u70ed\u5ea6", "U"}, object5, object4})));
            object5 = new String[]{"\u559c\u5267", "\u559c\u5267"};
            String[] stringArray5 = new String[]{"\u7231\u60c5", "\u7231\u60c5"};
            String[] stringArray6 = new String[]{"\u60ac\u7591", "\u60ac\u7591"};
            object = new String[]{"\u52a8\u753b", "\u52a8\u753b"};
            Object object6 = new String[]{"\u5bb6\u5ead", "\u5bb6\u5ead"};
            stringArray3 = new String[]{"\u79d1\u5e7b", "\u79d1\u5e7b"};
            stringArray4 = new String[]{"\u6050\u6016", "\u6050\u6016"};
            String[] stringArray7 = new String[]{"\u5386\u53f2", "\u5386\u53f2"};
            stringArray = new String[]{"\u6218\u4e89", "\u6218\u4e89"};
            object3 = new String[]{"\u5192\u9669", "\u5192\u9669"};
            stringArray2 = new String[]{"\u4f20\u8bb0", "\u4f20\u8bb0"};
            String[] stringArray8 = new String[]{"\u5267\u60c5", "\u5267\u60c5"};
            object2 = new String[]{"\u5947\u5e7b", "\u5947\u5e7b"};
            object4 = new String[]{"\u707e\u96be", "\u707e\u96be"};
            String[] stringArray9 = new String[]{"\u97f3\u4e50", "\u97f3\u4e50"};
            object = this.l("genre", "\u7c7b\u578b", new String[][]{{"\u5168\u90e8", ""}, object5, stringArray5, stringArray6, object, {"\u6b66\u4fa0", "\u6b66\u4fa0"}, {"\u53e4\u88c5", "\u53e4\u88c5"}, object6, {"\u72af\u7f6a", "\u72af\u7f6a"}, stringArray3, stringArray4, stringArray7, stringArray, {"\u52a8\u4f5c", "\u52a8\u4f5c"}, object3, stringArray2, stringArray8, object2, {"\u60ca\u609a", "\u60ca\u609a"}, object4, {"\u6b4c\u821e", "\u6b4c\u821e"}, stringArray9});
            String[] stringArray10 = new String[]{"\u5168\u90e8", ""};
            String[] stringArray11 = new String[]{"\u534e\u8bed", "\u534e\u8bed"};
            stringArray9 = new String[]{"\u6b27\u7f8e", "\u6b27\u7f8e"};
            object5 = new String[]{"\u56fd\u5916", "\u56fd\u5916"};
            String[] stringArray12 = new String[]{"\u97e9\u56fd", "\u97e9\u56fd"};
            String[] stringArray13 = new String[]{"\u65e5\u672c", "\u65e5\u672c"};
            object2 = new String[]{"\u4e2d\u56fd\u5927\u9646", "\u4e2d\u56fd\u5927\u9646"};
            object3 = new String[]{"\u4e2d\u56fd\u9999\u6e2f", "\u4e2d\u56fd\u9999\u6e2f"};
            String[] stringArray14 = new String[]{"\u82f1\u56fd", "\u82f1\u56fd"};
            stringArray5 = new String[]{"\u6cf0\u56fd", "\u6cf0\u56fd"};
            stringArray6 = new String[]{"\u4e2d\u56fd\u53f0\u6e7e", "\u4e2d\u56fd\u53f0\u6e7e"};
            stringArray2 = new String[]{"\u6cd5\u56fd", "\u6cd5\u56fd"};
            String[] stringArray15 = new String[]{"\u5fb7\u56fd", "\u5fb7\u56fd"};
            String[] stringArray16 = new String[]{"\u897f\u73ed\u7259", "\u897f\u73ed\u7259"};
            stringArray = new String[]{"\u4fc4\u7f57\u65af", "\u4fc4\u7f57\u65af"};
            stringArray4 = new String[]{"\u745e\u5178", "\u745e\u5178"};
            String[] stringArray17 = new String[]{"\u5df4\u897f", "\u5df4\u897f"};
            object4 = new String[]{"\u4e39\u9ea6", "\u4e39\u9ea6"};
            stringArray7 = new String[]{"\u5370\u5ea6", "\u5370\u5ea6"};
            stringArray8 = new String[]{"\u52a0\u62ff\u5927", "\u52a0\u62ff\u5927"};
            object6 = new String[]{"\u7231\u5c14\u5170", "\u7231\u5c14\u5170"};
            stringArray3 = new String[]{"\u6fb3\u5927\u5229\u4e9a", "\u6fb3\u5927\u5229\u4e9a"};
            object6 = this.l("region", "\u5730\u533a", new String[][]{stringArray10, stringArray11, stringArray9, object5, stringArray12, stringArray13, object2, object3, {"\u7f8e\u56fd", "\u7f8e\u56fd"}, stringArray14, stringArray5, stringArray6, {"\u610f\u5927\u5229", "\u610f\u5927\u5229"}, stringArray2, stringArray15, stringArray16, stringArray, stringArray4, stringArray17, object4, stringArray7, stringArray8, object6, stringArray3});
            object5 = this.l("year", "\u5e74\u4ee3", this.B());
            object2 = new String[]{"\u5168\u90e8", ""};
            stringArray7 = new String[]{"\u817e\u8baf\u89c6\u9891", "\u817e\u8baf\u89c6\u9891"};
            stringArray4 = new String[]{"\u7231\u5947\u827a", "\u7231\u5947\u827a"};
            stringArray5 = new String[]{"\u4f18\u9177", "\u4f18\u9177"};
            stringArray9 = new String[]{"\u6e56\u5357\u536b\u89c6", "\u6e56\u5357\u536b\u89c6"};
            object4 = new String[]{"Netflix", "Netflix"};
            stringArray3 = new String[]{"HBO", "HBO"};
            object3 = new String[]{"BBC", "BBC"};
            stringArray = new String[]{"NHK", "NHK"};
            stringArray2 = new String[]{"tvN", "tvN"};
            ((AbstractMap)linkedHashMap).put("tv_filter", Arrays.asList(object, object6, object5, this.l("platform", "\u5e73\u53f0", new String[][]{object2, stringArray7, stringArray4, stringArray5, stringArray9, object4, stringArray3, object3, stringArray, {"CBS", "CBS"}, {"NBC", "NBC"}, stringArray2}), this.l("sort", "\u6392\u5e8f", new String[][]{{"\u70ed\u5ea6", "U"}, {"\u8bc4\u5206", "S"}, {"\u65f6\u95f4", "R"}})));
            object5 = this.l("\u7c7b\u578b", "\u7c7b\u578b", new String[][]{{"\u5168\u90e8\u7c7b\u578b", ""}, {"\u771f\u4eba\u79c0", "\u771f\u4eba\u79c0"}, {"\u8131\u53e3\u79c0", "\u8131\u53e3\u79c0"}, {"\u97f3\u4e50", "\u97f3\u4e50"}, {"\u559c\u5267", "\u559c\u5267"}, {"\u7eaa\u5b9e", "\u7eaa\u5b9e"}});
            object2 = this.l("\u5730\u533a", "\u5730\u533a", new String[][]{{"\u5168\u90e8\u5730\u533a", ""}, {"\u4e2d\u56fd\u5927\u9646", "\u4e2d\u56fd\u5927\u9646"}, {"\u97e9\u56fd", "\u97e9\u56fd"}, {"\u6e2f\u53f0", "\u6e2f\u53f0"}, {"\u6b27\u7f8e", "\u6b27\u7f8e"}});
            object4 = this.l("\u5e74\u4ee3", "\u5e74\u4ee3", new String[][]{{"\u5168\u90e8\u5e74\u4ee3", ""}, {"2026", "2026"}, {"2025", "2025"}, {"2024", "2024"}, {"2023", "2023"}, {"2022", "2022"}, {"2021", "2021"}, {"2020", "2020"}});
            object3 = new String[]{"\u8fd1\u671f\u70ed\u5ea6", "U"};
            object = new String[]{"\u7efc\u5408\u6392\u5e8f", "T"};
            stringArray2 = new String[]{"\u9ad8\u5206\u4f18\u5148", "S"};
            ((AbstractMap)linkedHashMap).put("show_filter", Arrays.asList(object5, object2, object4, this.l("sort", "\u6392\u5e8f", new String[][]{object3, object, {"\u9996\u64ad\u65f6\u95f4", "R"}, stringArray2})));
            ((AbstractMap)linkedHashMap).put("top_250", Arrays.asList(this.l("slug", "\u699c\u5355", new String[][]{{"\u8c46\u74e3\u7535\u5f71Top250", "movie_top250"}})));
            return com.github.catvod.spider.merge.K.f.s(arrayList, list, linkedHashMap);
        }
        return com.github.catvod.spider.merge.K.f.r(arrayList, list);
    }

    public void init(Context context, String string) {
    }
}

