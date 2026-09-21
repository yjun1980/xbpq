/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.B1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.B1.a;
import com.github.catvod.spider.merge.B1.c;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.H1.f;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.m1.d;
import com.github.catvod.spider.merge.n1.g;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.n1.m;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class b
extends com.github.catvod.spider.merge.H1.g {
    private com.github.catvod.spider.merge.F0.e e;
    private boolean f = true;

    public b(com.github.catvod.spider.merge.k1.p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b0(b object, List list, com.github.catvod.spider.merge.F0.e object2) {
        Objects.requireNonNull(object);
        String string = ((com.github.catvod.spider.merge.F0.e)object2).i("url", null);
        if (p.j(string)) {
            return;
        }
        try {
            String string2 = ((com.github.catvod.spider.merge.F0.e)object2).i("preset", " ");
            object2 = ((com.github.catvod.spider.merge.F0.e)object2).g("format").i("protocol", null);
            if (((String)object2).contains("encrypted")) {
                return;
            }
            com.github.catvod.spider.merge.H1.a a2 = new com.github.catvod.spider.merge.H1.a();
            a2.u(string2);
            if (((String)object2).equals("hls")) {
                a2.t(3);
            }
            a2.s(super.c0(string), true);
            if (string2.contains("mp3")) {
                a2.x(com.github.catvod.spider.merge.k1.i.i);
                a2.r(128);
            } else if (string2.contains("opus")) {
                a2.x(com.github.catvod.spider.merge.k1.i.j);
                a2.r(64);
            } else {
                if (!string2.contains("aac_160k")) return;
                a2.x(com.github.catvod.spider.merge.k1.i.g);
                a2.r(160);
            }
            object = a2.m();
            if (com.github.catvod.spider.merge.H1.f.a((f)object, list)) return;
            list.add(object);
            return;
        }
        catch (com.github.catvod.spider.merge.n1.e | IOException exception) {
            return;
        }
    }

    private String c0(String object) {
        String string = s.a((String)object, "?client_id=", com.github.catvod.spider.merge.A1.a.a());
        String string2 = this.e.i("track_authorization", null);
        object = string;
        if (!p.j(string2)) {
            object = s.a(string, "&track_authorization=", string2);
        }
        object = l.a().b((String)object).c();
        try {
            object = com.github.catvod.spider.merge.F0.g.d().a((String)object);
            return ((com.github.catvod.spider.merge.F0.e)object).i("url", null);
        }
        catch (h h2) {
            throw new i("Could not parse streamable URL", h2);
        }
    }

    @Override
    public final long A() {
        return this.e.f("duration") / 1000L;
    }

    @Override
    public final String B() {
        return this.e.i("license", null);
    }

    @Override
    public final long C() {
        Object v2 = ((AbstractMap)this.e).get("likes_count");
        long l2 = v2 instanceof Number ? ((Number)v2).longValue() : -1L;
        return l2;
    }

    @Override
    public final int E() {
        int n2 = this.e.i("sharing", null).equals("public") ? 1 : 3;
        return n2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final com.github.catvod.spider.merge.k1.g F() {
        com.github.catvod.spider.merge.q1.c c2 = new com.github.catvod.spider.merge.q1.c(this.l(), 1);
        Object object = com.github.catvod.spider.merge.G1.a.a("https://api-v2.soundcloud.com/tracks/", p.c(this.g()), "/related?client_id=", p.c(com.github.catvod.spider.merge.A1.a.a()));
        object = l.a().d((String)object, null, com.github.catvod.spider.merge.k1.m.a.b());
        if (((d)object).d() >= 400) throw new IOException(r.a("Could not get streams from API, HTTP ", ((d)object).d()));
        com.github.catvod.spider.merge.F0.e e2 = com.github.catvod.spider.merge.F0.g.d().a(((d)object).c());
        for (Object e3 : e2.b("collection")) {
            if (!(e3 instanceof com.github.catvod.spider.merge.F0.e)) continue;
            c2.h(new c((com.github.catvod.spider.merge.F0.e)e3));
        }
        try {
            if (!e2.i("next_href", null).contains("client_id=")) {
                com.github.catvod.spider.merge.A1.a.a();
            }
            return c2;
        }
        catch (Exception exception) {
            return c2;
        }
        catch (h h2) {
            throw new i("Could not parse json response", h2);
        }
    }

    @Override
    public final com.github.catvod.spider.merge.H1.m H() {
        return com.github.catvod.spider.merge.H1.m.c;
    }

    @Override
    public final List<String> N() {
        String[] stringArray = this.e.i("tag_list", null).split(" ");
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = stringArray.length;
        boolean bl = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            boolean bl2;
            String string = stringArray[i2];
            if (string.startsWith("\"")) {
                stringBuilder.append(string.replace("\"", ""));
                bl2 = true;
            } else if (bl) {
                boolean bl3 = string.endsWith("\"");
                stringBuilder.append(" ");
                if (bl3) {
                    stringBuilder.append(string.replace("\"", ""));
                    arrayList.add(stringBuilder.toString());
                    bl2 = false;
                } else {
                    stringBuilder.append(string);
                    bl2 = bl;
                }
            } else {
                bl2 = bl;
                if (!string.isEmpty()) {
                    arrayList.add(string);
                    bl2 = bl;
                }
            }
            bl = bl2;
        }
        return arrayList;
    }

    @Override
    public final String O() {
        return this.e.i("created_at", null);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        return com.github.catvod.spider.merge.A1.a.c(this.e);
    }

    @Override
    public final long Q() {
        long l2;
        long l3 = l2 = this.R("(#t=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
        if (l2 == -2L) {
            l3 = 0L;
        }
        return l3;
    }

    @Override
    public final com.github.catvod.spider.merge.p1.b S() {
        return com.github.catvod.spider.merge.A1.a.d(this.e.i("created_at", null));
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> T() {
        com.github.catvod.spider.merge.F0.e e2 = this.e;
        int n2 = com.github.catvod.spider.merge.A1.a.e;
        return com.github.catvod.spider.merge.A1.a.b(p.p(e2.g("user").i("avatar_url", "")));
    }

    @Override
    public final String U() {
        com.github.catvod.spider.merge.F0.e e2 = this.e;
        int n2 = com.github.catvod.spider.merge.A1.a.e;
        return e2.g("user").i("username", "");
    }

    @Override
    public final String W() {
        com.github.catvod.spider.merge.F0.e e2 = this.e;
        int n2 = com.github.catvod.spider.merge.A1.a.e;
        return p.p(e2.g("user").i("permalink_url", ""));
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> X() {
        return Collections.emptyList();
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> Y() {
        return Collections.emptyList();
    }

    @Override
    public final long Z() {
        return this.e.f("playback_count");
    }

    @Override
    public final boolean a0() {
        return this.e.g("user").c("verified");
    }

    @Override
    public final String g() {
        return String.valueOf(this.e.f("id"));
    }

    @Override
    public final String i() {
        return this.e.i("title", null);
    }

    @Override
    public final void o(com.github.catvod.spider.merge.m1.a object) {
        String string = this.n();
        int n2 = com.github.catvod.spider.merge.A1.a.e;
        string = p.c(string);
        String string2 = com.github.catvod.spider.merge.A1.a.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://api-v2.soundcloud.com/resolve?url=");
        stringBuilder.append(string);
        stringBuilder.append("&client_id=");
        stringBuilder.append(string2);
        string = stringBuilder.toString();
        try {
            object = ((com.github.catvod.spider.merge.m1.a)object).d(string, null, com.github.catvod.spider.merge.k1.m.a.b()).c();
            this.e = object = com.github.catvod.spider.merge.F0.g.d().a((String)object);
            object = ((com.github.catvod.spider.merge.F0.e)object).i("policy", "");
            if (!((String)object).equals("ALLOW") && !((String)object).equals("MONETIZE")) {
                this.f = false;
                if (!((String)object).equals("SNIP")) {
                    if (((String)object).equals("BLOCK")) {
                        throw new g("This track is not available in user's country");
                    }
                    throw new com.github.catvod.spider.merge.n1.c(com.github.catvod.spider.merge.B.e.c("Content not available: policy ", (String)object));
                }
                throw new m();
            }
            return;
        }
        catch (h h2) {
            throw new i("Could not parse json response", h2);
        }
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        ArrayList<com.github.catvod.spider.merge.H1.b> arrayList = new ArrayList<com.github.catvod.spider.merge.H1.b>();
        if (this.e.c("streamable") && this.f) {
            try {
                Object object = this.e.g("media").b("transcodings");
                if (!p.k(object)) {
                    Stream<com.github.catvod.spider.merge.F0.e> stream = ((com.github.catvod.spider.merge.F0.c)object).c();
                    object = new a(this, arrayList);
                    stream.forEachOrdered((Consumer<com.github.catvod.spider.merge.F0.e>)object);
                }
                return arrayList;
            }
            catch (NullPointerException nullPointerException) {
                throw new com.github.catvod.spider.merge.n1.e("Could not get audio streams", nullPointerException);
            }
        }
        return arrayList;
    }

    @Override
    public final String r() {
        return this.e.i("genre", null);
    }

    @Override
    public final com.github.catvod.spider.merge.H1.d t() {
        return com.github.catvod.spider.merge.H1.d.b(this.e.i("description", null), com.github.catvod.spider.merge.H1.c.c);
    }
}

