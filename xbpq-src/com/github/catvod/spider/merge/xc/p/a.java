/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  androidx.core.internal.view.SupportMenuItem
 */
package com.github.catvod.spider.merge.xc.p;

import android.view.MenuItem;
import androidx.core.internal.view.SupportMenuItem;

public abstract class a {
    public static /* bridge */ /* synthetic */ MenuItem a(SupportMenuItem supportMenuItem, CharSequence charSequence) {
        return supportMenuItem.setContentDescription(charSequence);
    }

    public static /* bridge */ /* synthetic */ MenuItem b(SupportMenuItem supportMenuItem, CharSequence charSequence) {
        return supportMenuItem.setTooltipText(charSequence);
    }
}

