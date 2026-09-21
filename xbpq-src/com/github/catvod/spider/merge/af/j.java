/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package com.github.catvod.spider.merge.af;

import android.animation.ValueAnimator;
import com.github.catvod.spider.merge.af.k;

final class j
implements ValueAnimator.AnimatorUpdateListener {
    final k a;

    j(k k2) {
        this.a = k2;
    }

    public final void onAnimationUpdate(ValueAnimator object) {
        object = this.a;
        k.c((k)((Object)object), k.d((k)((Object)object)));
        object = this.a;
        k.g((k)((Object)object), k.d((k)((Object)object)));
        if (k.a(this.a) + k.h(this.a) < 0) {
            object = this.a;
            k.b((k)((Object)object), k.e((k)((Object)object)) + k.h(this.a) + k.i(this.a));
        }
        if (k.e(this.a) + k.h(this.a) < 0) {
            object = this.a;
            k.f((k)((Object)object), k.a((k)((Object)object)) + k.h(this.a) + k.i(this.a));
        }
        this.a.invalidate();
    }
}

