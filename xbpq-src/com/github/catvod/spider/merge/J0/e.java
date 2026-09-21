/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class e {
    private long a;
    private final List<a> b = Collections.synchronizedList(new ArrayList());

    public final void a() {
        Iterator<a> iterator = new ArrayList<a>(this.b).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }

    public final void b(a a2) {
        this.b.remove(a2);
    }

    public final void c(a a2) {
        ++this.a;
        Thread thread = new Thread(a2);
        thread.setDaemon(true);
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("NanoHttpd Request Processor (#");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        thread.setName(stringBuilder.toString());
        this.b.add(a2);
        thread.start();
    }
}

