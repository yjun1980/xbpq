/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.text.ParsePosition;
import java.util.Calendar;

final class k
extends o {
    private final String a;

    k(String string) {
        super(null);
        this.a = string;
    }

    @Override
    final boolean b(t t2, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
        for (n2 = 0; n2 < this.a.length(); ++n2) {
            int n3 = parsePosition.getIndex() + n2;
            if (n3 == string.length()) {
                parsePosition.setErrorIndex(n3);
                return false;
            }
            if (this.a.charAt(n2) == string.charAt(n3)) continue;
            parsePosition.setErrorIndex(n3);
            return false;
        }
        n2 = this.a.length();
        parsePosition.setIndex(parsePosition.getIndex() + n2);
        return true;
    }

    public final String toString() {
        return n.b(d.b(cYh.d("243F3128062F08242435042E153135343023470B273E2537062407383236036D")), this.a, cYh.d("3A"));
    }
}

