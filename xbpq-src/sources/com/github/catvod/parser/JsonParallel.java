package com.github.catvod.parser;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.C0164g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JsonParallel {
    public static JSONObject parse(LinkedHashMap<String, String> linkedHashMap, final String str) {
        JSONObject jSONObject;
        Throwable th;
        try {
            if (linkedHashMap.size() > 0) {
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
                ArrayList arrayList = new ArrayList();
                for (final String str2 : linkedHashMap.keySet()) {
                    final String str3 = linkedHashMap.get(str2);
                    arrayList.add(executorCompletionService.submit(new Callable<JSONObject>() { // from class: com.github.catvod.parser.JsonParallel.1
                        @Override // java.util.concurrent.Callable
                        public JSONObject call() {
                            String d = cYh.d("12222D");
                            try {
                                HashMap<String, String> reqHeader = JsonBasic.getReqHeader(str3);
                                String str4 = reqHeader.get(d);
                                reqHeader.remove(d);
                                SpiderDebug.log(str4 + str);
                                JSONObject e = m.e(str, C0164g.i(C0164g.b(), str4 + str, cYh.d("170F2B22383438202023243F"), reqHeader, null));
                                e.put(cYh.d("0D2807233837"), str2);
                                SpiderDebug.log(e.toString());
                                return e;
                            } catch (Throwable th2) {
                                SpiderDebug.log(th2);
                                return null;
                            }
                        }
                    }));
                }
                JSONObject jSONObject2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    try {
                        jSONObject = (JSONObject) executorCompletionService.take().get();
                        if (jSONObject != null) {
                            try {
                                C0164g.a();
                                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                    try {
                                        ((Future) arrayList.get(i2)).cancel(true);
                                    } catch (Throwable th2) {
                                        SpiderDebug.log(th2);
                                    }
                                }
                                arrayList.clear();
                                jSONObject2 = jSONObject;
                                break;
                            } catch (Throwable th3) {
                                th = th3;
                                SpiderDebug.log(th);
                                jSONObject2 = jSONObject;
                            }
                        }
                    } catch (Throwable th4) {
                        jSONObject = jSONObject2;
                        th = th4;
                    }
                    jSONObject2 = jSONObject;
                }
                try {
                    newFixedThreadPool.shutdownNow();
                } catch (Throwable th5) {
                    SpiderDebug.log(th5);
                }
                if (jSONObject2 != null) {
                    return jSONObject2;
                }
            }
        } catch (Throwable th6) {
            SpiderDebug.log(th6);
        }
        return new JSONObject();
    }
}
