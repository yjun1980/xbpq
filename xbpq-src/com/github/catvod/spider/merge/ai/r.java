/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.Spider
 */
package com.github.catvod.spider.merge.ai;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Notice;
import java.util.List;

public final class r
implements Runnable {
    public final int a;
    public final Spider b;
    public final Object c;

    public /* synthetic */ r(Spider spider, Object object, int n2) {
        this.a = n2;
        this.b = spider;
        this.c = object;
    }

    @Override
    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                Market.a((Market)this.b, (List)this.c);
                return;
            }
        }
        Notice.a((Notice)((Notice)this.b), (String)((String)this.c));
    }
}

