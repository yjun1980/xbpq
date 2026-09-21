/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.J0.b;
import com.github.catvod.spider.merge.J0.e;
import com.github.catvod.spider.merge.J0.f;
import com.github.catvod.spider.merge.J0.i;
import com.github.catvod.spider.merge.J0.j;
import com.github.catvod.spider.merge.J0.m;
import com.github.catvod.spider.merge.J0.n;
import com.github.catvod.spider.merge.J0.o;
import com.github.catvod.spider.merge.J0.p;
import com.github.catvod.spider.merge.J0.q;
import com.github.catvod.spider.merge.J0.s;
import com.github.catvod.spider.merge.y.z;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public abstract class t {
    private static final Pattern h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger k = Logger.getLogger(t.class.getName());
    private final String a;
    private final int b;
    private volatile ServerSocket c;
    private f d = new f();
    private Thread e;
    protected e f;
    private s g;

    public t(int n2) {
        this.a = null;
        this.b = n2;
        this.g = new i();
        this.f = new e();
    }

    static /* synthetic */ void a(Object object) {
        t.o(object);
    }

    static /* synthetic */ s b(t t2) {
        return t2.g;
    }

    static /* synthetic */ Logger c() {
        return k;
    }

    static /* synthetic */ Pattern d() {
        return h;
    }

    static /* synthetic */ Pattern e() {
        return j;
    }

    static /* synthetic */ Pattern f() {
        return i;
    }

    static /* synthetic */ String g(t t2) {
        return t2.a;
    }

    static /* synthetic */ int h(t t2) {
        return t2.b;
    }

    static /* synthetic */ ServerSocket i(t t2) {
        return t2.c;
    }

    protected static String j(String string) {
        try {
            string = URLDecoder.decode(string, "UTF8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            k.log(Level.WARNING, "Encoding not supported, ignored", unsupportedEncodingException);
            string = null;
        }
        return string;
    }

    public static o k(m m2, String string, InputStream inputStream) {
        return new o(m2, string, inputStream, -1L);
    }

    public static o l(m m2, String string, InputStream inputStream, long l2) {
        return new o(m2, string, inputStream, l2);
    }

    public static o m(m m2, String object, String object2) {
        Object object3;
        block5: {
            b b2 = new b((String)object);
            if (object2 == null) {
                return t.l(m2, (String)object, new ByteArrayInputStream(new byte[0]), 0L);
            }
            object = b2;
            object3 = b2;
            if (Charset.forName(b2.e()).newEncoder().canEncode((CharSequence)object2)) break block5;
            object3 = b2;
            object = b2.g();
        }
        object3 = object;
        try {
            object2 = ((String)object2).getBytes(((b)object).e());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            k.log(Level.SEVERE, "encoding problem, responding nothing", unsupportedEncodingException);
            object2 = new byte[0];
            object = object3;
        }
        return t.l(m2, ((b)object).c(), new ByteArrayInputStream((byte[])object2), ((Object)object2).length);
    }

    public static o n(String string) {
        return t.m(n.c, "text/html", string);
    }

    private static final void o(Object object) {
        block6: {
            if (object != null) {
                try {
                    if (object instanceof Closeable) {
                        ((Closeable)object).close();
                        break block6;
                    }
                    if (object instanceof Socket) {
                        ((Socket)object).close();
                        break block6;
                    }
                    if (object instanceof ServerSocket) {
                        ((ServerSocket)object).close();
                        break block6;
                    }
                    object = new IllegalArgumentException("Unknown object to close");
                    throw object;
                }
                catch (IOException iOException) {
                    k.log(Level.SEVERE, "Could not close", iOException);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public o p(j object) {
        Object object2 = new HashMap<String, String>();
        int n2 = ((j)object).h();
        if (z.a(2, n2) || z.a(3, n2)) {
            try {
                ((j)object).k((Map<String, String>)object2);
            }
            catch (p p2) {
                return t.m(p2.a(), "text/plain", p2.getMessage());
            }
            catch (IOException iOException) {
                object = n.h;
                object2 = com.github.catvod.spider.merge.C.a.c("SERVER INTERNAL ERROR: IOException: ");
                ((StringBuilder)object2).append(iOException.getMessage());
                return t.m((m)object, "text/plain", ((StringBuilder)object2).toString());
            }
        }
        object2 = ((j)object).i();
        object = ((j)object).j();
        ((HashMap)object2).put("NanoHttpd.QUERY_STRING", object);
        return t.m(n.f, "text/plain", "Not Found");
    }

    public final void q() {
        Thread thread;
        Objects.requireNonNull(this.d);
        this.c = new ServerSocket();
        this.c.setReuseAddress(true);
        q q2 = new q(this);
        this.e = thread = new Thread(q2);
        thread.setDaemon(true);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
        while (!q.a(q2) && q.b(q2) == null) {
            try {
                Thread.sleep(10L);
            }
            catch (Throwable throwable) {}
        }
        if (q.b(q2) == null) {
            return;
        }
        throw q.b(q2);
    }

    public final void r() {
        block3: {
            t.o(this.c);
            this.f.a();
            Thread thread = this.e;
            if (thread == null) break block3;
            try {
                thread.join();
            }
            catch (Exception exception) {
                k.log(Level.SEVERE, "Could not stop all connections", exception);
            }
        }
    }

    protected final boolean s(o o2) {
        boolean bl = o2.d() != null && (o2.d().toLowerCase().contains("text/") || o2.d().toLowerCase().contains("/json"));
        return bl;
    }
}

