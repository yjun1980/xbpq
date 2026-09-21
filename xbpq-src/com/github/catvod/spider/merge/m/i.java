/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
package com.github.catvod.spider.merge.m;

import android.view.MenuItem;
import com.github.catvod.spider.merge.m.j;

final class i
implements MenuItem.OnMenuItemClickListener {
    private final MenuItem.OnMenuItemClickListener a;
    final j b;

    i(j j2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.b = j2;
        this.a = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onMenuItemClick(this.b.a(menuItem));
    }
}

