/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.Ali
 *  com.github.catvod.spider.BaiDuPan
 *  com.github.catvod.spider.Pan115
 *  com.github.catvod.spider.Pan123
 *  com.github.catvod.spider.TianYi
 *  com.github.catvod.spider.UC
 *  com.github.catvod.spider.XunleiPan
 *  com.github.catvod.spider.YiDongYun
 */
package com.github.catvod.spider.merge.xc.T;

import com.github.catvod.spider.Ali;
import com.github.catvod.spider.BaiDuPan;
import com.github.catvod.spider.Pan115;
import com.github.catvod.spider.Pan123;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.TianYi;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.XunleiPan;
import com.github.catvod.spider.YiDongYun;
import com.github.catvod.spider.merge.UY.l;
import java.util.concurrent.Callable;

public final class b
implements Callable {
    public final int a;
    public final String b;

    public /* synthetic */ b(String string, int n2) {
        this.a = n2;
        this.b = string;
    }

    public final Object call() {
        switch (this.a) {
            default: {
                return XunleiPan.detailContentVodPlayUrl((String)this.b);
            }
            case 9: {
                return Pan123.detailContentVodPlayUrl((String)this.b);
            }
            case 8: {
                return Pan115.detailContentVodPlayUrl((String)this.b);
            }
            case 7: {
                return BaiDuPan.detailContentVodPlayUrl((String)this.b);
            }
            case 6: {
                return YiDongYun.detailContentVodPlayUrl((String)this.b);
            }
            case 5: {
                return TianYi.detailContentVodPlayUrl((String)this.b);
            }
            case 4: {
                return Ali.detailContentVodPlayUrl((String)this.b);
            }
            case 3: {
                return Quark.detailContentVodPlayUrl((String)this.b);
            }
            case 2: {
                return this.b;
            }
            case 1: {
                return l.i(this.b);
            }
            case 0: 
        }
        return UC.detailContentVodPlayUrl((String)this.b);
    }
}

