/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.view.Window
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.KT;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Window;
import android.widget.EditText;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class o
implements DialogInterface.OnShowListener {
    public final AlertDialog a;
    public final EditText b;

    public /* synthetic */ o(AlertDialog alertDialog, s s2) {
        this.a = alertDialog;
        this.b = s2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        dialogInterface = this.a;
        t.u((AlertDialog)dialogInterface);
        Window window = dialogInterface.getWindow();
        if (window != null) {
            window.getDecorView().setTag((Object)dialogInterface);
        }
        this.b.clearFocus();
    }
}

