/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.h.f;
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
        LinkedList<String> linkedList = new LinkedList<String>();
        for (String string : sSLSocket.getSupportedProtocols()) {
            if (string.toUpperCase().contains(cYh.d("34030D"))) continue;
            linkedList.add(string);
        }
        try {
            c = linkedList.toArray(new String[linkedList.size()]);
            List<String> list = Arrays.asList(cYh.d("331C120E0509260F1618031238110402086852661E16141738030910646253"), cYh.d("331C120E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081D241D1E021F1B556577"), cYh.d("331C120E12192318040E12192303000E001333181E10120938627467081D241D1E021F1B546875"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910656F51"), cYh.d("331C120E12192F14040E0509260F1618031238110402086B55681E16141738030910656F51"), cYh.d("331C120E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E0509260F1618031238110402086B55681E12151938030910"), cYh.d("331C120E0509260F1618031238110402086852661E12151938030910"), cYh.d("331C120E12192318040E12192303000E001333181E62131F340F041512052412020E041226"), cYh.d("331C120E12192318040E12192303000E001333181E10120938617369081925131E021F1B"), cYh.d("331C120E12192318040E0509260F161803123863051404052214040E1418240F121916"), cYh.d("331C120E12192318040E0509260F1618031238110402086B55681E12151938030910"));
            List<String> list2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            Object object = new HashSet(list);
            ((AbstractCollection)object).retainAll(list2);
            HashSet<String> hashSet = new HashSet<String>(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            ((AbstractCollection)object).addAll(hashSet);
            d = ((AbstractCollection)object).toArray(new String[((HashSet)object).size()]);
            return;
        }
        catch (IOException iOException) {
            RuntimeException runtimeException = new RuntimeException(iOException);
            throw runtimeException;
        }
    }

    public g() {
        try {
            Object object = SSLContext.getInstance(cYh.d("331C12"));
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

