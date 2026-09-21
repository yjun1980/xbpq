/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 *  com.github.catvod.demo.MainActivity
 */
package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.d1;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.h;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class T
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ T(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                ((MainActivity)this.b).j();
                return;
            }
            case 1: {
                f1 f12 = (f1)this.b;
                Objects.requireNonNull(f12);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8acb\u8f38\u5165115 cookie");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new h(editText, new d1(f12, editText, 0), 4));
                return;
            }
            case 0: {
                X.h((X)this.b);
                return;
            }
        }
        Init.g((Init)this.b);
    }
}

