/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Interceptor
 *  okhttp3.Interceptor$Chain
 *  okhttp3.Request
 *  okhttp3.Request$Builder
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.f0;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

final class c
implements Interceptor {
    c() {
    }

    public final Response intercept(Interceptor.Chain chain) {
        IOException iOException;
        Request request = chain.request();
        Request.Builder builder = request.newBuilder();
        request.header("Referer");
        Request request2 = builder.build();
        int n2 = 0;
        request = null;
        IOException iOException2 = null;
        while (true) {
            block10: {
                block9: {
                    long l2;
                    long l3 = (l2 = (long)n2 - 3L) == 0L ? 0 : (l2 < 0L ? -1 : 1);
                    builder = request;
                    iOException = iOException2;
                    if (l3 > 0) break;
                    if (n2 > 0) {
                        builder = request;
                        Thread.sleep(500L);
                    }
                    builder = request;
                    request = chain.proceed(request2);
                    builder = request;
                    int n3 = request.code();
                    if (n3 < 500 || n3 >= 600 || l3 == false) break block9;
                    builder = request;
                    try {
                        request.close();
                        iOException = iOException2;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Retry interrupted", interruptedException);
                    }
                    catch (IOException iOException3) {
                        request = builder;
                        iOException = iOException3;
                        if (l3 != false) break block10;
                        iOException = iOException3;
                        break;
                    }
                }
                return request;
            }
            ++n2;
            iOException2 = iOException;
        }
        if (iOException == null) {
            return builder;
        }
        throw iOException;
    }
}

