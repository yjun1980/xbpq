/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ComponentName
 *  android.net.Uri
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.xc.j;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.nU.b;

public final class e
implements Predicate {
    public final int a;

    public /* synthetic */ e(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int n2 = this.a;
        return b.a(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            default: {
                return b.b(this);
            }
            case 10: {
                return b.b(this);
            }
            case 9: {
                return b.b(this);
            }
            case 8: {
                return b.b(this);
            }
            case 7: {
                return b.b(this);
            }
            case 6: {
                return b.b(this);
            }
            case 5: {
                return b.b(this);
            }
            case 4: {
                return b.b(this);
            }
            case 3: {
                return b.b(this);
            }
            case 2: {
                return b.b(this);
            }
            case 1: {
                return b.b(this);
            }
            case 0: 
        }
        return b.b(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int n2 = this.a;
        return b.c(this, predicate);
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                return b.h(object);
            }
            case 10: {
                return IntentSanitizer.Builder.o((Object)object);
            }
            case 9: {
                return IntentSanitizer.Builder.q((ClipData)((ClipData)object));
            }
            case 8: {
                return IntentSanitizer.Builder.m((Uri)((Uri)object));
            }
            case 7: {
                return IntentSanitizer.Builder.a((ComponentName)((ComponentName)object));
            }
            case 6: {
                return IntentSanitizer.Builder.f((String)((String)object));
            }
            case 5: {
                return IntentSanitizer.Builder.k((String)((String)object));
            }
            case 4: {
                return IntentSanitizer.Builder.b((String)((String)object));
            }
            case 3: {
                return IntentSanitizer.Builder.l((Uri)((Uri)object));
            }
            case 2: {
                return IntentSanitizer.Builder.p((String)((String)object));
            }
            case 1: {
                return IntentSanitizer.Builder.i((Object)object);
            }
            case 0: 
        }
        return IntentSanitizer.Builder.j((ComponentName)((ComponentName)object));
    }
}

