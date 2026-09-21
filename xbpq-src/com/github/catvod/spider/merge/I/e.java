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
import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.L0;
import com.github.catvod.spider.merge.I.M;
import com.github.catvod.spider.merge.I.T0;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.I.t;
import com.github.catvod.spider.merge.I.u;
import com.github.catvod.spider.merge.J.i;
import com.github.catvod.spider.merge.O.b;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.i0.c;
import com.github.catvod.utils.server.Server;
import java.util.Objects;

public final class e
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ e(Object object, Object object2, int n2) {
        this.a = n2;
        this.b = object;
        this.c = object2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                var2_1 = (T0)this.b;
                var3_7 = (String)this.c;
                var1_11 = T0.i;
                Objects.requireNonNull(var2_1);
                try {
                    var2_1.v((String)var3_7, true);
                    var2_1.f.g();
                    var3_7 = new StringBuilder();
                    var3_7.append("\u8fc5\u96f7\u7f51\u76d8\u8d26\u53f7\u5bc6\u7801\u4e3a ");
                    var3_7.append(var2_1.f.e());
                    var3_7.append("|");
                    var3_7.append(var2_1.f.f());
                    com.github.catvod.spider.merge.i0.c.b(var3_7.toString());
                }
                catch (Exception var2_2) {
                    Init.show("\u8bf7\u8f93\u5165\u6b63\u786e\u7684\u5b57\u7b26\u4e32");
                }
                return;
            }
            case 3: {
                var2_3 = (L0)this.b;
                var3_8 = (String)this.c;
                Objects.requireNonNull(var2_3);
                try {
                    var2_3.n.c = Integer.parseInt((String)var3_8);
                    var2_3.n.j();
                    var3_8 = new StringBuilder();
                    var3_8.append("uc\u7ebf\u7a0b\u8bbe\u7f6e\u6210\u529f \u5f53\u524d\u4e3a");
                    var3_8.append(var2_3.n.c);
                    com.github.catvod.spider.merge.i0.c.b(var3_8.toString());
                }
                catch (Exception var2_4) {
                    Init.show("\u8acb\u8f38\u5165\u6b63\u78ba\u7684\u6578\u5b57");
                }
                return;
            }
            case 2: {
                M.e((M)this.b, (b)this.c);
                return;
            }
            case 1: {
                var3_9 = (u)this.b;
                var2_5 = (String)this.c;
                Objects.requireNonNull(var3_9);
                if (var2_5.startsWith("http")) ** GOTO lbl59
                if (var2_5.length() == 32) ** GOTO lbl60
                if (!var2_5.contains(":")) ** GOTO lbl61
                var2_5 = s.a("http://", var2_5, "/proxy?do=ali&type=token");
lbl59:
                // 2 sources

                var2_5 = d.k(var2_5);
lbl60:
                // 2 sources

                var3_9.a0(var2_5);
lbl61:
                // 2 sources

                return;
            }
            case 0: {
                var4_12 = (EditText)this.b;
                var5_13 = (DialogInterface.OnClickListener)this.c;
                var2_6 = BaseApi.get();
                var3_10 = com.github.catvod.spider.merge.C.a.c("\u5f53\u524d\u4e3a");
                var3_10.append(t.a.b);
                var2_6.showThreadInputWithQRCode("\u8bbe\u7f6e\u963f\u91cc\u7ebf\u7a0b\u6570", var3_10.toString(), "", Server.u(), var4_12, var5_13, null);
                return;
            }
        }
        i.a((i)this.b, (String)this.c);
    }
}

