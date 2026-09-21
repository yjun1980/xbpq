/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.Executor;

final class A
extends Enum<A>
implements Executor {
    public static final /* enum */ A c;
    private static final A[] d;

    static {
        A a2;
        c = a2 = new A();
        d = new A[]{a2};
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])d.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return cYh.d("2A3F33341222023334253828147E2538253F04240429323912242E237F73");
    }
}

