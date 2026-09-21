/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  androidx.appcompat.view.menu.k
 *  androidx.core.view.ActionProvider
 *  androidx.core.view.MenuItemCompat
 */
package com.github.catvod.spider.merge.l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import com.github.catvod.spider.merge.g.a;
import com.github.catvod.spider.merge.l.c;
import com.github.catvod.spider.merge.l.e;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.n.L;
import com.github.catvod.spider.merge.n.v;

final class d {
    private CharSequence A;
    private CharSequence B;
    private ColorStateList C;
    private PorterDuff.Mode D;
    final e E;
    private Menu a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private CharSequence k;
    private CharSequence l;
    private int m;
    private char n;
    private int o;
    private char p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private String x;
    private String y;
    ActionProvider z;

    public d(e e2, Menu menu) {
        this.E = e2;
        this.C = null;
        this.D = null;
        this.a = menu;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    private <T> T d(String string, Class<?>[] object, Object[] object2) {
        try {
            object = Class.forName(string, false, this.E.c.getClassLoader()).getConstructor((Class<?>)object);
            object.setAccessible(true);
            object = object.newInstance((Object[])object2);
        }
        catch (Exception exception) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Cannot instantiate class: ");
            ((StringBuilder)object2).append(string);
            Log.w((String)"SupportMenuInflater", (String)((StringBuilder)object2).toString(), (Throwable)exception);
            return null;
        }
        return (T)object;
    }

    private void h(MenuItem menuItem) {
        Object object = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        int n2 = this.r;
        boolean bl = false;
        boolean bl2 = n2 >= 1;
        object.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
        n2 = this.v;
        if (n2 >= 0) {
            menuItem.setShowAsAction(n2);
        }
        if (this.y != null) {
            if (!this.E.c.isRestricted()) {
                menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new c(this.E.b(), this.y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof k) {
                ((k)menuItem).o(true);
            } else if (menuItem instanceof j) {
                ((j)menuItem).f();
            }
        }
        if ((object = this.x) != null) {
            menuItem.setActionView((View)this.d((String)object, com.github.catvod.spider.merge.l.e.e, this.E.a));
            bl = true;
        }
        if ((n2 = this.w) > 0) {
            if (!bl) {
                menuItem.setActionView(n2);
            } else {
                Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if ((object = this.z) != null) {
            MenuItemCompat.setActionProvider((MenuItem)menuItem, (ActionProvider)object);
        }
        MenuItemCompat.setContentDescription((MenuItem)menuItem, (CharSequence)this.A);
        MenuItemCompat.setTooltipText((MenuItem)menuItem, (CharSequence)this.B);
        MenuItemCompat.setAlphabeticShortcut((MenuItem)menuItem, (char)this.n, (int)this.o);
        MenuItemCompat.setNumericShortcut((MenuItem)menuItem, (char)this.p, (int)this.q);
        object = this.D;
        if (object != null) {
            MenuItemCompat.setIconTintMode((MenuItem)menuItem, (PorterDuff.Mode)object);
        }
        if ((object = this.C) != null) {
            MenuItemCompat.setIconTintList((MenuItem)menuItem, (ColorStateList)object);
        }
    }

    public final void a() {
        this.h = true;
        this.h(this.a.add(this.b, this.i, this.j, this.k));
    }

    public final SubMenu b() {
        this.h = true;
        SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        this.h(subMenu.getItem());
        return subMenu;
    }

    public final boolean c() {
        return this.h;
    }

    public final void e(AttributeSet attributeSet) {
        attributeSet = this.E.c.obtainStyledAttributes(attributeSet, com.github.catvod.spider.merge.g.a.l);
        this.b = attributeSet.getResourceId(1, 0);
        this.c = attributeSet.getInt(3, 0);
        this.d = attributeSet.getInt(4, 0);
        this.e = attributeSet.getInt(5, 0);
        this.f = attributeSet.getBoolean(2, true);
        this.g = attributeSet.getBoolean(0, true);
        attributeSet.recycle();
    }

    public final void f(AttributeSet object) {
        object = L.r(this.E.c, (AttributeSet)object, com.github.catvod.spider.merge.g.a.m);
        this.i = ((L)object).l(2, 0);
        this.j = ((L)object).i(5, this.c) & 0xFFFF0000 | ((L)object).i(6, this.d) & 0xFFFF;
        this.k = ((L)object).n(7);
        this.l = ((L)object).n(8);
        this.m = ((L)object).l(0, 0);
        String string = ((L)object).m(9);
        char c2 = string == null ? (char)'\u0000' : string.charAt(0);
        this.n = c2;
        this.o = ((L)object).i(16, 4096);
        string = ((L)object).m(10);
        c2 = string == null ? (char)'\u0000' : string.charAt(0);
        this.p = c2;
        this.q = ((L)object).i(20, 4096);
        int n2 = ((L)object).p(11) ? (int)(((L)object).a(11, false) ? 1 : 0) : this.e;
        this.r = n2;
        this.s = ((L)object).a(3, false);
        this.t = ((L)object).a(4, this.f);
        boolean bl = this.g;
        n2 = 1;
        this.u = ((L)object).a(1, bl);
        this.v = ((L)object).i(21, -1);
        this.y = ((L)object).m(12);
        this.w = ((L)object).l(13, 0);
        this.x = ((L)object).m(15);
        string = ((L)object).m(14);
        if (string == null) {
            n2 = 0;
        }
        if (n2 != 0 && this.w == 0 && this.x == null) {
            this.z = (ActionProvider)this.d(string, com.github.catvod.spider.merge.l.e.f, this.E.b);
        } else {
            if (n2 != 0) {
                Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.z = null;
        }
        this.A = ((L)object).n(17);
        this.B = ((L)object).n(22);
        this.D = ((L)object).p(19) ? com.github.catvod.spider.merge.n.v.c(((L)object).i(19, -1), this.D) : null;
        this.C = ((L)object).p(18) ? ((L)object).c(18) : null;
        ((L)object).t();
        this.h = false;
    }

    public final void g() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }
}

