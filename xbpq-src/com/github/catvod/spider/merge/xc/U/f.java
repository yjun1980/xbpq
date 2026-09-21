/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.U.K;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class f
implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ f(EditText editText, AlertDialog alertDialog, K k2) {
        this.a = 1;
        this.c = editText;
        this.b = alertDialog;
        this.d = k2;
    }

    public /* synthetic */ f(Object object, Serializable serializable, Object object2, int n2) {
        this.a = n2;
        this.c = object;
        this.d = serializable;
        this.b = object2;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        Object object3 = this.d;
        Object object42 = this.c;
        switch (this.a) {
            default: {
                com.github.catvod.spider.merge.KT.f f2 = (com.github.catvod.spider.merge.KT.f)object42;
                object3 = (String)object3;
                object42 = "1";
                if (f2 == null) {
                    object3 = C.e("danmu", (String)object3, "1", "", "");
                } else {
                    String string = f2.c;
                    if (!C.B(string)) {
                        object3 = string;
                    } else {
                        string = f2.a;
                        if (!C.B(string)) {
                            object3 = string;
                        }
                        string = f2.b;
                        if (!C.B(string)) {
                            object42 = string;
                        }
                        object3 = C.e("danmu", (String)object3, (String)object42, "", "");
                    }
                }
                object = (AlertDialog)object.getRootView().getTag();
                if (object != null) {
                    object.dismiss();
                }
                t.c((Activity)object2, (String)object3);
                return;
            }
            case 1: {
                object = ((EditText)object42).getText().toString().trim();
                ((AlertDialog)object2).dismiss();
                ((K)object3).a((String)object);
                return;
            }
            case 0: 
        }
        for (Object object42 : (List)object42) {
            int n2 = (Integer)((Map)object3).get(object42);
            object = B.i;
            if ((n2 = Math.max(1, n2)) == B.j((String)object42)) {
                C.N("", B.G((String)object42));
                continue;
            }
            C.N(String.valueOf(n2), B.G((String)object42));
        }
        ((AlertDialog)object2).dismiss();
        com.github.catvod.spider.merge.xc.D0.b.L("\u8bbe\u7f6e\u5b8c\u6210", "\u7ebf\u7a0b\u8bbe\u7f6e\u5df2\u4fdd\u5b58");
    }
}

