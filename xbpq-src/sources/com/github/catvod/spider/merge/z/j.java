package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
final class j extends com.github.catvod.spider.merge.E.g implements com.github.catvod.spider.merge.D.c<k, h, k> {
    public static final j c = new j();

    j() {
    }

    @Override // com.github.catvod.spider.merge.D.c
    public final k b(k kVar, h hVar) {
        d dVar;
        k kVar2 = kVar;
        h hVar2 = hVar;
        com.github.catvod.spider.merge.E.f.e(kVar2, cYh.d("063322"));
        com.github.catvod.spider.merge.E.f.e(hVar2, cYh.d("023C243C323413"));
        k minusKey = kVar2.minusKey(hVar2.getKey());
        l lVar = l.c;
        if (minusKey == lVar) {
            return hVar2;
        }
        f fVar = g.a;
        f fVar2 = f.a;
        g gVar = (g) minusKey.get(fVar2);
        if (gVar == null) {
            dVar = new d(minusKey, hVar2);
        } else {
            k minusKey2 = minusKey.minusKey(fVar2);
            if (minusKey2 == lVar) {
                return new d(hVar2, gVar);
            }
            dVar = new d(new d(minusKey2, hVar2), gVar);
        }
        return dVar;
    }
}
