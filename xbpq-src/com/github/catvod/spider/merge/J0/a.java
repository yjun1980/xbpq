/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.h;
import com.github.catvod.spider.merge.J0.i;
import com.github.catvod.spider.merge.J0.j;
import com.github.catvod.spider.merge.J0.t;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Objects;
import java.util.logging.Level;

public final class a
implements Runnable {
    private final InputStream a;
    private final Socket b;
    final t c;

    public a(t t2, InputStream inputStream, Socket socket) {
        this.c = t2;
        this.a = inputStream;
        this.b = socket;
    }

    public final void a() {
        t.a(this.a);
        t.a(this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable2;
        OutputStream outputStream;
        block8: {
            Object object;
            block7: {
                OutputStream outputStream2 = null;
                outputStream = null;
                try {
                    try {
                        OutputStream outputStream3;
                        outputStream = outputStream3 = this.b.getOutputStream();
                        outputStream2 = outputStream3;
                        Objects.requireNonNull((i)t.b(this.c));
                        outputStream = outputStream3;
                        outputStream2 = outputStream3;
                        outputStream = outputStream3;
                        outputStream2 = outputStream3;
                        object = new h();
                        outputStream = outputStream3;
                        outputStream2 = outputStream3;
                        outputStream = outputStream3;
                        outputStream2 = outputStream3;
                        j j2 = new j(this.c, (h)object, this.a, outputStream3, this.b.getInetAddress());
                        while (true) {
                            outputStream = outputStream3;
                            outputStream2 = outputStream3;
                            object = outputStream3;
                            if (!this.b.isClosed()) {
                                outputStream = outputStream3;
                                outputStream2 = outputStream3;
                                j2.d();
                                continue;
                            }
                            break;
                        }
                    }
                    catch (Exception exception) {
                        outputStream = outputStream2;
                        if (exception instanceof SocketException) {
                            outputStream = outputStream2;
                            object = outputStream2;
                            if ("NanoHttpd Shutdown".equals(exception.getMessage())) break block7;
                        }
                        outputStream = outputStream2;
                        object = outputStream2;
                        if (exception instanceof SocketTimeoutException) break block7;
                        outputStream = outputStream2;
                        t.c().log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", exception);
                        object = outputStream2;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            t.a(object);
            t.a(this.a);
            t.a(this.b);
            this.c.f.b(this);
            return;
        }
        t.a(outputStream);
        t.a(this.a);
        t.a(this.b);
        this.c.f.b(this);
        throw throwable2;
    }
}

