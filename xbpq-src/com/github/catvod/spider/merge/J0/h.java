/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.g;
import com.github.catvod.spider.merge.J0.r;
import com.github.catvod.spider.merge.J0.t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class h {
    private final File a;
    private final List<r> b;

    public h() {
        File file;
        this.a = file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = new ArrayList<r>();
    }

    public final void a() {
        for (r r2 : this.b) {
            try {
                r2.a();
            }
            catch (Exception exception) {
                t.c().log(Level.WARNING, "could not delete file ", exception);
            }
        }
        ((ArrayList)this.b).clear();
    }

    public final r b() {
        g g2 = new g(this.a);
        ((ArrayList)this.b).add(g2);
        return g2;
    }
}

