/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.appcompat.view.menu.i
 *  androidx.appcompat.view.menu.k
 *  androidx.appcompat.view.menu.r
 *  androidx.appcompat.widget.ActionMenuView
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import com.github.catvod.spider.merge.m.k;
import com.github.catvod.spider.merge.m.l;
import com.github.catvod.spider.merge.m.m;
import java.util.ArrayList;

public abstract class a
implements l {
    protected Context a;
    protected Context b;
    protected i c;
    protected LayoutInflater d;
    private k e;
    private int f;
    protected ActionMenuView g;

    public a(Context context) {
        this.a = context;
        this.d = LayoutInflater.from((Context)context);
        this.f = 2131427330;
    }

    @Override
    public void a(i i2, boolean bl) {
        k k2 = this.e;
        if (k2 != null) {
            k2.a(i2, bl);
        }
    }

    @Override
    public final boolean b(androidx.appcompat.view.menu.k k2) {
        return false;
    }

    public abstract void c(androidx.appcompat.view.menu.k var1, m var2);

    protected abstract boolean e(ViewGroup var1, int var2);

    @Override
    public void f(Context context, i i2) {
        this.b = context;
        LayoutInflater.from((Context)context);
        this.c = i2;
    }

    @Override
    public final void g(k k2) {
        this.e = k2;
    }

    public final k h() {
        return this.e;
    }

    public View i(androidx.appcompat.view.menu.k k2, View object, ViewGroup viewGroup) {
        object = object instanceof m ? (m)object : (m)this.d.inflate(this.f, viewGroup, false);
        this.c(k2, (m)object);
        return object;
    }

    @Override
    public final boolean j(androidx.appcompat.view.menu.k k2) {
        return false;
    }

    @Override
    public boolean k(r r2) {
        k k2 = this.e;
        if (k2 != null) {
            if (r2 == null) {
                r2 = this.c;
            }
            return k2.b((i)r2);
        }
        return false;
    }

    @Override
    public void l(boolean bl) {
        ActionMenuView actionMenuView = this.g;
        if (actionMenuView == null) {
            return;
        }
        Object object = this.c;
        int n2 = 0;
        if (object != null) {
            object.j();
            ArrayList arrayList = this.c.p();
            int n3 = arrayList.size();
            n2 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                androidx.appcompat.view.menu.k k2 = (androidx.appcompat.view.menu.k)arrayList.get(i2);
                int n4 = n2;
                if (this.m(k2)) {
                    View view = actionMenuView.getChildAt(n2);
                    object = view instanceof m ? ((m)view).c() : null;
                    View view2 = this.i(k2, view, (ViewGroup)actionMenuView);
                    if (k2 != object) {
                        view2.setPressed(false);
                        view2.jumpDrawablesToCurrentState();
                    }
                    if (view2 != view) {
                        object = (ViewGroup)view2.getParent();
                        if (object != null) {
                            object.removeView(view2);
                        }
                        this.g.addView(view2, n2);
                    }
                    n4 = n2 + 1;
                }
                n2 = n4;
            }
        }
        while (n2 < actionMenuView.getChildCount()) {
            if (this.e((ViewGroup)actionMenuView, n2)) continue;
            ++n2;
        }
    }

    public abstract boolean m(androidx.appcompat.view.menu.k var1);
}

