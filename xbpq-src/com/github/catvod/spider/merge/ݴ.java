/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02e0;
import com.github.catvod.spider.merge.\u0622;
import com.github.catvod.spider.merge.\u0773;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class \u0774
extends Format {
    private static final \u0622<\u0774> \u037f = new \u0622<\u0774>(){

        protected \u0774 \u0529(String string, TimeZone timeZone, Locale locale) {
            return new \u0774(string, timeZone, locale);
        }
    };
    private final \u02e0 \u0528;
    private final \u0773 \u0529;

    protected \u0774(String string, TimeZone timeZone, Locale locale) {
        this(string, timeZone, locale, null);
    }

    protected \u0774(String string, TimeZone timeZone, Locale locale, Date date) {
        this.\u0528 = new \u02e0(string, timeZone, locale);
        this.\u0529 = new \u0773(string, timeZone, locale, date);
    }

    public static \u0774 \u037f(String string) {
        return \u037f.\u0528(string, null, null);
    }

    public static \u0774 \u0528(String string, Locale locale) {
        return \u037f.\u0528(string, null, locale);
    }

    public boolean equals(Object object) {
        if (!(object instanceof \u0774)) {
            return false;
        }
        object = (\u0774)object;
        return this.\u0528.equals(((\u0774)object).\u0528);
    }

    @Override
    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.\u0528.\u052f(object));
        return stringBuffer;
    }

    public int hashCode() {
        return this.\u0528.hashCode();
    }

    @Override
    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.\u0529.\u0786(string, parsePosition);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SOY.d("3C33220230160E371719061A1B260A"));
        stringBuilder.append(this.\u0528.\u0781());
        String string = SOY.d("56");
        stringBuilder.append(string);
        stringBuilder.append(this.\u0528.\u0780());
        stringBuilder.append(string);
        stringBuilder.append(this.\u0528.\u0782().getID());
        stringBuilder.append(SOY.d("27"));
        return stringBuilder.toString();
    }

    public Date \u0529(String string) {
        return this.\u0529.\u0783(string);
    }
}

