/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.i0;

import com.github.catvod.spider.merge.C.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i {
    private String a;
    private String b;
    private String c;
    private String d;
    private int e = -1;

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean f(String object) {
        if (object != null && !((String)object).isEmpty()) {
            object = Pattern.compile("^(https?|socks[45]?):\\/\\/(?:([^:@\\s]+):([^@\\s]+)@)?([^:@\\s]+):(\\d+)$").matcher((CharSequence)object);
            if (((Matcher)object).find()) {
                this.a = ((Matcher)object).group(1);
                this.b = ((Matcher)object).group(2);
                this.c = ((Matcher)object).group(3);
                this.d = ((Matcher)object).group(4);
                try {
                    this.e = Integer.parseInt(((Matcher)object).group(5));
                    return true;
                }
                catch (NumberFormatException numberFormatException) {
                    return false;
                }
            }
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -1;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.C.a.c("UniversalProxyParser{scheme='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", username='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", password='");
        String string = this.c != null ? "******" : "null";
        stringBuilder.append(string);
        stringBuilder.append('\'');
        stringBuilder.append(", host='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", port=");
        stringBuilder.append(this.e);
        stringBuilder.append(", hasCredentials=");
        boolean bl = this.b != null && this.c != null;
        stringBuilder.append(bl);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

