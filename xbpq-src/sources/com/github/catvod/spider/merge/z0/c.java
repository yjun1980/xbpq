package com.github.catvod.spider.merge.z0;

import com.github.catvod.spider.merge.cYh;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public final class c {
    public static a a() {
        a aVar = new a();
        try {
            SSLContext sSLContext = SSLContext.getInstance(cYh.d("331C12"));
            b bVar = new b();
            sSLContext.init(null, new TrustManager[]{bVar}, null);
            aVar.a = sSLContext.getSocketFactory();
            aVar.b = bVar;
            return aVar;
        } catch (KeyManagementException | KeyStoreException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
