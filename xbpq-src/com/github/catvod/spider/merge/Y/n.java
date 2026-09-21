/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.Y;

import com.github.catvod.spider.merge.Y.o;
import com.github.catvod.spider.merge.Y.t;
import com.github.catvod.spider.merge.cYh;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class n
extends o {
    Pattern a;

    n() {
        super(null);
    }

    @Override
    final boolean a() {
        return false;
    }

    @Override
    final boolean b(t object, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
        object = this.a.matcher(string.substring(parsePosition.getIndex()));
        if (!((Matcher)object).lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        n2 = parsePosition.getIndex();
        parsePosition.setIndex(((Matcher)object).end(1) + n2);
        this.c(calendar, ((Matcher)object).group(1));
        return true;
    }

    abstract void c(Calendar var1, String var2);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(cYh.d("470B3130232E02222F6C"));
        stringBuilder.append(this.a);
        stringBuilder.append(cYh.d("3A"));
        return stringBuilder.toString();
    }
}

