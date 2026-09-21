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
import com.github.catvod.spider.merge.I.O;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.d0.c;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class V
implements Runnable {
    public final int a;
    public final EditText b;
    public final DialogInterface.OnClickListener c;
    public final Object d;

    public /* synthetic */ V(Object object, EditText editText, DialogInterface.OnClickListener onClickListener, int n2) {
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
                X x2 = (X)this.d;
                EditText editText = this.b;
                DialogInterface.OnClickListener onClickListener = this.c;
                Objects.requireNonNull(x2);
                BaseApi.get().showThreadInputWithQRCode("\u8bbe\u7f6e\u5149\u9e2dToken", "", "\u5149\u9e2d\u4e91\u76d8\u626b\u7801", Server.u(), editText, onClickListener, new O(x2, 0));
                return;
            }
        }
        BaseApi baseApi = (BaseApi)this.d;
        EditText editText = this.b;
        DialogInterface.OnClickListener onClickListener = this.c;
        Objects.requireNonNull(baseApi);
        BaseApi baseApi2 = BaseApi.get();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a ");
        stringBuilder.append(baseApi.f);
        baseApi2.showThreadInputWithQRCode("\u8ba2\u9605\u5730\u5740 \u6216hiddify\u914d\u7f6e (\u7aef\u53e3:1072)", stringBuilder.toString(), "\u624b\u52a8\u9009\u62e9\u8282\u70b9", Server.u(), editText, onClickListener, com.github.catvod.spider.merge.d0.c.a);
    }
}

