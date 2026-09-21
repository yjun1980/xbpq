/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02c6;
import com.github.catvod.spider.merge.\u08ac;
import com.github.catvod.spider.merge.\u0cf2;
import com.github.catvod.spider.merge.\u1076;
import java.util.Arrays;

public class \u1081 {
    public int \u037f = -1;
    public \u08ac \u0528 = new \u08ac();
    public \u1081[] \u0529;
    public boolean \u052a = false;
    public int \u052b;
    public \u0cf2 \u052c;
    public boolean \u052d;
    public \u037f[] \u052e;

    public \u1081() {
    }

    public \u1081(\u08ac \u08ac2) {
        this.\u0528 = \u08ac2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof \u1081)) {
            return false;
        }
        object = (\u1081)object;
        return this.\u0528.equals(((\u1081)object).\u0528);
    }

    public int hashCode() {
        return \u02c6.\u037f(\u02c6.\u052b(\u02c6.\u052a(7), this.\u0528.hashCode()), 1);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u037f);
        stringBuilder.append(SOY.d("40"));
        stringBuilder.append(this.\u0528);
        if (this.\u052a) {
            stringBuilder.append(SOY.d("476C"));
            Object[] objectArray = this.\u052e;
            if (objectArray != null) {
                stringBuilder.append(Arrays.toString(objectArray));
            } else {
                stringBuilder.append(this.\u052b);
            }
        }
        return stringBuilder.toString();
    }

    public static class \u037f {
        public \u1076 \u037f;
        public int \u0528;

        public \u037f(\u1076 \u10762, int n2) {
            this.\u0528 = n2;
            this.\u037f = \u10762;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SOY.d("52"));
            stringBuilder.append(this.\u037f);
            stringBuilder.append(SOY.d("5672"));
            stringBuilder.append(this.\u0528);
            stringBuilder.append(SOY.d("53"));
            return stringBuilder.toString();
        }
    }
}

