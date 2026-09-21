/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.r0.a;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {
    public final BufferedOutputStream a;
    public final LinkedHashMap b;
    public String c;
    public int d;
    public final AtomicBoolean e;
    public final LinkedHashMap f;

    public b(BufferedOutputStream object) {
        this.a = object;
        this.b = new LinkedHashMap();
        this.c = "text/plain";
        this.d = 200;
        this.e = new AtomicBoolean(false);
        com.github.catvod.spider.merge.xc.c0.b b2 = new com.github.catvod.spider.merge.xc.c0.b(206, "Partial Content");
        com.github.catvod.spider.merge.xc.c0.b b3 = new com.github.catvod.spider.merge.xc.c0.b(200, "OK");
        com.github.catvod.spider.merge.xc.c0.b b4 = new com.github.catvod.spider.merge.xc.c0.b(404, "NOT FOUND");
        com.github.catvod.spider.merge.xc.c0.b b5 = new com.github.catvod.spider.merge.xc.c0.b(400, "BAD REQUEST");
        com.github.catvod.spider.merge.xc.c0.b b6 = new com.github.catvod.spider.merge.xc.c0.b(401, "UNAUTHORIZED");
        com.github.catvod.spider.merge.xc.c0.b b7 = new com.github.catvod.spider.merge.xc.c0.b(403, "FORBIDDEN");
        com.github.catvod.spider.merge.xc.c0.b b8 = new com.github.catvod.spider.merge.xc.c0.b(405, "METHOD NOT ALLOWED");
        com.github.catvod.spider.merge.xc.c0.b b9 = new com.github.catvod.spider.merge.xc.c0.b(408, "REQUEST TIMEOUT");
        com.github.catvod.spider.merge.xc.c0.b b10 = new com.github.catvod.spider.merge.xc.c0.b(413, "PAYLOAD TOO LARGE");
        com.github.catvod.spider.merge.xc.c0.b b11 = new com.github.catvod.spider.merge.xc.c0.b(414, "URI TOO LONG");
        com.github.catvod.spider.merge.xc.c0.b b12 = new com.github.catvod.spider.merge.xc.c0.b(415, "UNSUPPORTED MEDIA TYPE");
        com.github.catvod.spider.merge.xc.c0.b b13 = new com.github.catvod.spider.merge.xc.c0.b(429, "TOO MANY REQUESTS");
        com.github.catvod.spider.merge.xc.c0.b b14 = new com.github.catvod.spider.merge.xc.c0.b(500, "INTERNAL SERVER ERROR");
        object = new com.github.catvod.spider.merge.xc.c0.b(501, "NOT IMPLEMENTED");
        com.github.catvod.spider.merge.xc.c0.b b15 = new com.github.catvod.spider.merge.xc.c0.b(503, "SERVICE UNAVAILABLE");
        com.github.catvod.spider.merge.xc.c0.b b16 = new com.github.catvod.spider.merge.xc.c0.b(504, "GATEWAY TIMEOUT");
        com.github.catvod.spider.merge.xc.c0.b b17 = new com.github.catvod.spider.merge.xc.c0.b(505, "HTTP VERSION NOT SUPPORTED");
        com.github.catvod.spider.merge.xc.c0.b b18 = new com.github.catvod.spider.merge.xc.c0.b(507, "INSUFFICIENT STORAGE");
        com.github.catvod.spider.merge.xc.c0.b b19 = new com.github.catvod.spider.merge.xc.c0.b(511, "NETWORK AUTHENTICATION REQUIRED");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.S(19));
        v.V(linkedHashMap, new com.github.catvod.spider.merge.xc.c0.b[]{b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, object, b15, b16, b17, b18, b19});
        this.f = linkedHashMap;
    }

    public final void a(String string, String string2) {
        i.e(string2, "value");
        this.b.put(string, string2);
    }

    public final void b() {
        if (this.e.compareAndSet(false, true)) {
            int n2 = this.d;
            Object object = this.f.get(n2);
            Object object2 = new StringBuilder("HTTP/1.1 ");
            ((StringBuilder)object2).append(n2);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append("\r\n");
            object = ((StringBuilder)object2).toString();
            object2 = com.github.catvod.spider.merge.xc.r0.a.a;
            Object object3 = ((String)object).getBytes((Charset)object2);
            i.d(object3, "getBytes(...)");
            object = this.a;
            ((OutputStream)object).write((byte[])object3);
            String object42 = this.c;
            object3 = new StringBuilder("Content-Type: ");
            object3.append(object42);
            object3.append("\r\n");
            object2 = object3.toString().getBytes((Charset)object2);
            i.d(object2, "getBytes(...)");
            ((OutputStream)object).write((byte[])object2);
            for (Map.Entry entry : this.b.entrySet()) {
                object3 = (String)entry.getKey();
                String string = (String)entry.getValue();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object3);
                stringBuilder.append(": ");
                stringBuilder.append(string);
                stringBuilder.append("\r\n");
                object3 = stringBuilder.toString().getBytes(com.github.catvod.spider.merge.xc.r0.a.a);
                i.d(object3, "getBytes(...)");
                ((OutputStream)object).write((byte[])object3);
            }
            object2 = "\r\n".getBytes(com.github.catvod.spider.merge.xc.r0.a.a);
            i.d(object2, "getBytes(...)");
            ((OutputStream)object).write((byte[])object2);
            ((BufferedOutputStream)object).flush();
        }
    }

    public final void c(String object) {
        i.e(object, "content");
        if (!this.e.get()) {
            this.b();
        }
        object = ((String)object).getBytes(com.github.catvod.spider.merge.xc.r0.a.a);
        i.d(object, "getBytes(...)");
        ((OutputStream)this.a).write((byte[])object);
    }
}

