/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import java.util.concurrent.Future;

public final class W {
    public static Object a(Future future) {
        boolean bl = false;
        while (true) {
            try {
                Object v2 = future.get();
                if (bl) {
                    Thread.currentThread().interrupt();
                }
                return v2;
            }
            catch (Throwable throwable) {
                if (bl) {
                    Thread.currentThread().interrupt();
                }
                throw throwable;
            }
            catch (InterruptedException interruptedException) {
                bl = true;
                continue;
            }
            break;
        }
    }
}

