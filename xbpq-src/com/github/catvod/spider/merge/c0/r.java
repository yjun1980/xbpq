/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.W.a;
import com.github.catvod.spider.merge.b0.b;
import com.github.catvod.spider.merge.c0.c;
import com.github.catvod.spider.merge.c0.g;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.q;
import com.github.catvod.spider.merge.c0.s;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public abstract class r
implements Cloneable {
    static final List<r> e = Collections.emptyList();
    r c;
    int d;

    protected r() {
    }

    private void B(int n2) {
        List<r> list = this.n();
        while (n2 < list.size()) {
            list.get((int)n2).d = n2;
            ++n2;
        }
    }

    public final r A() {
        return this.c;
    }

    public final void C() {
        com.github.catvod.spider.merge.N.a.k(this.c);
        this.c.D(this);
    }

    protected void D(r r2) {
        boolean bl = r2.c == this;
        com.github.catvod.spider.merge.N.a.f(bl);
        int n2 = r2.d;
        this.n().remove(n2);
        this.B(n2);
        r2.c = null;
    }

    public final void E(r r2) {
        com.github.catvod.spider.merge.N.a.k(this.c);
        r r3 = this.c;
        r3.getClass();
        boolean bl = this.c == r3;
        com.github.catvod.spider.merge.N.a.f(bl);
        r r4 = r2.c;
        if (r4 != null) {
            r4.D(r2);
        }
        int n2 = this.d;
        r3.n().set(n2, r2);
        r2.c = r3;
        r2.d = n2;
        this.c = null;
    }

    public r F() {
        r r2;
        r r3 = this;
        while ((r2 = r3.c) != null) {
            r3 = r2;
        }
        return r3;
    }

    public final void G(String string) {
        this.l(string);
    }

    public final int H() {
        return this.d;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(String string) {
        com.github.catvod.spider.merge.N.a.i(string);
        boolean bl = this.p();
        String string2 = "";
        Object object = string2;
        if (!bl) return object;
        if (!this.d().m(string)) {
            return string2;
        }
        object = this.e();
        string = this.d().k(string);
        int n2 = b.d;
        URL uRL = new URL((String)object);
        return b.h(uRL, string).toExternalForm();
        {
            catch (MalformedURLException malformedURLException) {
                return string2;
            }
        }
        catch (MalformedURLException malformedURLException) {
            object = new URL(string);
            return ((URL)object).toExternalForm();
        }
    }

    public r b(String string, String string2) {
        s.a(this).getClass();
        string = D.c.a(string);
        this.d().u(string, string2);
        return this;
    }

    public String c(String string) {
        com.github.catvod.spider.merge.N.a.k(string);
        if (!this.p()) {
            return "";
        }
        String string2 = this.d().k(string);
        if (string2.length() > 0) {
            return string2;
        }
        if (string.startsWith(cYh.d("0632326B"))) {
            return this.a(string.substring(4));
        }
        return "";
    }

    public abstract c d();

    public abstract String e();

    public final boolean equals(Object object) {
        boolean bl = this == object;
        return bl;
    }

    public final r f(r object) {
        int n2;
        r r2;
        block10: {
            Object object2;
            r r3;
            r[] rArray;
            int n3;
            block11: {
                int n4;
                com.github.catvod.spider.merge.N.a.k(this.c);
                r2 = this.c;
                n2 = this.d;
                n3 = 1;
                rArray = new r[1];
                int n5 = 0;
                rArray[0] = object;
                r2.getClass();
                object = r2.n();
                r3 = rArray[0].z();
                if (r3 != null && r3.h() == 1) {
                    block9: {
                        object2 = r3.n();
                        n4 = 1;
                        while (true) {
                            int n6 = n4 - 1;
                            if (n4 <= 0) break;
                            if (rArray[n6] != object2.get(n6)) {
                                n4 = 0;
                                break block9;
                            }
                            n4 = n6;
                        }
                        n4 = 1;
                    }
                    if (n4 != 0) {
                        r3.m();
                        object.addAll(n2, Arrays.asList(rArray));
                        n4 = n3;
                        while (true) {
                            n3 = n4 - 1;
                            if (n4 > 0) {
                                rArray[n3].c = r2;
                                n4 = n3;
                                continue;
                            }
                            break block10;
                            break;
                        }
                    }
                }
                n4 = 0;
                while (true) {
                    if (n4 >= true) break block11;
                    if (rArray[n4] == null) break;
                    ++n4;
                }
                throw new IllegalArgumentException(cYh.d("262233302E7A0A25322577340824613238341331283F773B0929613F22360B702E333D3F042432"));
            }
            for (n3 = n5; n3 < 1; ++n3) {
                r3 = rArray[n3];
                r3.getClass();
                object2 = r3.c;
                if (object2 != null) {
                    ((r)object2).D(r3);
                }
                r3.c = r2;
            }
            object.addAll(n2, Arrays.asList(rArray));
        }
        r2.B(n2);
        return this;
    }

    public final r g(int n2) {
        return this.n().get(n2);
    }

    public abstract int h();

    public final List<r> i() {
        if (this.h() == 0) {
            return e;
        }
        List<r> list = this.n();
        ArrayList<r> arrayList = new ArrayList<r>(list.size());
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }

    public r j() {
        r r2 = this.k(null);
        LinkedList<r> linkedList = new LinkedList<r>();
        linkedList.add(r2);
        while (!linkedList.isEmpty()) {
            r r3 = (r)linkedList.remove();
            int n2 = r3.h();
            for (int i2 = 0; i2 < n2; ++i2) {
                List<r> list = r3.n();
                r r4 = list.get(i2).k(r3);
                list.set(i2, r4);
                linkedList.add(r4);
            }
        }
        return r2;
    }

    protected r k(r r2) {
        try {
            r r3 = (r)super.clone();
            r3.c = r2;
            int n2 = r2 == null ? 0 : this.d;
            r3.d = n2;
            return r3;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    protected abstract void l(String var1);

    public abstract r m();

    protected abstract List<r> n();

    public final boolean o(String string) {
        com.github.catvod.spider.merge.N.a.k(string);
        if (!this.p()) {
            return false;
        }
        if (string.startsWith(cYh.d("0632326B"))) {
            String string2 = string.substring(4);
            if (this.d().m(string2) && !this.a(string2).isEmpty()) {
                return true;
            }
        }
        return this.d().m(string);
    }

    protected abstract boolean p();

    public final boolean q() {
        boolean bl = this.c != null;
        return bl;
    }

    protected final void r(Appendable appendable, int n2, g g2) {
        appendable.append('\n').append(b.f(g2.d() * n2));
    }

    public final r s() {
        Object object = this.c;
        if (object == null) {
            return null;
        }
        object = ((r)object).n();
        int n2 = this.d + 1;
        if (object.size() > n2) {
            return (r)object.get(n2);
        }
        return null;
    }

    public abstract String t();

    public String toString() {
        return this.u();
    }

    public String u() {
        StringBuilder stringBuilder = b.a();
        this.v(stringBuilder);
        return b.g(stringBuilder);
    }

    protected final void v(Appendable appendable) {
        h h2 = this.y();
        if (h2 == null) {
            h2 = new h();
        }
        a.c(new q(appendable, h2.s0()), this);
    }

    abstract void w(Appendable var1, int var2, g var3);

    abstract void x(Appendable var1, int var2, g var3);

    public final h y() {
        r r2 = this.F();
        r2 = r2 instanceof h ? (h)r2 : null;
        return r2;
    }

    public r z() {
        return this.c;
    }
}

