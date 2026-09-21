/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.spider.Guazi
 */
package com.github.catvod.spider.merge.xc.S;

import com.github.catvod.spider.Guazi;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class a
implements HostnameVerifier {
    public final int a;

    public /* synthetic */ a(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean verify(String stringArray, SSLSession sSLSession) {
        switch (this.a) {
            default: {
                stringArray = Guazi.c;
            }
            case 0: 
        }
        return true;
    }
}

