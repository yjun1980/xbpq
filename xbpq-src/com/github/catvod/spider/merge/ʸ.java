/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b6;
import java.io.Writer;

@Deprecated
public abstract class \u02b8
extends \u02b6 {
    @Override
    public final int \u0528(CharSequence charSequence, int n2, Writer writer) {
        return this.\u052c(Character.codePointAt(charSequence, n2), writer) ? 1 : 0;
    }

    public abstract boolean \u052c(int var1, Writer var2);
}

