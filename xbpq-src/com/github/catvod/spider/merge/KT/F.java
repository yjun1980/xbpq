/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.KT.C;
import com.github.catvod.spider.merge.KT.D;
import com.github.catvod.spider.merge.KT.I;
import com.github.catvod.spider.merge.KT.J;
import com.github.catvod.spider.merge.KT.a;
import com.github.catvod.spider.merge.KT.b;
import com.github.catvod.spider.merge.KT.c;
import com.github.catvod.spider.merge.UY.A;
import com.github.catvod.spider.merge.UY.f;
import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.d0.v;
import com.github.catvod.spider.merge.xc.r0.e;
import com.github.catvod.spider.merge.xc.r0.l;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class F {
    public static final F a = new F();
    public static int b = 12345;
    public static c c;
    public static volatile boolean d;
    public static final LinkedHashMap e;
    public static final LinkedHashMap f;
    public static final LinkedHashMap g;
    public static final LinkedHashMap h;
    public static final LinkedHashMap i;
    public static final LinkedHashMap j;
    public static final LinkedHashMap k;

    static {
        e = new LinkedHashMap();
        f = new LinkedHashMap();
        g = new LinkedHashMap();
        h = new LinkedHashMap();
        i = new LinkedHashMap();
        j = new LinkedHashMap();
        k = new LinkedHashMap();
    }

    public static String a(int n2, byte[] byArray) {
        int n3 = n2 + 4;
        if (n3 <= byArray.length && byArray[n2] == 26 && byArray[n2 + 1] == 69 && byArray[n2 + 2] == -33 && byArray[n2 + 3] == -93) {
            return "video/x-matroska";
        }
        if (n2 + 8 <= byArray.length && byArray[n3] == 102 && byArray[n2 + 5] == 116 && byArray[n2 + 6] == 121 && byArray[n2 + 7] == 112) {
            return "video/mp4";
        }
        if (n3 <= byArray.length && byArray[n2] == 82 && byArray[n2 + 1] == 73 && byArray[n2 + 2] == 70 && byArray[n2 + 3] == 70) {
            return "video/x-msvideo";
        }
        if (n3 <= byArray.length && byArray[n2] == 70 && byArray[n2 + 1] == 76 && byArray[n2 + 2] == 86 && byArray[n2 + 3] == 1) {
            return "video/x-flv";
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b(byte[] object) {
        byte[] byArray = new byte[64];
        Object object2 = new ByteArrayInputStream((byte[])object);
        try {
            ((InputStream)object2).read(byArray);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable3) {
                com.github.catvod.spider.merge.xc.a.a.e((Closeable)object2, throwable);
                throw throwable3;
            }
        }
        com.github.catvod.spider.merge.xc.a.a.e((Closeable)object2, null);
        if (F.f(0, byArray)) {
            return 0;
        }
        int n2 = Math.min(256, ((Object)object).length);
        object2 = new byte[n2];
        object = new ByteArrayInputStream((byte[])object);
        try {
            ((InputStream)object).read((byte[])object2);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                com.github.catvod.spider.merge.xc.a.a.e((Closeable)object, throwable);
                throw throwable2;
            }
        }
        com.github.catvod.spider.merge.xc.a.a.e((Closeable)object, null);
        int i2 = 1;
        while (i2 < n2 - 16) {
            if (F.f(i2, (byte[])object2)) {
                object = new StringBuilder("valid video header found at offset ");
                ((StringBuilder)object).append(i2);
                SpiderDebug.log((String)((StringBuilder)object).toString());
                return i2;
            }
            ++i2;
        }
        return 0;
    }

    public static long c(Map object) {
        Object var4_2;
        Object object2;
        block10: {
            block9: {
                object2 = (List)object.get("Content-Range");
                var4_2 = null;
                if (object2 == null) break block9;
                String string = (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object2);
                object2 = string;
                if (string != null) break block10;
            }
            object2 = (object2 = (List)object.get("content-range")) != null ? (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object2) : null;
        }
        object2 = object2 != null ? l.I(com.github.catvod.spider.merge.xc.r0.e.b0((String)object2, '/', "")) : null;
        long l2 = 0L;
        if (object2 != null && (Long)object2 > 0L) {
            return (Long)object2;
        }
        object2 = (List)object.get("Content-Length");
        if (object2 != null && (object2 = (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object2)) != null && (object2 = l.I((String)object2)) != null) {
            l2 = (Long)object2;
        } else {
            object2 = (List)object.get("content-length");
            object = var4_2;
            if (object2 != null) {
                object2 = (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object2);
                object = var4_2;
                if (object2 != null) {
                    object = l.I((String)object2);
                }
            }
            if (object != null) {
                l2 = (Long)object;
            }
        }
        return l2;
    }

    public static String d(String object, String string, Map map) {
        block9: {
            block11: {
                block10: {
                    if (string != null && !com.github.catvod.spider.merge.xc.r0.e.T(string)) {
                        return string;
                    }
                    object = ((String)object).toLowerCase(Locale.ROOT);
                    com.github.catvod.spider.merge.mI.i.d(object, "toLowerCase(...)");
                    if (com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, ".mp4", false) || com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, "filename=01.mp4", false) || com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, "filename%3d01.mp4", false)) break block9;
                    if (com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, ".mkv", false)) {
                        return "video/x-matroska";
                    }
                    if (com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, ".webm", false)) {
                        return "video/webm";
                    }
                    if (com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, ".mov", false)) {
                        return "video/quicktime";
                    }
                    if (com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, ".avi", false)) {
                        return "video/x-msvideo";
                    }
                    object = (List)map.get("Content-Type");
                    if (object == null) break block10;
                    string = (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object);
                    object = string;
                    if (string != null) break block11;
                }
                object = (object = (List)map.get("content-type")) != null ? (String)com.github.catvod.spider.merge.xc.d0.i.J((List)object) : null;
            }
            if (object != null && !com.github.catvod.spider.merge.xc.r0.e.T((CharSequence)object) && !com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object, "octet-stream", true)) {
                return object;
            }
        }
        return "video/mp4";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Map e(String object, Map map) {
        Throwable throwable2;
        block8: {
            int n2;
            Object object2;
            Object object3;
            map = F.l(map);
            map.put("Range", "bytes=0-1048575");
            map.put("range", "bytes=0-1048575");
            map = A.i((String)object, map);
            try {
                object3 = new byte[256];
                object2 = map.body();
                n2 = object2 != null && (object2 = object2.byteStream()) != null ? ((InputStream)object2).read((byte[])object3) : 0;
            }
            catch (Throwable throwable2) {
                break block8;
            }
            if (n2 > 0) {
                object3 = Arrays.copyOf((byte[])object3, n2);
                com.github.catvod.spider.merge.mI.i.d(object3, "copyOf(...)");
                n2 = F.b((byte[])object3);
                LinkedHashMap linkedHashMap = g;
                object2 = f;
                if (n2 > 0) {
                    object2.put(object, n2);
                    linkedHashMap.put(object, F.a(n2, (byte[])object3));
                    object = linkedHashMap.get(object);
                    object3 = new StringBuilder;
                    ((StringBuilder)object3)("proxy malicious prefix detected: offset=");
                    ((StringBuilder)object3).append(n2);
                    ((StringBuilder)object3).append(" type=");
                    ((StringBuilder)object3).append(object);
                    SpiderDebug.log((String)((StringBuilder)object3).toString());
                } else {
                    object2.remove(object);
                    linkedHashMap.remove(object);
                }
            }
            if ((object = map.body()) != null) {
                object.close();
            }
            object = map.headers().toMultimap();
            com.github.catvod.spider.merge.mI.i.d(object, "toMultimap(...)");
            com.github.catvod.spider.merge.xc.a.a.e((Closeable)((Object)map), null);
            return object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            com.github.catvod.spider.merge.xc.a.a.e((Closeable)((Object)map), throwable2);
            throw throwable3;
        }
    }

    public static boolean f(int n2, byte[] byArray) {
        int n3;
        if (byArray.length - n2 < 8) {
            return false;
        }
        if (n2 + 8 <= byArray.length && byArray[n2 + 4] == 102 && byArray[n2 + 5] == 116 && byArray[n2 + 6] == 121 && byArray[n2 + 7] == 112) {
            long l2 = byArray[n2];
            long l3 = byArray[n2 + 1];
            if ((l2 = ((long)byArray[n2 + 2] & 0xFFL) << 8 | ((l2 & 0xFFL) << 24 | (l3 & 0xFFL) << 16) | (long)byArray[n2 + 3] & 0xFFL) >= 8L && l2 <= 0x100000L) {
                return true;
            }
        }
        if ((n3 = n2 + 4) <= byArray.length && byArray[n2] == 82 && byArray[n2 + 1] == 73 && byArray[n2 + 2] == 70 && byArray[n2 + 3] == 70) {
            return true;
        }
        if (n3 <= byArray.length && byArray[n2] == 26 && byArray[n2 + 1] == 69 && byArray[n2 + 2] == -33 && byArray[n2 + 3] == -93) {
            return true;
        }
        return n3 <= byArray.length && byArray[n2] == 70 && byArray[n2 + 1] == 76 && byArray[n2 + 2] == 86 && byArray[n2 + 3] == 1;
    }

    public static com.github.catvod.spider.merge.xc.c0.b g(String object, long l2) {
        String string = ((Object)com.github.catvod.spider.merge.xc.r0.e.f0(com.github.catvod.spider.merge.xc.r0.e.d0(com.github.catvod.spider.merge.xc.r0.e.a0((String)object, "bytes=", ""), ","))).toString();
        int n2 = com.github.catvod.spider.merge.xc.r0.e.Q(string, '-');
        long l3 = -1L;
        Long l4 = -1L;
        long l5 = 0L;
        object = 0L;
        if (n2 < 0) {
            return new com.github.catvod.spider.merge.xc.c0.b(object, l4);
        }
        Object object2 = string.substring(0, n2);
        com.github.catvod.spider.merge.mI.i.d(object2, "substring(...)");
        object2 = ((Object)com.github.catvod.spider.merge.xc.r0.e.f0((CharSequence)object2)).toString();
        string = string.substring(n2 + 1);
        com.github.catvod.spider.merge.mI.i.d(string, "substring(...)");
        string = ((Object)com.github.catvod.spider.merge.xc.r0.e.f0(string)).toString();
        if (((String)object2).length() == 0 && string.length() > 0) {
            object2 = l.I(string);
            if (object2 != null) {
                l3 = l2 - (Long)object2;
                if (l3 >= 0L) {
                    l5 = l3;
                }
                return new com.github.catvod.spider.merge.xc.c0.b(l5, l2 - 1L);
            }
            return new com.github.catvod.spider.merge.xc.c0.b(object, l4);
        }
        object = l.I((String)object2);
        l2 = object != null ? (Long)object : 0L;
        object = l.I(string);
        if (object != null) {
            l3 = (Long)object;
        }
        if (l2 >= 0L) {
            l5 = l2;
        }
        return new com.github.catvod.spider.merge.xc.c0.b(l5, l3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(String string, Map object, a object2, b b2) {
        StringBuilder stringBuilder;
        Object object3;
        block22: {
            long l2;
            long l3;
            int n2;
            Object object4;
            Map map;
            block24: {
                block23: {
                    block21: {
                        SpiderDebug.log((String)"--proxyAsync url:  ".concat(string));
                        m.o("--proxyAsync headers:  ", C.Z(object));
                        map = ((a)object2).d;
                        m.o("--proxyRequest headers: ", C.Z(map));
                        try {
                            object4 = e;
                            object3 = object2 = (Map)((LinkedHashMap)object4).get(string);
                            if (object2 != null) break block21;
                            object3 = F.e(string, (Map)object);
                            object4.put(string, object3);
                        }
                        catch (Exception exception) {
                            break block22;
                        }
                    }
                    n2 = (object2 = (Integer)f.get(string)) != null ? (Integer)object2 : 0;
                    l2 = l3 = F.c((Map)object3) - (long)n2;
                    if (l3 < 0L) {
                        l2 = 0L;
                    }
                    object2 = new StringBuilder("contentLength: ");
                    ((StringBuilder)object2).append(l2);
                    SpiderDebug.log((String)((StringBuilder)object2).toString());
                    if (l2 <= 0L) {
                        b2.d = 500;
                        b2.c = "text/plain";
                        b2.b();
                        b2.c("empty content length");
                        return;
                    }
                    object2 = object4 = (String)map.get("Range");
                    if (object4 == null) {
                        object2 = (String)map.get("range");
                    }
                    if (object2 == null) break block23;
                    object4 = object2;
                    if (((String)object2).length() != 0) break block24;
                }
                object4 = "bytes=0-";
            }
            object2 = F.g((String)object4, l2);
            long l4 = ((Number)((com.github.catvod.spider.merge.xc.c0.b)object2).a).longValue();
            long l5 = ((Number)((com.github.catvod.spider.merge.xc.c0.b)object2).b).longValue();
            long l6 = l2 - 1L;
            l3 = l5 == -1L ? l6 : l5;
            if (l2 > 0x80000000L) {
                try {
                    l3 = Math.min(l3, l4 + 0xFFFFFFFL);
                }
                catch (Exception exception) {
                    break block22;
                }
            }
            l3 = Math.min(l3, l6);
            object2 = new StringBuilder("rangeHeader: ");
            ((StringBuilder)object2).append((String)object4);
            ((StringBuilder)object2).append("; startPoint: ");
            ((StringBuilder)object2).append(l4);
            ((StringBuilder)object2).append("; endPoint: ");
            ((StringBuilder)object2).append(l5);
            ((StringBuilder)object2).append("; finalEndPoint: ");
            ((StringBuilder)object2).append(l3);
            SpiderDebug.log((String)((StringBuilder)object2).toString());
            object2 = F.d(string, (String)g.get(string), (Map)object3);
            b2.getClass();
            {
                b2.c = object2;
                object2 = object3 = (String)map.get("Connection");
                if (object3 == null) {
                    object2 = "keep-alive";
                }
                b2.a("Connection", (String)object2);
                b2.a("Accept-Ranges", "bytes");
                b2.a("Content-Length", String.valueOf(l3 - l4 + 1L));
                object2 = new StringBuilder("bytes ");
                ((StringBuilder)object2).append(l4);
                ((StringBuilder)object2).append("-");
                ((StringBuilder)object2).append(l3);
                ((StringBuilder)object2).append("/");
                ((StringBuilder)object2).append(l2);
                b2.a("Content-Range", ((StringBuilder)object2).toString());
                b2.d = 206;
                b2.b();
                object2 = object3 = (String)object.get("X-Thread-Num");
                if (object3 == null) {
                    object2 = (String)object.get("x-thread-num");
                }
                int n3 = object2 != null && (object2 = l.H((String)object2)) != null ? (Integer)object2 : 16;
                F.k(l4, l3, string, (Map)object, b2, com.github.catvod.spider.merge.xc.a.a.f(n3, 1, Integer.MAX_VALUE), n2);
                return;
            }
        }
        for (object = stringBuilder; object != null; object = ((Throwable)object).getCause()) {
            if (!(object instanceof SocketException)) {
                object2 = object3 = ((Throwable)object).getMessage();
                if (object3 == null) {
                    object2 = "";
                }
                if (!com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object2, "Broken pipe", true) && !com.github.catvod.spider.merge.xc.r0.e.M((CharSequence)object2, "Connection reset", true)) {
                    continue;
                }
            }
            m.o("proxy client disconnected: ", ((Throwable)((Object)stringBuilder)).getMessage());
            return;
        }
        object = ((Throwable)((Object)stringBuilder)).getMessage();
        object2 = new StringBuilder("proxyAsync error: ");
        ((StringBuilder)object2).append((String)object);
        SpiderDebug.log((String)((StringBuilder)object2).toString());
        ((Throwable)((Object)stringBuilder)).printStackTrace();
        try {
            object = ((Throwable)((Object)stringBuilder)).getMessage();
            stringBuilder = new StringBuilder();
            stringBuilder.append("proxyAsync error: ");
            stringBuilder.append((String)object);
            b2.c(stringBuilder.toString());
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(String object, Map map, a object2, b b2) {
        Throwable throwable4;
        Map map2;
        int n2;
        int n3;
        Object object3;
        Object object4;
        Object object5;
        String string;
        Object object6;
        block30: {
            block29: {
                block28: {
                    object6 = J.a;
                    string = C.y("xenc_password");
                    com.github.catvod.spider.merge.mI.i.b(string);
                    if (string.length() == 0) {
                        b2.d = 401;
                        b2.c = "text/plain";
                        b2.b();
                        b2.c("XENC password is empty");
                        return;
                    }
                    object5 = j;
                    object4 = (I)((LinkedHashMap)object5).get(object);
                    object6 = object4;
                    if (object4 == null) {
                        Throwable throwable22;
                        block26: {
                            object6 = F.l(map);
                            object6.put("Range", "bytes=0-4095");
                            object6.remove("range");
                            object4 = A.i((String)object, (Map)object6);
                            try {
                                object6 = object4.body();
                                if (object6 == null) break block26;
                                object3 = object6.bytes();
                                n3 = object4.code();
                                n2 = ((byte[])object3).length;
                                object6 = new StringBuilder("xenc header probe code=");
                                ((StringBuilder)object6).append(n3);
                                ((StringBuilder)object6).append(" length=");
                                ((StringBuilder)object6).append(n2);
                                SpiderDebug.log((String)((StringBuilder)object6).toString());
                                object6 = J.c((byte[])object3);
                            }
                            catch (Throwable throwable22) {}
                            com.github.catvod.spider.merge.xc.a.a.e((Closeable)object4, null);
                            object5.put(object, object6);
                            break block28;
                        }
                        object = new IllegalStateException("empty xenc header");
                        throw object;
                        try {
                            throw throwable22;
                        }
                        catch (Throwable throwable3) {
                            com.github.catvod.spider.merge.xc.a.a.e((Closeable)object4, throwable22);
                            throw throwable3;
                        }
                    }
                }
                object4 = (String)((a)object2).d.get("Range");
                map2 = ((a)object2).d;
                object2 = object4;
                if (object4 == null) {
                    object2 = (String)map2.get("range");
                }
                if (object2 == null) break block29;
                object4 = object2;
                if (((String)object2).length() != 0) break block30;
            }
            object4 = "bytes=0-";
        }
        long l2 = ((I)object6).c;
        object2 = F.g((String)object4, l2);
        long l3 = ((Number)((com.github.catvod.spider.merge.xc.c0.b)object2).a).longValue();
        long l4 = ((Number)((com.github.catvod.spider.merge.xc.c0.b)object2).b).longValue();
        object5 = "range";
        long l5 = l2 - 1L;
        long l6 = l4 == -1L ? l5 : l4;
        if (l2 > 0x80000000L) {
            l6 = Math.min(l6, l3 + 0xFFFFFFFL);
        }
        l5 = Math.min(l6, l5);
        object3 = (String)k.get(object);
        object2 = object3;
        if (object3 == null) {
            object2 = "video/mp4";
        }
        object3 = new StringBuilder("xenc rangeHeader=");
        ((StringBuilder)object3).append((String)object4);
        ((StringBuilder)object3).append(" start=");
        ((StringBuilder)object3).append(l3);
        ((StringBuilder)object3).append(" end=");
        ((StringBuilder)object3).append(l4);
        ((StringBuilder)object3).append(" final=");
        ((StringBuilder)object3).append(l5);
        ((StringBuilder)object3).append(" total=");
        ((StringBuilder)object3).append(l2);
        SpiderDebug.log((String)((StringBuilder)object3).toString());
        b2.getClass();
        b2.c = object2;
        object2 = object4 = (String)map2.get("Connection");
        if (object4 == null) {
            object2 = "keep-alive";
        }
        b2.a("Connection", (String)object2);
        b2.a("Accept-Ranges", "bytes");
        b2.a("Content-Length", String.valueOf(l5 - l3 + 1L));
        object2 = new StringBuilder("bytes ");
        ((StringBuilder)object2).append(l3);
        ((StringBuilder)object2).append("-");
        ((StringBuilder)object2).append(l5);
        ((StringBuilder)object2).append("/");
        ((StringBuilder)object2).append(l2);
        b2.a("Content-Range", ((StringBuilder)object2).toString());
        b2.d = 206;
        b2.b();
        l6 = ((I)object6).b;
        long l7 = l3 / l6;
        object2 = "Range";
        l4 = l5 / l6;
        object4 = new StringBuilder("xenc stream start=");
        ((StringBuilder)object4).append(l3);
        ((StringBuilder)object4).append(" end=");
        ((StringBuilder)object4).append(l5);
        ((StringBuilder)object4).append(" startChunk=");
        ((StringBuilder)object4).append(l7);
        ((StringBuilder)object4).append(" endChunk=");
        ((StringBuilder)object4).append(l4);
        SpiderDebug.log((String)((StringBuilder)object4).toString());
        if (l7 > l4) return;
        object4 = object5;
        while (true) {
            long l8;
            block31: {
                block27: {
                    l8 = l7 * l6;
                    object5 = J.a;
                    long l9 = (l6 + 16L) * l7 + (long)((I)object6).f.length;
                    n3 = (int)Math.min(l6, l2 - l8) + 16;
                    long l10 = n3;
                    object3 = F.l(map);
                    object5 = new StringBuilder("bytes=");
                    ((StringBuilder)object5).append(l9);
                    ((StringBuilder)object5).append("-");
                    ((StringBuilder)object5).append(l10 + l9 - 1L);
                    object3.put(object2, ((StringBuilder)object5).toString());
                    object3.remove(object4);
                    object3 = A.i((String)object, (Map)object3);
                    try {
                        object5 = object3.body();
                        if (object5 != null) break block27;
                        object5 = new byte[0];
                    }
                    catch (Throwable throwable4) {
                        break;
                    }
                    com.github.catvod.spider.merge.xc.a.a.e((Closeable)object3, null);
                    break block31;
                }
                object5 = object5.bytes();
                com.github.catvod.spider.merge.mI.i.d(object5, "bytes(...)");
                com.github.catvod.spider.merge.xc.a.a.e((Closeable)object3, null);
            }
            if (((Object)object5).length != n3) {
                n2 = ((Object)object5).length;
                object3 = new StringBuilder("xenc chunk size mismatch chunk=");
                ((StringBuilder)object3).append(l7);
                ((StringBuilder)object3).append(" expected=");
                ((StringBuilder)object3).append(n3);
                ((StringBuilder)object3).append(" actual=");
                ((StringBuilder)object3).append(n2);
                SpiderDebug.log((String)((StringBuilder)object3).toString());
            }
            object3 = J.a((I)object6, l7, (byte[])object5, string);
            n2 = Math.max(0, (int)(l3 - l8));
            if (n2 <= (n3 = Math.min(((Object)object3).length - 1, (int)(l5 - l8)))) {
                if (!b2.e.get()) {
                    b2.b();
                }
                object5 = b2.a;
                ((BufferedOutputStream)object5).write((byte[])object3, n2, n3 - n2 + 1);
                ((BufferedOutputStream)object5).flush();
            }
            if (l7 == l4) return;
            ++l7;
        }
        try {
            throw throwable4;
        }
        catch (Throwable throwable5) {
            com.github.catvod.spider.merge.xc.a.a.e((Closeable)object3, throwable4);
            throw throwable5;
        }
    }

    /*
     * Exception decompiling
     */
    public static void k(long var0, long var2_1, String var4_2, Map var5_6, b var6_9, int var7_10, int var8_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [8 : 418->428)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static LinkedHashMap l(Map map) {
        map = v.X(map);
        map.remove("X-Thread-Num");
        map.remove("x-thread-num");
        return map;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        synchronized (this) {
            try {
                if (F.d && (var2_1 = F.c) != null) {
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var2_2) {
                ** GOTO lbl52
            }
            return;
lbl-1000:
            // 2 sources

            {
                while ((var1_4 = ++F.b) < 20000) {
                    try {
                        var2_1 = new c(var1_4);
                        F.c = var2_1;
                        var3_5 = new D(0);
                        ((LinkedHashMap)var2_1.e).put("/", var3_5);
                        var3_5 = new D(1);
                        ((LinkedHashMap)var2_1.e).put("/proxy", var3_5);
                        var3_5 = new D(2);
                        ((LinkedHashMap)var2_1.e).put("/xenc", var3_5);
                        F.d = true;
                        var3_5 = new f(10, var2_1);
                        var4_6 = new Thread((Runnable)var3_5);
                        var4_6.start();
                        var1_4 = F.b;
                        var2_1 = new StringBuilder();
                        var2_1.append("ProxyServer started on ");
                        var2_1.append(var1_4);
                        SpiderDebug.log((String)var2_1.toString());
                        return;
                    }
                    catch (Exception var2_3) {
                        var2_3.printStackTrace();
                        var2_1 = var2_3.getMessage();
                        var3_5 = new StringBuilder();
                        var3_5.append("ProxyServer start failed: ");
                        var3_5.append((String)var2_1);
                        SpiderDebug.log((String)var3_5.toString());
                        var2_1 = F.c;
                        if (var2_1 != null) {
                            var2_1.b = false;
                            ((ExecutorService)var2_1.d).shutdown();
                            ((ServerSocket)var2_1.c).close();
                        }
                        F.c = null;
                        F.d = false;
                    }
                }
                return;
lbl52:
                // 1 sources

                throw var2_2;
            }
        }
    }
}

