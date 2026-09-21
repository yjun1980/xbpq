/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.view.KeyEvent
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class i
implements TextView.OnEditorActionListener {
    public final EditText a;
    public final EditText b;
    public final Activity c;
    public final AlertDialog d;

    public /* synthetic */ i(Activity activity, AlertDialog alertDialog, s s2, s s3) {
        this.a = s2;
        this.b = s3;
        this.c = activity;
        this.d = alertDialog;
    }

    public final boolean onEditorAction(TextView object, int n2, KeyEvent object2) {
        object2 = Boolean.FALSE;
        EditText editText = this.a;
        editText.setTag(object2);
        object = this.b;
        object.setTag(object2);
        object2 = editText.getText().toString();
        object = object.getText().toString();
        t.q(this.c, this.d, (String)object2, (String)object);
        return true;
    }
}

