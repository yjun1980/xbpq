/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.text.method.LinkMovementMethod
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.HorizontalScrollView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.af;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.af.j;

public final class k
extends HorizontalScrollView {
    private TextView a;
    private TextView b;
    private int c;
    private int d;
    private int e = 0;
    private int f = 0;
    private int g = 100;
    private int h = 1;
    private ValueAnimator i;
    ValueAnimator.AnimatorUpdateListener j = new j(this);

    public k(Context context) {
        super(context, null, 0);
        context = new RelativeLayout(this.getContext());
        context.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        this.addView((View)context);
        this.a = this.j();
        this.b = this.j();
        context.addView((View)this.a);
        context.addView((View)this.b);
        context = ValueAnimator.ofFloat((float[])new float[]{0.0f, this.d});
        this.i = context;
        context.addUpdateListener(this.j);
        this.i.setRepeatCount(-1);
        this.i.setRepeatMode(1);
    }

    static /* synthetic */ int a(k k2) {
        return k2.e;
    }

    static /* synthetic */ int b(k k2, int n2) {
        k2.e = n2;
        return n2;
    }

    static /* synthetic */ int c(k k2, int n2) {
        k2.e = n2 = k2.e - n2;
        return n2;
    }

    static /* synthetic */ int d(k k2) {
        return k2.h;
    }

    static /* synthetic */ int e(k k2) {
        return k2.f;
    }

    static /* synthetic */ int f(k k2, int n2) {
        k2.f = n2;
        return n2;
    }

    static /* synthetic */ int g(k k2, int n2) {
        k2.f = n2 = k2.f - n2;
        return n2;
    }

    static /* synthetic */ int h(k k2) {
        return k2.d;
    }

    static /* synthetic */ int i(k k2) {
        return k2.g;
    }

    private TextView j() {
        TextView textView = new TextView(this.getContext());
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine();
        textView.setTextSize(20.0f);
        textView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1));
        textView.setGravity(16);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return textView;
    }

    public final void k(CharSequence charSequence) {
        int n2;
        this.a.setText(charSequence);
        this.b.setText(charSequence);
        this.d = n2 = (int)this.a.getPaint().measureText(charSequence, 0, charSequence.length());
        this.e = 0;
        this.f = n2 += this.g;
        this.b.setX((float)n2);
        this.invalidate();
        n2 = this.d;
        if (n2 > this.c) {
            this.i.setDuration((long)n2);
            this.m();
            this.i.start();
        } else {
            this.m();
        }
    }

    public final void l(int n2) {
        this.a.setTextColor(n2);
        this.b.setTextColor(n2);
    }

    public final void m() {
        int n2;
        this.i.cancel();
        this.e = 0;
        this.f = n2 = this.d + this.g;
        this.b.setX((float)n2);
        this.invalidate();
    }

    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas = this.a;
        if (canvas != null && this.b != null) {
            canvas.setX((float)this.e);
            this.b.setX((float)this.f);
        }
    }

    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        this.c = this.getMeasuredWidth();
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        n2 = this.d;
        if (n2 > this.c) {
            this.i.setDuration((long)n2);
            this.m();
            this.i.start();
        } else {
            this.m();
        }
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}

