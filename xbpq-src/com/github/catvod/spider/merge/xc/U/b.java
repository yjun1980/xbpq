/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.TextView
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.xc.U;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.B;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.J;
import com.github.catvod.spider.merge.KT.t;
import com.github.catvod.spider.merge.UY.f;

public final class b
implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final TextView c;

    public /* synthetic */ b(EditText editText, AlertDialog alertDialog) {
        this.a = 0;
        this.c = editText;
        this.b = alertDialog;
    }

    public /* synthetic */ b(Object object, TextView textView, int n2) {
        this.a = n2;
        this.b = object;
        this.c = textView;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View object) {
        boolean bl;
        block12: {
            switch (this.a) {
                default: {
                    t.r((Activity)this.b, (EditText)this.c);
                    return;
                }
                case 1: {
                    boolean bl2 = B.q();
                    bl = bl2 ^ true;
                    C.N(bl, "go_proxy_enabled");
                    C.N(bl2, "go_proxy_user_disabled");
                    if (bl) break block12;
                    B b2 = B.l;
                    synchronized (b2) {
                        Process process = b2.a;
                        if (process != null) {
                            process.destroy();
                        }
                        break block11;
                    }
                }
                case 0: {
                    void var1_8;
                    String string = ((EditText)this.c).getText().toString();
                    byte[] byArray = J.a;
                    String string2 = string;
                    if (string == null) {
                        String string3 = "";
                    }
                    C.N(var1_8, "xenc_password");
                    ((AlertDialog)this.b).dismiss();
                    com.github.catvod.spider.merge.xc.D0.b.L("\u8bbe\u7f6e\u5b8c\u6210", "XENC\u89e3\u5bc6\u5bc6\u7801\u5df2\u4fdd\u5b58\u3002");
                    return;
                }
            }
            {
                block11: {
                    catch (Throwable throwable) {}
                }
                b2.a = null;
                b2.e = false;
            }
        }
        AlertDialog alertDialog = (AlertDialog)this.b;
        if (!bl) {
            alertDialog.dismiss();
            com.github.catvod.spider.merge.xc.D0.b.L("Go\u4ee3\u7406\u5df2\u5173\u95ed", "\u64ad\u653e\u5df2\u6062\u590d\u4f7f\u7528 Java \u4ee3\u7406\u3002");
            return;
        }
        this.c.setText((CharSequence)"\u72b6\u6001\uff1a\u4e0b\u8f7d/\u542f\u52a8\u4e2d...");
        InitOrigin.execute((Runnable)new f(6, alertDialog));
    }
}

