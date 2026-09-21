/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.text.TextUtils
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.UY.b;
import com.github.catvod.spider.merge.xc.U.u;

public final class E
implements View.OnClickListener {
    public final int a;
    public final AlertDialog b;
    public final EditText c;
    public final KeyEvent.Callback d;
    public final Object e;

    public /* synthetic */ E(Activity activity, AlertDialog alertDialog, s s2, s s3) {
        this.a = 1;
        this.e = activity;
        this.b = alertDialog;
        this.c = s2;
        this.d = s3;
    }

    public /* synthetic */ E(EditText editText, EditText editText2, AlertDialog alertDialog, u u2) {
        this.a = 0;
        this.c = editText;
        this.d = editText2;
        this.b = alertDialog;
        this.e = u2;
    }

    public /* synthetic */ E(s s2, AlertDialog alertDialog, Activity activity, String string) {
        this.a = 2;
        this.c = s2;
        this.b = alertDialog;
        this.d = activity;
        this.e = string;
    }

    public final void onClick(View object) {
        switch (this.a) {
            default: {
                object = Boolean.FALSE;
                EditText editText = this.c;
                editText.setTag(object);
                object = editText.getText() == null ? "" : editText.getText().toString().trim();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    this.b.dismiss();
                    Init.execute(new b((String)object, (Object)((Activity)this.d), (String)this.e, 6));
                }
                return;
            }
            case 1: {
                object = this.c.getText().toString();
                String string = ((EditText)this.d).getText().toString();
                t.q((Activity)this.e, this.b, (String)object, string);
                return;
            }
            case 0: 
        }
        String string = this.c.getText().toString().trim();
        object = ((EditText)this.d).getText().toString().trim();
        this.b.dismiss();
        ((u)this.e).b(string, (String)object);
    }
}

