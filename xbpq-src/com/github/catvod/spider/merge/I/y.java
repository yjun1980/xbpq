/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.I;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.A;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.i0;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class y
implements Runnable {
    public final int a;
    public final EditText b;
    public final DialogInterface.OnClickListener c;
    public final Object d;

    public /* synthetic */ y(Object object, EditText editText, DialogInterface.OnClickListener onClickListener, int n2) {
        this.a = n2;
        this.d = object;
        this.b = editText;
        this.c = onClickListener;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                s0 s02 = (s0)this.d;
                EditText editText = this.b;
                DialogInterface.OnClickListener onClickListener = this.c;
                Objects.requireNonNull(s02);
                BaseApi.get().showThreadInputWithQRCode("\u5938\u514bCookie", "", "\u5938\u514b\u6d4f\u89c8\u5668\u626b\u7801", Server.u(), editText, onClickListener, new i0(s02, 0));
                return;
            }
            case 0: {
                A a2 = (A)this.d;
                EditText editText = this.b;
                DialogInterface.OnClickListener onClickListener = this.c;
                Objects.requireNonNull(a2);
                BaseApi baseApi = BaseApi.get();
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
                stringBuilder.append(a2.b.a());
                baseApi.showThreadInputWithQRCode("\u8bbe\u7f6e\u6446\u6e21\u7ebf\u7a0b\u6570", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
                return;
            }
        }
        f1 f12 = (f1)this.d;
        EditText editText = this.b;
        DialogInterface.OnClickListener onClickListener = this.c;
        Objects.requireNonNull(f12);
        BaseApi baseApi = BaseApi.get();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a ");
        stringBuilder.append(f12.c.b);
        baseApi.showThreadInputWithQRCode("115 cookie", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
    }
}

