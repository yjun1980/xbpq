package com.github.catvod.spider.merge.k;

import android.os.Build;
import com.github.catvod.spider.merge.cYh;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.github.catvod.spider.merge.k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166i extends SSLSocketFactory {
    static String[] b;
    static String[] c;
    public static final X509TrustManager d;
    private final SSLSocketFactory a;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains(cYh.d("34030D"))) {
                        linkedList.add(str);
                    }
                }
                b = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List asList = Arrays.asList(cYh.d("331C120E0509260F1618031238110402086852661E16141738030910646253"), cYh.d("331C120E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081D241D1E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938627467081D241D1E021F1B546875"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910656F51"), cYh.d("331C120E12192F14040E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E0509260F1618031238110402086B55681E12151938030910"), cYh.d("331C120E0509260F1618031238110402086852661E12151938030910"), cYh.d("331C120E12192318040E12192303000E001333181E62131F340F041512052412020E041226"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B"), cYh.d("331C120E12192318040E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910"));
                    List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(asList);
                    hashSet.retainAll(asList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    c = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
            d = new C0165h();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C0166i(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance(cYh.d("331C12"));
            sSLContext.init(null, x509TrustManager != null ? new X509TrustManager[]{x509TrustManager} : null, null);
            this.a = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    private void a(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2 = b;
        if (strArr2 != null) {
            sSLSocket.setEnabledProtocols(strArr2);
        }
        if (Build.VERSION.SDK_INT >= 21 || (strArr = c) == null) {
            return;
        }
        sSLSocket.setEnabledCipherSuites(strArr);
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
        return c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return c;
    }
}
