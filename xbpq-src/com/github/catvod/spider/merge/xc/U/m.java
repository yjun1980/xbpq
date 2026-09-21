/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.xc.U;

import android.view.View;
import android.widget.EditText;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.a.a;

public final class m
implements View.OnFocusChangeListener {
    public final int a;
    public final EditText b;

    public /* synthetic */ m(EditText editText, int n2) {
        this.a = n2;
        this.b = editText;
    }

    public final void onFocusChange(View view, boolean bl) {
        switch (this.a) {
            default: {
                if (bl) {
                    com.github.catvod.spider.merge.xc.a.a.j(this.b);
                }
                return;
            }
            case 0: 
        }
        com.github.catvod.spider.merge.xc.D0.b.f(this.b, bl);
    }
}

