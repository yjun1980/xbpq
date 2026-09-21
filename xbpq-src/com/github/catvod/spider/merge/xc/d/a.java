/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d;

import com.github.catvod.spider.merge.xc.d.b;
import java.util.concurrent.Executors;

public final class a
extends com.github.catvod.spider.merge.xc.D0.b {
    public static volatile a c;
    public final Object b;

    public a(int n2) {
        switch (n2) {
            default: {
                this.b = new a(1);
                return;
            }
            case 1: 
        }
        this.b = new Object();
        Executors.newFixedThreadPool(4, new b());
    }
}

