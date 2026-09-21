/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import android.content.Intent;
import android.net.Uri;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.S;

public final class Q
implements Runnable {
    public final int a;
    public final S b;

    public /* synthetic */ Q(S s2, int n2) {
        this.a = n2;
        this.b = s2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                S s2 = this.b;
                s2.getClass();
                try {
                    s2.c();
                    return;
                }
                catch (Exception exception) {
                    m.m(exception, new StringBuilder("[UCTV] \u68c0\u67e5\u626b\u7801\u72b6\u6001\u5931\u8d25: "));
                }
                return;
            }
            case 5: {
                this.b.m();
                return;
            }
            case 4: {
                this.b.m();
                return;
            }
            case 3: {
                S s3 = this.b;
                if (!s3.h.isEmpty() && s3.h.startsWith("http")) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)s3.h));
                        intent.setPackage("com.UCMobile");
                        intent.addFlags(0x10000000);
                        InitOrigin.context().startActivity(intent);
                        A.m("\u5df2\u8df3\u8f6cUC APP\uff0c\u8bf7\u786e\u8ba4\u6388\u6743");
                        Q q2 = new Q(s3, 5);
                        InitOrigin.execute((Runnable)q2);
                        return;
                    }
                    catch (Exception exception) {
                        m.m(exception, new StringBuilder("[UCTV] UC APP\u8df3\u8f6c\u5931\u8d25\uff0c\u663e\u793a\u4e8c\u7ef4\u7801\u515c\u5e95: "));
                        s3.l(s3.h);
                    }
                } else {
                    s3.k(s3.g);
                }
                A.m("UC APP\u672a\u5b89\u88c5\uff0c\u8bf7\u626b\u63cf\u4e8c\u7ef4\u7801\u6388\u6743");
                return;
            }
            case 2: {
                this.b.m();
                return;
            }
            case 1: {
                S s4 = this.b;
                if (!s4.h.isEmpty() && s4.h.startsWith("http")) {
                    s4.l(s4.h);
                } else {
                    s4.k(s4.g);
                }
                A.m("\u8bf7\u4f7f\u7528UC\u7f51\u76d8APP\u626b\u63cf\u4e8c\u7ef4\u7801");
                return;
            }
            case 0: 
        }
        S s5 = this.b;
        s5.getClass();
        try {
            s5 = s5.f;
            if (s5 == null) return;
            s5.dismiss();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

