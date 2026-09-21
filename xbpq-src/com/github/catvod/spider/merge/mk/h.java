/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.mk;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class h
implements X509TrustManager {
    h() {
    }

    @Override
    public final void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public final void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    @Override
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

