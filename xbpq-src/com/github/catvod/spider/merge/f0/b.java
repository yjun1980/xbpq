/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.f0;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Semaphore;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class b
implements Interceptor {
    private final Semaphore a = new Semaphore(1);
    private final Random b = new Random();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Response intercept(Interceptor.Chain object) {
        Throwable throwable2222222;
        Request request = object.request();
        String string = request.url().toString();
        if (!string.contains("115cdn.com") && !string.contains("115.com")) return object.proceed(request);
        this.a.acquire();
        Thread.sleep(this.b.nextInt(300) + 600);
        this.a.release();
        return object.proceed(request);
        {
            catch (Throwable throwable2222222) {
            }
            catch (InterruptedException interruptedException) {}
            {
                Thread.currentThread().interrupt();
                object = new IOException("Rate limit sleep interrupted", interruptedException);
                throw object;
            }
        }
        this.a.release();
        throw throwable2222222;
    }
}

