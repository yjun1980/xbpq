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
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.i0;
import com.github.catvod.spider.merge.I.w0;
import com.github.catvod.spider.merge.g0.i;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class c
implements Runnable {
    public static final c b = new c(0);
    public static final c c = new c(1);
    public static final c d = new c(2);
    public final int a;

    public /* synthetic */ c(int n2) {
        this.a = n2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                String string = ConfigCenter.n;
                m.y("\u8bf7\u5230json\u6587\u4ef6\u4e2d\u914d\u7f6e");
                return;
            }
            case 0: {
                String string = ConfigCenter.n;
                L0 l02 = L0.s();
                Objects.requireNonNull(l02);
                string = BaseApi.get().initEditText();
                string.setHint((CharSequence)"\u8f93\u5165uc ut");
                string.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                string.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new w0(l02, (EditText)string, new i0(string, 1)));
                return;
            }
        }
        String string = ConfigCenter.n;
        new Thread(i.e).start();
    }
}

