/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.github.catvod.spider;

import com.github.catvod.spider.Douban;
import java.util.concurrent.Callable;
import org.json.JSONObject;

class Douban$8
implements Callable<JSONObject> {
    final String a;
    final String b;
    final Douban c;

    Douban$8(Douban douban, String string) {
        this.c = douban;
        this.a = string;
        this.b = "https://movie.douban.com/tv/";
    }

    @Override
    public JSONObject call() {
        return Douban.c(this.c, this.a, this.b);
    }
}

