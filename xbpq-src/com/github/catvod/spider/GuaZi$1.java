/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.GuaZi;
import java.util.Comparator;

class GuaZi$1
implements Comparator<String> {
    final GuaZi a;

    GuaZi$1(GuaZi guaZi) {
        this.a = guaZi;
    }

    @Override
    public int compare(String string, String string2) {
        return GuaZi.a(this.a, string2) - GuaZi.a(this.a, string);
    }
}

