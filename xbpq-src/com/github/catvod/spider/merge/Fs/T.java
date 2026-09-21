/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Fs;

import com.github.catvod.spider.merge.Fs.Q;
import com.github.catvod.spider.merge.Fs.a;
import com.github.catvod.spider.merge.Fs.h1;
import com.github.catvod.spider.merge.ka.d;
import java.util.Locale;

final class T
extends h1 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    final void g(Q var1_1, a var2_2) {
        block3: {
            block2: {
                if (!var2_2.y('/')) break block2;
                var1_1.h();
                var1_1.a(h1.n);
                break block3;
            }
            if (!var2_2.C() || var1_1.b() == null) ** GOTO lbl-1000
            var4_3 /* !! */  = com.github.catvod.spider.merge.ka.d.b("</");
            var4_3 /* !! */ .append(var1_1.b());
            var6_4 = var4_3 /* !! */ .toString();
            var5_5 = Locale.ENGLISH;
            var4_3 /* !! */  = var6_4.toLowerCase((Locale)var5_5);
            var5_5 = var6_4.toUpperCase((Locale)var5_5);
            var3_6 = var2_2.D(var4_3 /* !! */ ) > -1 || var2_2.D((CharSequence)var5_5) > -1;
            if (!var3_6) {
                var2_2 = var1_1.g(false);
                var2_2.s(var1_1.b());
                var1_1.i = var2_2;
                var1_1.o();
                var2_2 = h1.j;
            } else lbl-1000:
            // 2 sources

            {
                var1_1.k("<");
                var2_2 = h1.e;
            }
            var1_1.u((h1)var2_2);
        }
    }
}

