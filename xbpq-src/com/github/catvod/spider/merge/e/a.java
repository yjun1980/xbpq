/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.L1.h;
import com.github.catvod.spider.merge.n1.i;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class a {
    public static BigInteger a(BigInteger bigInteger) {
        BigInteger bigInteger2 = BigInteger.ONE;
        SecureRandom secureRandom = new SecureRandom();
        return new BigInteger(bigInteger.toByteArray().length * 8 - 1, secureRandom).abs().add(bigInteger2);
    }

    public static String b(String string, String object) {
        int n2 = string.indexOf((String)object);
        if (n2 >= 0) {
            string = string.substring(((String)object).length() + n2);
            com.github.catvod.spider.merge.L1.i i2 = new com.github.catvod.spider.merge.L1.i(string);
            n2 = 0;
            while (true) {
                object = i2.a();
                int n3 = ((h)object).a;
                if (n3 == 47) {
                    n2 = 1;
                    continue;
                }
                if (n2 != 0 && i2.b()) {
                    return string.substring(0, ((h)object).b);
                }
                if (n3 == 2) break;
            }
            throw new i("Could not find matching braces");
        }
        throw new i("Start not found");
    }
}

