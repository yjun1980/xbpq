/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.github.catvod.spider.merge.k;

import android.os.Build;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.k.h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class i
extends SSLSocketFactory {
    static String[] b;
    static String[] c;
    public static final X509TrustManager d;
    private final SSLSocketFactory a;

    static {
        block6: {
            SSLSocket sSLSocket = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket == null) break block6;
            Collection<String> collection = new Collection<String>();
            for (String string : sSLSocket.getSupportedProtocols()) {
                if (string.toUpperCase().contains(cYh.d("34030D"))) continue;
                collection.add(string);
            }
            try {
                b = collection.toArray(new String[collection.size()]);
                if (Build.VERSION.SDK_INT >= 21) break block6;
                collection = Arrays.asList(cYh.d("331C120E0509260F1618031238110402086852661E16141738030910646253"), cYh.d("331C120E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081D241D1E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938627467081D241D1E021F1B546875"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910656F51"), cYh.d("331C120E12192F14040E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E0509260F1618031238110402086B55681E12151938030910"), cYh.d("331C120E0509260F1618031238110402086852661E12151938030910"), cYh.d("331C120E12192318040E12192303000E001333181E62131F340F041512052412020E041226"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B"), cYh.d("331C120E12192318040E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910"));
                List<String> list = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                HashSet<String> hashSet = new HashSet<String>(collection);
                hashSet.retainAll(list);
                collection = new Collection<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
                hashSet.addAll(collection);
                c = ((AbstractCollection)hashSet).toArray(new String[hashSet.size()]);
            }
            catch (IOException iOException) {
                RuntimeException runtimeException = new RuntimeException(iOException);
                throw runtimeException;
            }
        }
        d = new h();
    }

    public i(X509TrustManager x509TrustManagerArray) {
        SSLContext sSLContext;
        block5: {
            block4: {
                try {
                    sSLContext = SSLContext.getInstance(cYh.d("331C12"));
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
        if (Build.VERSION.SDK_INT < 21 && (stringArray = c) != null) {
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
        return c;
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        return c;
    }
}

