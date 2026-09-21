/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.github.catvod.spider.merge.f0;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.f0.k;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class l
extends SSLSocketFactory {
    private static String[] b;
    private static String[] c;
    @SuppressLint(value={"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager d;
    private SSLSocketFactory a;

    static {
        SSLSocket sSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
        Collection<String> collection = new Collection<String>();
        for (String string : sSLSocket.getSupportedProtocols()) {
            if (string.toUpperCase().contains("SSL")) continue;
            collection.add(string);
        }
        try {
            c = collection.toArray(new String[collection.size()]);
            collection = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            List<String> list = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet<String> hashSet = new HashSet<String>(collection);
            hashSet.retainAll(list);
            collection = new Collection<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            hashSet.addAll(collection);
            b = ((AbstractCollection)hashSet).toArray(new String[hashSet.size()]);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        d = new k();
    }

    public l() {
        try {
            Object object = SSLContext.getInstance("TLS");
            ((SSLContext)object).init(null, new X509TrustManager[]{d}, null);
            this.a = object = ((SSLContext)object).getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] stringArray = c;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
        if ((stringArray = b) != null) {
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
        return b;
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return b;
    }
}

