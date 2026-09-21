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

class Douban$6
implements Callable<JSONObject> {
    final String a;
    final Douban b;

    Douban$6(Douban douban, String string) {
        this.b = douban;
        this.a = string;
    }

    @Override
    public JSONObject call() {
        return Douban.b(this.b, this.a);
    }
}

