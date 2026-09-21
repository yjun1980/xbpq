package com.github.catvod.spider.merge.X;

import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public abstract class c extends b {
    @Override // com.github.catvod.spider.merge.X.b
    public final int a(CharSequence charSequence, int i, Writer writer) {
        return b(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean b(int i, Writer writer);
}
