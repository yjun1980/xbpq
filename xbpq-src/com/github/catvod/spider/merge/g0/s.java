/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.TgYunPanLocal;
import java.util.List;
import java.util.function.Consumer;

public final class s
implements Consumer {
    public final TgYunPanLocal a;
    public final String b;
    public final List c;

    public /* synthetic */ s(TgYunPanLocal tgYunPanLocal, String string, List list) {
        this.a = tgYunPanLocal;
        this.b = string;
        this.c = list;
    }

    public final void accept(Object object) {
        TgYunPanLocal.o(this.a, this.b, this.c, (String)object);
    }
}

