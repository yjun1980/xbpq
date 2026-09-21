package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class g extends SSLSocketFactory {
    public static final X509TrustManager b = new f();
    static String[] c;
    static String[] d;
    private final SSLSocketFactory a;

    static {
        c = null;
        d = null;
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains(cYh.d("34030D"))) {
                        linkedList.add(str);
                    }
                }
                c = (String[]) linkedList.toArray(new String[linkedList.size()]);
                List asList = Arrays.asList(cYh.d("331C120E0509260F1618031238110402086852661E16141738030910646253"), cYh.d("331C120E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081D241D1E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938627467081D241D1E021F1B546875"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910656F51"), cYh.d("331C120E12192F14040E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E0509260F1618031238110402086B55681E12151938030910"), cYh.d("331C120E0509260F1618031238110402086852661E12151938030910"), cYh.d("331C120E12192318040E12192303000E001333181E62131F340F041512052412020E041226"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B"), cYh.d("331C120E12192318040E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910"));
                List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                HashSet hashSet = new HashSet(asList);
                hashSet.retainAll(asList2);
                hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                d = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public g() {
        try {
            SSLContext sSLContext = SSLContext.getInstance(cYh.d("331C12"));
            sSLContext.init(null, new X509TrustManager[]{b}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            this.a = socketFactory;
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArr = c;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = d;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.a.createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        if (createSocket instanceof SSLSocket) {
            a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.a.createSocket(inetAddress, i);
        if (createSocket instanceof SSLSocket) {
            a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        if (createSocket instanceof SSLSocket) {
            a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return d;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return d;
    }
}
