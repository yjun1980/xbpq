/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  okhttp3.Response
 */
package com.github.catvod.spider.merge.j0;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.I.p0;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.J0.m;
import com.github.catvod.spider.merge.J0.n;
import com.github.catvod.spider.merge.J0.o;
import com.github.catvod.spider.merge.J0.t;
import com.github.catvod.spider.merge.f0.d;
import com.github.catvod.spider.merge.j0.a;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;

public final class b {
    private String a;
    private Map<String, String> b;
    private int c;
    private boolean d = false;
    private long e = -1L;
    private long f = -1L;
    private long g = -1L;
    private long h = -1L;
    private BlockingQueue<a> i = new LinkedBlockingQueue<a>();
    private a j;
    private long k;
    private ReentrantLock l = new ReentrantLock();

    public b(String string, Map<String, String> map, int n2) {
        this.a = string;
        this.b = map;
        this.c = n2;
    }

    public static void a(b b2) {
        while (b2.d) {
            a a2 = null;
            b2.l.lock();
            long l2 = b2.h;
            long l3 = (long)131072 + l2;
            b2.h = l3--;
            long l4 = b2.f;
            if (l2 <= l4) {
                if (l3 <= l4) {
                    l4 = l3;
                }
                a2 = new a(l2, l4);
                b2.i.add(a2);
            }
            b2.l.unlock();
            if (a2 == null) break;
            while (b2.d && com.github.catvod.spider.merge.j0.a.b(a2) - b2.g >= (long)0xC80000) {
                try {
                    Thread.sleep(1000L);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            l4 = com.github.catvod.spider.merge.j0.a.b(a2);
            while (b2.d && l4 <= com.github.catvod.spider.merge.j0.a.a(a2)) {
                int n2;
                Object object;
                Object object2;
                block42: {
                    block41: {
                        block40: {
                            l3 = l4;
                            l3 = l4;
                            object2 = new HashMap();
                            l3 = l4;
                            object = b2.b.entrySet().iterator();
                            while (true) {
                                Map.Entry<String, String> entry;
                                block39: {
                                    l3 = l4;
                                    if (!object.hasNext()) break;
                                    l3 = l4;
                                    entry = object.next();
                                    l3 = l4;
                                    if (b2.e(entry.getKey())) continue;
                                    l3 = l4;
                                    if (!entry.getKey().equalsIgnoreCase("range")) break block39;
                                    l3 = l4;
                                    ((HashMap)object2).put((String)"Range", (String)String.format("bytes=%d-%d", l4, com.github.catvod.spider.merge.j0.a.a(a2)));
                                    continue;
                                }
                                l3 = l4;
                                ((HashMap)object2).put((String)entry.getKey(), (String)entry.getValue());
                                continue;
                                break;
                            }
                            l3 = l4;
                            if (!b2.a.contains("/proxy?")) break block40;
                            l3 = l4;
                            object = com.github.catvod.spider.merge.f0.d.k(b2.a);
                            break block41;
                        }
                        l3 = l4;
                        object = b2.a;
                    }
                    l3 = l4;
                    object = com.github.catvod.spider.merge.f0.d.e((String)object, object2);
                    l3 = l4;
                    n2 = object.code();
                    if (n2 < 200 || n2 >= 300) break block42;
                    l3 = l4;
                    object2 = object.body().byteStream();
                    l3 = l4;
                    object = new byte[32768];
                    while (true) {
                        l3 = l4;
                        if (!b2.d) break;
                        l3 = l4;
                        n2 = ((InputStream)object2).read((byte[])object);
                        if (n2 == 0) continue;
                        if (n2 < 0) break;
                        l3 = l4;
                        a2.d(Arrays.copyOfRange((byte[])object, 0, n2));
                        l4 += (long)n2;
                    }
                    l3 = l4;
                    ((InputStream)object2).close();
                }
                l3 = l4;
                l3 = l4;
                l3 = l4;
                object = new StringBuilder();
                l3 = l4;
                ((StringBuilder)object).append("response code: ");
                l3 = l4;
                ((StringBuilder)object).append(n2);
                l3 = l4;
                object2 = new Exception(((StringBuilder)object).toString());
                l3 = l4;
                try {
                    throw object2;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    try {
                        Thread.sleep(1000L);
                        l4 = l3;
                    }
                    catch (Exception exception2) {
                        exception2.printStackTrace();
                        l4 = l3;
                    }
                }
            }
        }
    }

    public static void b(b b2) {
        while (b2.d) {
            if (b2.k > 0L && System.currentTimeMillis() / 1000L - b2.k >= (long)10) {
                b2.d = false;
            }
            try {
                Thread.sleep(1000L);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(b var0, PipedOutputStream var1_3) {
        block10: {
            block11: {
                Objects.requireNonNull(var0);
                while ((var2_4 = var0.d()) != null && var2_4.length != 0) {
                    var1_3.write(var2_4);
                }
                {
                    catch (Throwable var2_5) {
                        break block10;
                    }
                    catch (Exception var2_6) {}
                    {
                        var2_6.printStackTrace();
                    }
                    try {}
                    catch (Exception var0_1) {
                        break block11;
                    }
                    var0.d = false;
                    ** GOTO lbl19
                }
                {
                    var0.d = false;
lbl19:
                    // 2 sources

                    var1_3.close();
                    return;
                }
            }
            var0_1.printStackTrace();
            return;
        }
        try {
            var0.d = false;
            var1_3.close();
            throw var2_5;
        }
        catch (Exception var0_2) {
            var0_2.printStackTrace();
        }
        throw var2_5;
    }

    private byte[] d() {
        this.k = System.currentTimeMillis() / 1000L;
        if (this.g > this.f) {
            this.d = false;
            return null;
        }
        if (this.j == null) {
            this.j = (a)((LinkedBlockingQueue)this.i).poll(10, TimeUnit.SECONDS);
        }
        byte[] byArray = this.j.e();
        this.g += (long)byArray.length;
        if (this.j.c()) {
            this.j = null;
        }
        return byArray;
    }

    private boolean e(String string) {
        boolean bl = true;
        if (string == null) {
            return true;
        }
        string = string.toLowerCase();
        boolean bl2 = bl;
        if (!string.equals("host")) {
            bl2 = bl;
            if (!string.equals("http-client-ip")) {
                bl2 = string.equals("remote-addr") ? bl : false;
            }
        }
        return bl2;
    }

    public final o f() {
        Object object;
        Object object222 = n.d;
        if (!this.b.containsKey("Range")) {
            this.b.put("Range", "bytes=0-");
            object222 = n.c;
        }
        if (((Matcher)(object = Pattern.compile("bytes=(\\d+)-(\\d+)?").matcher(this.b.get("Range")))).find()) {
            long l2;
            this.e = Long.parseLong(((Matcher)object).group(1));
            if (((Matcher)object).group(2) != null) {
                this.f = Long.parseLong(((Matcher)object).group(2));
            }
            this.h = l2 = this.e;
            this.g = l2;
            Object object3 = new HashMap<String, String>();
            for (Map.Entry<String, String> response2 : this.b.entrySet()) {
                if (this.e(response2.getKey())) continue;
                ((HashMap)object3).put((String)response2.getKey(), (String)response2.getValue());
            }
            object = this.a.contains("/proxy?") ? com.github.catvod.spider.merge.f0.d.k(this.a) : this.a;
            Response response = com.github.catvod.spider.merge.f0.d.e((String)object, object3);
            response.body().close();
            int n2 = response.code();
            if (n2 >= 200 && n2 < 300) {
                object3 = response.headers().get("Content-Type");
                Object object2 = response.headers().get("Content-Disposition");
                object = object3;
                if (object2 != null) {
                    if (((String)object2).endsWith(".mp4")) {
                        object = "video/mp4";
                    } else if (((String)object2).endsWith(".webm")) {
                        object = "video/webm";
                    } else if (((String)object2).endsWith(".avi")) {
                        object = "video/x-msvideo";
                    } else if (((String)object2).endsWith(".wmv")) {
                        object = "video/x-ms-wmv";
                    } else if (((String)object2).endsWith(".flv")) {
                        object = "video/x-flv";
                    } else if (((String)object2).endsWith(".mov")) {
                        object = "video/quicktime";
                    } else if (((String)object2).endsWith(".mkv")) {
                        object = "video/x-matroska";
                    } else if (((String)object2).endsWith(".mpeg")) {
                        object = "video/mpeg";
                    } else {
                        object = object3;
                        if (((String)object2).endsWith(".3gp")) {
                            object = "video/3gpp";
                        }
                    }
                }
                if (object != null) {
                    object3 = response.headers().get("Content-Length");
                    if (object3 != null) {
                        l2 = Long.parseLong((String)object3);
                        object3 = response.headers().get("Content-Range");
                        if (object3 != null) {
                            object2 = Pattern.compile(".*/(\\d+)").matcher((CharSequence)object3);
                            if (((Matcher)object2).find()) {
                                long l3 = Long.parseLong(((Matcher)object2).group(1));
                                if (this.f <= 0L) {
                                    this.f = l3 - 1L;
                                }
                                this.d = true;
                                for (n2 = 0; n2 < this.c; ++n2) {
                                    new Thread(new p0(this, 4)).start();
                                }
                                new Thread(new com.github.catvod.spider.merge.I.d(this, 6)).start();
                                object2 = new PipedInputStream();
                                object3 = new PipedOutputStream((PipedInputStream)object2);
                                o o2 = t.l((m)object222, (String)object, (InputStream)object2, l2);
                                for (Object object222 : response.headers().names()) {
                                    object = response.headers().get((String)object222);
                                    if (object222 == null || ((String)object222).equalsIgnoreCase("Content-Type") || ((String)object222).equalsIgnoreCase("Content-Length")) continue;
                                    o2.b((String)object222, (String)object);
                                }
                                new Thread(new i(this, object3, 4)).start();
                                return o2;
                            }
                            throw new Exception(com.github.catvod.spider.merge.B.e.c("invalid `Content-Range`: ", (String)object3));
                        }
                        throw new Exception("missing response header: Content-Range");
                    }
                    throw new Exception("missing response header: Content-Length");
                }
                throw new Exception("missing response header: Content-Type");
            }
            throw new Exception(r.a("response code: ", n2));
        }
        object = com.github.catvod.spider.merge.C.a.c("invalid Range: ");
        ((StringBuilder)object).append(this.b.get("Range"));
        throw new Exception(((StringBuilder)object).toString());
    }
}

