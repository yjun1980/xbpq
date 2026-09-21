/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.UriMatcher
 *  android.net.Uri
 *  androidx.core.content.UriMatcherCompat
 *  androidx.core.util.Predicate
 */
package com.github.catvod.spider.merge.xc.j;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.nU.b;

public final class d
implements Predicate {
    public final int a;
    public final Object b;

    public /* synthetic */ d(int n2, Object object) {
        this.a = n2;
        this.b = object;
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
                return com.github.catvod.spider.merge.nU.b.e((Predicate)this.b, object);
            }
            case 2: {
                return com.github.catvod.spider.merge.nU.b.i(this.b, object);
            }
            case 1: {
                return UriMatcherCompat.a((UriMatcher)((UriMatcher)this.b), (Uri)((Uri)object));
            }
            case 0: 
        }
        return ((ComponentName)this.b).equals((Object)((ComponentName)object));
    }
}

