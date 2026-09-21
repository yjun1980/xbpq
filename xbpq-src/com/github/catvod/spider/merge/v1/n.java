/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.c;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.H1.q;
import com.github.catvod.spider.merge.H1.r;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.k1.i;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.n1.e;
import com.github.catvod.spider.merge.p1.b;
import com.github.catvod.spider.merge.v1.l;
import com.github.catvod.spider.merge.v1.m;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class n
extends g {
    private com.github.catvod.spider.merge.F0.e e;
    private com.github.catvod.spider.merge.F0.e f;

    public n(p p2, com.github.catvod.spider.merge.o1.a a2) {
        super(p2, a2);
    }

    @Override
    public final long A() {
        return this.e.e("length", 0);
    }

    @Override
    public final com.github.catvod.spider.merge.H1.m H() {
        return com.github.catvod.spider.merge.H1.m.b;
    }

    @Override
    public final List<String> N() {
        return com.github.catvod.spider.merge.K1.f.h(this.e.b("tags"));
    }

    @Override
    public final String O() {
        return this.e.i("release_date", null);
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> P() {
        return l.d(this.e);
    }

    @Override
    public final b S() {
        return b.b(this.e.i("release_date", null));
    }

    @Override
    public final List<com.github.catvod.spider.merge.k1.c> T() {
        List<Object> list = this.f.i("logo_url", null);
        int n2 = l.c;
        if (com.github.catvod.spider.merge.K1.p.j((String)((Object)list))) {
            list = Collections.emptyList();
        } else {
            com.github.catvod.spider.merge.k1.c c2 = new com.github.catvod.spider.merge.k1.c((String)((Object)list), -1, -1, 4);
            list = new ArrayList(1);
            for (n2 = 0; n2 < 1; ++n2) {
                Object object = (new Object[]{c2})[n2];
                Objects.requireNonNull(object);
                ((ArrayList)list).add(object);
            }
            list = Collections.unmodifiableList(list);
        }
        return list;
    }

    @Override
    public final String U() {
        return this.e.i("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", "");
    }

    @Override
    public final String W() {
        return com.github.catvod.spider.merge.B.e.c("https://media.ccc.de/c/", this.e.i("conference_url", null).replaceFirst("https://(api\\.)?media\\.ccc\\.de/public/conferences/", ""));
    }

    @Override
    public final List<r> X() {
        return Collections.emptyList();
    }

    @Override
    public final List<r> Y() {
        c c2 = this.e.b("recordings");
        ArrayList<r> arrayList = new ArrayList<r>();
        for (int i2 = 0; i2 < ((AbstractCollection)c2).size(); ++i2) {
            com.github.catvod.spider.merge.F0.e e2 = c2.a(i2);
            Object object = e2.i("mime_type", null);
            if (!object.startsWith("video")) continue;
            object = object.endsWith("webm") ? i.f : (object.endsWith("mp4") ? i.d : null);
            q q2 = new q();
            q2.d(e2.i("filename", " "));
            q2.b(e2.i("recording_url", null), true);
            q2.e(false);
            q2.h((i)((Object)object));
            int n2 = e2.e("height", 0);
            object = new StringBuilder();
            ((StringBuilder)object).append(n2);
            ((StringBuilder)object).append("p");
            q2.i(((StringBuilder)object).toString());
            arrayList.add(q2.a());
        }
        return arrayList;
    }

    @Override
    public final long Z() {
        return this.e.e("view_count", 0);
    }

    @Override
    public final String i() {
        return this.e.i("title", null);
    }

    @Override
    public final String j() {
        return this.e.i("frontend_link", null);
    }

    @Override
    public final void o(a a2) {
        String string = this.g();
        CharSequence charSequence = new StringBuilder();
        charSequence.append("https://api.media.ccc.de/public/events/");
        charSequence.append(string);
        charSequence = charSequence.toString();
        try {
            this.e = com.github.catvod.spider.merge.F0.g.d().a(a2.b((String)charSequence).c());
            this.f = com.github.catvod.spider.merge.F0.g.d().a(a2.b(this.e.i("conference_url", null)).c());
            return;
        }
        catch (h h2) {
            throw new e(com.github.catvod.spider.merge.B.e.c("Could not parse json returned by URL: ", (String)charSequence), h2);
        }
    }

    @Override
    public final List<com.github.catvod.spider.merge.H1.b> q() {
        c c2 = this.e.b("recordings");
        ArrayList<com.github.catvod.spider.merge.H1.b> arrayList = new ArrayList<com.github.catvod.spider.merge.H1.b>();
        for (int i2 = 0; i2 < ((AbstractCollection)c2).size(); ++i2) {
            com.github.catvod.spider.merge.F0.e e2 = c2.a(i2);
            Object object = e2.i("mime_type", null);
            if (!object.startsWith("audio")) continue;
            object = object.endsWith("opus") ? i.j : (object.endsWith("mpeg") ? i.i : (object.endsWith("ogg") ? i.k : null));
            com.github.catvod.spider.merge.H1.a a2 = new com.github.catvod.spider.merge.H1.a();
            a2.u(e2.i("filename", " "));
            a2.s(e2.i("recording_url", null), true);
            a2.x((i)((Object)object));
            a2.r(-1);
            object = e2.i("language", null);
            if (object != null && !object.contains("-")) {
                a2.n((Locale)com.github.catvod.spider.merge.K1.g.a(object).orElseThrow(new m((String)object)));
            }
            arrayList.add(a2.m());
        }
        return arrayList;
    }

    @Override
    public final d t() {
        return d.b(this.e.i("description", null), com.github.catvod.spider.merge.H1.c.c);
    }

    @Override
    public final Locale z() {
        String string = this.e.i("original_language", null);
        String[] stringArray = Locale.getISOLanguages();
        HashMap<String, Locale> hashMap = new HashMap<String, Locale>(stringArray.length);
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Locale locale = new Locale(stringArray[i2]);
            hashMap.put(locale.getISO3Language(), locale);
        }
        if (hashMap.containsKey(string)) {
            return (Locale)hashMap.get(string);
        }
        throw new com.github.catvod.spider.merge.n1.i(com.github.catvod.spider.merge.B.e.c("Could not get Locale from this three letter language code", string));
    }
}

