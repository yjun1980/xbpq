/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.Youtube$Loader;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.g0.A;
import com.github.catvod.spider.merge.g0.B;
import com.github.catvod.spider.merge.g0.C;
import com.github.catvod.spider.merge.g0.D;
import com.github.catvod.spider.merge.g0.E;
import com.github.catvod.spider.merge.g0.F;
import com.github.catvod.spider.merge.g0.G;
import com.github.catvod.spider.merge.g0.H;
import com.github.catvod.spider.merge.g0.u;
import com.github.catvod.spider.merge.g0.v;
import com.github.catvod.spider.merge.g0.w;
import com.github.catvod.spider.merge.g0.x;
import com.github.catvod.spider.merge.g0.y;
import com.github.catvod.spider.merge.g0.z;
import com.github.catvod.spider.merge.i0.i;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.n0.h;
import com.github.catvod.spider.merge.p1.e;
import com.github.catvod.spider.merge.q0.a;
import com.github.catvod.spider.merge.r0.b;
import com.github.catvod.spider.merge.r0.c;
import com.github.catvod.spider.merge.r0.d;
import com.github.catvod.spider.merge.r0.f;
import com.github.catvod.spider.merge.r0.g;
import com.github.catvod.spider.merge.w0.j;
import com.github.catvod.utils.server.Server;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.net.Proxy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class Youtube
extends NetPan {
    private static final Pattern t = Pattern.compile("codecs=\"(.+)\"");
    public static final int u = 0;
    private JsonObject m;
    public com.github.catvod.spider.merge.n0.d n;
    private final Map<String, com.github.catvod.spider.merge.A0.b> o = new ConcurrentHashMap<String, com.github.catvod.spider.merge.A0.b>();
    private final Map<String, com.github.catvod.spider.merge.w0.d> p;
    private final Map<String, List<com.github.catvod.spider.merge.K.h>> q;
    private final Map<String, com.github.catvod.spider.merge.H1.i> r = new ConcurrentHashMap<String, com.github.catvod.spider.merge.H1.i>();
    private com.github.catvod.spider.merge.n0.c s;

    public Youtube() {
        this.p = new ConcurrentHashMap<String, com.github.catvod.spider.merge.w0.d>();
        this.q = new ConcurrentHashMap<String, List<com.github.catvod.spider.merge.K.h>>();
        Uri.parse((String)"http://192.168.28.12:8118");
        com.github.catvod.spider.merge.e0.b b2 = com.github.catvod.spider.merge.e0.b.g();
        Locale locale = Locale.getDefault();
        com.github.catvod.spider.merge.k1.l.d(b2, new e(locale.getLanguage(), locale.getCountry()));
    }

    public static Youtube get() {
        return Youtube$Loader.a;
    }

    public static String hasYouTube(String object) {
        object = Pattern.compile("https?://(?:(?:www|m)\\.)?(?:youtube\\.com/watch\\?v=|youtu\\.be/)([a-zA-Z0-9_-]{11})").matcher((CharSequence)object);
        object = ((Matcher)object).find() ? ((Matcher)object).group(1) : "";
        return object;
    }

    public static /* synthetic */ String o(Youtube youtube, String string, String string2, com.github.catvod.spider.merge.B0.c c2) {
        return youtube.r(string, string2, c2);
    }

    public static /* synthetic */ String p(Youtube youtube, String string, String string2, com.github.catvod.spider.merge.B0.c c2) {
        return youtube.r(string, string2, c2);
    }

    private String q(com.github.catvod.spider.merge.B0.c c2, String string) {
        int n2 = c2.f().b();
        String string2 = c2.g().split("/")[0];
        String string3 = c2.g().split(";")[0];
        Object object = t.matcher(c2.g());
        boolean bl = ((Matcher)object).find();
        String string4 = "";
        object = bl ? ((Matcher)object).group(1) : "";
        String string5 = Server.H(c2.h()).replace("&", "&amp;");
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("<AdaptationSet>\n<ContentComponent contentType=\"%s\"/>\n<Representation id=\"%d\" bandwidth=\"%s\" codecs=\"%s\" mimeType=\"%s\" %s startWithSAP=\"%d\">\n<BaseURL>%s</BaseURL>\n");
        CharSequence charSequence = string4;
        if (c2.d() != null) {
            if (c2.c() == null) {
                charSequence = string4;
            } else {
                charSequence = com.github.catvod.spider.merge.C.a.c("<SegmentBase indexRange=\"");
                ((StringBuilder)charSequence).append(c2.c().b());
                ((StringBuilder)charSequence).append("-");
                ((StringBuilder)charSequence).append(c2.c().a());
                ((StringBuilder)charSequence).append("\">\n<Initialization range=\"");
                ((StringBuilder)charSequence).append(c2.d().b());
                ((StringBuilder)charSequence).append("-");
                ((StringBuilder)charSequence).append(c2.d().a());
                ((StringBuilder)charSequence).append("\"/>\n</SegmentBase>\n");
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return String.format(com.github.catvod.spider.merge.I.r.c(stringBuilder, (String)charSequence, "</Representation>\n</AdaptationSet>\n"), string2, n2, c2.a(), object, string3, string, (int)(c2.f().h() ? 1 : 0), string5);
    }

    private String r(String object, String string, com.github.catvod.spider.merge.B0.c c2) {
        block4: {
            block3: {
                block2: {
                    if (!c2.f().h()) break block2;
                    object = (com.github.catvod.spider.merge.B0.f)c2;
                    object = String.format("height=\"%s\" width=\"%s\" frameRate=\"%d\" sar=\"1:1\"", ((com.github.catvod.spider.merge.B0.f)object).j(), ((com.github.catvod.spider.merge.B0.f)object).l(), ((com.github.catvod.spider.merge.B0.f)object).i());
                    break block3;
                }
                if (!c2.f().e()) break block4;
                object = String.format("numChannels=\"2\" sampleRate=\"%s\"", ((com.github.catvod.spider.merge.B0.a)c2).i());
            }
            return this.q(c2, (String)object);
        }
        return "";
    }

    /*
     * WARNING - void declaration
     */
    private String s(String object4, int n2) {
        Object object;
        void var2_20;
        if (var2_20 > true && ((ConcurrentHashMap)this.p).containsKey(object4) && (object = (com.github.catvod.spider.merge.w0.d)((ConcurrentHashMap)this.p).get(object4)) != null && object instanceof com.github.catvod.spider.merge.w0.b) {
            object = new d((com.github.catvod.spider.merge.w0.d)object);
            object = this.n.e((d)object);
        } else {
            object = null;
        }
        Object object2 = object;
        if (object == null) {
            object2 = this.n.d(new f((String)object4));
        }
        object = this.p;
        object2 = (com.github.catvod.spider.merge.s0.c)object2;
        ((ConcurrentHashMap)object).put(object4, (com.github.catvod.spider.merge.w0.d)((com.github.catvod.spider.merge.s0.c)object2).a());
        object = new ArrayList();
        for (com.github.catvod.spider.merge.w0.g g2 : ((com.github.catvod.spider.merge.w0.d)((com.github.catvod.spider.merge.s0.c)object2).a()).a()) {
            void var1_18;
            StringBuilder stringBuilder;
            com.github.catvod.spider.merge.w0.g g3;
            object2 = new com.github.catvod.spider.merge.K.h();
            if (g2.d() == 1) {
                g3 = g2.a();
                ((com.github.catvod.spider.merge.K.h)object2).l(((com.github.catvod.spider.merge.u0.b)((Object)g3)).i());
                ((com.github.catvod.spider.merge.K.h)object2).m(g2.c());
                if (((j)g3).j() != null && !((ArrayList)((j)g3).j()).isEmpty()) {
                    void var1_6;
                    if (((ArrayList)((com.github.catvod.spider.merge.u0.b)((Object)g3)).h()).size() >= 2) {
                        Object e2 = ((ArrayList)((com.github.catvod.spider.merge.u0.b)((Object)g3)).h()).get(1);
                    } else {
                        Object e3 = ((ArrayList)((com.github.catvod.spider.merge.u0.b)((Object)g3)).h()).get(0);
                    }
                    ((com.github.catvod.spider.merge.K.h)object2).n(Server.C((String)var1_6, "jpg"));
                }
                if (((j)g3).b()) {
                    String string = "\u76f4\u64ad";
                } else {
                    String string = com.github.catvod.spider.merge.i0.m.B(((com.github.catvod.spider.merge.u0.b)((Object)g3)).e());
                }
            } else if (g2.d() == 2) {
                g3 = g2.f();
                stringBuilder = com.github.catvod.spider.merge.C.a.c("channel@");
                stringBuilder.append(((com.github.catvod.spider.merge.w0.e)g3).e());
                ((com.github.catvod.spider.merge.K.h)object2).l(stringBuilder.toString());
                ((com.github.catvod.spider.merge.K.h)object2).m(g2.c());
                if (((com.github.catvod.spider.merge.w0.a)g3).b() != null && !((com.github.catvod.spider.merge.w0.a)g3).b().isEmpty()) {
                    ((com.github.catvod.spider.merge.K.h)object2).n("https://qph.cf2.quoracdn.net/main-qimg-8bdee2979d96b5494991bcbb72f52d32");
                }
                if (((com.github.catvod.spider.merge.w0.e)g3).h() == null) {
                    String string = "\u9891\u9053";
                } else {
                    String string = ((com.github.catvod.spider.merge.w0.e)g3).h();
                }
            } else {
                if (g2.d() != 3) continue;
                g3 = g2.g();
                stringBuilder = com.github.catvod.spider.merge.C.a.c("playlist@");
                stringBuilder.append(((com.github.catvod.spider.merge.w0.h)g3).e());
                ((com.github.catvod.spider.merge.K.h)object2).l(stringBuilder.toString());
                ((com.github.catvod.spider.merge.K.h)object2).m(g2.c());
                if (((com.github.catvod.spider.merge.w0.a)g3).b() != null && !((com.github.catvod.spider.merge.w0.a)g3).b().isEmpty()) {
                    void var1_14;
                    if (((com.github.catvod.spider.merge.w0.a)g3).b().size() >= 4) {
                        String string = ((com.github.catvod.spider.merge.w0.a)g3).b().get(3);
                    } else {
                        String string = ((com.github.catvod.spider.merge.w0.a)g3).b().get(0);
                    }
                    ((com.github.catvod.spider.merge.K.h)object2).n(Server.C((String)var1_14, "jpg"));
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(((com.github.catvod.spider.merge.w0.h)g3).h());
                stringBuilder2.append("\u4e2a\u89c6\u9891");
                String string = stringBuilder2.toString();
            }
            ((com.github.catvod.spider.merge.K.h)object2).q((String)var1_18);
            ((ArrayList)object).add(object2);
        }
        com.github.catvod.spider.merge.K.f f2 = new com.github.catvod.spider.merge.K.f();
        f2.y((List<com.github.catvod.spider.merge.K.h>)object);
        f2.k((int)(var2_20 + true), ((ArrayList)object).size(), ((ArrayList)object).size(), ((ArrayList)object).size());
        return f2.toString();
    }

    public String categoryContent(String object, String object2, boolean bl, HashMap<String, String> object3) {
        if (!"\u65f6\u4e0b\u6d41\u884c-\u521a\u521a\u53d1\u5e03\u89c6\u9891".equals(object) && !"\u65f6\u4e0b\u6d41\u884c-\u8fd1\u671f\u70ed\u95e8\u89c6\u9891".equals(object)) {
            AtomicReference<String> atomicReference = new AtomicReference<String>("");
            for (Map.Entry entry : ((HashMap)((Object)object3)).entrySet()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(atomicReference.get());
                stringBuilder.append((String)entry.getValue());
                stringBuilder.append(" ");
                atomicReference.set(stringBuilder.toString());
            }
            if (com.github.catvod.spider.merge.R0.e.d(atomicReference.get())) {
                object = atomicReference.get();
            }
            return this.s((String)object, Integer.parseInt(object2));
        }
        object2 = this.getFeedTrend((String)object);
        ((ConcurrentHashMap)this.q).put((String)object, object2);
        object = new com.github.catvod.spider.merge.K.f();
        ((com.github.catvod.spider.merge.K.f)object).y(object2);
        ((com.github.catvod.spider.merge.K.f)object).k(1, 1, 1, 1);
        return ((com.github.catvod.spider.merge.K.f)object).toString();
    }

    /*
     * WARNING - void declaration
     */
    public String detailContent(List<String> object) {
        void var3_21;
        String object22 = (String)object.get(0);
        object = object22;
        if (com.github.catvod.spider.merge.R0.e.d(Youtube.hasYouTube(object22))) {
            object = Youtube.hasYouTube(object22);
        }
        boolean bl = ((String)object).startsWith("channel@");
        Object object2 = "";
        if (!bl && !((String)object).startsWith("playlist@")) {
            if (!"\u65f6\u4e0b\u6d41\u884c-\u521a\u521a\u53d1\u5e03\u89c6\u9891".equals(object) && !"\u65f6\u4e0b\u6d41\u884c-\u8fd1\u671f\u70ed\u95e8\u89c6\u9891".equals(object)) {
                com.github.catvod.spider.merge.H1.i i2 = this.getNewPipeVideoInfo((String)object);
                if (i2 == null) {
                    object = com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6\u89c6\u9891\u4fe1\u606f\u5931\u8d25");
                } else {
                    void var3_6;
                    ArrayList<String> arrayList = new ArrayList<String>();
                    ArrayList<Object> arrayList2 = new ArrayList<Object>();
                    com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h();
                    h2.l((String)object);
                    h2.m(i2.d());
                    if (i2.m() != null) {
                        String string = i2.m().a();
                    } else {
                        String string = "";
                    }
                    h2.j((String)var3_6);
                    h2.k(i2.s());
                    if (i2.r() != null && !i2.r().isEmpty()) {
                        h2.n(Server.C(i2.r().get(i2.r().size() - 1).a(), "jpg"));
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("https://www.youtube.com/watch?v=");
                    stringBuilder.append((String)object);
                    arrayList.add(stringBuilder.toString());
                    bl = i2.q().name().contains("LIVE");
                    object = bl ? "\u76f4\u64ad" : "\u89c6\u9891";
                    arrayList2.add(object);
                    object = i2.s();
                    try {
                        Object object3 = this.n;
                        f f2 = new f((String)object);
                        object = (com.github.catvod.spider.merge.s0.c)((com.github.catvod.spider.merge.n0.d)object3).d(f2);
                        if (((com.github.catvod.spider.merge.s0.c)object).f()) {
                            object3 = ((com.github.catvod.spider.merge.w0.d)((com.github.catvod.spider.merge.s0.c)object).a()).a().get(0).f().e();
                            object = this.n;
                            b b2 = new b((String)object3);
                            com.github.catvod.spider.merge.v0.b b3 = (com.github.catvod.spider.merge.v0.b)((com.github.catvod.spider.merge.s0.c)((com.github.catvod.spider.merge.n0.d)object).a(b2)).a();
                            object = new ArrayList();
                            for (com.github.catvod.spider.merge.v0.c c2 : b3.b()) {
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append(c2.c().replace("#", "").replace("$", ""));
                                ((StringBuilder)object3).append("$");
                                ((StringBuilder)object3).append("https://www.youtube.com/watch?v=");
                                ((StringBuilder)object3).append(c2.i());
                                ((ArrayList)object).add(((StringBuilder)object3).toString());
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            if ((object = ((ArrayList)object).iterator()).hasNext()) {
                                while (true) {
                                    stringBuilder2.append((CharSequence)object.next());
                                    if (!object.hasNext()) break;
                                    stringBuilder2.append((CharSequence)"#");
                                }
                            }
                            arrayList.add(stringBuilder2.toString());
                            arrayList2.add("Up\u4e3b\u9891\u9053\u89c6\u9891");
                        }
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                    object = bl ? object2 : com.github.catvod.spider.merge.i0.m.B(i2.n());
                    h2.q((String)object);
                    object = new StringBuilder();
                    Iterator iterator = arrayList2.iterator();
                    if (iterator.hasNext()) {
                        while (true) {
                            ((StringBuilder)object).append((CharSequence)iterator.next());
                            if (!iterator.hasNext()) break;
                            ((StringBuilder)object).append((CharSequence)"$$$");
                        }
                    }
                    h2.o(((StringBuilder)object).toString());
                    object = new StringBuilder();
                    Iterator iterator2 = arrayList.iterator();
                    if (iterator2.hasNext()) {
                        while (true) {
                            ((StringBuilder)object).append((CharSequence)iterator2.next());
                            if (!iterator2.hasNext()) break;
                            ((StringBuilder)object).append((CharSequence)"$$$");
                        }
                    }
                    h2.p(((StringBuilder)object).toString());
                    object = com.github.catvod.spider.merge.K.f.n(h2);
                }
                return object;
            }
            com.github.catvod.spider.merge.K.h h3 = new com.github.catvod.spider.merge.K.h();
            h3.l((String)object);
            h3.m((String)object);
            h3.k((String)object);
            h3.o((String)object);
            object2 = new ArrayList();
            for (com.github.catvod.spider.merge.K.h h4 : (List)((ConcurrentHashMap)this.q).get(object)) {
                if (h4.c().equals(object)) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(h4.d().replace("#", "").replace("$", ""));
                stringBuilder.append("$");
                stringBuilder.append(h4.c());
                ((ArrayList)object2).add(stringBuilder.toString());
            }
            object = new StringBuilder();
            if ((object2 = ((ArrayList)object2).iterator()).hasNext()) {
                while (true) {
                    ((StringBuilder)object).append((CharSequence)object2.next());
                    if (!object2.hasNext()) break;
                    ((StringBuilder)object).append((CharSequence)"#");
                }
            }
            h3.p(((StringBuilder)object).toString());
            return com.github.catvod.spider.merge.K.f.n(h3);
        }
        if (((String)object).startsWith("channel@")) {
            String string = ((String)object).substring(8);
            com.github.catvod.spider.merge.v0.b b4 = (com.github.catvod.spider.merge.v0.b)((com.github.catvod.spider.merge.s0.c)this.n.a(new b(string))).a();
        } else {
            String string = ((String)object).substring(9);
            com.github.catvod.spider.merge.v0.b b5 = (com.github.catvod.spider.merge.v0.b)((com.github.catvod.spider.merge.s0.c)this.n.b(new c(string))).a();
        }
        object2 = new com.github.catvod.spider.merge.K.h();
        ((com.github.catvod.spider.merge.K.h)object2).l((String)object);
        ((com.github.catvod.spider.merge.K.h)object2).m(var3_21.a().b());
        ((com.github.catvod.spider.merge.K.h)object2).k(var3_21.a().a());
        object = ((String)object).startsWith("channel@") ? "\u9891\u9053" : "\u64ad\u653e\u5217\u8868";
        ((com.github.catvod.spider.merge.K.h)object2).o((String)object);
        object = new ArrayList<String>();
        for (com.github.catvod.spider.merge.v0.c c3 : var3_21.b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c3.c().replace("#", "").replace("$", ""));
            stringBuilder.append("$");
            stringBuilder.append(c3.i());
            ((ArrayList)object).add(stringBuilder.toString());
        }
        Objects.requireNonNull(com.github.catvod.spider.merge.i0.m.i(object));
        StringBuilder stringBuilder = new StringBuilder();
        object = ((ArrayList)object).iterator();
        if (object.hasNext()) {
            while (true) {
                stringBuilder.append((CharSequence)object.next());
                if (!object.hasNext()) break;
                stringBuilder.append((CharSequence)"#");
            }
        }
        ((com.github.catvod.spider.merge.K.h)object2).p(stringBuilder.toString());
        return com.github.catvod.spider.merge.K.f.n((com.github.catvod.spider.merge.K.h)object2);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public List<com.github.catvod.spider.merge.K.h> getFeedTrend(String object) {
        Object object2 = new HashMap<String, String>();
        ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/2.5.20 Chrome/100.0.4896.160 Electron/18.3.5.4-b478491100 Safari/537.36 Channel/pckk_other_ch");
        ArrayList<com.github.catvod.spider.merge.K.h> arrayList = com.github.catvod.spider.merge.f0.g.g("https://www.youtube.com/feed/trending", object2);
        object2 = new com.github.catvod.spider.merge.t0.b(new a(this.s));
        object2 = ((com.github.catvod.spider.merge.t0.b)object2).b((String)((Object)arrayList));
        try {
            object2 = ((com.github.catvod.spider.merge.y.e)object2).u("contents").u("twoColumnBrowseResultsRenderer").t("tabs").p(0).u("tabRenderer").u("content").u("sectionListRenderer").t("contents");
        }
        catch (NullPointerException nullPointerException) {
            try {
                com.github.catvod.spider.merge.n0.e e2 = new com.github.catvod.spider.merge.n0.e("Search result root contents not found");
                throw e2;
            }
            catch (h h3) {
                SpiderDebug.log((String)h3.getMessage());
                return null;
            }
        }
        int n2 = ((String)object).equals("\u65f6\u4e0b\u6d41\u884c-\u8fd1\u671f\u70ed\u95e8\u89c6\u9891") ? ((com.github.catvod.spider.merge.y.b)object2).size() - 1 : ((com.github.catvod.spider.merge.y.b)object2).size() - 2;
        object2 = ((com.github.catvod.spider.merge.y.b)object2).p(n2).u("itemSectionRenderer").t("contents").p(0).u("shelfRenderer").u("content").u("expandedShelfContentsRenderer").t("items");
        arrayList = new ArrayList<com.github.catvod.spider.merge.K.h>();
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("\u5171");
        ((StringBuilder)serializable).append(((com.github.catvod.spider.merge.y.b)object2).size());
        ((StringBuilder)serializable).append("\u4e2a\u89c6\u9891");
        com.github.catvod.spider.merge.K.h h2 = new com.github.catvod.spider.merge.K.h((String)object, "\u5408\u96c6", "", ((StringBuilder)serializable).toString());
        arrayList.add(h2);
        for (n2 = 0; n2 < ((com.github.catvod.spider.merge.y.b)object2).size(); ++n2) {
            serializable = ((com.github.catvod.spider.merge.y.b)object2).p(n2).u("videoRenderer");
            h2 = new com.github.catvod.spider.merge.K.h();
            h2.l(((com.github.catvod.spider.merge.y.e)serializable).x("videoId"));
            h2.m(((com.github.catvod.spider.merge.y.e)serializable).u("title").t("runs").p(0).x("text"));
            object = ((com.github.catvod.spider.merge.y.e)serializable).u("thumbnail").t("thumbnails");
            h2.n(Server.C(((com.github.catvod.spider.merge.y.b)object).p(((com.github.catvod.spider.merge.y.b)object).size() - 1).x("url"), "jpg"));
            h2.q(((com.github.catvod.spider.merge.y.e)serializable).u("lengthText").x("simpleText"));
            arrayList.add(h2);
        }
        return arrayList;
    }

    public String getMpd(com.github.catvod.spider.merge.A0.b object) {
        ArrayList arrayList = new ArrayList();
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 24) {
            ((com.github.catvod.spider.merge.A0.b)object).c().stream().filter(G.a).filter(x.a).filter(H.a).sorted(Comparator.comparing(E.a).reversed()).forEach(new u(arrayList, 0));
            if (arrayList.isEmpty()) {
                ((com.github.catvod.spider.merge.A0.b)object).c().stream().filter(G.a).filter(y.a).filter(v.a).sorted(Comparator.comparing(E.a).reversed()).forEach(new z(arrayList));
            }
        }
        List list = null;
        if (n2 >= 24) {
            list = ((com.github.catvod.spider.merge.A0.b)object).a().stream().filter(F.a).filter(w.a).collect(Collectors.toList());
        }
        String string = ((com.github.catvod.spider.merge.A0.b)object).b().i();
        object = n2 >= 24 ? String.format("<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT1.5S\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", ((com.github.catvod.spider.merge.A0.b)object).b().e(), ((com.github.catvod.spider.merge.A0.b)object).b().e(), arrayList.stream().map(new D(this, string)).collect(Collectors.joining()), list.stream().map(new C(this, string)).collect(Collectors.joining())) : "";
        return object;
    }

    public String getMpd(com.github.catvod.spider.merge.H1.i object) {
        String string = ((com.github.catvod.spider.merge.k1.d)object).g().substring(((com.github.catvod.spider.merge.k1.d)object).g().lastIndexOf("=") + 1);
        List<com.github.catvod.spider.merge.H1.r> list = ((com.github.catvod.spider.merge.H1.i)object).t();
        List<com.github.catvod.spider.merge.H1.b> list2 = ((com.github.catvod.spider.merge.H1.i)object).k();
        object = Build.VERSION.SDK_INT >= 24 ? String.format("<MPD xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"urn:mpeg:dash:schema:mpd:2011\" xsi:schemaLocation=\"urn:mpeg:dash:schema:mpd:2011 DASH-MPD.xsd\" type=\"static\" mediaPresentationDuration=\"PT%sS\" minBufferTime=\"PT1.5S\" profiles=\"urn:mpeg:dash:profile:isoff-on-demand:2011\">\n<Period duration=\"PT%sS\" start=\"PT0S\">\n%s\n%s\n</Period>\n</MPD>", ((com.github.catvod.spider.merge.H1.i)object).n(), ((com.github.catvod.spider.merge.H1.i)object).n(), list.stream().map(new B(this, string)).collect(Collectors.joining()), list2.stream().map(new A(this, string)).collect(Collectors.joining())) : "";
        return object;
    }

    public com.github.catvod.spider.merge.H1.i getNewPipeVideoInfo(String string) {
        if (!((ConcurrentHashMap)this.r).containsKey(string)) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("getNewPipeVideoInfo: https://www.youtube.com/watch?v=");
                stringBuilder.append(string);
                SpiderDebug.log((String)stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("https://www.youtube.com/watch?v=");
                stringBuilder.append(string);
                com.github.catvod.spider.merge.H1.i i2 = com.github.catvod.spider.merge.H1.i.p(stringBuilder.toString());
                if (!i2.t().isEmpty()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("getNewPipeVideoInfo:");
                    Gson gson = new Gson();
                    stringBuilder.append(gson.toJson((Object)i2));
                    SpiderDebug.log((String)stringBuilder.toString());
                    ((ConcurrentHashMap)this.r).put(string, i2);
                }
            }
            catch (Throwable throwable) {
                SpiderDebug.log((String)throwable.getMessage());
                return null;
            }
        }
        return (com.github.catvod.spider.merge.H1.i)((ConcurrentHashMap)this.r).get(string);
    }

    public com.github.catvod.spider.merge.A0.b getVideoInfo(String charSequence) {
        if (((ConcurrentHashMap)Youtube.get().o).get(charSequence) == null) {
            Object object = (com.github.catvod.spider.merge.s0.c)Youtube.get().n.c(new g((String)charSequence));
            if (((com.github.catvod.spider.merge.s0.c)object).c() != null) {
                charSequence = com.github.catvod.spider.merge.C.a.c("\u83b7\u53d6\u64ad\u653e\u5730\u5740\u5931\u8d25 \u8bf7\u914d\u7f6e\u4e0byoutube cookie\u6216\u5230\u914d\u7f6e\u4e2d\u5fc3\u624b\u52a8\u66f4\u6362\u8282\u70b9\u91cd\u8bd5");
                ((StringBuilder)charSequence).append(((com.github.catvod.spider.merge.s0.c)object).c().getMessage());
                com.github.catvod.spider.merge.i0.m.y(((StringBuilder)charSequence).toString());
                return null;
            }
            object = (com.github.catvod.spider.merge.A0.b)((com.github.catvod.spider.merge.s0.c)object).a();
            StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("getVideoInfo:");
            stringBuilder.append(new Gson().toJson(object));
            SpiderDebug.log((String)stringBuilder.toString());
            ((ConcurrentHashMap)Youtube.get().o).put((String)charSequence, (com.github.catvod.spider.merge.A0.b)object);
            return object;
        }
        return (com.github.catvod.spider.merge.A0.b)((ConcurrentHashMap)Youtube.get().o).get(charSequence);
    }

    public String homeContent(boolean bl) {
        if (this.m.has("json")) {
            return com.github.catvod.spider.merge.f0.d.k(this.m.get("json").getAsString());
        }
        ArrayList<com.github.catvod.spider.merge.K.a> arrayList = new ArrayList<com.github.catvod.spider.merge.K.a>();
        LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>> linkedHashMap = new LinkedHashMap<String, List<com.github.catvod.spider.merge.K.c>>();
        for (String string : this.m.get("type").getAsString().split("#")) {
            arrayList.add(new com.github.catvod.spider.merge.K.a(string, string));
            ArrayList<com.github.catvod.spider.merge.K.c> arrayList2 = new ArrayList<com.github.catvod.spider.merge.K.c>();
            arrayList2.add(new com.github.catvod.spider.merge.K.c("order", "\u6392\u5e8f", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u9810\u8a2d", "totalrank"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u9ede\u64ca", "click"), new com.github.catvod.spider.merge.K.b("\u6700\u65b0\u767c\u5e03", "pubdate"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u5f48\u5e55", "dm"), new com.github.catvod.spider.merge.K.b("\u6700\u591a\u6536\u85cf", "stow"))));
            arrayList2.add(new com.github.catvod.spider.merge.K.c("duration", "\u6642\u9577", Arrays.asList(new com.github.catvod.spider.merge.K.b("\u5168\u90e8\u6642\u9577", "0"), new com.github.catvod.spider.merge.K.b("60\u5206\u9418\u4ee5\u4e0a", "4"), new com.github.catvod.spider.merge.K.b("30~60\u5206\u9418", "3"), new com.github.catvod.spider.merge.K.b("10~30\u5206\u9418", "2"), new com.github.catvod.spider.merge.K.b("10\u5206\u9418\u4ee5\u4e0b", "1"))));
            ((AbstractMap)linkedHashMap).put(string, arrayList2);
        }
        return com.github.catvod.spider.merge.K.f.q(arrayList, linkedHashMap);
    }

    public String homeVideoContent() {
        return "";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void init(Context object, String object2) {
        block9: {
            Object object3;
            super.init((Context)object, (String)object3);
            this.m = JsonParser.parseString((String)object3).getAsJsonObject();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("extend:");
            stringBuilder.append((String)object3);
            SpiderDebug.log((String)stringBuilder.toString());
            com.github.catvod.spider.merge.n0.b b2 = new com.github.catvod.spider.merge.n0.b();
            b2.g();
            b2.f("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
            b2.f("Accept-language", "en-US,en;");
            this.s = b2.e();
            try {
                void var1_7;
                JSONObject jSONObject;
                JsonObject jsonObject = this.m;
                if (jsonObject.get("commonConfig") == null) break block9;
                object3 = jsonObject.get("commonConfig").getAsString();
                String string = object3;
                if (((String)object3).startsWith("http")) {
                    String string2 = com.github.catvod.spider.merge.f0.d.k((String)object3);
                }
                if ((jSONObject = new JSONObject(var1_7.trim())).has("proxy") && com.github.catvod.spider.merge.R0.e.d(jSONObject.getString("proxy"))) {
                    void var1_16;
                    void var1_13;
                    String string3 = jSONObject.getString("proxy");
                    i i2 = new i();
                    i2.f(string3);
                    String string4 = i2.a();
                    int n2 = i2.c();
                    String string5 = i2.e();
                    String string6 = i2.b();
                    object3 = "";
                    boolean bl = com.github.catvod.spider.merge.R0.e.d(string5);
                    String string7 = object3;
                    if (bl) {
                        String string8 = object3;
                        if (!string5.equals("null")) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(string5);
                            stringBuilder2.append(":");
                            stringBuilder2.append(string6);
                            String string9 = stringBuilder2.toString();
                        }
                    }
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("uri.getUserInfo :");
                    ((StringBuilder)object3).append((String)var1_13);
                    SpiderDebug.log((String)((StringBuilder)object3).toString());
                    if (var1_13.contains(":")) {
                        com.github.catvod.spider.merge.f0.g.f((String)var1_13);
                    }
                    object3 = this.s;
                    if (string3.startsWith("http")) {
                        Proxy.Type type = Proxy.Type.HTTP;
                    } else {
                        Proxy.Type type = Proxy.Type.SOCKS;
                    }
                    ((com.github.catvod.spider.merge.n0.c)object3).h((Proxy.Type)var1_16, string4, n2);
                }
            }
            catch (Exception exception) {
                SpiderDebug.log((Throwable)exception);
            }
        }
        this.n = new com.github.catvod.spider.merge.n0.d(this.s);
        Youtube.get().s = this.s;
        Youtube.get().n = this.n;
    }

    public String playerContent(String object, String object2, List<String> object3) {
        com.github.catvod.spider.merge.H1.i i2;
        boolean bl = BaseApi.isOk("youtube");
        object3 = "";
        if (bl) {
            return "";
        }
        object = object2;
        if (com.github.catvod.spider.merge.R0.e.d(Youtube.hasYouTube((String)object2))) {
            object = Youtube.hasYouTube((String)object2);
        }
        if ((i2 = this.getNewPipeVideoInfo((String)object)) == null) {
            return com.github.catvod.spider.merge.K.f.d("\u83b7\u53d6\u89c6\u9891\u4fe1\u606f\u5931\u8d25");
        }
        object2 = new com.github.catvod.spider.merge.K.f();
        if (i2.q().name().contains("LIVE")) {
            if (com.github.catvod.spider.merge.R0.e.d(i2.o())) {
                object = i2.o();
            } else {
                object = object3;
                if (com.github.catvod.spider.merge.R0.e.d(i2.l())) {
                    object = i2.l();
                }
            }
            object = Server.G((String)object);
        } else {
            object = Server.I((String)object);
        }
        ((com.github.catvod.spider.merge.K.f)object2).w((String)object);
        object = new HashMap<String, String>();
        ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
        ((HashMap)object).put("Referer", "https://www.youtube.com");
        ((HashMap)object).put("cookie", (String)((HashMap)this.s.c()).get("cookie"));
        ((com.github.catvod.spider.merge.K.f)object2).g((Map<String, String>)object);
        return ((com.github.catvod.spider.merge.K.f)object2).toString();
    }

    public String searchContent(String string, boolean bl) {
        return this.s(string, 0);
    }

    public String searchContent(String string, boolean bl, String string2) {
        return this.s(string, Integer.valueOf(string2));
    }
}

