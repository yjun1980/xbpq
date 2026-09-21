/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import android.widget.EditText;

public final class a
implements View.OnClickListener {
    public final int a;
    public final EditText b;

    public /* synthetic */ a(EditText editText, int n2) {
        this.a = n2;
        this.b = editText;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                com.github.catvod.spider.merge.xc.a.a.j(this.b);
                return;
            }
            case 0: 
        }
        this.b.setText((CharSequence)"");
    }
}

