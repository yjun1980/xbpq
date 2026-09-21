/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C1;

import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.c;
import java.util.List;
import java.util.regex.Pattern;

public final class a
extends c {
    private static final a a = new a();

    private a() {
    }

    public static a m() {
        return a;
    }

    @Override
    public final String c(String string) {
        int n2 = p.c;
        p.a(Pattern.compile("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$"), string);
        try {
            string = com.github.catvod.spider.merge.A1.a.e(string);
            return string;
        }
        catch (Exception exception) {
            throw new i(exception.getMessage(), exception);
        }
    }

    @Override
    public final boolean h(String string) {
        return d.c("^https?://(www\\.|m\\.)?soundcloud.com/[0-9a-z_-]+(/((tracks|albums|sets|reposts|followers|following)/?)?)?([#?].*)?$", string.toLowerCase());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List object) {
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append("https://api.soundcloud.com/users/");
            ((StringBuilder)object).append(string);
            string = com.github.catvod.spider.merge.A1.a.f(((StringBuilder)object).toString());
            return string;
        }
        catch (Exception exception) {
            throw new i(exception.getMessage(), exception);
        }
    }
}

