/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.widget.EditText
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.I;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.en.BaseApi;
import com.github.catvod.en.NetPan;
import com.github.catvod.en.NetPan$TermuxService;
import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.n;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.d0.f;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public final class k
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ k(Object object, Object object2, Object object3, int n2) {
        this.a = n2;
        this.d = object;
        this.b = object2;
        this.c = object3;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                BaseApi baseApi = (BaseApi)this.d;
                String string = (String)this.b;
                List list = (List)this.c;
                Objects.requireNonNull(baseApi);
                BaseApi.get().showInputWithOption("clashApiUi", new n(baseApi, 1), new f(baseApi), e.c("\u8bbe\u7f6e\u8282\u70b9 \n \u5f53\u524d ", string), "\u8bf7\u8f93\u5165\u8282\u70b9\u6216\u70b9\u51fb\u4e0a\u65b9\u9009\u9879", list);
                return;
            }
            case 1: {
                L0 l02 = (L0)this.d;
                EditText editText = (EditText)this.b;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)this.c;
                Objects.requireNonNull(l02);
                BaseApi baseApi = BaseApi.get();
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
                stringBuilder.append(l02.n.b());
                baseApi.showThreadInputWithQRCode("\u8bbe\u7f6euc\u7ebf\u7a0b\u6570", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
                return;
            }
            case 0: {
                u u2 = (u)this.d;
                EditText editText = (EditText)this.b;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)this.c;
                Objects.requireNonNull(u2);
                BaseApi.get().showThreadInputWithQRCode("\u8bbe\u7f6eToken", "", "\u963f\u91cc\u4e91\u76d8\u626b\u7801", Server.u(), editText, onClickListener, new n(u2, 0));
                return;
            }
        }
        Object object = (Context)this.d;
        NetPan$TermuxService netPan$TermuxService = (NetPan$TermuxService)this.b;
        Boolean bl = (Boolean)this.c;
        Serializable serializable = NetPan.a;
        try {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(netPan$TermuxService.e);
            ((StringBuilder)serializable).append(" -v");
            NetPan.runTermuxServiceCommand((Context)object, netPan$TermuxService, ((StringBuilder)serializable).toString(), bl);
        }
        catch (Exception exception) {
            object = com.github.catvod.spider.merge.C.a.c("Service test fail: ");
            ((StringBuilder)object).append(exception.getMessage());
            SpiderDebug.log((String)((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("\u6d4b\u8bd5\u6267\u884c\u5931\u8d25: ");
            ((StringBuilder)object).append(exception.getMessage());
            m.y(((StringBuilder)object).toString());
        }
    }
}

