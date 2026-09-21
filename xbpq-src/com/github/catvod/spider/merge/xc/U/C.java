/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.EditText
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.xc.U.I;

public final class C
implements View.OnClickListener {
    public final int a;
    public final EditText b;
    public final Button c;
    public final AlertDialog d;

    public /* synthetic */ C(EditText editText, Button button, AlertDialog alertDialog, int n2) {
        this.a = n2;
        this.b = editText;
        this.c = button;
        this.d = alertDialog;
    }

    public final void onClick(View object) {
        switch (this.a) {
            default: {
                object = this.b.getText().toString().trim();
                if (((String)object).isEmpty()) {
                    A.m("\u8bf7\u8f93\u5165\u624b\u673a\u53f7");
                } else {
                    Button button = this.c;
                    button.setEnabled(false);
                    button.setText((CharSequence)"\u53d1\u9001\u4e2d");
                    InitOrigin.execute((Runnable)new I((String)object, button, this.d, 1));
                }
                return;
            }
            case 0: 
        }
        object = this.b.getText().toString().trim();
        if (((String)object).isEmpty()) {
            A.m("\u8bf7\u8f93\u5165\u624b\u673a\u53f7");
        } else {
            Button button = this.c;
            button.setEnabled(false);
            button.setText((CharSequence)"\u53d1\u9001\u4e2d");
            InitOrigin.execute((Runnable)new I((String)object, button, this.d, 0));
        }
    }
}

