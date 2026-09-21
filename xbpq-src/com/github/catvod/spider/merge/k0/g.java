/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.k0.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.LinkedList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class g
extends SSLSocketFactory {
    static String[] b;
    public static final X509TrustManager c;
    private final SSLSocketFactory a;

    static {
        block6: {
            String[] stringArray = (String[])SSLSocketFactory.getDefault().createSocket();
            if (stringArray == null) break block6;
            LinkedList<String> linkedList = new LinkedList<String>();
            for (String string : stringArray.getSupportedProtocols()) {
                if (string.toUpperCase().contains("SSL")) continue;
                linkedList.add(string);
            }
            try {
                b = linkedList.toArray(new String[linkedList.size()]);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        c = new f();
    }

    public g(X509TrustManager x509TrustManagerArray) {
        SSLContext sSLContext;
        block5: {
            block4: {
                try {
                    sSLContext = SSLContext.getInstance("TLS");
                    if (x509TrustManagerArray == null) break block4;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new AssertionError();
                }
                X509TrustManager[] x509TrustManagerArray2 = new X509TrustManager[]{x509TrustManagerArray};
                x509TrustManagerArray = x509TrustManagerArray2;
                break block5;
            }
            x509TrustManagerArray = null;
        }
        sSLContext.init(null, x509TrustManagerArray, null);
        this.a = sSLContext.getSocketFactory();
    }

    private void a(SSLSocket sSLSocket) {
        String[] stringArray = b;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
    }

    @Override
    public final Socket createSocket(String object, int n2) {
        if ((object = this.a.createSocket((String)object, n2)) instanceof SSLSocket) {
            this.a((SSLSocket)object);
        }
        return object;
    }

    @Override
    public final Socket createSocket(String object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.a.createSocket((String)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.a((SSLSocket)object);
        }
        return object;
    }

    @Override
    public final Socket createSocket(InetAddress object, int n2) {
        if ((object = this.a.createSocket((InetAddress)object, n2)) instanceof SSLSocket) {
            this.a((SSLSocket)object);
        }
        return object;
    }

    @Override
    public final Socket createSocket(InetAddress object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.a.createSocket((InetAddress)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.a((SSLSocket)object);
        }
        return object;
    }

    @Override
    public final Socket createSocket(Socket socket, String string, int n2, boolean bl) {
        if ((socket = this.a.createSocket(socket, string, n2, bl)) instanceof SSLSocket) {
            this.a((SSLSocket)socket);
        }
        return socket;
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        return null;
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return null;
    }
}

