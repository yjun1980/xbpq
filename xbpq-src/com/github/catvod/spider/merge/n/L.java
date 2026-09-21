/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  androidx.core.content.res.ResourcesCompat
 *  androidx.core.content.res.ResourcesCompat$FontCallback
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import com.github.catvod.spider.merge.i.b;

public final class L {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private L(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static L q(Context context, int n2, int[] nArray) {
        return new L(context, context.obtainStyledAttributes(n2, nArray));
    }

    public static L r(Context context, AttributeSet attributeSet, int[] nArray) {
        return new L(context, context.obtainStyledAttributes(attributeSet, nArray));
    }

    public static L s(Context context, AttributeSet attributeSet, int[] nArray, int n2, int n3) {
        return new L(context, context.obtainStyledAttributes(attributeSet, nArray, n2, n3));
    }

    public final boolean a(int n2, boolean bl) {
        return this.b.getBoolean(n2, bl);
    }

    public final int b() {
        return this.b.getColor(0, 0);
    }

    public final ColorStateList c(int n2) {
        ColorStateList colorStateList;
        int n3;
        if (this.b.hasValue(n2) && (n3 = this.b.getResourceId(n2, 0)) != 0 && (colorStateList = com.github.catvod.spider.merge.i.b.a(this.a, n3)) != null) {
            return colorStateList;
        }
        return this.b.getColorStateList(n2);
    }

    public final int d(int n2, int n3) {
        return this.b.getDimensionPixelOffset(n2, n3);
    }

    public final int e(int n2, int n3) {
        return this.b.getDimensionPixelSize(n2, n3);
    }

    public final Drawable f(int n2) {
        int n3;
        if (this.b.hasValue(n2) && (n3 = this.b.getResourceId(n2, 0)) != 0) {
            return com.github.catvod.spider.merge.i.b.b(this.a, n3);
        }
        return this.b.getDrawable(n2);
    }

    public final float g() {
        return this.b.getFloat(4, -1.0f);
    }

    public final Typeface h(int n2, int n3, ResourcesCompat.FontCallback fontCallback) {
        if ((n2 = this.b.getResourceId(n2, 0)) == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return ResourcesCompat.getFont((Context)this.a, (int)n2, (TypedValue)this.c, (int)n3, (ResourcesCompat.FontCallback)fontCallback);
    }

    public final int i(int n2, int n3) {
        return this.b.getInt(n2, n3);
    }

    public final int j(int n2, int n3) {
        return this.b.getInteger(n2, n3);
    }

    public final int k(int n2) {
        return this.b.getLayoutDimension(n2, 0);
    }

    public final int l(int n2, int n3) {
        return this.b.getResourceId(n2, n3);
    }

    public final String m(int n2) {
        return this.b.getString(n2);
    }

    public final CharSequence n(int n2) {
        return this.b.getText(n2);
    }

    public final TypedArray o() {
        return this.b;
    }

    public final boolean p(int n2) {
        return this.b.hasValue(n2);
    }

    public final void t() {
        this.b.recycle();
    }
}

