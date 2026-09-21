/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.N.h;
import com.github.catvod.spider.merge.O.g;
import com.github.catvod.spider.merge.cYh;
import java.util.concurrent.TimeUnit;

public final class l {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static g e;

    static {
        int n2;
        a = h.e(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C2423792802232E3D222E0E3F2F7F3929"), 100000L);
        h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379380B3F223A3E34007E3130253B0B3C243D3E290A"), 16, 0, 0, 12);
        int n3 = n2 = h.a();
        if (n2 < 2) {
            n3 = 2;
        }
        b = n3 = h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379390822247F2735083C6F223E2002"), n3, 1, 0, 8);
        n2 = h.a() * 128;
        if (n3 <= 0x1FFFFE) {
            if (n2 >= n3) {
                n3 = n2 > 0x1FFFFE ? 0x1FFFFE : n2;
            }
            c = h.d(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C2423793706286F2138350B7E32382D3F"), n3, 0, 0x1FFFFE, 4);
            d = TimeUnit.SECONDS.toNanos(h.e(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C242379310235317F36360E26247F243F04"), 60L));
            e = g.a;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("24312F3F382E47332E342539027037303B2F0270353E773B0970243C272E1E703330393D026A613C36220E3D343C77"));
        stringBuilder.append(0x1FFFFE);
        stringBuilder.append(cYh.d("473932713B3F142361253F3B09702C3839330A252C71"));
        stringBuilder.append(n3);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

