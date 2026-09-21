/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l;

import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.l.b;

final class c
extends b {
    private final char a = (char)44;

    c() {
    }

    @Override
    public final boolean b(char c2) {
        boolean bl = c2 == this.a;
        return bl;
    }

    public final String toString() {
        Object object;
        char c2 = this.a;
        char[] cArray = object = new char[6];
        object[0] = 92;
        cArray[1] = 117;
        cArray[2] = 0;
        cArray[3] = 0;
        cArray[4] = 0;
        cArray[5] = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            object[5 - i2] = cYh.d("57617362636F51677968161824140417").charAt(c2 & 0xF);
            c2 = (char)(c2 >> 4);
        }
        object = String.copyValueOf(object);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 18);
        stringBuilder.append(cYh.d("243820231A3B1333293425740E236976"));
        stringBuilder.append((String)object);
        stringBuilder.append(cYh.d("4079"));
        return stringBuilder.toString();
    }
}

