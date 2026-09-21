/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.view.View
 *  android.widget.ImageView
 *  androidx.core.view.TintableBackgroundView
 *  androidx.core.widget.TintableImageSourceView
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.n.I;
import com.github.catvod.spider.merge.n.e;
import com.github.catvod.spider.merge.n.j;

public class k
extends ImageView
implements TintableBackgroundView,
TintableImageSourceView {
    private final e a;
    private final j b;

    public k(Context object, int n2) {
        I.a((Context)object);
        super((Context)object, null, n2);
        H.a((View)this, this.getContext());
        object = new e((View)this);
        this.a = object;
        ((e)object).d(null, n2);
        this.b = object = new j(this);
        ((j)object).e(n2);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((e)object).a();
        }
        if ((object = this.b) != null) {
            ((j)object).a();
        }
    }

    public final ColorStateList getSupportBackgroundTintList() {
        e e2 = this.a;
        e2 = e2 != null ? e2.b() : null;
        return e2;
    }

    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        e e2 = this.a;
        e2 = e2 != null ? e2.c() : null;
        return e2;
    }

    public final ColorStateList getSupportImageTintList() {
        j j2 = this.b;
        j2 = j2 != null ? j2.b() : null;
        return j2;
    }

    public final PorterDuff.Mode getSupportImageTintMode() {
        j j2 = this.b;
        j2 = j2 != null ? j2.c() : null;
        return j2;
    }

    public final boolean hasOverlappingRendering() {
        boolean bl = this.b.d() && super.hasOverlappingRendering();
        return bl;
    }

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((e)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        e e2 = this.a;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public final void setImageBitmap(Bitmap object) {
        super.setImageBitmap((Bitmap)object);
        object = this.b;
        if (object != null) {
            ((j)object).a();
        }
    }

    public final void setImageDrawable(Drawable object) {
        super.setImageDrawable((Drawable)object);
        object = this.b;
        if (object != null) {
            ((j)object).a();
        }
    }

    public final void setImageResource(int n2) {
        j j2 = this.b;
        if (j2 != null) {
            j2.f(n2);
        }
    }

    public final void setImageURI(Uri object) {
        super.setImageURI((Uri)object);
        object = this.b;
        if (object != null) {
            ((j)object).a();
        }
    }

    public final void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e e2 = this.a;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public final void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e e2 = this.a;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public final void setSupportImageTintList(ColorStateList colorStateList) {
        j j2 = this.b;
        if (j2 != null) {
            j2.g(colorStateList);
        }
    }

    public final void setSupportImageTintMode(PorterDuff.Mode mode) {
        j j2 = this.b;
        if (j2 != null) {
            j2.h(mode);
        }
    }
}

