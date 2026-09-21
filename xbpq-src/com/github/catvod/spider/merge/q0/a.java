/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.q0.b;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class a
implements HostnameVerifier {
    public static final a a = new a();

    private /* synthetic */ a() {
    }

    @Override
    public final boolean verify(String string, SSLSession sSLSession) {
        int n2 = b.f;
        return true;
    }
}

