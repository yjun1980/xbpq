/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f0;

import com.github.catvod.spider.merge.f0.l;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class j
implements HostnameVerifier {
    public static final j a = new j();

    private /* synthetic */ j() {
    }

    @Override
    public final boolean verify(String object, SSLSession sSLSession) {
        object = l.d;
        return true;
    }
}

