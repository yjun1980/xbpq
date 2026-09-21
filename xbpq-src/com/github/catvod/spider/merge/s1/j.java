/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.g0.u;
import com.github.catvod.spider.merge.g1.l;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.n1.e;
import com.github.catvod.spider.merge.s1.b;
import com.github.catvod.spider.merge.s1.c;
import com.github.catvod.spider.merge.s1.g;
import com.github.catvod.spider.merge.s1.h;
import com.github.catvod.spider.merge.s1.i;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class j
extends com.github.catvod.spider.merge.H1.g {
    private com.github.catvod.spider.merge.F0.e e;
    private com.github.catvod.spider.merge.F0.e f;
    private com.github.catvod.spider.merge.e1.h g;

    public j(p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    @Override
    public long A() {
        Object v2 = ((AbstractMap)this.e.b("trackinfo").a(0)).get("duration");
        double d2 = v2 instanceof Number ? ((Number)v2).doubleValue() : 0.0;
        return (long)d2;
    }

    @Override
    public String B() {
        switch (this.f.e("license_type", 0)) {
            default: {
                return "Unknown";
            }
            case 8: {
                return "CC BY-SA 3.0";
            }
            case 6: {
                return "CC BY 3.0";
            }
            case 5: {
                return "CC BY-ND 3.0";
            }
            case 4: {
                return "CC BY-NC 3.0";
            }
            case 3: {
                return "CC BY-NC-SA 3.0";
            }
            case 2: {
                return "CC BY-NC-ND 3.0";
            }
            case 1: 
        }
        return "All rights reserved \u00a9";
    }

    @Override
    public final m H() {
        return m.c;
    }

    @Override
    public List<String> N() {
        com.github.catvod.spider.merge.e1.h h2 = this.g;
        Objects.requireNonNull(h2);
        return com.github.catvod.spider.merge.g1.c.a(new l("itemprop", "keywords"), h2).stream().map(c.a).collect(Collectors.toList());
    }

    @Override
    public String O() {
        return this.f.i("publish_date", null);
    }

    @Override
    public List<com.github.catvod.spider.merge.k1.c> P() {
        com.github.catvod.spider.merge.F0.e e2 = this.e;
        boolean bl = ((AbstractMap)e2).containsKey("art_id") && ((AbstractMap)e2).get("art_id") == null;
        if (bl) {
            return Collections.emptyList();
        }
        return b.b(this.e.f("art_id"), true);
    }

    @Override
    public final com.github.catvod.spider.merge.p1.b S() {
        return b.f(this.O());
    }

    @Override
    public List<com.github.catvod.spider.merge.k1.c> T() {
        return b.c(this.g.X("band-photo").stream().map(i.a).findFirst().orElse(""));
    }

    @Override
    public String U() {
        return this.e.i("artist", null);
    }

    @Override
    public String W() {
        return s.a("https://", this.n().split("/")[2], "/");
    }

    @Override
    public final List<r> X() {
        return Collections.emptyList();
    }

    @Override
    public final List<r> Y() {
        return Collections.emptyList();
    }

    public com.github.catvod.spider.merge.q1.c b0() {
        com.github.catvod.spider.merge.q1.c c2 = new com.github.catvod.spider.merge.q1.c(this.l(), 0);
        this.g.X("recommended-album").stream().map(com.github.catvod.spider.merge.s1.g.a).forEach(new u(c2, 1));
        return c2;
    }

    @Override
    public String i() {
        return this.f.i("title", null);
    }

    @Override
    public String n() {
        return com.github.catvod.spider.merge.K1.p.p(this.e.i("url", null));
    }

    @Override
    public void o(a object) {
        object = ((a)object).b(this.h().d()).c();
        this.g = com.github.catvod.spider.merge.c1.d.l((String)object);
        try {
            this.e = object = com.github.catvod.spider.merge.K1.f.d((String)object, "data-tralbum");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new com.github.catvod.spider.merge.n1.i("JSON does not exist", arrayIndexOutOfBoundsException);
        }
        catch (com.github.catvod.spider.merge.F0.h h2) {
            throw new com.github.catvod.spider.merge.n1.i("Faulty JSON; page likely does not contain album data", h2);
        }
        this.f = ((com.github.catvod.spider.merge.F0.e)object).g("current");
        int n2 = ((AbstractCollection)this.e.b("trackinfo")).size();
        boolean bl = true;
        if (n2 <= 1) {
            object = this.e.b("trackinfo").a(0);
            if (!((AbstractMap)object).containsKey("file") || ((AbstractMap)object).get("file") != null) {
                bl = false;
            }
            if (!bl) {
                return;
            }
            throw new com.github.catvod.spider.merge.n1.h("This track is not available without being purchased");
        }
        throw new e("Page is actually an album, not a track");
    }

    @Override
    public List<com.github.catvod.spider.merge.H1.b> q() {
        com.github.catvod.spider.merge.H1.a a2 = new com.github.catvod.spider.merge.H1.a();
        a2.u("mp3-128");
        a2.s(this.e.b("trackinfo").a(0).g("file").i("mp3-128", null), true);
        a2.x(com.github.catvod.spider.merge.k1.i.i);
        a2.r(128);
        return Collections.singletonList(a2.m());
    }

    @Override
    public String r() {
        return this.g.X("tralbum-tags").stream().flatMap(h.a).map(c.a).findFirst().orElse("");
    }

    @Override
    public d t() {
        String string = this.f.i("about", null);
        String string2 = this.f.i("lyrics", null);
        int n2 = 1;
        String string3 = this.f.i("credits", null);
        int n3 = com.github.catvod.spider.merge.K1.p.c;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < 3; ++i2) {
            String string4 = (new String[]{string, string2, string3})[i2];
            n3 = n2;
            if (!com.github.catvod.spider.merge.K1.p.j(string4)) {
                n3 = n2;
                if (!string4.equals("null")) {
                    if (n2 == 0) {
                        stringBuilder.append((CharSequence)"\n\n");
                    }
                    stringBuilder.append(string4);
                    n3 = 0;
                }
            }
            n2 = n3;
        }
        return d.b(stringBuilder.toString(), com.github.catvod.spider.merge.H1.c.c);
    }
}

