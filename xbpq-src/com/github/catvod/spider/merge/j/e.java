/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.graphics.drawable.AnimationDrawable
 */
package com.github.catvod.spider.merge.j;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

final class e
implements TimeInterpolator {
    private int[] a;
    private int b;
    private int c;

    e(AnimationDrawable animationDrawable, boolean bl) {
        int n2;
        this.b = n2 = animationDrawable.getNumberOfFrames();
        int[] nArray = this.a;
        if (nArray == null || nArray.length < n2) {
            this.a = new int[n2];
        }
        nArray = this.a;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = bl ? n2 - i2 - 1 : i2;
            nArray[i2] = n4 = animationDrawable.getDuration(n4);
            n3 += n4;
        }
        this.c = n3;
    }

    final int a() {
        return this.c;
    }

    public final float getInterpolation(float f2) {
        int n2;
        int n3 = (int)(f2 * (float)this.c + 0.5f);
        int n4 = this.b;
        int[] nArray = this.a;
        for (n2 = 0; n2 < n4 && n3 >= nArray[n2]; n3 -= nArray[n2], ++n2) {
        }
        f2 = n2 < n4 ? (float)n3 / (float)this.c : 0.0f;
        return (float)n2 / (float)n4 + f2;
    }
}

