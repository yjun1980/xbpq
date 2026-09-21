/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.Context
 *  android.content.ContextWrapper
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
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.j;
import com.github.catvod.spider.merge.xc.U.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class g
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;

    public /* synthetic */ g(Activity activity, String string, String string2, ArrayList arrayList) {
        this.a = 2;
        this.b = activity;
        this.c = string;
        this.e = string2;
        this.d = arrayList;
    }

    public /* synthetic */ g(Object object, Object object2, Object object3, Serializable serializable, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = serializable;
    }

    @Override
    public final void run() {
        Object object = this.e;
        Object object2 = this.c;
        Object object3 = this.b;
        Object object4 = this.d;
        switch (this.a) {
            default: {
                ArrayList arrayList = (ArrayList)((List)object4);
                t.s((Activity)object3, (String)object2, (String)object, arrayList);
                return;
            }
            case 1: {
                object3 = (String)object3;
                ArrayList arrayList = C.S((String)object3);
                object4 = (Activity)object4;
                object = (String)object;
                Init.run(new j((AlertDialog)object2, (Activity)object4, (String)object3, (String)object, arrayList));
                return;
            }
            case 0: 
        }
        LinearLayout linearLayout = (LinearLayout)object3;
        linearLayout.removeAllViews();
        object3 = B.i;
        ArrayList arrayList = new ArrayList(B.k);
        for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
            Object object5 = (Context)object2;
            LinearLayout linearLayout2 = new LinearLayout(object5);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            String string = (String)arrayList.get(i2);
            ArrayList arrayList2 = (ArrayList)((List)object4);
            Runnable[] runnableArray = B.m(string);
            boolean bl = arrayList2.contains(string);
            String string2 = " \u5df2\u5173\u95ed";
            object3 = bl ? " \u5df2\u542f\u7528" : " \u5df2\u5173\u95ed";
            object3 = runnableArray.concat((String)object3);
            bl = arrayList2.contains(string);
            runnableArray = (Runnable[])object;
            Object object6 = new q(arrayList2, string, runnableArray, 0);
            string = (ContextWrapper)object5;
            linearLayout2.addView((View)com.github.catvod.spider.merge.xc.D0.b.B((ContextWrapper)string, i2, (String)object3, bl, (Runnable)object6), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(true));
            int n2 = i2 + 1;
            if (n2 < arrayList.size()) {
                object5 = (String)arrayList.get(n2);
                object6 = B.m((String)object5);
                object3 = string2;
                if (arrayList2.contains(object5)) {
                    object3 = " \u5df2\u542f\u7528";
                }
                linearLayout2.addView((View)com.github.catvod.spider.merge.xc.D0.b.B((ContextWrapper)string, n2, ((String)object6).concat((String)object3), arrayList2.contains(object5), new q(arrayList2, (String)object5, runnableArray, 1)), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            } else {
                linearLayout2.addView(new View(object5), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            }
            linearLayout.addView((View)linearLayout2, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, C.j(52)));
        }
    }
}

