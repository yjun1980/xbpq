/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.xq;
import java.security.Key;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class Xk {
    public static String l8(String string, String object, String string2) {
        object = new DESedeKeySpec(((String)object).getBytes());
        SecretKey secretKey = SecretKeyFactory.getInstance("desede").generateSecret((KeySpec)object);
        object = Cipher.getInstance("desede/CBC/PKCS5Padding");
        ((Cipher)object).init(2, (Key)secretKey, new IvParameterSpec(string2.getBytes()));
        return new String(((Cipher)object).doFinal(xq.l8(string)), "utf-8");
    }
}

