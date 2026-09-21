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
import com.github.catvod.spider.merge.I.W0;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.j;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class g
implements Runnable {
    public static final g b = new g(0);
    public static final g c = new g(1);
    public static final g d = new g(2);
    public static final g e = new g(3);
    public final int a;

    public /* synthetic */ g(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                String string = ConfigCenter.n;
                new Thread(e).start();
                return;
            }
            case 1: {
                Object object = ConfigCenter.n;
                object = a1.a();
                Objects.requireNonNull(object);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8f93\u5165\u76d8123\u8d26\u53f7\u5bc6\u7801 \u683c\u5f0f\uff1a18888888888|123456");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new j(object, editText, new W0(editText), 1));
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = s0.o().m;
                ((e)object).b();
                ((e)object).i();
                return;
            }
        }
        String string = ConfigCenter.n;
        BaseApi.get().showSubscriptionUrlInput();
    }
}

