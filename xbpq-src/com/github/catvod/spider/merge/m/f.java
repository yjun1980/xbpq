/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionProvider
 *  android.view.ActionProvider$VisibilityListener
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.core.view.ActionProvider$VisibilityListener
 */
package com.github.catvod.spider.merge.m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.ActionProvider;
import com.github.catvod.spider.merge.m.e;
import com.github.catvod.spider.merge.m.j;

final class f
extends e
implements ActionProvider.VisibilityListener {
    private ActionProvider.VisibilityListener c;

    f(j j2, Context context, ActionProvider actionProvider) {
        super(j2, context, actionProvider);
    }

    public final boolean isVisible() {
        return this.a.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean bl) {
        ActionProvider.VisibilityListener visibilityListener = this.c;
        if (visibilityListener != null) {
            visibilityListener.onActionProviderVisibilityChanged(bl);
        }
    }

    public final View onCreateActionView(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    public final boolean overridesItemVisibility() {
        return this.a.overridesItemVisibility();
    }

    public final void refreshVisibility() {
        this.a.refreshVisibility();
    }

    public final void setVisibilityListener(ActionProvider.VisibilityListener object) {
        this.c = object;
        ActionProvider actionProvider = this.a;
        object = object != null ? this : null;
        actionProvider.setVisibilityListener((ActionProvider.VisibilityListener)object);
    }
}

