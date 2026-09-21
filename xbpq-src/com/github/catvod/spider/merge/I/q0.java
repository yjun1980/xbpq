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
import com.github.catvod.en.NetPan;
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.f1;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class q0
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ q0(Object object, Object object2, Object object3, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                s0 s02 = (s0)this.b;
                EditText editText = (EditText)this.c;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)this.d;
                Objects.requireNonNull(s02);
                BaseApi baseApi = BaseApi.get();
                StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
                stringBuilder.append(s02.m.c());
                baseApi.showThreadInputWithQRCode("\u8bbe\u7f6e\u5938\u514b\u7ebf\u7a0b\u6570", stringBuilder.toString(), "", Server.u(), editText, onClickListener, null);
                return;
            }
        }
        f1 f12 = (f1)this.b;
        String[] stringArray = (String[])this.c;
        String string = (String)this.d;
        Objects.requireNonNull(f12);
        try {
            Thread.sleep(3000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        if (!NetPan.isYunSelf115(stringArray[0])) {
            f12.a(string);
        }
    }
}

