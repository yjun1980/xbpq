/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.StateSet
 */
package com.github.catvod.spider.merge.j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.n;

class m
extends j {
    int[][] H;

    m(m m2, n n2, Resources resources) {
        super(m2, n2, resources);
        this.H = m2 != null ? m2.H : (int[][])new int[this.g.length][];
    }

    @Override
    void i() {
        Object object = this.H;
        int[][] nArrayArray = new int[((int[][])object).length][];
        for (int i2 = ((int[][])object).length - 1; i2 >= 0; --i2) {
            object = this.H;
            object = object[i2] != null ? (Object)((int[])object[i2].clone()) : null;
            nArrayArray[i2] = (int[])object;
        }
        this.H = nArrayArray;
    }

    final int l(int[] nArray) {
        int[][] nArray2 = this.H;
        int n2 = this.h;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!StateSet.stateSetMatches((int[])nArray2[i2], (int[])nArray)) continue;
            return i2;
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new n(this, null);
    }

    public Drawable newDrawable(Resources resources) {
        return new n(this, resources);
    }
}

