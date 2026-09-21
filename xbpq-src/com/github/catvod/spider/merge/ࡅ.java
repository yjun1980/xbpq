/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;

public class \u0845 {
    private int \u037f;
    private String \u0528;

    \u0845(int n2, String string) {
        this.\u037f = n2;
        this.\u0528 = string;
    }

    \u0845(int n2, String string, Object ... objectArray) {
        this.\u0528 = String.format(string, objectArray);
        this.\u037f = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.\u037f);
        stringBuilder.append(SOY.d("4072"));
        stringBuilder.append(this.\u0528);
        return stringBuilder.toString();
    }
}

