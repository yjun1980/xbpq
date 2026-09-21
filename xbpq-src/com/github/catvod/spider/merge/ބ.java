/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge;

import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class \u0784 {
    public static String \u037f(String string, String object, String string2) {
        try {
            Cipher cipher = Cipher.getInstance(SOY.d("3B1702593735397D013D37244D023012101E1435"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(((String)object).getBytes(), SOY.d("3B1702"));
            object = new IvParameterSpec(string2.getBytes());
            cipher.init(2, (Key)secretKeySpec, (AlgorithmParameterSpec)object);
            string = new String(cipher.doFinal(Base64.decode((byte[])string.getBytes(), (int)0)));
            return string;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }
}

