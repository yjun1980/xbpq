/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.lq;

import com.github.catvod.spider.merge.lq.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class g
extends SSLSocketFactory {
    public static final X509TrustManager b = new f();
    static String[] c = null;
    static String[] d = null;
    private final SSLSocketFactory a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        SSLSocket sSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
        if (sSLSocket == null) return;
        AbstractCollection abstractCollection = new LinkedList();
        for (String string : sSLSocket.getSupportedProtocols()) {
            if (string.toUpperCase().contains("SSL")) continue;
            ((LinkedList)abstractCollection).add(string);
        }
        try {
            c = ((LinkedList)abstractCollection).toArray(new String[((LinkedList)abstractCollection).size()]);
            List<String> list = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            List<String> list2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            abstractCollection = new HashSet(list);
            abstractCollection.retainAll(list2);
            HashSet<String> hashSet = new HashSet<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            abstractCollection.addAll(hashSet);
            d = abstractCollection.toArray(new String[((HashSet)abstractCollection).size()]);
            return;
        }
        catch (IOException iOException) {
            RuntimeException runtimeException = new RuntimeException(iOException);
            throw runtimeException;
        }
    }

    public g() {
        try {
            Object object = SSLContext.getInstance("TLS");
            ((SSLContext)object).init(null, new X509TrustManager[]{b}, null);
            this.a = object = ((SSLContext)object).getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)object);
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] stringArray = c;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
        if ((stringArray = d) != null) {
            sSLSocket.setEnabledCipherSuites(stringArray);
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
        return d;
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return d;
    }
}

