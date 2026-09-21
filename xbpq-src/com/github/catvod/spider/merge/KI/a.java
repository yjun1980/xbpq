/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData$Item
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.KI;

import android.content.ClipData;
import com.github.catvod.spider.merge.nU.b;
import java.util.function.Predicate;

public final class a
implements androidx.core.util.Predicate {
    public final Predicate a;

    public /* synthetic */ a(Predicate predicate) {
        this.a = predicate;
    }

    public final /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate) {
        return b.a(this, predicate);
    }

    public final /* synthetic */ androidx.core.util.Predicate negate() {
        return b.b(this);
    }

    public final /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate) {
        return b.c(this, predicate);
    }

    public final boolean test(Object object) {
        return this.a.test((ClipData.Item)object);
    }
}

