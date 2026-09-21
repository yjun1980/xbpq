/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z0;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.z0.a;
import com.github.catvod.spider.merge.z0.b;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public final class c {
    /*
     * WARNING - void declaration
     */
    public static a a() {
        void var0_6;
        a a2 = new a();
        try {
            SSLContext sSLContext = SSLContext.getInstance(cYh.d("331C12"));
            b b2 = new b();
            sSLContext.init(null, new TrustManager[]{b2}, null);
            a2.a = sSLContext.getSocketFactory();
            a2.b = b2;
            return a2;
        }
        catch (KeyStoreException keyStoreException) {
        }
        catch (KeyManagementException keyManagementException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        throw new AssertionError(var0_6);
    }
}

