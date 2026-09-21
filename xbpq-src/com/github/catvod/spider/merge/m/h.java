/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 */
package com.github.catvod.spider.merge.m;

import android.view.MenuItem;
import com.github.catvod.spider.merge.m.j;

final class h
implements MenuItem.OnActionExpandListener {
    private final MenuItem.OnActionExpandListener a;
    final j b;

    h(j j2, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = j2;
        this.a = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.a(menuItem));
    }
}

