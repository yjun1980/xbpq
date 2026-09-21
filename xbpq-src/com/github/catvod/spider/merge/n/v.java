/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.DrawableContainer$DrawableContainerState
 *  android.graphics.drawable.ScaleDrawable
 *  android.os.Build$VERSION
 *  androidx.core.graphics.drawable.WrappedDrawable
 */
package com.github.catvod.spider.merge.n;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.WrappedDrawable;
import com.github.catvod.spider.merge.j.l;

@SuppressLint(value={"RestrictedAPI"})
public final class v {
    private static final int[] a = new int[]{0x10100A0};
    private static final int[] b = new int[0];

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }

    public static boolean a(Drawable drawable) {
        block7: {
            block9: {
                block10: {
                    block8: {
                        block6: {
                            if (!(drawable instanceof DrawableContainer)) break block6;
                            if ((drawable = drawable.getConstantState()) instanceof DrawableContainer.DrawableContainerState) {
                                drawable = ((DrawableContainer.DrawableContainerState)drawable).getChildren();
                                int n2 = ((Drawable)drawable).length;
                                for (int i2 = 0; i2 < n2; ++i2) {
                                    if (v.a(drawable[i2])) continue;
                                    return false;
                                }
                            }
                            break block7;
                        }
                        if (!(drawable instanceof WrappedDrawable)) break block8;
                        drawable = ((WrappedDrawable)drawable).getWrappedDrawable();
                        break block9;
                    }
                    if (!(drawable instanceof l)) break block10;
                    drawable = ((l)drawable).a();
                    break block9;
                }
                if (!(drawable instanceof ScaleDrawable)) break block7;
                drawable = ((ScaleDrawable)drawable).getDrawable();
            }
            return v.a(drawable);
        }
        return true;
    }

    static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] nArray = drawable.getState();
            if (nArray != null && nArray.length != 0) {
                drawable.setState(b);
            } else {
                drawable.setState(a);
            }
            drawable.setState(nArray);
        }
    }

    public static PorterDuff.Mode c(int n2, PorterDuff.Mode mode) {
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 9) {
                    switch (n2) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

