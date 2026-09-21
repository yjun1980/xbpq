/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.E1.A;
import com.github.catvod.spider.merge.E1.B;
import com.github.catvod.spider.merge.E1.C;
import com.github.catvod.spider.merge.E1.a;
import com.github.catvod.spider.merge.E1.d;
import com.github.catvod.spider.merge.E1.h;
import com.github.catvod.spider.merge.E1.i;
import com.github.catvod.spider.merge.E1.j;
import com.github.catvod.spider.merge.E1.k;
import com.github.catvod.spider.merge.E1.l;
import com.github.catvod.spider.merge.E1.m;
import com.github.catvod.spider.merge.E1.n;
import com.github.catvod.spider.merge.E1.o;
import com.github.catvod.spider.merge.E1.p;
import com.github.catvod.spider.merge.E1.q;
import com.github.catvod.spider.merge.E1.r;
import com.github.catvod.spider.merge.E1.s;
import com.github.catvod.spider.merge.E1.t;
import com.github.catvod.spider.merge.E1.u;
import com.github.catvod.spider.merge.E1.v;
import com.github.catvod.spider.merge.E1.w;
import com.github.catvod.spider.merge.E1.x;
import com.github.catvod.spider.merge.E1.y;
import com.github.catvod.spider.merge.E1.z;
import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.g;
import com.github.catvod.spider.merge.g0.S;
import com.github.catvod.spider.merge.p1.b;
import com.github.catvod.spider.merge.p1.e;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class D
extends com.github.catvod.spider.merge.H1.g {
    private com.github.catvod.spider.merge.F0.e e;
    private com.github.catvod.spider.merge.F0.e f;
    private com.github.catvod.spider.merge.F0.e g;
    private com.github.catvod.spider.merge.F0.e h;
    private com.github.catvod.spider.merge.F0.e i;
    private com.github.catvod.spider.merge.F0.e j;
    private com.github.catvod.spider.merge.F0.e k;
    private c l;
    private int m = -1;
    private com.github.catvod.spider.merge.H1.m n;
    private String o;

    public D(com.github.catvod.spider.merge.k1.p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    public static Optional b0(D optional, String string) {
        Objects.requireNonNull(optional);
        try {
            optional = Optional.of(LocalDate.parse(string, DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH)));
        }
        catch (DateTimeParseException dateTimeParseException) {
            optional = Optional.empty();
        }
        return optional;
    }

    public static com.github.catvod.spider.merge.H1.r c0(D d2, boolean bl, a a2) {
        Objects.requireNonNull(d2);
        Object object = a2.c();
        com.github.catvod.spider.merge.H1.q q2 = new com.github.catvod.spider.merge.H1.q();
        q2.d(String.valueOf(((com.github.catvod.spider.merge.D1.d)object).b));
        q2.b(a2.a(), a2.b());
        q2.h(((com.github.catvod.spider.merge.D1.d)object).m());
        q2.e(bl);
        q2.f((com.github.catvod.spider.merge.D1.d)object);
        object = ((com.github.catvod.spider.merge.D1.d)object).f;
        if (object == null) {
            object = "";
        }
        q2.i((String)object);
        if (d2.n != com.github.catvod.spider.merge.H1.m.b || !a2.b()) {
            q2.c(2);
        }
        return q2.a();
    }

    public static com.github.catvod.spider.merge.H1.b d0(D object, a a2) {
        Objects.requireNonNull(object);
        com.github.catvod.spider.merge.D1.d d2 = a2.c();
        com.github.catvod.spider.merge.H1.a a3 = new com.github.catvod.spider.merge.H1.a();
        a3.u(String.valueOf(d2.b));
        a3.s(a2.a(), a2.b());
        a3.x(d2.m());
        a3.r(d2.d);
        a3.o(d2.b());
        a3.p(d2.c());
        a3.n(d2.a());
        a3.q(d2.d());
        a3.v(d2);
        object = object.n;
        if (object == com.github.catvod.spider.merge.H1.m.d || object == com.github.catvod.spider.merge.H1.m.e || !a2.b()) {
            a3.t(2);
        }
        return a3.m();
    }

    public static b e0(LocalDate localDate) {
        return new b(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant(), true);
    }

    public static Stream f0(D stream, String string, String string2, int n2, com.github.catvod.spider.merge.K1.i object) {
        Objects.requireNonNull(stream);
        com.github.catvod.spider.merge.F0.e e2 = (com.github.catvod.spider.merge.F0.e)((com.github.catvod.spider.merge.K1.i)object).a();
        String string3 = (String)((com.github.catvod.spider.merge.K1.i)((com.github.catvod.spider.merge.K1.i)object).b()).a();
        object = (String)((com.github.catvod.spider.merge.K1.i)((com.github.catvod.spider.merge.K1.i)object).b()).b();
        stream = e2 != null && ((AbstractMap)e2).containsKey(string2) ? e2.b(string2).c().map(new x((D)((Object)stream), n2, string, string3, (String)object)).filter(com.github.catvod.spider.merge.E1.m.a) : Stream.empty();
        return stream;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a g0(D object, int n2, String string, String string2, String string3, com.github.catvod.spider.merge.F0.e e2) {
        int n3;
        com.github.catvod.spider.merge.D1.d d2;
        Objects.requireNonNull(object);
        try {
            d2 = com.github.catvod.spider.merge.D1.d.l(e2.e("itag", 0));
            n3 = d2.c;
            if (n3 != n2) return null;
        }
        catch (com.github.catvod.spider.merge.n1.e e3) {
            return null;
        }
        return super.h0(string, e2, d2, n3, string2, string3);
    }

    private a h0(String object, com.github.catvod.spider.merge.F0.e e2, com.github.catvod.spider.merge.D1.d serializable, int n2, String object2, String object3) {
        Object object4;
        com.github.catvod.spider.merge.H1.m m2 = com.github.catvod.spider.merge.H1.m.e;
        if (((AbstractMap)e2).containsKey("url")) {
            object4 = e2.i("url", null);
        } else {
            object4 = e2.i("cipher", e2.i("signatureCipher", null));
            if (com.github.catvod.spider.merge.K1.p.j((String)object4)) {
                return null;
            }
            Map map = Arrays.stream(((String)object4).split("&")).map(com.github.catvod.spider.merge.K1.m.a).filter(com.github.catvod.spider.merge.K1.n.a).collect(Collectors.toMap(com.github.catvod.spider.merge.K1.k.a, com.github.catvod.spider.merge.K1.l.a, com.github.catvod.spider.merge.K1.j.a));
            object4 = com.github.catvod.spider.merge.D1.m.a(object, map.getOrDefault("s", ""));
            object4 = com.github.catvod.spider.merge.I.r.b((String)map.get("url"), "&", (String)map.get("sp"), "=", (String)object4);
        }
        object2 = com.github.catvod.spider.merge.I.s.a(com.github.catvod.spider.merge.D1.m.b(object, (String)object4), "&cpn=", (String)object2);
        object = object2;
        if (object3 != null) {
            object = com.github.catvod.spider.merge.I.s.a((String)object2, "&pot=", (String)object3);
        }
        object3 = e2.g("initRange");
        object4 = e2.g("indexRange");
        object2 = e2.i("mimeType", "");
        boolean bl = ((String)object2).contains("codecs");
        boolean bl2 = true;
        object2 = bl ? ((String)object2).split("\"")[1] : "";
        ((com.github.catvod.spider.merge.D1.d)serializable).u(e2.e("bitrate", 0));
        ((com.github.catvod.spider.merge.D1.d)serializable).D(e2.e("width", 0));
        ((com.github.catvod.spider.merge.D1.d)serializable).w(e2.e("height", 0));
        ((com.github.catvod.spider.merge.D1.d)serializable).A(Integer.parseInt(((com.github.catvod.spider.merge.F0.e)object3).i("start", "-1")));
        ((com.github.catvod.spider.merge.D1.d)serializable).z(Integer.parseInt(((com.github.catvod.spider.merge.F0.e)object3).i("end", "-1")));
        ((com.github.catvod.spider.merge.D1.d)serializable).y(Integer.parseInt(((com.github.catvod.spider.merge.F0.e)object4).i("start", "-1")));
        ((com.github.catvod.spider.merge.D1.d)serializable).x(Integer.parseInt(((com.github.catvod.spider.merge.F0.e)object4).i("end", "-1")));
        ((com.github.catvod.spider.merge.D1.d)serializable).B(e2.i("quality", null));
        ((com.github.catvod.spider.merge.D1.d)serializable).v((String)object2);
        Boolean.valueOf(e2.d("isDrc")).booleanValue();
        Long.parseLong(e2.i("lastModified", "-1"));
        ((com.github.catvod.spider.merge.D1.d)serializable).E(e2.i("xtags", null));
        object2 = this.n;
        if (object2 == com.github.catvod.spider.merge.H1.m.d || object2 == m2) {
            e2.e("targetDurationSec", 0);
        }
        int n3 = -1;
        if (n2 != 2 && n2 != 3) {
            if (n2 == 1) {
                ((com.github.catvod.spider.merge.D1.d)serializable).C(Integer.parseInt(e2.i("audioSampleRate", null)));
                e2.e("audioChannels", 2);
                object2 = e2.g("audioTrack").i("id", null);
                if (!com.github.catvod.spider.merge.K1.p.j((String)object2)) {
                    ((com.github.catvod.spider.merge.D1.d)serializable).r((String)object2);
                    n2 = ((String)object2).indexOf(".");
                    if (n2 != -1) {
                        com.github.catvod.spider.merge.K1.g.a(((String)object2).substring(0, n2)).ifPresent(new s((com.github.catvod.spider.merge.D1.d)serializable));
                    }
                    ((com.github.catvod.spider.merge.D1.d)serializable).t(com.github.catvod.spider.merge.D1.A.b(((com.github.catvod.spider.merge.D1.d)serializable).p()));
                }
                object2 = e2.g("audioTrack");
                ((com.github.catvod.spider.merge.D1.d)serializable).s(((com.github.catvod.spider.merge.F0.e)object2).i("displayName", null));
                ((com.github.catvod.spider.merge.F0.e)object2).d("isAutoDubbed");
            }
        } else {
            int n4 = e2.e("fps", 0);
            n2 = n3;
            if (n4 > 0) {
                n2 = n4;
            }
            ((com.github.catvod.spider.merge.D1.d)serializable).g = n2;
        }
        Long.parseLong(e2.i("contentLength", String.valueOf(-1L)));
        Long.parseLong(e2.i("approxDurationMs", String.valueOf(-1L)));
        serializable = new a((String)object, (com.github.catvod.spider.merge.D1.d)serializable);
        object = this.n;
        if (object == com.github.catvod.spider.merge.H1.m.b) {
            ((a)serializable).d(e2.i("type", "").equalsIgnoreCase("FORMAT_STREAM_TYPE_OTF") ^ true);
        } else {
            if (object == m2) {
                bl2 = false;
            }
            ((a)serializable).d(bl2);
        }
        return serializable;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private List i0(String object, int n2, Function object2, String string) {
        try {
            String string2 = this.g();
            ArrayList arrayList = new ArrayList();
            Object object3 = this.g;
            com.github.catvod.spider.merge.K1.i<String, Object> i2 = new com.github.catvod.spider.merge.K1.i<String, Object>(this.o, null);
            Object object4 = new com.github.catvod.spider.merge.K1.i(object3, i2);
            object3 = Stream.of(object4);
            object4 = new y(this, string2, (String)object, n2);
            object = object3.flatMap(object4).map(object2);
            object2 = new h(arrayList, 1);
            object.forEachOrdered(object2);
            return arrayList;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.I.s.a("Could not get ", string, " streams"), exception);
        }
    }

    private com.github.catvod.spider.merge.F0.e j0(String string) {
        return this.f.g("contents").g("twoColumnWatchNextResults").g("results").g("results").b("contents").c().filter(new S(string, 1)).map(new v(string, 1)).findFirst().orElse(new com.github.catvod.spider.merge.F0.e());
    }

    private com.github.catvod.spider.merge.F0.e k0() {
        com.github.catvod.spider.merge.F0.e e2 = this.h;
        if (e2 != null) {
            return e2;
        }
        this.h = e2 = this.j0("videoPrimaryInfoRenderer");
        return e2;
    }

    private com.github.catvod.spider.merge.F0.e l0() {
        com.github.catvod.spider.merge.F0.e e2 = this.i;
        if (e2 != null) {
            return e2;
        }
        this.i = e2 = this.j0("videoSecondaryInfoRenderer");
        return e2;
    }

    private static long m0(c object) {
        object = ((c)object).c().map(B.b).filter(com.github.catvod.spider.merge.E1.o.b).findFirst();
        Object object2 = null;
        com.github.catvod.spider.merge.F0.e e2 = ((Optional)object).orElse(null);
        if (e2 != null) {
            object = object2 = e2.g("accessibilityData").g("accessibilityData").i("label", null);
            if (object2 == null) {
                object = e2.g("accessibility").i("label", null);
            }
            if (object == null) {
                object = e2.g("defaultText").g("accessibility").g("accessibilityData").i("label", null);
            }
            object2 = object;
            if (object != null) {
                object2 = object;
                if (((String)object).toLowerCase().contains("no likes")) {
                    return 0L;
                }
            }
        }
        if (object2 != null) {
            try {
                int n2 = com.github.catvod.spider.merge.K1.p.c;
                long l2 = Long.parseLong(((String)object2).replaceAll("\\D+", ""));
                return l2;
            }
            catch (NumberFormatException numberFormatException) {
                throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.I.s.a("Could not parse \"", (String)object2, "\" as a long"), numberFormatException);
            }
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get like count from accessibility data");
    }

    private static long n0(c cloneable) {
        if ((cloneable = (com.github.catvod.spider.merge.F0.e)((c)cloneable).c().map(com.github.catvod.spider.merge.E1.l.c).filter(com.github.catvod.spider.merge.E1.n.b).findFirst().orElse(null)) != null) {
            String string = ((com.github.catvod.spider.merge.F0.e)cloneable).i("accessibilityText", null);
            if (string != null) {
                try {
                    int n2 = com.github.catvod.spider.merge.K1.p.c;
                    long l2 = Long.parseLong(string.replaceAll("\\D+", ""));
                    return l2;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.I.s.a("Could not parse \"", string, "\" as a long"), numberFormatException);
                }
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not find buttonViewModel's accessibilityText string");
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not find buttonViewModel object");
    }

    @Override
    public final long A() {
        this.a();
        try {
            long l2 = Long.parseLong(this.e.g("videoDetails").i("lengthSeconds", null));
            return l2;
        }
        catch (Exception exception) {
            Iterator<com.github.catvod.spider.merge.F0.e> iterator = Collections.singletonList(this.g).iterator();
            while (iterator.hasNext()) {
                int n2;
                Object object = iterator.next().b("adaptiveFormats");
                if (((AbstractCollection)object).isEmpty()) continue;
                object = ((c)object).a(0).i("approxDurationMs", null);
                try {
                    n2 = Math.round((float)Long.parseLong((String)object) / 1000.0f);
                }
                catch (NumberFormatException numberFormatException) {
                    continue;
                }
                return n2;
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get duration");
        }
    }

    @Override
    public final String B() {
        com.github.catvod.spider.merge.F0.e e2 = this.l0().g("metadataRowContainer").g("metadataRowContainerRenderer").b("rows").a(0).g("metadataRowRenderer");
        String string = com.github.catvod.spider.merge.D1.A.o(e2.b("contents").a(0), false);
        if (string == null || !"Licence".equals(com.github.catvod.spider.merge.D1.A.o(e2.g("title"), false))) {
            string = "YouTube licence";
        }
        return string;
    }

    @Override
    public final long C() {
        this.a();
        if (!this.e.g("videoDetails").d("allowRatings")) {
            return -1L;
        }
        c c2 = this.k0().g("videoActions").g("menuRenderer").b("topLevelButtons");
        try {
            long l2 = D.n0(c2);
            return l2;
        }
        catch (com.github.catvod.spider.merge.n1.i i2) {
            try {
                long l3 = D.m0(c2);
                return l3;
            }
            catch (com.github.catvod.spider.merge.n1.i i4) {
                throw new com.github.catvod.spider.merge.n1.i("Could not get like count", i4);
            }
        }
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.j> D() {
        return com.github.catvod.spider.merge.D1.p.a(this.f.g("contents").g("twoColumnWatchNextResults").g("results").g("results").b("contents"));
    }

    @Override
    public final int E() {
        int n2 = !this.j.d("isUnlisted") && !this.k0().b("badges").c().anyMatch(r.b) ? 1 : 2;
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final com.github.catvod.spider.merge.k1.g F() {
        com.github.catvod.spider.merge.k1.k k2;
        this.a();
        if (this.p() != 0) {
            return null;
        }
        try {
            k2 = new com.github.catvod.spider.merge.k1.k(this.l());
            Object object = this.f.g("contents").g("twoColumnWatchNextResults").g("secondaryResults").g("secondaryResults").b("results");
            Object object2 = this.m();
            Stream<com.github.catvod.spider.merge.F0.e> stream = ((c)object).c();
            object = new A((com.github.catvod.spider.merge.p1.j)object2);
            object2 = stream.map(object).filter(p.b);
            object = new h(k2, 0);
            object2.forEach(object);
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get related videos", exception);
        }
        return k2;
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.l> G() {
        if (!((AbstractMap)this.f).containsKey("engagementPanels")) {
            return Collections.emptyList();
        }
        Object object = this.f.b("engagementPanels").c().filter(d.c).map(C.c).findFirst().orElse(null);
        if (object == null) {
            return Collections.emptyList();
        }
        long l2 = this.A();
        ArrayList<com.github.catvod.spider.merge.H1.l> arrayList = new ArrayList<com.github.catvod.spider.merge.H1.l>();
        object = ((c)object).c().map(com.github.catvod.spider.merge.E1.l.b).iterator();
        while (object.hasNext()) {
            Cloneable cloneable = (com.github.catvod.spider.merge.F0.e)object.next();
            int n2 = ((com.github.catvod.spider.merge.F0.e)cloneable).g("onTap").g("watchEndpoint").e("startTimeSeconds", -1);
            if (n2 != -1) {
                if ((long)n2 > l2) break;
                if (!com.github.catvod.spider.merge.K1.p.j(com.github.catvod.spider.merge.D1.A.o(((com.github.catvod.spider.merge.F0.e)cloneable).g("title"), false))) {
                    com.github.catvod.spider.merge.H1.l l3 = new com.github.catvod.spider.merge.H1.l();
                    this.n();
                    if (((AbstractMap)((Object)cloneable)).containsKey("thumbnail") && !((AbstractCollection)((Object)(cloneable = ((com.github.catvod.spider.merge.F0.e)cloneable).g("thumbnail").b("thumbnails")))).isEmpty()) {
                        com.github.catvod.spider.merge.D1.A.g(((c)cloneable).a(((AbstractCollection)((Object)cloneable)).size() - 1).i("url", null));
                    }
                    arrayList.add(l3);
                    continue;
                }
                throw new com.github.catvod.spider.merge.n1.i("Could not get stream segment title.");
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get stream segment start time.");
        }
        return arrayList;
    }

    @Override
    public final com.github.catvod.spider.merge.H1.m H() {
        this.a();
        return this.n;
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.p> L() {
        com.github.catvod.spider.merge.k1.i i2 = com.github.catvod.spider.merge.k1.i.m;
        this.a();
        ArrayList<com.github.catvod.spider.merge.H1.p> arrayList = new ArrayList<com.github.catvod.spider.merge.H1.p>();
        c c2 = this.k.b("captionTracks");
        for (int i4 = 0; i4 < ((AbstractCollection)c2).size(); ++i4) {
            String string = c2.a(i4).i("languageCode", null);
            CharSequence charSequence = c2.a(i4).i("baseUrl", null);
            Object object = c2.a(i4).i("vssId", null);
            if (string == null || charSequence == null || object == null) continue;
            boolean bl = ((String)object).startsWith("a.");
            String string2 = ((String)charSequence).replaceAll("&fmt=[^&]*", "").replaceAll("&tlang=[^&]*", "");
            object = new com.github.catvod.spider.merge.H1.o();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("&fmt=");
            ((StringBuilder)charSequence).append("ttml");
            ((com.github.catvod.spider.merge.H1.o)object).c(((StringBuilder)charSequence).toString());
            ((com.github.catvod.spider.merge.H1.o)object).e(i2);
            ((com.github.catvod.spider.merge.H1.o)object).d(string);
            ((com.github.catvod.spider.merge.H1.o)object).b(bl);
            arrayList.add(((com.github.catvod.spider.merge.H1.o)object).a());
        }
        return arrayList;
    }

    @Override
    public final List<String> N() {
        return com.github.catvod.spider.merge.K1.f.h(this.e.g("videoDetails").b("keywords"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String O() {
        int n2;
        String string;
        String string2 = string = this.j.i("uploadDate", "");
        if (string.isEmpty()) {
            string2 = this.j.i("publishDate", "");
        }
        if (!string2.isEmpty()) {
            return string2;
        }
        com.github.catvod.spider.merge.F0.e e2 = this.j.g("liveBroadcastDetails");
        string2 = string = e2.i("endTimestamp", "");
        if (string.isEmpty()) {
            string2 = e2.i("startTimestamp", "");
        }
        if (!string2.isEmpty()) {
            return string2;
        }
        this.a();
        if (this.n == com.github.catvod.spider.merge.H1.m.d) {
            return null;
        }
        string2 = com.github.catvod.spider.merge.D1.A.o(this.k0().g("dateText"), false);
        if (string2 == null) {
            return null;
        }
        if (string2.startsWith("Premiered on ")) {
            n2 = 13;
            return string2.substring(n2);
        }
        if (!string2.startsWith("Premiered ")) return string2;
        n2 = 10;
        return string2.substring(n2);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        this.a();
        try {
            List<com.github.catvod.spider.merge.k1.c> list = com.github.catvod.spider.merge.D1.A.m(this.l);
            return list;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get thumbnails");
        }
    }

    @Override
    public final long Q() {
        long l2;
        long l3 = l2 = this.R("((#|&|\\?)t=\\d*h?\\d*m?\\d+s?)");
        if (l2 == -2L) {
            l3 = 0L;
        }
        return l3;
    }

    @Override
    public final b S() {
        String string = this.O();
        try {
            b b2 = b.b(string);
            return b2;
        }
        catch (com.github.catvod.spider.merge.n1.i i2) {
            try {
                Serializable serializable = new e("en", null);
                serializable = com.github.catvod.spider.merge.p1.k.a(serializable).d(string);
                return serializable;
            }
            catch (com.github.catvod.spider.merge.n1.i i4) {
                Optional<Object> optional;
                try {
                    optional = Optional.of(LocalDate.parse(string, DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.ENGLISH)));
                }
                catch (DateTimeParseException dateTimeParseException) {
                    optional = Optional.empty();
                }
                return (b)optional.or(new t(this, string)).map(C.b).orElseThrow(new u(string));
            }
        }
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> T() {
        com.github.catvod.spider.merge.F0.e e2;
        this.a();
        Object object = this.l0().g("owner").g("videoOwnerRenderer");
        if (((AbstractMap)object).containsKey("avatarStack")) {
            e2 = ((com.github.catvod.spider.merge.F0.e)object).g("avatarStack").g("avatarStackViewModel").b("avatars").a(0).g("avatarViewModel").g("image");
            object = "sources";
        } else {
            e2 = ((com.github.catvod.spider.merge.F0.e)object).g("thumbnail");
            object = "thumbnails";
        }
        object = com.github.catvod.spider.merge.D1.A.m(e2.b((String)object));
        if (object.isEmpty() && this.m == 0) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get uploader avatars");
        }
        return object;
    }

    @Override
    public final String U() {
        this.a();
        String string = this.e.g("videoDetails").i("author", null);
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            return string;
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get uploader name");
    }

    @Override
    public final long V() {
        Object object = com.github.catvod.spider.merge.K1.f.f(this.i, "owner.videoOwnerRenderer");
        if (((AbstractMap)object).containsKey("subscriberCountText")) {
            object = com.github.catvod.spider.merge.D1.A.o(((com.github.catvod.spider.merge.F0.e)object).g("subscriberCountText"), false);
        } else {
            object = ((com.github.catvod.spider.merge.F0.e)object).g("navigationEndpoint");
            int n2 = com.github.catvod.spider.merge.D1.A.j;
            try {
                object = com.github.catvod.spider.merge.K1.f.a((com.github.catvod.spider.merge.F0.e)object, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0).g("listItemViewModel");
            }
            catch (com.github.catvod.spider.merge.n1.i i2) {
                object = null;
            }
            object = ((com.github.catvod.spider.merge.F0.e)object).g("subtitle").i("content", null).split("\u2022")[1];
        }
        if (com.github.catvod.spider.merge.K1.p.j((String)object)) {
            return -1L;
        }
        try {
            long l2 = com.github.catvod.spider.merge.K1.p.m((String)object);
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get uploader subscriber count", numberFormatException);
        }
    }

    @Override
    public final String W() {
        this.a();
        String string = this.e.g("videoDetails").i("channelId", null);
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            com.github.catvod.spider.merge.F1.a a2 = com.github.catvod.spider.merge.F1.a.m();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("channel/");
            stringBuilder.append(string);
            return a2.e(stringBuilder.toString());
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get uploader url");
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> X() {
        this.a();
        return this.i0("adaptiveFormats", 3, new z(this, true), "video-only");
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> Y() {
        this.a();
        return this.i0("formats", 2, new z(this, false), "video");
    }

    @Override
    public final long Z() {
        String string;
        String string2 = string = com.github.catvod.spider.merge.D1.A.o(this.k0().g("viewCount").g("videoViewCountRenderer").g("viewCount"), false);
        if (com.github.catvod.spider.merge.K1.p.j(string) && com.github.catvod.spider.merge.K1.p.j(string2 = this.e.g("videoDetails").i("viewCount", null))) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get view count");
        }
        if (string2.toLowerCase().contains("no views")) {
            return 0L;
        }
        return Long.parseLong(string2.replaceAll("\\D+", ""));
    }

    @Override
    public final boolean a0() {
        com.github.catvod.spider.merge.F0.e e2 = this.l0().g("owner").g("videoOwnerRenderer");
        if (((AbstractMap)e2).containsKey("badges")) {
            return com.github.catvod.spider.merge.D1.A.y(e2.b("badges"));
        }
        e2 = e2.g("navigationEndpoint");
        int n2 = com.github.catvod.spider.merge.D1.A.j;
        try {
            e2 = com.github.catvod.spider.merge.K1.f.a(e2, "showDialogCommand.panelLoadingStrategy.inlineContent.dialogViewModel.customContent.listViewModel.listItems").a(0).g("listItemViewModel");
        }
        catch (com.github.catvod.spider.merge.n1.i i2) {
            e2 = null;
        }
        if (e2 == null) {
            return false;
        }
        return com.github.catvod.spider.merge.D1.A.v(e2.g("title").b("attachmentRuns"));
    }

    @Override
    public final String i() {
        String string;
        this.a();
        String string2 = string = this.e.g("videoDetails").i("title", null);
        if (com.github.catvod.spider.merge.K1.p.j(string) && com.github.catvod.spider.merge.K1.p.j(string2 = com.github.catvod.spider.merge.D1.A.o(this.k0().g("title"), false))) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get name");
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void o(com.github.catvod.spider.merge.m1.a object) {
        void var1_8;
        com.github.catvod.spider.merge.F0.e e2;
        String string;
        String string2 = this.g();
        Object object2 = this.f();
        Object object3 = this.e();
        this.o = string = com.github.catvod.spider.merge.D1.A.h();
        this.e = e2 = com.github.catvod.spider.merge.D1.D.b((com.github.catvod.spider.merge.p1.a)object3, (e)object2, string2, string);
        com.github.catvod.spider.merge.F0.e e3 = e2.g("playabilityStatus");
        String string3 = e3.i("status", null);
        if (string3 != null && !string3.equalsIgnoreCase("ok")) {
            object2 = e3.i("reason", null);
            if (object2 == null) throw new com.github.catvod.spider.merge.n1.c(com.github.catvod.spider.merge.I.r.b("Got error ", string3, ": \"", (String)object2, "\""));
            if (string3.equalsIgnoreCase("login_required")) {
                if (((String)object2).contains("inappropriate for some users")) throw new com.github.catvod.spider.merge.n1.b();
                if (e3.b("messages").stream().filter(new S(String.class, 3)).map(new v(String.class, 0)).anyMatch(q.c)) throw new com.github.catvod.spider.merge.n1.j();
                if (((String)object2).contains("a bot")) {
                    throw new com.github.catvod.spider.merge.n1.l(com.github.catvod.spider.merge.I.r.b("YouTube probably temporarily blocked anonymous watch access with this IP , got error ", string3, ": \"", (String)object2, "\""));
                }
            }
            if (!string3.equalsIgnoreCase("unplayable") && !string3.equalsIgnoreCase("error")) throw new com.github.catvod.spider.merge.n1.c(com.github.catvod.spider.merge.I.r.b("Got error ", string3, ": \"", (String)object2, "\""));
            if (((String)object2).contains("Music Premium")) throw new com.github.catvod.spider.merge.n1.n();
            if (((String)object2).contains("payment")) throw new com.github.catvod.spider.merge.n1.h("This video is a paid video");
            if (((String)object2).contains("members")) throw new com.github.catvod.spider.merge.n1.h("This video is only available for members of the channel of this video");
            if (((String)object2).contains("country")) throw new com.github.catvod.spider.merge.n1.g("This video is not available in client's country.");
            if (!((String)object2).contains("closed") && !((String)object2).contains("terminated")) throw new com.github.catvod.spider.merge.n1.c(com.github.catvod.spider.merge.I.r.b("Got error ", string3, ": \"", (String)object2, "\""));
            throw new com.github.catvod.spider.merge.n1.a((String)object2);
        }
        if (string2.equals(this.e.g("videoDetails").i("videoId", null)) ^ true) throw new com.github.catvod.spider.merge.n1.e("VISIONOS player response is not valid");
        this.g = this.e.g("streamingData");
        this.k = this.e.g("captions").g("playerCaptionsTracklistRenderer");
        if (((AbstractMap)this.e.g("playabilityStatus")).containsKey("liveStreamability")) {
            com.github.catvod.spider.merge.H1.m m2 = com.github.catvod.spider.merge.H1.m.d;
        } else if (this.e.g("videoDetails").d("isPostLiveDvr")) {
            com.github.catvod.spider.merge.H1.m m3 = com.github.catvod.spider.merge.H1.m.e;
        } else {
            com.github.catvod.spider.merge.H1.m m4 = com.github.catvod.spider.merge.H1.m.b;
        }
        this.n = var1_8;
        try {
            com.github.catvod.spider.merge.F0.e e4 = com.github.catvod.spider.merge.D1.D.c((e)object2, (com.github.catvod.spider.merge.p1.a)object3, string2);
            if (!(string2.equals(e4.g("videoDetails").i("videoId", null)) ^ true)) {
                void var1_12;
                this.j = e4.g("microformat").g("playerMicroformatRenderer");
                com.github.catvod.spider.merge.F0.e e5 = e4.g("videoDetails").g("thumbnail");
                if (!((AbstractMap)e5).containsKey("thumbnails")) {
                    com.github.catvod.spider.merge.F0.e e6 = this.e.g("videoDetails").g("thumbnail");
                }
                this.l = var1_12.b("thumbnails");
            }
        }
        catch (Exception exception) {
            this.j = new com.github.catvod.spider.merge.F0.e();
            this.l = this.e.g("videoDetails").g("thumbnail").b("thumbnails");
        }
        com.github.catvod.spider.merge.F0.d<com.github.catvod.spider.merge.F0.e> d2 = com.github.catvod.spider.merge.F0.e.a();
        d2.d("context");
        d2.d("client");
        d2.f("hl", ((e)object2).c());
        d2.f("gl", ((com.github.catvod.spider.merge.p1.a)object3).a());
        d2.f("clientName", "WEB");
        d2.f("clientVersion", com.github.catvod.spider.merge.D1.A.k());
        d2.f("originalUrl", "https://www.youtube.com");
        d2.f("platform", "DESKTOP");
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
        d2.f("videoId", string2);
        d2.g("contentCheckOk", true);
        d2.g("racyCheckOk", true);
        object3 = com.github.catvod.spider.merge.F0.k.b(d2.b()).getBytes(StandardCharsets.UTF_8);
        Map<String, List<String>> map = com.github.catvod.spider.merge.D1.A.u();
        this.f = com.github.catvod.spider.merge.K1.f.j(com.github.catvod.spider.merge.D1.A.s(com.github.catvod.spider.merge.k1.l.a().f("https://www.youtube.com/youtubei/v1/next?prettyPrint=false", map, (byte[])object3, (e)object2)));
    }

    @Override
    public final int p() {
        int n2 = this.m;
        if (n2 != -1) {
            return n2;
        }
        n2 = this.l0().g("metadataRowContainer").g("metadataRowContainerRenderer").b("rows").c().flatMap(com.github.catvod.spider.merge.E1.j.b).flatMap(com.github.catvod.spider.merge.E1.i.b).map(com.github.catvod.spider.merge.E1.k.b).anyMatch(q.b) ? 18 : 0;
        this.m = n2;
        return n2;
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        this.a();
        return this.i0("adaptiveFormats", 1, new w(this), "audio");
    }

    @Override
    public final String r() {
        return this.j.i("category", "");
    }

    @Override
    public final com.github.catvod.spider.merge.H1.d t() {
        Object object = com.github.catvod.spider.merge.H1.c.a;
        this.a();
        String string = com.github.catvod.spider.merge.D1.A.o(this.l0().g("description"), true);
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            return new com.github.catvod.spider.merge.H1.d(string, (com.github.catvod.spider.merge.H1.c)((Object)object));
        }
        string = com.github.catvod.spider.merge.D1.k.c(this.l0().g("attributedDescription"));
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            return new com.github.catvod.spider.merge.H1.d(string, (com.github.catvod.spider.merge.H1.c)((Object)object));
        }
        string = this.e.g("videoDetails").i("shortDescription", null);
        object = string;
        if (string == null) {
            object = com.github.catvod.spider.merge.D1.A.o(this.j.g("description"), false);
        }
        return com.github.catvod.spider.merge.H1.d.b((String)object, com.github.catvod.spider.merge.H1.c.c);
    }

    @Override
    public final String v() {
        try {
            String string = com.github.catvod.spider.merge.D1.A.o(this.e.g("playabilityStatus").g("errorScreen").g("playerErrorMessageRenderer").g("reason"), false);
            return string;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List<com.github.catvod.spider.merge.H1.e> w() {
        List<String> list = "playerLiveStoryboardSpecRenderer";
        try {
            ArrayList<String> arrayList = this.e.g("storyboards");
            if (!((AbstractMap)((Object)arrayList)).containsKey("playerLiveStoryboardSpecRenderer")) {
                list = "playerStoryboardSpecRenderer";
            }
            list = ((com.github.catvod.spider.merge.F0.e)((Object)arrayList)).g((String)((Object)list));
            if (list == null) {
                return Collections.emptyList();
            }
            if ((list = ((com.github.catvod.spider.merge.F0.e)((Object)list)).i("spec", null)) == null) {
                return Collections.emptyList();
            }
            String[] stringArray = ((String)((Object)list)).split("\\|");
            String string = stringArray[0];
            ArrayList<com.github.catvod.spider.merge.H1.e> arrayList2 = new ArrayList<com.github.catvod.spider.merge.H1.e>(stringArray.length - 1);
            for (int i2 = 1; i2 < stringArray.length; ++i2) {
                String[] stringArray2 = stringArray[i2].split("#");
                if (stringArray2.length != 8 || Integer.parseInt(stringArray2[5]) == 0) continue;
                int n2 = Integer.parseInt(stringArray2[2]);
                int n3 = Integer.parseInt(stringArray2[3]);
                int n4 = Integer.parseInt(stringArray2[4]);
                arrayList = string.replace("$L", String.valueOf(i2 - 1)).replace("$N", stringArray2[6]);
                String string2 = stringArray2[7];
                list = new List<String>();
                ((StringBuilder)((Object)list)).append((String)((Object)arrayList));
                ((StringBuilder)((Object)list)).append("&sigh=");
                ((StringBuilder)((Object)list)).append(string2);
                string2 = ((StringBuilder)((Object)list)).toString();
                if (string2.contains("$M")) {
                    n3 = (int)Math.ceil((double)n2 / (double)(n3 * n4));
                    arrayList = new ArrayList<String>(n3);
                    n4 = 0;
                    while (true) {
                        list = arrayList;
                        if (n4 < n3) {
                            arrayList.add(string2.replace("$M", String.valueOf(n4)));
                            ++n4;
                            continue;
                        }
                        break;
                    }
                } else {
                    list = Collections.singletonList(string2);
                }
                Integer.parseInt(stringArray2[0]);
                Integer.parseInt(stringArray2[1]);
                Integer.parseInt(stringArray2[5]);
                arrayList = new ArrayList<String>(list);
                arrayList2.add((com.github.catvod.spider.merge.H1.e)((Object)arrayList));
            }
            return arrayList2;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.e("Could not get frames", exception);
        }
    }

    @Override
    public final String x() {
        Object object;
        block2: {
            Object object2;
            this.a();
            object = new com.github.catvod.spider.merge.K1.i<com.github.catvod.spider.merge.F0.e, Object>(this.g, null);
            Object object3 = new ArrayList(1);
            for (int i2 = 0; i2 < 1; ++i2) {
                object2 = (new Object[]{object})[i2];
                Objects.requireNonNull(object2);
                ((ArrayList)object3).add(object2);
            }
            object3 = Collections.unmodifiableList(object3).iterator();
            do {
                boolean bl = object3.hasNext();
                object = "";
                if (!bl) break block2;
            } while (((com.github.catvod.spider.merge.K1.i)(object = (com.github.catvod.spider.merge.K1.i)object3.next())).a() == null || com.github.catvod.spider.merge.K1.p.j((String)(object2 = ((com.github.catvod.spider.merge.F0.e)((com.github.catvod.spider.merge.K1.i)object).a()).i("hlsManifestUrl", null))));
            object = ((com.github.catvod.spider.merge.K1.i)object).b() == null ? com.github.catvod.spider.merge.I.s.a((String)object2, "?", "") : com.github.catvod.spider.merge.I.r.b((String)object2, "?pot=", (String)((com.github.catvod.spider.merge.K1.i)object).b(), "&", "");
        }
        return object;
    }

    @Override
    public final Locale z() {
        return null;
    }
}

