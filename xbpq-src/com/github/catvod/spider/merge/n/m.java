/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  androidx.core.content.res.ResourcesCompat$FontCallback
 */
package com.github.catvod.spider.merge.n;

import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import com.github.catvod.spider.merge.n.o;
import java.lang.ref.WeakReference;

final class m
extends ResourcesCompat.FontCallback {
    final int a;
    final int b;
    final WeakReference c;
    final o d;

    m(o o2, int n2, int n3, WeakReference weakReference) {
        this.d = o2;
        this.a = n2;
        this.b = n3;
        this.c = weakReference;
    }

    public final void onFontRetrievalFailed(int n2) {
    }

    public final void onFontRetrieved(Typeface typeface) {
        Typeface typeface2 = typeface;
        if (Build.VERSION.SDK_INT >= 28) {
            int n2 = this.a;
            typeface2 = typeface;
            if (n2 != -1) {
                boolean bl = (this.b & 2) != 0;
                typeface2 = Typeface.create((Typeface)typeface, (int)n2, (boolean)bl);
            }
        }
        this.d.n(this.c, typeface2);
    }
}

