/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.kN;
import com.github.catvod.spider.merge.xy;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class f3 {
    public static String OL(String string) {
        return xy.b(f3.T4(string));
    }

    public static MessageDigest S() {
        return f3.l8("SHA-256");
    }

    public static byte[] T4(String string) {
        return f3.b(kN.S(string));
    }

    public static byte[] b(byte[] byArray) {
        return f3.S().digest(byArray);
    }

    public static MessageDigest l8(String object) {
        try {
            object = MessageDigest.getInstance((String)object);
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalArgumentException(noSuchAlgorithmException);
        }
    }
}

