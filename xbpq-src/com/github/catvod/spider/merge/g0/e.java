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
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.w;
import com.github.catvod.spider.merge.I.y;
import com.github.catvod.spider.merge.W.a;
import com.github.catvod.spider.merge.b0.c;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class e
implements Runnable {
    public static final e b = new e(0);
    public static final e c = new e(1);
    public static final e d = new e(2);
    public final int a;

    public /* synthetic */ e(int n2) {
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
                object = T0.g().f;
                ((a)object).a();
                ((a)object).g();
                m.y("\u5df2\u6e05\u9664\u8fc5\u96f7\u672c\u5730\u8d26\u53f7");
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = f1.c().c;
                ((c)object).a();
                ((c)object).c();
                return;
            }
        }
        String string = ConfigCenter.n;
        A a2 = A.a();
        Objects.requireNonNull(a2);
        string = BaseApi.get().initEditText();
        string.setHint((CharSequence)"\u8f93\u5165\u7ebf\u7a0b\u6570");
        string.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
        string.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
        Init.run(new y(a2, (EditText)string, new w(a2, (EditText)string, 0), 0));
    }
}

