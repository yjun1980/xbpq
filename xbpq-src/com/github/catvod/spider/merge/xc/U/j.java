/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class j
implements Runnable {
    public final int a;
    public final List b;
    public final KeyEvent.Callback c;
    public final Context d;
    public final Serializable e;
    public final Serializable f;

    public /* synthetic */ j(AlertDialog alertDialog, Activity activity, String string, String string2, ArrayList arrayList) {
        this.a = 1;
        this.c = alertDialog;
        this.d = activity;
        this.e = string;
        this.f = string2;
        this.b = arrayList;
    }

    public /* synthetic */ j(LinearLayout linearLayout, ArrayList arrayList, ContextWrapper contextWrapper, int[] nArray, Runnable[] runnableArray) {
        this.a = 0;
        this.c = linearLayout;
        this.b = arrayList;
        this.d = contextWrapper;
        this.e = nArray;
        this.f = runnableArray;
    }

    @Override
    public final void run() {
        List list;
        switch (this.a) {
            default: {
                ((AlertDialog)this.c).dismiss();
                ArrayList arrayList = (ArrayList)this.b;
                t.s((Activity)this.d, (String)((Object)this.e), (String)((Object)this.f), arrayList);
                return;
            }
            case 0: 
        }
        LinearLayout linearLayout = (LinearLayout)this.c;
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < (list = this.b).size(); i2 += 2) {
            Object object = this.d;
            LinearLayout linearLayout2 = new LinearLayout(object);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            String string = B.m((String)list.get(i2));
            int[] nArray = (int[])this.e;
            int n2 = nArray[0];
            boolean bl = true;
            boolean bl2 = n2 == i2;
            Runnable[] runnableArray = (Runnable[])this.f;
            l l2 = new l(nArray, i2, runnableArray, 2);
            ContextWrapper contextWrapper = (ContextWrapper)object;
            linearLayout2.addView((View)com.github.catvod.spider.merge.xc.D0.b.B(contextWrapper, i2, string, bl2, l2), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(true));
            n2 = i2 + 1;
            if (n2 < list.size()) {
                object = B.m((String)list.get(n2));
                bl2 = nArray[0] == n2 ? bl : false;
                linearLayout2.addView((View)com.github.catvod.spider.merge.xc.D0.b.B(contextWrapper, n2, (String)object, bl2, new l(nArray, n2, runnableArray, 3)), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            } else {
                linearLayout2.addView(new View(object), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            }
            linearLayout.addView((View)linearLayout2, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, C.j(52)));
        }
    }
}

