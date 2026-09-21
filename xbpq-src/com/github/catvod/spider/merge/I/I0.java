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
import com.github.catvod.spider.merge.I.B0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class I0
implements Runnable {
    public final int a;
    public final EditText b;
    public final DialogInterface.OnClickListener c;
    public final Object d;

    public /* synthetic */ I0(Object object, EditText editText, DialogInterface.OnClickListener onClickListener, int n2) {
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
            case 0: {
                L0 l02 = (L0)this.d;
                EditText editText = this.b;
                DialogInterface.OnClickListener onClickListener = this.c;
                Objects.requireNonNull(l02);
                BaseApi.get().showThreadInputWithQRCode("\u8f38\u5165UC Cookie", "", "uc\u6d4f\u89c8\u5668\u626b\u7801", Server.u(), editText, onClickListener, new B0(l02, 1));
                return;
            }
        }
        T0 t02 = (T0)this.d;
        EditText editText = this.b;
        DialogInterface.OnClickListener onClickListener = this.c;
        int n2 = T0.i;
        Objects.requireNonNull(t02);
        BaseApi baseApi = BaseApi.get();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a ");
        stringBuilder.append(t02.f.e());
        stringBuilder.append("|");
        stringBuilder.append(t02.f.f());
        baseApi.showThreadInputWithQRCode("\u8bbe\u7f6e\u8fc5\u96f7\u7f51\u76d8\u8d26\u53f7\u5bc6\u7801", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
    }
}

