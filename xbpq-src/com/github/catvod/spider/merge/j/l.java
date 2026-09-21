/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  androidx.core.graphics.drawable.DrawableCompat
 */
package com.github.catvod.spider.merge.j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

public class l
extends Drawable
implements Drawable.Callback {
    private Drawable a;

    public l(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public final Drawable a() {
        return this.a;
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public final int[] getState() {
        return this.a.getState();
    }

    public final Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored((Drawable)this.a);
    }

    public final boolean isStateful() {
        return this.a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.a.jumpToCurrentState();
    }

    protected final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    protected final boolean onLevelChange(int n2) {
        return this.a.setLevel(n2);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public final void setAlpha(int n2) {
        this.a.setAlpha(n2);
    }

    public final void setAutoMirrored(boolean bl) {
        DrawableCompat.setAutoMirrored((Drawable)this.a, (boolean)bl);
    }

    public final void setChangingConfigurations(int n2) {
        this.a.setChangingConfigurations(n2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean bl) {
        this.a.setDither(bl);
    }

    public final void setFilterBitmap(boolean bl) {
        this.a.setFilterBitmap(bl);
    }

    public void setHotspot(float f2, float f4) {
        DrawableCompat.setHotspot((Drawable)this.a, (float)f2, (float)f4);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        DrawableCompat.setHotspotBounds((Drawable)this.a, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public boolean setState(int[] nArray) {
        return this.a.setState(nArray);
    }

    public final void setTint(int n2) {
        DrawableCompat.setTint((Drawable)this.a, (int)n2);
    }

    public final void setTintList(ColorStateList colorStateList) {
        DrawableCompat.setTintList((Drawable)this.a, (ColorStateList)colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        DrawableCompat.setTintMode((Drawable)this.a, (PorterDuff.Mode)mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        bl = super.setVisible(bl, bl2) || this.a.setVisible(bl, bl2);
        return bl;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

