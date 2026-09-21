/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.github.catvod.spider.merge.xc.U;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
implements Runnable {
    public final LinearLayout a;
    public final List b;
    public final int[] c;
    public final TextView d;
    public final Map e;
    public final Context f;
    public final Runnable[] g;

    public /* synthetic */ d(LinearLayout linearLayout, ArrayList arrayList, int[] nArray, TextView textView, HashMap hashMap, ContextWrapper contextWrapper, Runnable[] runnableArray) {
        this.a = linearLayout;
        this.b = arrayList;
        this.c = nArray;
        this.d = textView;
        this.e = hashMap;
        this.f = contextWrapper;
        this.g = runnableArray;
    }

    @Override
    public final void run() {
        LinearLayout linearLayout = this.a;
        linearLayout.removeAllViews();
        int[] nArray = this.c;
        int n2 = nArray[0];
        List list = this.b;
        String string = (String)list.get(n2);
        CharSequence charSequence = new StringBuilder();
        charSequence.append(B.m(string));
        charSequence.append("\uff1a");
        Map map = this.e;
        charSequence.append(map.get(string));
        charSequence.append("\u7ebf\u7a0b");
        charSequence = charSequence.toString();
        this.d.setText(charSequence);
        for (n2 = 0; n2 < list.size(); n2 += 2) {
            string = this.f;
            charSequence = new LinearLayout((Context)string);
            charSequence.setOrientation(0);
            charSequence.setGravity(17);
            Runnable[] runnableArray = (Runnable[])list.get(n2);
            HashMap hashMap = (HashMap)map;
            String string2 = com.github.catvod.spider.merge.xc.D0.b.M((String)runnableArray, hashMap);
            int n3 = nArray[0];
            boolean bl = true;
            boolean bl2 = n3 == n2;
            runnableArray = this.g;
            l l2 = new l(nArray, n2, runnableArray, 0);
            ContextWrapper contextWrapper = (ContextWrapper)string;
            charSequence.addView((View)com.github.catvod.spider.merge.xc.D0.b.B(contextWrapper, n2, string2, bl2, l2), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(true));
            n3 = n2 + 1;
            if (n3 < list.size()) {
                string = com.github.catvod.spider.merge.xc.D0.b.M((String)list.get(n3), hashMap);
                bl2 = nArray[0] == n3 ? bl : false;
                charSequence.addView((View)com.github.catvod.spider.merge.xc.D0.b.B(contextWrapper, n3, string, bl2, new l(nArray, n3, runnableArray, 1)), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            } else {
                charSequence.addView(new View((Context)string), (ViewGroup.LayoutParams)com.github.catvod.spider.merge.xc.D0.b.C(false));
            }
            linearLayout.addView((View)charSequence, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, C.j(52)));
        }
    }
}

