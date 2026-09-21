/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.D;
import com.github.catvod.spider.merge.xc.B0.j;
import java.util.Calendar;
import java.util.regex.Pattern;

public final class h
extends j {
    public static final h b = new h("(Z|(?:[+-]\\d{2}))");
    public static final h c = new h("(Z|(?:[+-]\\d{2}\\d{2}))");
    public static final h d = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public h(String string) {
        this.a = Pattern.compile(string);
    }

    @Override
    public final void c(Calendar calendar, String string) {
        calendar.setTimeZone(D.a(string));
    }
}

