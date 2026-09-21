/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.SOY;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class \u0785 {
    public static byte[] \u037f(byte[] byArray, byte[] object, byte[] object2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec((byte[])object2);
            object2 = new SecretKeySpec;
            object2((byte[])object, SOY.d("3B1702"));
            object = Cipher.getInstance(SOY.d("3B1702593735397D013D37244D023012101E1435"));
            ((Cipher)object).init(2, (Key)object2, ivParameterSpec);
            byArray = ((Cipher)object).doFinal(byArray);
            return byArray;
        }
        catch (Exception exception) {
            SpiderDebug.log((Throwable)exception);
            return null;
        }
    }
}

