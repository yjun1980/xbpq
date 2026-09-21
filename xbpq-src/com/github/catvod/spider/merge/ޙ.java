/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import java.math.BigInteger;
import java.security.SecureRandom;

public class \u0799 {
    public static BigInteger \u037f(BigInteger bigInteger, BigInteger bigInteger2) {
        SecureRandom secureRandom = new SecureRandom();
        return new BigInteger(bigInteger2.toByteArray().length * 8 - 1, secureRandom).abs().add(bigInteger);
    }
}

