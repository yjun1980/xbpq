/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.text.TextPaint
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.widget.Scroller
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.h0;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import android.widget.TextView;

public final class a
extends TextView {
    private final Scroller a;
    private int b;

    public a(Context context) {
        super(context, null, 16842884);
        this.setSingleLine();
        this.setEllipsize(null);
        this.setHorizontallyScrolling(true);
        context = new Scroller(this.getContext(), (Interpolator)new LinearInterpolator());
        this.a = context;
        this.setScroller((Scroller)context);
    }

    public final void a(int n2) {
        this.b = n2;
    }

    public final void b() {
        Scroller scroller = this.a;
        int n2 = -this.getWidth();
        TextPaint textPaint = this.getPaint();
        Rect rect = new Rect();
        String string = this.getText().toString();
        textPaint.getTextBounds(string, 0, string.length(), rect);
        int n3 = rect.width();
        scroller.startScroll(n2, 0, this.getWidth() + n3, 0, this.b * 1000);
    }

    public final void computeScroll() {
        super.computeScroll();
        Scroller scroller = this.a;
        if (scroller != null && scroller.isFinished()) {
            scroller = this.a;
            if (scroller != null) {
                scroller.abortAnimation();
            }
            this.setVisibility(8);
        }
    }
}

