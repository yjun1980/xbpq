/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.J0.a;
import com.github.catvod.spider.merge.J0.e;
import com.github.catvod.spider.merge.J0.t;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.logging.Level;

public final class q
implements Runnable {
    private final int a;
    private IOException b;
    private boolean c;
    final t d;

    public q(t t2) {
        this.d = t2;
        this.c = false;
        this.a = 5000;
    }

    static /* synthetic */ boolean a(q q2) {
        return q2.c;
    }

    static /* synthetic */ IOException b(q q2) {
        return q2.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        try {
            object2 = t.i(this.d);
            object = t.g(this.d) != null ? new InetSocketAddress(t.g(this.d), t.h(this.d)) : new InetSocketAddress(t.h(this.d));
            ((ServerSocket)object2).bind((SocketAddress)object);
            this.c = true;
        }
        catch (IOException iOException) {
            this.b = iOException;
            return;
        }
        do {
            try {
                Socket socket = t.i(this.d).accept();
                int n2 = this.a;
                if (n2 > 0) {
                    socket.setSoTimeout(n2);
                }
                InputStream inputStream = socket.getInputStream();
                object2 = this.d;
                object = ((t)object2).f;
                Objects.requireNonNull(object2);
                a a2 = new a((t)object2, inputStream, socket);
                ((e)object).c(a2);
            }
            catch (IOException iOException) {
                t.c().log(Level.FINE, "Communication with the client broken", iOException);
            }
        } while (!t.i(this.d).isClosed());
    }
}

