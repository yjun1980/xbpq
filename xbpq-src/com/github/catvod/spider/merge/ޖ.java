/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0797;
import java.math.BigInteger;
import java.util.Arrays;

public final class \u0796 {
    public static byte[] \u037f(String object) {
        int n2;
        object = new BigInteger((String)object, 16).toByteArray();
        for (n2 = 0; n2 < ((Object)object).length && object[n2] == false; ++n2) {
        }
        return Arrays.copyOfRange((byte[])object, n2, ((Object)object).length);
    }

    public static String \u0528(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = Integer.toHexString(byArray[i2] & 0xFF);
            if (string.length() == 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static BigInteger \u0529(byte[] byArray) {
        return new BigInteger(\u0796.\u0528(byArray), 16);
    }

    public static \u0797 \u052a(BigInteger bigInteger, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("5F62"));
        stringBuilder.append(String.valueOf(n2 * 2));
        stringBuilder.append(SOY.d("02"));
        return new \u0797(\u0796.\u037f(String.format(stringBuilder.toString(), bigInteger)));
    }

    public static byte[] \u052b(int n2) {
        return new byte[]{(byte)n2};
    }
}

