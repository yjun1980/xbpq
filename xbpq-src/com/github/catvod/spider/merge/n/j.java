/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.core.view.ViewCompat
 *  androidx.core.widget.ImageViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.i.b;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.J;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.g;
import com.github.catvod.spider.merge.n.v;

public final class j {
    private final ImageView a;
    private J b;
    private J c;

    public j(ImageView imageView) {
        this.a = imageView;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            v.b(drawable);
        }
        if (drawable != null) {
            Object object;
            Object object2;
            int n2 = Build.VERSION.SDK_INT;
            int n3 = 1;
            if ((n2 = n2 <= 21 && n2 == 21 ? 1 : 0) != 0) {
                if (this.c == null) {
                    this.c = new J();
                }
                object2 = this.c;
                ((J)object2).a = null;
                ((J)object2).d = false;
                ((J)object2).b = null;
                ((J)object2).c = false;
                object = ImageViewCompat.getImageTintList((ImageView)this.a);
                if (object != null) {
                    ((J)object2).d = true;
                    ((J)object2).a = object;
                }
                if ((object = ImageViewCompat.getImageTintMode((ImageView)this.a)) != null) {
                    ((J)object2).c = true;
                    ((J)object2).b = object;
                }
                if (!((J)object2).d && !((J)object2).c) {
                    n2 = 0;
                } else {
                    object = this.a.getDrawableState();
                    n2 = g.d;
                    G.n(drawable, (J)object2, (int[])object);
                    n2 = n3;
                }
                if (n2 != 0) {
                    return;
                }
            }
            if ((object = this.b) != null) {
                object2 = this.a.getDrawableState();
                n2 = g.d;
                G.n(drawable, (J)object, (int[])object2);
            }
        }
    }

    final ColorStateList b() {
        J j2 = this.b;
        j2 = j2 != null ? j2.a : null;
        return j2;
    }

    final PorterDuff.Mode c() {
        J j2 = this.b;
        j2 = j2 != null ? j2.b : null;
        return j2;
    }

    final boolean d() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(int n2) {
        Context context = this.a.getContext();
        int[] nArray = com.github.catvod.spider.merge.g.a.e;
        L l2 = L.s(context, null, nArray, n2, 0);
        context = this.a;
        ViewCompat.saveAttributeDataForStyleable((View)context, (Context)context.getContext(), (int[])nArray, null, (TypedArray)l2.o(), (int)n2, (int)0);
        try {
            void var2_8;
            Context context2 = context = this.a.getDrawable();
            if (context == null) {
                n2 = l2.l(1, -1);
                Context context3 = context;
                if (n2 != -1) {
                    Context context4 = context = com.github.catvod.spider.merge.i.b.b(this.a.getContext(), n2);
                    if (context != null) {
                        this.a.setImageDrawable((Drawable)context);
                        Context context5 = context;
                    }
                }
            }
            if (var2_8 != null) {
                v.b((Drawable)var2_8);
            }
            if (l2.p(2)) {
                ImageViewCompat.setImageTintList((ImageView)this.a, (ColorStateList)l2.c(2));
            }
            if (!l2.p(3)) return;
            ImageViewCompat.setImageTintMode((ImageView)this.a, (PorterDuff.Mode)v.c(l2.i(3, -1), null));
            return;
        }
        finally {
            l2.t();
        }
    }

    public final void f(int n2) {
        if (n2 != 0) {
            Drawable drawable = com.github.catvod.spider.merge.i.b.b(this.a.getContext(), n2);
            if (drawable != null) {
                v.b(drawable);
            }
            this.a.setImageDrawable(drawable);
        } else {
            this.a.setImageDrawable(null);
        }
        this.a();
    }

    final void g(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new J();
        }
        J j2 = this.b;
        j2.a = colorStateList;
        j2.d = true;
        this.a();
    }

    final void h(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new J();
        }
        J j2 = this.b;
        j2.b = mode;
        j2.c = true;
        this.a();
    }
}

