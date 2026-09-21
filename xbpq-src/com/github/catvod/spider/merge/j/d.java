/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.graphics.drawable.AnimationDrawable
 */
package com.github.catvod.spider.merge.j;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;
import com.github.catvod.spider.merge.j.e;
import com.github.catvod.spider.merge.j.f;

final class d
extends f {
    private final ObjectAnimator a;
    private final boolean b;

    d(AnimationDrawable animationDrawable, boolean bl, boolean bl2) {
        int n2 = animationDrawable.getNumberOfFrames();
        int n3 = bl ? n2 - 1 : 0;
        if (bl) {
            n2 = 0;
        }
        e e2 = new e(animationDrawable, bl);
        animationDrawable = ObjectAnimator.ofInt((Object)animationDrawable, (String)"currentIndex", (int[])new int[]{n3, --n2});
        animationDrawable.setAutoCancel(true);
        animationDrawable.setDuration((long)e2.a());
        animationDrawable.setInterpolator((TimeInterpolator)e2);
        this.b = bl2;
        this.a = animationDrawable;
    }

    @Override
    public final boolean a() {
        return this.b;
    }

    @Override
    public final void b() {
        this.a.reverse();
    }

    @Override
    public final void c() {
        this.a.start();
    }

    @Override
    public final void d() {
        this.a.cancel();
    }
}

