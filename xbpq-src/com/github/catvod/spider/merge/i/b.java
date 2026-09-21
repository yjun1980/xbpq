/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderApi
 */
package com.github.catvod.spider.merge.i;

import com.github.catvod.crawler.SpiderApi;

public final class b {
    public static void a(Exception exception, StringBuilder stringBuilder, SpiderApi spiderApi) {
        stringBuilder.append(((Object)exception).toString());
        spiderApi.log(stringBuilder.toString());
    }
}

