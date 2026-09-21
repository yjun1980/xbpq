/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.E1.B;
import com.github.catvod.spider.merge.E1.C;
import com.github.catvod.spider.merge.E1.E;
import com.github.catvod.spider.merge.E1.H;
import com.github.catvod.spider.merge.E1.I;
import com.github.catvod.spider.merge.E1.J;
import com.github.catvod.spider.merge.E1.K;
import com.github.catvod.spider.merge.E1.L;
import com.github.catvod.spider.merge.E1.c;
import com.github.catvod.spider.merge.E1.i;
import com.github.catvod.spider.merge.E1.j;
import com.github.catvod.spider.merge.E1.k;
import com.github.catvod.spider.merge.E1.l;
import com.github.catvod.spider.merge.E1.r;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.F1.a;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.g0.S;
import com.github.catvod.spider.merge.p1.b;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class M
implements com.github.catvod.spider.merge.H1.k {
    private static final DateTimeFormatter h = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");
    public static final int i = 0;
    private final e a;
    private final com.github.catvod.spider.merge.p1.j b;
    private final com.github.catvod.spider.merge.F0.c c;
    private m d;
    private String e;
    private String f;
    private J g;

    public M(e e2, com.github.catvod.spider.merge.p1.j j2) {
        this.a = e2;
        this.b = j2;
        this.c = e2.g("metadata").g("lockupMetadataViewModel").g("metadata").g("contentMetadataViewModel").b("metadataRows");
    }

    private boolean A() {
        String string = this.v();
        boolean bl = string.contains("Premieres ") || string.contains("Scheduled for ");
        return bl;
    }

    private String B(String string) {
        a a2 = com.github.catvod.spider.merge.F1.a.m();
        String string2 = string;
        if (string.startsWith("/")) {
            string2 = string.substring(1);
        }
        return a2.e(string2);
    }

    public static boolean t(e e2) {
        boolean bl = "THUMBNAIL_OVERLAY_BADGE_STYLE_LIVE".equals(e2.i("badgeStyle", null)) ? true : e2.g("icon").b("sources").c().map(j.d).anyMatch(new S("LIVE", 2));
        return bl;
    }

    private J u() {
        block4: {
            if (this.g != null) break block4;
            e e2 = this.a.g("metadata").g("lockupMetadataViewModel").g("image");
            Object object = e2.h("decoratedAvatarViewModel", null);
            if (object != null) {
                object = new L((e)object);
            } else {
                object = e2.h("avatarStackViewModel", null);
                if (object == null) {
                    throw new com.github.catvod.spider.merge.n1.i("Failed to determine channel image view model");
                }
                object = new K((e)object);
            }
            this.g = object;
        }
        return this.g;
    }

    private String v() {
        Object object = this.f;
        if (object == null) {
            object = (ArrayList)this.w();
            if (!((ArrayList)object).isEmpty()) {
                if (!((AbstractCollection)(object = (com.github.catvod.spider.merge.F0.c)((ArrayList)object).get(((ArrayList)object).size() - 1))).isEmpty()) {
                    this.f = object = this.x(((com.github.catvod.spider.merge.F0.c)object).a(((AbstractCollection)object).size() - 1));
                    return object;
                }
                throw new com.github.catvod.spider.merge.n1.i("Could not get date text: no metadata part in the metadata parts array");
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get date text: no metadata part from metadata rows");
        }
        return object;
    }

    private List<com.github.catvod.spider.merge.F0.c> w() {
        ArrayList<com.github.catvod.spider.merge.F0.c> arrayList = new ArrayList<com.github.catvod.spider.merge.F0.c>();
        for (int i2 = 0; i2 < ((AbstractCollection)this.c).size(); ++i2) {
            e e2 = this.c.a(i2);
            if (!((AbstractMap)e2).containsKey("metadataParts")) continue;
            arrayList.add(e2.b("metadataParts"));
        }
        return arrayList;
    }

    private String x(e e2) {
        return e2.g("text").i("content", null);
    }

    private boolean y() {
        return this.c.c().flatMap(com.github.catvod.spider.merge.E1.i.d).map(k.c).anyMatch(new I());
    }

    private boolean z() {
        boolean bl = this.e() != m.b;
        return bl;
    }

    @Override
    public final String a() {
        Serializable serializable = this.u().b().g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand");
        Object object = ((e)serializable).g("browseEndpoint");
        String string = ((e)object).i("browseId", null);
        if (string != null && string.startsWith("UC")) {
            object = com.github.catvod.spider.merge.F1.a.m();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("channel/");
            ((StringBuilder)serializable).append(string);
            return ((com.github.catvod.spider.merge.o1.c)object).e(((StringBuilder)serializable).toString());
        }
        string = ((e)object).i("canonicalBaseUrl", null);
        if (!p.j(string)) {
            return this.B(string);
        }
        string = ((e)serializable).g("commandMetadata").g("webCommandMetadata").i("url", null);
        if (!p.j(string)) {
            return this.B(string);
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get uploader url");
    }

    @Override
    public final boolean b() {
        ArrayList arrayList = (ArrayList)this.w();
        if (!arrayList.isEmpty()) {
            return A.v(((com.github.catvod.spider.merge.F0.c)arrayList.get(0)).a(0).g("text").b("attachmentRuns"));
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get uploader verified status: no metadata row");
    }

    @Override
    public final String c() {
        Object object = (ArrayList)this.w();
        if (!((ArrayList)object).isEmpty()) {
            if (!p.j((String)(object = this.x(((com.github.catvod.spider.merge.F0.c)((ArrayList)object).get(0)).a(0))))) {
                return object;
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get uploader name");
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get uploader name: no metadata row");
    }

    @Override
    public final m e() {
        if (this.d == null) {
            m m2 = m.d;
            com.github.catvod.spider.merge.F0.c c2 = com.github.catvod.spider.merge.K1.f.a(this.a, "contentImage.thumbnailViewModel.overlays");
            if (!c2.c().flatMap(E.c).map(H.a).anyMatch(r.d) && !c2.c().flatMap(B.c).map(C.d).anyMatch(com.github.catvod.spider.merge.E1.c.c)) {
                m2 = m.b;
            }
            this.d = m2;
        }
        return this.d;
    }

    @Override
    public final String g() {
        String string;
        String string2;
        try {
            string = string2 = this.a.i("contentId", null);
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get url", exception);
        }
        if (p.j(string2)) {
            string = com.github.catvod.spider.merge.K1.f.g(this.a, "rendererContext.commandContext.onTap.innertubeCommand.watchEndpoint.videoId");
        }
        string = com.github.catvod.spider.merge.F1.c.l().e(string);
        return string;
    }

    @Override
    public final String getName() {
        String string = this.e;
        if (string != null) {
            return string;
        }
        string = com.github.catvod.spider.merge.K1.f.g(this.a, "metadata.lockupMetadataViewModel.title.content");
        if (!p.j(string)) {
            this.e = string;
            return string;
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get name");
    }

    @Override
    public final long h() {
        boolean bl = this.y();
        long l2 = -1L;
        if (bl) {
            return -1L;
        }
        Object object = (ArrayList)this.w();
        if (((ArrayList)object).isEmpty()) {
            this.z();
            throw new com.github.catvod.spider.merge.n1.i("Could not get view count: no metadata part from metadata rows");
        }
        if (this.A()) {
            return -1L;
        }
        if (this.z() && ((ArrayList)object).size() == 1) {
            return 0L;
        }
        if (!((AbstractCollection)(object = (com.github.catvod.spider.merge.F0.c)((ArrayList)object).get(((ArrayList)object).size() - 1))).isEmpty()) {
            if (!p.j((String)(object = this.x(((com.github.catvod.spider.merge.F0.c)object).a(0))))) {
                if (((String)object).toLowerCase().contains("no views")) {
                    l2 = 0L;
                } else if (!((String)object).toLowerCase().contains("recommended")) {
                    l2 = p.m((String)object);
                }
                return l2;
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get view count");
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get view count: no metadata part in the metadata parts array");
    }

    @Override
    public final long i() {
        if (!this.z() && !this.A()) {
            List list = com.github.catvod.spider.merge.K1.f.a(this.a, "contentImage.thumbnailViewModel.overlays").c().flatMap(l.e).map(j.c).collect(Collectors.toList());
            if (list.isEmpty()) {
                return -1L;
            }
            Throwable throwable = null;
            for (String string : list) {
                int n2;
                if (string == null || !string.matches(".*\\d.*")) continue;
                try {
                    n2 = A.C(string);
                }
                catch (com.github.catvod.spider.merge.n1.i i2) {
                    continue;
                }
                return n2;
            }
            if (throwable == null) {
                return -1L;
            }
            throw new com.github.catvod.spider.merge.n1.i("Could not get duration", throwable);
        }
        return -1L;
    }

    @Override
    public final int j() {
        if (this.y()) {
            return 3;
        }
        boolean bl = this.z();
        int n2 = 2;
        if (bl) {
            return 2;
        }
        if (this.A()) {
            n2 = 5;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override
    public final boolean l() {
        String string = this.getName();
        boolean bl = "[Private video]".equals(string) || "[Deleted video]".equals(string);
        return bl;
    }

    @Override
    public final String m() {
        String string;
        if (this.z()) {
            return null;
        }
        String string2 = string = this.v();
        if (this.A()) {
            string2 = string.replace("Premieres ", "").replace("Scheduled for ", "");
        }
        return string2;
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> o() {
        return A.m(com.github.catvod.spider.merge.K1.f.a(this.u().a(), "avatarViewModel.image.sources"));
    }

    @Override
    public final /* synthetic */ String q() {
        return null;
    }

    @Override
    public final b r() {
        if (this.b == null) {
            return null;
        }
        Object object = this.m();
        if (object == null) {
            return null;
        }
        if (this.A()) {
            object = this.v().replace("Premieres ", "").replace("Scheduled for ", "");
            try {
                object = new b(LocalDateTime.parse((CharSequence)object, h).atZone(ZoneOffset.UTC).toInstant(), false);
                return object;
            }
            catch (DateTimeParseException dateTimeParseException) {
                throw new com.github.catvod.spider.merge.n1.i("Could not parse premiere upload date", dateTimeParseException);
            }
        }
        return this.b.d((String)object);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> s() {
        return A.m(com.github.catvod.spider.merge.K1.f.a(this.a, "contentImage.thumbnailViewModel.image.sources"));
    }
}

