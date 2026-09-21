package com.github.catvod.spider.merge.U;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Supplier {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ i(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.a, this.b);
    }
}
