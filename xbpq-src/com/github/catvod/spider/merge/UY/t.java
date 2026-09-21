/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.github.catvod.spider.InitOrigin
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.s;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.K.a;
import com.github.catvod.spider.merge.xc.r0.e;

public abstract class t {
    public static String a = "";
    public static String b = "";
    public static String c = "";
    public static long d;

    static {
        com.github.catvod.spider.merge.xc.K.c c2 = com.github.catvod.spider.merge.xc.K.a.b().a();
        CharSequence charSequence = c2.d();
        String string = "";
        String string2 = charSequence;
        if (charSequence == null) {
            string2 = "";
        }
        b = string2;
        charSequence = c2.c();
        string2 = charSequence;
        if (charSequence == null) {
            string2 = "";
        }
        c = string2;
        string2 = c2.a();
        if (string2 == null) {
            string2 = string;
        }
        a = string2;
        d = c2.b();
        string2 = b;
        string = e.e0(10, a);
        long l2 = d;
        charSequence = new StringBuilder("Pan123 init: userName=");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", auth=");
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append("..., expire=");
        ((StringBuilder)charSequence).append(l2);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        if (com.github.catvod.spider.merge.xc.A0.c.d(b) && com.github.catvod.spider.merge.xc.A0.c.d(c)) {
            if (!com.github.catvod.spider.merge.xc.A0.c.b(a) && d != 0L && System.currentTimeMillis() <= d) {
                SpiderDebug.log((String)"Pan123: \u51ed\u8bc1\u6709\u6548\uff0c\u65e0\u9700\u767b\u5f55");
            } else {
                SpiderDebug.log((String)"Pan123: auth \u4e3a\u7a7a\u6216\u5df2\u8fc7\u671f\uff0c\u81ea\u52a8\u91cd\u65b0\u767b\u5f55");
                InitOrigin.execute((Runnable)new s(0));
            }
        } else {
            SpiderDebug.log((String)"Pan123: userName/passwd \u4e3a\u7a7a\uff0c\u9700\u8981\u624b\u52a8\u767b\u5f55");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        a = "";
        b = "";
        c = "";
        d = 0L;
        com.github.catvod.spider.merge.xc.K.a.b().d(new com.github.catvod.spider.merge.xc.K.c());
        C.b0("pan123", "");
        Object object = com.github.catvod.spider.merge.xc.K.a.d;
        synchronized (object) {
            com.github.catvod.spider.merge.xc.K.a.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String charSequence, String charSequence2) {
        Exception exception2;
        block3: {
            StringBuilder stringBuilder = new StringBuilder("loginWithPassword  uname: ");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("\uff0cpasswd\uff1a");
            stringBuilder.append((String)charSequence2);
            SpiderDebug.log((String)stringBuilder.toString());
            try {
                i.b(charSequence);
                i.b(charSequence2);
                stringBuilder = com.github.catvod.spider.merge.xc.D0.b.t((String)charSequence, (String)charSequence2);
                if (stringBuilder != null) {
                    com.github.catvod.spider.merge.xc.K.c c2 = new com.github.catvod.spider.merge.xc.K.c();
                    c2.e(stringBuilder.get("token").getAsString());
                    c2.g((String)charSequence2);
                    c2.h((String)charSequence);
                    c2.f(stringBuilder.get("refresh_token_expire_time").getAsLong() * (long)1000);
                    a = stringBuilder.get("token").getAsString();
                    b = charSequence;
                    c = charSequence2;
                    d = c2.b();
                    com.github.catvod.spider.merge.xc.K.a.b().d(c2);
                    A.m("123\u767b\u5f55\u6210\u529f");
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            A.m("123\u767b\u5f55\u5931\u8d25");
            return;
        }
        charSequence2 = exception2.getMessage();
        charSequence = new StringBuilder("\u767b\u5f55\u5931\u8d25: ");
        ((StringBuilder)charSequence).append((String)charSequence2);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
        charSequence = exception2.getMessage();
        charSequence2 = new StringBuilder("123\u767b\u5f55\u5931\u8d25: ");
        ((StringBuilder)charSequence2).append((String)charSequence);
        A.m(((StringBuilder)charSequence2).toString());
    }
}

