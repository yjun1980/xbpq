/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  androidx.core.view.ViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.J;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.g;
import com.github.catvod.spider.merge.n.v;

final class e {
    private final View a;
    private final g b;
    private int c = -1;
    private J d;
    private J e;
    private J f;

    e(View view) {
        this.a = view;
        this.b = g.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a() {
        J j2;
        Drawable drawable = this.a.getBackground();
        if (drawable == null) return;
        int n2 = Build.VERSION.SDK_INT;
        int n3 = 1;
        n2 = (n2 > 21 ? this.d != null : n2 == 21) ? 1 : 0;
        if (n2 != 0) {
            PorterDuff.Mode mode;
            if (this.f == null) {
                this.f = new J();
            }
            j2 = this.f;
            j2.a = null;
            j2.d = false;
            j2.b = null;
            j2.c = false;
            ColorStateList colorStateList = ViewCompat.getBackgroundTintList((View)this.a);
            if (colorStateList != null) {
                j2.d = true;
                j2.a = colorStateList;
            }
            if ((mode = ViewCompat.getBackgroundTintMode((View)this.a)) != null) {
                j2.c = true;
                j2.b = mode;
            }
            if (!j2.d && !j2.c) {
                n2 = 0;
            } else {
                int[] nArray = this.a.getDrawableState();
                n2 = g.d;
                G.n(drawable, j2, nArray);
                n2 = n3;
            }
            if (n2 != 0) {
                return;
            }
        }
        if ((j2 = this.e) != null) {
            int[] nArray = this.a.getDrawableState();
            n2 = g.d;
            G.n(drawable, j2, nArray);
            return;
        }
        j2 = this.d;
        if (j2 == null) return;
        int[] nArray = this.a.getDrawableState();
        n2 = g.d;
        G.n(drawable, j2, nArray);
    }

    final ColorStateList b() {
        J j2 = this.e;
        j2 = j2 != null ? j2.a : null;
        return j2;
    }

    final PorterDuff.Mode c() {
        J j2 = this.e;
        j2 = j2 != null ? j2.b : null;
        return j2;
    }

    final void d(AttributeSet attributeSet, int n2) {
        Object object = this.a.getContext();
        int[] nArray = com.github.catvod.spider.merge.g.a.t;
        object = L.s((Context)object, attributeSet, nArray, n2, 0);
        View view = this.a;
        ViewCompat.saveAttributeDataForStyleable((View)view, (Context)view.getContext(), (int[])nArray, (AttributeSet)attributeSet, (TypedArray)((L)object).o(), (int)n2, (int)0);
        try {
            if (((L)object).p(0)) {
                this.c = ((L)object).l(0, -1);
                attributeSet = this.b.d(this.a.getContext(), this.c);
                if (attributeSet != null) {
                    this.g((ColorStateList)attributeSet);
                }
            }
            if (((L)object).p(1)) {
                ViewCompat.setBackgroundTintList((View)this.a, (ColorStateList)((L)object).c(1));
            }
            if (((L)object).p(2)) {
                ViewCompat.setBackgroundTintMode((View)this.a, (PorterDuff.Mode)v.c(((L)object).i(2, -1), null));
            }
            return;
        }
        finally {
            ((L)object).t();
        }
    }

    final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }

    final void f(int n2) {
        this.c = n2;
        g g2 = this.b;
        g2 = g2 != null ? g2.d(this.a.getContext(), n2) : null;
        this.g((ColorStateList)g2);
        this.a();
    }

    final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new J();
            }
            J j2 = this.d;
            j2.a = colorStateList;
            j2.d = true;
        } else {
            this.d = null;
        }
        this.a();
    }

    final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new J();
        }
        J j2 = this.e;
        j2.a = colorStateList;
        j2.d = true;
        this.a();
    }

    final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new J();
        }
        J j2 = this.e;
        j2.b = mode;
        j2.c = true;
        this.a();
    }
}

