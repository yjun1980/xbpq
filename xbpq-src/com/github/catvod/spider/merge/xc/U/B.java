/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.U.H;
import com.github.catvod.spider.merge.xc.a.a;

public final class B
implements Runnable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Runnable e;
    public final Runnable f;

    public /* synthetic */ B(String string, String string2, String string3, String string4, Runnable runnable, Runnable runnable2) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = runnable;
        this.f = runnable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        String string = this.a;
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        Object object = this.e;
        Runnable runnable = this.f;
        try {
            ContextWrapper contextWrapper = com.github.catvod.spider.merge.xc.a.a.D();
            LinearLayout linearLayout = new LinearLayout((Context)contextWrapper);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(C.j(26), C.j(22), C.j(26), C.j(22));
            linearLayout.setBackground((Drawable)com.github.catvod.spider.merge.xc.a.a.u(-1, C.j(20)));
            TextView textView = new TextView((Context)contextWrapper);
            textView.setText((CharSequence)string);
            textView.setTextColor(Color.rgb((int)17, (int)24, (int)39));
            textView.setTextSize(21.0f);
            textView.setTypeface(Typeface.DEFAULT, 1);
            textView.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
            TextView textView2 = new TextView((Context)contextWrapper);
            textView2.setText((CharSequence)string2);
            textView2.setTextColor(Color.rgb((int)75, (int)85, (int)99));
            textView2.setTextSize(15.0f);
            textView2.setPadding(0, C.j(8), 0, C.j(16));
            string2 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)textView2, (ViewGroup.LayoutParams)string2);
            string3 = com.github.catvod.spider.merge.xc.a.a.E(string3, true);
            string4 = com.github.catvod.spider.merge.xc.a.a.E(string4, false);
            string2 = new LinearLayout.LayoutParams(-1, C.j(54));
            linearLayout.addView((View)string3, (ViewGroup.LayoutParams)string2);
            string2 = new LinearLayout.LayoutParams(-1, C.j(54));
            string2.setMargins(0, C.j(12), 0, 0);
            linearLayout.addView((View)string4, (ViewGroup.LayoutParams)string2);
            string2 = new AlertDialog.Builder((Context)InitOrigin.getActivity());
            string2 = string2.create();
            H h2 = new H((AlertDialog)string2, (Runnable)object, 3);
            string3.setOnClickListener((View.OnClickListener)h2);
            object = new H((AlertDialog)string2, runnable, 4);
            string4.setOnClickListener((View.OnClickListener)object);
            string2.show();
            string2.setContentView((View)linearLayout);
            com.github.catvod.spider.merge.xc.a.a.B((AlertDialog)string2);
            runnable = string2.getWindow();
            if (runnable != null) {
                runnable.setLayout(Math.min(C.j(430), contextWrapper.getResources().getDisplayMetrics().widthPixels - C.j(44)), -2);
            }
            string3.requestFocus();
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("\u5931\u8d25");
            A.m(stringBuilder.toString());
        }
    }
}

