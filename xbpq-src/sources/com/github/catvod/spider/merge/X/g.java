package com.github.catvod.spider.merge.X;

import com.github.catvod.spider.merge.cYh;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public final class g extends c {
    private final int b;
    private final int c;

    private g(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public static g c(int i, int i2) {
        return new g(i, i2);
    }

    @Override // com.github.catvod.spider.merge.X.c
    public final boolean b(int i, Writer writer) {
        if (i < this.b || i > this.c) {
            return false;
        }
        writer.write(cYh.d("4173"));
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
