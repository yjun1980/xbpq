/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.H1.d;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.n1.i;
import java.net.MalformedURLException;
import java.util.List;

public final class b
implements com.github.catvod.spider.merge.q1.b {
    private final e a;

    public b(e e2) {
        this.a = e2;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String c() {
        return A.o(this.a.g("longBylineText"), false);
    }

    @Override
    public final long d() {
        String string = A.o(this.a.g("videoCountShortText"), false);
        if (string != null) {
            int n2;
            try {
                n2 = Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                return -2L;
            }
            return n2;
        }
        throw new i("Could not extract item count for playlist/mix info item");
    }

    @Override
    public final String g() {
        String string = this.a.i("shareUrl", null);
        if (!p.j(string)) {
            return string;
        }
        throw new i("Could not get url");
    }

    @Override
    public final d getDescription() {
        return d.c;
    }

    @Override
    public final String getName() {
        String string = A.o(this.a.g("title"), false);
        if (!p.j(string)) {
            return string;
        }
        throw new i("Could not get name");
    }

    @Override
    public final int n() {
        String string = this.g();
        int n2 = A.j;
        try {
            n2 = A.e(p.f(p.q(string), "list"));
            return n2;
        }
        catch (MalformedURLException malformedURLException) {
            throw new i("Could not extract playlist type from malformed url", malformedURLException);
        }
    }

    @Override
    public final List<c> s() {
        return A.q(this.a);
    }
}

