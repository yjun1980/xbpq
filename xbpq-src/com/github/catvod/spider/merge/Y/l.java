/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.O;
import com.github.catvod.spider.merge.Y.n;
import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.cYh;
import java.util.Calendar;
import java.util.regex.Pattern;

final class l
extends n {
    private static final l b = new l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C787E"));
    private static final l c = new l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C0D3321552D6878"));
    private static final l d = new l(cYh.d("4F0A3D7968603C7B6C0C0B3E1C623C7968605D791D352C681A7968"));

    l(String string) {
        this.a = Pattern.compile(string);
    }

    static /* synthetic */ o d() {
        return d;
    }

    static o e(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return d;
                }
                throw new IllegalArgumentException(cYh.d("0E3E37303B3303702F243A380222613E317A3F"));
            }
            return c;
        }
        return b;
    }

    @Override
    final void c(Calendar calendar, String string) {
        calendar.setTimeZone(O.a(string));
    }
}

