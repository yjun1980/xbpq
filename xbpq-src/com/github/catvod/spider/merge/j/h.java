/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.github.catvod.spider.merge.j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.k;

final class h
implements View.OnClickListener {
    h() {
    }

    public final void onClick(View view) {
        if (k.r()) {
            k.s(k.r() ^ true);
            k.o().setText((CharSequence)cYh.d("85C6E1"));
            k.t();
        } else {
            k.s(k.r() ^ true);
            k.o().setText((CharSequence)cYh.d("84D3FD"));
            k.v().getWindow().setLayout(-1, -1);
        }
        k.u().setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
        k.u().requestFocus();
    }
}

