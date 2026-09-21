package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.cYh;

/* loaded from: classes.dex */
public abstract class t extends e {
    public abstract t c();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d() {
        t tVar;
        int i = j.a;
        t tVar2 = com.github.catvod.spider.merge.N.f.a;
        if (this == tVar2) {
            return cYh.d("23393221362E0438242324742A31283F");
        }
        try {
            tVar = tVar2.c();
        } catch (UnsupportedOperationException unused) {
            tVar = null;
        }
        if (this == tVar) {
            return cYh.d("23393221362E0438242324742A31283F79330A3D24353E3B1335");
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.L.e
    public String toString() {
        String d = d();
        if (d != null) {
            return d;
        }
        return getClass().getSimpleName() + '@' + h.d(this);
    }
}
