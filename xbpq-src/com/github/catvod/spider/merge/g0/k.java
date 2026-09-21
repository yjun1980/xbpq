/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.GuaZi;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class k
implements HostnameVerifier {
    public static final k a = new k();

    private /* synthetic */ k() {
    }

    @Override
    public final boolean verify(String string, SSLSession sSLSession) {
        int n2 = GuaZi.o;
        return true;
    }
}

