/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.k1.m;
import com.github.catvod.spider.merge.o1.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public final class a
extends c {
    private static final a a = new a();

    private a() {
    }

    private String m(String string) {
        block6: {
            String string2;
            CharSequence charSequence;
            block5: {
                block4: {
                    charSequence = string;
                    if (string.startsWith("/")) {
                        charSequence = string.substring(1);
                    }
                    if (!charSequence.startsWith("a/")) break block4;
                    string2 = charSequence.substring(1);
                    charSequence = new StringBuilder();
                    string = "accounts";
                    break block5;
                }
                string = charSequence;
                if (!charSequence.startsWith("c/")) break block6;
                string2 = charSequence.substring(1);
                charSequence = new StringBuilder();
                string = "video-channels";
            }
            string = r.c((StringBuilder)charSequence, string, string2);
        }
        return string;
    }

    public static a n() {
        return a;
    }

    @Override
    public final String c(String string) {
        return this.m(d.f("/((accounts|a)|(video-channels|c))/([^/?&#]*)", string, 0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean h(String string) {
        boolean bl = false;
        try {
            new URL(string);
            if (string.contains("/accounts/")) return true;
            if (string.contains("/a/")) return true;
            if (string.contains("/video-channels/")) return true;
            boolean bl2 = string.contains("/c/");
            if (!bl2) return bl;
            return true;
        }
        catch (MalformedURLException malformedURLException) {
            return bl;
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String k(String string, List list) {
        return this.l(string, list, m.b.i());
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    @Override
    public final String l(String string, List object, String string2) {
        if (string.matches("((accounts|a)|(video-channels|c))/([^/?&#]*)")) {
            string = this.m(string);
            object = com.github.catvod.spider.merge.C.a.c(string2);
            string2 = "/";
        } else {
            object = com.github.catvod.spider.merge.C.a.c(string2);
            string2 = "/accounts/";
        }
        return r.c((StringBuilder)object, string2, string);
    }
}

