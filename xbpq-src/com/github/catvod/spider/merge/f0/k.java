/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f0;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class k
implements X509TrustManager {
    k() {
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

