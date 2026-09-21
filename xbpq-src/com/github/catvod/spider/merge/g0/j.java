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
import com.github.catvod.spider.merge.I.B0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.k;
import com.github.catvod.spider.merge.R.c;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class j
implements Runnable {
    public static final j b = new j(0);
    public static final j c = new j(1);
    public static final j d = new j(2);
    public static final j e = new j(3);
    public static final j f = new j(4);
    public final int a;

    public /* synthetic */ j(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                String string = ConfigCenter.n;
                BaseApi.get().showSingBoxInputWithOption();
                return;
            }
            case 2: {
                String string = ConfigCenter.n;
                BaseApi.get().setNetPanIso();
                return;
            }
            case 1: {
                Object object = ConfigCenter.n;
                object = a1.a().f;
                ((c)object).a();
                ((c)object).f();
                return;
            }
            case 0: {
                Object object = ConfigCenter.n;
                object = L0.s();
                Objects.requireNonNull(object);
                EditText editText = BaseApi.get().initEditText();
                editText.setHint((CharSequence)"\u8f93\u5165\u7ebf\u7a0b\u6570");
                editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new k(object, editText, new B0(editText, 0), 1));
                return;
            }
        }
        try {
            while (true) {
                Thread.sleep(2000L);
                BaseApi.monitorCurrentActivityButtons();
            }
        }
        catch (Exception exception) {
            return;
        }
    }
}

