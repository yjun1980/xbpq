/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.JsonBasic;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

class JsonParallel$1
implements Callable<JSONObject> {
    final String a;
    final String b;
    final String c;

    JsonParallel$1(String string, String string2, String string3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
    }

    @Override
    public JSONObject call() {
        CharSequence charSequence = cYh.d("12222D");
        try {
            Object object = JsonBasic.getReqHeader(this.a);
            String string = ((HashMap)object).get(charSequence);
            ((HashMap)object).remove(charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(this.b);
            SpiderDebug.log((String)((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(this.b);
            charSequence = ((StringBuilder)charSequence).toString();
            string = cYh.d("170F2B22383438202023243F");
            object = g.i(g.b(), (String)charSequence, string, object, null);
            object = m.e(this.b, (String)object);
            object.put(cYh.d("0D2807233837"), (Object)this.c);
            SpiderDebug.log((String)object.toString());
            return object;
        }
        catch (Throwable throwable) {
            SpiderDebug.log((Throwable)throwable);
            return null;
        }
    }
}

