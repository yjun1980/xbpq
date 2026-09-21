/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.TextView$OnEditorActionListener
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.merge.KT.i;
import com.github.catvod.spider.merge.KT.l;
import com.github.catvod.spider.merge.KT.m;
import com.github.catvod.spider.merge.KT.n;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.xc.U.E;

public final class h
implements DialogInterface.OnShowListener {
    public final AlertDialog a;
    public final Button b;
    public final Button c;
    public final Activity d;
    public final EditText e;
    public final EditText f;

    public /* synthetic */ h(AlertDialog alertDialog, Button button, Button button2, Activity activity, s s2, s s3) {
        this.a = alertDialog;
        this.b = button;
        this.c = button2;
        this.d = activity;
        this.e = s2;
        this.f = s3;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.a;
        t.u(alertDialog);
        com.github.catvod.spider.merge.xc.U.t t2 = new com.github.catvod.spider.merge.xc.U.t(alertDialog, 5);
        dialogInterface = this.b;
        dialogInterface.setOnClickListener((View.OnClickListener)t2);
        EditText editText = this.e;
        s s2 = (s)editText;
        EditText editText2 = this.f;
        Object object = (s)editText2;
        t2 = this.d;
        object = new E((Activity)t2, alertDialog, s2, (s)((Object)object));
        s2 = this.c;
        s2.setOnClickListener((View.OnClickListener)object);
        editText.setNextFocusDownId(-1);
        editText2.setNextFocusUpId(-1);
        editText2.setNextFocusDownId(-1);
        dialogInterface.setNextFocusRightId(-1);
        s2.setNextFocusLeftId(-1);
        s s3 = (s)editText;
        object = (s)editText2;
        editText.setOnKeyListener((View.OnKeyListener)new l(s3, (s)((Object)object), (Activity)t2));
        editText2.setOnKeyListener((View.OnKeyListener)new m((s)((Object)object), s3, (Button)s2, (Activity)t2));
        dialogInterface.setOnKeyListener((View.OnKeyListener)new n((Button)s2, (s)((Object)object), 0));
        s2.setOnKeyListener(new n((Button)dialogInterface, (s)((Object)object), 1));
        editText.setOnEditorActionListener((TextView.OnEditorActionListener)new i((Activity)t2, alertDialog, s3, (s)((Object)object)));
        editText.requestFocus();
        dialogInterface = alertDialog.getWindow();
        if (dialogInterface != null) {
            dialogInterface.setSoftInputMode(3);
        }
    }
}

