/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.g0;

import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.I0;
import com.github.catvod.spider.merge.I.N0;
import com.github.catvod.spider.merge.I.T;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.d;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class f
implements Runnable {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public static final f d = new f(2);
    public final int a;

    public /* synthetic */ f(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                Object object = ConfigCenter.n;
                object = T0.g();
                Objects.requireNonNull(object);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8f93\u5165\u8fc5\u96f7\u7f51\u76d8\u8d26\u53f7\u5bc6\u7801 \u683c\u5f0f\uff1a18888888888|123456");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new I0(object, editText, new N0(editText), 1));
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = f1.c();
                Objects.requireNonNull(object);
                Init.run(new T(object, 1));
                return;
            }
        }
        Object object = ConfigCenter.n;
        object = u.p();
        Objects.requireNonNull(object);
        Init.run(new d(object, 0));
    }
}

