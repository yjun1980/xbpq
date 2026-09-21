/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.c;
import com.github.catvod.spider.merge.D1.g;
import com.github.catvod.spider.merge.D1.q;
import com.github.catvod.spider.merge.D1.r;
import com.github.catvod.spider.merge.D1.s;
import com.github.catvod.spider.merge.D1.t;
import com.github.catvod.spider.merge.D1.u;
import com.github.catvod.spider.merge.D1.v;
import com.github.catvod.spider.merge.D1.w;
import com.github.catvod.spider.merge.D1.x;
import com.github.catvod.spider.merge.D1.y;
import com.github.catvod.spider.merge.D1.z;
import com.github.catvod.spider.merge.E0.O;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.F0.k;
import com.github.catvod.spider.merge.F0.l;
import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.e1.o;
import com.github.catvod.spider.merge.m1.d;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.p1.a;
import com.github.catvod.spider.merge.p1.e;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class A {
    private static String a;
    private static boolean b;
    private static Optional<Boolean> c;
    private static final String[] d;
    private static final String[] e;
    private static Random f;
    private static final Set<String> g;
    private static final Set<String> h;
    private static final Set<String> i;
    public static final int j = 0;

    static {
        Object object;
        int n2;
        c = Optional.empty();
        d = new String[]{"INNERTUBE_CONTEXT_CLIENT_VERSION\":\"([0-9\\.]+?)\"", "innertube_context_client_version\":\"([0-9\\.]+?)\"", "client.version=([0-9\\.]+)"};
        e = new String[]{"window\\[\"ytInitialData\"\\]\\s*=\\s*(\\{.*?\\});", "var\\s*ytInitialData\\s*=\\s*(\\{.*?\\});"};
        f = new Random();
        Pattern.compile("&c=WEB");
        Pattern.compile("&c=WEB_EMBEDDED_PLAYER");
        Pattern.compile("&c=ANDROID");
        Pattern.compile("&c=IOS");
        Pattern.compile("&c=VISIONOS");
        int n3 = 0;
        HashSet<Object> hashSet = new HashSet<Object>(3);
        for (n2 = 0; n2 < 3; ++n2) {
            object = (new Object[]{"google.", "m.google.", "www.google."})[n2];
            Objects.requireNonNull(object);
            if (hashSet.add(object)) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate element: ", object));
        }
        g = Collections.unmodifiableSet(hashSet);
        hashSet = new HashSet(9);
        for (n2 = 0; n2 < 9; ++n2) {
            object = (new Object[]{"redirect.invidious.io", "yewtu.be", "piped.kavin.rocks", "piped.video", "inv.nadeko.net", "invidious.nerdvpn.de", "yt.chocolatemoo53.com", "invidious.tiekoetter.com", "invidious.f5.si"})[n2];
            Objects.requireNonNull(object);
            if (hashSet.add(object)) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate element: ", object));
        }
        h = Collections.unmodifiableSet(hashSet);
        hashSet = new HashSet(4);
        for (n2 = n3; n2 < 4; ++n2) {
            object = (new Object[]{"youtube.com", "www.youtube.com", "m.youtube.com", "music.youtube.com"})[n2];
            Objects.requireNonNull(object);
            if (hashSet.add(object)) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate element: ", object));
        }
        i = Collections.unmodifiableSet(hashSet);
    }

    public static boolean A(URL object) {
        boolean bl = ((String)(object = ((URL)object).getHost())).equalsIgnoreCase("www.youtube-nocookie.com") || ((String)object).equalsIgnoreCase("youtu.be");
        return bl;
    }

    public static boolean B(URL uRL) {
        return i.contains(uRL.getHost().toLowerCase(Locale.ROOT));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int C(String string) {
        if (!string.matches(".*\\d.*") && !string.equalsIgnoreCase("SHORTS")) {
            throw new i(com.github.catvod.spider.merge.B.e.c("Error duration string contains no digits: ", string));
        }
        String[] stringArray = ":";
        if (!string.contains(":")) {
            stringArray = "\\.";
        }
        stringArray = string.split((String)stringArray);
        int n2 = 4 - stringArray.length;
        if (n2 < 0) {
            throw new i(com.github.catvod.spider.merge.B.e.c("Error duration string with unknown format: ", string));
        }
        int n3 = 0;
        int n4 = 0;
        while (n3 < stringArray.length) {
            int n5;
            int n6 = (new int[]{24, 60, 60, 1})[n3 + n2];
            string = stringArray[n3];
            if (string != null && !string.isEmpty()) {
                n5 = p.c;
                string = string.replaceAll("\\D+", "");
                try {
                    n5 = Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            n5 = 0;
            n4 = (n4 + n5) * n6;
            ++n3;
        }
        return n4;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static com.github.catvod.spider.merge.F0.d D(e e2, a a2, c c2) {
        com.github.catvod.spider.merge.F0.d<com.github.catvod.spider.merge.F0.e> d2 = com.github.catvod.spider.merge.F0.e.a();
        d2.d("context");
        d2.d("client");
        d2.f("clientName", c2.a.a);
        d2.f("clientVersion", c2.a.b);
        Objects.requireNonNull(c2.a);
        Objects.requireNonNull(c2.a);
        d2.f("clientScreen", "WATCH");
        String string = c2.b.a;
        if (string != null) {
            d2.f("platform", string);
        }
        if ((string = c2.a.c) != null) {
            d2.f("visitorData", string);
        }
        if ((string = c2.b.b) != null) {
            d2.f("deviceMake", string);
        }
        if ((string = c2.b.c) != null) {
            d2.f("deviceModel", string);
        }
        if ((string = c2.b.d) != null) {
            d2.f("osName", string);
        }
        if ((string = c2.b.e) != null) {
            d2.f("osVersion", string);
        }
        Objects.requireNonNull(c2.b);
        d2.f("hl", e2.c());
        d2.f("gl", a2.a());
        d2.e();
        d2.c();
        d2.d("request");
        d2.a();
        d2.c();
        d2.g("useSsl", true);
        d2.c();
        d2.d("user");
        d2.g("lockedSafetyMode", false);
        d2.c();
        d2.c();
        return d2;
    }

    public static /* synthetic */ boolean a(com.github.catvod.spider.merge.F0.e e2) {
        return e2.g("element").g("type").g("imageType").g("image").b("sources").c().anyMatch(z.c);
    }

    public static int b(String string) {
        int n2;
        if (string == null) {
            return 0;
        }
        try {
            string = com.github.catvod.spider.merge.G1.f.w(Base64.getUrlDecoder().decode(string)).v().stream().filter(x.a).findFirst().map(q.a).orElse(null);
            if (string == null) {
                return 0;
            }
            n2 = -1;
        }
        catch (O o2) {
            return 0;
        }
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1379043793: {
                if (!string.equals("original")) break;
                n2 = 4;
                break;
            }
            case -512872340: {
                if (!string.equals("dubbed-auto")) break;
                n2 = 3;
                break;
            }
            case -817598092: {
                if (!string.equals("secondary")) break;
                n2 = 2;
                break;
            }
            case -1320983312: {
                if (!string.equals("dubbed")) break;
                n2 = 1;
                break;
            }
            case -1724545844: {
                if (!string.equals("descriptive")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                return 0;
            }
            case 4: {
                return 1;
            }
            case 2: {
                return 4;
            }
            case 1: 
            case 3: {
                return 2;
            }
            case 0: 
        }
        return 3;
    }

    public static String c(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (string.contains("webcache.googleusercontent.com")) {
            string2 = string.split("cache:")[1];
        }
        return string2;
    }

    private static void d() {
        if (b) {
            return;
        }
        Object object = A.n();
        object = com.github.catvod.spider.merge.k1.l.a().c("https://www.youtube.com/sw.js", (Map<String, List<String>>)object).c();
        try {
            a = p.g((String)object, d);
            b = true;
            return;
        }
        catch (com.github.catvod.spider.merge.K1.o o2) {
            throw new i("Could not extract YouTube WEB InnerTube client version from sw.js", o2);
        }
    }

    public static int e(String string) {
        if (!p.j(string)) {
            if (A.z(string)) {
                return 3;
            }
            if (string.startsWith("RDGMEM")) {
                return 5;
            }
            if (string.startsWith("RD")) {
                return 2;
            }
            return 1;
        }
        throw new i("Could not extract playlist type from empty playlist id");
    }

    public static String f(String string) {
        block2: {
            block6: {
                block7: {
                    block8: {
                        int n2;
                        block4: {
                            block5: {
                                block3: {
                                    if (p.j(string)) break block2;
                                    if (!string.startsWith("RDMM")) break block3;
                                    n2 = 4;
                                    break block4;
                                }
                                if (!A.z(string)) break block5;
                                n2 = 6;
                                break block4;
                            }
                            if (string.startsWith("RDGMEM")) break block6;
                            if (!string.startsWith("RD")) break block7;
                            if (string.length() != 13) break block8;
                            n2 = 2;
                        }
                        return string.substring(n2);
                    }
                    throw new i(com.github.catvod.spider.merge.B.e.c("Video id could not be determined from mix id: ", string));
                }
                throw new i(com.github.catvod.spider.merge.B.e.c("Video id could not be determined from playlist id: ", string));
            }
            throw new i(com.github.catvod.spider.merge.B.e.c("Video id could not be determined from genre mix id: ", string));
        }
        throw new i("Video id could not be determined from empty playlist id");
    }

    public static String g(String string) {
        String string2 = string;
        if (string.startsWith("//")) {
            string2 = string.substring(2);
        }
        if (string2.startsWith("http://")) {
            string = p.p(string2);
        } else {
            string = string2;
            if (!string2.startsWith("https://")) {
                string = com.github.catvod.spider.merge.B.e.c("https://", string2);
            }
        }
        return string;
    }

    public static String h() {
        return com.github.catvod.spider.merge.J.j.b(16, f);
    }

    public static String i() {
        return com.github.catvod.spider.merge.J.j.b(12, f);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static Map j(String object) {
        AbstractMap.SimpleEntry<String, Object> simpleEntry;
        int n2;
        int n3 = 0;
        List<Object> list = new ArrayList(1);
        for (n2 = 0; n2 < 1; ++n2) {
            simpleEntry = (new Object[]{"1"})[n2];
            Objects.requireNonNull(simpleEntry);
            list.add(simpleEntry);
        }
        list = Collections.unmodifiableList(list);
        Cloneable cloneable = new ArrayList<AbstractMap.SimpleEntry<String, Object>>(1);
        for (n2 = 0; n2 < 1; ++n2) {
            simpleEntry = (new Object[]{object})[n2];
            Objects.requireNonNull(simpleEntry);
            ((ArrayList)cloneable).add(simpleEntry);
        }
        simpleEntry = Collections.unmodifiableList(cloneable);
        object = new AbstractMap.SimpleEntry("X-YouTube-Client-Name", list);
        simpleEntry = new AbstractMap.SimpleEntry<String, Object>("X-YouTube-Client-Version", simpleEntry);
        cloneable = new HashMap(2);
        for (n2 = n3; n2 < 2; ++n2) {
            Map.Entry entry = (new Map.Entry[]{object, simpleEntry})[n2];
            list = entry.getKey();
            Objects.requireNonNull(list);
            entry = entry.getValue();
            Objects.requireNonNull(entry);
            if (((HashMap)cloneable).put(list, entry) == null) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate key: ", list));
        }
        return Collections.unmodifiableMap(cloneable);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String k() {
        Object object;
        int n2;
        Optional<Boolean> optional;
        boolean bl;
        block17: {
            if (!p.j(a)) {
                return a;
            }
            bl = false;
            try {
                A.d();
            }
            catch (Exception exception) {
                void var3_5;
                Map.Entry entry;
                if (b) break block17;
                optional = com.github.catvod.spider.merge.k1.l.a();
                Object object2 = new ArrayList(1);
                for (n2 = 0; n2 < 1; ++n2) {
                    object = (new Object[]{"SOCS=CAE="})[n2];
                    Objects.requireNonNull(object);
                    ((ArrayList)object2).add(object);
                }
                AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry("Cookie", Collections.unmodifiableList(object2));
                object = new HashMap(1);
                for (n2 = 0; n2 < 1; entry = entry.getValue(), ++n2) {
                    entry = (new Map.Entry[]{simpleEntry})[n2];
                    object2 = entry.getKey();
                    Objects.requireNonNull(object2);
                    Objects.requireNonNull(entry);
                    if (((HashMap)object).put(object2, entry) != null) throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate key: ", object2));
                }
                object = ((com.github.catvod.spider.merge.m1.a)((Object)optional)).c("https://www.youtube.com/results?search_query=&ucbcb=1", Collections.unmodifiableMap(object)).c();
                try {
                    optional = com.github.catvod.spider.merge.F0.g.d().a(p.g((String)object, e));
                    optional = ((com.github.catvod.spider.merge.F0.e)((Object)optional)).g("responseContext").b("serviceTrackingParams").c();
                }
                catch (com.github.catvod.spider.merge.K1.o o3) {
                    throw new i("Could not get ytInitialData", (Throwable)var3_5);
                }
                catch (h h2) {
                    // empty catch block
                    throw new i("Could not get ytInitialData", (Throwable)var3_5);
                }
                a = object2 = A.l(optional, "CSI", "cver");
                if (object2 == null) {
                    try {
                        a = p.g((String)object, d);
                    }
                    catch (com.github.catvod.spider.merge.K1.o o2) {
                        // empty catch block
                    }
                }
                if (p.j(a)) {
                    a = A.l(optional, "ECATCHER", "client.version");
                }
                if (a == null) throw new i("Could not extract YouTube WEB InnerTube client version from HTML search results page");
                b = true;
            }
        }
        if (b) {
            return a;
        }
        if (c.isPresent()) {
            optional = c;
        } else {
            optional = k.a();
            ((l)((Object)optional)).j();
            ((l)((Object)optional)).k("context");
            ((l)((Object)optional)).k("client");
            optional = (com.github.catvod.spider.merge.F0.i)((com.github.catvod.spider.merge.F0.i)((com.github.catvod.spider.merge.F0.i)((com.github.catvod.spider.merge.F0.i)((com.github.catvod.spider.merge.F0.i)((l)((Object)optional)).u("hl", "en-GB")).u("gl", "GB")).u("clientName", "WEB")).u("clientVersion", "2.20260805.01.00")).u("platform", "DESKTOP");
            ((l)((Object)optional)).s();
            ((l)((Object)optional)).g();
            ((l)((Object)optional)).k("request");
            ((l)((Object)optional)).c("internalExperimentFlags");
            ((l)((Object)optional)).g();
            ((l)((Object)optional)).v("useSsl", true);
            ((l)((Object)optional)).g();
            ((l)((Object)optional)).k("user");
            ((l)((Object)optional)).v("lockedSafetyMode", false);
            ((l)((Object)optional)).g();
            ((l)((Object)optional)).g();
            ((l)((Object)optional)).v("fetchLiveState", true);
            ((l)((Object)optional)).g();
            optional = (Optional<Boolean>)((com.github.catvod.spider.merge.F0.i)((Object)optional)).w().getBytes(StandardCharsets.UTF_8);
            object = A.j("2.20260805.01.00");
            object = com.github.catvod.spider.merge.k1.l.a().e("https://www.youtube.com/youtubei/v1/guide?prettyPrint=false", (Map<String, List<String>>)object, (byte[])optional);
            optional = ((d)object).c();
            n2 = ((d)object).d();
            boolean bl2 = bl;
            if (((String)((Object)optional)).length() > 5000) {
                bl2 = bl;
                if (n2 == 200) {
                    bl2 = true;
                }
            }
            optional = Optional.of(bl2);
            c = optional;
        }
        if ((Boolean)optional.get() == false) throw new com.github.catvod.spider.merge.n1.e("Could not get YouTube WEB client version");
        a = "2.20260805.01.00";
        return "2.20260805.01.00";
    }

    private static String l(Stream<com.github.catvod.spider.merge.F0.e> stream, String string, String string2) {
        return stream.filter(new t(string)).flatMap(r.a).filter(new com.github.catvod.spider.merge.v1.g(string2, 1)).map(s.a).filter(w.a).findFirst().orElse(null);
    }

    public static List<com.github.catvod.spider.merge.k1.c> m(com.github.catvod.spider.merge.F0.c c2) {
        return c2.c().filter(z.b).map(com.github.catvod.spider.merge.D1.g.c).collect(Collectors.toList());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static Map n() {
        Object object;
        int n2;
        int n3 = 0;
        Serializable serializable = new ArrayList(1);
        for (n2 = 0; n2 < 1; ++n2) {
            object = (new Object[]{"https://www.youtube.com"})[n2];
            Objects.requireNonNull(object);
            ((ArrayList)serializable).add(object);
        }
        object = Collections.unmodifiableList(serializable);
        serializable = new AbstractMap.SimpleEntry("Origin", object);
        AbstractMap.SimpleEntry<String, Object> simpleEntry = new AbstractMap.SimpleEntry<String, Object>("Referer", object);
        HashMap<Object, Map.Entry> hashMap = new HashMap<Object, Map.Entry>(2);
        for (n2 = n3; n2 < 2; ++n2) {
            Map.Entry entry = (new Map.Entry[]{serializable, simpleEntry})[n2];
            object = entry.getKey();
            Objects.requireNonNull(object);
            entry = entry.getValue();
            Objects.requireNonNull(entry);
            if (hashMap.put(object, entry) == null) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate key: ", object));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static String o(com.github.catvod.spider.merge.F0.e object, boolean bl) {
        String string;
        if (p.l(object)) {
            return null;
        }
        if (((AbstractMap)object).containsKey("simpleText")) {
            return ((com.github.catvod.spider.merge.F0.e)object).i("simpleText", null);
        }
        if (((AbstractCollection)(object = ((com.github.catvod.spider.merge.F0.e)object).b("runs"))).isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = ((AbstractCollection)object).iterator();
        while (iterator.hasNext()) {
            com.github.catvod.spider.merge.F0.e e2 = (com.github.catvod.spider.merge.F0.e)iterator.next();
            string = e2.i("text", null);
            if (bl) {
                object = string;
                if (((AbstractMap)e2).containsKey("navigationEndpoint")) {
                    String string2 = A.r(e2.g("navigationEndpoint"));
                    object = string;
                    if (!p.j(string2)) {
                        object = com.github.catvod.spider.merge.I.r.b("<a href=\"", o.d(string2), "\">", o.d(string), "</a>");
                    }
                }
                boolean bl2 = ((AbstractMap)e2).containsKey("bold");
                boolean bl3 = true;
                boolean bl4 = bl2 && e2.c("bold");
                boolean bl5 = ((AbstractMap)e2).containsKey("italics") && e2.c("italics");
                if (!((AbstractMap)e2).containsKey("strikethrough") || !e2.c("strikethrough")) {
                    bl3 = false;
                }
                if (bl4) {
                    stringBuilder.append("<b>");
                }
                if (bl5) {
                    stringBuilder.append("<i>");
                }
                if (bl3) {
                    stringBuilder.append("<s>");
                }
                stringBuilder.append((String)object);
                if (bl3) {
                    stringBuilder.append("</s>");
                }
                if (bl5) {
                    stringBuilder.append("</i>");
                }
                if (!bl4) continue;
                stringBuilder.append("</b>");
                continue;
            }
            stringBuilder.append(string);
        }
        string = stringBuilder.toString();
        object = string;
        if (bl) {
            object = string.replaceAll("\\n", "<br>").replaceAll(" {2}", " &nbsp;");
        }
        return object;
    }

    public static String p(com.github.catvod.spider.merge.F0.e object, String string) {
        if ((object = A.o((com.github.catvod.spider.merge.F0.e)object, false)) != null) {
            return object;
        }
        throw new i(com.github.catvod.spider.merge.B.e.c("Could not extract text: ", string));
    }

    public static List<com.github.catvod.spider.merge.k1.c> q(com.github.catvod.spider.merge.F0.e object) {
        try {
            object = A.m(((com.github.catvod.spider.merge.F0.e)object).g("thumbnail").b("thumbnails"));
            return object;
        }
        catch (Exception exception) {
            throw new i("Could not get thumbnails from InfoItem", exception);
        }
    }

    public static String r(com.github.catvod.spider.merge.F0.e e2) {
        CharSequence charSequence;
        if (((AbstractMap)e2).containsKey("urlEndpoint")) {
            String object2 = e2.g("urlEndpoint").i("url", null);
            charSequence = object2;
            if (object2.startsWith("https://www.youtube.com/redirect?")) {
                charSequence = object2.substring(23);
            }
            if (((String)charSequence).startsWith("/redirect?")) {
                for (CharSequence charSequence2 : ((String)charSequence).substring(10).split("&")) {
                    if (!((String)charSequence2).split("=")[0].equals("q")) continue;
                    return p.b(((String)charSequence2).split("=")[1]);
                }
            } else {
                if (((String)charSequence).startsWith("http")) {
                    return charSequence;
                }
                if (((String)charSequence).startsWith("/channel") || ((String)charSequence).startsWith("/user") || ((String)charSequence).startsWith("/watch")) {
                    return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com", (String)charSequence);
                }
            }
        }
        if (((AbstractMap)e2).containsKey("browseEndpoint")) {
            com.github.catvod.spider.merge.F0.e e3 = e2.g("browseEndpoint");
            charSequence = e3.i("canonicalBaseUrl", null);
            String string = e3.i("browseId", null);
            if (string != null) {
                if (string.startsWith("UC")) {
                    return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/channel/", string);
                }
                if (string.startsWith("VL")) {
                    return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/playlist?list=", string.substring(2));
                }
            }
            if (!p.j((String)charSequence)) {
                return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com", (String)charSequence);
            }
        }
        if (((AbstractMap)e2).containsKey("watchEndpoint")) {
            charSequence = com.github.catvod.spider.merge.C.a.c("https://www.youtube.com/watch?v=");
            ((StringBuilder)charSequence).append(e2.g("watchEndpoint").i("videoId", null));
            if (((AbstractMap)e2.g("watchEndpoint")).containsKey("playlistId")) {
                ((StringBuilder)charSequence).append("&list=");
                ((StringBuilder)charSequence).append(e2.g("watchEndpoint").i("playlistId", null));
            }
            if (((AbstractMap)e2.g("watchEndpoint")).containsKey("startTimeSeconds")) {
                ((StringBuilder)charSequence).append("&t=");
                ((StringBuilder)charSequence).append(e2.g("watchEndpoint").e("startTimeSeconds", 0));
            }
            return ((StringBuilder)charSequence).toString();
        }
        if (((AbstractMap)e2).containsKey("watchPlaylistEndpoint")) {
            return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/playlist?list=", e2.g("watchPlaylistEndpoint").i("playlistId", null));
        }
        if (((AbstractMap)e2).containsKey("showDialogCommand")) {
            try {
                charSequence = A.r(com.github.catvod.spider.merge.K1.f.f(com.github.catvod.spider.merge.K1.f.a(e2, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0), "listItemViewModel.rendererContext.commandContext.onTap.innertubeCommand"));
                return charSequence;
            }
            catch (i i2) {
                // empty catch block
            }
        }
        if (((AbstractMap)e2).containsKey("commandMetadata") && ((AbstractMap)(e2 = e2.g("commandMetadata").g("webCommandMetadata"))).containsKey("url")) {
            return com.github.catvod.spider.merge.B.e.c("https://www.youtube.com", e2.i("url", null));
        }
        return null;
    }

    public static String s(d object) {
        if (((d)object).d() != 404) {
            String string = ((d)object).c();
            if (string.length() >= 50) {
                Object object2 = new URL(((d)object).b());
                if (((URL)object2).getHost().equalsIgnoreCase("www.youtube.com") && (((String)(object2 = ((URL)object2).getPath())).equalsIgnoreCase("/oops") || ((String)object2).equalsIgnoreCase("/error"))) {
                    throw new com.github.catvod.spider.merge.n1.c("Content unavailable");
                }
                object2 = ((d)object).a();
                if (object2 != null && ((String)object2).toLowerCase().contains("text/html")) {
                    throw new i(com.github.catvod.spider.merge.I.s.a("Got HTML document, expected JSON response (latest url was: \"", ((d)object).b(), "\")"));
                }
                return string;
            }
            throw new i("JSON response is too short");
        }
        int n2 = ((d)object).d();
        String string = ((d)object).e();
        object = new StringBuilder();
        ((StringBuilder)object).append("Not found (\"");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("\")");
        throw new com.github.catvod.spider.merge.n1.c(((StringBuilder)object).toString());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public static String t(c object, e e2, a a2, Map map) {
        object = k.b(A.D(e2, a2, (c)object).b()).getBytes(StandardCharsets.UTF_8);
        object = com.github.catvod.spider.merge.K1.f.j(A.s(com.github.catvod.spider.merge.k1.l.a().e(com.github.catvod.spider.merge.I.s.a("https://www.youtube.com/youtubei/v1/", "visitor_id", "?prettyPrint=false"), map, (byte[])object))).g("responseContext").i("visitorData", null);
        if (!p.j((String)object)) {
            return object;
        }
        throw new i("Could not get visitorData");
    }

    public static Map<String, List<String>> u() {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(A.n());
        hashMap.putAll(A.j(A.k()));
        ArrayList<Object> arrayList = new ArrayList<Object>(1);
        for (int i2 = 0; i2 < 1; ++i2) {
            Object object = (new Object[]{"SOCS=CAE="})[i2];
            Objects.requireNonNull(object);
            arrayList.add(object);
        }
        hashMap.put("Cookie", Collections.unmodifiableList(arrayList));
        return hashMap;
    }

    public static boolean v(com.github.catvod.spider.merge.F0.c c2) {
        return c2.c().anyMatch(v.a);
    }

    public static boolean w(String object) {
        Object object2 = A.c((String)object);
        try {
            object = new URL((String)object2);
            object2 = g.stream();
            u u2 = new u((URL)object);
            boolean bl = object2.anyMatch(u2);
            return bl;
        }
        catch (MalformedURLException malformedURLException) {
            return false;
        }
    }

    public static boolean x(URL uRL) {
        return h.contains(uRL.getHost().toLowerCase(Locale.ROOT));
    }

    public static boolean y(com.github.catvod.spider.merge.F0.c c2) {
        return c2.c().anyMatch(y.a);
    }

    public static boolean z(String string) {
        boolean bl = string.startsWith("RDAMVM") || string.startsWith("RDCLAK");
        return bl;
    }
}

