/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.method.PasswordTransformationMethod
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 *  androidx.core.view.ViewCompat
 *  androidx.core.widget.AutoSizeableTextView
 *  androidx.core.widget.TextViewCompat
 */
package com.github.catvod.spider.merge.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.G;
import com.github.catvod.spider.merge.n.J;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.g;
import com.github.catvod.spider.merge.n.m;
import com.github.catvod.spider.merge.n.n;
import com.github.catvod.spider.merge.n.t;
import com.github.catvod.spider.merge.n.v;
import java.lang.ref.WeakReference;
import java.util.Locale;

final class o {
    private final TextView a;
    private J b;
    private J c;
    private J d;
    private J e;
    private J f;
    private J g;
    private J h;
    private final t i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    o(TextView textView) {
        this.a = textView;
        this.i = new t(textView);
    }

    private void a(Drawable drawable, J j2) {
        if (drawable != null && j2 != null) {
            int[] nArray = this.a.getDrawableState();
            int n2 = com.github.catvod.spider.merge.n.g.d;
            G.n(drawable, j2, nArray);
        }
    }

    private static J d(Context context, g object, int n2) {
        if ((context = ((g)object).d(context, n2)) != null) {
            object = new J();
            ((J)object).d = true;
            ((J)object).a = context;
            return object;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(Context object, L l2) {
        void var1_19;
        boolean bl;
        int n2;
        void var2_20;
        this.j = var2_20.i(2, this.j);
        int n3 = Build.VERSION.SDK_INT;
        boolean bl2 = false;
        if (n3 >= 28) {
            this.k = n2 = var2_20.i(11, -1);
            if (n2 != -1) {
                this.j = this.j & 2 | 0;
            }
        }
        n2 = 10;
        if (!var2_20.p(10) && !var2_20.p(12)) {
            void var1_5;
            if (!var2_20.p(1)) return;
            this.m = false;
            n2 = var2_20.i(1, 1);
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return;
                    }
                    Typeface typeface = Typeface.MONOSPACE;
                } else {
                    Typeface typeface = Typeface.SERIF;
                }
            } else {
                Typeface typeface = Typeface.SANS_SERIF;
            }
            this.l = var1_5;
            return;
        }
        this.l = null;
        if (var2_20.p(12)) {
            n2 = 12;
        }
        int n4 = this.k;
        int n5 = this.j;
        if (!object.isRestricted()) {
            m m2 = new m(this, n4, n5, new WeakReference<TextView>(this.a));
            try {
                Typeface typeface = var2_20.h(n2, this.j, m2);
                if (typeface != null) {
                    void var1_11;
                    Typeface typeface2 = typeface;
                    if (n3 >= 28) {
                        Typeface typeface3 = typeface;
                        if (this.k != -1) {
                            Typeface typeface4 = Typeface.create((Typeface)typeface, (int)0);
                            n3 = this.k;
                            bl = (this.j & 2) != 0;
                            Typeface typeface5 = Typeface.create((Typeface)typeface4, (int)n3, (boolean)bl);
                        }
                    }
                    this.l = var1_11;
                }
                bl = this.l == null;
                this.m = bl;
            }
            catch (Resources.NotFoundException | UnsupportedOperationException throwable) {
                // empty catch block
            }
        }
        if (this.l != null) return;
        String string = var2_20.m(n2);
        if (string == null) return;
        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            Typeface typeface = Typeface.create((String)string, (int)0);
            n2 = this.k;
            bl = bl2;
            if ((this.j & 2) != 0) {
                bl = true;
            }
            Typeface typeface6 = Typeface.create((Typeface)typeface, (int)n2, (boolean)bl);
        } else {
            Typeface typeface = Typeface.create((String)string, (int)this.j);
        }
        this.l = var1_19;
    }

    final void b() {
        Drawable[] drawableArray;
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            drawableArray = this.a.getCompoundDrawables();
            this.a(drawableArray[0], this.b);
            this.a(drawableArray[1], this.c);
            this.a(drawableArray[2], this.d);
            this.a(drawableArray[3], this.e);
        }
        if (this.f != null || this.g != null) {
            drawableArray = this.a.getCompoundDrawablesRelative();
            this.a(drawableArray[0], this.f);
            this.a(drawableArray[2], this.g);
        }
    }

    final void c() {
        this.i.a();
    }

    final int e() {
        return this.i.d();
    }

    final int f() {
        return this.i.e();
    }

    final int g() {
        return this.i.f();
    }

    final int[] h() {
        return this.i.g();
    }

    final int i() {
        return this.i.h();
    }

    final ColorStateList j() {
        J j2 = this.h;
        j2 = j2 != null ? j2.a : null;
        return j2;
    }

    final PorterDuff.Mode k() {
        J j2 = this.h;
        j2 = j2 != null ? j2.b : null;
        return j2;
    }

    final boolean l() {
        return this.i.k();
    }

    @SuppressLint(value={"NewApi"})
    final void m(AttributeSet object, int n2) {
        Object object2;
        Object object3;
        boolean bl;
        Object object4;
        boolean bl2;
        int n3;
        int n4;
        Object object5;
        Object object6;
        Object object7;
        g g2;
        Context context;
        block56: {
            block52: {
                block55: {
                    block54: {
                        block53: {
                            context = this.a.getContext();
                            g2 = com.github.catvod.spider.merge.n.g.b();
                            object7 = com.github.catvod.spider.merge.g.a.f;
                            object6 = L.s(context, object, object7, n2, 0);
                            object5 = this.a;
                            ViewCompat.saveAttributeDataForStyleable((View)object5, (Context)object5.getContext(), (int[])object7, (AttributeSet)object, (TypedArray)object6.o(), (int)n2, (int)0);
                            n4 = object6.l(0, -1);
                            if (object6.p(3)) {
                                this.b = o.d(context, g2, object6.l(3, 0));
                            }
                            if (object6.p(1)) {
                                this.c = o.d(context, g2, object6.l(1, 0));
                            }
                            if (object6.p(4)) {
                                this.d = o.d(context, g2, object6.l(4, 0));
                            }
                            if (object6.p(2)) {
                                this.e = o.d(context, g2, object6.l(2, 0));
                            }
                            n3 = Build.VERSION.SDK_INT;
                            if (object6.p(5)) {
                                this.f = o.d(context, g2, object6.l(5, 0));
                            }
                            if (object6.p(6)) {
                                this.g = o.d(context, g2, object6.l(6, 0));
                            }
                            object6.t();
                            bl2 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
                            if (n4 == -1) break block52;
                            object4 = L.q(context, n4, com.github.catvod.spider.merge.g.a.r);
                            if (!bl2 && ((L)object4).p(14)) {
                                bl = ((L)object4).a(14, false);
                                n4 = 1;
                            } else {
                                bl = false;
                                n4 = 0;
                            }
                            this.w(context, (L)object4);
                            if (n3 >= 23) break block53;
                            object7 = ((L)object4).p(3) ? (Object)((L)object4).c(3) : null;
                            object5 = ((L)object4).p(4) ? ((L)object4).c(4) : null;
                            if (!((L)object4).p(5)) break block54;
                            object3 = ((L)object4).c(5);
                            break block55;
                        }
                        object7 = null;
                        object5 = null;
                    }
                    object3 = null;
                }
                object2 = ((L)object4).p(15) ? ((L)object4).m(15) : null;
                object6 = n3 >= 26 && ((L)object4).p(13) ? ((L)object4).m(13) : null;
                ((L)object4).t();
                break block56;
            }
            bl = false;
            n4 = 0;
            object7 = null;
            object5 = null;
            object3 = null;
            object2 = null;
            object6 = null;
        }
        L l2 = L.s(context, object, com.github.catvod.spider.merge.g.a.r, n2, 0);
        boolean bl3 = bl;
        int n5 = n4;
        if (!bl2) {
            bl3 = bl;
            n5 = n4;
            if (l2.p(14)) {
                bl3 = l2.a(14, false);
                n5 = 1;
            }
        }
        object4 = object7;
        TextView textView = object5;
        Drawable drawable = object3;
        if (n3 < 23) {
            if (l2.p(3)) {
                object7 = l2.c(3);
            }
            if (l2.p(4)) {
                object5 = l2.c(4);
            }
            object4 = object7;
            textView = object5;
            drawable = object3;
            if (l2.p(5)) {
                drawable = l2.c(5);
                textView = object5;
                object4 = object7;
            }
        }
        if (l2.p(15)) {
            object2 = l2.m(15);
        }
        object5 = object6;
        if (n3 >= 26) {
            object5 = object6;
            if (l2.p(13)) {
                object5 = l2.m(13);
            }
        }
        if (n3 >= 28 && l2.p(0) && l2.e(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.w(context, l2);
        l2.t();
        if (object4 != null) {
            this.a.setTextColor((ColorStateList)object4);
        }
        if (textView != null) {
            this.a.setHintTextColor((ColorStateList)textView);
        }
        if (drawable != null) {
            this.a.setLinkTextColor((ColorStateList)drawable);
        }
        if (!bl2 && n5 != 0) {
            this.a.setAllCaps(bl3);
        }
        if ((object7 = (Object)this.l) != null) {
            if (this.k == -1) {
                this.a.setTypeface((Typeface)object7, this.j);
            } else {
                this.a.setTypeface((Typeface)object7);
            }
        }
        if (object5 != null) {
            this.a.setFontVariationSettings((String)object5);
        }
        if (object2 != null) {
            if (n3 >= 24) {
                this.a.setTextLocales(LocaleList.forLanguageTags((String)object2));
            } else {
                object5 = object2.substring(0, object2.indexOf(44));
                this.a.setTextLocale(Locale.forLanguageTag((String)object5));
            }
        }
        this.i.l((AttributeSet)object, n2);
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && this.i.h() != 0 && ((TextView)(object5 = (Object)this.i.g())).length > 0) {
            if ((float)this.a.getAutoSizeStepGranularity() != -1.0f) {
                this.a.setAutoSizeTextTypeUniformWithConfiguration(this.i.e(), this.i.d(), this.i.f(), 0);
            } else {
                this.a.setAutoSizeTextTypeUniformWithPresetSizes((int[])object5, 0);
            }
        }
        object7 = (n2 = ((L)(object4 = L.r(context, object, com.github.catvod.spider.merge.g.a.g))).l(8, -1)) != -1 ? (Object)g2.c(context, n2) : null;
        n2 = ((L)object4).l(13, -1);
        object5 = n2 != -1 ? g2.c(context, n2) : null;
        n2 = ((L)object4).l(9, -1);
        object6 = n2 != -1 ? g2.c(context, n2) : null;
        n2 = ((L)object4).l(6, -1);
        object = n2 != -1 ? g2.c(context, n2) : null;
        n2 = ((L)object4).l(10, -1);
        object2 = n2 != -1 ? g2.c(context, n2) : null;
        n2 = ((L)object4).l(7, -1);
        object3 = n2 != -1 ? g2.c(context, n2) : null;
        if (object2 == null && object3 == null) {
            if (object7 != null || object5 != null || object6 != null || object != null) {
                object2 = this.a.getCompoundDrawablesRelative();
                if (object2[0] == null && object2[2] == null) {
                    object3 = this.a.getCompoundDrawables();
                    object2 = this.a;
                    if (object7 == null) {
                        object7 = object3[0];
                    }
                    if (object5 == null) {
                        object5 = object3[1];
                    }
                    if (object6 == null) {
                        object6 = object3[2];
                    }
                    if (object == null) {
                        object = object3[3];
                    }
                    object2.setCompoundDrawablesWithIntrinsicBounds((Drawable)object7, (Drawable)object5, object6, (Drawable)object);
                } else {
                    object7 = this.a;
                    object6 = object2[0];
                    if (object5 == null) {
                        object5 = object2[1];
                    }
                    object3 = object2[2];
                    if (object == null) {
                        object = object2[3];
                    }
                    object7.setCompoundDrawablesRelativeWithIntrinsicBounds(object6, (Drawable)object5, object3, (Drawable)object);
                }
            }
        } else {
            object6 = this.a.getCompoundDrawablesRelative();
            object7 = this.a;
            if (object2 == null) {
                object2 = object6[0];
            }
            if (object5 == null) {
                object5 = object6[1];
            }
            if (object3 == null) {
                object3 = object6[2];
            }
            if (object == null) {
                object = object6[3];
            }
            object7.setCompoundDrawablesRelativeWithIntrinsicBounds(object2, (Drawable)object5, object3, (Drawable)object);
        }
        if (((L)object4).p(11)) {
            object = ((L)object4).c(11);
            TextViewCompat.setCompoundDrawableTintList((TextView)this.a, (ColorStateList)object);
        }
        if (((L)object4).p(12)) {
            object = v.c(((L)object4).i(12, -1), null);
            TextViewCompat.setCompoundDrawableTintMode((TextView)this.a, (PorterDuff.Mode)object);
        }
        n2 = ((L)object4).e(14, -1);
        n5 = ((L)object4).e(17, -1);
        n4 = ((L)object4).e(18, -1);
        ((L)object4).t();
        if (n2 != -1) {
            TextViewCompat.setFirstBaselineToTopHeight((TextView)this.a, (int)n2);
        }
        if (n5 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight((TextView)this.a, (int)n5);
        }
        if (n4 != -1) {
            TextViewCompat.setLineHeight((TextView)this.a, (int)n4);
        }
    }

    final void n(WeakReference<TextView> textView, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            if ((textView = (TextView)textView.get()) != null) {
                if (ViewCompat.isAttachedToWindow((View)textView)) {
                    textView.post((Runnable)new n(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    final void o() {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            this.i.a();
        }
    }

    final void p(Context object, int n2) {
        L l2 = L.q(object, n2, com.github.catvod.spider.merge.g.a.r);
        if (l2.p(14)) {
            boolean bl = l2.a(14, false);
            this.a.setAllCaps(bl);
        }
        if ((n2 = Build.VERSION.SDK_INT) < 23) {
            ColorStateList colorStateList;
            if (l2.p(3) && (colorStateList = l2.c(3)) != null) {
                this.a.setTextColor(colorStateList);
            }
            if (l2.p(5) && (colorStateList = l2.c(5)) != null) {
                this.a.setLinkTextColor(colorStateList);
            }
            if (l2.p(4) && (colorStateList = l2.c(4)) != null) {
                this.a.setHintTextColor(colorStateList);
            }
        }
        if (l2.p(0) && l2.e(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.w((Context)object, l2);
        if (n2 >= 26 && l2.p(13) && (object = l2.m(13)) != null) {
            this.a.setFontVariationSettings((String)object);
        }
        l2.t();
        object = this.l;
        if (object != null) {
            this.a.setTypeface((Typeface)object, this.j);
        }
    }

    final void q(int n2, int n3, int n4, int n5) {
        this.i.m(n2, n3, n4, n5);
    }

    final void r(int[] nArray, int n2) {
        this.i.n(nArray, n2);
    }

    final void s(int n2) {
        this.i.o(n2);
    }

    final void t(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new J();
        }
        J j2 = this.h;
        j2.a = colorStateList;
        boolean bl = colorStateList != null;
        j2.d = bl;
        this.b = j2;
        this.c = j2;
        this.d = j2;
        this.e = j2;
        this.f = j2;
        this.g = j2;
    }

    final void u(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new J();
        }
        J j2 = this.h;
        j2.b = mode;
        boolean bl = mode != null;
        j2.c = bl;
        this.b = j2;
        this.c = j2;
        this.d = j2;
        this.e = j2;
        this.f = j2;
        this.g = j2;
    }

    final void v(int n2, float f2) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !this.i.k()) {
            this.i.p(n2, f2);
        }
    }
}

