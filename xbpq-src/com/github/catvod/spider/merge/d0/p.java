/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d0;

import com.github.catvod.en.NetPan;
import java.util.Map;
import java.util.function.Consumer;

public final class p
implements Consumer {
    public final NetPan a;
    public final String b;
    public final Map c;

    public /* synthetic */ p(NetPan netPan, String string, Map map) {
        this.a = netPan;
        this.b = string;
        this.c = map;
    }

    public final void accept(Object object) {
        NetPan.a(this.a, this.b, this.c, (String)object);
    }
}

