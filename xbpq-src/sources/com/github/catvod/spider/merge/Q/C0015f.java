package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.cYh;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.Q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0015f implements Set<C0011b> {
    protected boolean c;
    public C0014e d;
    public final ArrayList<C0011b> e;
    public int f;
    protected BitSet g;
    public boolean h;
    public boolean i;
    public final boolean j;
    private int k;

    public C0015f() {
        this(true);
    }

    public C0015f(boolean z) {
        this.c = false;
        this.e = new ArrayList<>(7);
        this.k = -1;
        this.d = new C0014e(0);
        this.j = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/merge/Q/b;Lcom/github/catvod/spider/merge/S/c<Lcom/github/catvod/spider/merge/Q/X;Lcom/github/catvod/spider/merge/Q/X;Lcom/github/catvod/spider/merge/Q/X;>;)Z */
    public final void a(C0011b c0011b, com.github.catvod.spider.merge.S.c cVar) {
        if (this.c) {
            throw new IllegalStateException(cYh.d("33382822772902246138247A1535203538340B29"));
        }
        if (c0011b.e != l0.c) {
            this.h = true;
        }
        if (c0011b.b() > 0) {
            this.i = true;
        }
        C0011b f = this.d.f(c0011b);
        if (f == c0011b) {
            this.k = -1;
            this.e.add(c0011b);
            return;
        }
        X g = X.g(f.c, c0011b.c, !this.j, cVar);
        f.d = Math.max(f.d, c0011b.d);
        if (c0011b.c()) {
            f.d |= 1073741824;
        }
        f.c = g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        a((C0011b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C0011b> collection) {
        Iterator<? extends C0011b> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next(), null);
        }
        return false;
    }

    public final void b(AbstractC0021l abstractC0021l) {
        if (this.c) {
            throw new IllegalStateException(cYh.d("33382822772902246138247A1535203538340B29"));
        }
        if (this.d.isEmpty()) {
            return;
        }
        Iterator<C0011b> it = this.e.iterator();
        while (it.hasNext()) {
            C0011b next = it.next();
            X x = next.c;
            Y y = abstractC0021l.b;
            if (y != null) {
                synchronized (y) {
                    x = X.b(x, abstractC0021l.b, new IdentityHashMap());
                }
            }
            next.c = x;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.c) {
            throw new IllegalStateException(cYh.d("33382822772902246138247A1535203538340B29"));
        }
        this.e.clear();
        this.k = -1;
        this.d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0014e c0014e = this.d;
        if (c0014e != null) {
            return c0014e.contains(obj);
        }
        throw new UnsupportedOperationException(cYh.d("3338282277370224293E337A0E23613F382E47392C213B3F0A352F25323E47362E2377280231253E39361E703234232949"));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0015f)) {
            return false;
        }
        C0015f c0015f = (C0015f) obj;
        ArrayList<C0011b> arrayList = this.e;
        return arrayList != null && arrayList.equals(c0015f.e) && this.j == c0015f.j && this.f == c0015f.f && this.g == c0015f.g && this.h == c0015f.h && this.i == c0015f.i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.c) {
            return this.e.hashCode();
        }
        if (this.k == -1) {
            this.k = this.e.hashCode();
        }
        return this.k;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<C0011b> iterator() {
        return this.e.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.d.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.d.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.toString());
        if (this.h) {
            sb.append(cYh.d("4B382022043F0A312F253E39243F2F253222136D"));
            sb.append(this.h);
        }
        if (this.f != 0) {
            sb.append(cYh.d("4B252F38262F02112D256A"));
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(cYh.d("4B332E3F31360E333538393D263C35226A"));
            sb.append(this.g);
        }
        if (this.i) {
            sb.append(cYh.d("4B342821241309242E1E222E0222023E392E022835"));
        }
        return sb.toString();
    }
}
