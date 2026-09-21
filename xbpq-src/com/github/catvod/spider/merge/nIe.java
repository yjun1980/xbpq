/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.io.ByteArrayOutputStream;

public class nIe {
    private static final String KEY = "BfSCIO";
    private static final String hexString = "0123456789ABCDEF";

    public static String d(String object) {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((String)object).length() / 2);
        for (n2 = 0; n2 < ((String)object).length(); n2 += 2) {
            byteArrayOutputStream.write(hexString.indexOf(((String)object).charAt(n2)) << 4 | hexString.indexOf(((String)object).charAt(n2 + 1)));
        }
        object = byteArrayOutputStream.toByteArray();
        int n3 = ((Object)object).length;
        int n4 = KEY.length();
        for (n2 = 0; n2 < n3; ++n2) {
            object[n2] = (byte)(object[n2] ^ KEY.charAt(n2 % n4));
        }
        return new String((byte[])object);
    }
}

