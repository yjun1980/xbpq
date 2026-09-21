package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.P.H;
import com.github.catvod.spider.merge.P.I;
import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j implements f {
    protected List<i> a;
    protected boolean b;

    static {
        g(0, 1114111).i();
        new j(new int[0]).i();
    }

    public j(int... iArr) {
        this.a = new ArrayList(iArr.length);
        for (int i : iArr) {
            a(i);
        }
    }

    public static j g(int i, int i2) {
        j jVar = new j(new int[0]);
        jVar.b(i, i2);
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public static j k(j jVar, j jVar2) {
        int i = 0;
        if (jVar.f()) {
            return new j(new int[0]);
        }
        j jVar3 = new j(new int[0]);
        jVar3.c(jVar);
        if (!jVar2.f()) {
            int i2 = 0;
            while (i < jVar3.a.size() && i2 < jVar2.a.size()) {
                i iVar = (i) jVar3.a.get(i);
                i iVar2 = (i) jVar2.a.get(i2);
                int i3 = iVar2.b;
                int i4 = iVar.a;
                if (i3 >= i4) {
                    int i5 = iVar2.a;
                    int i6 = iVar.b;
                    if (i5 <= i6) {
                        i iVar3 = i5 > i4 ? new i(i4, i5 - 1) : null;
                        i iVar4 = i3 < i6 ? new i(i3 + 1, i6) : null;
                        ?? r2 = jVar3.a;
                        if (iVar3 != null) {
                            r2.set(i, iVar3);
                            if (iVar4 != null) {
                                i++;
                                jVar3.a.add(i, iVar4);
                            }
                        } else if (iVar4 != null) {
                            r2.set(i, iVar4);
                        } else {
                            r2.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return jVar3;
    }

    public final void a(int i) {
        if (this.b) {
            throw new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
        }
        b(i, i);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final void b(int i, int i2) {
        i b = i.b(i, i2);
        if (this.b) {
            throw new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
        }
        if (b.b < b.a) {
            return;
        }
        ListIterator listIterator = this.a.listIterator();
        while (listIterator.hasNext()) {
            i iVar = (i) listIterator.next();
            if (b.equals(iVar)) {
                return;
            }
            boolean z = true;
            if ((b.a == iVar.b + 1 || b.b == iVar.a - 1) || !b.a(iVar)) {
                i c = b.c(iVar);
                listIterator.set(c);
                while (listIterator.hasNext()) {
                    i iVar2 = (i) listIterator.next();
                    if (!(c.a == iVar2.b + 1 || c.b == iVar2.a - 1) && c.a(iVar2)) {
                        return;
                    }
                    listIterator.remove();
                    listIterator.previous();
                    listIterator.set(c.c(iVar2));
                    listIterator.next();
                }
                return;
            }
            int i3 = b.a;
            int i4 = iVar.a;
            if (i3 >= i4 || b.b >= i4) {
                z = false;
            }
            if (z) {
                listIterator.previous();
                listIterator.add(b);
                return;
            }
        }
        this.a.add(b);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final j c(f fVar) {
        if (fVar == null) {
            return this;
        }
        int i = 0;
        if (fVar instanceof j) {
            j jVar = (j) fVar;
            int size = jVar.a.size();
            while (i < size) {
                i iVar = (i) jVar.a.get(i);
                b(iVar.a, iVar.b);
                i++;
            }
        } else {
            j jVar2 = (j) fVar;
            ArrayList arrayList = new ArrayList();
            int size2 = jVar2.a.size();
            while (i < size2) {
                i iVar2 = (i) jVar2.a.get(i);
                int i2 = iVar2.b;
                for (int i3 = iVar2.a; i3 <= i2; i3++) {
                    arrayList.add(Integer.valueOf(i3));
                }
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(((Integer) it.next()).intValue());
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final boolean d(int i) {
        int size = this.a.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            i iVar = (i) this.a.get(i3);
            int i4 = iVar.a;
            if (iVar.b < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final int e() {
        if (f()) {
            throw new RuntimeException(cYh.d("143535713E2947352C212323"));
        }
        return ((i) this.a.get(0)).a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        return this.a.equals(((j) obj).a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final boolean f() {
        ?? r0 = this.a;
        return r0 == 0 || r0.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final void h() {
        if (this.b) {
            throw new IllegalStateException(cYh.d("04312F76237A063C3534257A1535203538340B296118392E022237303B090224"));
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            i iVar = (i) this.a.get(i);
            int i2 = iVar.a;
            int i3 = iVar.b;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                this.a.remove(i);
                return;
            }
            if (-2 == i2) {
                iVar.a = i2 + 1;
                return;
            }
            if (-2 == i3) {
                iVar.b = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                iVar.b = -3;
                b(-1, i3);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final int hashCode() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            i = com.github.catvod.spider.merge.N.a.o(com.github.catvod.spider.merge.N.a.o(i, iVar.a), iVar.b);
        }
        return com.github.catvod.spider.merge.N.a.b(i, this.a.size() * 2);
    }

    public final void i() {
        boolean z = this.b;
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final int j() {
        int size = this.a.size();
        if (size == 1) {
            i iVar = (i) this.a.get(0);
            return (iVar.b - iVar.a) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar2 = (i) this.a.get(i2);
            i += (iVar2.b - iVar2.a) + 1;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final String l(H h) {
        String a;
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return cYh.d("1C2D");
        }
        if (j() > 1) {
            sb.append(cYh.d("1C"));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            int i = iVar.a;
            int i2 = iVar.b;
            String d = cYh.d("4B70");
            String d2 = cYh.d("5B1511021E16281E7F");
            String d3 = cYh.d("5B150E1769");
            if (i == i2) {
                if (i == -1) {
                    d2 = d3;
                } else if (i != -2) {
                    d2 = ((I) h).a(i);
                }
                sb.append(d2);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(d);
                    }
                    if (i3 == -1) {
                        a = d3;
                    } else {
                        a = i3 == -2 ? d2 : ((I) h).a(i3);
                    }
                    sb.append(a);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(d);
            }
        }
        if (j() > 1) {
            sb.append(cYh.d("1A"));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<com.github.catvod.spider.merge.S.i>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ?? r1 = this.a;
        if (r1 == 0 || r1.isEmpty()) {
            return cYh.d("1C2D");
        }
        if (j() > 1) {
            sb.append(cYh.d("1C"));
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            int i = iVar.a;
            int i2 = iVar.b;
            if (i != i2) {
                sb.append(i);
                sb.append(cYh.d("497E"));
                sb.append(i2);
            } else if (i == -1) {
                sb.append(cYh.d("5B150E1769"));
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(cYh.d("4B70"));
            }
        }
        if (j() > 1) {
            sb.append(cYh.d("1A"));
        }
        return sb.toString();
    }
}
