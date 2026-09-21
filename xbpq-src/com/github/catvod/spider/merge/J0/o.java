/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.b;
import com.github.catvod.spider.merge.J0.k;
import com.github.catvod.spider.merge.J0.l;
import com.github.catvod.spider.merge.J0.m;
import com.github.catvod.spider.merge.J0.n;
import com.github.catvod.spider.merge.J0.t;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;

public final class o
implements Closeable {
    private m a;
    private String b;
    private InputStream c;
    private long d;
    private final Map<String, String> e = new k(this);
    private final Map<String, String> f = new HashMap<String, String>();
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;

    protected o(m m2, String string, InputStream inputStream, long l2) {
        this.a = m2;
        this.b = string;
        boolean bl = false;
        if (inputStream == null) {
            this.c = new ByteArrayInputStream(new byte[0]);
            this.d = 0L;
        } else {
            this.c = inputStream;
            this.d = l2;
        }
        if (this.d < 0L) {
            bl = true;
        }
        this.h = bl;
        this.j = true;
    }

    static /* synthetic */ Map a(o o2) {
        return o2.f;
    }

    private void h(OutputStream outputStream, long l2) {
        byte[] byArray = new byte[(int)16384L];
        boolean bl = l2 == -1L;
        long l3;
        int n2;
        while ((l2 > 0L || bl) && (n2 = this.c.read(byArray, 0, (int)(l3 = bl ? 16384L : Math.min(l2, 16384L)))) > 0) {
            outputStream.write(byArray, 0, n2);
            if (bl) continue;
            l2 -= (long)n2;
        }
        return;
    }

    private void i(OutputStream outputStream, long l2) {
        if (this.i) {
            outputStream = new GZIPOutputStream(outputStream);
            this.h(outputStream, -1L);
            ((GZIPOutputStream)outputStream).finish();
        } else {
            this.h(outputStream, l2);
        }
    }

    public final void b(String string, String string2) {
        ((k)this.e).put(string, string2);
    }

    public final String c(String string) {
        return (String)((HashMap)this.f).get(string.toLowerCase());
    }

    @Override
    public final void close() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return "close".equals(this.c("connection"));
    }

    protected final void f(PrintWriter printWriter, String string, String string2) {
        printWriter.append(string).append(": ").append(string2).append("\r\n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void g(OutputStream object) {
        Object object2 = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        ((DateFormat)object2).setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            long l2;
            if (this.a == null) {
                object = new Error("sendResponse(): Status can't be null.");
                throw object;
            }
            b b2 = new b(this.b);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)object, b2.e());
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter, false);
            printWriter.append("HTTP/1.1 ").append(((n)this.a).b()).append(" \r\n");
            String string = this.b;
            if (string != null) {
                this.f(printWriter, "Content-Type", string);
            }
            if (this.c("date") == null) {
                Date date = new Date();
                this.f(printWriter, "Date", ((DateFormat)object2).format(date));
            }
            for (Map.Entry entry : ((HashMap)this.e).entrySet()) {
                this.f(printWriter, (String)entry.getKey(), (String)entry.getValue());
            }
            if (this.c("connection") == null) {
                object2 = this.j ? "keep-alive" : "close";
                this.f(printWriter, "Connection", (String)object2);
            }
            if (this.c("content-length") != null) {
                this.i = false;
            }
            if (this.i) {
                this.f(printWriter, "Content-Encoding", "gzip");
                this.h = true;
            }
            long l3 = this.c != null ? this.d : 0L;
            if (this.g != 5 && this.h) {
                this.f(printWriter, "Transfer-Encoding", "chunked");
                l2 = l3;
            } else {
                l2 = l3;
                if (!this.i) {
                    l2 = this.j(printWriter, l3);
                }
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.g != 5 && this.h) {
                object2 = new l((OutputStream)object);
                this.i((OutputStream)object2, -1L);
                ((l)object2).a();
            } else {
                this.i((OutputStream)object, l2);
            }
            ((OutputStream)object).flush();
            t.a(this.c);
            return;
        }
        catch (IOException iOException) {
            t.c().log(Level.SEVERE, "Could not send response to the client", iOException);
        }
    }

    protected final long j(PrintWriter printWriter, long l2) {
        CharSequence charSequence = this.c("content-length");
        long l3 = l2;
        if (charSequence != null) {
            try {
                l3 = Long.parseLong((String)charSequence);
            }
            catch (NumberFormatException numberFormatException) {
                Logger logger = t.c();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("content-length was no number ");
                stringBuilder.append((String)charSequence);
                logger.severe(stringBuilder.toString());
                l3 = l2;
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Content-Length: ");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append("\r\n");
        printWriter.print(((StringBuilder)charSequence).toString());
        return l3;
    }

    public final void k(boolean bl) {
        this.i = bl;
    }

    public final void l(boolean bl) {
        this.j = bl;
    }

    public final void m(int n2) {
        this.g = n2;
    }
}

