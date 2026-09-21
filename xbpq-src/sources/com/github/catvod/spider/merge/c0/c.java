package com.github.catvod.spider.merge.c0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d0.D;
import com.github.catvod.spider.merge.x.C0243a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Iterable<a>, Cloneable {
    private int c = 0;
    String[] d = new String[3];
    String[] e = new String[3];

    private void g(int i) {
        com.github.catvod.spider.merge.N.a.f(i >= this.c);
        String[] strArr = this.d;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.c * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.d = (String[]) Arrays.copyOf(strArr, i);
        this.e = (String[]) Arrays.copyOf(this.e, i);
    }

    private int p(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equalsIgnoreCase(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(int i) {
        com.github.catvod.spider.merge.N.a.e(i >= this.c);
        int i2 = (this.c - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.d;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            String[] strArr2 = this.e;
            System.arraycopy(strArr2, i3, strArr2, i, i2);
        }
        int i4 = this.c - 1;
        this.c = i4;
        this.d[i4] = null;
        this.e[i4] = null;
    }

    public final c d(String str, String str2) {
        g(this.c + 1);
        String[] strArr = this.d;
        int i = this.c;
        strArr[i] = str;
        this.e[i] = str2;
        this.c = i + 1;
        return this;
    }

    public final void e(c cVar) {
        if (cVar.size() == 0) {
            return;
        }
        g(this.c + cVar.c);
        int i = 0;
        while (true) {
            if (i >= cVar.c || !cVar.q(cVar.d[i])) {
                if (!(i < cVar.c)) {
                    return;
                }
                a aVar = new a(cVar.d[i], cVar.e[i], cVar);
                i++;
                s(aVar);
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && Arrays.equals(this.d, cVar.d)) {
            return Arrays.equals(this.e, cVar.e);
        }
        return false;
    }

    public final List<a> f() {
        ArrayList arrayList = new ArrayList(this.c);
        for (int i = 0; i < this.c; i++) {
            if (!q(this.d[i])) {
                arrayList.add(new a(this.d[i], this.e[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.c = this.c;
            this.d = (String[]) Arrays.copyOf(this.d, this.c);
            this.e = (String[]) Arrays.copyOf(this.e, this.c);
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return (((this.c * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    public final int i(D d) {
        int i = 0;
        if (this.c == 0) {
            return 0;
        }
        boolean d2 = d.d();
        int i2 = 0;
        while (i < this.d.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                Object[] objArr = this.d;
                if (i4 < objArr.length && objArr[i4] != null) {
                    if (!d2 || !objArr[i].equals(objArr[i4])) {
                        if (!d2) {
                            String[] strArr = this.d;
                            if (!strArr[i].equalsIgnoreCase(strArr[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    v(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return new b(this);
    }

    public final String j(String str) {
        String str2;
        int o = o(str);
        return (o == -1 || (str2 = this.e[o]) == null) ? "" : str2;
    }

    public final String k(String str) {
        String str2;
        int p = p(str);
        return (p == -1 || (str2 = this.e[p]) == null) ? "" : str2;
    }

    public final boolean l(String str) {
        return o(str) != -1;
    }

    public final boolean m(String str) {
        return p(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(Appendable appendable, g gVar) {
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(this.d[i2])) {
                String str = this.d[i2];
                String str2 = this.e[i2];
                appendable.append(' ').append(str);
                if (!a.c(str, str2, gVar)) {
                    appendable.append(cYh.d("5A72"));
                    if (str2 == null) {
                        str2 = "";
                    }
                    n.d(appendable, str2, gVar, true, false, false);
                    appendable.append('\"');
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(String str) {
        com.github.catvod.spider.merge.N.a.k(str);
        for (int i = 0; i < this.c; i++) {
            if (str.equals(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void r() {
        for (int i = 0; i < this.c; i++) {
            String[] strArr = this.d;
            strArr[i] = C0243a.c(strArr[i]);
        }
    }

    public final c s(a aVar) {
        t(aVar.a(), aVar.b());
        aVar.e = this;
        return this;
    }

    public final int size() {
        int i = 0;
        for (int i2 = 0; i2 < this.c; i2++) {
            if (!q(this.d[i2])) {
                i++;
            }
        }
        return i;
    }

    public final c t(String str, String str2) {
        com.github.catvod.spider.merge.N.a.k(str);
        int o = o(str);
        if (o != -1) {
            this.e[o] = str2;
        } else {
            d(str, str2);
        }
        return this;
    }

    public final String toString() {
        StringBuilder a = com.github.catvod.spider.merge.b0.b.a();
        try {
            n(a, new h().s0());
            return com.github.catvod.spider.merge.b0.b.g(a);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Z.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u(String str, String str2) {
        int p = p(str);
        if (p == -1) {
            d(str, str2);
            return;
        }
        this.e[p] = str2;
        if (this.d[p].equals(str)) {
            return;
        }
        this.d[p] = str;
    }
}
