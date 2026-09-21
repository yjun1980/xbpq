/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.g0;

import android.content.Context;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.O;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.q0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.w;
import com.github.catvod.spider.merge.I.y;
import com.github.catvod.spider.merge.i0.m;
import java.util.Objects;

public final class h
implements Runnable {
    public static final h b = new h(0);
    public static final h c = new h(1);
    public static final h d = new h(2);
    public static final h e = new h(3);
    public final int a;

    public /* synthetic */ h(int n2) {
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
                BaseApi.get().showNetPanOrderInputWithOption();
                return;
            }
            case 1: {
                String string = ConfigCenter.n;
                f1 f12 = f1.c();
                Objects.requireNonNull(f12);
                string = BaseApi.get().initEditText();
                string.setHint((CharSequence)"\u8acb\u8f38\u5165115 \u5b89\u5168\u5220\u9664\u7801");
                string.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
                string.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
                Init.run(new y(f12, (EditText)string, new w(f12, (EditText)string, 2), 2));
                return;
            }
            case 0: {
                CharSequence charSequence = ConfigCenter.n;
                Init.get().exeFileProxy((Context)Init.context(), Boolean.FALSE);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("\u6b63\u5728\u542f\u52a8filebrowser \u8d26\u53f7\u5bc6\u7801\u90fd\u662fadmin \u8bf7\u7a0d\u540e\u5728\u6d4f\u89c8\u5668\u8f93\u5165 ");
                ((StringBuilder)charSequence).append(ConfigCenter.n);
                ((StringBuilder)charSequence).append(" \u8bbf\u95ee");
                m.y(((StringBuilder)charSequence).toString());
                return;
            }
        }
        Object object = ConfigCenter.n;
        object = s0.o();
        Objects.requireNonNull(object);
        EditText editText = BaseApi.get().initEditText();
        editText.setHint((CharSequence)"\u8f93\u5165\u7ebf\u7a0b\u6570");
        editText.setPadding(m.e(8), m.e(8), m.e(8), m.e(8));
        editText.setBackground(BaseApi.createRoundedBackground(-3355444, m.e(8)));
        Init.run(new q0(object, editText, new O(editText, 1), 0));
    }
}

