/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 *  com.google.gson.Gson
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.H;
import com.github.catvod.spider.merge.KT.x;
import com.github.catvod.spider.merge.KT.y;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.by.p;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.A0.c;
import com.github.catvod.spider.merge.xc.s0.E;
import com.github.catvod.spider.merge.xc.s0.S;
import com.github.catvod.spider.merge.xc.s0.U;
import com.github.catvod.spider.merge.xc.s0.W;
import com.github.catvod.spider.merge.xc.s0.a;
import com.github.catvod.spider.merge.xc.s0.f;
import com.github.catvod.spider.merge.xc.s0.q;
import com.github.catvod.spider.merge.xc.s0.r0;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;

public abstract class G {
    static {
        Runtime.getRuntime().availableProcessors();
        new HashMap();
    }

    public static String a(String string, HashMap hashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Proxy.getUrl());
        stringBuilder.append("?do=proxy&url=");
        stringBuilder.append(H.c(string.getBytes(Charset.defaultCharset())));
        stringBuilder.append("&header=");
        stringBuilder.append(H.c(new Gson().toJson((Object)hashMap).getBytes(Charset.defaultCharset())));
        return stringBuilder.toString();
    }

    public static String b(String string) {
        if (string.endsWith(".mp4")) {
            return "video/mp4";
        }
        if (string.endsWith(".webm")) {
            return "video/webm";
        }
        if (string.endsWith(".avi")) {
            return "video/x-msvideo";
        }
        if (string.endsWith(".wmv")) {
            return "video/x-ms-wmv";
        }
        if (string.endsWith(".flv")) {
            return "video/x-flv";
        }
        if (string.endsWith(".mov")) {
            return "video/quicktime";
        }
        if (string.endsWith(".mkv")) {
            return "video/x-matroska";
        }
        if (string.endsWith(".mpeg")) {
            return "video/mpeg";
        }
        if (string.endsWith(".3gp")) {
            return "video/3gpp";
        }
        if (string.endsWith(".ts")) {
            return "video/MP2T";
        }
        if (string.endsWith(".mp3")) {
            return "audio/mp3";
        }
        if (string.endsWith(".wav")) {
            return "audio/wav";
        }
        if (string.endsWith(".aac")) {
            return "audio/aac";
        }
        return null;
    }

    public static Map c(String string) {
        SpiderDebug.log((String)"parseRange:".concat(string));
        int n2 = 0;
        if (c.c(string)) {
            Object object = "";
            Object object2 = c.f(string.replace("bytes=", ""), "-");
            Object object3 = object2[0];
            string = object;
            if (((String[])object2).length > 1) {
                string = object2[1];
            }
            object = new AbstractMap.SimpleEntry<String, String>("start", (String)object3);
            object2 = new AbstractMap.SimpleEntry<String, String>("end", string);
            object3 = new HashMap(2);
            while (n2 < 2) {
                Map.Entry entry = (new Map.Entry[]{object, object2})[n2];
                string = entry.getKey();
                string.getClass();
                entry = entry.getValue();
                entry.getClass();
                if (((HashMap)object3).put(string, entry) == null) {
                    ++n2;
                    continue;
                }
                object = new StringBuilder("duplicate key: ");
                ((StringBuilder)object).append((Object)string);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            return Collections.unmodifiableMap(object3);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Object[] d(String object, Map object2) {
        SpiderDebug.log((String)" ++start proxy:");
        StringBuilder stringBuilder = new StringBuilder(" ++proxy url:");
        stringBuilder.append((String)object);
        SpiderDebug.log((String)stringBuilder.toString());
        stringBuilder = new StringBuilder(" ++proxy header:");
        stringBuilder.append(C.Z(object2));
        SpiderDebug.log((String)stringBuilder.toString());
        stringBuilder = A.i((String)object, (Map)object2);
        SpiderDebug.log((String)" ++end proxy:");
        object = new StringBuilder(" ++proxy res code:");
        ((StringBuilder)object).append(stringBuilder.code());
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object = new StringBuilder(" ++proxy res header:");
        ((StringBuilder)object).append(C.Z(stringBuilder.headers()));
        SpiderDebug.log((String)((StringBuilder)object).toString());
        object2 = stringBuilder.headers();
        object = "Content-Type";
        if (c.a(object2.get("Content-Type"))) {
            object2 = stringBuilder.headers();
            object = "content-type";
        } else {
            object2 = stringBuilder.headers();
        }
        object2 = object2.get((String)object);
        Object object3 = stringBuilder.headers().get("Content-Disposition");
        object = object2;
        if (object3 != null) {
            object = object2;
            if (c.a(new CharSequence[]{object2})) {
                object = G.b((String)object3);
            }
        }
        object2 = new HashMap();
        object3 = stringBuilder.headers().names().iterator();
        while (true) {
            if (!object3.hasNext()) {
                object3 = new StringBuilder("++proxy res contentType:");
                ((StringBuilder)object3).append((String)object);
                SpiderDebug.log((String)((StringBuilder)object3).toString());
                object3 = new StringBuilder("++proxy res respHeaders:");
                ((StringBuilder)object3).append(C.Z(object2));
                SpiderDebug.log((String)((StringBuilder)object3).toString());
                return new Object[]{stringBuilder.code(), object, stringBuilder.body().byteStream(), object2};
            }
            String string = (String)object3.next();
            ((HashMap)object2).put(string, stringBuilder.headers().get(string));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object[] e(String var0, Map var1_1) {
        block8: {
            block9: {
                block7: {
                    var5_3 = y.a;
                    i.e(var0, "url");
                    var5_3 = null;
                    var0 = new x((String)var0, (Map)var1_1, null);
                    var7_4 = Thread.currentThread();
                    var6_5 = U.a;
                    var1_1 = r0.a();
                    var1_1 = new f(E.h(var6_5, (com.github.catvod.spider.merge.xc.e0.i)var1_1), var7_4, (S)var1_1);
                    var1_1.F(com.github.catvod.spider.merge.xc.s0.C.a, (a)var1_1, (p)var0);
                    var0 = var1_1.e;
                    if (var0 != null) {
                        var2_6 = S.f;
                        var0.j(false);
                    }
                    try lbl-1000:
                    // 2 sources

                    {
                        while (!Thread.interrupted()) {
                            var3_7 = var0 != null ? var0.k() : 0x7FFFFFFFFFFFFFFFL;
                            break block7;
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block8;
                    }
                }
                if (var1_1.s() instanceof W ^ true) break block9;
                LockSupport.parkNanos(var1_1, var3_7);
                ** GOTO lbl-1000
            }
            if (var0 != null) {
                var2_6 = S.f;
                var0.h(false);
            }
            var1_1 = E.k(var1_1.s());
            var0 = var5_3;
            if (var1_1 instanceof q) {
                var0 = (q)var1_1;
            }
            if (var0 != null) throw var0.a;
            return (Object[])var1_1;
lbl-1000:
            // 1 sources

            {
                var5_3 = new InterruptedException();
                var1_1.j(var5_3);
                throw var5_3;
            }
        }
        if (var0 == null) throw var1_2;
        var2_6 = S.f;
        var0.h(false);
        throw var1_2;
    }
}

