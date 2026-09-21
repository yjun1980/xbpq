/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnKeyListener
 *  android.widget.Button
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.KT;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.github.catvod.spider.merge.KT.s;
import com.github.catvod.spider.merge.KT.t;

public final class n
implements View.OnKeyListener {
    public final int a;
    public final KeyEvent.Callback b;
    public final EditText c;

    public /* synthetic */ n(Activity activity, s s2) {
        this.a = 2;
        this.c = s2;
        this.b = activity;
    }

    public /* synthetic */ n(Button button, s s2, int n2) {
        this.a = n2;
        this.b = button;
        this.c = s2;
    }

    public final boolean onKey(View view, int n2, KeyEvent keyEvent) {
        switch (this.a) {
            default: {
                view = this.c;
                boolean bl = t.l((s)view, n2, keyEvent);
                boolean bl2 = true;
                if (!bl) {
                    if (keyEvent.getAction() == 1 && (n2 == 23 || n2 == 66)) {
                        t.r((Activity)this.b, (EditText)view);
                    } else {
                        bl2 = false;
                    }
                }
                return bl2;
            }
            case 1: {
                int n3 = keyEvent.getAction();
                boolean bl = true;
                if (n3 == 1 && n2 == 21) {
                    ((Button)this.b).requestFocus();
                } else if (keyEvent.getAction() == 1 && n2 == 19) {
                    this.c.requestFocus();
                } else {
                    bl = false;
                }
                return bl;
            }
            case 0: 
        }
        int n4 = keyEvent.getAction();
        boolean bl = true;
        if (n4 == 1 && n2 == 22) {
            ((Button)this.b).requestFocus();
        } else if (keyEvent.getAction() == 1 && n2 == 19) {
            this.c.requestFocus();
        } else {
            bl = false;
        }
        return bl;
    }
}

