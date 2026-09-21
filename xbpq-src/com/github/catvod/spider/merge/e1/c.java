/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.a;
import com.github.catvod.spider.merge.e1.b;
import com.github.catvod.spider.merge.e1.g;
import com.github.catvod.spider.merge.e1.h;
import com.github.catvod.spider.merge.f1.E;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
implements Iterable<a>,
Cloneable {
    private int a = 0;
    String[] b = new String[3];
    Object[] c = new Object[3];

    private void B(int n2) {
        boolean bl = n2 >= this.a;
        d.e(bl);
        int n3 = this.a - n2 - 1;
        if (n3 > 0) {
            Object[] objectArray = this.b;
            int n4 = n2 + 1;
            System.arraycopy(objectArray, n4, objectArray, n2, n3);
            objectArray = this.c;
            System.arraycopy(objectArray, n4, objectArray, n2, n3);
        }
        this.a = n2 = this.a - 1;
        this.b[n2] = null;
        this.c[n2] = null;
    }

    static /* synthetic */ int a(c c2) {
        return c2.a;
    }

    static /* synthetic */ boolean c(c c2, String string) {
        return c2.w(string);
    }

    static /* synthetic */ void d(c c2, int n2) {
        c2.B(n2);
    }

    private void i(String string, Object object) {
        this.k(this.a + 1);
        String[] stringArray = this.b;
        int n2 = this.a;
        stringArray[n2] = string;
        this.c[n2] = object;
        this.a = n2 + 1;
    }

    private void k(int n2) {
        boolean bl = n2 >= this.a;
        d.f(bl);
        String[] stringArray = this.b;
        int n3 = stringArray.length;
        if (n3 >= n2) {
            return;
        }
        int n4 = 3;
        if (n3 >= 3) {
            n4 = this.a * 2;
        }
        if (n2 <= n4) {
            n2 = n4;
        }
        this.b = Arrays.copyOf(stringArray, n2);
        this.c = Arrays.copyOf(this.c, n2);
    }

    static String l(Object object) {
        object = object == null ? "" : (String)object;
        return object;
    }

    private int u(String string) {
        d.j(string);
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (!string.equalsIgnoreCase(this.b[i2])) continue;
            return i2;
        }
        return -1;
    }

    static String v(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/');
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private boolean w(String string) {
        boolean bl = true;
        if (string == null || string.length() <= 1 || string.charAt(0) != '/') {
            bl = false;
        }
        return bl;
    }

    final void A(String string, String string2) {
        int n2 = this.u(string);
        if (n2 != -1) {
            this.c[n2] = string2;
            if (!this.b[n2].equals(string)) {
                this.b[n2] = string;
            }
        } else {
            this.i(string, string2);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            c c2 = (c)object;
            if (this.a != c2.a) {
                return false;
            }
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n2 = c2.t(this.b[i2]);
                if (n2 == -1) {
                    return false;
                }
                object = this.c[i2];
                Object object2 = c2.c[n2];
                if (!(object == null ? object2 != null : !object.equals(object2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final c f(String string, String string2) {
        this.i(string, string2);
        return this;
    }

    public final void g(c c2) {
        int n2 = c2.a;
        if (n2 == 0) {
            return;
        }
        this.k(this.a + n2);
        boolean bl = this.a != 0;
        n2 = 0;
        while (true) {
            if (n2 < c2.a && c2.w(c2.b[n2])) {
                ++n2;
                continue;
            }
            boolean bl2 = n2 < c2.a;
            if (!bl2) break;
            a a2 = new a(c2.b[n2], (String)c2.c[n2], c2);
            ++n2;
            if (bl) {
                this.y(a2);
                continue;
            }
            this.i(a2.a(), a2.c());
        }
    }

    public final int hashCode() {
        int n2 = this.a;
        int n3 = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + (n2 * 31 + n3) * 31;
    }

    public final boolean isEmpty() {
        boolean bl = this.a == 0;
        return bl;
    }

    @Override
    public final Iterator<a> iterator() {
        return new b(this);
    }

    public final List<a> j() {
        ArrayList<a> arrayList = new ArrayList<a>(this.a);
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (this.w(this.b[i2])) continue;
            arrayList.add(new a(this.b[i2], (String)this.c[i2], this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final c m() {
        c c2;
        try {
            c2 = (c)super.clone();
            c2.a = this.a;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        c2.b = Arrays.copyOf(this.b, this.a);
        c2.c = Arrays.copyOf(this.c, this.a);
        return c2;
    }

    public final int n(E stringArray) {
        int n2 = this.a;
        int n3 = 0;
        if ((n2 = n2 == 0 ? 1 : 0) != 0) {
            return 0;
        }
        boolean bl = stringArray.e();
        int n4 = 0;
        while (n3 < this.b.length) {
            int n5;
            n2 = n5 = n3 + 1;
            while (n2 < (stringArray = this.b).length && stringArray[n2] != null) {
                int n6;
                int n7;
                block7: {
                    block6: {
                        if (bl && stringArray[n3].equals(stringArray[n2])) break block6;
                        n7 = n4;
                        n6 = n2;
                        if (bl) break block7;
                        stringArray = this.b;
                        n7 = n4;
                        n6 = n2;
                        if (!stringArray[n3].equalsIgnoreCase(stringArray[n2])) break block7;
                    }
                    n7 = n4 + 1;
                    this.B(n2);
                    n6 = n2 - 1;
                }
                n2 = n6 + 1;
                n4 = n7;
            }
            n3 = n5;
        }
        return n4;
    }

    public final String o(String string) {
        int n2 = this.t(string);
        string = n2 == -1 ? "" : com.github.catvod.spider.merge.e1.c.l(this.c[n2]);
        return string;
    }

    public final String p(String string) {
        int n2 = this.u(string);
        string = n2 == -1 ? "" : com.github.catvod.spider.merge.e1.c.l(this.c[n2]);
        return string;
    }

    public final boolean q(String string) {
        boolean bl = this.t(string) != -1;
        return bl;
    }

    public final boolean r(String string) {
        boolean bl = this.u(string) != -1;
        return bl;
    }

    final void s(Appendable appendable, g g2) {
        int n2 = this.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string;
            if (this.w(this.b[i2]) || (string = com.github.catvod.spider.merge.e1.a.b(this.b[i2], g2.j())) == null) continue;
            com.github.catvod.spider.merge.e1.a.d(string, (String)this.c[i2], appendable.append(' '), g2);
        }
    }

    public final int size() {
        return this.a;
    }

    final int t(String string) {
        d.j(string);
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (!string.equals(this.b[i2])) continue;
            return i2;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        try {
            h h2 = new h("");
            this.s(stringBuilder, h2.B0());
        }
        catch (IOException iOException) {
            throw new com.github.catvod.spider.merge.b1.a(iOException);
        }
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    public final void x() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            String[] stringArray = this.b;
            stringArray[i2] = com.github.catvod.spider.merge.K1.d.e(stringArray[i2]);
        }
    }

    public final c y(a a2) {
        this.z(a2.a(), a2.c());
        a2.c = this;
        return this;
    }

    public final c z(String string, String string2) {
        d.j(string);
        int n2 = this.t(string);
        if (n2 != -1) {
            this.c[n2] = string2;
        } else {
            this.i(string, string2);
        }
        return this;
    }
}

