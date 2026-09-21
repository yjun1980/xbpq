/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.net.cronet.okhttptransport.CronetInterceptor
 */
package com.github.catvod.spider.merge.b;

import com.github.catvod.spider.merge.b.p;
import com.google.net.cronet.okhttptransport.CronetInterceptor;

public final class j
implements Runnable {
    public final int c;
    public final Object d;

    public /* synthetic */ j(Object object, int n2) {
        this.c = n2;
        this.d = object;
    }

    @Override
    public final void run() {
        switch (this.c) {
            default: {
                break;
            }
            case 0: {
                p.d((p)this.d);
                return;
            }
        }
        CronetInterceptor.a((CronetInterceptor)((CronetInterceptor)this.d));
    }
}

