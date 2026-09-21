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
import com.github.catvod.spider.merge.I.P;
import com.github.catvod.spider.merge.I.P0;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.V;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.z;
import com.github.catvod.spider.merge.N.i;
import com.github.catvod.spider.merge.W.a;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class U
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ U(Object object, int n2) {
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
                a a2 = (a)this.b;
                Objects.requireNonNull(a2);
                int n2 = T0.i;
                Objects.requireNonNull(P0.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("xunlei_user"), a2.toString());
                return;
            }
            case 1: {
                i i2 = (i)this.b;
                Objects.requireNonNull(i2);
                Objects.requireNonNull(z.a);
                com.github.catvod.spider.merge.c.b.f(com.github.catvod.spider.merge.c.b.e("baidu_user"), i2.toString());
                return;
            }
            case 0: {
                X x2 = (X)this.b;
                Objects.requireNonNull(x2);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8acb\u8f38\u5165Refresh Token");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new V(x2, editText, new P(x2, editText), 0));
                return;
            }
        }
        ((MainActivity)this.b).i();
    }
}

