/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  androidx.core.graphics.drawable.DrawableCompat
 */
package com.github.catvod.spider.merge.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.catvod.spider.merge.j.h;
import com.github.catvod.spider.merge.j.i;
import com.github.catvod.spider.merge.j.j;

class k
extends Drawable
implements Drawable.Callback {
    public static final int m = 0;
    private j a;
    private Rect b;
    private Drawable c;
    private Drawable d;
    private int e = 255;
    private boolean f;
    private int g = -1;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private i l;

    k() {
    }

    private void d(Drawable drawable) {
        block11: {
            if (this.l == null) {
                this.l = new i();
            }
            Object object = this.l;
            object.b(drawable.getCallback());
            drawable.setCallback((Drawable.Callback)object);
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            object = this.a;
            if (((j)((Object)object)).C) {
                drawable.setColorFilter(((j)((Object)object)).B);
            } else {
                if (((j)((Object)object)).F) {
                    DrawableCompat.setTintList((Drawable)drawable, (ColorStateList)((j)((Object)object)).D);
                }
                object = this.a;
                if (((j)((Object)object)).G) {
                    DrawableCompat.setTintMode((Drawable)drawable, (PorterDuff.Mode)((j)((Object)object)).E);
                }
            }
            drawable.setVisible(this.isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(this.getState());
            drawable.setLevel(this.getLevel());
            drawable.setBounds(this.getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.setLayoutDirection((Drawable)drawable, (int)DrawableCompat.getLayoutDirection((Drawable)this));
            }
            DrawableCompat.setAutoMirrored((Drawable)drawable, (boolean)this.a.A);
            object = this.b;
            if (object == null) break block11;
            DrawableCompat.setHotspotBounds((Drawable)drawable, (int)((Rect)object).left, (int)((Rect)object).top, (int)((Rect)object).right, (int)((Rect)object).bottom);
        }
        return;
        finally {
            drawable.setCallback(this.l.a());
        }
    }

    /*
     * Exception decompiling
     */
    final void a(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void applyTheme(Resources.Theme theme) {
        this.a.b(theme);
    }

    j b() {
        throw null;
    }

    final int c() {
        return this.g;
    }

    public boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if ((drawable = this.d) != null) {
            drawable.draw(canvas);
        }
    }

    /*
     * Unable to fully structure code
     */
    final boolean e(int var1_1) {
        if (var1_1 == this.g) {
            return false;
        }
        var2_2 = SystemClock.uptimeMillis();
        if (this.a.z > 0) {
            var4_3 = this.d;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
            if ((var4_3 = this.c) != null) {
                this.d = var4_3;
                this.k = (long)this.a.z + var2_2;
            } else {
                this.d = null;
                this.k = 0L;
            }
        } else {
            var4_3 = this.c;
            if (var4_3 != null) {
                var4_3.setVisible(false, false);
            }
        }
        if (var1_1 < 0) ** GOTO lbl-1000
        var4_3 = this.a;
        if (var1_1 < var4_3.h) {
            var4_3 = var4_3.f(var1_1);
            this.c = var4_3;
            this.g = var1_1;
            if (var4_3 != null) {
                var1_1 = this.a.y;
                if (var1_1 > 0) {
                    this.j = var2_2 + (long)var1_1;
                }
                this.d((Drawable)var4_3);
            }
        } else lbl-1000:
        // 2 sources

        {
            this.c = null;
            this.g = -1;
        }
        if (this.j != 0L || this.k != 0L) {
            var4_3 = this.i;
            if (var4_3 == null) {
                this.i = new h(this);
            } else {
                this.unscheduleSelf((Runnable)var4_3);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    void f(j j2) {
        this.a = j2;
        int n2 = this.g;
        if (n2 >= 0) {
            j2 = j2.f(n2);
            this.c = j2;
            if (j2 != null) {
                this.d((Drawable)j2);
            }
        }
        this.d = null;
    }

    final void g(Resources resources) {
        this.a.k(resources);
    }

    public int getAlpha() {
        return this.e;
    }

    public int getChangingConfigurations() {
        int n2 = super.getChangingConfigurations();
        j j2 = this.a;
        int n3 = j2.d;
        return n2 | (j2.e | n3);
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.a.c()) {
            this.a.d = this.getChangingConfigurations();
            return this.a;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        j j2 = this.a;
        if (j2.l) {
            if (!j2.m) {
                j2.d();
            }
            return j2.o;
        }
        j2 = this.c;
        int n2 = j2 != null ? j2.getIntrinsicHeight() : -1;
        return n2;
    }

    public int getIntrinsicWidth() {
        j j2 = this.a;
        if (j2.l) {
            if (!j2.m) {
                j2.d();
            }
            return j2.n;
        }
        j2 = this.c;
        int n2 = j2 != null ? j2.getIntrinsicWidth() : -1;
        return n2;
    }

    public int getMinimumHeight() {
        j j2 = this.a;
        if (j2.l) {
            if (!j2.m) {
                j2.d();
            }
            return j2.q;
        }
        j2 = this.c;
        int n2 = j2 != null ? j2.getMinimumHeight() : 0;
        return n2;
    }

    public int getMinimumWidth() {
        j j2 = this.a;
        if (j2.l) {
            if (!j2.m) {
                j2.d();
            }
            return j2.p;
        }
        j2 = this.c;
        int n2 = j2 != null ? j2.getMinimumWidth() : 0;
        return n2;
    }

    public int getOpacity() {
        Drawable drawable = this.c;
        int n2 = drawable != null && drawable.isVisible() ? this.a.h() : -2;
        return n2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean bl;
        Rect rect2 = this.a.g();
        int n2 = 1;
        if (rect2 != null) {
            rect.set(rect2);
            int n3 = rect2.left;
            int n4 = rect2.top;
            int n5 = rect2.bottom;
            bl = (rect2.right | (n3 | n4 | n5)) != 0;
        } else {
            rect2 = this.c;
            bl = rect2 != null ? rect2.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.isAutoMirrored() || DrawableCompat.getLayoutDirection((Drawable)this) != 1) {
            n2 = 0;
        }
        if (n2 != 0) {
            n2 = rect.left;
            rect.left = rect.right;
            rect.right = n2;
        }
        return bl;
    }

    public void invalidateDrawable(Drawable drawable) {
        j j2 = this.a;
        if (j2 != null) {
            j2.r = false;
            j2.t = false;
        }
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().invalidateDrawable((Drawable)this);
        }
    }

    public boolean isAutoMirrored() {
        return this.a.A;
    }

    public void jumpToCurrentState() {
        boolean bl;
        Drawable drawable = this.d;
        boolean bl2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            bl = true;
        } else {
            bl = false;
        }
        drawable = this.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.k != 0L) {
            this.k = 0L;
            bl = true;
        }
        if (this.j != 0L) {
            this.j = 0L;
            bl = bl2;
        }
        if (bl) {
            this.invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            j j2 = this.b();
            j2.i();
            this.f(j2);
            this.h = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if ((drawable = this.c) != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int n2) {
        j j2 = this.a;
        int n3 = this.g;
        int n4 = j2.h;
        Drawable[] drawableArray = j2.g;
        boolean bl = false;
        for (int i2 = 0; i2 < n4; ++i2) {
            boolean bl2 = bl;
            if (drawableArray[i2] != null) {
                boolean bl3 = Build.VERSION.SDK_INT >= 23 ? DrawableCompat.setLayoutDirection((Drawable)drawableArray[i2], (int)n2) : false;
                bl2 = bl;
                if (i2 == n3) {
                    bl2 = bl3;
                }
            }
            bl = bl2;
        }
        j2.x = n2;
        return bl;
    }

    protected final boolean onLevelChange(int n2) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        drawable = this.c;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return false;
    }

    protected boolean onStateChange(int[] nArray) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        drawable = this.c;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().scheduleDrawable((Drawable)this, runnable, l2);
        }
    }

    public void setAlpha(int n2) {
        if (!this.f || this.e != n2) {
            this.f = true;
            this.e = n2;
            Drawable drawable = this.c;
            if (drawable != null) {
                if (this.j == 0L) {
                    drawable.setAlpha(n2);
                } else {
                    this.a(false);
                }
            }
        }
    }

    public void setAutoMirrored(boolean bl) {
        j j2 = this.a;
        if (j2.A != bl) {
            j2.A = bl;
            j2 = this.c;
            if (j2 != null) {
                DrawableCompat.setAutoMirrored((Drawable)j2, (boolean)bl);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        j j2 = this.a;
        j2.C = true;
        if (j2.B != colorFilter) {
            j2.B = colorFilter;
            j2 = this.c;
            if (j2 != null) {
                j2.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean bl) {
        j j2 = this.a;
        if (j2.w != bl) {
            j2.w = bl;
            j2 = this.c;
            if (j2 != null) {
                j2.setDither(bl);
            }
        }
    }

    public void setHotspot(float f2, float f4) {
        Drawable drawable = this.c;
        if (drawable != null) {
            DrawableCompat.setHotspot((Drawable)drawable, (float)f2, (float)f4);
        }
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(n2, n3, n4, n5);
        } else {
            rect.set(n2, n3, n4, n5);
        }
        rect = this.c;
        if (rect != null) {
            DrawableCompat.setHotspotBounds((Drawable)rect, (int)n2, (int)n3, (int)n4, (int)n5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        j j2 = this.a;
        j2.F = true;
        if (j2.D != colorStateList) {
            j2.D = colorStateList;
            DrawableCompat.setTintList((Drawable)this.c, (ColorStateList)colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        j j2 = this.a;
        j2.G = true;
        if (j2.E != mode) {
            j2.E = mode;
            DrawableCompat.setTintMode((Drawable)this.c, (PorterDuff.Mode)mode);
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = super.setVisible(bl, bl2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(bl, bl2);
        }
        if ((drawable = this.c) != null) {
            drawable.setVisible(bl, bl2);
        }
        return bl3;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.c && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable((Drawable)this, runnable);
        }
    }
}

