/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  androidx.core.internal.view.SupportMenu
 *  androidx.core.internal.view.SupportSubMenu
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportSubMenu;
import com.github.catvod.spider.merge.m.o;

final class q
extends o
implements SubMenu {
    private final SupportSubMenu e;

    q(Context context, SupportSubMenu supportSubMenu) {
        super(context, (SupportMenu)supportSubMenu);
        this.e = supportSubMenu;
    }

    public final void clearHeader() {
        this.e.clearHeader();
    }

    public final MenuItem getItem() {
        return this.a(this.e.getItem());
    }

    public final SubMenu setHeaderIcon(int n2) {
        this.e.setHeaderIcon(n2);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int n2) {
        this.e.setHeaderTitle(n2);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int n2) {
        this.e.setIcon(n2);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }
}

