/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.github.catvod.spider.merge;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class Cj
extends SSLSocketFactory {
    static String[] S;
    public static final X509TrustManager T4;
    static String[] l8;
    private final SSLSocketFactory b;

    static {
        block6: {
            SSLSocket sSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket == null) break block6;
            List<String> list = new List<String>();
            for (String string : sSLSocket.getSupportedProtocols()) {
                if (string.toUpperCase().contains("SSL")) continue;
                list.add(string);
            }
            try {
                l8 = list.toArray(new String[list.size()]);
                if (Build.VERSION.SDK_INT >= 21) break block6;
                list = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
                List<String> list2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                HashSet<String> hashSet = new HashSet<String>(list);
                hashSet.retainAll(list2);
                HashSet<String> hashSet2 = new HashSet<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
                hashSet.addAll(hashSet2);
                S = hashSet.toArray(new String[hashSet.size()]);
            }
            catch (IOException iOException) {
                RuntimeException runtimeException = new RuntimeException(iOException);
                throw runtimeException;
            }
        }
        T4 = new X509TrustManager(){

            @Override
            public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    public Cj(X509TrustManager x509TrustManagerArray) {
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
        this.b = sSLContext.getSocketFactory();
    }

    private void l8(SSLSocket sSLSocket) {
        String[] stringArray = l8;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
        if (Build.VERSION.SDK_INT < 21 && (stringArray = S) != null) {
            sSLSocket.setEnabledCipherSuites(stringArray);
        }
    }

    @Override
    public Socket createSocket(String object, int n2) {
        if ((object = this.b.createSocket((String)object, n2)) instanceof SSLSocket) {
            this.l8((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(String object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.b.createSocket((String)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.l8((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(InetAddress object, int n2) {
        if ((object = this.b.createSocket((InetAddress)object, n2)) instanceof SSLSocket) {
            this.l8((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(InetAddress object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.b.createSocket((InetAddress)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.l8((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(Socket socket, String string, int n2, boolean bl) {
        if ((socket = this.b.createSocket(socket, string, n2, bl)) instanceof SSLSocket) {
            this.l8((SSLSocket)socket);
        }
        return socket;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return S;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return S;
    }
}

