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
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class w0
implements Runnable {
    public final L0 a;
    public final EditText b;
    public final DialogInterface.OnClickListener c;

    public /* synthetic */ w0(L0 l02, EditText editText, DialogInterface.OnClickListener onClickListener) {
        this.a = l02;
        this.b = editText;
        this.c = onClickListener;
    }

    @Override
    public final void run() {
        L0 l02 = this.a;
        EditText editText = this.b;
        DialogInterface.OnClickListener onClickListener = this.c;
        Objects.requireNonNull(l02);
        BaseApi baseApi = BaseApi.get();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
        stringBuilder.append(l02.n.h());
        baseApi.showThreadInputWithQRCode("\u8bbe\u7f6euc ut", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
    }
}

