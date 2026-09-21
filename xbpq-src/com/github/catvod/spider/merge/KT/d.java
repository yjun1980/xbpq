/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.KT.c;
import com.github.catvod.spider.merge.KT.e;
import com.github.catvod.spider.merge.UY.A;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class d
implements Callable {
    public final c a;
    public final String b;
    public final int c;

    public /* synthetic */ d(c c2, String string, int n2) {
        this.a = c2;
        this.b = string;
        this.c = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        String string = this.b;
        int n2 = this.c;
        this.a.getClass();
        long l2 = System.currentTimeMillis();
        try {
            Object object;
            if (string.isEmpty()) {
                object = "";
            } else {
                object = new HashMap();
                ((HashMap)object).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
                ((HashMap)object).put("Referer", string);
                object = A.n(string, (Map)object, 5, 5);
            }
            long l3 = System.currentTimeMillis();
            boolean bl = object != null && !((String)object).isEmpty() && !com.github.catvod.spider.merge.KT.c.c((String)object);
            e e2 = new e(string, bl, l3 - l2, n2);
            return e2;
        }
        catch (Throwable throwable) {
            return new e(string, false, Long.MAX_VALUE, n2);
        }
    }
}

