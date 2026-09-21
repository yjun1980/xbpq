/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  androidx.appcompat.widget.Toolbar
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.M;
import com.github.catvod.spider.merge.n.u;

public final class N
implements u {
    Toolbar a;
    private int b;
    private View c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    CharSequence g;
    private CharSequence h;
    private CharSequence i;
    private int j = 0;
    private Drawable k;

    public N(Toolbar object) {
        this.a = object;
        this.g = object.r();
        this.h = object.q();
        this.f = object.p();
        Object object2 = object.getContext();
        Object object3 = com.github.catvod.spider.merge.g.a.a;
        object = null;
        object2 = L.s((Context)object2, null, object3, 2130903048, 0);
        this.k = ((L)object2).f(15);
        object3 = ((L)object2).n(27);
        if (!TextUtils.isEmpty((CharSequence)object3)) {
            this.g = object3;
            if ((this.b & 8) != 0) {
                this.a.I((CharSequence)object3);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)(object3 = (Object)((L)object2).n(25)))) {
            this.h = object3;
            if ((this.b & 8) != 0) {
                this.a.G((CharSequence)object3);
            }
        }
        if ((object3 = (Object)((L)object2).f(20)) != null) {
            this.e = (Drawable)object3;
            this.d();
        }
        if ((object3 = (Object)((L)object2).f(17)) != null) {
            this.d = (Drawable)object3;
            this.d();
        }
        if (this.f == null && (object3 = (Object)this.k) != null) {
            this.f = (Drawable)object3;
            this.c();
        }
        this.a(((L)object2).i(10, 0));
        int n2 = ((L)object2).l(9, 0);
        if (n2 != 0) {
            object3 = LayoutInflater.from((Context)this.a.getContext()).inflate(n2, (ViewGroup)this.a, false);
            View view = this.c;
            if (view != null && (this.b & 0x10) != 0) {
                this.a.removeView(view);
            }
            this.c = (View)object3;
            if (object3 != null && (this.b & 0x10) != 0) {
                this.a.addView((View)object3);
            }
            this.a(this.b | 0x10);
        }
        if ((n2 = ((L)object2).k(13)) > 0) {
            object3 = this.a.getLayoutParams();
            object3.height = n2;
            this.a.setLayoutParams((ViewGroup.LayoutParams)object3);
        }
        int n3 = ((L)object2).d(7, -1);
        n2 = ((L)object2).d(3, -1);
        if (n3 >= 0 || n2 >= 0) {
            this.a.A(Math.max(n3, 0), Math.max(n2, 0));
        }
        if ((n2 = ((L)object2).l(28, 0)) != 0) {
            object3 = this.a;
            object3.J(object3.getContext(), n2);
        }
        if ((n2 = ((L)object2).l(26, 0)) != 0) {
            object3 = this.a;
            object3.H(object3.getContext(), n2);
        }
        if ((n2 = ((L)object2).l(22, 0)) != 0) {
            this.a.F(n2);
        }
        ((L)object2).t();
        if (2131558401 != this.j) {
            this.j = 2131558401;
            if (TextUtils.isEmpty((CharSequence)this.a.o())) {
                n2 = this.j;
                if (n2 != 0) {
                    object = this.a.getContext().getString(n2);
                }
                this.i = object;
                this.b();
            }
        }
        this.i = this.a.o();
        this.a.E((View.OnClickListener)new M(this));
    }

    private void b() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty((CharSequence)this.i)) {
                Toolbar toolbar = this.a;
                int n2 = this.j;
                CharSequence charSequence = n2 != 0 ? toolbar.getContext().getText(n2) : null;
                toolbar.C(charSequence);
            } else {
                this.a.C(this.i);
            }
        }
    }

    private void c() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f;
            if (drawable == null) {
                drawable = this.k;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.D(drawable);
    }

    private void d() {
        Drawable drawable;
        int n2 = this.b;
        if ((n2 & 2) != 0) {
            if ((n2 & 1) == 0 || (drawable = this.e) == null) {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.a.B(drawable);
    }

    public final void a(int n2) {
        int n3 = this.b ^ n2;
        this.b = n2;
        if (n3 != 0) {
            Toolbar toolbar;
            if ((n3 & 4) != 0) {
                if ((n2 & 4) != 0) {
                    this.b();
                }
                this.c();
            }
            if ((n3 & 3) != 0) {
                this.d();
            }
            if ((n3 & 8) != 0) {
                CharSequence charSequence;
                if ((n2 & 8) != 0) {
                    this.a.I(this.g);
                    toolbar = this.a;
                    charSequence = this.h;
                } else {
                    toolbar = this.a;
                    charSequence = null;
                    toolbar.I(null);
                    toolbar = this.a;
                }
                toolbar.G(charSequence);
            }
            if ((n3 & 0x10) != 0 && (toolbar = this.c) != null) {
                if ((n2 & 0x10) != 0) {
                    this.a.addView((View)toolbar);
                } else {
                    this.a.removeView((View)toolbar);
                }
            }
        }
    }
}

