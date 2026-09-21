/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.E1.c;
import com.github.catvod.spider.merge.E1.d;
import com.github.catvod.spider.merge.E1.e;
import com.github.catvod.spider.merge.E1.f;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.q1.b;
import java.util.List;

public final class g
implements b {
    private final com.github.catvod.spider.merge.F0.e a;
    private final com.github.catvod.spider.merge.F0.e b;
    private final com.github.catvod.spider.merge.F0.e c;
    private final com.github.catvod.spider.merge.F0.e d;
    private int e;

    public g(com.github.catvod.spider.merge.F0.e e2) {
        this.a = e2;
        this.b = e2.g("contentImage").g("collectionThumbnailViewModel").g("primaryThumbnail").g("thumbnailViewModel");
        this.c = e2 = e2.g("metadata").g("lockupMetadataViewModel");
        this.d = e2.g("metadata").g("contentMetadataViewModel").b("metadataRows").a(0);
        try {
            this.e = A.e(this.t());
        }
        catch (i i2) {
            this.e = 1;
        }
    }

    private String t() {
        String string;
        String string2 = string = this.a.i("contentId", null);
        if (p.j(string)) {
            string2 = this.a.g("rendererContext").g("commandContext").g("watchEndpoint").i("playlistId", null);
        }
        if (!p.j(string2)) {
            return string2;
        }
        throw new i("Could not get playlist ID");
    }

    @Override
    public final String a() {
        if (this.e != 1) {
            return null;
        }
        return A.r(this.d.b("metadataParts").a(0).g("text").b("commandRuns").a(0).g("onTap").g("innertubeCommand"));
    }

    @Override
    public final boolean b() {
        if (this.e != 1) {
            return false;
        }
        return A.v(this.d.b("metadataParts").a(0).g("text").b("attachmentRuns"));
    }

    @Override
    public final String c() {
        return this.d.b("metadataParts").a(0).g("text").i("content", null);
    }

    @Override
    public final long d() {
        if (this.e != 1) {
            return -2L;
        }
        try {
            long l2 = Long.parseLong(p.o(this.b.b("overlays").c().filter(com.github.catvod.spider.merge.E1.d.b).findFirst().orElseThrow(com.github.catvod.spider.merge.E1.e.a).g("thumbnailOverlayBadgeViewModel").b("thumbnailBadges").c().filter(com.github.catvod.spider.merge.E1.c.b).findFirst().orElseThrow(f.a).g("thumbnailBadgeViewModel").i("text", null)));
            return l2;
        }
        catch (Exception exception) {
            throw new i("Could not get playlist stream count", exception);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String g() {
        if (this.e != 1) return A.r(this.a.g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand"));
        try {
            return com.github.catvod.spider.merge.F1.b.m().e(this.t());
        }
        catch (Exception exception) {
            return A.r(this.a.g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand"));
        }
    }

    @Override
    public final com.github.catvod.spider.merge.H1.d getDescription() {
        return com.github.catvod.spider.merge.H1.d.c;
    }

    @Override
    public final String getName() {
        return this.c.g("title").i("content", null);
    }

    @Override
    public final int n() {
        return this.e;
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> s() {
        return A.m(this.b.g("image").b("sources"));
    }
}

