/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.github.catvod.spider.merge.n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public final class a
extends ViewGroup.MarginLayoutParams {
    public a() {
        super(-1, -1);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

