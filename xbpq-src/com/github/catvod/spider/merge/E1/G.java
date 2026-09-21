/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.E1.E;
import com.github.catvod.spider.merge.E1.F;
import com.github.catvod.spider.merge.E1.d;
import com.github.catvod.spider.merge.E1.i;
import com.github.catvod.spider.merge.E1.l;
import com.github.catvod.spider.merge.E1.n;
import com.github.catvod.spider.merge.E1.o;
import com.github.catvod.spider.merge.E1.p;
import com.github.catvod.spider.merge.E1.q;
import com.github.catvod.spider.merge.E1.r;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.F1.c;
import com.github.catvod.spider.merge.H1.k;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.p1.b;
import com.github.catvod.spider.merge.p1.j;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class G
implements k {
    private static final Pattern e = Pattern.compile("([\\d,]+) views$");
    public static final int f = 0;
    private final e a;
    private final j b;
    private m c;
    private Boolean d;

    public G(e e2, j j2) {
        this.a = e2;
        this.b = j2;
    }

    public static /* synthetic */ Optional t(G g2) {
        return g2.a.b("thumbnailOverlays").c().filter(o.c).findFirst();
    }

    private Instant u() {
        String string = this.a.g("upcomingEventData").i("startTime", null);
        try {
            Instant instant = Instant.ofEpochSecond(Long.parseLong(string));
            return instant;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i(s.a("Could not parse date from premiere: \"", string, "\""), exception);
        }
    }

    private long v() {
        String string = this.a.g("title").g("accessibility").g("accessibilityData").i("label", "");
        if (string.toLowerCase().endsWith("no views")) {
            return 0L;
        }
        return Long.parseLong(com.github.catvod.spider.merge.K1.p.o(com.github.catvod.spider.merge.K1.d.g(e, string, 1)));
    }

    private long w(String string, boolean bl) {
        long l2;
        if (string.toLowerCase().contains("no views")) {
            return 0L;
        }
        if (string.toLowerCase().contains("recommended")) {
            return -1L;
        }
        if (bl) {
            l2 = com.github.catvod.spider.merge.K1.p.m(string);
        } else {
            int n2 = com.github.catvod.spider.merge.K1.p.c;
            l2 = Long.parseLong(string.replaceAll("\\D+", ""));
        }
        return l2;
    }

    private boolean x() {
        if (this.d == null) {
            this.d = ((AbstractMap)this.a).containsKey("upcomingEventData");
        }
        return this.d;
    }

    private boolean y() {
        return this.a.b("badges").c().anyMatch(com.github.catvod.spider.merge.E1.d.e);
    }

    @Override
    public final String a() {
        String string;
        String string2 = string = A.r(this.a.g("longBylineText").b("runs").a(0).g("navigationEndpoint"));
        if (com.github.catvod.spider.merge.K1.p.j(string)) {
            string2 = string = A.r(this.a.g("ownerText").b("runs").a(0).g("navigationEndpoint"));
            if (com.github.catvod.spider.merge.K1.p.j(string) && com.github.catvod.spider.merge.K1.p.j(string2 = A.r(this.a.g("shortBylineText").b("runs").a(0).g("navigationEndpoint")))) {
                throw new com.github.catvod.spider.merge.n1.i("Could not get uploader url");
            }
        }
        return string2;
    }

    @Override
    public final boolean b() {
        return A.y(this.a.b("ownerBadges"));
    }

    @Override
    public final String c() {
        String string;
        String string2 = string = A.o(this.a.g("longBylineText"), false);
        if (com.github.catvod.spider.merge.K1.p.j(string)) {
            string2 = string = A.o(this.a.g("ownerText"), false);
            if (com.github.catvod.spider.merge.K1.p.j(string) && com.github.catvod.spider.merge.K1.p.j(string2 = A.o(this.a.g("shortBylineText"), false))) {
                throw new com.github.catvod.spider.merge.n1.i("Could not get uploader name");
            }
        }
        return string2;
    }

    @Override
    public final m e() {
        m m2 = this.c;
        if (m2 != null) {
            return m2;
        }
        this.c = m2 = this.a.b("badges").c().filter(com.github.catvod.spider.merge.E1.d.d).findFirst().or(new com.github.catvod.spider.merge.p1.i(this, 1)).map(l.d).orElse(m.b);
        return m2;
    }

    @Override
    public final String g() {
        try {
            String string = this.a.i("videoId", null);
            string = com.github.catvod.spider.merge.F1.c.l().e(string);
            return string;
        }
        catch (Exception exception) {
            throw new com.github.catvod.spider.merge.n1.i("Could not get url", exception);
        }
    }

    @Override
    public final String getName() {
        e e2 = this.a.g("title");
        String string = A.o(e2, false);
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            return string;
        }
        if (!com.github.catvod.spider.merge.K1.p.l(e2) && !((AbstractMap)e2).containsKey("runs")) {
            return "";
        }
        throw new com.github.catvod.spider.merge.n1.i("Could not get name");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long h() {
        if (this.y()) return -1L;
        if (this.x()) {
            return -1L;
        }
        String string = A.o(this.a.g("viewCountText"), false);
        if (!com.github.catvod.spider.merge.K1.p.j(string)) {
            try {
                return this.w(string, false);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.e() != m.d) {
            try {
                return this.v();
            }
            catch (Exception exception) {}
        }
        if (((AbstractMap)this.a).containsKey("videoInfo")) {
            try {
                return this.w(this.a.g("videoInfo").b("runs").a(0).i("text", ""), true);
            }
            catch (Exception exception) {}
        }
        if (!((AbstractMap)this.a).containsKey("shortViewCountText")) return -1L;
        try {
            string = A.o(this.a.g("shortViewCountText"), false);
            if (com.github.catvod.spider.merge.K1.p.j(string)) return -1L;
            return this.w(string, true);
        }
        catch (Exception exception) {
            return -1L;
        }
    }

    @Override
    public final long i() {
        if (this.e() == m.d) {
            return -1L;
        }
        String string = A.o(this.a.g("lengthText"), false);
        Object object = string;
        if (com.github.catvod.spider.merge.K1.p.j(string)) {
            string = this.a.i("lengthSeconds", null);
            if (com.github.catvod.spider.merge.K1.p.j(string)) {
                for (String string2 : this.a.b("thumbnailOverlays").c().filter(n.c).map(i.c).filter(F.a).collect(Collectors.toList())) {
                    int n2;
                    try {
                        n2 = A.C(string2);
                    }
                    catch (com.github.catvod.spider.merge.n1.i i2) {
                        continue;
                    }
                    return n2;
                }
            }
            object = string;
            if (com.github.catvod.spider.merge.K1.p.j(string)) {
                if (this.x()) {
                    return -1L;
                }
                throw new com.github.catvod.spider.merge.n1.i("Could not get duration");
            }
        }
        return A.C((String)object);
    }

    @Override
    public final int j() {
        if (this.x()) {
            return 5;
        }
        if (this.a.b("badges").c().anyMatch(r.c)) {
            return 3;
        }
        if (this.y()) {
            return 4;
        }
        return 2;
    }

    @Override
    public final boolean k() {
        boolean bl;
        boolean bl2;
        block5: {
            try {
                String string = this.a.g("navigationEndpoint").g("commandMetadata").g("webCommandMetadata").i("webPageType", null);
                bl2 = !com.github.catvod.spider.merge.K1.p.j(string) && string.equals("WEB_PAGE_TYPE_SHORTS");
                bl = bl2;
                if (bl2) break block5;
            }
            catch (Exception exception) {
                throw new com.github.catvod.spider.merge.n1.i("Could not determine if this is short-form content", exception);
            }
            bl = ((AbstractMap)this.a.g("navigationEndpoint")).containsKey("reelWatchEndpoint");
        }
        bl2 = bl;
        if (!bl) {
            bl2 = this.a.b("thumbnailOverlays").c().filter(q.d).map(E.b).anyMatch(p.c);
        }
        return bl2;
    }

    @Override
    public final boolean l() {
        boolean bl = this.y() || this.getName().equals("[Private video]") || this.getName().equals("[Deleted video]");
        return bl;
    }

    @Override
    public final String m() {
        Object object;
        block4: {
            object = this.e();
            Object object2 = m.d;
            Object var2_3 = null;
            if (object == object2) {
                return null;
            }
            if (this.x()) {
                object = LocalDateTime.ofInstant(this.u(), ZoneId.systemDefault());
                return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format((TemporalAccessor)object);
            }
            object = object2 = A.o(this.a.g("publishedTimeText"), false);
            if (com.github.catvod.spider.merge.K1.p.j((String)object2)) {
                object = object2;
                if (((AbstractMap)this.a).containsKey("videoInfo")) {
                    object = this.a.g("videoInfo").b("runs").a(2).i("text", null);
                }
            }
            if (!com.github.catvod.spider.merge.K1.p.j((String)object)) break block4;
            object = var2_3;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final List<com.github.catvod.spider.merge.k1.c> o() {
        String string;
        e e2;
        if (((AbstractMap)this.a).containsKey("channelThumbnailSupportedRenderers")) {
            e2 = this.a;
            string = "channelThumbnailSupportedRenderers.channelThumbnailWithLinkRenderer.thumbnail.thumbnails";
            return A.m(com.github.catvod.spider.merge.K1.f.a(e2, string));
        }
        if (!((AbstractMap)this.a).containsKey("channelThumbnail")) return Collections.emptyList();
        e2 = this.a;
        string = "channelThumbnail.thumbnails";
        return A.m(com.github.catvod.spider.merge.K1.f.a(e2, string));
    }

    @Override
    public final String q() {
        if (((AbstractMap)this.a).containsKey("detailedMetadataSnippets")) {
            return A.o(this.a.b("detailedMetadataSnippets").a(0).g("snippetText"), false);
        }
        if (((AbstractMap)this.a).containsKey("descriptionSnippet")) {
            return A.o(this.a.g("descriptionSnippet"), false);
        }
        return null;
    }

    @Override
    public final b r() {
        if (this.e() == m.d) {
            return null;
        }
        if (this.x()) {
            return new b(this.u(), false);
        }
        Object object = this.m();
        if (this.b != null && !com.github.catvod.spider.merge.K1.p.j((String)object)) {
            try {
                object = this.b.d((String)object);
                return object;
            }
            catch (com.github.catvod.spider.merge.n1.i i2) {
                throw new com.github.catvod.spider.merge.n1.i("Could not get upload date", i2);
            }
        }
        return null;
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> s() {
        return A.q(this.a);
    }
}

