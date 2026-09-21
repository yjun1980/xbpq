/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  androidx.core.graphics.ColorUtils
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.ColorUtils;
import com.github.catvod.spider.merge.i.b;
import com.github.catvod.spider.merge.n.E;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.H;
import com.github.catvod.spider.merge.n.g;
import com.github.catvod.spider.merge.n.v;

final class f
implements E {
    private final int[] a = new int[]{2131165260, 2131165258, 0x7F070000};
    private final int[] b = new int[]{2131165208, 2131165243, 2131165215, 2131165210, 2131165211, 2131165214, 2131165213};
    private final int[] c = new int[]{2131165257, 2131165259, 2131165201, 2131165253, 2131165254, 2131165255, 2131165256};
    private final int[] d = new int[]{2131165233, 0x7F07000F, 2131165232};
    private final int[] e = new int[]{2131165251, 2131165261};
    private final int[] f = new int[]{2131165187, 2131165193, 2131165188, 2131165194};

    f() {
    }

    private boolean a(int[] nArray, int n2) {
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (nArray[i2] != n2) continue;
            return true;
        }
        return false;
    }

    private ColorStateList b(Context object, int n2) {
        int n3 = H.c(object, 2130903159);
        int n4 = H.b(object, 2130903157);
        object = H.b;
        int[] nArray = H.d;
        int n5 = ColorUtils.compositeColors((int)n3, (int)n2);
        int[] nArray2 = H.c;
        n3 = ColorUtils.compositeColors((int)n3, (int)n2);
        return new ColorStateList((int[][])new int[][]{(int[])object, nArray, nArray2, H.f}, new int[]{n4, n5, n3, n2});
    }

    private LayerDrawable d(G g2, Context context, int n2) {
        n2 = context.getResources().getDimensionPixelSize(n2);
        Drawable drawable = g2.f(context, 2131165247);
        Drawable drawable2 = g2.f(context, 2131165248);
        if (drawable instanceof BitmapDrawable && drawable.getIntrinsicWidth() == n2 && drawable.getIntrinsicHeight() == n2) {
            g2 = (BitmapDrawable)drawable;
            context = new BitmapDrawable(g2.getBitmap());
        } else {
            context = Bitmap.createBitmap((int)n2, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            g2 = new Canvas((Bitmap)context);
            drawable.setBounds(0, 0, n2, n2);
            drawable.draw((Canvas)g2);
            g2 = new BitmapDrawable((Bitmap)context);
            context = new BitmapDrawable((Bitmap)context);
        }
        context.setTileModeX(Shader.TileMode.REPEAT);
        if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == n2 && drawable2.getIntrinsicHeight() == n2) {
            drawable2 = (BitmapDrawable)drawable2;
        } else {
            drawable = Bitmap.createBitmap((int)n2, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas((Bitmap)drawable);
            drawable2.setBounds(0, 0, n2, n2);
            drawable2.draw(canvas);
            drawable2 = new BitmapDrawable((Bitmap)drawable);
        }
        g2 = new LayerDrawable(new Drawable[]{g2, drawable2, context});
        g2.setId(0, 0x1020000);
        g2.setId(1, 16908303);
        g2.setId(2, 16908301);
        return g2;
    }

    private void f(Drawable drawable, int n2, PorterDuff.Mode mode) {
        Drawable drawable2 = drawable;
        if (v.a(drawable)) {
            drawable2 = drawable.mutate();
        }
        drawable = mode;
        if (mode == null) {
            drawable = g.a();
        }
        synchronized (g.class) {
            drawable = G.h(n2, (PorterDuff.Mode)drawable);
            drawable2.setColorFilter((ColorFilter)drawable);
            return;
        }
    }

    public final Drawable c(G g2, Context context, int n2) {
        block7: {
            block5: {
                block6: {
                    block4: {
                        if (n2 == 2131165200) {
                            return new LayerDrawable(new Drawable[]{g2.f(context, 0x7F07000F), g2.f(context, 2131165201)});
                        }
                        if (n2 != 2131165235) break block4;
                        n2 = 2131099707;
                        break block5;
                    }
                    if (n2 != 2131165234) break block6;
                    n2 = 2131099708;
                    break block5;
                }
                if (n2 != 2131165236) break block7;
                n2 = 2131099709;
            }
            return this.d(g2, context, n2);
        }
        return null;
    }

    public final ColorStateList e(Context context, int n2) {
        if (n2 == 2131165204) {
            return com.github.catvod.spider.merge.i.b.a(context, 2131034133);
        }
        if (n2 == 2131165250) {
            return com.github.catvod.spider.merge.i.b.a(context, 2131034136);
        }
        if (n2 == 2131165249) {
            int[][] nArrayArray = new int[3][];
            int[] nArray = new int[3];
            ColorStateList colorStateList = H.d(context, 2130903164);
            if (colorStateList != null && colorStateList.isStateful()) {
                nArrayArray[0] = H.b;
                nArray[0] = colorStateList.getColorForState(nArrayArray[0], 0);
                nArrayArray[1] = H.e;
                nArray[1] = H.c(context, 2130903158);
                nArrayArray[2] = H.f;
                nArray[2] = colorStateList.getDefaultColor();
            } else {
                nArrayArray[0] = H.b;
                nArray[0] = H.b(context, 2130903164);
                nArrayArray[1] = H.e;
                nArray[1] = H.c(context, 2130903158);
                nArrayArray[2] = H.f;
                nArray[2] = H.c(context, 2130903164);
            }
            return new ColorStateList((int[][])nArrayArray, nArray);
        }
        if (n2 == 2131165192) {
            return this.b(context, H.c(context, 2130903157));
        }
        if (n2 == 2131165186) {
            return this.b(context, 0);
        }
        if (n2 == 0x7F070007) {
            return this.b(context, H.c(context, 2130903155));
        }
        if (n2 != 2131165245 && n2 != 2131165246) {
            if (this.a(this.b, n2)) {
                return H.d(context, 2130903160);
            }
            if (this.a(this.e, n2)) {
                return com.github.catvod.spider.merge.i.b.a(context, 2131034132);
            }
            if (this.a(this.f, n2)) {
                return com.github.catvod.spider.merge.i.b.a(context, 2131034131);
            }
            if (n2 == 2131165242) {
                return com.github.catvod.spider.merge.i.b.a(context, 2131034134);
            }
            return null;
        }
        return com.github.catvod.spider.merge.i.b.a(context, 2131034135);
    }

    public final boolean g(Context context, int n2, Drawable drawable) {
        Drawable drawable2;
        if (n2 == 2131165244) {
            drawable = (LayerDrawable)drawable;
            this.f(drawable.findDrawableByLayerId(0x1020000), H.c(context, 2130903160), g.a());
            drawable2 = drawable.findDrawableByLayerId(16908303);
            n2 = H.c(context, 2130903160);
        } else {
            if (n2 != 2131165235 && n2 != 2131165234 && n2 != 2131165236) {
                return false;
            }
            drawable = (LayerDrawable)drawable;
            this.f(drawable.findDrawableByLayerId(0x1020000), H.b(context, 2130903160), g.a());
            drawable2 = drawable.findDrawableByLayerId(16908303);
            n2 = H.c(context, 2130903158);
        }
        this.f(drawable2, n2, g.a());
        this.f(drawable.findDrawableByLayerId(16908301), H.c(context, 2130903158), g.a());
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean h(Context var1_1, int var2_3, Drawable var3_4) {
        block12: {
            block11: {
                block10: {
                    block9: {
                        var7_5 = g.a();
                        var6_6 = this.a(this.a, var2_3);
                        var4_7 = 0x1010031;
                        if (!var6_6) break block9;
                        var2_3 = 2130903160;
                        ** GOTO lbl24
                    }
                    if (!this.a(this.c, var2_3)) break block10;
                    var2_3 = 2130903158;
                    ** GOTO lbl24
                }
                if (!this.a(this.d, var2_3)) break block11;
                var7_5 = PorterDuff.Mode.MULTIPLY;
                var2_3 = var4_7;
                ** GOTO lbl24
            }
            if (var2_3 != 2131165221) break block12;
            var2_3 = 0x1010030;
            var4_7 = Math.round(40.8f);
            ** GOTO lbl25
        }
        if (var2_3 == 2131165203) {
            var2_3 = var4_7;
lbl24:
            // 4 sources

            var4_7 = -1;
lbl25:
            // 2 sources

            var5_8 = true;
        } else {
            var2_3 = 0;
            var4_7 = -1;
            var5_8 = false;
        }
        if (var5_8) {
            var8_9 = var3_4;
            if (v.a(var3_4)) {
                var8_9 = var3_4.mutate();
            }
            var2_3 = H.c(var1_1, var2_3);
            synchronized (g.class) {
                block8: {
                    var1_1 = G.h(var2_3, var7_5);
                    var8_9.setColorFilter((ColorFilter)var1_1);
                    if (var4_7 == -1) break block8;
                    var8_9.setAlpha(var4_7);
                }
                return true;
                finally {
                }
            }
        }
        return false;
    }
}

