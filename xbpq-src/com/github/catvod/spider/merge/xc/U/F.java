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
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.U.D;
import com.github.catvod.spider.merge.xc.U.K;
import com.github.catvod.spider.merge.xc.U.f;
import com.github.catvod.spider.merge.xc.U.t;
import com.github.catvod.spider.merge.xc.a.a;

public final class F
implements Runnable {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final K f;

    public /* synthetic */ F(String string, String string2, String string3, String string4, K k2) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = false;
        this.e = string4;
        this.f = k2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        String string = this.a;
        Object object = this.b;
        String string2 = this.c;
        boolean bl = this.d;
        String string3 = this.e;
        Object object2 = this.f;
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
            textView = new TextView((Context)contextWrapper);
            textView.setText((CharSequence)object);
            textView.setTextColor(Color.rgb((int)75, (int)85, (int)99));
            textView.setTextSize(15.0f);
            textView.setPadding(0, C.j(8), 0, C.j(16));
            object = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)object);
            string2 = com.github.catvod.spider.merge.xc.a.a.G(string2, bl);
            object = new LinearLayout.LayoutParams(-1, C.j(58));
            linearLayout.addView((View)string2, (ViewGroup.LayoutParams)object);
            textView = new View((Context)contextWrapper);
            object = new LinearLayout.LayoutParams(1, C.j(18));
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)object);
            textView = new LinearLayout((Context)contextWrapper);
            textView.setOrientation(0);
            object = com.github.catvod.spider.merge.xc.a.a.E("\u53d6\u6d88", false);
            string3 = com.github.catvod.spider.merge.xc.a.a.E(string3, true);
            textView.addView((View)object, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(true));
            textView.addView((View)string3, (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.a.a.F(false));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C.j(52));
            linearLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams2);
            textView = new AlertDialog.Builder((Context)InitOrigin.getActivity());
            textView = textView.create();
            t t2 = new t((AlertDialog)textView, 4);
            object.setOnClickListener((View.OnClickListener)t2);
            object = new f((EditText)string2, (AlertDialog)textView, (K)object2);
            string3.setOnClickListener((View.OnClickListener)object);
            object2 = new D((Button)string3, 3);
            string2.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
            textView.show();
            textView.setContentView((View)linearLayout);
            com.github.catvod.spider.merge.xc.a.a.B((AlertDialog)textView);
            linearLayout = textView.getWindow();
            if (linearLayout != null) {
                linearLayout.setLayout(Math.min(C.j(430), contextWrapper.getResources().getDisplayMetrics().widthPixels - C.j(44)), -2);
                linearLayout.clearFlags(131072);
                linearLayout.setSoftInputMode(21);
            }
            com.github.catvod.spider.merge.xc.a.a.j((EditText)string2);
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

