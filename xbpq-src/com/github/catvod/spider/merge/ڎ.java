/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u068f;
import com.github.catvod.spider.merge.\u084b;
import com.github.catvod.spider.merge.\u0931;
import com.github.catvod.spider.merge.\u0cbd;
import com.github.catvod.spider.merge.\u0f41;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

public class \u068e
implements \u0f41 {
    private final String \u037f;
    private volatile \u0f41 \u0528;
    private Boolean \u0529;
    private Method \u052a;
    private \u068f \u052b;
    private Queue<\u0cbd> \u052c;
    private final boolean \u052d;

    public \u068e(String string, Queue<\u0cbd> queue, boolean bl) {
        this.\u037f = string;
        this.\u052c = queue;
        this.\u052d = bl;
    }

    private \u0f41 \u0529() {
        if (this.\u052b == null) {
            this.\u052b = new \u068f(this, this.\u052c);
        }
        return this.\u052b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && \u068e.class == object.getClass()) {
            object = (\u068e)object;
            return this.\u037f.equals(((\u068e)object).\u037f);
        }
        return false;
    }

    @Override
    public String getName() {
        return this.\u037f;
    }

    public int hashCode() {
        return this.\u037f.hashCode();
    }

    @Override
    public void \u037f(String string, Throwable throwable) {
        this.\u0528().\u037f(string, throwable);
    }

    \u0f41 \u0528() {
        if (this.\u0528 != null) {
            return this.\u0528;
        }
        if (this.\u052d) {
            return \u084b.\u037f;
        }
        return this.\u0529();
    }

    public boolean \u052a() {
        Boolean bl = this.\u0529;
        if (bl != null) {
            return bl;
        }
        try {
            this.\u052a = this.\u0528.getClass().getMethod(SOY.d("163D36"), \u0931.class);
            this.\u0529 = Boolean.TRUE;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            this.\u0529 = Boolean.FALSE;
        }
        return this.\u0529;
    }

    public boolean \u052b() {
        return this.\u0528 instanceof \u084b;
    }

    public boolean \u052c() {
        boolean bl = this.\u0528 == null;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void \u052d(\u0931 \u09312) {
        if (!this.\u052a()) return;
        try {
            this.\u052a.invoke(this.\u0528, \u09312);
            return;
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {
            return;
        }
    }

    public void \u052e(\u0f41 \u0f412) {
        this.\u0528 = \u0f412;
    }
}

