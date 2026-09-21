/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.\u78c1\u529b\u96c6\u5408
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.merge.K.h;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.\u78c1\u529b\u96c6\u5408;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class L
implements Callable {
    public final \u78c1\u529b\u96c6\u5408 a;
    public final String b;
    public final List c;

    public /* synthetic */ L(\u78c1\u529b\u96c6\u5408 \u78c1\u529b\u96c6\u54082, String string, List list) {
        this.a = \u78c1\u529b\u96c6\u54082;
        this.b = string;
        this.c = list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object call() {
        Object object = this.a;
        Object object2 = this.b;
        List list = this.c;
        Objects.requireNonNull(object);
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append("show=title&tempid=1&keyboard=");
            ((StringBuilder)object).append(URLEncoder.encode((String)object2, "GB2312"));
            object = ((StringBuilder)object).toString();
            object2 = new HashMap();
            ((HashMap)object2).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
            for (Object object3 : d.l(com.github.catvod.spider.merge.f0.d.h((String)object, "https://www.dytt89.com/e/search/index.php", object2)).m0("div.co_content8 tbody")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("https://www.dytt89.com");
                ((StringBuilder)object).append(((m)object3).m0("a").a("href"));
                object = ((StringBuilder)object).toString();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u7535\u5f71\u5929\u5802");
                stringBuilder.append(((m)object3).m0("a").a("title"));
                String string = stringBuilder.toString();
                String string2 = ((m)object3).m0("td[style*=padding-left]").g().s0();
                Object object4 = new StringBuilder();
                ((StringBuilder)object4).append("https://www.dytt89.com");
                ((StringBuilder)object4).append(((m)object3).m0("img").a("src"));
                object3 = ((StringBuilder)object4).toString();
                object4 = new h((String)object, string, (String)object3, string2);
                list.add(object4);
            }
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

