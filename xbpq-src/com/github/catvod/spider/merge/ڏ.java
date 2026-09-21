/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u068e;
import com.github.catvod.spider.merge.\u0cbd;
import com.github.catvod.spider.merge.\u0f41;
import com.github.catvod.spider.merge.\u0f54;
import com.github.catvod.spider.merge.\u10c1;
import java.util.Queue;

public class \u068f
implements \u0f41 {
    String \u037f;
    \u068e \u0528;
    Queue<\u0cbd> \u0529;

    public \u068f(\u068e \u068e2, Queue<\u0cbd> queue) {
        this.\u0528 = \u068e2;
        this.\u037f = \u068e2.getName();
        this.\u0529 = queue;
    }

    private void \u0528(\u10c1 \u2d21, \u0f54 \u0f542, String string, Object[] objectArray, Throwable throwable) {
        \u0cbd \u0cbd2 = new \u0cbd();
        \u0cbd2.\u058f(System.currentTimeMillis());
        \u0cbd2.\u0529(\u2d21);
        \u0cbd2.\u052a(this.\u0528);
        \u0cbd2.\u052b(this.\u037f);
        \u0cbd2.\u052c(\u0f542);
        \u0cbd2.\u052d(string);
        \u0cbd2.\u052e(Thread.currentThread().getName());
        \u0cbd2.\u0528(objectArray);
        \u0cbd2.\u052f(throwable);
        this.\u0529.add(\u0cbd2);
    }

    private void \u0529(\u10c1 \u2d21, \u0f54 \u0f542, String string, Throwable throwable) {
        this.\u0528(\u2d21, \u0f542, string, null, throwable);
    }

    @Override
    public String getName() {
        return this.\u037f;
    }

    @Override
    public void \u037f(String string, Throwable throwable) {
        this.\u0529(\u10c1.\u0529, null, string, throwable);
    }
}

