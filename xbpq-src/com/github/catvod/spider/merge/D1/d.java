/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.n1.i;
import java.io.Serializable;
import java.util.Locale;

public final class d
implements Serializable {
    private static final d[] v;
    private final com.github.catvod.spider.merge.k1.i a;
    public final int b;
    public final int c;
    @Deprecated
    public int d;
    private int e;
    @Deprecated
    public String f;
    @Deprecated
    public int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private String o;
    private String p;
    private String q;
    private String r;
    private int s;
    private Locale t;
    private String u;

    static {
        Object object = com.github.catvod.spider.merge.k1.i.e;
        d d2 = new d(17, 2, (com.github.catvod.spider.merge.k1.i)((Object)object), "144p");
        d d3 = new d(36, 2, (com.github.catvod.spider.merge.k1.i)((Object)object), "240p");
        com.github.catvod.spider.merge.k1.i i2 = com.github.catvod.spider.merge.k1.i.d;
        d d4 = new d(18, 2, i2, "360p");
        d d5 = new d(34, 2, i2, "360p");
        d d6 = new d(35, 2, i2, "480p");
        d d7 = new d(59, 2, i2, "480p");
        d d8 = new d(78, 2, i2, "480p");
        object = new d(22, 2, i2, "720p");
        d d9 = new d(37, 2, i2, "1080p");
        d d10 = new d(38, 2, i2, "1080p");
        com.github.catvod.spider.merge.k1.i i4 = com.github.catvod.spider.merge.k1.i.f;
        d d11 = new d(43, 2, i4, "360p");
        d d12 = new d(44, 2, i4, "480p");
        d d13 = new d(45, 2, i4, "720p");
        d d14 = new d(46, 2, i4, "1080p");
        Object object2 = com.github.catvod.spider.merge.k1.i.h;
        d d15 = new d(171, (com.github.catvod.spider.merge.k1.i)((Object)object2), 128);
        d d16 = new d(172, (com.github.catvod.spider.merge.k1.i)((Object)object2), 256);
        com.github.catvod.spider.merge.k1.i i5 = com.github.catvod.spider.merge.k1.i.g;
        d d17 = new d(599, i5, 32);
        d d18 = new d(139, i5, 48);
        object2 = new d(140, i5, 128);
        d d19 = new d(141, i5, 256);
        i5 = com.github.catvod.spider.merge.k1.i.l;
        v = new d[]{d2, d3, d4, d5, d6, d7, d8, object, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, object2, d19, new d(600, i5, 35), new d(249, i5, 50), new d(250, i5, 70), new d(251, i5, 160), new d(160, 3, i2, "144p"), new d(394, 3, i2, "144p"), new d(133, 3, i2, "240p"), new d(395, 3, i2, "240p"), new d(134, 3, i2, "360p"), new d(396, 3, i2, "360p"), new d(135, 3, i2, "480p"), new d(212, 3, i2, "480p"), new d(397, 3, i2, "480p"), new d(136, 3, i2, "720p"), new d(398, 3, i2, "720p"), new d(298, i2, "720p60"), new d(137, 3, i2, "1080p"), new d(399, 3, i2, "1080p"), new d(299, i2, "1080p60"), new d(400, 3, i2, "1440p"), new d(266, 3, i2, "2160p"), new d(401, 3, i2, "2160p"), new d(278, 3, i4, "144p"), new d(242, 3, i4, "240p"), new d(243, 3, i4, "360p"), new d(244, 3, i4, "480p"), new d(245, 3, i4, "480p"), new d(246, 3, i4, "480p"), new d(247, 3, i4, "720p"), new d(248, 3, i4, "1080p"), new d(271, 3, i4, "1440p"), new d(272, 3, i4, "2160p"), new d(302, i4, "720p60"), new d(303, i4, "1080p60"), new d(308, i4, "1440p60"), new d(313, 3, i4, "2160p"), new d(315, i4, "2160p60")};
    }

    public d(int n2, int n3, com.github.catvod.spider.merge.k1.i i2, String string) {
        this.d = -1;
        this.e = -1;
        this.b = n2;
        this.c = n3;
        this.a = i2;
        this.f = string;
        this.g = 30;
    }

    public d(int n2, com.github.catvod.spider.merge.k1.i i2, int n3) {
        this.e = -1;
        this.g = -1;
        this.b = n2;
        this.c = 1;
        this.a = i2;
        this.d = n3;
    }

    public d(int n2, com.github.catvod.spider.merge.k1.i i2, String string) {
        this.d = -1;
        this.e = -1;
        this.b = n2;
        this.c = 3;
        this.a = i2;
        this.f = string;
        this.g = 60;
    }

    public d(d d2) {
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.a = d2.a;
        this.b = d2.b;
        this.c = d2.c;
        this.d = d2.d;
        this.e = d2.e;
        this.f = d2.f;
        this.g = d2.g;
        this.h = d2.h;
        this.i = d2.i;
        this.j = d2.j;
        this.k = d2.k;
        this.l = d2.l;
        this.m = d2.m;
        this.n = d2.n;
        this.o = d2.o;
        this.p = d2.p;
        this.q = d2.q;
        this.r = d2.r;
        this.s = d2.s;
        this.t = d2.t;
        this.u = d2.u;
    }

    public static d l(int n2) {
        Object object = v;
        for (int i2 = 0; i2 < 57; ++i2) {
            d d2 = object[i2];
            if (n2 != d2.b) continue;
            return new d(d2);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("itag ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" is not supported");
        throw new i(((StringBuilder)object).toString());
    }

    public final void A(int n2) {
        this.k = n2;
    }

    public final void B(String string) {
        this.o = string;
    }

    public final void C(int n2) {
        if (n2 <= 0) {
            n2 = -1;
        }
        this.e = n2;
    }

    public final void D(int n2) {
        this.i = n2;
    }

    public final void E(String string) {
        this.u = string;
    }

    public final Locale a() {
        return this.t;
    }

    public final String b() {
        return this.q;
    }

    public final String c() {
        return this.r;
    }

    public final int d() {
        return this.s;
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.p;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.n;
    }

    public final int i() {
        return this.m;
    }

    public final int j() {
        return this.l;
    }

    public final int k() {
        return this.k;
    }

    public final com.github.catvod.spider.merge.k1.i m() {
        return this.a;
    }

    public final int n() {
        return this.e;
    }

    public final int o() {
        return this.i;
    }

    public final String p() {
        return this.u;
    }

    public final void q(Locale locale) {
        this.t = locale;
    }

    public final void r(String string) {
        this.q = string;
    }

    public final void s(String string) {
        this.r = string;
    }

    public final void t(int n2) {
        this.s = n2;
    }

    public final void u(int n2) {
        this.h = n2;
    }

    public final void v(String string) {
        this.p = string;
    }

    public final void w(int n2) {
        this.j = n2;
    }

    public final void x(int n2) {
        this.n = n2;
    }

    public final void y(int n2) {
        this.m = n2;
    }

    public final void z(int n2) {
        this.l = n2;
    }
}

