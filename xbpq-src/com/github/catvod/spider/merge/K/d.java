/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.E.f;
import com.github.catvod.spider.merge.K.i;
import com.github.catvod.spider.merge.K.j;
import com.github.catvod.spider.merge.cYh;

public final class d
extends j {
    public static int g(CharSequence charSequence, char c2, int n2, int n3) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return ((String)charSequence).indexOf(c2, n2);
    }

    public static String h(String object, String string, String string2) {
        block6: {
            block5: {
                int n2;
                int n3;
                int n4 = i.c((CharSequence)object, string, 0, false);
                if (n4 < 0) break block5;
                int n5 = string.length();
                int n6 = 1;
                if (n5 >= 1) {
                    n6 = n5;
                }
                int n7 = ((String)object).length();
                n7 = string2.length() + (n7 - n5);
                if (n7 < 0) break block6;
                StringBuilder stringBuilder = new StringBuilder(n7);
                n7 = 0;
                do {
                    stringBuilder.append((CharSequence)object, n7, n4);
                    stringBuilder.append(string2);
                    n2 = n4 + n5;
                    if (n4 >= ((String)object).length()) break;
                    n4 = n3 = i.c((CharSequence)object, string, n4 + n6, false);
                    n7 = n2;
                } while (n3 > 0);
                stringBuilder.append((CharSequence)object, n2, ((String)object).length());
                object = stringBuilder.toString();
                f.d(object, cYh.d("14243338393D2525283D333F157E2021273F093469253F33147C61387B7A0B352F3623324E7E353E042E15392F367F73"));
            }
            return object;
        }
        object = new OutOfMemoryError();
        throw object;
    }
}

