/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.net.Uri
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.xc.j;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.nU.b;

public final class c
implements Predicate {
    public final int a;
    public final String b;

    public /* synthetic */ c(String string, int n2) {
        this.a = n2;
        this.b = string;
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
            case 4: {
                return com.github.catvod.spider.merge.nU.b.b(this);
            }
            case 3: {
                return com.github.catvod.spider.merge.nU.b.b(this);
            }
            case 2: {
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
                return IntentSanitizer.Builder.h((String)this.b, (Uri)((Uri)object));
            }
            case 4: {
                return IntentSanitizer.Builder.d((String)this.b, (Uri)((Uri)object));
            }
            case 3: {
                return IntentSanitizer.Builder.n((String)this.b, (Uri)((Uri)object));
            }
            case 2: {
                return IntentSanitizer.Builder.c((String)this.b, (ComponentName)((ComponentName)object));
            }
            case 1: {
                return this.b.equals((String)object);
            }
            case 0: 
        }
        return IntentSanitizer.Builder.g((String)this.b, (Uri)((Uri)object));
    }
}

