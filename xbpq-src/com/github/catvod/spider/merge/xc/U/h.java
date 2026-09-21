/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.xc.D0.b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public final class h
implements View.OnClickListener {
    public final int a;
    public final List b;
    public final AlertDialog c;

    public /* synthetic */ h(ArrayList arrayList, AlertDialog alertDialog, int n2) {
        this.a = n2;
        this.b = arrayList;
        this.c = alertDialog;
    }

    public final void onClick(View object) {
        Object object2 = this.c;
        object = this.b;
        switch (this.a) {
            default: {
                AbstractCollection abstractCollection = B.i;
                abstractCollection = new ArrayList();
                if (object != null) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        B.a((String)object.next(), (ArrayList)abstractCollection);
                    }
                }
                object = B.k.iterator();
                while (object.hasNext()) {
                    B.a((String)object.next(), (ArrayList)abstractCollection);
                }
                C.N(TextUtils.join((CharSequence)",", (Iterable)abstractCollection), "pan_order");
                object2.dismiss();
                com.github.catvod.spider.merge.xc.D0.b.L("\u8bbe\u7f6e\u5b8c\u6210", "\u7f51\u76d8\u64ad\u653e\u987a\u5e8f\u5df2\u66f4\u65b0\u3002");
                return;
            }
            case 0: 
        }
        B.A((ArrayList)object);
        object2.dismiss();
        object2 = new StringBuilder("\u5df2\u542f\u7528\uff1a");
        if (object != null && !object.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : new ArrayList(B.k)) {
                if (!object.contains(string)) continue;
                arrayList.add(B.m(string));
            }
            object = TextUtils.join((CharSequence)"\u3001", arrayList);
        } else {
            object = "\u65e0";
        }
        ((StringBuilder)object2).append((String)object);
        com.github.catvod.spider.merge.xc.D0.b.L("\u8bbe\u7f6e\u5b8c\u6210", ((StringBuilder)object2).toString());
    }
}

