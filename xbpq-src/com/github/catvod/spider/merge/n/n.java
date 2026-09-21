/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.n;

import android.graphics.Typeface;
import android.widget.TextView;

final class n
implements Runnable {
    final TextView a;
    final Typeface b;
    final int c;

    n(TextView textView, Typeface typeface, int n2) {
        this.a = textView;
        this.b = typeface;
        this.c = n2;
    }

    @Override
    public final void run() {
        this.a.setTypeface(this.b, this.c);
    }
}

