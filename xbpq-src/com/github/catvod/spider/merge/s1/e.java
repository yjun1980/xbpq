/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.s1;

import com.github.catvod.spider.merge.F0.f;
import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.H1.l;
import com.github.catvod.spider.merge.g1.L;
import com.github.catvod.spider.merge.k1.i;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.n1.k;
import com.github.catvod.spider.merge.s1.b;
import com.github.catvod.spider.merge.s1.c;
import com.github.catvod.spider.merge.s1.d;
import com.github.catvod.spider.merge.s1.j;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class e
extends j {
    private com.github.catvod.spider.merge.F0.e h;

    public e(p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    @Override
    public final long A() {
        return this.h.f("audio_duration");
    }

    @Override
    public final String B() {
        return "";
    }

    @Override
    public final List<l> G() {
        Serializable serializable = this.h.b("tracks");
        ArrayList<l> arrayList = new ArrayList<l>(((AbstractCollection)((Object)serializable)).size());
        for (com.github.catvod.spider.merge.F0.e e2 : serializable) {
            e2.i("title", null);
            e2.e("timecode", 0);
            serializable = new l();
            e2.f("track_art_id");
            int n2 = b.b;
            e2.i("artist", null);
            arrayList.add((l)serializable);
        }
        return arrayList;
    }

    @Override
    public final List<String> N() {
        return Collections.emptyList();
    }

    @Override
    public final String O() {
        return this.h.i("published_date", null);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        return b.b(this.h.f("show_image_id"), false);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> T() {
        return Collections.singletonList(new com.github.catvod.spider.merge.k1.c("https://bandcamp.com/img/buttons/bandcamp-button-circle-whitecolor-512.png", 512, 512, 2));
    }

    @Override
    public final String U() {
        com.github.catvod.spider.merge.e1.h h2 = com.github.catvod.spider.merge.c1.d.l(this.h.i("image_caption", null));
        Objects.requireNonNull(h2);
        com.github.catvod.spider.merge.c1.d.h("a");
        return (String)com.github.catvod.spider.merge.g1.c.a(new L(com.github.catvod.spider.merge.K1.d.i("a")), h2).stream().map(c.a).findFirst().orElseThrow(d.a);
    }

    @Override
    public final String W() {
        throw new com.github.catvod.spider.merge.n1.d();
    }

    @Override
    public final com.github.catvod.spider.merge.q1.c b0() {
        return null;
    }

    @Override
    public final String i() {
        return this.h.i("subtitle", null);
    }

    @Override
    public final String n() {
        return this.h().d();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void o(a object) {
        void var1_5;
        int n2 = Integer.parseInt(this.g());
        try {
            f<com.github.catvod.spider.merge.F0.e> f2 = g.d();
            a a2 = com.github.catvod.spider.merge.k1.l.a();
            object = new StringBuilder();
            ((StringBuilder)object).append("https://bandcamp.com/api/bcweekly/1/get?id=");
            ((StringBuilder)object).append(n2);
            this.h = object = f2.a(a2.b(((StringBuilder)object).toString()).c());
            return;
        }
        catch (h h2) {
        }
        catch (k k2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        throw new com.github.catvod.spider.merge.n1.i("could not get show data", (Throwable)var1_5);
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        com.github.catvod.spider.merge.H1.a a2;
        ArrayList<com.github.catvod.spider.merge.H1.b> arrayList = new ArrayList<com.github.catvod.spider.merge.H1.b>();
        com.github.catvod.spider.merge.F0.e e2 = this.h.g("audio_stream");
        if (((AbstractMap)e2).containsKey("mp3-128")) {
            a2 = new com.github.catvod.spider.merge.H1.a();
            a2.u("mp3-128");
            a2.s(e2.i("mp3-128", null), true);
            a2.x(i.i);
            a2.r(128);
            arrayList.add(a2.m());
        }
        if (((AbstractMap)e2).containsKey("opus-lo")) {
            a2 = new com.github.catvod.spider.merge.H1.a();
            a2.u("opus-lo");
            a2.s(e2.i("opus-lo", null), true);
            a2.x(i.j);
            a2.r(100);
            arrayList.add(a2.m());
        }
        return arrayList;
    }

    @Override
    public final String r() {
        return "";
    }

    @Override
    public final com.github.catvod.spider.merge.H1.d t() {
        return com.github.catvod.spider.merge.H1.d.b(this.h.i("desc", null), com.github.catvod.spider.merge.H1.c.c);
    }
}

