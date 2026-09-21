/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u013c;
import com.github.catvod.spider.merge.\u068e;
import com.github.catvod.spider.merge.\u0cbd;
import com.github.catvod.spider.merge.\u0f41;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class \u029f
implements \u013c {
    boolean \u037f = false;
    final Map<String, \u068e> \u0528 = new HashMap<String, \u068e>();
    final LinkedBlockingQueue<\u0cbd> \u0529 = new LinkedBlockingQueue();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public \u0f41 \u037f(String string) {
        synchronized (this) {
            \u068e \u068e2;
            \u068e \u068e3 = \u068e2 = this.\u0528.get(string);
            if (\u068e2 == null) {
                \u068e3 = new \u068e(string, this.\u0529, this.\u037f);
                this.\u0528.put(string, \u068e3);
            }
            return \u068e3;
        }
    }

    public void \u0528() {
        this.\u0528.clear();
        this.\u0529.clear();
    }

    public LinkedBlockingQueue<\u0cbd> \u0529() {
        return this.\u0529;
    }

    public List<\u068e> \u052a() {
        return new ArrayList<\u068e>(this.\u0528.values());
    }

    public void \u052b() {
        this.\u037f = true;
    }
}

