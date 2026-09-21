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

class Douban$7
implements Callable<JSONObject> {
    final String a;
    final String b;
    final Douban c;

    Douban$7(Douban douban, String string, String string2) {
        this.c = douban;
        this.a = string;
        this.b = string2;
    }

    @Override
    public JSONObject call() {
        return Douban.c(this.c, this.a, this.b);
    }
}

