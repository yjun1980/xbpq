/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.UY.D;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.F0.c;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.h;
import com.github.catvod.spider.merge.xc.F0.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class q
implements Cloneable {
    public static final List c = Collections.emptyList();
    public q a;
    public int b;

    public static void m(Appendable object, int n2, g g2) {
        Appendable appendable = object.append('\n');
        int n3 = n2 * g2.f;
        object = com.github.catvod.spider.merge.xc.E0.b.a;
        int n4 = 0;
        n2 = n3 >= 0 ? 1 : 0;
        if (n2 != 0) {
            int n5 = g2.g;
            boolean bl = n5 >= -1;
            com.github.catvod.spider.merge.xc.D0.b.r(bl);
            n2 = n3;
            if (n5 != -1) {
                n2 = Math.min(n3, n5);
            }
            if (n2 < 21) {
                object = com.github.catvod.spider.merge.xc.E0.b.a[n2];
            } else {
                object = new char[n2];
                while (n4 < n2) {
                    object[n4] = (String)32;
                    ++n4;
                }
                object = String.valueOf((char[])object);
            }
            appendable.append((CharSequence)object);
            return;
        }
        object = new com.github.catvod.spider.merge.xc.D0.c("width must be >= 0");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(String object) {
        com.github.catvod.spider.merge.xc.D0.b.y((String)object);
        boolean bl = this.l();
        String string = "";
        if (!bl) return "";
        if (this.d().h((String)object) == -1) return "";
        String string2 = this.e();
        Object object2 = this.d().e((String)object);
        Object object3 = com.github.catvod.spider.merge.xc.E0.b.d;
        object = ((Pattern)object3).matcher(string2).replaceAll("");
        object3 = ((Pattern)object3).matcher((CharSequence)object2).replaceAll("");
        try {
            object2 = new URL((String)object);
        }
        catch (MalformedURLException malformedURLException) {
            object = new URL((String)object3);
            return ((URL)object).toExternalForm();
        }
        try {
            return com.github.catvod.spider.merge.xc.E0.b.h((URL)object2, (String)object3).toExternalForm();
        }
        catch (MalformedURLException malformedURLException) {}
        {
        }
        object = string;
        if (!com.github.catvod.spider.merge.xc.E0.b.c.matcher((CharSequence)object3).find()) return object;
        return object3;
    }

    public final void b(int n2, q ... qArray) {
        int n3;
        int n4;
        Object object;
        q q2;
        List list;
        block10: {
            com.github.catvod.spider.merge.xc.D0.b.A(qArray);
            if (qArray.length == 0) {
                return;
            }
            list = this.j();
            int n5 = 0;
            q2 = qArray[0].s();
            if (q2 != null && q2.f() == qArray.length) {
                object = q2.j();
                n4 = qArray.length;
                while (true) {
                    n3 = n4 - 1;
                    if (n4 <= 0) break;
                    if (qArray[n3] == object.get(n3)) {
                        n4 = n3;
                        continue;
                    }
                    break block10;
                    break;
                }
                n4 = this.f() == 0 ? 1 : 0;
                q2.i();
                list.addAll(n2, Arrays.asList(qArray));
                n5 = qArray.length;
                while (true) {
                    n3 = n5 - 1;
                    if (n5 <= 0) break;
                    qArray[n3].a = this;
                    n5 = n3;
                }
                if (n4 == 0 || qArray[0].b != 0) {
                    this.t(n2);
                }
                return;
            }
        }
        n3 = qArray.length;
        for (n4 = 0; n4 < n3; ++n4) {
            if (qArray[n4] != null) {
                continue;
            }
            throw new com.github.catvod.spider.merge.xc.D0.c("Array must not contain any null objects");
        }
        n3 = qArray.length;
        for (n4 = n5; n4 < n3; ++n4) {
            q2 = qArray[n4];
            q2.getClass();
            object = q2.a;
            if (object != null) {
                ((q)object).v(q2);
            }
            q2.a = this;
        }
        list.addAll(n2, Arrays.asList(qArray));
        this.t(n2);
    }

    public String c(String string) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        if (!this.l()) {
            return "";
        }
        String string2 = this.d().e(string);
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

    public abstract int f();

    public q g() {
        q q2 = this.h(null);
        LinkedList<q> linkedList = new LinkedList<q>();
        linkedList.add(q2);
        while (!linkedList.isEmpty()) {
            q q3 = (q)linkedList.remove();
            int n2 = q3.f();
            for (int i2 = 0; i2 < n2; ++i2) {
                List list = q3.j();
                q q4 = ((q)list.get(i2)).h(q3);
                list.set(i2, q4);
                linkedList.add(q4);
            }
        }
        return q2;
    }

    public q h(q q2) {
        q q3;
        try {
            q3 = (q)super.clone();
            q3.a = q2;
            int n2 = q2 == null ? 0 : this.b;
            q3.b = n2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        if (q2 == null && !(this instanceof h) && (q2 = (q2 = this.w()) instanceof h ? (h)q2 : null) != null) {
            h h2 = new h(((l)q2).e());
            c c2 = ((l)q2).g;
            if (c2 != null) {
                h2.g = c2.c();
            }
            h2.j = ((h)q2).j.a();
            q3.a = h2;
            h2.j().add(q3);
        }
        return q3;
    }

    public abstract q i();

    public abstract List j();

    public final boolean k(String string) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        boolean bl = this.l();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (string.startsWith("abs:")) {
            String string2 = string.substring(4);
            if (this.d().h(string2) != -1 && !this.a(string2).isEmpty()) {
                return true;
            }
        }
        if (this.d().h(string) != -1) {
            bl2 = true;
        }
        return bl2;
    }

    public abstract boolean l();

    public final q n() {
        Object object = this.a;
        if (object == null) {
            return null;
        }
        object = ((q)object).j();
        int n2 = this.b + 1;
        if (object.size() > n2) {
            return (q)object.get(n2);
        }
        return null;
    }

    public abstract String o();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public String p() {
        void var1_6;
        void var1_5;
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        q q2 = this.w();
        if (q2 instanceof h) {
            h h2 = (h)q2;
        } else {
            Object var1_4 = null;
        }
        if (var1_5 == null) {
            h h3 = new h("");
        }
        g g2 = var1_6.j;
        com.github.catvod.spider.merge.xc.D0.b.O(new D(stringBuilder, g2), this);
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }

    public abstract void q(Appendable var1, int var2, g var3);

    public abstract void r(Appendable var1, int var2, g var3);

    public q s() {
        return this.a;
    }

    public final void t(int n2) {
        int n3 = this.f();
        if (n3 == 0) {
            return;
        }
        List list = this.j();
        while (n2 < n3) {
            ((q)list.get((int)n2)).b = n2;
            ++n2;
        }
    }

    public String toString() {
        return this.p();
    }

    public final void u() {
        com.github.catvod.spider.merge.xc.D0.b.A(this.a);
        this.a.v(this);
    }

    public void v(q q2) {
        boolean bl = q2.a == this;
        com.github.catvod.spider.merge.xc.D0.b.r(bl);
        int n2 = q2.b;
        this.j().remove(n2);
        this.t(n2);
        q2.a = null;
    }

    public q w() {
        q q2;
        q q3 = this;
        while ((q2 = q3.a) != null) {
            q3 = q2;
        }
        return q3;
    }
}

