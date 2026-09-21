/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.KT.F;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Callable;

public final class E
implements Callable {
    public final long a;
    public final long b;
    public final String c;
    public final Map d;
    public final int e;

    public /* synthetic */ E(long l2, long l3, String string, Map map, int n2) {
        this.a = l2;
        this.b = l3;
        this.c = string;
        this.d = map;
        this.e = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable2;
        Object object;
        block6: {
            Object object2;
            block5: {
                object2 = this.c;
                i.e(object2, "$url");
                Object object3 = this.d;
                i.e(object3, "$headers");
                object = F.a;
                object = F.l((Map)object3);
                long l2 = this.e;
                long l3 = this.a;
                long l4 = l3 + l2;
                long l5 = this.b;
                l2 += l5;
                object3 = new StringBuilder("getVideoChunk: ");
                ((StringBuilder)object3).append(l3);
                ((StringBuilder)object3).append("-");
                ((StringBuilder)object3).append(l5);
                ((StringBuilder)object3).append(" upstream=");
                ((StringBuilder)object3).append(l4);
                ((StringBuilder)object3).append("-");
                ((StringBuilder)object3).append(l2);
                SpiderDebug.log((String)((StringBuilder)object3).toString());
                object3 = new StringBuilder("bytes=");
                ((StringBuilder)object3).append(l4);
                ((StringBuilder)object3).append("-");
                ((StringBuilder)object3).append(l2);
                object.put("Range", ((StringBuilder)object3).toString());
                object.remove("range");
                object = A.i((String)object2, (Map)object);
                try {
                    object2 = object.body();
                    if (object2 != null) break block5;
                    object2 = new byte[0];
                }
                catch (Throwable throwable2) {}
                com.github.catvod.spider.merge.xc.a.a.e((Closeable)object, null);
                return object2;
            }
            object2 = object2.bytes();
            i.d(object2, "bytes(...)");
            break block6;
            com.github.catvod.spider.merge.xc.a.a.e((Closeable)object, null);
            return object2;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            com.github.catvod.spider.merge.xc.a.a.e((Closeable)object, throwable2);
            throw throwable3;
        }
    }
}

