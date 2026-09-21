/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.g;

import com.github.catvod.spider.merge.xc.D0.b;
import com.github.catvod.spider.merge.xc.g.c;
import com.github.catvod.spider.merge.xc.g.f;
import com.github.catvod.spider.merge.xc.g.g;

public final class e
extends b {
    @Override
    public final void G(f f2, f f4) {
        f2.b = f4;
    }

    @Override
    public final void H(f f2, Thread thread) {
        f2.a = thread;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean i(g g2, c c2, c c3) {
        synchronized (g2) {
            Throwable throwable2;
            block4: {
                try {
                    if (g2.b == c2) {
                        g2.b = c3;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean j(g g2, Object object, Object object2) {
        synchronized (g2) {
            Throwable throwable2;
            block4: {
                try {
                    if (g2.a == object) {
                        g2.a = object2;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean k(g g2, f f2, f f4) {
        synchronized (g2) {
            Throwable throwable2;
            block4: {
                try {
                    if (g2.c == f2) {
                        g2.c = f4;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }
}

