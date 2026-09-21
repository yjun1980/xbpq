/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.J0.r;
import com.github.catvod.spider.merge.J0.t;
import java.io.File;
import java.io.FileOutputStream;

public final class g
implements r {
    private final File a;
    private final FileOutputStream b;

    public g(File file) {
        this.a = file = File.createTempFile("NanoHTTPD-", "", file);
        this.b = new FileOutputStream(file);
    }

    @Override
    public final void a() {
        t.a(this.b);
        if (this.a.delete()) {
            return;
        }
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("could not delete temporary file: ");
        stringBuilder.append(this.a.getAbsolutePath());
        throw new Exception(stringBuilder.toString());
    }

    public final String b() {
        return this.a.getAbsolutePath();
    }
}

