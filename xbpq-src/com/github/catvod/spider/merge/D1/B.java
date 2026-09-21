/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.E1.D;
import com.github.catvod.spider.merge.F1.b;
import com.github.catvod.spider.merge.H1.g;
import com.github.catvod.spider.merge.k1.n;
import com.github.catvod.spider.merge.k1.p;
import com.github.catvod.spider.merge.o1.a;
import com.github.catvod.spider.merge.o1.c;
import com.github.catvod.spider.merge.p1.e;
import java.util.EnumSet;
import java.util.List;

public final class B
extends p {
    private static final List<e> c = e.d("en-GB");
    private static final List<com.github.catvod.spider.merge.p1.a> d = com.github.catvod.spider.merge.p1.a.b("DZ", "AR", "AU", "AT", "AZ", "BH", "BD", "BY", "BE", "BO", "BA", "BR", "BG", "KH", "CA", "CL", "CO", "CR", "HR", "CY", "CZ", "DK", "DO", "EC", "EG", "SV", "EE", "FI", "FR", "GE", "DE", "GH", "GR", "GT", "HN", "HK", "HU", "IS", "IN", "ID", "IQ", "IE", "IL", "IT", "JM", "JP", "JO", "KZ", "KE", "KW", "LA", "LV", "LB", "LY", "LI", "LT", "LU", "MY", "MT", "MX", "ME", "MA", "NP", "NL", "NZ", "NI", "NG", "MK", "NO", "OM", "PK", "PA", "PG", "PY", "PE", "PH", "PL", "PT", "PR", "QA", "RO", "RU", "SA", "SN", "RS", "SG", "SK", "SI", "ZA", "KR", "ES", "LK", "SE", "CH", "TW", "TZ", "TH", "TN", "TR", "UG", "UA", "AE", "GB", "US", "UY", "VE", "VN", "YE", "ZW");

    public B() {
        super(0, "YouTube", EnumSet.of(n.a, n.b, n.c, n.d));
    }

    @Override
    public final c a() {
        return com.github.catvod.spider.merge.F1.a.m();
    }

    @Override
    public final c c() {
        return b.m();
    }

    @Override
    public final g e(a a2) {
        return new D(this, a2);
    }

    @Override
    public final com.github.catvod.spider.merge.b.a f() {
        return com.github.catvod.spider.merge.F1.c.l();
    }

    @Override
    public final List<com.github.catvod.spider.merge.p1.a> g() {
        return d;
    }

    @Override
    public final List<e> h() {
        return c;
    }
}

