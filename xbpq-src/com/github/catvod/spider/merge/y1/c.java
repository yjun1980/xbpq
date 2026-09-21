/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.y1;

import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.H1.l;
import com.github.catvod.spider.merge.H1.m;
import com.github.catvod.spider.merge.H1.o;
import com.github.catvod.spider.merge.H1.q;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.K1.g;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.e;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.n1.k;
import com.github.catvod.spider.merge.y1.a;
import com.github.catvod.spider.merge.y1.b;
import com.github.catvod.spider.merge.y1.d;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Stream;

public final class c
extends com.github.catvod.spider.merge.H1.g {
    private final String e;
    private com.github.catvod.spider.merge.F0.e f;
    private final List<com.github.catvod.spider.merge.H1.p> g = new ArrayList<com.github.catvod.spider.merge.H1.p>();
    private final List<com.github.catvod.spider.merge.H1.b> h = new ArrayList<com.github.catvod.spider.merge.H1.b>();
    private final List<com.github.catvod.spider.merge.H1.r> i = new ArrayList<com.github.catvod.spider.merge.H1.r>();
    private i j = null;

    public c(com.github.catvod.spider.merge.k1.p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
        this.e = this.c();
    }

    private void b0(com.github.catvod.spider.merge.F0.e object, boolean bl, String object2, String string, String string2, String string3) {
        CharSequence charSequence = string2.substring(string2.lastIndexOf(".") + 1);
        com.github.catvod.spider.merge.k1.i i2 = com.github.catvod.spider.merge.k1.i.b((String)charSequence);
        String string4 = s.a((String)object2, "-", (String)charSequence);
        Object object3 = this.h;
        object2 = new com.github.catvod.spider.merge.H1.a();
        ((com.github.catvod.spider.merge.H1.a)object2).u(r.b(string4, "-", string, "-", com.github.catvod.spider.merge.A.c.d(1)));
        ((com.github.catvod.spider.merge.H1.a)object2).s(string2, true);
        ((com.github.catvod.spider.merge.H1.a)object2).x(i2);
        ((com.github.catvod.spider.merge.H1.a)object2).r(-1);
        ((ArrayList)object3).add((com.github.catvod.spider.merge.H1.b)((com.github.catvod.spider.merge.H1.a)object2).m());
        if (!p.j(string3)) {
            object2 = bl ? this.e0((com.github.catvod.spider.merge.F0.e)object, string, (String)charSequence, string2) : string3.replace("master", com.github.catvod.spider.merge.K1.f.e((com.github.catvod.spider.merge.F0.e)object).toString());
            object3 = new com.github.catvod.spider.merge.H1.a();
            string2 = com.github.catvod.spider.merge.A.c.d(3);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string4);
            ((StringBuilder)charSequence).append("-");
            ((StringBuilder)charSequence).append(string2);
            ((com.github.catvod.spider.merge.H1.a)object3).u(((StringBuilder)charSequence).toString());
            ((com.github.catvod.spider.merge.H1.a)object3).s((String)object2, true);
            ((com.github.catvod.spider.merge.H1.a)object3).t(3);
            ((com.github.catvod.spider.merge.H1.a)object3).x(i2);
            ((com.github.catvod.spider.merge.H1.a)object3).r(-1);
            ((com.github.catvod.spider.merge.H1.a)object3).w(string3);
            object2 = ((com.github.catvod.spider.merge.H1.a)object3).m();
            if (!com.github.catvod.spider.merge.H1.f.a((com.github.catvod.spider.merge.H1.f)object2, this.h)) {
                ((ArrayList)this.h).add((com.github.catvod.spider.merge.H1.b)object2);
            }
        }
        if (!p.j(string2 = com.github.catvod.spider.merge.K1.f.g((com.github.catvod.spider.merge.F0.e)object, "torrentUrl"))) {
            object2 = this.h;
            object = new com.github.catvod.spider.merge.H1.a();
            ((com.github.catvod.spider.merge.H1.a)object).u(r.b(string4, "-", string, "-", com.github.catvod.spider.merge.A.c.d(5)));
            ((com.github.catvod.spider.merge.H1.a)object).s(string2, true);
            ((com.github.catvod.spider.merge.H1.a)object).t(5);
            ((com.github.catvod.spider.merge.H1.a)object).x(i2);
            ((com.github.catvod.spider.merge.H1.a)object).r(-1);
            ((ArrayList)object2).add((com.github.catvod.spider.merge.H1.b)((com.github.catvod.spider.merge.H1.a)object).m());
        }
    }

    private void c0(com.github.catvod.spider.merge.F0.e object, boolean bl, String string, String string2, String object2, String object3) {
        Object object4 = ((String)object2).substring(((String)object2).lastIndexOf(".") + 1);
        com.github.catvod.spider.merge.k1.i i2 = com.github.catvod.spider.merge.k1.i.b((String)object4);
        String string3 = s.a(string, "-", (String)object4);
        boolean bl2 = ((AbstractMap)object).containsKey("hasAudio") && !((com.github.catvod.spider.merge.F0.e)object).d("hasAudio");
        Object object5 = this.i;
        Object object6 = new q();
        ((q)object6).d(r.b(string3, "-", string2, "-", com.github.catvod.spider.merge.A.c.d(1)));
        ((q)object6).b((String)object2, true);
        ((q)object6).e(bl2);
        ((q)object6).i(string);
        ((q)object6).h(i2);
        ((ArrayList)object5).add((com.github.catvod.spider.merge.H1.r)((q)object6).a());
        if (!p.j((String)object3)) {
            object2 = bl ? this.e0((com.github.catvod.spider.merge.F0.e)object, string2, (String)object4, (String)object2) : ((String)object3).replace("master", com.github.catvod.spider.merge.K1.f.e((com.github.catvod.spider.merge.F0.e)object).toString());
            object4 = new q();
            object6 = com.github.catvod.spider.merge.A.c.d(3);
            object5 = new StringBuilder();
            ((StringBuilder)object5).append(string3);
            ((StringBuilder)object5).append("-");
            ((StringBuilder)object5).append((String)object6);
            ((q)object4).d(((StringBuilder)object5).toString());
            ((q)object4).b((String)object2, true);
            ((q)object4).e(bl2);
            ((q)object4).c(3);
            ((q)object4).i(string);
            ((q)object4).h(i2);
            ((q)object4).g((String)object3);
            object2 = ((q)object4).a();
            if (!com.github.catvod.spider.merge.H1.f.a((com.github.catvod.spider.merge.H1.f)object2, this.i)) {
                ((ArrayList)this.i).add((com.github.catvod.spider.merge.H1.r)object2);
            }
        }
        if (!p.j((String)(object2 = com.github.catvod.spider.merge.K1.f.g((com.github.catvod.spider.merge.F0.e)object, "torrentUrl")))) {
            object = this.i;
            object3 = new q();
            ((q)object3).d(r.b(string3, "-", string2, "-", com.github.catvod.spider.merge.A.c.d(5)));
            ((q)object3).b((String)object2, true);
            ((q)object3).e(bl2);
            ((q)object3).c(5);
            ((q)object3).i(string);
            ((q)object3).h(i2);
            ((ArrayList)object).add(((q)object3).a());
        }
    }

    private com.github.catvod.spider.merge.F0.e d0(String object) {
        object = r.b(this.e, "/api/v1/videos/", this.g(), "/", (String)object);
        object = this.d().b((String)object);
        if (object != null) {
            if (((com.github.catvod.spider.merge.m1.d)object).d() == 400) {
                return null;
            }
            if (((com.github.catvod.spider.merge.m1.d)object).d() == 200) {
                try {
                    object = com.github.catvod.spider.merge.F0.g.d().a(((com.github.catvod.spider.merge.m1.d)object).c());
                    return object;
                }
                catch (h h2) {
                    throw new i("Could not parse json data for segments", h2);
                }
            }
            throw new i(r.a("Could not get segments from API. Response code: ", ((com.github.catvod.spider.merge.m1.d)object).d()));
        }
        throw new i("Could not get segments from API.");
    }

    private String e0(com.github.catvod.spider.merge.F0.e serializable, String string, String string2, String string3) {
        if ("fileDownloadUrl".equals(string)) {
            string3 = com.github.catvod.spider.merge.K1.f.g((com.github.catvod.spider.merge.F0.e)serializable, "fileUrl");
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("-fragmented.");
        ((StringBuilder)serializable).append(string2);
        return string3.replace(((StringBuilder)serializable).toString(), ".m3u8");
    }

    private void f0() {
        this.g0(this.f.b("files"), "");
        try {
            Iterator iterator = this.f.b("streamingPlaylists").c().iterator();
            while (iterator.hasNext()) {
                com.github.catvod.spider.merge.F0.e e2 = (com.github.catvod.spider.merge.F0.e)iterator.next();
                this.g0(e2.b("files"), e2.i("playlistUrl", null));
            }
            return;
        }
        catch (Exception exception) {
            throw new i("Could not get streams", exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void g0(com.github.catvod.spider.merge.F0.c object, String string) {
        try {
            boolean bl = !p.j(string) && string.endsWith("-master.m3u8");
            Iterator iterator = ((com.github.catvod.spider.merge.F0.c)object).c().iterator();
            while (true) {
                com.github.catvod.spider.merge.F0.e e2;
                if (!iterator.hasNext()) {
                    return;
                }
                boolean bl2 = ((AbstractMap)(e2 = (com.github.catvod.spider.merge.F0.e)iterator.next())).containsKey("fileUrl");
                object = bl2 ? "fileUrl" : "fileDownloadUrl";
                String string2 = com.github.catvod.spider.merge.K1.f.g(e2, (String)object);
                if (p.j(string2)) {
                    return;
                }
                String string3 = com.github.catvod.spider.merge.K1.f.g(e2, "resolution.label");
                object = ((AbstractMap)e2).containsKey("fileUrl") ? "fileUrl" : "fileDownloadUrl";
                if (string3.toLowerCase().contains("audio")) {
                    this.b0(e2, bl, string3, (String)object, string2, string);
                    continue;
                }
                this.c0(e2, bl, string3, (String)object, string2, string);
            }
        }
        catch (Exception exception) {
            throw new i("Could not get streams from array", exception);
        }
    }

    @Override
    public final long A() {
        return this.f.f("duration");
    }

    @Override
    public final String B() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "licence.label");
    }

    @Override
    public final long C() {
        return this.f.f("likes");
    }

    @Override
    public final int E() {
        int n2 = this.f.g("privacy").e("id", 0);
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                n3 = 3;
                if (n2 != 3) {
                    n3 = 4;
                    if (n2 != 4) {
                        return 5;
                    }
                }
            }
        }
        return n3;
    }

    public final com.github.catvod.spider.merge.k1.g F() {
        Object object;
        Object object2;
        Object object3;
        List<String> list2 = com.github.catvod.spider.merge.K1.f.h(this.f.b("tags"));
        if (list2.isEmpty()) {
            object3 = this.e;
            object2 = com.github.catvod.spider.merge.K1.f.g(this.f, "account.name");
            String string = com.github.catvod.spider.merge.K1.f.g(this.f, "account.host");
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("/api/v1/accounts/");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("@");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("/videos?start=0&count=8");
            object2 = ((StringBuilder)object).toString();
        } else {
            object2 = com.github.catvod.spider.merge.B.e.c(this.e, "/api/v1/search/videos");
            object = com.github.catvod.spider.merge.C.a.c("start=0&count=8&sort=-createdAt");
            for (String string : list2) {
                ((StringBuilder)object).append("&tagsOneOf=");
                ((StringBuilder)object).append(p.c(string));
            }
            object2 = s.a((String)object2, "?", String.valueOf(object));
        }
        boolean bl = p.h((String)object2);
        object = null;
        Object var4_6 = null;
        if (bl) {
            object2 = object;
        } else {
            object = new com.github.catvod.spider.merge.q1.c(this.l(), 1);
            object3 = this.d().b((String)object2);
            object2 = var4_6;
            if (object3 != null) {
                object2 = var4_6;
                if (!p.h(((com.github.catvod.spider.merge.m1.d)object3).c())) {
                    try {
                        object2 = com.github.catvod.spider.merge.F0.g.d().a(((com.github.catvod.spider.merge.m1.d)object3).c());
                    }
                    catch (h h2) {
                        throw new i("Could not parse json data for related videos", h2);
                    }
                }
            }
            if (object2 != null) {
                try {
                    object2 = (com.github.catvod.spider.merge.F0.c)com.github.catvod.spider.merge.K1.f.i((com.github.catvod.spider.merge.F0.e)object2, "data");
                    object2 = ((AbstractCollection)object2).iterator();
                }
                catch (Exception exception) {
                    throw new i("Could not extract related videos", exception);
                }
                while (object2.hasNext()) {
                    d d2;
                    Object e2 = object2.next();
                    if (!(e2 instanceof com.github.catvod.spider.merge.F0.e) || (d2 = new d((com.github.catvod.spider.merge.F0.e)e2, this.e)).g().equals(this.n())) continue;
                    ((com.github.catvod.spider.merge.q1.c)object).h(d2);
                }
            }
            object2 = object;
        }
        return object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<l> G() {
        void var2_4;
        ArrayList<l> arrayList;
        block4: {
            com.github.catvod.spider.merge.F0.c c2;
            com.github.catvod.spider.merge.F0.e e2;
            arrayList = new ArrayList<l>();
            try {
                e2 = this.d0("chapters");
                if (e2 == null || !((AbstractMap)e2).containsKey("chapters")) break block4;
                c2 = e2.b("chapters");
            }
            catch (k k2) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            for (int i2 = 0; i2 < ((AbstractCollection)c2).size(); ++i2) {
                e2 = c2.a(i2);
                e2.i("title", null);
                e2.e("timecode", 0);
                arrayList.add(new l());
            }
        }
        return arrayList;
        throw new i("Could not get stream segments", (Throwable)var2_4);
    }

    @Override
    public final m H() {
        m m2 = this.f.c("isLive") ? m.d : m.b;
        return m2;
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> I() {
        return com.github.catvod.spider.merge.K1.g.b(this.e, this.f.g("channel"));
    }

    @Override
    public final String J() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "channel.displayName");
    }

    @Override
    public final String K() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "channel.url");
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.p> L() {
        i i2 = this.j;
        if (i2 == null) {
            return this.g;
        }
        throw i2;
    }

    @Override
    public final String M() {
        try {
            String string = com.github.catvod.spider.merge.K1.f.g(this.f, "support");
            return string;
        }
        catch (i i2) {
            return "";
        }
    }

    @Override
    public final List<String> N() {
        return com.github.catvod.spider.merge.K1.f.h(this.f.b("tags"));
    }

    @Override
    public final String O() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "publishedAt");
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        return com.github.catvod.spider.merge.K1.g.c(this.e, this.f);
    }

    @Override
    public final long Q() {
        long l2;
        long l3 = l2 = this.R("((#|&|\\?)start=\\d{0,3}h?\\d{0,3}m?\\d{1,3}s?)");
        if (l2 == -2L) {
            l3 = 0L;
        }
        return l3;
    }

    @Override
    public final com.github.catvod.spider.merge.p1.b S() {
        return com.github.catvod.spider.merge.p1.b.a(com.github.catvod.spider.merge.K1.f.g(this.f, "publishedAt"));
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> T() {
        return com.github.catvod.spider.merge.K1.g.b(this.e, this.f.g("account"));
    }

    @Override
    public final String U() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "account.displayName");
    }

    @Override
    public final String W() {
        String string = com.github.catvod.spider.merge.K1.f.g(this.f, "account.name");
        String string2 = com.github.catvod.spider.merge.K1.f.g(this.f, "account.host");
        return this.k().a().i(com.github.catvod.spider.merge.G1.a.a("accounts/", string, "@", string2), this.e).d();
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> X() {
        return Collections.emptyList();
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.r> Y() {
        this.a();
        if (((ArrayList)this.i).isEmpty()) {
            if (this.H() == m.b) {
                this.f0();
            } else {
                try {
                    Stream stream = this.f.b("streamingPlaylists").c().map(b.a);
                    List<com.github.catvod.spider.merge.H1.r> list = this.i;
                    Objects.requireNonNull(list);
                    a a2 = new a(list);
                    stream.forEachOrdered(a2);
                }
                catch (Exception exception) {
                    throw new i("Could not get video streams", exception);
                }
            }
        }
        return this.i;
    }

    @Override
    public final long Z() {
        return this.f.f("views");
    }

    @Override
    public final String i() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "name");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(com.github.catvod.spider.merge.m1.a iterator) {
        Object object = this.e;
        String string2 = this.g();
        Object object2 = new StringBuilder();
        object2.append((String)object);
        object2.append("/api/v1/videos/");
        object2.append(string2);
        iterator = ((com.github.catvod.spider.merge.m1.a)((Object)iterator)).b(object2.toString());
        if (iterator == null) {
            throw new e("Could not extract PeerTube channel data");
        }
        iterator = ((com.github.catvod.spider.merge.m1.d)((Object)iterator)).c();
        try {
            iterator = com.github.catvod.spider.merge.F0.g.d().a((String)((Object)iterator));
            this.f = iterator;
            if (iterator == null) throw new e("Could not extract PeerTube stream data");
        }
        catch (h h2) {
            throw new e("Could not extract PeerTube stream data", h2);
        }
        if (!p.h((String)((Object)(iterator = ((com.github.catvod.spider.merge.F0.e)((Object)iterator)).i("error", null))))) {
            throw new com.github.catvod.spider.merge.n1.c((String)((Object)iterator));
        }
        if (!((ArrayList)this.g).isEmpty()) return;
        try {
            object = this.d();
            iterator = this.e;
            string2 = this.g();
            object2 = new StringBuilder();
            object2.append((String)((Object)iterator));
            object2.append("/api/v1/videos/");
            object2.append(string2);
            object2.append("/captions");
            iterator = ((com.github.catvod.spider.merge.m1.a)object).b(object2.toString());
            for (String string2 : com.github.catvod.spider.merge.K1.f.a(com.github.catvod.spider.merge.F0.g.d().a(((com.github.catvod.spider.merge.m1.d)((Object)iterator)).c()), "data")) {
                if (!(string2 instanceof com.github.catvod.spider.merge.F0.e)) continue;
                object = (com.github.catvod.spider.merge.F0.e)((Object)string2);
                Object object3 = this.e;
                string2 = com.github.catvod.spider.merge.K1.f.g((com.github.catvod.spider.merge.F0.e)object, "captionPath");
                object2 = new StringBuilder();
                object2.append((String)object3);
                object2.append(string2);
                string2 = object2.toString();
                String string3 = com.github.catvod.spider.merge.K1.f.g((com.github.catvod.spider.merge.F0.e)object, "language.id");
                object2 = com.github.catvod.spider.merge.k1.i.b(string2.substring(string2.lastIndexOf(".") + 1));
                if (object2 == null || p.j(string3)) continue;
                object3 = this.g;
                object = new o();
                ((o)object).c(string2);
                ((o)object).e((com.github.catvod.spider.merge.k1.i)((Object)object2));
                ((o)object).d(string3);
                ((o)object).b(false);
                ((ArrayList)object3).add(((o)object).a());
            }
            return;
        }
        catch (Exception exception) {
            this.j = new i("Could not get subtitles", exception);
        }
    }

    @Override
    public final int p() {
        if (com.github.catvod.spider.merge.K1.f.b(this.f).booleanValue()) {
            return 18;
        }
        return 0;
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        this.a();
        if (((ArrayList)this.h).isEmpty() && ((ArrayList)this.i).isEmpty() && this.H() == m.b) {
            this.f0();
        }
        return this.h;
    }

    @Override
    public final String r() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "category.label");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final com.github.catvod.spider.merge.H1.d t() {
        Object object;
        block5: {
            String string;
            try {
                string = com.github.catvod.spider.merge.K1.f.g(this.f, "description");
                object = string;
                if (string.length() != 250) break block5;
                object = string;
                if (!string.substring(247).equals("...")) break block5;
            }
            catch (i i2) {
                return com.github.catvod.spider.merge.H1.d.c;
            }
            com.github.catvod.spider.merge.m1.a a2 = com.github.catvod.spider.merge.k1.l.a();
            try {
                object = this.e;
                String string2 = this.g();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append("/api/v1/videos/");
                stringBuilder.append(string2);
                stringBuilder.append("/description");
                object = a2.b(stringBuilder.toString());
                object = com.github.catvod.spider.merge.K1.f.g(com.github.catvod.spider.merge.F0.g.d().a(((com.github.catvod.spider.merge.m1.d)object).c()), "description");
            }
            catch (h | k | IOException exception) {
                object = string;
                return com.github.catvod.spider.merge.H1.d.b((String)object, com.github.catvod.spider.merge.H1.c.b);
            }
        }
        return com.github.catvod.spider.merge.H1.d.b((String)object, com.github.catvod.spider.merge.H1.c.b);
    }

    @Override
    public final long u() {
        return this.f.f("dislikes");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<com.github.catvod.spider.merge.H1.e> w() {
        void var6_4;
        ArrayList<com.github.catvod.spider.merge.H1.e> arrayList;
        block5: {
            com.github.catvod.spider.merge.F0.e e2;
            arrayList = new ArrayList<com.github.catvod.spider.merge.H1.e>();
            try {
                e2 = this.d0("storyboards");
                if (e2 == null || !((AbstractMap)e2).containsKey("storyboards")) break block5;
            }
            catch (k k2) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            for (Object object : e2.b("storyboards")) {
                if (!(object instanceof com.github.catvod.spider.merge.F0.e)) continue;
                Object object2 = (com.github.catvod.spider.merge.F0.e)object;
                object = ((com.github.catvod.spider.merge.F0.e)object2).i("storyboardPath", null);
                int n2 = ((com.github.catvod.spider.merge.F0.e)object2).e("spriteWidth", 0);
                int n3 = ((com.github.catvod.spider.merge.F0.e)object2).e("spriteHeight", 0);
                int n4 = ((com.github.catvod.spider.merge.F0.e)object2).e("totalWidth", 0);
                int n5 = ((com.github.catvod.spider.merge.F0.e)object2).e("totalHeight", 0);
                n2 = n4 / n2;
                n3 = n5 / n3;
                ((com.github.catvod.spider.merge.F0.e)object2).e("spriteDuration", 0);
                object2 = com.github.catvod.spider.merge.B.e.c(this.e, object);
                ArrayList arrayList2 = new ArrayList(1);
                for (int i2 = 0; i2 < 1; ++i2) {
                    object = (new Object[]{object2})[i2];
                    Objects.requireNonNull(object);
                    arrayList2.add(object);
                }
                arrayList.add(new com.github.catvod.spider.merge.H1.e(Collections.unmodifiableList(arrayList2)));
            }
        }
        return arrayList;
        throw new e("Could not get frames", (Throwable)var6_4);
    }

    @Override
    public final String x() {
        this.a();
        com.github.catvod.spider.merge.F0.e e2 = this.H() == m.b && !p.l(this.f.g("files")) ? this.f.g("files") : this.f.b("streamingPlaylists").a(0);
        return e2.i("playlistUrl", "");
    }

    @Override
    public final String y() {
        return com.github.catvod.spider.merge.K1.f.g(this.f, "account.host");
    }

    @Override
    public final Locale z() {
        try {
            Locale locale = new Locale(com.github.catvod.spider.merge.K1.f.g(this.f, "language.id"));
            return locale;
        }
        catch (i i2) {
            return null;
        }
    }
}

