/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.U.h;
import com.github.catvod.spider.merge.Y.a;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.e0.g;
import com.github.catvod.spider.merge.x.b;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class e
implements Comparable<e> {
    private Object c;
    private boolean d = false;
    private boolean e = false;

    public e(Object object) {
        this.c = object;
    }

    public final Boolean a() {
        Object object = this.c;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        boolean bl = object != null && !h.b(this.g());
        return bl;
    }

    public final Date b() {
        Object object = this.c;
        boolean bl = object instanceof String;
        CharSequence charSequence = cYh.d("04313225772E08702530233F473620383B744726203D327A5A70");
        if (bl) {
            try {
                object = a.a.c((String)object);
                return object;
            }
            catch (ParseException parseException) {
                charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
                ((StringBuilder)charSequence).append(this.c);
                throw new b(((StringBuilder)charSequence).toString());
            }
        }
        if (object instanceof Date) {
            return (Date)object;
        }
        charSequence = com.github.catvod.spider.merge.d.d.b((String)charSequence);
        ((StringBuilder)charSequence).append(this.c);
        throw new b(((StringBuilder)charSequence).toString());
    }

    public final Double c() {
        Object object;
        block4: {
            double d2;
            block3: {
                block2: {
                    object = this.c;
                    if (!(object instanceof String)) break block2;
                    d2 = new BigDecimal((String)this.c).doubleValue();
                    break block3;
                }
                if (!(object instanceof Number)) break block4;
                d2 = ((Number)object).doubleValue();
            }
            return d2;
        }
        object = com.github.catvod.spider.merge.d.d.b(cYh.d("04313225772E08702F243A380222613736330B7E6127363602707C71"));
        ((StringBuilder)object).append(this.c);
        throw new b(((StringBuilder)object).toString());
    }

    public final g d() {
        return (g)this.c;
    }

    public final List<String> e() {
        return (List)this.c;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && e.class == object.getClass()) {
            Object object2 = (e)object;
            object = this.c;
            object2 = ((e)object2).c;
            boolean bl2 = bl;
            if (object != object2) {
                bl2 = object != null && object.equals(object2) ? bl : false;
            }
            return bl2;
        }
        return false;
    }

    public final Long f() {
        Object object;
        block4: {
            long l2;
            block3: {
                block2: {
                    object = this.c;
                    if (!(object instanceof String)) break block2;
                    l2 = new BigDecimal((String)this.c).setScale(0, 4).longValue();
                    break block3;
                }
                if (!(object instanceof Number)) break block4;
                l2 = ((Number)object).longValue();
            }
            return l2;
        }
        object = com.github.catvod.spider.merge.d.d.b(cYh.d("04313225772E08702F243A380222613736330B7E6127363602707C71"));
        ((StringBuilder)object).append(this.c);
        throw new b(((StringBuilder)object).toString());
    }

    public final String g() {
        Iterator iterator = this.c;
        if (iterator instanceof g) {
            StringBuilder stringBuilder = new StringBuilder();
            iterator = ((AbstractCollection)((g)this.c)).iterator();
            while (iterator.hasNext()) {
                stringBuilder.append(((l)iterator.next()).e0());
            }
            return stringBuilder.toString();
        }
        if (iterator instanceof l) {
            String string;
            boolean bl = (iterator = ((l)((Object)iterator)).n0()) == (string = cYh.d("2D081E05120233")) || iterator != null && iterator.equals(string);
            if (bl) {
                return ((l)this.c).e0();
            }
        }
        if ((iterator = this.c) instanceof List) {
            return h.e((List)((Object)iterator), cYh.d("4B"));
        }
        return String.valueOf(iterator).trim();
    }

    public final e h() {
        this.d = true;
        return this;
    }

    public final int hashCode() {
        Object object = this.c;
        int n2 = object == null ? 0 : object.hashCode();
        return n2;
    }

    public final int i(e comparable) {
        if (this.equals(comparable)) {
            return 0;
        }
        if (comparable != null && ((e)comparable).c != null) {
            Object object = this.c;
            if (object == null) {
                return -1;
            }
            if (object instanceof String) {
                return this.g().compareTo(((e)comparable).g());
            }
            if (object instanceof Number) {
                return this.c().compareTo(((e)comparable).c());
            }
            comparable = com.github.catvod.spider.merge.d.d.b(cYh.d("323E3224272A08223534337A043F2C21362806322D34770231312D24327A5A70"));
            ((StringBuilder)comparable).append(this.toString());
            throw new b(((StringBuilder)comparable).toString());
        }
        return 1;
    }

    public final e j() {
        this.e = true;
        String string = String.valueOf(this.c);
        String string2 = cYh.d("40");
        string = h.g(string, string2);
        String string3 = cYh.d("45");
        this.c = h.f(h.f(h.g(string, string3), string2), string3);
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
        return this.c instanceof g;
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
        Object object = this.c;
        if (object == null) {
            return Object.class;
        }
        return object.getClass();
    }

    public final String toString() {
        com.github.catvod.spider.merge.V.a a2 = new com.github.catvod.spider.merge.V.a(this);
        a2.a(this.c);
        boolean bl = this.d;
        a2.b(cYh.d("0E2300252328"), bl);
        bl = this.e;
        a2.b(cYh.d("0E2304292728342433"), bl);
        return a2.toString();
    }
}

