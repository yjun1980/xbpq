/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.StateSet
 */
package com.github.catvod.spider.merge.j;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.k;
import com.github.catvod.spider.merge.j.m;

@SuppressLint(value={"RestrictedAPI"})
class n
extends k {
    private m n;
    private boolean o;

    n() {
    }

    n(m m2, Resources resources) {
        this.f(new m(m2, this, resources));
        this.onStateChange(this.getState());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.onStateChange(this.getState());
    }

    @Override
    void f(j j2) {
        super.f(j2);
        if (j2 instanceof m) {
            this.n = (m)j2;
        }
    }

    m h() {
        return new m(this.n, this, null);
    }

    public boolean isStateful() {
        return true;
    }

    @Override
    public Drawable mutate() {
        if (!this.o) {
            super.mutate();
            this.n.i();
            this.o = true;
        }
        return this;
    }

    @Override
    protected boolean onStateChange(int[] nArray) {
        int n2;
        boolean bl = super.onStateChange(nArray);
        int n3 = n2 = this.n.l(nArray);
        if (n2 < 0) {
            n3 = this.n.l(StateSet.WILD_CARD);
        }
        bl = this.e(n3) || bl;
        return bl;
    }
}

