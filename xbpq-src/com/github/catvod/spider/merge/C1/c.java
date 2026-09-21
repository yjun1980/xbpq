/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C1;

import com.github.catvod.spider.merge.A1.a;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import java.util.regex.Pattern;

public final class c
extends com.github.catvod.spider.merge.b.a {
    private static final c a = new c();
    private static final Pattern b = Pattern.compile("^https?://(?:www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+/(?!(?:tracks|albums|sets|reposts|followers|following)/?$)[0-9a-z_-]+/?(?:[#?].*)?$|^https?://on\\.soundcloud\\.com/[0-9a-zA-Z]+$");
    private static final Pattern c = Pattern.compile("^https?://api-v2\\.soundcloud.com/(tracks|albums|sets|reposts|followers|following)/([0-9a-z_-]+)/");

    private c() {
    }

    public static c i() {
        return a;
    }

    @Override
    public final String c(String string) {
        Pattern pattern = c;
        if (d.d(pattern, string)) {
            return d.g(pattern, string, 1);
        }
        p.a(b, string);
        try {
            string = com.github.catvod.spider.merge.A1.a.e(string);
            return string;
        }
        catch (Exception exception) {
            throw new i(exception.getMessage(), exception);
        }
    }

    @Override
    public final String e(String string) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("https://api.soundcloud.com/tracks/");
            stringBuilder.append(string);
            string = com.github.catvod.spider.merge.A1.a.f(stringBuilder.toString());
            return string;
        }
        catch (Exception exception) {
            throw new i(exception.getMessage(), exception);
        }
    }

    @Override
    public final boolean h(String string) {
        return d.d(b, string.toLowerCase());
    }
}

