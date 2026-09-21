/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.v1.l;

public final class b
extends a {
    private static final b a = new b();

    private b() {
    }

    public static b i() {
        return a;
    }

    @Override
    public final String c(String string) {
        String string2;
        try {
            string2 = d.f("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", string, 1);
        }
        catch (o o2) {
            string2 = null;
        }
        if (string2 == null) {
            return d.f("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", string, 1);
        }
        return string2;
    }

    @Override
    public final String e(String string) {
        String string2;
        StringBuilder stringBuilder;
        if (l.e(string)) {
            stringBuilder = new StringBuilder();
            string2 = "https://streaming.media.ccc.de/";
        } else {
            stringBuilder = new StringBuilder();
            string2 = "https://media.ccc.de/v/";
        }
        return r.c(stringBuilder, string2, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean h(String string) {
        String string2;
        boolean bl = false;
        try {
            String string3;
            try {
                string3 = d.f("streaming\\.media\\.ccc\\.de\\/(\\w+\\/\\w+)", string, 1);
            }
            catch (o o2) {
                string3 = null;
            }
            string2 = string3;
            if (string3 == null) {
                string2 = d.f("(?:(?:(?:api\\.)?media\\.ccc\\.de/public/events/)|(?:media\\.ccc\\.de/v/))([^/?&#]*)", string, 1);
            }
        }
        catch (i i2) {
            return false;
        }
        if (string2 == null) return bl;
        return true;
    }
}

