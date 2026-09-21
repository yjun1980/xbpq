/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Em;

import com.github.catvod.spider.merge.Dw.e;
import com.github.catvod.spider.merge.Dw.i;
import com.github.catvod.spider.merge.Dw.q;
import com.github.catvod.spider.merge.Dw.s;
import com.github.catvod.spider.merge.Em.a;
import com.github.catvod.spider.merge.Em.b;
import com.github.catvod.spider.merge.Em.g;
import com.github.catvod.spider.merge.Em.h;
import com.github.catvod.spider.merge.Em.n;
import com.github.catvod.spider.merge.Fs.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class c
implements Iterable<a>,
Cloneable {
    private int c = 0;
    String[] d = new String[3];
    String[] e = new String[3];

    static /* synthetic */ int a(c c2) {
        return c2.c;
    }

    static /* synthetic */ boolean b(c c2, String string) {
        return c2.q(string);
    }

    static /* synthetic */ void c(c c2, int n2) {
        c2.v(n2);
    }

    private void g(int n2) {
        boolean bl = n2 >= this.c;
        i.f(bl);
        String[] stringArray = this.d;
        int n3 = stringArray.length;
        if (n3 >= n2) {
            return;
        }
        int n4 = 3;
        if (n3 >= 3) {
            n4 = this.c * 2;
        }
        if (n2 <= n4) {
            n2 = n4;
        }
        this.d = Arrays.copyOf(stringArray, n2);
        this.e = Arrays.copyOf(this.e, n2);
    }

    private int p(String string) {
        i.k(string);
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (!string.equalsIgnoreCase(this.d[i2])) continue;
            return i2;
        }
        return -1;
    }

    private boolean q(String string) {
        boolean bl = true;
        if (string == null || string.length() <= 1 || string.charAt(0) != '/') {
            bl = false;
        }
        return bl;
    }

    private void v(int n2) {
        boolean bl = n2 >= this.c;
        i.e(bl);
        int n3 = this.c - n2 - 1;
        if (n3 > 0) {
            String[] stringArray = this.d;
            int n4 = n2 + 1;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
            stringArray = this.e;
            System.arraycopy(stringArray, n4, stringArray, n2, n3);
        }
        this.c = n2 = this.c - 1;
        this.d[n2] = null;
        this.e[n2] = null;
    }

    public final c d(String string, String string2) {
        this.g(this.c + 1);
        String[] stringArray = this.d;
        int n2 = this.c;
        stringArray[n2] = string;
        this.e[n2] = string2;
        this.c = n2 + 1;
        return this;
    }

    public final void e(c c2) {
        if (c2.size() == 0) {
            return;
        }
        this.g(this.c + c2.c);
        int n2 = 0;
        while (true) {
            if (n2 < c2.c && c2.q(c2.d[n2])) {
                ++n2;
                continue;
            }
            boolean bl = n2 < c2.c;
            if (!bl) break;
            a a2 = new a(c2.d[n2], c2.e[n2], c2);
            ++n2;
            this.s(a2);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (this.c != ((c)object).c) {
                return false;
            }
            if (!Arrays.equals(this.d, ((c)object).d)) {
                return false;
            }
            return Arrays.equals(this.e, ((c)object).e);
        }
        return false;
    }

    public final List<a> f() {
        ArrayList<a> arrayList = new ArrayList<a>(this.c);
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.q(this.d[i2])) continue;
            arrayList.add(new a(this.d[i2], this.e[i2], this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final c h() {
        c c2;
        try {
            c2 = (c)super.clone();
            c2.c = this.c;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
        this.d = Arrays.copyOf(this.d, this.c);
        this.e = Arrays.copyOf(this.e, this.c);
        return c2;
    }

    public final int hashCode() {
        return (this.c * 31 + Arrays.hashCode(this.d)) * 31 + Arrays.hashCode(this.e);
    }

    public final int i(D stringArray) {
        int n2 = this.c;
        int n3 = 0;
        if ((n2 = n2 == 0 ? 1 : 0) != 0) {
            return 0;
        }
        boolean bl = stringArray.d();
        int n4 = 0;
        while (n3 < this.d.length) {
            int n5;
            n2 = n5 = n3 + 1;
            while (n2 < (stringArray = this.d).length && stringArray[n2] != null) {
                int n6;
                int n7;
                block7: {
                    block6: {
                        if (bl && stringArray[n3].equals(stringArray[n2])) break block6;
                        n7 = n4;
                        n6 = n2;
                        if (bl) break block7;
                        stringArray = this.d;
                        n7 = n4;
                        n6 = n2;
                        if (!stringArray[n3].equalsIgnoreCase(stringArray[n2])) break block7;
                    }
                    n7 = n4 + 1;
                    this.v(n2);
                    n6 = n2 - 1;
                }
                n2 = n6 + 1;
                n4 = n7;
            }
            n3 = n5;
        }
        return n4;
    }

    public final boolean isEmpty() {
        boolean bl = this.c == 0;
        return bl;
    }

    @Override
    public final Iterator<a> iterator() {
        return new b(this);
    }

    public final String j(String string) {
        block1: {
            String string2;
            int n2;
            block0: {
                n2 = this.o(string);
                string2 = "";
                if (n2 != -1) break block0;
                string = string2;
                break block1;
            }
            string = this.e[n2];
            if (string != null) break block1;
            string = string2;
        }
        return string;
    }

    public final String k(String string) {
        block1: {
            String string2;
            int n2;
            block0: {
                n2 = this.p(string);
                string2 = "";
                if (n2 != -1) break block0;
                string = string2;
                break block1;
            }
            string = this.e[n2];
            if (string != null) break block1;
            string = string2;
        }
        return string;
    }

    public final boolean l(String string) {
        boolean bl = this.o(string) != -1;
        return bl;
    }

    public final boolean m(String string) {
        boolean bl = this.p(string) != -1;
        return bl;
    }

    final void n(Appendable appendable, g g2) {
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.q(this.d[i2])) continue;
            String string = this.d[i2];
            String string2 = this.e[i2];
            appendable.append(' ').append(string);
            if (a.c(string, string2, g2)) continue;
            appendable.append("=\"");
            string = string2;
            if (string2 == null) {
                string = "";
            }
            n.d(appendable, string, g2, true, false, false);
            appendable.append('\"');
        }
    }

    final int o(String string) {
        i.k(string);
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (!string.equals(this.d[i2])) continue;
            return i2;
        }
        return -1;
    }

    public final void r() {
        for (int i2 = 0; i2 < this.c; ++i2) {
            String[] stringArray = this.d;
            stringArray[i2] = s.c(stringArray[i2]);
        }
    }

    public final c s(a a2) {
        this.t(a2.a(), a2.b());
        a2.e = this;
        return this;
    }

    public final int size() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.c; ++i2) {
            int n3 = n2;
            if (!this.q(this.d[i2])) {
                n3 = n2 + 1;
            }
            n2 = n3;
        }
        return n2;
    }

    public final c t(String string, String string2) {
        i.k(string);
        int n2 = this.o(string);
        if (n2 != -1) {
            this.e[n2] = string2;
        } else {
            this.d(string, string2);
        }
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.Dw.e.a();
        try {
            h h2 = new h();
            this.n(stringBuilder, h2.s0());
        }
        catch (IOException iOException) {
            throw new q((Throwable)iOException);
        }
        return com.github.catvod.spider.merge.Dw.e.g(stringBuilder);
    }

    final void u(String string, String string2) {
        int n2 = this.p(string);
        if (n2 != -1) {
            this.e[n2] = string2;
            if (!this.d[n2].equals(string)) {
                this.d[n2] = string;
            }
        } else {
            this.d(string, string2);
        }
    }
}

