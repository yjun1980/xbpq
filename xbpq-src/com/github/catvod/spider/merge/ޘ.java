/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0796;
import com.github.catvod.spider.merge.\u0797;
import java.math.BigInteger;

public class \u0798 {
    public static \u0797 \u037f(BigInteger object) {
        String string = String.format(SOY.d("5F2A"), object);
        object = string;
        if (string.length() % 2 != 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("4A"));
            ((StringBuilder)object).append(string);
            object = ((StringBuilder)object).toString();
        }
        if (((\u0797)(object = new \u0797(\u0796.\u037f((String)object)))).\u0528(0) <= 127) {
            ((\u0797)object).\u0529(0, \u0796.\u052b(((\u0797)object).\u052b()));
            ((\u0797)object).\u0529(0, \u0796.\u052b(2));
            return object;
        }
        int n2 = ((\u0797)object).\u052b();
        ((\u0797)object).\u0529(0, \u0796.\u052b(0));
        ((\u0797)object).\u0529(0, \u0796.\u052b(n2 + 1));
        ((\u0797)object).\u0529(0, \u0796.\u052b(2));
        return object;
    }

    public static \u0797 \u0528(int n2) {
        if (n2 < 128) {
            return new \u0797(\u0796.\u052b(n2));
        }
        String string = String.format(SOY.d("5F2A"), n2);
        Object object = string;
        if (string.length() % 2 != 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append(SOY.d("4A"));
            ((StringBuilder)object).append(string);
            object = ((StringBuilder)object).toString();
        }
        object = new \u0797(\u0796.\u037f((String)object));
        ((\u0797)object).\u0529(0, \u0796.\u052b(((\u0797)object).\u052b() | 0x80));
        return object;
    }

    public static \u0797 \u0529(\u0797 ... \u0797Array) {
        \u0797 \u07972 = new \u0797(\u0796.\u052b(48));
        int n2 = \u0797Array.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            \u0797 \u07973 = \u0797Array[i2];
            n3 += \u07973.\u052b();
            \u07972.\u052a(\u07973.\u037f());
        }
        \u07972.\u0529(1, \u0798.\u0528(n3).\u037f());
        return \u07972;
    }
}

