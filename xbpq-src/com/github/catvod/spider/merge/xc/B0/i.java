/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.k;
import com.github.catvod.spider.merge.xc.B0.o;
import java.text.ParsePosition;
import java.util.Calendar;

public class i
extends k {
    public final int a;

    public i(int n2) {
        this.a = n2;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b(o o2, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
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
        calendar.set(this.a, this.c(o2, n4));
        return true;
    }

    public int c(o o2, int n2) {
        return n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NumberStrategy [field=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

