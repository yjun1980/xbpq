/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.D0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.v0;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class H0
implements Runnable {
    public final int a;
    public final L0 b;

    public /* synthetic */ H0(L0 l02, int n2) {
        this.a = n2;
        this.b = l02;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                L0.h(this.b);
                return;
            }
        }
        L0 l02 = this.b;
        Objects.requireNonNull(l02);
        EditText editText = BaseApi.get().initEditText();
        editText.setHint((CharSequence)"\u8acb\u8f38\u5165UC Token");
        editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
        editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
        Init.run(new v0(l02, editText, new D0(l02, editText)));
    }
}

