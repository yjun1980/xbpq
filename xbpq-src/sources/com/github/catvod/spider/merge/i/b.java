package com.github.catvod.spider.merge.i;

import com.github.catvod.crawler.SpiderApi;

/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static void a(Exception exc, StringBuilder sb, SpiderApi spiderApi) {
        sb.append(exc.toString());
        spiderApi.log(sb.toString());
    }
}
