package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements k, Serializable {
    private final k c;
    private final h d;

    public d(k kVar, h hVar) {
        com.github.catvod.spider.merge.E.f.e(kVar, cYh.d("0B352725"));
        com.github.catvod.spider.merge.E.f.e(hVar, cYh.d("023C243C323413"));
        this.c = kVar;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            int i = 2;
            d dVar2 = dVar;
            int i2 = 2;
            while (true) {
                k kVar = dVar2.c;
                dVar2 = kVar instanceof d ? (d) kVar : null;
                if (dVar2 == null) {
                    break;
                }
                i2++;
            }
            d dVar3 = this;
            while (true) {
                k kVar2 = dVar3.c;
                dVar3 = kVar2 instanceof d ? (d) kVar2 : null;
                if (dVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            dVar.getClass();
            d dVar4 = this;
            while (true) {
                h hVar = dVar4.d;
                if (!com.github.catvod.spider.merge.E.f.a(dVar.get(hVar.getKey()), hVar)) {
                    z = false;
                    break;
                }
                k kVar3 = dVar4.c;
                if (!(kVar3 instanceof d)) {
                    com.github.catvod.spider.merge.E.f.c(kVar3, cYh.d("09252D3D7739063E2F3E237A0535613236291370353E7734083E6C3F22360B703528273F473B2E253B33097E223E25351224283F322949132E23382F13392F341435092424292374223C243C323413"));
                    h hVar2 = (h) kVar3;
                    z = com.github.catvod.spider.merge.E.f.a(dVar.get(hVar2.getKey()), hVar2);
                    break;
                }
                dVar4 = (d) kVar3;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.z.k
    public final <R> R fold(R r, com.github.catvod.spider.merge.D.c<? super R, ? super h, ? extends R> cVar) {
        return cVar.b((Object) this.c.fold(r, cVar), this.d);
    }

    @Override // com.github.catvod.spider.merge.z.k
    public final <E extends h> E get(i<E> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        d dVar = this;
        while (true) {
            E e = (E) dVar.d.get(iVar);
            if (e != null) {
                return e;
            }
            k kVar = dVar.c;
            if (!(kVar instanceof d)) {
                return (E) kVar.get(iVar);
            }
            dVar = (d) kVar;
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    @Override // com.github.catvod.spider.merge.z.k
    public final k minusKey(i<?> iVar) {
        com.github.catvod.spider.merge.E.f.e(iVar, cYh.d("0C3538"));
        if (this.d.get(iVar) != null) {
            return this.c;
        }
        k minusKey = this.c.minusKey(iVar);
        return minusKey == this.c ? this : minusKey == l.c ? this.d : new d(minusKey, this.d);
    }

    public final String toString() {
        return '[' + ((String) fold("", c.c)) + ']';
    }
}
