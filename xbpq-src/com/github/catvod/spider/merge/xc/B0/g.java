/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.B0.k;
import com.github.catvod.spider.merge.xc.B0.o;
import java.text.ParsePosition;
import java.util.Calendar;

public final class g
extends k {
    public final String a;

    public g(String string) {
        this.a = string;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean b(o object, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
        for (n2 = 0; n2 < ((String)(object = this.a)).length(); ++n2) {
            int n3 = parsePosition.getIndex() + n2;
            if (n3 == string.length()) {
                parsePosition.setErrorIndex(n3);
                return false;
            }
            if (((String)object).charAt(n2) == string.charAt(n3)) continue;
            parsePosition.setErrorIndex(n3);
            return false;
        }
        n2 = ((String)object).length();
        parsePosition.setIndex(parsePosition.getIndex() + n2);
        return true;
    }

    public final String toString() {
        return m.h(new StringBuilder("CopyQuotedStrategy [formatField="), this.a, "]");
    }
}

