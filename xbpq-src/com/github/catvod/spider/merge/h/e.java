/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h;

import com.github.catvod.spider.merge.h.g;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class e
implements HostnameVerifier {
    public static final e a = new e();

    private /* synthetic */ e() {
    }

    @Override
    public final boolean verify(String object, SSLSession sSLSession) {
        object = g.b;
        return true;
    }
}

