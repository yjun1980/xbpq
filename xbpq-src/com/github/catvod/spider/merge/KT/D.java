/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.KT.a;
import com.github.catvod.spider.merge.KT.b;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.c0.f;
import java.util.Map;

public final class D
implements p {
    public final int a;

    public /* synthetic */ D(int n2) {
        this.a = n2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object invoke(Object object, Object object2) {
        f f2 = f.a;
        int n2 = this.a;
        Object object3 = (a)object;
        object = (b)object2;
        switch (n2) {
            default: {
                i.e(object3, "req");
                i.e(object, "response");
                try {
                    Object object4 = (String)((a)object3).c.get("key");
                    String string = (String)F.h.get(object4);
                    object2 = (Map)F.i.get(object4);
                    if (string != null && object2 != null) {
                        object4 = F.a;
                        F.i(string, (Map)object2, (a)object3, (b)object);
                        return f2;
                    }
                    object2 = new StringBuilder("proxy xenc missing key=");
                    ((StringBuilder)object2).append((String)object4);
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                    ((b)object).d = 404;
                    ((b)object).c = "text/plain";
                    ((b)object).b();
                    ((b)object).c("xenc key not found");
                    return f2;
                }
                catch (Exception exception) {}
                m.o("proxy xenc error: ", exception.getMessage());
                ((b)object).d = 500;
                ((b)object).c = "text/plain";
                ((b)object).b();
                String string = exception.getMessage();
                object3 = new StringBuilder("proxy xenc error: ");
                ((StringBuilder)object3).append(string);
                ((b)object).c(((StringBuilder)object3).toString());
                return f2;
            }
            case 1: {
                i.e(object3, "req");
                i.e(object, "response");
                try {
                    Object object5 = (String)((a)object3).c.get("key");
                    String string = (String)F.h.get(object5);
                    object2 = (Map)F.i.get(object5);
                    if (string != null && object2 != null) {
                        object5 = F.a;
                        F.h(string, (Map)object2, (a)object3, (b)object);
                        return f2;
                    }
                    object2 = new StringBuilder("proxy missing key=");
                    ((StringBuilder)object2).append((String)object5);
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                    ((b)object).d = 404;
                    ((b)object).c = "text/plain";
                    ((b)object).b();
                    ((b)object).c("proxy key not found");
                    return f2;
                }
                catch (Exception exception) {}
                m.o("proxy video error: ", exception.getMessage());
                return f2;
            }
            case 0: 
        }
        i.e(object3, "<unused var>");
        i.e(object, "response");
        ((b)object).c = "text/plain";
        ((b)object).b();
        ((b)object).c("OK");
        return f2;
        catch (Exception exception) {
            return f2;
        }
    }
}

