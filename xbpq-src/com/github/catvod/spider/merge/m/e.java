/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionProvider
 *  android.view.SubMenu
 *  android.view.View
 *  androidx.core.view.ActionProvider
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.ActionProvider;
import com.github.catvod.spider.merge.m.j;

class e
extends ActionProvider {
    final android.view.ActionProvider a;
    final j b;

    e(j j2, Context context, android.view.ActionProvider actionProvider) {
        this.b = j2;
        super(context);
        this.a = actionProvider;
    }

    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    public final View onCreateActionView() {
        return this.a.onCreateActionView();
    }

    public final boolean onPerformDefaultAction() {
        return this.a.onPerformDefaultAction();
    }

    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }
}

