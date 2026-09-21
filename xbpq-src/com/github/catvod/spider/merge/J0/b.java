/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.I.r;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    private static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    private static final Pattern f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public b(String string) {
        String string2;
        this.a = string;
        if (string != null) {
            this.b = this.d(string, e, "", 1);
            string2 = this.d(string, f, null, 2);
        } else {
            this.b = "";
            string2 = "UTF-8";
        }
        this.c = string2;
        this.d = "multipart/form-data".equalsIgnoreCase(this.b) ? this.d(string, g, null, 2) : null;
    }

    private String d(String object, Pattern pattern, String string, int n2) {
        if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
            string = ((Matcher)object).group(n2);
        }
        return string;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String e() {
        String string;
        String string2 = string = this.c;
        if (string == null) {
            string2 = "US-ASCII";
        }
        return string2;
    }

    public final boolean f() {
        return "multipart/form-data".equalsIgnoreCase(this.b);
    }

    public final b g() {
        if (this.c == null) {
            return new b(r.c(new StringBuilder(), this.a, "; charset=UTF-8"));
        }
        return this;
    }
}

