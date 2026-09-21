/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.github.catvod.spider.merge;

import android.os.Build;
import com.github.catvod.spider.merge.SOY;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class \u078d
extends SSLSocketFactory {
    static String[] \u037f;
    static String[] \u0528;
    public static final X509TrustManager \u0529;
    private final SSLSocketFactory \u052a;

    static {
        block6: {
            SSLSocket sSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket == null) break block6;
            AbstractCollection abstractCollection = new LinkedList();
            for (String string : sSLSocket.getSupportedProtocols()) {
                if (string.toUpperCase().contains(SOY.d("29011D"))) continue;
                abstractCollection.add(string);
            }
            try {
                \u037f = abstractCollection.toArray(new String[abstractCollection.size()]);
                if (Build.VERSION.SDK_INT >= 21) break block6;
                List<String> list = Arrays.asList(SOY.d("2E1E022926243B0D063F203F251314252B454F640E31373A25011937474F4E"), SOY.d("2E1E022926243B0D063F203F251314252B46486A0E31373A2501193746424C"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B3438110E253C36486767"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B30391F0E253C36486767"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E373124256064402B30391F0E253C36496A65"), SOY.d("2E1E022931343E1A142926243B0D063F203F251314252B46486A0E3536342501193746424C"), SOY.d("2E1E022931343216142926243B0D063F203F251314252B46486A0E31373A2501193746424C"), SOY.d("2E1E022926243B0D063F203F2561153327283F1614293735390D023E35"), SOY.d("2E1E022926243B0D063F203F251314252B46486A0E35363425011937"), SOY.d("2E1E022926243B0D063F203F251314252B454F640E35363425011937"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E453032290D1432312839101229273F3B"), SOY.d("2E1E022931343E1A142931343E011029233E2E1A0E3731242563634E2B3438110E253C36"), SOY.d("2E1E022931343E1A142926243B0D063F203F2561153327283F1614293735390D023E35"), SOY.d("2E1E022931343E1A142926243B0D063F203F251314252B46486A0E35363425011937"));
                List<String> list2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                abstractCollection = new HashSet(list);
                abstractCollection.retainAll(list2);
                HashSet<String> hashSet = new HashSet<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
                abstractCollection.addAll(hashSet);
                \u0528 = ((HashSet)abstractCollection).toArray(new String[((HashSet)abstractCollection).size()]);
            }
            catch (IOException iOException) {
                RuntimeException runtimeException = new RuntimeException(iOException);
                throw runtimeException;
            }
        }
        \u0529 = new X509TrustManager(){

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

    public \u078d(X509TrustManager x509TrustManagerArray) {
        SSLContext sSLContext;
        block5: {
            block4: {
                try {
                    sSLContext = SSLContext.getInstance(SOY.d("2E1E02"));
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
        this.\u052a = sSLContext.getSocketFactory();
    }

    private void \u037f(SSLSocket sSLSocket) {
        String[] stringArray = \u037f;
        if (stringArray != null) {
            sSLSocket.setEnabledProtocols(stringArray);
        }
        if (Build.VERSION.SDK_INT < 21 && (stringArray = \u0528) != null) {
            sSLSocket.setEnabledCipherSuites(stringArray);
        }
    }

    @Override
    public Socket createSocket(String object, int n2) {
        if ((object = this.\u052a.createSocket((String)object, n2)) instanceof SSLSocket) {
            this.\u037f((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(String object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.\u052a.createSocket((String)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.\u037f((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(InetAddress object, int n2) {
        if ((object = this.\u052a.createSocket((InetAddress)object, n2)) instanceof SSLSocket) {
            this.\u037f((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(InetAddress object, int n2, InetAddress inetAddress, int n3) {
        if ((object = this.\u052a.createSocket((InetAddress)object, n2, inetAddress, n3)) instanceof SSLSocket) {
            this.\u037f((SSLSocket)object);
        }
        return object;
    }

    @Override
    public Socket createSocket(Socket socket, String string, int n2, boolean bl) {
        if ((socket = this.\u052a.createSocket(socket, string, n2, bl)) instanceof SSLSocket) {
            this.\u037f((SSLSocket)socket);
        }
        return socket;
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return \u0528;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return \u0528;
    }
}

