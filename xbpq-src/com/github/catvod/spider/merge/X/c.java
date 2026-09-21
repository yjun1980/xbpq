/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.X.b;
import java.io.Writer;

@Deprecated
public abstract class c
extends b {
    @Override
    public final int a(CharSequence charSequence, int n2, Writer writer) {
        return this.b(Character.codePointAt(charSequence, n2), writer) ? 1 : 0;
    }

    public abstract boolean b(int var1, Writer var2);
}

