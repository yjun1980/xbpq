package com.github.catvod.spider.merge.S;

/* loaded from: classes.dex */
public final class k extends com.github.catvod.spider.merge.O.m {
    public static final k a = new k();

    @Override // com.github.catvod.spider.merge.O.m
    public final boolean E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.O.m
    public final int F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
