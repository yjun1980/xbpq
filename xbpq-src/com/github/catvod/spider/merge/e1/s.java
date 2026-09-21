/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.J.j;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.c1.e;
import com.github.catvod.spider.merge.e1.c;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.e1.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class s
implements Cloneable {
    static final List<s> c = Collections.emptyList();
    s a;
    int b;

    protected s() {
    }

    private void A(int n2) {
        int n3 = this.g();
        if (n3 == 0) {
            return;
        }
        List<s> list = this.m();
        while (n2 < n3) {
            list.get((int)n2).b = n2;
            ++n2;
        }
    }

    public final void B() {
        d.j(this.a);
        this.a.C(this);
    }

    protected void C(s s2) {
        boolean bl = s2.a == this;
        d.f(bl);
        int n2 = s2.b;
        this.m().remove(n2);
        this.A(n2);
        s2.a = null;
    }

    public final void D(s s2) {
        d.j(this.a);
        s s3 = this.a;
        Objects.requireNonNull(s3);
        boolean bl = this.a == s3;
        d.f(bl);
        s s4 = s2.a;
        if (s4 != null) {
            s4.C(s2);
        }
        int n2 = this.b;
        s3.m().set(n2, s2);
        s2.a = s3;
        s2.b = n2;
        this.a = null;
    }

    public s E() {
        s s2;
        s s3 = this;
        while ((s2 = s3.a) != null) {
            s3 = s2;
        }
        return s3;
    }

    public final void F(String string) {
        this.k(string);
    }

    public final int G() {
        return this.b;
    }

    public String a(String string) {
        d.h(string);
        if (this.o() && this.d().r(string)) {
            return com.github.catvod.spider.merge.d1.c.j(this.e(), this.d().p(string));
        }
        return "";
    }

    protected final void b(int n2, s ... sArray) {
        int n3;
        int n4;
        Object object;
        d.j(sArray);
        if (sArray.length == 0) {
            return;
        }
        List<s> list = this.m();
        int n5 = 0;
        s s2 = sArray[0].y();
        if (s2 != null && s2.g() == sArray.length) {
            block11: {
                object = s2.m();
                n4 = sArray.length;
                while (true) {
                    int n6 = n4 - 1;
                    n3 = 1;
                    if (n4 <= 0) break;
                    if (sArray[n6] != object.get(n6)) {
                        n4 = 0;
                        break block11;
                    }
                    n4 = n6;
                }
                n4 = 1;
            }
            if (n4 != 0) {
                n4 = this.g() == 0 ? n3 : 0;
                s2.l();
                list.addAll(n2, Arrays.asList(sArray));
                n5 = sArray.length;
                while (true) {
                    n3 = n5 - 1;
                    if (n5 <= 0) break;
                    sArray[n3].a = this;
                    n5 = n3;
                }
                if (n4 == 0 || sArray[0].b != 0) {
                    this.A(n2);
                }
                return;
            }
        }
        n3 = sArray.length;
        for (n4 = 0; n4 < n3; ++n4) {
            if (sArray[n4] != null) {
                continue;
            }
            throw new e("Array must not contain any null objects");
        }
        n3 = sArray.length;
        for (n4 = n5; n4 < n3; ++n4) {
            s2 = sArray[n4];
            Objects.requireNonNull(s2);
            object = s2.a;
            if (object != null) {
                ((s)object).C(s2);
            }
            s2.a = this;
        }
        list.addAll(n2, Arrays.asList(sArray));
        this.A(n2);
    }

    public String c(String string) {
        d.j(string);
        if (!this.o()) {
            return "";
        }
        String string2 = this.d().p(string);
        if (string2.length() > 0) {
            return string2;
        }
        if (string.startsWith("abs:")) {
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

    public final s f(int n2) {
        return this.m().get(n2);
    }

    public abstract int g();

    public final List<s> h() {
        if (this.g() == 0) {
            return c;
        }
        List<s> list = this.m();
        ArrayList<s> arrayList = new ArrayList<s>(list.size());
        arrayList.addAll(list);
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public s i() {
        s s2 = this.j(null);
        LinkedList<s> linkedList = new LinkedList<s>();
        linkedList.add(s2);
        while (!linkedList.isEmpty()) {
            s s3 = (s)linkedList.remove();
            int n2 = s3.g();
            for (int i2 = 0; i2 < n2; ++i2) {
                List<s> list = s3.m();
                s s4 = list.get(i2).j(s3);
                list.set(i2, s4);
                linkedList.add(s4);
            }
        }
        return s2;
    }

    protected s j(s s2) {
        s s3;
        try {
            s3 = (s)super.clone();
            s3.a = s2;
            int n2 = s2 == null ? 0 : this.b;
            s3.b = n2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        if (s2 == null && !(this instanceof h) && (s2 = this.x()) != null) {
            s3.a = s2 = ((h)s2).G0();
            ((m)s2).m().add(s3);
        }
        return s3;
    }

    protected abstract void k(String var1);

    public abstract s l();

    protected abstract List<s> m();

    public boolean n(String string) {
        d.j(string);
        if (!this.o()) {
            return false;
        }
        if (string.startsWith("abs:")) {
            String string2 = string.substring(4);
            if (this.d().r(string2) && !this.a(string2).isEmpty()) {
                return true;
            }
        }
        return this.d().r(string);
    }

    protected abstract boolean o();

    public final boolean p() {
        boolean bl = this.a != null;
        return bl;
    }

    protected final void q(Appendable appendable, int n2, g g2) {
        appendable.append('\n').append(com.github.catvod.spider.merge.d1.c.h(g2.f() * n2, g2.g()));
    }

    public final s r() {
        Object object = this.a;
        if (object == null) {
            return null;
        }
        object = ((s)object).m();
        int n2 = this.b + 1;
        if (object.size() > n2) {
            return (s)object.get(n2);
        }
        return null;
    }

    public abstract String s();

    public String t() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        this.u(stringBuilder);
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    public String toString() {
        return this.t();
    }

    protected final void u(Appendable appendable) {
        h h2 = this.x();
        if (h2 == null) {
            h2 = new h("");
        }
        j.f(new r(appendable, h2.B0()), this);
    }

    abstract void v(Appendable var1, int var2, g var3);

    abstract void w(Appendable var1, int var2, g var3);

    public final h x() {
        s s2 = this.E();
        s2 = s2 instanceof h ? (h)s2 : null;
        return s2;
    }

    public s y() {
        return this.a;
    }

    public final s z() {
        return this.a;
    }
}

