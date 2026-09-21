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
import com.github.catvod.spider.merge.I.e;
import com.github.catvod.spider.merge.I.o;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.T.b;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class d
implements Runnable {
    public static final d b = new d(0);
    public static final d c = new d(1);
    public static final d d = new d(2);
    public final int a;

    public /* synthetic */ d(int n2) {
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
                Object object = ConfigCenter.n;
                object = L0.s().n;
                ((b)object).a();
                ((b)object).j();
                return;
            }
        }
        Object object = ConfigCenter.n;
        object = u.p();
        Objects.requireNonNull(object);
        EditText editText = BaseApi.get().initEditText();
        editText.setHint((CharSequence)"\u8f93\u5165\u7ebf\u7a0b\u6570");
        editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
        editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
        Init.run(new e(editText, new o((u)object, editText), 0));
    }
}

