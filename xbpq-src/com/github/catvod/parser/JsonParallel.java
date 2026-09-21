/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  org.json.JSONObject
 */
package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.parser.JsonParallel$1;
import com.github.catvod.spider.merge.k.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;

public class JsonParallel {
    /*
     * Loose catch block
     */
    public static JSONObject parse(LinkedHashMap<String, String> object, String object2) {
        block20: {
            JsonParallel$1 jsonParallel$1;
            if (object.size() <= 0) break block20;
            ExecutorService executorService = Executors.newFixedThreadPool(3);
            ExecutorCompletionService<JSONObject> executorCompletionService = new ExecutorCompletionService<JSONObject>(executorService);
            ArrayList<Future<JSONObject>> arrayList = new ArrayList<Future<JSONObject>>();
            for (String string : object.keySet()) {
                String string2 = object.get(string);
                jsonParallel$1 = new JsonParallel$1(string2, (String)object2, string);
                arrayList.add(executorCompletionService.submit(jsonParallel$1));
            }
            object = null;
            int n2 = 0;
            while (true) {
                block21: {
                    block22: {
                        object2 = object;
                        if (n2 >= arrayList.size()) break;
                        object2 = executorCompletionService.take();
                        object = object2 = (JSONObject)object2.get();
                        if (object2 == null) break block21;
                        g.a();
                        int n3 = 0;
                        while (true) {
                            int n4 = arrayList.size();
                            if (n3 >= n4) break;
                            try {
                                ((Future)arrayList.get(n3)).cancel(true);
                            }
                            catch (Throwable throwable) {
                                SpiderDebug.log((Throwable)throwable);
                            }
                            ++n3;
                        }
                        arrayList.clear();
                        break;
                        {
                            catch (Throwable throwable) {}
                        }
                        break block22;
                        catch (Throwable throwable) {
                            object2 = object;
                        }
                    }
                    SpiderDebug.log((Throwable)((Object)jsonParallel$1));
                    object = object2;
                }
                ++n2;
            }
            try {
                executorService.shutdownNow();
            }
            catch (Throwable throwable) {
                SpiderDebug.log((Throwable)throwable);
            }
            if (object2 != null) {
                return object2;
            }
            break block20;
            {
                catch (Throwable throwable) {
                    SpiderDebug.log((Throwable)throwable);
                }
            }
        }
        return new JSONObject();
    }
}

