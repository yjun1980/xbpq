/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.github.catvod.spider.merge.h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class a
extends ViewGroup.MarginLayoutParams {
    public int a;

    public a() {
        super(-2, -2);
        this.a = 8388627;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        context = context.obtainStyledAttributes(attributeSet, com.github.catvod.spider.merge.g.a.b);
        this.a = context.getInt(0, 0);
        context.recycle();
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public a(a a2) {
        super((ViewGroup.MarginLayoutParams)a2);
        this.a = 0;
        this.a = a2.a;
    }
}

