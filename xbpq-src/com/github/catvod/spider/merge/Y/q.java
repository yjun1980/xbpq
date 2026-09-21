/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.k;
import com.github.catvod.spider.merge.Y.p;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import java.util.Calendar;

final class q {
    private final Calendar a;
    private int b;
    final t c;

    q(t t2, Calendar calendar) {
        this.c = t2;
        this.a = calendar;
    }

    final p a() {
        if (this.b >= t.a(this.c).length()) {
            return null;
        }
        char c2 = t.a(this.c).charAt(this.b);
        int n2 = c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' ? 1 : 0;
        if (n2 != 0) {
            int n3;
            n2 = this.b;
            do {
                this.b = n3 = this.b + 1;
            } while (n3 < t.a(this.c).length() && t.a(this.c).charAt(this.b) == c2);
            n2 = this.b - n2;
            return new p(t.b(this.c, c2, n2, this.a), n2);
        }
        Object object = new StringBuilder();
        n2 = 0;
        while (this.b < t.a(this.c).length()) {
            int n4;
            c2 = t.a(this.c).charAt(this.b);
            if (n2 == 0 && (n4 = c2 >= 'A' && c2 <= 'Z' || c2 >= 'a' && c2 <= 'z' ? 1 : 0) != 0) break;
            if (c2 == '\'') {
                this.b = n4 = this.b + 1;
                if (n4 == t.a(this.c).length() || t.a(this.c).charAt(this.b) != '\'') {
                    n2 ^= 1;
                    continue;
                }
            }
            ++this.b;
            ((StringBuilder)object).append(c2);
        }
        if (n2 == 0) {
            object = ((StringBuilder)object).toString();
            return new p(new k((String)object), ((String)object).length());
        }
        object = new IllegalArgumentException(cYh.d("323E353425370E3E2025323E4721343E233F"));
        throw object;
    }
}

