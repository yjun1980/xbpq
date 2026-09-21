/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.core.util.Consumer
 */
package com.github.catvod.spider.merge.xc.q;

import android.location.Location;
import java.util.function.Consumer;

public final class b
implements Consumer {
    public final androidx.core.util.Consumer a;

    public /* synthetic */ b(androidx.core.util.Consumer consumer) {
        this.a = consumer;
    }

    public final void accept(Object object) {
        this.a.accept((Object)((Location)object));
    }
}

