/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.github.catvod.spider.merge.af;

import android.annotation.SuppressLint;
import com.github.catvod.spider.merge.af.h;
import com.github.catvod.spider.merge.nIe;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class i
extends SSLSocketFactory {
    @SuppressLint(value={"TrustAllX509TrustManager", "CustomX509TrustManager"})
    public static final X509TrustManager d = new h();
    private SSLSocketFactory a;
    private String[] b;
    private String[] c;

    public i() {
        HashSet<String> hashSet;
        List<String> list = new List<String>();
        Object object = (SSLSocket)SSLSocketFactory.getDefault().createSocket();
        String[] stringArray = ((SSLSocket)object).getSupportedProtocols();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            hashSet = stringArray[i2];
            if (((String)((Object)hashSet)).toUpperCase().contains(nIe.d("11351F"))) continue;
            list.add((String)((Object)hashSet));
            continue;
        }
        try {
            this.c = list.toArray(new String[0]);
            hashSet = Arrays.asList(nIe.d("162A001C1B1C0339040A1D071D271610167D77500C040A021D351B027A7776"), nIe.d("162A001C1B1C0339040A1D071D271610167E705E0C040A021D351B027B7A74"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B160C00250C10010E705365"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B1608012B0C10010E705365"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D5466751608012B0C10010E715E67"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D271610167E705E0C000B0C1D351B027B7A74"), nIe.d("162A001C0C0C0A22161C1B1C0339040A1D071D271610167E705E0C040A021D351B027B7A74"), nIe.d("162A001C1B1C0339040A1D071D5517061A100722161C0A0D0139000B08"), nIe.d("162A001C1B1C0339040A1D071D271610167E705E0C000B0C1D351B02"), nIe.d("162A001C1B1C0339040A1D071D271610167D77500C000B0C1D351B02"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C700D0A113916070C100124101C1A0703"), nIe.d("162A001C0C0C062E161C0C0C0635121C1E06162E0C020C1C1D57617B160C00250C10010E"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D5517061A100722161C0A0D0139000B08"), nIe.d("162A001C0C0C062E161C1B1C0339040A1D071D271610167E705E0C000B0C1D351B02"));
            list = Arrays.asList(((SSLSocket)object).getSupportedCipherSuites());
            super(hashSet);
            stringArray.retainAll(list);
            hashSet = new HashSet<String>(Arrays.asList(((SSLSocket)object).getEnabledCipherSuites()));
            stringArray.addAll(hashSet);
            this.b = stringArray.toArray(new String[0]);
            object = SSLContext.getInstance(nIe.d("162A00"));
            ((SSLContext)object).init(null, new X509TrustManager[]{d}, null);
            this.a = object = ((SSLContext)object).getSocketFactory();
            HttpsURLConnection.setDefaultSSLSocketFactory((SSLSocketFactory)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(SSLSocket sSLSocket) {
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

