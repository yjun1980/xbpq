/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  androidx.core.internal.view.SupportMenuItem
 *  androidx.core.internal.view.SupportSubMenu
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
import com.github.catvod.spider.merge.m.j;
import com.github.catvod.spider.merge.m.q;
import com.github.catvod.spider.merge.q.n;

abstract class b {
    final Context a;
    private n<SupportMenuItem, MenuItem> b;
    private n<SupportSubMenu, SubMenu> c;

    b(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem)menuItem;
            if (this.b == null) {
                this.b = new n();
            }
            menuItem2 = menuItem = (MenuItem)this.b.getOrDefault(menuItem, null);
            if (menuItem == null) {
                menuItem2 = new j(this.a, supportMenuItem);
                this.b.put(supportMenuItem, menuItem2);
            }
        }
        return menuItem2;
    }

    final SubMenu b(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SubMenu subMenu2;
            SupportSubMenu supportSubMenu = (SupportSubMenu)subMenu;
            if (this.c == null) {
                this.c = new n();
            }
            subMenu = subMenu2 = (SubMenu)this.c.getOrDefault(supportSubMenu, null);
            if (subMenu2 == null) {
                subMenu = new q(this.a, supportSubMenu);
                this.c.put(supportSubMenu, subMenu);
            }
            return subMenu;
        }
        return subMenu;
    }

    final void c() {
        n<SupportMenuItem, MenuItem> n2 = this.b;
        if (n2 != null) {
            n2.clear();
        }
        if ((n2 = this.c) != null) {
            n2.clear();
        }
    }

    final void d(int n2) {
        if (this.b == null) {
            return;
        }
        int n3 = 0;
        while (n3 < this.b.size()) {
            int n4 = n3;
            if (this.b.h(n3).getGroupId() == n2) {
                this.b.i(n3);
                n4 = n3 - 1;
            }
            n3 = n4 + 1;
        }
    }

    final void e(int n2) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            if (this.b.h(i2).getItemId() != n2) continue;
            this.b.i(i2);
            break;
        }
    }
}

