/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.nU;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.nU.b;

public final class a
implements Predicate {
    public final int a;
    public final Predicate b;
    public final Object c;

    public /* synthetic */ a(Predicate predicate, Predicate predicate2, int n2) {
        this.a = n2;
        this.b = predicate;
        this.c = predicate2;
    }

    public /* synthetic */ a(Class clazz, Predicate predicate) {
        this.a = 2;
        this.c = clazz;
        this.b = predicate;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int n2 = this.a;
        return com.github.catvod.spider.merge.nU.b.a(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            default: {
                return com.github.catvod.spider.merge.nU.b.b(this);
            }
            case 1: {
                return com.github.catvod.spider.merge.nU.b.b(this);
            }
            case 0: 
        }
        return com.github.catvod.spider.merge.nU.b.b(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int n2 = this.a;
        return com.github.catvod.spider.merge.nU.b.c(this, predicate);
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                return IntentSanitizer.Builder.e((Class)((Class)this.c), (Predicate)this.b, (Object)object);
            }
            case 1: {
                return com.github.catvod.spider.merge.nU.b.d(this.b, (Predicate)this.c, object);
            }
            case 0: 
        }
        return com.github.catvod.spider.merge.nU.b.f(this.b, (Predicate)this.c, object);
    }
}

