/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u078f;
import com.github.catvod.spider.merge.\u0791;
import com.github.catvod.spider.merge.\u0792;
import com.github.catvod.spider.merge.\u0793;
import com.github.catvod.spider.merge.\u0795;
import com.github.catvod.spider.merge.\u0796;
import com.github.catvod.spider.merge.\u0799;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class \u0790 {
    public static \u0795 \u037f(String object, \u0793 \u07932) {
        try {
            object = \u0790.\u0528((String)object, \u07932, MessageDigest.getInstance(SOY.d("291A105B46424C")));
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new IllegalStateException(SOY.d("393D241A1057143D2556121E143671253C3657606440541A1F21221713125A36381111040E7238185407083D271F10121E723B1702165A373F001D05153C3C131A03"));
        }
    }

    public static \u0795 \u0528(String object, \u0793 \u07932, MessageDigest object2) {
        object = \u0796.\u0529(((MessageDigest)object2).digest(((String)object).getBytes()));
        object2 = \u07932.\u037f;
        BigInteger bigInteger = \u0799.\u037f(BigInteger.ONE, ((\u078f)object2).\u052d);
        BigInteger bigInteger2 = \u0791.\u052c((\u0792)((\u078f)object2).\u052e, (BigInteger)bigInteger, (BigInteger)((\u078f)object2).\u052d, (BigInteger)((\u078f)object2).\u052a, (BigInteger)((\u078f)object2).\u052c).\u037f.mod(((\u078f)object2).\u052d);
        return new \u0795(bigInteger2, ((BigInteger)object).add(bigInteger2.multiply(\u07932.\u0528)).multiply(\u0791.\u0528(bigInteger, ((\u078f)object2).\u052d)).mod(((\u078f)object2).\u052d));
    }
}

