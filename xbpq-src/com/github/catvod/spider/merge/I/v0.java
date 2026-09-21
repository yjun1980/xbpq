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
import com.github.catvod.spider.merge.I.C0;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class v0
implements Runnable {
    public final L0 a;
    public final EditText b;
    public final DialogInterface.OnClickListener c;

    public /* synthetic */ v0(L0 l02, EditText editText, DialogInterface.OnClickListener onClickListener) {
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
        BaseApi.get().showThreadInputWithQRCode("\u8f38\u5165UC Token", "", "uc\u6d4f\u89c8\u5668\u626b\u7801", Server.u(), editText, onClickListener, new C0(l02));
    }
}

