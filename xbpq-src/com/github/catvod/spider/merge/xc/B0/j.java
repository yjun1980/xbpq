/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.B0;

import com.github.catvod.spider.merge.xc.B0.k;
import com.github.catvod.spider.merge.xc.B0.o;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class j
extends k {
    public Pattern a;

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final boolean b(o object, Calendar calendar, String string, ParsePosition parsePosition, int n2) {
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

    public abstract void c(Calendar var1, String var2);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" [pattern=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

