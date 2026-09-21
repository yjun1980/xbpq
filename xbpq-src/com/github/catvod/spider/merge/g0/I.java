/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.kongbai;
import java.util.concurrent.Callable;

public final class I
implements Callable {
    public final Object a;
    public final Object b;

    public /* synthetic */ I(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public final Object call() {
        return kongbai.o((kongbai)((Object)this.a), (String)this.b);
    }
}

