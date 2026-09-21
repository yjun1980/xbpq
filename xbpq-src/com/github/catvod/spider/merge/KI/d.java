/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.view.MenuHostHelper
 *  androidx.core.view.MenuProvider
 */
package com.github.catvod.spider.merge.KI;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import com.github.catvod.spider.merge.Bk.g;
import com.github.catvod.spider.merge.Bk.h;
import com.github.catvod.spider.merge.Bk.j;
import com.github.catvod.spider.merge.Bk.k;

public final class d
implements j {
    public final MenuHostHelper a;
    public final h b;
    public final MenuProvider c;

    public /* synthetic */ d(MenuHostHelper menuHostHelper, h h2, MenuProvider menuProvider) {
        this.a = menuHostHelper;
        this.b = h2;
        this.c = menuProvider;
    }

    @Override
    public final void a(k k2, g g2) {
        MenuProvider menuProvider = this.c;
        MenuHostHelper.a((MenuHostHelper)this.a, (h)this.b, (MenuProvider)menuProvider, (k)k2, (g)g2);
    }
}

