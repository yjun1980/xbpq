/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.Jpys;
import com.github.catvod.spider.merge.f0.d;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import okhttp3.Response;

public final class m
implements Runnable {
    public final String a;
    public final Map b;
    public final CountDownLatch c;

    public /* synthetic */ m(String string, Map map, CountDownLatch countDownLatch) {
        this.a = string;
        this.b = map;
        this.c = countDownLatch;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable2;
        CountDownLatch countDownLatch;
        block12: {
            String string = this.a;
            Map map = this.b;
            countDownLatch = this.c;
            int n2 = Jpys.o;
            try {
                long l2 = System.currentTimeMillis();
                Response response = d.d(string);
                long l3 = System.currentTimeMillis();
                if (response != null) {
                    response.close();
                }
                synchronized (map) {
                    map.put(string, l3 - l2);
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            catch (Exception exception) {
                synchronized (map) {
                    map.put(string, Long.MAX_VALUE);
                }
            }
            countDownLatch.countDown();
            return;
        }
        countDownLatch.countDown();
        throw throwable2;
    }
}

