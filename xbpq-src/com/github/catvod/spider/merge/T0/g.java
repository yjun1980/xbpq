/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.T0.c;
import java.io.Writer;

@Deprecated
public final class g
extends c {
    private final int b;
    private final int c;

    private g(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public static g c(int n2, int n3) {
        return new g(n2, n3);
    }

    @Override
    public final boolean b(int n2, Writer writer) {
        if (n2 >= this.b && n2 <= this.c) {
            writer.write("&#");
            writer.write(Integer.toString(n2, 10));
            writer.write(59);
            return true;
        }
        return false;
    }
}

