/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.res.ResourcesCompat$FontCallback
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.xc.U;

import androidx.core.content.res.ResourcesCompat;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.xc.D0.b;

public final class s
implements Runnable {
    public final int a;
    public final int b;
    public final Object c;

    public /* synthetic */ s(ResourcesCompat.FontCallback fontCallback, int n2) {
        this.a = 1;
        this.c = fontCallback;
        this.b = n2;
    }

    public /* synthetic */ s(Runnable runnable, int n2) {
        this.a = 0;
        this.b = n2;
        this.c = runnable;
    }

    @Override
    public final void run() {
        int n2;
        switch (this.a) {
            default: {
                ResourcesCompat.FontCallback.b((ResourcesCompat.FontCallback)((ResourcesCompat.FontCallback)this.c), (int)this.b);
                return;
            }
            case 0: 
        }
        Object object = com.github.catvod.spider.merge.xc.D0.b.P();
        Runnable runnable = (Runnable)this.c;
        if (object == null && (n2 = this.b) < 4) {
            object = new StringBuilder("PanConfigCenter wait activity retry=");
            ((StringBuilder)object).append(n2);
            SpiderDebug.log((String)((StringBuilder)object).toString());
            com.github.catvod.spider.merge.xc.D0.b.I(runnable, n2 + 1);
        } else {
            runnable.run();
        }
    }
}

