/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.SeedHub$MovieMeta;
import com.github.catvod.spider.SeedHub$PanItem;
import com.github.catvod.spider.merge.A.c;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.G1.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K.f;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.s;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.f1.F;
import com.github.catvod.spider.merge.l0.b;
import com.github.catvod.spider.merge.y.z;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeedHub
extends NetPan {
    private static final String[] q = new String[]{"1", "\u7535\u5f71", "3", "\u7535\u89c6\u5267", "2", "\u52a8\u6f2b"};
    private static final Pattern r = Pattern.compile("var\\s+panLink\\s*=\\s*['\"]([^'\"]+)['\"]");
    private static final Pattern s = Pattern.compile("(?:19|20)\\d{2}");
    private static final Pattern t = Pattern.compile("\u8c46\u74e3\u8bc4\u5206\\s*[:\uff1a]?\\s*([0-9.]+)");
    private static final Pattern u = Pattern.compile("/movies/\\d+/?");
    private static final Pattern v = Pattern.compile("https?://(?:pan\\.baidu\\.com|pan\\.quark\\.cn|drive\\.uc\\.cn|pan\\.xunlei\\.com|www\\.alipan\\.com|www\\.aliyundrive\\.com|www\\.123pan\\.com|123684\\.com|123865\\.com|[\\w-]+\\.(?:share|mshare)\\.123pan\\.(?:com|cn)|115\\.com|anxia\\.com|yun\\.139\\.com|cloud\\.189\\.cn|guangyapan\\.com)[^\\s\"'<>]+", 2);
    private final List<String> m = new ArrayList<String>();
    private String n = "https://seeduck.cc";
    private final ConcurrentHashMap<String, List<SeedHub$PanItem>> o = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, String> p = new ConcurrentHashMap();

    private Map<String, List<SeedHub$PanItem>> A(List<SeedHub$PanItem> object) {
        Map.Entry entry2 = new LinkedHashMap();
        Iterator iterator = ((ArrayList)com.github.catvod.spider.merge.l0.b.c()).iterator();
        while (iterator.hasNext()) {
            entry2.put((String)iterator.next(), new ArrayList());
        }
        Iterator<SeedHub$PanItem> iterator2 = object.iterator();
        while (iterator2.hasNext()) {
            iterator = iterator2.next();
            object = TextUtils.isEmpty((CharSequence)((SeedHub$PanItem)((Object)iterator)).c) ? "other" : ((SeedHub$PanItem)((Object)iterator)).c;
            if (!entry2.containsKey(object)) {
                entry2.put(object, new ArrayList());
            }
            ((List)((LinkedHashMap)((Object)entry2)).get(object)).add(iterator);
        }
        object = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap)((Object)entry2)).entrySet()) {
            if (((List)entry2.getValue()).isEmpty()) continue;
            object.put((String)entry2.getKey(), (List)entry2.getValue());
        }
        return object;
    }

    private Map<String, String> B() {
        HashMap hashMap = com.github.catvod.spider.merge.A.c.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36", "Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        hashMap.put("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.n);
        stringBuilder.append("/");
        hashMap.put("Referer", stringBuilder.toString());
        hashMap.put("Cache-Control", "no-cache");
        return hashMap;
    }

    private boolean C(String string) {
        boolean bl = !TextUtils.isEmpty((CharSequence)string) && string.toLowerCase(Locale.ROOT).startsWith("magnet:");
        return bl;
    }

    private boolean D(String string) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (string.startsWith("movie###")) {
            return true;
        }
        bl = bl2;
        if (u.matcher(string).find()) {
            bl = bl2;
            if (!string.contains("/categories/")) {
                bl = true;
            }
        }
        return bl;
    }

    private boolean E(String string) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = true;
        if (bl) {
            return true;
        }
        string = string.replace("|", "").trim();
        bl = bl2;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            bl = bl2;
            if (!string.equals("\u7535\u5f71")) {
                bl = bl2;
                if (!string.equals("\u52a8\u6f2b")) {
                    bl = bl2;
                    if (!string.equals("\u5267\u96c6")) {
                        bl = bl2;
                        if (!string.equals("\u7535\u89c6\u5267")) {
                            bl = bl2;
                            if (!string.equals("\u9996\u9875")) {
                                bl = bl2;
                                if (!string.equals("\u6700\u65b0")) {
                                    bl = string.equals("\u641c\u7d22") ? bl2 : false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl;
    }

    private String F(String string, String string2) {
        com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h();
        h2.l(string2);
        h2.m(string);
        h2.n("https://s1.aigei.com/prevfiles/780e341864ef4bad9ca3b9c94becfff1.png?e=2051020800&token=P7S2Xpzfz11vAkASLTkfHN7Fw-oOZBecqeJaxypL:Bx1EK3evOq8HRK8qfOK8JJzG9cw=");
        h2.o("\u78c1\u529b");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("$");
        stringBuilder.append(string2);
        h2.p(stringBuilder.toString());
        return com.github.catvod.spider.merge.K.f.n(h2);
    }

    /*
     * Exception decompiling
     */
    private String G(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[UNCONDITIONALDOLOOP]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    private String H(String string) {
        string = string == null ? "" : string.replace("&amp;", "&").trim();
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private SeedHub$MovieMeta I(String string) {
        SeedHub$MovieMeta seedHub$MovieMeta = new SeedHub$MovieMeta();
        String string2 = "";
        if ((string = string == null ? "" : string.trim()).startsWith("movie###")) {
            String[] stringArray = string.substring(8).split(Pattern.quote("###"), 2);
            seedHub$MovieMeta.a = stringArray[0];
            string = string2;
            if (stringArray.length > 1) {
                string = stringArray[1];
            }
        } else {
            if (!string.startsWith("type###")) {
                seedHub$MovieMeta.a = string;
                return seedHub$MovieMeta;
            }
            String[] stringArray = string.split(Pattern.quote("###"), -1);
            string = stringArray.length > 2 ? stringArray[2] : "";
            seedHub$MovieMeta.a = string;
            string = string2;
            if (stringArray.length > 3) {
                string = stringArray[3];
            }
        }
        seedHub$MovieMeta.b = string;
        return seedHub$MovieMeta;
    }

    private List<com.github.catvod.spider.merge.K.h> J(h object) {
        Object object2;
        ArrayList<com.github.catvod.spider.merge.K.h> arrayList = new ArrayList<com.github.catvod.spider.merge.K.h>();
        HashSet<Object> hashSet = new HashSet<Object>();
        for (Object object3 : ((m)object).m0("a.image[href*=/movies/], a[href*=/movies/]")) {
            Object object4;
            String string = this.v(((s)object3).c("href"));
            if (TextUtils.isEmpty((CharSequence)string) || !hashSet.add(string)) continue;
            object2 = object3;
            for (int i2 = 0; i2 < 4; ++i2) {
                object4 = ((m)object2).i0();
                if (object4 == null) continue;
                object2 = object4;
            }
            object4 = ((m)object3).n0("img");
            object3 = ((m)object2).n0("img");
            if (object4 != null) {
                object3 = object4;
            }
            if (TextUtils.isEmpty((CharSequence)(object4 = this.q((String)(object4 = object3 == null ? this.y((m)object2) : this.z(((s)object3).c("alt"), this.y((m)object2)))))) || this.E((String)object4)) continue;
            if (!TextUtils.isEmpty((CharSequence)(object3 = object3 == null ? "" : this.o(this.z(((s)object3).c("src"), ((s)object3).c("data-src"))))) && ((String)object3).contains("favicon")) {
                object3 = "";
            }
            Object object5 = ((m)object2).s0().replaceAll("\\s+", " ");
            object2 = new ArrayList<String>();
            Object object6 = s.matcher((CharSequence)object5);
            object5 = t.matcher((CharSequence)object5);
            if (((Matcher)object6).find()) {
                ((ArrayList)object2).add(((Matcher)object6).group());
            }
            if (((Matcher)object5).find()) {
                object6 = com.github.catvod.spider.merge.C.a.c("\u8c46\u74e3 ");
                ((StringBuilder)object6).append(((Matcher)object5).group(1));
                ((ArrayList)object2).add(((StringBuilder)object6).toString());
            }
            object2 = TextUtils.join((CharSequence)" / ", object2);
            arrayList.add(new com.github.catvod.spider.merge.K.h(com.github.catvod.spider.merge.G1.a.a("movie###", string, "###", (String)object4), (String)object4, (String)object3, (String)object2, true));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        for (Object object4 : ((m)object).m0("img[alt]")) {
            for (object = ((m)object4).i0(); object != null && !"a".equals(((m)object).r0()); object = ((m)object).i0()) {
            }
            if (object == null || !((s)object).n("href")) continue;
            object2 = this.v(((s)object).c("href"));
            String string = this.q(((s)object4).c("alt"));
            if (TextUtils.isEmpty((CharSequence)object2) || TextUtils.isEmpty((CharSequence)string) || this.E(string) || !hashSet.add(object2)) continue;
            object = this.o(this.z(((s)object4).c("src"), ((s)object4).c("data-src")));
            if (!TextUtils.isEmpty((CharSequence)object) && ((String)object).contains("favicon")) {
                object = "";
            }
            arrayList.add(new com.github.catvod.spider.merge.K.h(com.github.catvod.spider.merge.G1.a.a("movie###", object2, "###", string), string, (String)object, "", true));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String K(String object) {
        try {
            Object object2;
            String string;
            block17: {
                Map<String, String> map;
                block16: {
                    string = this.G((String)object);
                    map = this.B();
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.n);
                    ((StringBuilder)object).append("/");
                    object = ((StringBuilder)object).toString();
                    ((HashMap)map).put("Referer", object);
                    object = object2 = com.github.catvod.spider.merge.f0.d.l(string, map, null);
                    if (TextUtils.isEmpty((CharSequence)object2)) {
                        object = this.L(string, map);
                    }
                    if (TextUtils.isEmpty((CharSequence)object)) {
                        return "";
                    }
                    if (((String)object).contains("Just a moment") || ((String)object).contains("cf-browser-verification")) break block16;
                    object2 = object;
                    if (!((String)object).contains("challenge-platform")) break block17;
                }
                SpiderDebug.log((String)"[SeedHub] link_start blocked by cloudflare");
                object = this.L(string, map);
                if (TextUtils.isEmpty((CharSequence)object)) return "";
                object2 = object;
                if (((String)object).contains("Just a moment")) {
                    return "";
                }
            }
            if (!TextUtils.isEmpty((CharSequence)(object = this.u((String)object2)))) {
                return object;
            }
            object = F.d((String)object2, string).n0("a[href^=magnet:], a[href*=magnet:?]");
            if (object != null && this.C((String)(object = this.H(((s)object).c("href"))))) {
                return object;
            }
            object = Pattern.compile("magnet:\\?[^\\s\"'<>]+", 2).matcher((CharSequence)object2);
            if (((Matcher)object).find()) {
                return this.H(((Matcher)object).group());
            }
            object = r.matcher((CharSequence)object2);
            if (((Matcher)object).find()) {
                return this.H(((Matcher)object).group(1).replace("\\/", "/"));
            }
            object = Pattern.compile("(?:location\\.href|window\\.location(?:\\.href)?)\\s*=\\s*['\"]([^'\"]+)['\"]", 2).matcher((CharSequence)object2);
            if (((Matcher)object).find()) {
                if (this.C((String)(object = this.H(((Matcher)object).group(1))))) return object;
                if (com.github.catvod.spider.merge.l0.b.a((String)object)) {
                    return object;
                }
            }
            if (((Matcher)(object = v.matcher((CharSequence)object2))).find()) {
                return this.H(((Matcher)object).group());
            }
            object = Pattern.compile("url=(https?://[^\"'\\s>]+)", 2).matcher((CharSequence)object2);
            if (((Matcher)object).find() && com.github.catvod.spider.merge.l0.b.a(((Matcher)object).group(1))) {
                return this.H(((Matcher)object).group(1));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("[SeedHub] resolve empty, htmlLen=");
            ((StringBuilder)object).append(((String)object2).length());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            return "";
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("[SeedHub] resolveRealShareUrl failed: ");
            stringBuilder.append(throwable.getMessage());
            SpiderDebug.log((String)stringBuilder.toString());
            return "";
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String L(String string, Map<String, String> map) {
        Iterator iterator = ((ArrayList)this.m).iterator();
        while (true) {
            StringBuilder stringBuilder;
            String string2;
            String string3;
            block6: {
                if (!iterator.hasNext()) {
                    return "";
                }
                string3 = (String)iterator.next();
                try {
                    int n2;
                    if (TextUtils.isEmpty((CharSequence)string) || TextUtils.isEmpty((CharSequence)string3) || (n2 = string.indexOf("://")) < 0) break block6;
                    string2 = (n2 = string.indexOf(47, n2 + 3)) >= 0 ? string.substring(n2) : "/";
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(this.M(string3));
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                }
                catch (Throwable throwable) {}
            }
            string2 = string;
            try {
                if (string2.equals(string)) continue;
                stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("/");
                map.put("Referer", stringBuilder.toString());
                if (TextUtils.isEmpty((CharSequence)(string2 = com.github.catvod.spider.merge.f0.d.l(string2, map, null))) || string2.contains("Just a moment") || string2.length() <= 500) continue;
                this.n = string3;
                return string2;
            }
            catch (Throwable throwable) {
                continue;
            }
            break;
        }
    }

    private String M(String string) {
        string = string == null ? "" : string.trim();
        while (string.endsWith("/") && string.length() > 8) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    private String o(String string) {
        String string2;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        string = string2 = string.replace("&amp;", "&").trim();
        if (!string2.startsWith("http://")) {
            if (string2.startsWith("https://")) {
                string = string2;
            } else {
                if (string2.startsWith("//")) {
                    return com.github.catvod.spider.merge.B.e.c("https:", string2);
                }
                string = string2.startsWith("/") ? com.github.catvod.spider.merge.I.r.c(new StringBuilder(), this.n, string2) : z.b(new StringBuilder(), this.n, "/", string2);
            }
        }
        return string;
    }

    private void p(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        if ((string = this.M(string)).startsWith("http") && !((ArrayList)this.m).contains(string)) {
            ((ArrayList)this.m).add(string);
        }
    }

    private String q(String string) {
        if (string == null) {
            return "";
        }
        return string.replace(" - SeedHub | \u5f71\u89c6&\u52a8\u6f2b\u5206\u4eab", "").replace("SeedHub", "").replace("#", "").replaceAll("\\s+", " ").trim();
    }

    private String r(String string) {
        String string2;
        if ("magnet".equals(string)) {
            return "https://s1.aigei.com/prevfiles/780e341864ef4bad9ca3b9c94becfff1.png?e=2051020800&token=P7S2Xpzfz11vAkASLTkfHN7Fw-oOZBecqeJaxypL:Bx1EK3evOq8HRK8qfOK8JJzG9cw=";
        }
        String string3 = string2 = com.github.catvod.spider.merge.l0.b.g(string);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string3 = com.github.catvod.spider.merge.l0.b.p(string);
        }
        return string3;
    }

    private List<SeedHub$PanItem> s(String object) {
        Object object2;
        block18: {
            Object object3;
            boolean bl;
            Iterator iterator;
            Object object4;
            block17: {
                object4 = this.I((String)object);
                iterator = ((SeedHub$MovieMeta)object4).a;
                object = this.v((String)((Object)iterator));
                bl = TextUtils.isEmpty((CharSequence)object);
                Object object5 = "";
                if (bl) {
                    if (TextUtils.isEmpty((CharSequence)((Object)iterator))) {
                        object = "";
                    } else {
                        iterator = this.o((String)((Object)iterator));
                        object = iterator;
                        if (((String)((Object)iterator)).startsWith(this.n)) {
                            object = ((String)((Object)iterator)).substring(this.n.length());
                        }
                    }
                }
                if (!TextUtils.isEmpty((CharSequence)((Object)(iterator = this.p.get(object))))) {
                    iterator = F.d((String)((Object)iterator), this.o((String)object));
                } else {
                    object3 = this.w((String)object);
                    object2 = object3 != null ? ((m)object3).b0() : "";
                    iterator = object3;
                    if (!TextUtils.isEmpty((CharSequence)object2)) {
                        iterator = object3;
                        if (((String)object2).length() > 500) {
                            if (this.p.size() > 30) {
                                this.p.clear();
                            }
                            this.p.put((String)object, (String)object2);
                            iterator = object3;
                        }
                    }
                }
                if (TextUtils.isEmpty((CharSequence)((SeedHub$MovieMeta)object4).b)) {
                    object2 = ((h)((Object)iterator)).H0();
                    object3 = ((m)((Object)iterator)).n0(".content h1, .content h2, h1");
                    if (object3 == null) {
                        object = object2;
                        if (object2 == null) {
                            object = object5;
                        }
                    } else {
                        object = object2 = ((m)object3).h0();
                        if (TextUtils.isEmpty((CharSequence)object2)) {
                            object = ((m)object3).s0();
                        }
                    }
                    ((SeedHub$MovieMeta)object4).b = this.q((String)object);
                }
                object2 = new ArrayList();
                object = new HashSet();
                object5 = ((AbstractCollection)((m)((Object)iterator)).m0("ul.seeds a[href*=seed_id=], a[href*=seed_id=]")).iterator();
                while (true) {
                    boolean bl2 = object5.hasNext();
                    bl = false;
                    if (!bl2) break block17;
                    object3 = (m)object5.next();
                    object4 = ((s)object3).c("href");
                    if (!TextUtils.isEmpty((CharSequence)object4)) {
                        bl = ((String)object4).toLowerCase(Locale.ROOT).contains("seed_id=");
                    }
                    if (!bl || TextUtils.isEmpty((CharSequence)(object4 = this.o((String)object4))) || !((HashSet)object).add(object4)) continue;
                    ((ArrayList)object2).add(new SeedHub$PanItem((String)object4, this.q(this.z(((s)object3).c("title"), ((m)object3).s0())), "magnet", this.x((m)object3)));
                    if (((ArrayList)object2).size() >= 800) break;
                }
                break block18;
            }
            for (Object object5 : ((m)((Object)iterator)).m0("a[data-link][href*=/link_start/], a[data-link][href*=link_start]")) {
                object4 = ((s)object5).c("href");
                bl = TextUtils.isEmpty((CharSequence)object4) || ((String)(object3 = ((String)object4).toLowerCase(Locale.ROOT))).contains("seed_id=") ? false : (!((String)object3).contains("redirect_to=") && !((String)object3).contains("pan_id_") ? ((String)object3).contains("link_start") : true);
                if (!bl || "other".equals(object3 = com.github.catvod.spider.merge.l0.b.j(((s)object5).c("data-link"))) || "magnet".equals(object3) || TextUtils.isEmpty((CharSequence)(object4 = this.o((String)object4))) || !((HashSet)object).add(object4)) continue;
                ((ArrayList)object2).add(new SeedHub$PanItem((String)object4, this.q(this.z(((s)object5).c("title"), ((m)object5).s0())), (String)object3, this.x((m)object5)));
                if (((ArrayList)object2).size() < 800) continue;
            }
        }
        return object2;
    }

    private String searchContent(String list, String object) {
        int n2;
        try {
            n2 = Integer.parseInt((String)object);
        }
        catch (Throwable throwable) {
            n2 = 1;
        }
        ArrayList arrayList = new ArrayList();
        object = list;
        if (list == null) {
            object = "";
        }
        try {
            object = URLEncoder.encode((String)object, "UTF-8");
            list = new List<com.github.catvod.spider.merge.K.h>();
            ((StringBuilder)((Object)list)).append("/s/");
            ((StringBuilder)((Object)list)).append((String)object);
            ((StringBuilder)((Object)list)).append("/?page=");
            ((StringBuilder)((Object)list)).append(n2);
            list = this.J(this.w(((StringBuilder)((Object)list)).toString()));
        }
        catch (Throwable throwable) {
            list = com.github.catvod.spider.merge.C.a.c("[SeedHub] search failed: ");
            ((StringBuilder)((Object)list)).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)((Object)list)).toString());
            list = arrayList;
        }
        object = new f();
        ((f)object).y(list);
        ((f)object).k(n2, n2 + 1, 30, Integer.MAX_VALUE);
        return ((f)object).toString();
    }

    private String t(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        try {
            Object object = Base64.decode((String)string, (int)0);
            String string2 = new String((byte[])object, "UTF-8");
            object = string2.trim();
            return object;
        }
        catch (Throwable throwable) {
            try {
                byte[] byArray = Base64.decode((String)string, (int)2);
                string = new String(byArray, "UTF-8");
                string = string.trim();
                return string;
            }
            catch (Throwable throwable2) {
                return "";
            }
        }
    }

    private String u(String object) {
        Object object2;
        if (TextUtils.isEmpty((CharSequence)object)) {
            return "";
        }
        Object object3 = Pattern.compile("const\\s+data\\s*=\\s*[\"']([A-Za-z0-9+/=]+)[\"']", 2).matcher((CharSequence)object);
        while (((Matcher)object3).find()) {
            object2 = this.t(((Matcher)object3).group(1));
            if (!this.C((String)object2) && !com.github.catvod.spider.merge.l0.b.a((String)object2)) continue;
            return this.H((String)object2);
        }
        object2 = Pattern.compile("(?:var|let)\\s+data\\s*=\\s*[\"']([A-Za-z0-9+/=]+)[\"']", 2).matcher((CharSequence)object);
        while (((Matcher)object2).find()) {
            object3 = this.t(((Matcher)object2).group(1));
            if (!this.C((String)object3) && !com.github.catvod.spider.merge.l0.b.a((String)object3)) continue;
            return this.H((String)object3);
        }
        object = Pattern.compile("[\"']([A-Za-z0-9+/]{40,}={0,2})[\"']").matcher((CharSequence)object);
        while (((Matcher)object).find()) {
            object3 = this.t(((Matcher)object).group(1));
            if (!this.C((String)object3) && !com.github.catvod.spider.merge.l0.b.a((String)object3)) continue;
            return this.H((String)object3);
        }
        return "";
    }

    private String v(String object) {
        Object object2;
        if (TextUtils.isEmpty((CharSequence)object)) {
            return "";
        }
        String string = ((String)object).replace("&amp;", "&").trim();
        if (string.contains("/categories/")) {
            return "";
        }
        Pattern pattern = u;
        object = object2 = pattern.matcher(string);
        if (!((Matcher)object2).find()) {
            object = object2 = pattern.matcher(this.o(string));
            if (!((Matcher)object2).find()) {
                return "";
            }
        }
        object = object2 = ((Matcher)object).group();
        if (!((String)object2).endsWith("/")) {
            object = com.github.catvod.spider.merge.B.e.c((String)object2, "/");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private h w(String string) {
        Iterator iterator = ((ArrayList)this.m).iterator();
        String string2 = "";
        while (true) {
            String string3;
            if (!iterator.hasNext()) {
                com.github.catvod.spider.merge.B.e.d("[SeedHub] fetch ", string2);
                return F.d("", this.o(string));
            }
            this.n = string3 = (String)iterator.next();
            CharSequence charSequence = this.o(string);
            try {
                string2 = com.github.catvod.spider.merge.f0.d.l((String)charSequence, this.B(), null);
                if (!TextUtils.isEmpty((CharSequence)string2) && (string2.contains("/movies/") || string2.contains("SeedHub") || string2.contains("seedhub") || string2.contains("seeduck") || string2.contains("sidhub") || string2.contains("link_start"))) {
                    return F.d(string2, (String)charSequence);
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("empty site=");
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(", len=");
                int n2 = string2 == null ? 0 : string2.length();
                ((StringBuilder)charSequence).append(n2);
                string2 = ((StringBuilder)charSequence).toString();
            }
            catch (Throwable throwable) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("error site=");
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(", msg=");
                ((StringBuilder)charSequence).append(throwable.getMessage());
                string2 = ((StringBuilder)charSequence).toString();
                continue;
            }
            break;
        }
    }

    private String x(m object) {
        block7: {
            block6: {
                block5: {
                    for (int n2 = 0; n2 < 4 && object != null && !"li".equals(((m)object).r0()); object = ((m)object).i0(), ++n2) {
                    }
                    if (object == null) {
                        return "";
                    }
                    m m2 = ((m)object).n0("code.size, .size");
                    if (m2 == null || TextUtils.isEmpty((CharSequence)m2.s0())) break block5;
                    object = m2.s0();
                    break block6;
                }
                if ((object = ((m)object).n0(".create-time")) == null || TextUtils.isEmpty((CharSequence)((m)object).s0())) break block7;
                object = ((m)object).s0();
            }
            return ((String)object).trim();
        }
        return "";
    }

    private String y(m object) {
        object = ((AbstractCollection)((m)object).m0("h1, h2, h3")).iterator();
        while (object.hasNext()) {
            String string = ((m)object.next()).s0().replace("#", "").trim();
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            return string;
        }
        return "";
    }

    private String z(String string, String string2) {
        String string3 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string3 = string2;
        }
        return string3;
    }

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        int n2;
        Object object42;
        block47: {
            int n3;
            ArrayList<com.github.catvod.spider.merge.K.h> arrayList;
            int n4;
            int n5;
            block46: {
                int n6;
                int n7;
                block48: {
                    SeedHub$PanItem seedHub$PanItem;
                    String string;
                    Object object5;
                    Object object6;
                    int n8;
                    block43: {
                        block45: {
                            block44: {
                                block42: {
                                    block41: {
                                        object42 = object;
                                        n5 = 1;
                                        n4 = 1;
                                        try {
                                            n2 = Integer.parseInt((String)object2);
                                        }
                                        catch (Throwable throwable) {
                                            n2 = 1;
                                        }
                                        bl = TextUtils.isEmpty((CharSequence)object);
                                        n7 = 0;
                                        if (bl || !((String)object42).startsWith("type###")) break block47;
                                        arrayList = new ArrayList<com.github.catvod.spider.merge.K.h>();
                                        n8 = n7;
                                        object3 = ((String)object42).split(Pattern.quote("###"), -1);
                                        n8 = n7;
                                        n6 = ((String[])object3).length;
                                        object = "";
                                        object6 = n6 > 1 ? object3[1] : "";
                                        n8 = n7;
                                        object2 = ((String[])object3).length > 2 ? object3[2] : "";
                                        n8 = n7;
                                        if (((String[])object3).length <= 3) break block41;
                                        object = object3[3];
                                    }
                                    n8 = n7;
                                    object5 = this.o.get(object42);
                                    if (object5 == null) break block42;
                                    object3 = object5;
                                    n8 = n7;
                                    if (!object5.isEmpty()) break block43;
                                }
                                n8 = n7;
                                n8 = n7;
                                object3 = new StringBuilder();
                                n8 = n7;
                                ((StringBuilder)object3).append("movie###");
                                n8 = n7;
                                ((StringBuilder)object3).append((String)object2);
                                n8 = n7;
                                ((StringBuilder)object3).append("###");
                                n8 = n7;
                                ((StringBuilder)object3).append((String)object);
                                n8 = n7;
                                object2 = this.A(this.s(((StringBuilder)object3).toString()));
                                n8 = n7;
                                if (!object2.containsKey(object6)) break block44;
                                n8 = n7;
                                object2 = (List)((LinkedHashMap)object2).get(object6);
                                break block45;
                            }
                            n8 = n7;
                            object2 = new ArrayList();
                        }
                        n8 = n7;
                        this.o.put((String)object42, (List<SeedHub$PanItem>)object2);
                        object3 = object2;
                    }
                    n8 = n7;
                    n8 = n7 = object3.size();
                    n6 = Math.max(1, (n7 + 30 - 1) / 30);
                    if (n2 < 1) {
                        n2 = n4;
                    }
                    if (n2 > n6) {
                        n2 = n6;
                    }
                    int n9 = (n2 - 1) * 30;
                    try {
                        n8 = Math.min(n7, n9 + 30);
                        object5 = com.github.catvod.spider.merge.l0.b.o((String)object6);
                        string = this.r((String)object6);
                    }
                    catch (Throwable throwable) {}
                    while (true) {
                        n3 = n2;
                        n4 = n7;
                        n5 = n6;
                        if (n9 >= n8) break block46;
                        seedHub$PanItem = (SeedHub$PanItem)object3.get(n9);
                        if (!TextUtils.isEmpty((CharSequence)seedHub$PanItem.b)) {
                            object2 = seedHub$PanItem.b;
                        } else {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append((String)object);
                            ((StringBuilder)object2).append(" #");
                            ((StringBuilder)object2).append(n9 + 1);
                            object2 = ((StringBuilder)object2).toString();
                        }
                        object6 = new StringBuilder();
                        ((StringBuilder)object6).append(seedHub$PanItem.a);
                        ((StringBuilder)object6).append("#");
                        object42 = !TextUtils.isEmpty((CharSequence)object) ? object : object2;
                        break;
                    }
                    {
                        ((StringBuilder)object6).append((String)object42);
                        String string2 = ((StringBuilder)object6).toString();
                        object42 = new StringBuilder();
                        ((StringBuilder)object42).append("[");
                        ((StringBuilder)object42).append((String)object5);
                        ((StringBuilder)object42).append("] #");
                        ++n9;
                        ((StringBuilder)object42).append(n9);
                        object42 = object6 = ((StringBuilder)object42).toString();
                        if (!TextUtils.isEmpty((CharSequence)seedHub$PanItem.d)) {
                            object42 = new StringBuilder();
                            ((StringBuilder)object42).append((String)object6);
                            ((StringBuilder)object42).append(" ");
                            ((StringBuilder)object42).append(seedHub$PanItem.d);
                            object42 = ((StringBuilder)object42).toString();
                        }
                        object6 = new com.github.catvod.spider.merge.K.h(string2, (String)object2, string, (String)object42);
                        arrayList.add((com.github.catvod.spider.merge.K.h)object6);
                        continue;
                    }
                    break block48;
                    catch (Throwable throwable) {
                        n7 = n8;
                        n6 = n5;
                    }
                }
                object2 = com.github.catvod.spider.merge.C.a.c("[SeedHub] typeShareList failed: ");
                ((StringBuilder)object2).append(((Throwable)object).getMessage());
                SpiderDebug.log((String)((StringBuilder)object2).toString());
                n5 = n6;
                n4 = n7;
                n3 = n2;
            }
            object = new f();
            ((f)object).y(arrayList);
            ((f)object).k(n3, n5, 30, n4);
            return ((f)object).toString();
        }
        if (!TextUtils.isEmpty((CharSequence)object) && (((String)object42).startsWith("movie###") || this.D((String)object))) {
            object2 = new ArrayList();
            try {
                object3 = this.I((String)object);
                for (Object object42 : ((LinkedHashMap)this.A(this.s((String)object))).entrySet()) {
                    String string = (String)object42.getKey();
                    Object object7 = (List)object42.getValue();
                    if (object7.isEmpty()) continue;
                    object42 = new StringBuilder();
                    ((StringBuilder)object42).append("type###");
                    ((StringBuilder)object42).append(string);
                    ((StringBuilder)object42).append("###");
                    ((StringBuilder)object42).append(((SeedHub$MovieMeta)object3).a);
                    ((StringBuilder)object42).append("###");
                    ((StringBuilder)object42).append(((SeedHub$MovieMeta)object3).b);
                    object42 = ((StringBuilder)object42).toString();
                    this.o.put((String)object42, (List<SeedHub$PanItem>)object7);
                    String string3 = com.github.catvod.spider.merge.l0.b.o(string);
                    string = this.r(string);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("[");
                    stringBuilder.append(string3);
                    stringBuilder.append("] ");
                    stringBuilder.append(object7.size());
                    stringBuilder.append("\u4e2a\u94fe\u63a5");
                    string3 = stringBuilder.toString();
                    object7 = new com.github.catvod.spider.merge.K.h((String)object42, ((SeedHub$MovieMeta)object3).b, string, string3, true);
                    ((ArrayList)object2).add(object7);
                }
            }
            catch (Throwable throwable) {
                object = com.github.catvod.spider.merge.C.a.c("[SeedHub] movieTypeList failed: ");
                ((StringBuilder)object).append(throwable.getMessage());
                SpiderDebug.log((String)((StringBuilder)object).toString());
            }
            object = new f();
            ((f)object).y((List<com.github.catvod.spider.merge.K.h>)object2);
            ((f)object).k(1, 1, 0, 1);
            return ((f)object).toString();
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            object42 = "1";
        }
        object = new ArrayList();
        try {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("/categories/");
            ((StringBuilder)object2).append((String)object42);
            ((StringBuilder)object2).append("/movies/?page=");
            ((StringBuilder)object2).append(n2);
            object = object2 = this.J(this.w(((StringBuilder)object2).toString()));
        }
        catch (Throwable throwable) {
            object3 = com.github.catvod.spider.merge.C.a.c("[SeedHub] category failed: ");
            ((StringBuilder)object3).append(throwable.getMessage());
            SpiderDebug.log((String)((StringBuilder)object3).toString());
        }
        object2 = new f();
        ((f)object2).y((List<com.github.catvod.spider.merge.K.h>)object);
        ((f)object2).k(n2, n2 + 1, 30, Integer.MAX_VALUE);
        return ((f)object2).toString();
    }

    public String detailContent(List<String> object) {
        String string;
        Object object2 = object != null && !object.isEmpty() ? object.get(0).trim() : "";
        if (TextUtils.isEmpty((CharSequence)object2)) {
            return "";
        }
        object = ((String)object2).split("#", 2);
        Object object3 = object[0].trim();
        object = ((String[])object).length > 1 ? object[1].trim() : "";
        if (this.C((String)object3)) {
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = "\u78c1\u529b\u8d44\u6e90";
            }
            return this.F((String)object2, (String)object3);
        }
        boolean bl = !TextUtils.isEmpty((CharSequence)object3) && ((string = ((String)object3).toLowerCase(Locale.ROOT)).contains("/link_start") || string.contains("redirect_to=") || string.contains("pan_id_") || string.contains("seed_id="));
        if (bl) {
            if (TextUtils.isEmpty((CharSequence)(object3 = this.K((String)object3)))) {
                return com.github.catvod.spider.merge.K.f.n(new com.github.catvod.spider.merge.K.h("1", "\u83b7\u53d6\u8d44\u6e90\u94fe\u63a5\u5931\u8d25", ""));
            }
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = "\u8d44\u6e90";
            }
            if (this.C((String)object3)) {
                return this.F((String)object2, (String)object3);
            }
            return super.detailContent("", (String)object2, Arrays.asList(object3));
        }
        if (com.github.catvod.spider.merge.l0.b.a((String)object3)) {
            object2 = object;
            if (TextUtils.isEmpty((CharSequence)object)) {
                object2 = "\u8d44\u6e90";
            }
            return super.detailContent("", (String)object2, Arrays.asList(object3));
        }
        if ((((String)object2).startsWith("movie###") || this.D((String)object2)) && !((ArrayList)(object2 = (ArrayList)this.s((String)object2))).isEmpty()) {
            object3 = (SeedHub$PanItem)((ArrayList)object2).get(0);
            object2 = this.K(((SeedHub$PanItem)object3).a);
            if (!TextUtils.isEmpty((CharSequence)object2)) {
                if (TextUtils.isEmpty((CharSequence)object)) {
                    object = ((SeedHub$PanItem)object3).b;
                }
                if (this.C((String)object2)) {
                    return this.F((String)object, (String)object2);
                }
                return super.detailContent("", (String)object, Arrays.asList(object2));
            }
        }
        return com.github.catvod.spider.merge.K.f.n(new com.github.catvod.spider.merge.K.h("1", "\u65e0\u6548\u8d44\u6e90", ""));
    }

    public String homeContent(boolean bl) {
        Object object = q;
        List<com.github.catvod.spider.merge.K.a> list = Arrays.asList(new com.github.catvod.spider.merge.K.a(object[0], object[1]), new com.github.catvod.spider.merge.K.a(object[2], object[3]), new com.github.catvod.spider.merge.K.a(object[4], object[5]));
        object = new ArrayList();
        try {
            List<com.github.catvod.spider.merge.K.h> list2 = this.J(this.w("/categories/1/movies/?page=1"));
            object = list2;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("[SeedHub] home failed: ");
            stringBuilder.append(throwable.getMessage());
            SpiderDebug.log((String)stringBuilder.toString());
        }
        return com.github.catvod.spider.merge.K.f.r(list, (List<com.github.catvod.spider.merge.K.h>)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context context, String string) {
        Object object;
        JsonObject jsonObject;
        block5: {
            ((ArrayList)this.m).clear();
            this.o.clear();
            this.p.clear();
            jsonObject = com.github.catvod.spider.merge.J.j.e(string);
            try {
                if (!jsonObject.has("site") || !jsonObject.get("site").isJsonPrimitive()) break block5;
                object = jsonObject.get("site").getAsString().trim();
            }
            catch (Throwable throwable) {}
        }
        object = "";
        this.p((String)object);
        if (jsonObject.has("site") && jsonObject.get("site").isJsonArray()) {
            object = jsonObject.getAsJsonArray("site").iterator();
            while (object.hasNext()) {
                this.p(((JsonElement)object.next()).getAsString());
            }
        }
        object = "https://seeduck.cc";
        this.p("https://seeduck.cc");
        this.p("https://www.seedhub.cc");
        this.p("https://seedhub.cc");
        this.p("https://sidhub.cc");
        if (!((ArrayList)this.m).isEmpty()) {
            object = (String)((ArrayList)this.m).get(0);
        }
        this.n = object;
        super.init(context, string);
    }

    public String playerContent(String object, String string, List<String> list) {
        if (!(this.C(string) || object != null && ((String)object).contains("\u78c1\u529b"))) {
            return super.playerContent((String)object, string, list);
        }
        object = new f();
        ((f)object).w(string);
        return ((f)object).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.searchContent(string, "1");
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.searchContent(string, string2);
    }
}

