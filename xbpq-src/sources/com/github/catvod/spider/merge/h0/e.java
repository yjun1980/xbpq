package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.Y.C0035a;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.C0059d;
import com.github.catvod.spider.merge.e0.C0123g;
import com.github.catvod.spider.merge.x.C0244b;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements Comparable<e> {
    private Object c;
    private boolean d = false;
    private boolean e = false;

    public e(Object obj) {
        this.c = obj;
    }

    public final Boolean a() {
        Object obj = this.c;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || h.b(g())) ? false : true);
    }

    public final Date b() {
        Object obj = this.c;
        boolean z = obj instanceof String;
        String d = cYh.d("04313225772E08702530233F473620383B744726203D327A5A70");
        if (z) {
            try {
                return C0035a.a.c((String) obj);
            } catch (ParseException unused) {
                StringBuilder b = C0059d.b(d);
                b.append(this.c);
                throw new C0244b(b.toString());
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        StringBuilder b2 = C0059d.b(d);
        b2.append(this.c);
        throw new C0244b(b2.toString());
    }

    public final Double c() {
        double doubleValue;
        Object obj = this.c;
        if (obj instanceof String) {
            doubleValue = new BigDecimal((String) this.c).doubleValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder b = C0059d.b(cYh.d("04313225772E08702F243A380222613736330B7E6127363602707C71"));
                b.append(this.c);
                throw new C0244b(b.toString());
            }
            doubleValue = ((Number) obj).doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    public final C0123g d() {
        return (C0123g) this.c;
    }

    public final List<String> e() {
        return (List) this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.c;
        Object obj3 = ((e) obj).c;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public final Long f() {
        long longValue;
        Object obj = this.c;
        if (obj instanceof String) {
            longValue = new BigDecimal((String) this.c).setScale(0, 4).longValue();
        } else {
            if (!(obj instanceof Number)) {
                StringBuilder b = C0059d.b(cYh.d("04313225772E08702F243A380222613736330B7E6127363602707C71"));
                b.append(this.c);
                throw new C0244b(b.toString());
            }
            longValue = ((Number) obj).longValue();
        }
        return Long.valueOf(longValue);
    }

    public final String g() {
        Object obj = this.c;
        if (obj instanceof C0123g) {
            StringBuilder sb = new StringBuilder();
            Iterator<l> it = ((C0123g) this.c).iterator();
            while (it.hasNext()) {
                sb.append(it.next().e0());
            }
            return sb.toString();
        }
        if (obj instanceof l) {
            String n0 = ((l) obj).n0();
            String d = cYh.d("2D081E05120233");
            if (n0 == d || (n0 != null && n0.equals(d))) {
                return ((l) this.c).e0();
            }
        }
        Object obj2 = this.c;
        return obj2 instanceof List ? h.e((List) obj2, cYh.d("4B")) : String.valueOf(obj2).trim();
    }

    public final e h() {
        this.d = true;
        return this;
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        if (equals(eVar)) {
            return 0;
        }
        if (eVar == null || eVar.c == null) {
            return 1;
        }
        Object obj = this.c;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return g().compareTo(eVar.g());
        }
        if (obj instanceof Number) {
            return c().compareTo(eVar.c());
        }
        StringBuilder b = C0059d.b(cYh.d("323E3224272A08223534337A043F2C21362806322D34770231312D24327A5A70"));
        b.append(toString());
        throw new C0244b(b.toString());
    }

    public final e j() {
        this.e = true;
        String valueOf = String.valueOf(this.c);
        String d = cYh.d("40");
        String g = h.g(valueOf, d);
        String d2 = cYh.d("45");
        this.c = h.f(h.f(h.g(g, d2), d), d2);
        return this;
    }

    public final boolean k() {
        return this.d;
    }

    public final boolean l() {
        return this.c instanceof Boolean;
    }

    public final boolean m() {
        return this.c instanceof Date;
    }

    public final boolean n() {
        return this.c instanceof C0123g;
    }

    public final boolean o() {
        return this.e;
    }

    public final boolean p() {
        return this.c instanceof List;
    }

    public final boolean q() {
        return this.c instanceof Number;
    }

    public final boolean r() {
        return this.c instanceof String;
    }

    public final Class s() {
        Object obj = this.c;
        return obj == null ? Object.class : obj.getClass();
    }

    public final String toString() {
        com.github.catvod.spider.merge.V.a aVar = new com.github.catvod.spider.merge.V.a(this);
        aVar.a(this.c);
        aVar.b(cYh.d("0E2300252328"), this.d);
        aVar.b(cYh.d("0E2304292728342433"), this.e);
        return aVar.toString();
    }
}
