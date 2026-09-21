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
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.I.X;
import com.github.catvod.spider.merge.I.a1;
import com.github.catvod.spider.merge.I.s0;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.c;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class h
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h(Object object, Object object2, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 5: {
                BaseApi.a((BaseApi)this.b, (String)this.c);
                return;
            }
            case 4: {
                EditText editText = (EditText)this.b;
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)this.c;
                BaseApi.get().showThreadInputWithQRCode("115 cookie", "", "", Server.u(), editText, onClickListener, null);
                return;
            }
            case 3: {
                a1 a12 = (a1)this.b;
                CharSequence charSequence = (String)this.c;
                int n2 = a1.i;
                Objects.requireNonNull(a12);
                try {
                    a12.k((String)charSequence, true);
                    a12.f.f();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("\u76d8123\u8d26\u53f7\u5bc6\u7801\u4e3a");
                    ((StringBuilder)charSequence).append(a12.f.d());
                    ((StringBuilder)charSequence).append("|");
                    ((StringBuilder)charSequence).append(a12.f.e());
                    com.github.catvod.spider.merge.i0.c.b(((StringBuilder)charSequence).toString());
                }
                catch (Exception exception) {
                    Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u5b57\u7b26\u4e32");
                }
                return;
            }
            case 2: {
                s0 s02 = (s0)this.b;
                String string = (String)this.c;
                Objects.requireNonNull(s02);
                String string2 = string;
                if (string.startsWith("http")) {
                    string2 = d.k(string);
                }
                s02.K(string2, true);
                return;
            }
            case 1: {
                X.i((X)this.b, (String)this.c);
                return;
            }
            case 0: {
                u.b((u)this.b, (com.github.catvod.spider.merge.L.c)this.c);
                return;
            }
        }
        Init.e((Init)this.b, (Boolean)this.c);
    }
}

