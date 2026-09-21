/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  androidx.core.view.GravityCompat
 *  androidx.core.view.ViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.P;
import com.github.catvod.spider.merge.n.w;

public class x
extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public x(Context context) {
        this(context, null);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public x(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        boolean bl;
        int n3;
        boolean bl2 = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 0x800033;
        int[] nArray = com.github.catvod.spider.merge.g.a.j;
        L l2 = L.s(context, attributeSet, nArray, n2, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this, (Context)context, (int[])nArray, (AttributeSet)attributeSet, (TypedArray)l2.o(), (int)n2, (int)0);
        n2 = l2.i(1, -1);
        if (n2 >= 0 && this.d != n2) {
            this.d = n2;
            this.requestLayout();
        }
        if ((n3 = l2.i(0, -1)) >= 0 && this.e != n3) {
            n2 = n3;
            if ((0x800007 & n3) == 0) {
                n2 = n3 | 0x800003;
            }
            n3 = n2;
            if ((n2 & 0x70) == 0) {
                n3 = n2 | 0x30;
            }
            this.e = n3;
            this.requestLayout();
        }
        if (!(bl = l2.a(2, true))) {
            this.a = bl;
        }
        this.g = l2.g();
        this.b = l2.i(3, -1);
        this.h = l2.a(7, false);
        context = l2.f(5);
        if (context != this.k) {
            this.k = context;
            if (context != null) {
                this.l = context.getIntrinsicWidth();
                this.m = context.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (context != null) {
                bl2 = false;
            }
            this.setWillNotDraw(bl2);
            this.requestLayout();
        }
        this.n = l2.i(8, 0);
        this.o = l2.e(6, 0);
        l2.t();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w;
    }

    final void d(Canvas canvas, int n2) {
        this.k.setBounds(this.getPaddingLeft() + this.o, n2, this.getWidth() - this.getPaddingRight() - this.o, this.m + n2);
        this.k.draw(canvas);
    }

    final void e(Canvas canvas, int n2) {
        this.k.setBounds(n2, this.getPaddingTop() + this.o, this.l + n2, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas);
    }

    protected w f() {
        int n2 = this.d;
        if (n2 == 0) {
            return new w(-2);
        }
        if (n2 == 1) {
            return new w(-1);
        }
        return null;
    }

    public w g(AttributeSet attributeSet) {
        return new w(this.getContext(), attributeSet);
    }

    public final int getBaseline() {
        int n2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int n3 = this.getChildCount();
        if (n3 > (n2 = this.b)) {
            View view = this.getChildAt(n2);
            int n4 = view.getBaseline();
            if (n4 == -1) {
                if (this.b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            n3 = n2 = this.c;
            if (this.d == 1) {
                int n5 = this.e & 0x70;
                n3 = n2;
                if (n5 != 48) {
                    n3 = n5 != 16 ? (n5 != 80 ? n2 : this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f) : n2 + (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                }
            }
            return n3 + ((w)view.getLayoutParams()).topMargin + n4;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    protected w h(ViewGroup.LayoutParams layoutParams) {
        return new w(layoutParams);
    }

    public final Drawable i() {
        return this.k;
    }

    public final int j() {
        return this.l;
    }

    public final int k() {
        return this.e;
    }

    protected final boolean l(int n2) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        if (n2 == 0) {
            if ((this.n & 1) != 0) {
                bl3 = true;
            }
            return bl3;
        }
        if (n2 == this.getChildCount()) {
            bl3 = bl;
            if ((this.n & 4) != 0) {
                bl3 = true;
            }
            return bl3;
        }
        bl3 = bl2;
        if ((this.n & 2) != 0) {
            --n2;
            while (true) {
                bl3 = bl2;
                if (n2 < 0) break;
                if (this.getChildAt(n2).getVisibility() != 8) {
                    bl3 = true;
                    break;
                }
                --n2;
            }
        }
        return bl3;
    }

    public final void m() {
        this.a = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void onDraw(Canvas var1_1) {
        block9: {
            block12: {
                block10: {
                    block11: {
                        block8: {
                            if (this.k == null) {
                                return;
                            }
                            var4_2 = this.d;
                            var3_4 = 0;
                            if (var4_2 != 1) break block8;
                            var4_2 = this.getChildCount();
                            for (var2_3 = var3_4; var2_3 < var4_2; ++var2_3) {
                                var7_7 /* !! */  = this.getChildAt(var2_3);
                                if (var7_7 /* !! */  == null || var7_7 /* !! */ .getVisibility() == 8 || !this.l(var2_3)) continue;
                                var6_5 /* !! */  = (w)var7_7 /* !! */ .getLayoutParams();
                                this.d(var1_1, var7_7 /* !! */ .getTop() - var6_5 /* !! */ .topMargin - this.m);
                            }
                            if (this.l(var4_2)) {
                                var6_5 /* !! */  = this.getChildAt(var4_2 - 1);
                                if (var6_5 /* !! */  == null) {
                                    var2_3 = this.getHeight() - this.getPaddingBottom() - this.m;
                                } else {
                                    var7_7 /* !! */  = (w)var6_5 /* !! */ .getLayoutParams();
                                    var2_3 = var6_5 /* !! */ .getBottom() + var7_7 /* !! */ .bottomMargin;
                                }
                                this.d(var1_1, var2_3);
                            }
                            break block9;
                        }
                        var4_2 = this.getChildCount();
                        var5_9 = P.a((View)this);
                        for (var2_3 = 0; var2_3 < var4_2; ++var2_3) {
                            var6_6 = this.getChildAt(var2_3);
                            if (var6_6 == null || var6_6.getVisibility() == 8 || !this.l(var2_3)) continue;
                            var7_8 = (w)var6_6.getLayoutParams();
                            var3_4 = var5_9 != false ? var6_6.getRight() + var7_8.rightMargin : var6_6.getLeft() - var7_8.leftMargin - this.l;
                            this.e(var1_1, var3_4);
                        }
                        if (!this.l(var4_2)) break block9;
                        var6_6 = this.getChildAt(var4_2 - 1);
                        if (var6_6 != null) break block10;
                        if (!var5_9) break block11;
                        var2_3 = this.getPaddingLeft();
                        break block12;
                    }
                    var2_3 = this.getWidth();
                    var3_4 = this.getPaddingRight();
                    ** GOTO lbl47
                }
                var7_8 = (w)var6_6.getLayoutParams();
                if (var5_9) {
                    var2_3 = var6_6.getLeft();
                    var3_4 = var7_8.leftMargin;
lbl47:
                    // 2 sources

                    var2_3 = var2_3 - var3_4 - this.l;
                } else {
                    var2_3 = var6_6.getRight() + var7_8.rightMargin;
                }
            }
            this.e(var1_1, var2_3);
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.widget.LinearLayoutCompat");
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        block29: {
            int n6;
            int n7;
            block22: {
                if (this.d != 1) break block22;
                int n8 = this.getPaddingLeft();
                int n9 = n4 - n2;
                int n10 = this.getPaddingRight();
                int n11 = this.getPaddingRight();
                int n12 = this.getChildCount();
                int n13 = this.e;
                n4 = n13 & 0x70;
                if (n4 != 16) {
                    n2 = this.getPaddingTop();
                    if (n4 == 80) {
                        n2 = n2 + n5 - n3 - this.f;
                    }
                } else {
                    n2 = this.getPaddingTop() + (n5 - n3 - this.f) / 2;
                }
                n3 = 0;
                while (n3 < n12) {
                    block24: {
                        w w2;
                        int n14;
                        int n15;
                        View view;
                        block27: {
                            block28: {
                                block25: {
                                    block26: {
                                        block23: {
                                            view = this.getChildAt(n3);
                                            if (view != null) break block23;
                                            n4 = n2 + 0;
                                            n5 = n3;
                                            break block24;
                                        }
                                        n4 = n2;
                                        n5 = n3;
                                        if (view.getVisibility() == 8) break block24;
                                        n15 = view.getMeasuredWidth();
                                        n14 = view.getMeasuredHeight();
                                        w2 = (w)view.getLayoutParams();
                                        n4 = n5 = w2.gravity;
                                        if (n5 < 0) {
                                            n4 = 0x800007 & n13;
                                        }
                                        if ((n4 = GravityCompat.getAbsoluteGravity((int)n4, (int)ViewCompat.getLayoutDirection((View)this)) & 7) == 1) break block25;
                                        if (n4 == 5) break block26;
                                        n4 = w2.leftMargin + n8;
                                        break block27;
                                    }
                                    n4 = n9 - n10 - n15;
                                    break block28;
                                }
                                n4 = (n9 - n8 - n11 - n15) / 2 + n8 + w2.leftMargin;
                            }
                            n4 -= w2.rightMargin;
                        }
                        n5 = n2;
                        if (this.l(n3)) {
                            n5 = n2 + this.m;
                        }
                        n2 = n5 + w2.topMargin;
                        n5 = n2 + 0;
                        view.layout(n4, n5, n15 + n4, n14 + n5);
                        n4 = w2.bottomMargin;
                        n5 = n3 + 0;
                        n4 = n14 + n4 + 0 + n2;
                    }
                    n3 = n5 + 1;
                    n2 = n4;
                }
                break block29;
            }
            boolean bl2 = P.a((View)this);
            int n16 = this.getPaddingTop();
            int n17 = n5 - n3;
            int n18 = this.getPaddingBottom();
            int n19 = this.getPaddingBottom();
            int n20 = this.getChildCount();
            n3 = this.e;
            n5 = n3 & 0x70;
            bl = this.a;
            int[] nArray = this.i;
            int[] nArray2 = this.j;
            n2 = (n3 = GravityCompat.getAbsoluteGravity((int)(0x800007 & n3), (int)ViewCompat.getLayoutDirection((View)this))) != 1 ? (n3 != 5 ? this.getPaddingLeft() : this.getPaddingLeft() + n4 - n2 - this.f) : this.getPaddingLeft() + (n4 - n2 - this.f) / 2;
            if (bl2) {
                n7 = n20 - 1;
                n6 = -1;
            } else {
                n7 = 0;
                n6 = 1;
            }
            int n21 = 0;
            n3 = n2;
            n4 = n5;
            for (n5 = n21; n5 < n20; ++n5) {
                int n22 = n6 * n5 + n7;
                View view = this.getChildAt(n22);
                if (view == null) {
                    n2 = n3 + 0;
                } else {
                    n2 = n3;
                    if (view.getVisibility() != 8) {
                        int n23;
                        int n24 = view.getMeasuredWidth();
                        int n25 = view.getMeasuredHeight();
                        w w3 = (w)view.getLayoutParams();
                        n21 = bl && w3.height != -1 ? view.getBaseline() : -1;
                        n2 = n23 = w3.gravity;
                        if (n23 < 0) {
                            n2 = n4;
                        }
                        if ((n2 &= 0x70) != 16) {
                            if (n2 != 48) {
                                if (n2 != 80) {
                                    n2 = n16;
                                } else {
                                    n2 = n23 = n17 - n18 - n25 - w3.bottomMargin;
                                    if (n21 != -1) {
                                        n2 = view.getMeasuredHeight();
                                        n2 = n23 - (nArray2[2] - (n2 - n21));
                                    }
                                }
                            } else {
                                n2 = n23 = w3.topMargin + n16;
                                if (n21 != -1) {
                                    n2 = nArray[1] - n21 + n23;
                                }
                            }
                        } else {
                            n2 = (n17 - n16 - n19 - n25) / 2 + n16 + w3.topMargin - w3.bottomMargin;
                        }
                        n21 = n3;
                        if (this.l(n22)) {
                            n21 = n3 + this.l;
                        }
                        n3 = n21 + w3.leftMargin;
                        n21 = n3 + 0;
                        view.layout(n21, n2, n24 + n21, n25 + n2);
                        n2 = w3.rightMargin;
                        n5 += 0;
                        n3 = n24 + n2 + 0 + n3;
                        continue;
                    }
                }
                n3 = n2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        int n4;
        boolean bl;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        block111: {
            int n11;
            float f2;
            w w2;
            int n12;
            int n13;
            int n14;
            float f4;
            int n15;
            boolean bl2;
            boolean bl3;
            int[] nArray;
            int[] nArray2;
            int n16;
            int n17;
            block110: {
                block108: {
                    block109: {
                        block107: {
                            boolean bl4;
                            block86: {
                                boolean bl5;
                                int n18;
                                int n19;
                                int n20;
                                int n21;
                                int n22;
                                int n23;
                                int n24;
                                int n25;
                                block84: {
                                    int n26;
                                    float f5;
                                    int n27;
                                    int n28;
                                    int n29;
                                    float f6;
                                    int n30;
                                    int n31;
                                    block92: {
                                        block91: {
                                            block90: {
                                                block85: {
                                                    if (this.d == 1) break block85;
                                                    this.f = 0;
                                                    n17 = this.getChildCount();
                                                    n16 = View.MeasureSpec.getMode((int)n2);
                                                    n10 = View.MeasureSpec.getMode((int)n3);
                                                    if (this.i == null || this.j == null) {
                                                        this.i = new int[4];
                                                        this.j = new int[4];
                                                    }
                                                    nArray2 = this.i;
                                                    nArray = this.j;
                                                    nArray2[3] = -1;
                                                    nArray2[2] = -1;
                                                    nArray2[1] = -1;
                                                    nArray2[0] = -1;
                                                    nArray[3] = -1;
                                                    nArray[2] = -1;
                                                    nArray[1] = -1;
                                                    nArray[0] = -1;
                                                    bl3 = this.a;
                                                    bl4 = this.h;
                                                    bl2 = n16 == 0x40000000;
                                                    n15 = 0;
                                                    f4 = 0.0f;
                                                    n9 = 0;
                                                    n8 = 0;
                                                    n14 = 0;
                                                    n7 = 0;
                                                    n6 = 0;
                                                    n13 = 0;
                                                    n5 = 1;
                                                    bl = false;
                                                    break block86;
                                                }
                                                this.f = 0;
                                                n25 = this.getChildCount();
                                                n24 = View.MeasureSpec.getMode((int)n2);
                                                n23 = View.MeasureSpec.getMode((int)n3);
                                                n22 = this.b;
                                                boolean bl6 = this.h;
                                                n31 = 0;
                                                n30 = 0;
                                                n21 = 0;
                                                n20 = 0;
                                                f6 = 0.0f;
                                                n19 = 0;
                                                n18 = 1;
                                                bl5 = false;
                                                n29 = 0;
                                                for (n28 = 0; n28 < n25; ++n28) {
                                                    View view;
                                                    block89: {
                                                        block88: {
                                                            block87: {
                                                                view = this.getChildAt(n28);
                                                                if (view != null) break block87;
                                                                this.f += 0;
                                                                break block88;
                                                            }
                                                            if (view.getVisibility() != 8) break block89;
                                                            n28 += 0;
                                                        }
                                                        n27 = n24;
                                                        continue;
                                                    }
                                                    if (this.l(n28)) {
                                                        this.f += this.m;
                                                    }
                                                    w w3 = (w)view.getLayoutParams();
                                                    f5 = w3.weight;
                                                    f6 += f5;
                                                    if (n23 == 0x40000000 && w3.height == 0 && f5 > 0.0f) {
                                                        n19 = this.f;
                                                        this.f = Math.max(n19, w3.topMargin + n19 + w3.bottomMargin);
                                                        n19 = 1;
                                                    } else {
                                                        if (w3.height == 0 && f5 > 0.0f) {
                                                            w3.height = -2;
                                                            n27 = 0;
                                                        } else {
                                                            n27 = Integer.MIN_VALUE;
                                                        }
                                                        n26 = f6 == 0.0f ? this.f : 0;
                                                        this.measureChildWithMargins(view, n2, 0, n3, n26);
                                                        if (n27 != Integer.MIN_VALUE) {
                                                            w3.height = n27;
                                                        }
                                                        n26 = view.getMeasuredHeight();
                                                        n27 = this.f;
                                                        this.f = Math.max(n27, n27 + n26 + w3.topMargin + w3.bottomMargin + 0);
                                                        n27 = n30;
                                                        if (bl6) {
                                                            n27 = Math.max(n26, n30);
                                                        }
                                                        n30 = n27;
                                                    }
                                                    if (n22 >= 0 && n22 == n28 + 1) {
                                                        this.c = this.f;
                                                    }
                                                    if (n28 < n22 && w3.weight > 0.0f) {
                                                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                                                    }
                                                    n27 = n24;
                                                    if (n27 != 0x40000000 && w3.width == -1) {
                                                        n27 = 1;
                                                        bl5 = true;
                                                    } else {
                                                        n27 = 0;
                                                    }
                                                    int n32 = w3.leftMargin + w3.rightMargin;
                                                    n26 = view.getMeasuredWidth() + n32;
                                                    int n33 = Math.max(n31, n26);
                                                    n29 = View.combineMeasuredStates((int)n29, (int)view.getMeasuredState());
                                                    n18 = n18 != 0 && w3.width == -1 ? 1 : 0;
                                                    if (w3.weight > 0.0f) {
                                                        if (n27 == 0) {
                                                            n32 = n26;
                                                        }
                                                        n31 = Math.max(n20, n32);
                                                    } else {
                                                        if (n27 != 0) {
                                                            n26 = n32;
                                                        }
                                                        n21 = Math.max(n21, n26);
                                                        n31 = n20;
                                                    }
                                                    n28 += 0;
                                                    n20 = n31;
                                                    n31 = n33;
                                                }
                                                n27 = n21;
                                                if (this.f > 0 && this.l(n25)) {
                                                    this.f += this.m;
                                                }
                                                n28 = n23;
                                                if (bl6 && (n28 == Integer.MIN_VALUE || n28 == 0)) {
                                                    this.f = 0;
                                                    for (n21 = 0; n21 < n25; ++n21) {
                                                        View view = this.getChildAt(n21);
                                                        if (view == null) {
                                                            this.f += 0;
                                                            continue;
                                                        }
                                                        if (view.getVisibility() == 8) {
                                                            n21 += 0;
                                                            continue;
                                                        }
                                                        w w4 = (w)view.getLayoutParams();
                                                        n23 = this.f;
                                                        this.f = Math.max(n23, n23 + n30 + w4.topMargin + w4.bottomMargin + 0);
                                                    }
                                                }
                                                n23 = this.f;
                                                n21 = this.getPaddingTop();
                                                this.f = n21 = this.getPaddingBottom() + n21 + n23;
                                                n22 = View.resolveSizeAndState((int)Math.max(n21, this.getSuggestedMinimumHeight()), (int)n3, (int)0);
                                                n23 = (0xFFFFFF & n22) - this.f;
                                                if (n19 != 0 || n23 != 0 && f6 > 0.0f) break block90;
                                                n21 = n27 = Math.max(n27, n20);
                                                n20 = n31;
                                                n23 = n29;
                                                n19 = n18;
                                                if (!bl6) break block84;
                                                n21 = n27;
                                                n20 = n31;
                                                n23 = n29;
                                                n19 = n18;
                                                if (n28 == 0x40000000) break block84;
                                                break block91;
                                            }
                                            f5 = this.g;
                                            if (f5 > 0.0f) {
                                                f6 = f5;
                                            }
                                            this.f = 0;
                                            n30 = n18;
                                            f5 = f6;
                                            n18 = n29;
                                            n21 = n27;
                                            break block92;
                                        }
                                        n28 = 0;
                                        while (true) {
                                            n21 = n27;
                                            n20 = n31;
                                            n23 = n29;
                                            n19 = n18;
                                            if (n28 < n25) {
                                                View view = this.getChildAt(n28);
                                                if (view != null && view.getVisibility() != 8 && ((w)view.getLayoutParams()).weight > 0.0f) {
                                                    view.measure(View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n30, (int)0x40000000));
                                                }
                                                ++n28;
                                                continue;
                                            }
                                            break block84;
                                            break;
                                        }
                                    }
                                    for (n19 = 0; n19 < n25; ++n19) {
                                        block94: {
                                            w w5;
                                            View view;
                                            block95: {
                                                block98: {
                                                    block97: {
                                                        block96: {
                                                            block93: {
                                                                view = this.getChildAt(n19);
                                                                if (view.getVisibility() != 8) break block93;
                                                                f6 = f5;
                                                                break block94;
                                                            }
                                                            w5 = (w)view.getLayoutParams();
                                                            float f7 = w5.weight;
                                                            n29 = n23;
                                                            n20 = n18;
                                                            f6 = f5;
                                                            if (!(f7 > 0.0f)) break block95;
                                                            n29 = (int)((float)n23 * f7 / f5);
                                                            f6 = f5 - f7;
                                                            n20 = this.getPaddingLeft();
                                                            n26 = ViewGroup.getChildMeasureSpec((int)n2, (int)(this.getPaddingRight() + n20 + w5.leftMargin + w5.rightMargin), (int)w5.width);
                                                            if (w5.height != 0 || n28 != 0x40000000) break block96;
                                                            if (n29 <= 0) break block97;
                                                            n20 = n29;
                                                            break block98;
                                                        }
                                                        n20 = n27 = view.getMeasuredHeight() + n29;
                                                        if (n27 >= 0) break block98;
                                                    }
                                                    n20 = 0;
                                                }
                                                view.measure(n26, View.MeasureSpec.makeMeasureSpec((int)n20, (int)0x40000000));
                                                n20 = View.combineMeasuredStates((int)n18, (int)(view.getMeasuredState() & 0xFFFFFF00));
                                                n29 = n23 - n29;
                                            }
                                            n23 = w5.leftMargin + w5.rightMargin;
                                            n27 = view.getMeasuredWidth() + n23;
                                            n31 = Math.max(n31, n27);
                                            n18 = n24 != 0x40000000 && w5.width == -1 ? 1 : 0;
                                            n18 = n18 != 0 ? n23 : n27;
                                            n21 = Math.max(n21, n18);
                                            n18 = n30 != 0 && w5.width == -1 ? 1 : 0;
                                            n30 = this.f;
                                            this.f = Math.max(n30, view.getMeasuredHeight() + n30 + w5.topMargin + w5.bottomMargin + 0);
                                            n23 = n29;
                                            n30 = n18;
                                            n18 = n20;
                                        }
                                        f5 = f6;
                                    }
                                    n20 = this.f;
                                    n23 = this.getPaddingTop();
                                    this.f = this.getPaddingBottom() + n23 + n20;
                                    n20 = n31;
                                    n23 = n18;
                                    n19 = n30;
                                }
                                if (n19 != 0 || n24 == 0x40000000) {
                                    n21 = n20;
                                }
                                n24 = this.getPaddingLeft();
                                this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(this.getPaddingRight() + n24 + n21, this.getSuggestedMinimumWidth()), (int)n2, (int)n23), n22);
                                if (!bl5) return;
                                n24 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
                                for (n2 = 0; n2 < n25; ++n2) {
                                    View view = this.getChildAt(n2);
                                    if (view.getVisibility() == 8) continue;
                                    w w6 = (w)view.getLayoutParams();
                                    if (w6.width != -1) continue;
                                    n18 = w6.height;
                                    w6.height = view.getMeasuredHeight();
                                    this.measureChildWithMargins(view, n24, 0, n3, 0);
                                    w6.height = n18;
                                }
                                return;
                            }
                            while (n8 < n17) {
                                block102: {
                                    int n34;
                                    View view;
                                    block106: {
                                        block105: {
                                            block103: {
                                                block104: {
                                                    block101: {
                                                        block100: {
                                                            block99: {
                                                                view = this.getChildAt(n8);
                                                                if (view != null) break block99;
                                                                this.f += 0;
                                                                n12 = n8;
                                                                break block100;
                                                            }
                                                            n12 = view.getVisibility();
                                                            if (n12 != 8) break block101;
                                                            n12 = n8 + 0;
                                                        }
                                                        n8 = n9;
                                                        n9 = n15;
                                                        break block102;
                                                    }
                                                    if (this.l(n8)) {
                                                        this.f += this.l;
                                                    }
                                                    w2 = (w)view.getLayoutParams();
                                                    f2 = w2.weight;
                                                    f4 += f2;
                                                    if (n16 != 0x40000000 || w2.width != 0 || !(f2 > 0.0f)) break block103;
                                                    if (bl2) {
                                                        n12 = this.f;
                                                        this.f = w2.leftMargin + w2.rightMargin + n12;
                                                    } else {
                                                        n12 = this.f;
                                                        this.f = Math.max(n12, w2.leftMargin + n12 + w2.rightMargin);
                                                    }
                                                    if (!bl3) break block104;
                                                    n12 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                                                    view.measure(n12, n12);
                                                    n12 = n8;
                                                    n12 = n14;
                                                    break block105;
                                                }
                                                n13 = n8;
                                                n13 = 1;
                                                break block106;
                                            }
                                            if (w2.width == 0 && f2 > 0.0f) {
                                                w2.width = -2;
                                                n12 = 0;
                                            } else {
                                                n12 = Integer.MIN_VALUE;
                                            }
                                            n11 = f4 == 0.0f ? this.f : 0;
                                            n4 = n8;
                                            this.measureChildWithMargins(view, n2, n11, n3, 0);
                                            if (n12 != Integer.MIN_VALUE) {
                                                w2.width = n12;
                                            }
                                            n11 = view.getMeasuredWidth();
                                            if (bl2) {
                                                n12 = this.f;
                                                this.f = w2.leftMargin + n11 + w2.rightMargin + 0 + n12;
                                            } else {
                                                n12 = this.f;
                                                this.f = Math.max(n12, n12 + n11 + w2.leftMargin + w2.rightMargin + 0);
                                            }
                                            n12 = n14;
                                            if (bl4) {
                                                n12 = Math.max(n11, n14);
                                            }
                                        }
                                        n14 = n8;
                                        n14 = n12;
                                    }
                                    int n35 = n8;
                                    n12 = n9;
                                    if (n10 != 0x40000000 && w2.height == -1) {
                                        n9 = 1;
                                        bl = true;
                                    } else {
                                        n9 = 0;
                                    }
                                    n11 = w2.topMargin + w2.bottomMargin;
                                    n4 = view.getMeasuredHeight() + n11;
                                    n7 = View.combineMeasuredStates((int)n7, (int)view.getMeasuredState());
                                    if (bl3 && (n34 = view.getBaseline()) != -1) {
                                        int n36;
                                        n8 = n36 = w2.gravity;
                                        if (n36 < 0) {
                                            n8 = this.e;
                                        }
                                        n8 = ((n8 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                                        nArray2[n8] = Math.max(nArray2[n8], n34);
                                        nArray[n8] = Math.max(nArray[n8], n4 - n34);
                                    }
                                    n6 = Math.max(n6, n4);
                                    n8 = n5 != 0 && w2.height == -1 ? 1 : 0;
                                    if (w2.weight > 0.0f) {
                                        if (n9 != 0) {
                                            n4 = n11;
                                        }
                                        n9 = Math.max(n15, n4);
                                        n5 = n12;
                                    } else {
                                        if (n9 != 0) {
                                            n4 = n11;
                                        }
                                        n5 = Math.max(n12, n4);
                                        n9 = n15;
                                    }
                                    n12 = n35 + 0;
                                    n15 = n8;
                                    n8 = n5;
                                    n5 = n15;
                                }
                                n15 = n9;
                                n9 = n8;
                                n8 = ++n12;
                            }
                            if (this.f > 0 && this.l(n17)) {
                                this.f += this.l;
                            }
                            if (nArray2[1] != -1 || nArray2[0] != -1 || nArray2[2] != -1 || nArray2[3] != -1) {
                                n8 = Math.max(nArray2[3], Math.max(nArray2[0], Math.max(nArray2[1], nArray2[2])));
                                n6 = Math.max(n6, Math.max(nArray[3], Math.max(nArray[0], Math.max(nArray[1], nArray[2]))) + n8);
                            }
                            if (bl4 && (n16 == Integer.MIN_VALUE || n16 == 0)) {
                                this.f = 0;
                                for (n8 = 0; n8 < n17; ++n8) {
                                    View view = this.getChildAt(n8);
                                    if (view == null) {
                                        this.f += 0;
                                        continue;
                                    }
                                    if (view.getVisibility() == 8) {
                                        n8 += 0;
                                        continue;
                                    }
                                    w w7 = (w)view.getLayoutParams();
                                    if (bl2) {
                                        n12 = this.f;
                                        this.f = w7.leftMargin + n14 + w7.rightMargin + 0 + n12;
                                        continue;
                                    }
                                    n12 = this.f;
                                    this.f = Math.max(n12, n12 + n14 + w7.leftMargin + w7.rightMargin + 0);
                                }
                            }
                            n12 = this.f;
                            n8 = this.getPaddingLeft();
                            this.f = n8 = this.getPaddingRight() + n8 + n12;
                            n4 = View.resolveSizeAndState((int)Math.max(n8, this.getSuggestedMinimumWidth()), (int)n2, (int)0);
                            n8 = (0xFFFFFF & n4) - this.f;
                            if (n13 != 0 || n8 != 0 && f4 > 0.0f) break block107;
                            n9 = Math.max(n9, n15);
                            if (!bl4 || n16 == 0x40000000) break block108;
                            break block109;
                        }
                        f2 = this.g;
                        if (f2 > 0.0f) {
                            f4 = f2;
                        }
                        nArray2[3] = -1;
                        nArray2[2] = -1;
                        nArray2[1] = -1;
                        nArray2[0] = -1;
                        nArray[3] = -1;
                        nArray[2] = -1;
                        nArray[1] = -1;
                        nArray[0] = -1;
                        this.f = 0;
                        n15 = n8;
                        n8 = n7;
                        n14 = -1;
                        n7 = n17;
                        break block110;
                    }
                    for (n8 = 0; n8 < n17; ++n8) {
                        View view = this.getChildAt(n8);
                        if (view == null || view.getVisibility() == 8 || !(((w)view.getLayoutParams()).weight > 0.0f)) continue;
                        view.measure(View.MeasureSpec.makeMeasureSpec((int)n14, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)view.getMeasuredHeight(), (int)0x40000000));
                    }
                }
                n8 = n7;
                n7 = n17;
                break block111;
            }
            for (n13 = 0; n13 < n7; ++n13) {
                w w8;
                block112: {
                    block115: {
                        block114: {
                            block113: {
                                w2 = this.getChildAt(n13);
                                if (w2 == null || w2.getVisibility() == 8) continue;
                                w8 = (w)w2.getLayoutParams();
                                f2 = w8.weight;
                                if (!(f2 > 0.0f)) break block112;
                                n12 = (int)((float)n15 * f2 / f4);
                                n6 = this.getPaddingTop();
                                n11 = ViewGroup.getChildMeasureSpec((int)n3, (int)(this.getPaddingBottom() + n6 + w8.topMargin + w8.bottomMargin), (int)w8.height);
                                if (w8.width != 0 || n16 != 0x40000000) break block113;
                                if (n12 <= 0) break block114;
                                n6 = n12;
                                break block115;
                            }
                            n6 = n17 = w2.getMeasuredWidth() + n12;
                            if (n17 >= 0) break block115;
                        }
                        n6 = 0;
                    }
                    w2.measure(View.MeasureSpec.makeMeasureSpec((int)n6, (int)0x40000000), n11);
                    n8 = View.combineMeasuredStates((int)n8, (int)(w2.getMeasuredState() & 0xFF000000));
                    f4 -= f2;
                    n15 -= n12;
                }
                if (bl2) {
                    n6 = this.f;
                    this.f = w2.getMeasuredWidth() + w8.leftMargin + w8.rightMargin + 0 + n6;
                } else {
                    n6 = this.f;
                    this.f = Math.max(n6, w2.getMeasuredWidth() + n6 + w8.leftMargin + w8.rightMargin + 0);
                }
                n6 = n10 != 0x40000000 && w8.height == -1 ? 1 : 0;
                n11 = w8.topMargin + w8.bottomMargin;
                n17 = w2.getMeasuredHeight() + n11;
                n12 = Math.max(n14, n17);
                n14 = n6 != 0 ? n11 : n17;
                n14 = Math.max(n9, n14);
                n9 = n5 != 0 && w8.height == -1 ? 1 : 0;
                if (bl3 && (n11 = w2.getBaseline()) != -1) {
                    n5 = n6 = w8.gravity;
                    if (n6 < 0) {
                        n5 = this.e;
                    }
                    n5 = ((n5 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                    nArray2[n5] = Math.max(nArray2[n5], n11);
                    nArray[n5] = Math.max(nArray[n5], n17 - n11);
                }
                n5 = n9;
                n9 = n14;
                n14 = n12;
            }
            n6 = this.f;
            n15 = this.getPaddingLeft();
            this.f = this.getPaddingRight() + n15 + n6;
            if (nArray2[1] == -1 && nArray2[0] == -1 && nArray2[2] == -1 && nArray2[3] == -1) {
                n6 = n14;
            } else {
                n15 = Math.max(nArray2[3], Math.max(nArray2[0], Math.max(nArray2[1], nArray2[2])));
                n6 = Math.max(n14, Math.max(nArray[3], Math.max(nArray[0], Math.max(nArray[1], nArray[2]))) + n15);
            }
        }
        if (n5 != 0 || n10 == 0x40000000) {
            n9 = n6;
        }
        n5 = this.getPaddingTop();
        this.setMeasuredDimension(0xFF000000 & n8 | n4, View.resolveSizeAndState((int)Math.max(this.getPaddingBottom() + n5 + n9, this.getSuggestedMinimumHeight()), (int)n3, (int)(n8 << 16)));
        if (!bl) return;
        n8 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000);
        for (n3 = 0; n3 < n7; ++n3) {
            View view = this.getChildAt(n3);
            if (view.getVisibility() == 8) continue;
            w w9 = (w)view.getLayoutParams();
            if (w9.height != -1) continue;
            n9 = w9.width;
            w9.width = view.getMeasuredWidth();
            this.measureChildWithMargins(view, n2, 0, n8, 0);
            w9.width = n9;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

