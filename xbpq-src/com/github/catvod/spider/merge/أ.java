/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.util.Date;
import java.util.TimeZone;

class \u0623
extends TimeZone {
    private final int \u037f;
    private final String \u0528;

    \u0623(boolean bl, int n2, int n3) {
        if (n2 < 24) {
            if (n3 < 60) {
                int n4;
                int n5 = n4 = (n2 * 60 + n3) * 60000;
                if (bl) {
                    n5 = -n4;
                }
                this.\u037f = n5;
                StringBuilder stringBuilder = new StringBuilder(9);
                stringBuilder.append(SOY.d("3D1F05"));
                char c2 = bl ? (char)'-' : '+';
                stringBuilder.append(c2);
                stringBuilder = \u0623.\u037f(stringBuilder, n2);
                stringBuilder.append(':');
                this.\u0528 = \u0623.\u037f(stringBuilder, n3).toString();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append(SOY.d("5A3F381801031F21711901035A3D37560616143534"));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(SOY.d("5A3A3E0306045A3D240254181C7223171A101F"));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static StringBuilder \u037f(StringBuilder stringBuilder, int n2) {
        stringBuilder.append((char)(n2 / 10 + 48));
        stringBuilder.append((char)(n2 % 10 + 48));
        return stringBuilder;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof \u0623;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this.\u0528 == ((\u0623)object).\u0528) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public String getID() {
        return this.\u0528;
    }

    @Override
    public int getOffset(int n2, int n3, int n4, int n5, int n6, int n7) {
        return this.\u037f;
    }

    @Override
    public int getRawOffset() {
        return this.\u037f;
    }

    public int hashCode() {
        return this.\u037f;
    }

    @Override
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override
    public void setRawOffset(int n2) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("21153C02201E17370B191A125A3B354B56"));
        stringBuilder.append(this.\u0528);
        stringBuilder.append(SOY.d("587E3E1012041F266C"));
        stringBuilder.append(this.\u037f);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public boolean useDaylightTime() {
        return false;
    }
}

