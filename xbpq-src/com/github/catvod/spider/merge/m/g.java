/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.CollapsibleActionView
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.github.catvod.spider.merge.m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.l.b;

final class g
extends FrameLayout
implements b {
    final CollapsibleActionView a;

    g(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView)view;
        this.addView(view);
    }

    @Override
    public final void b() {
        this.a.onActionViewExpanded();
    }

    @Override
    public final void c() {
        this.a.onActionViewCollapsed();
    }
}

