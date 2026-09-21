/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  androidx.core.content.res.TypedArrayUtils
 *  androidx.core.graphics.drawable.TintAwareDrawable
 *  androidx.vectordrawable.graphics.drawable.e
 *  androidx.vectordrawable.graphics.drawable.r
 *  org.xmlpull.v1.XmlPullParser
 */
package com.github.catvod.spider.merge.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.e;
import androidx.vectordrawable.graphics.drawable.r;
import com.github.catvod.spider.merge.j.a;
import com.github.catvod.spider.merge.j.b;
import com.github.catvod.spider.merge.j.c;
import com.github.catvod.spider.merge.j.d;
import com.github.catvod.spider.merge.j.f;
import com.github.catvod.spider.merge.j.j;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.j.n;
import com.github.catvod.spider.merge.n.G;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint(value={"RestrictedAPI"})
public final class g
extends n
implements TintAwareDrawable {
    private b p;
    private f q;
    private int r = -1;
    private int s = -1;
    private boolean t;

    public g() {
        this(null, null);
    }

    g(b b2, Resources resources) {
        this.f(new b(b2, this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public static g i(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object2 = xmlPullParser.getName();
        if (((String)object2).equals("animated-selector")) {
            int n2;
            int n3;
            g g2 = new g(null, null);
            Object object3 = TypedArrayUtils.obtainAttributes((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])com.github.catvod.spider.merge.g.a.v);
            g2.setVisible(object3.getBoolean(1, true), true);
            object2 = g2.p;
            ((j)((Object)object2)).d |= object3.getChangingConfigurations();
            ((j)((Object)object2)).i = object3.getBoolean(2, ((j)((Object)object2)).i);
            ((j)((Object)object2)).l = object3.getBoolean(3, ((j)((Object)object2)).l);
            ((j)((Object)object2)).y = object3.getInt(4, ((j)((Object)object2)).y);
            ((j)((Object)object2)).z = object3.getInt(5, ((j)((Object)object2)).z);
            super.setDither(object3.getBoolean(0, ((j)((Object)object2)).w));
            g2.g(resources);
            object3.recycle();
            int n4 = xmlPullParser.getDepth() + 1;
            while ((n3 = xmlPullParser.next()) != 1 && ((n2 = xmlPullParser.getDepth()) >= n4 || n3 != 3)) {
                int n5;
                if (n3 != 2 || n2 > n4) continue;
                if (xmlPullParser.getName().equals("item")) {
                    object3 = TypedArrayUtils.obtainAttributes((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])com.github.catvod.spider.merge.g.a.w);
                    int n6 = object3.getResourceId(0, 0);
                    n3 = object3.getResourceId(1, -1);
                    object2 = n3 > 0 ? G.d().f((Context)object, n3) : null;
                    object3.recycle();
                    int n7 = attributeSet.getAttributeCount();
                    object3 = new int[n7];
                    n3 = 0;
                    for (n2 = 0; n2 < n7; ++n2) {
                        int n8 = attributeSet.getAttributeNameResource(n2);
                        n5 = n3;
                        if (n8 != 0) {
                            n5 = n3;
                            if (n8 != 0x10100D0) {
                                n5 = n3;
                                if (n8 != 0x1010199) {
                                    n5 = attributeSet.getAttributeBooleanValue(n2, false) ? n8 : -n8;
                                    object3[n3] = (TypedArray)n5;
                                    n5 = n3 + 1;
                                }
                            }
                        }
                        n3 = n5;
                    }
                    int[] nArray = StateSet.trimStateSet((int[])object3, (int)n3);
                    object3 = object2;
                    if (object2 == null) {
                        while ((n3 = xmlPullParser.next()) == 4) {
                        }
                        if (n3 == 2) {
                            object3 = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.r.a((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
                        } else {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                            ((StringBuilder)object).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
                        }
                    }
                    if (object3 != null) {
                        object2 = g2.p;
                        n3 = ((j)((Object)object2)).a((Drawable)object3);
                        ((m)((Object)object2)).H[n3] = nArray;
                        ((b)((Object)object2)).J.d(n3, n6);
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                    ((StringBuilder)object).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
                }
                if (!xmlPullParser.getName().equals("transition")) continue;
                object3 = TypedArrayUtils.obtainAttributes((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])com.github.catvod.spider.merge.g.a.x);
                n2 = object3.getResourceId(2, -1);
                n3 = object3.getResourceId(1, -1);
                n5 = object3.getResourceId(0, -1);
                object2 = n5 > 0 ? G.d().f((Context)object, n5) : null;
                boolean bl = object3.getBoolean(3, false);
                object3.recycle();
                object3 = object2;
                if (object2 == null) {
                    while ((n5 = xmlPullParser.next()) == 4) {
                    }
                    if (n5 == 2) {
                        object3 = xmlPullParser.getName().equals("animated-vector") ? e.a((Context)object, (Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme) : Drawable.createFromXmlInner((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                        ((StringBuilder)object).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
                    }
                }
                if (object3 != null) {
                    if (n2 != -1 && n3 != -1) {
                        g2.p.m(n2, n3, (Drawable)object3, bl);
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                    ((StringBuilder)object).append(": <transition> tag requires 'fromId' & 'toId' attributes");
                    throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                ((StringBuilder)object).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
            }
            g2.onStateChange(g2.getState());
            return g2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": invalid animated-selector tag ");
        ((StringBuilder)object).append((String)object2);
        throw new com.github.catvod.spider.merge.Y1.a(((StringBuilder)object).toString());
    }

    @Override
    final j b() {
        return new b(this.p, this, null);
    }

    @Override
    final void f(j j2) {
        super.f(j2);
        if (j2 instanceof b) {
            this.p = (b)j2;
        }
    }

    @Override
    final m h() {
        return new b(this.p, this, null);
    }

    @Override
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        f f2 = this.q;
        if (f2 != null) {
            f2.d();
            this.q = null;
            this.e(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.t) {
            super.mutate();
            this.p.i();
            this.t = true;
        }
        return this;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    protected final boolean onStateChange(int[] var1_1) {
        block20: {
            block12: {
                block16: {
                    block18: {
                        block19: {
                            block17: {
                                block15: {
                                    block13: {
                                        block14: {
                                            var10_2 /* !! */  = this.p;
                                            var2_3 = var10_2 /* !! */ .l(var1_1);
                                            if (var2_3 < 0) {
                                                var2_3 = var10_2 /* !! */ .l(StateSet.WILD_CARD);
                                            }
                                            var3_4 = this.c();
                                            var8_5 = true;
                                            if (var2_3 == var3_4) ** GOTO lbl-1000
                                            var10_2 /* !! */  = this.q;
                                            if (var10_2 /* !! */  == null) break block13;
                                            if (var2_3 == this.r) lbl-1000:
                                            // 3 sources

                                            {
                                                while (true) {
                                                    var3_4 = 1;
                                                    break block12;
                                                    break;
                                                }
                                            }
                                            if (var2_3 != this.s || !var10_2 /* !! */ .a()) break block14;
                                            var10_2 /* !! */ .b();
                                            this.r = this.s;
                                            this.s = var2_3;
                                            ** GOTO lbl-1000
                                        }
                                        var3_4 = this.r;
                                        var10_2 /* !! */ .d();
                                        break block15;
                                    }
                                    var3_4 = this.c();
                                }
                                this.q = null;
                                this.s = -1;
                                this.r = -1;
                                var10_2 /* !! */  = this.p;
                                var6_7 = var10_2 /* !! */ .o(var3_4);
                                var4_8 = var10_2 /* !! */ .o(var2_3);
                                if (var4_8 == 0 || var6_7 == 0 || (var5_9 = var10_2 /* !! */ .p(var6_7, var4_8)) < 0) break block16;
                                var9_10 = var10_2 /* !! */ .r(var6_7, var4_8);
                                this.e(var5_9);
                                var11_11 = super.getCurrent();
                                if (!(var11_11 instanceof AnimationDrawable)) break block17;
                                var7_6 = var10_2 /* !! */ .q(var6_7, var4_8);
                                var10_2 /* !! */  = new d((AnimationDrawable)var11_11, var7_6, var9_10);
                                break block18;
                            }
                            if (!(var11_11 instanceof e)) break block19;
                            var10_2 /* !! */  = new c((e)var11_11);
                            break block18;
                        }
                        if (!(var11_11 instanceof Animatable)) break block16;
                        var10_2 /* !! */  = new a((Animatable)var11_11);
                    }
                    var10_2 /* !! */ .c();
                    this.q = var10_2 /* !! */ ;
                    this.s = var3_4;
                    this.r = var2_3;
                    ** while (true)
                }
                var3_4 = 0;
            }
            var7_6 = var8_5;
            if (var3_4 == 0) {
                ** if (!this.e((int)var2_3)) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    var7_6 = var8_5;
                    ** GOTO lbl64
                }
            }
            break block20;
lbl-1000:
            // 2 sources

            {
                var7_6 = false;
            }
        }
        var10_2 /* !! */  = super.getCurrent();
        var8_5 = var7_6;
        if (var10_2 /* !! */  != null) {
            var8_5 = var7_6 | var10_2 /* !! */ .setState(var1_1);
        }
        return var8_5;
    }

    @Override
    public final boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = super.setVisible(bl, bl2);
        f f2 = this.q;
        if (f2 != null && (bl3 || bl2)) {
            if (bl) {
                f2.c();
            } else {
                this.jumpToCurrentState();
            }
        }
        return bl3;
    }
}

