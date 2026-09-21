/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 */
package com.github.catvod.spider.merge.g0;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.TgYunDouBanPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.c.b;
import com.github.catvod.spider.merge.g0.p;
import com.github.catvod.utils.server.Server;
import java.io.File;
import java.util.Objects;

public final class r
implements Runnable {
    public final TgYunDouBanPan a;
    public final String b;
    public final EditText c;
    public final DialogInterface.OnClickListener d;

    public /* synthetic */ r(TgYunDouBanPan tgYunDouBanPan, String string, EditText editText, DialogInterface.OnClickListener onClickListener) {
        this.a = tgYunDouBanPan;
        this.b = string;
        this.c = editText;
        this.d = onClickListener;
    }

    @Override
    public final void run() {
        TgYunDouBanPan tgYunDouBanPan = this.a;
        String string = this.b;
        EditText editText = this.c;
        DialogInterface.OnClickListener onClickListener = this.d;
        int n2 = TgYunDouBanPan.u;
        Objects.requireNonNull(tgYunDouBanPan);
        BaseApi baseApi = BaseApi.get();
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u8f38\u5165tg-api-session(v1) \n  \n \u5f53\u524d\u4e3a\uff1a");
        stringBuilder.append(com.github.catvod.spider.merge.c.b.d(new File(string)));
        baseApi.showThreadInputWithQRCode(stringBuilder.toString(), "", "tg\u5ba2\u6237\u7aef\u626b\u7801", Server.u(), editText, onClickListener, new p(tgYunDouBanPan));
    }
}

