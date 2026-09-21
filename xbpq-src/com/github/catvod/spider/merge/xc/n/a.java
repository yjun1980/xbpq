/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Outline
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.RippleDrawable
 *  android.text.TextPaint
 *  android.util.Range
 *  android.util.Size
 *  android.util.SizeF
 *  android.view.WindowInsets
 */
package com.github.catvod.spider.merge.xc.n;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.WindowInsets;

public abstract class a {
    public static /* bridge */ /* synthetic */ boolean A(Object object) {
        return object instanceof Size;
    }

    public static /* bridge */ /* synthetic */ int B(WindowInsets windowInsets) {
        return windowInsets.getStableInsetRight();
    }

    public static /* bridge */ /* synthetic */ boolean C(Object object) {
        return object instanceof SizeF;
    }

    public static /* bridge */ /* synthetic */ int D(WindowInsets windowInsets) {
        return windowInsets.getStableInsetBottom();
    }

    public static /* bridge */ /* synthetic */ float a(TextPaint textPaint) {
        return textPaint.getLetterSpacing();
    }

    public static /* bridge */ /* synthetic */ float b(SizeF sizeF) {
        return sizeF.getHeight();
    }

    public static /* bridge */ /* synthetic */ int c(Size size) {
        return size.getHeight();
    }

    public static /* bridge */ /* synthetic */ int d(WindowInsets windowInsets) {
        return windowInsets.getStableInsetLeft();
    }

    public static /* bridge */ /* synthetic */ Rect e(Drawable drawable) {
        return drawable.getDirtyBounds();
    }

    public static /* bridge */ /* synthetic */ Range f(Range range, Range range2) {
        return range.extend(range2);
    }

    public static /* bridge */ /* synthetic */ Range g(Range range, Comparable comparable) {
        return range.extend(comparable);
    }

    public static /* bridge */ /* synthetic */ Size h(Object object) {
        return (Size)object;
    }

    public static /* bridge */ /* synthetic */ SizeF i(Object object) {
        return (SizeF)object;
    }

    public static /* bridge */ /* synthetic */ WindowInsets j(WindowInsets windowInsets) {
        return windowInsets.consumeStableInsets();
    }

    public static /* bridge */ /* synthetic */ Comparable k(Range range) {
        return range.getUpper();
    }

    public static /* bridge */ /* synthetic */ String l(TextPaint textPaint) {
        return textPaint.getFontFeatureSettings();
    }

    public static /* bridge */ /* synthetic */ void m(Drawable drawable, float f2, float f4) {
        drawable.setHotspot(f2, f4);
    }

    public static /* bridge */ /* synthetic */ void n(Drawable drawable, int n2) {
        drawable.setTint(n2);
    }

    public static /* bridge */ /* synthetic */ void o(Drawable drawable, int n2, int n3, int n4, int n5) {
        drawable.setHotspotBounds(n2, n3, n4, n5);
    }

    public static /* bridge */ /* synthetic */ void p(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static /* bridge */ /* synthetic */ void q(Drawable drawable, Outline outline) {
        drawable.getOutline(outline);
    }

    public static /* bridge */ /* synthetic */ void r(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static /* bridge */ /* synthetic */ boolean s(TextPaint textPaint) {
        return textPaint.isElegantTextHeight();
    }

    public static /* bridge */ /* synthetic */ boolean t(WindowInsets windowInsets) {
        return windowInsets.isConsumed();
    }

    public static /* bridge */ /* synthetic */ boolean u(Object object) {
        return object instanceof RippleDrawable;
    }

    public static /* bridge */ /* synthetic */ float v(SizeF sizeF) {
        return sizeF.getWidth();
    }

    public static /* bridge */ /* synthetic */ int w(Size size) {
        return size.getWidth();
    }

    public static /* bridge */ /* synthetic */ int x(WindowInsets windowInsets) {
        return windowInsets.getStableInsetTop();
    }

    public static /* bridge */ /* synthetic */ Range y(Range range, Range range2) {
        return range.intersect(range2);
    }

    public static /* bridge */ /* synthetic */ Comparable z(Range range) {
        return range.getLower();
    }
}

