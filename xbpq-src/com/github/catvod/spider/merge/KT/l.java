/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class l
implements View.OnKeyListener {
    public final EditText a;
    public final EditText b;
    public final Activity c;

    public /* synthetic */ l(s s2, s s3, Activity activity) {
        this.a = s2;
        this.b = s3;
        this.c = activity;
    }

    public final boolean onKey(View view, int n2, KeyEvent keyEvent) {
        view = this.a;
        boolean bl = t.l((s)view, n2, keyEvent);
        boolean bl2 = true;
        if (!bl) {
            if (keyEvent.getAction() == 1 && n2 == 20) {
                this.b.requestFocus();
            } else if (keyEvent.getAction() == 1 && (n2 == 23 || n2 == 66)) {
                t.r(this.c, (EditText)view);
            } else {
                bl2 = false;
            }
        }
        return bl2;
    }
}

