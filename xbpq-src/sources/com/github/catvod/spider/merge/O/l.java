package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static g e;

    static {
        long b2;
        long b3;
        b2 = com.github.catvod.spider.merge.N.h.b(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C2423792802232E3D222E0E3F2F7F3929"), 100000L, 1L, Long.MAX_VALUE);
        a = b2;
        com.github.catvod.spider.merge.N.h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379380B3F223A3E34007E3130253B0B3C243D3E290A"), 16, 0, 0, 12);
        int a2 = com.github.catvod.spider.merge.N.h.a();
        if (a2 < 2) {
            a2 = 2;
        }
        int d2 = com.github.catvod.spider.merge.N.h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379390822247F2735083C6F223E2002"), a2, 1, 0, 8);
        b = d2;
        int a3 = com.github.catvod.spider.merge.N.h.a() * 128;
        if (d2 > 2097150) {
            throw new IllegalArgumentException(cYh.d("24312F3F382E47332E342539027037303B2F0270353E773B0970243C272E1E703330393D026A613C36220E3D343C77") + 2097150 + cYh.d("473932713B3F142361253F3B09702C3839330A252C71") + d2 + '.');
        }
        if (a3 >= d2) {
            d2 = a3 > 2097150 ? 2097150 : a3;
        }
        c = com.github.catvod.spider.merge.N.h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C2423793706286F2138350B7E32382D3F"), d2, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b3 = com.github.catvod.spider.merge.N.h.b(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379310235317F36360E26247F243F04"), 60L, 1L, Long.MAX_VALUE);
        d = timeUnit.toNanos(b3);
        e = g.a;
    }
}
