/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

import com.github.catvod.spider.merge.L.a;
import com.github.catvod.spider.merge.L.e;
import com.github.catvod.spider.merge.L.s;
import com.github.catvod.spider.merge.N.h;
import com.github.catvod.spider.merge.O.c;
import com.github.catvod.spider.merge.cYh;

public final class b {
    private static final boolean a;

    static {
        String string;
        block5: {
            boolean bl;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            string = h.c(cYh.d("0C3F353D3E341F7E223E25351224283F322949232239323E123C2423"));
                            if (string == null) break block2;
                            int n2 = string.hashCode();
                            if (n2 == 0) break block3;
                            if (n2 == 3551) break block4;
                            if (n2 != 109935 || !string.equals(cYh.d("083627"))) break block5;
                            bl = false;
                            break block6;
                        }
                        if (!string.equals(cYh.d("083E"))) break block5;
                        break block2;
                    }
                    if (!string.equals("")) break block5;
                }
                bl = true;
            }
            a = bl;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cYh.d("3429322532374720333E273F15243871703108242D38392249332E23382F13392F34247414332934332F0B353376773206236124392802332E3639331D352571213B0B25247170"));
        stringBuilder.append(string);
        stringBuilder.append('\'');
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final e a() {
        s s2 = a ? c.f : com.github.catvod.spider.merge.L.a.e;
        return s2;
    }
}

