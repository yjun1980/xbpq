package com.github.catvod.spider.merge.X;

import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public final class a extends b {
    private final b[] b;

    public a(b... bVarArr) {
        this.b = (b[]) ((Object[]) bVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.X.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        for (b bVar : this.b) {
            int a = bVar.a(charSequence, i, writer);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }
}
