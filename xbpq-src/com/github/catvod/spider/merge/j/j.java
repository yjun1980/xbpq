/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  androidx.core.graphics.drawable.DrawableCompat
 */
package com.github.catvod.spider.merge.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.catvod.spider.merge.j.k;
import com.github.catvod.spider.merge.j.m;

abstract class j
extends Drawable.ConstantState {
    boolean A;
    ColorFilter B;
    boolean C;
    ColorStateList D;
    PorterDuff.Mode E;
    boolean F;
    boolean G;
    final k a;
    Resources b;
    int c;
    int d;
    int e;
    SparseArray<Drawable.ConstantState> f;
    Drawable[] g;
    int h;
    boolean i;
    boolean j;
    Rect k;
    boolean l;
    boolean m;
    int n;
    int o;
    int p;
    int q;
    boolean r;
    int s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    int x;
    int y;
    int z;

    j(j sparseArray, k object, Resources resources) {
        int n2 = 0;
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = object;
        Object var7_5 = null;
        object = resources != null ? resources : (sparseArray != null ? sparseArray.b : null);
        this.b = object;
        int n3 = sparseArray != null ? sparseArray.c : 0;
        int n4 = com.github.catvod.spider.merge.j.k.m;
        if (resources != null) {
            n3 = resources.getDisplayMetrics().densityDpi;
        }
        n4 = n3;
        if (n3 == 0) {
            n4 = 160;
        }
        this.c = n4;
        if (sparseArray != null) {
            this.d = sparseArray.d;
            this.e = sparseArray.e;
            this.u = true;
            this.v = true;
            this.i = sparseArray.i;
            this.l = sparseArray.l;
            this.w = sparseArray.w;
            this.x = sparseArray.x;
            this.y = sparseArray.y;
            this.z = sparseArray.z;
            this.A = sparseArray.A;
            this.B = sparseArray.B;
            this.C = sparseArray.C;
            this.D = sparseArray.D;
            this.E = sparseArray.E;
            this.F = sparseArray.F;
            this.G = sparseArray.G;
            if (sparseArray.c == n4) {
                if (sparseArray.j) {
                    object = var7_5;
                    if (sparseArray.k != null) {
                        object = new Rect(sparseArray.k);
                    }
                    this.k = object;
                    this.j = true;
                }
                if (sparseArray.m) {
                    this.n = sparseArray.n;
                    this.o = sparseArray.o;
                    this.p = sparseArray.p;
                    this.q = sparseArray.q;
                    this.m = true;
                }
            }
            if (sparseArray.r) {
                this.s = sparseArray.s;
                this.r = true;
            }
            if (sparseArray.t) {
                this.t = true;
            }
            object = sparseArray.g;
            this.g = new Drawable[((Drawable[])object).length];
            this.h = sparseArray.h;
            sparseArray = sparseArray.f;
            sparseArray = sparseArray != null ? sparseArray.clone() : new SparseArray(this.h);
            this.f = sparseArray;
            n4 = this.h;
            for (n3 = n2; n3 < n4; ++n3) {
                if (object[n3] == null) continue;
                sparseArray = object[n3].getConstantState();
                if (sparseArray != null) {
                    this.f.put(n3, (Object)sparseArray);
                    continue;
                }
                this.g[n3] = object[n3];
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
    }

    private void e() {
        Drawable.ConstantState constantState = this.f;
        if (constantState != null) {
            int n2 = constantState.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = this.f.keyAt(i2);
                constantState = (Drawable.ConstantState)this.f.valueAt(i2);
                this.g[n3] = this.j(constantState.newDrawable(this.b));
            }
            this.f = null;
        }
    }

    private Drawable j(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            DrawableCompat.setLayoutDirection((Drawable)drawable, (int)this.x);
        }
        drawable = drawable.mutate();
        drawable.setCallback((Drawable.Callback)this.a);
        return drawable;
    }

    public final int a(Drawable drawable) {
        int n2;
        int n3 = this.h;
        if (n3 >= this.g.length) {
            n2 = n3 + 10;
            m m2 = (m)this;
            Object object = new Drawable[n2];
            Drawable[] drawableArray = m2.g;
            if (drawableArray != null) {
                System.arraycopy(drawableArray, 0, object, 0, n3);
            }
            m2.g = object;
            object = new int[n2][];
            System.arraycopy(m2.H, 0, object, 0, n3);
            m2.H = (int[][])object;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback((Drawable.Callback)this.a);
        this.g[n3] = drawable;
        ++this.h;
        n2 = this.e;
        this.e = drawable.getChangingConfigurations() | n2;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return n3;
    }

    final void b(Resources.Theme theme) {
        if (theme != null) {
            this.e();
            int n2 = this.h;
            Drawable[] drawableArray = this.g;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (drawableArray[i2] == null || !DrawableCompat.canApplyTheme((Drawable)drawableArray[i2])) continue;
                DrawableCompat.applyTheme((Drawable)drawableArray[i2], (Resources.Theme)theme);
                this.e |= drawableArray[i2].getChangingConfigurations();
            }
            this.k(theme.getResources());
        }
    }

    public final boolean c() {
        if (this.u) {
            return this.v;
        }
        this.e();
        this.u = true;
        int n2 = this.h;
        Drawable[] drawableArray = this.g;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (drawableArray[i2].getConstantState() != null) continue;
            this.v = false;
            return false;
        }
        this.v = true;
        return true;
    }

    public final boolean canApplyTheme() {
        int n2 = this.h;
        Drawable[] drawableArray = this.g;
        for (int i2 = 0; i2 < n2; ++i2) {
            Drawable drawable = drawableArray[i2];
            if (!(drawable != null ? DrawableCompat.canApplyTheme((Drawable)drawable) : (drawable = (Drawable.ConstantState)this.f.get(i2)) != null && drawable.canApplyTheme())) continue;
            return true;
        }
        return false;
    }

    protected final void d() {
        this.m = true;
        this.e();
        int n2 = this.h;
        Drawable[] drawableArray = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Drawable drawable = drawableArray[i2];
            int n3 = drawable.getIntrinsicWidth();
            if (n3 > this.n) {
                this.n = n3;
            }
            if ((n3 = drawable.getIntrinsicHeight()) > this.o) {
                this.o = n3;
            }
            if ((n3 = drawable.getMinimumWidth()) > this.p) {
                this.p = n3;
            }
            if ((n3 = drawable.getMinimumHeight()) <= this.q) continue;
            this.q = n3;
        }
    }

    public final Drawable f(int n2) {
        int n3;
        Drawable drawable = this.g[n2];
        if (drawable != null) {
            return drawable;
        }
        drawable = this.f;
        if (drawable != null && (n3 = drawable.indexOfKey(n2)) >= 0) {
            this.g[n2] = drawable = this.j(((Drawable.ConstantState)this.f.valueAt(n3)).newDrawable(this.b));
            this.f.removeAt(n3);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return drawable;
        }
        return null;
    }

    public final Rect g() {
        boolean bl = this.i;
        Rect rect = null;
        if (bl) {
            return null;
        }
        Rect rect2 = this.k;
        if (rect2 == null && !this.j) {
            this.e();
            Rect rect3 = new Rect();
            int n2 = this.h;
            Drawable[] drawableArray = this.g;
            for (int i2 = 0; i2 < n2; ++i2) {
                Rect rect4 = rect;
                if (drawableArray[i2].getPadding(rect3)) {
                    int n3;
                    rect2 = rect;
                    if (rect == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if ((n3 = rect3.left) > rect2.left) {
                        rect2.left = n3;
                    }
                    if ((n3 = rect3.top) > rect2.top) {
                        rect2.top = n3;
                    }
                    if ((n3 = rect3.right) > rect2.right) {
                        rect2.right = n3;
                    }
                    n3 = rect3.bottom;
                    rect4 = rect2;
                    if (n3 > rect2.bottom) {
                        rect2.bottom = n3;
                        rect4 = rect2;
                    }
                }
                rect = rect4;
            }
            this.j = true;
            this.k = rect;
            return rect;
        }
        return rect2;
    }

    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    public final int h() {
        if (this.r) {
            return this.s;
        }
        this.e();
        int n2 = this.h;
        Drawable[] drawableArray = this.g;
        int n3 = n2 > 0 ? drawableArray[0].getOpacity() : -2;
        for (int i2 = 1; i2 < n2; ++i2) {
            n3 = Drawable.resolveOpacity((int)n3, (int)drawableArray[i2].getOpacity());
        }
        this.s = n3;
        this.r = true;
        return n3;
    }

    abstract void i();

    final void k(Resources resources) {
        if (resources != null) {
            int n2;
            this.b = resources;
            int n3 = com.github.catvod.spider.merge.j.k.m;
            n3 = n2 = resources.getDisplayMetrics().densityDpi;
            if (n2 == 0) {
                n3 = 160;
            }
            n2 = this.c;
            this.c = n3;
            if (n2 != n3) {
                this.m = false;
                this.j = false;
            }
        }
    }
}

