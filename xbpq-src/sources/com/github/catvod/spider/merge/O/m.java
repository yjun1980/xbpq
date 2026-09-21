package com.github.catvod.spider.merge.O;

/* loaded from: classes.dex */
public abstract class m implements com.github.catvod.spider.merge.T.d {
    @Override // com.github.catvod.spider.merge.T.d
    public Object A(com.github.catvod.spider.merge.T.e eVar) {
        int d = eVar.d();
        Object obj = null;
        for (int i = 0; i < d; i++) {
            obj = eVar.b(i).e(this);
        }
        return obj;
    }

    public abstract boolean E(Object obj, Object obj2);

    public abstract int F(Object obj);

    @Override // com.github.catvod.spider.merge.T.d
    public void a() {
    }

    @Override // com.github.catvod.spider.merge.T.d
    public void q() {
    }
}
