/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.S;

import com.github.catvod.spider.merge.xc.S.c;
import java.net.InetAddress;
import java.net.Socket;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class d
extends SSLSocketFactory {
    public static final c d = new c();
    public final SSLSocketFactory a;
    public final String[] b;
    public final String[] c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d() {
        AbstractCollection abstractCollection = new LinkedList();
        Object object = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
        for (Object object2 : ((SSLSocket)object).getSupportedProtocols()) {
            if (((String)object2).toUpperCase().contains("SSL")) continue;
            ((LinkedList)abstractCollection).add(object2);
        }
        try {
            Object object2;
            this.c = ((LinkedList)abstractCollection).toArray(new String[0]);
            Object object3 = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            object2 = Arrays.asList(((SSLSocket)object).getSupportedCipherSuites());
            super(object3);
            abstractCollection.retainAll((Collection<?>)object2);
            super(Arrays.asList(((SSLSocket)object).getEnabledCipherSuites()));
            abstractCollection.addAll(object3);
            this.b = abstractCollection.toArray(new String[0]);
            object = SSLContext.getInstance("TLS");
            ((SSLContext)object).init(null, new X509TrustManager[]{d}, null);
            this.a = object = ((SSLContext)object).getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)object);
            return;
        }
        catch (Exception exception) {}
        exception.printStackTrace();
    }

    public final void a(SSLSocket sSLSocket) {
        String[] stringArray = this.c;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
        if ((stringArray = this.b) != null) {
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
        return this.b;
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return this.b;
    }
}

