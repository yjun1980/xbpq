/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.F0;

import com.github.catvod.spider.merge.xc.F0.a;
import com.github.catvod.spider.merge.xc.F0.b;
import com.github.catvod.spider.merge.xc.F0.g;
import com.github.catvod.spider.merge.xc.F0.h;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public final class c
implements Iterable,
Cloneable {
    public int a = 0;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    public static boolean i(String string) {
        boolean bl;
        boolean bl2 = bl = false;
        if (string != null) {
            bl2 = bl;
            if (string.length() > 1) {
                bl2 = bl;
                if (string.charAt(0) == '/') {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public final void a(Object object, String string) {
        this.b(this.a + 1);
        String[] stringArray = this.b;
        int n2 = this.a;
        stringArray[n2] = string;
        this.c[n2] = object;
        this.a = n2 + 1;
    }

    public final void b(int n2) {
        boolean bl = n2 >= this.a;
        com.github.catvod.spider.merge.xc.D0.b.r(bl);
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

    public final c c() {
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

    public final String d(String string) {
        Object object;
        int n2 = this.g(string);
        string = "";
        if (n2 != -1 && (object = this.c[n2]) != null) {
            string = (String)object;
        }
        return string;
    }

    public final String e(String string) {
        Object object;
        int n2 = this.h(string);
        string = "";
        if (n2 != -1 && (object = this.c[n2]) != null) {
            string = (String)object;
        }
        return string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.a != ((c)object).a) {
                return false;
            }
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n2 = ((c)object).g(this.b[i2]);
                if (n2 == -1) {
                    return false;
                }
                Object object2 = this.c[i2];
                Object object3 = ((c)object).c[n2];
                if (!(object2 == null ? object3 != null : !object2.equals(object3))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f(Appendable appendable, g g2) {
        int n2 = this.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (com.github.catvod.spider.merge.xc.F0.c.i(this.b[i2])) continue;
            String string = this.b[i2];
            if ((string = com.github.catvod.spider.merge.xc.F0.a.a(g2.h, string)) == null) continue;
            com.github.catvod.spider.merge.xc.F0.a.b(string, (String)this.c[i2], appendable.append(' '), g2);
        }
    }

    public final int g(String string) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (!string.equals(this.b[i2])) continue;
            return i2;
        }
        return -1;
    }

    public final int h(String string) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (!string.equalsIgnoreCase(this.b[i2])) continue;
            return i2;
        }
        return -1;
    }

    public final int hashCode() {
        int n2 = this.a;
        int n3 = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + (n2 * 31 + n3) * 31;
    }

    public final Iterator iterator() {
        return new b(this);
    }

    public final void j(a a2) {
        String string;
        String string2 = string = a2.b;
        if (string == null) {
            string2 = "";
        }
        this.k(a2.a, string2);
        a2.c = this;
    }

    public final void k(String string, String string2) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        int n2 = this.g(string);
        if (n2 != -1) {
            this.c[n2] = string2;
        } else {
            this.a(string2, string);
        }
    }

    public final void l(int n2) {
        int n3 = this.a;
        if (n2 < n3) {
            if ((n3 = n3 - n2 - 1) > 0) {
                Object[] objectArray = this.b;
                int n4 = n2 + 1;
                System.arraycopy(objectArray, n4, objectArray, n2, n3);
                objectArray = this.c;
                System.arraycopy(objectArray, n4, objectArray, n2, n3);
            }
            this.a = n2 = this.a - 1;
            this.b[n2] = null;
            this.c[n2] = null;
            return;
        }
        throw new com.github.catvod.spider.merge.xc.D0.c("Must be false");
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        try {
            h h2 = new h("");
            this.f(stringBuilder, h2.j);
        }
        catch (IOException iOException) {
            throw new com.github.catvod.spider.merge.xc.C0.a(iOException);
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }
}

