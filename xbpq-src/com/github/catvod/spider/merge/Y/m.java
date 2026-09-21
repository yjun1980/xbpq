/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import com.github.catvod.spider.merge.d.d;
import java.text.ParsePosition;
import java.util.Calendar;

class m
extends o {
    private final int a;

    m(int n2) {
        super(null);
        this.a = n2;
    }

    @Override
    final boolean a() {
        return true;
    }

    @Override
    final boolean b(t t2, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
        int n3;
        int n4 = parsePosition.getIndex();
        int n5 = string.length();
        if (n2 == 0) {
            for (n2 = n4; n2 < n5 && Character.isWhitespace(string.charAt(n2)); ++n2) {
            }
            parsePosition.setIndex(n2);
            n3 = n5;
        } else {
            int n6 = n2 + n4;
            n2 = n4;
            n3 = n5;
            if (n5 > n6) {
                n3 = n6;
                n2 = n4;
            }
        }
        while (n2 < n3 && Character.isDigit(string.charAt(n2))) {
            ++n2;
        }
        if (parsePosition.getIndex() == n2) {
            parsePosition.setErrorIndex(n2);
            return false;
        }
        n4 = Integer.parseInt(string.substring(parsePosition.getIndex(), n2));
        parsePosition.setIndex(n2);
        calendar.set(this.a, this.c(t2, n4));
        return true;
    }

    int c(t t2, int n2) {
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = d.b(cYh.d("29252C33322834243330233F0029610A3133023C256C"));
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

