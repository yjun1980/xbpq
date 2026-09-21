/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.K1.o;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.e1.m;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.p1.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.regex.Pattern;

final class l {
    private static final Pattern a = Pattern.compile("player\\\\/([a-z0-9]{8})\\\\/");
    private static final Pattern b = Pattern.compile("\"jsUrl\":\"(/s/player/[A-Za-z0-9]+/player_ias\\.vflset/[A-Za-z_-]+/base\\.js)\"");

    private static String a(String string) {
        CharSequence charSequence;
        block4: {
            String string2;
            block3: {
                block2: {
                    if (!string.startsWith("//")) break block2;
                    charSequence = new StringBuilder();
                    string2 = "https:";
                    break block3;
                }
                charSequence = string;
                if (!string.startsWith("/")) break block4;
                charSequence = new StringBuilder();
                string2 = "https://www.youtube.com";
            }
            charSequence = r.c((StringBuilder)charSequence, string2, string);
        }
        return charSequence;
    }

    private static String b(String string) {
        try {
            string = com.github.catvod.spider.merge.k1.l.a().d(string, null, e.c).c();
            return string;
        }
        catch (Exception exception) {
            throw new i("Could not get JavaScript base player's code", exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String c(String object) {
        try {
            String string = l.a(l.d());
            new URL(string);
            return l.b(string);
        }
        catch (Exception exception) {
            block10: {
                Iterator iterator;
                CharSequence charSequence;
                try {
                    charSequence = new StringBuilder();
                    charSequence.append("https://www.youtube.com/embed/");
                    charSequence.append((String)object);
                    object = charSequence.toString();
                    charSequence = com.github.catvod.spider.merge.k1.l.a().d((String)object, null, e.c).c();
                    object = d.l((String)charSequence).m0("script");
                    iterator = ((AbstractCollection)object).iterator();
                }
                catch (Exception exception2) {
                    throw new i("Could not fetch embedded watch page", exception2);
                }
                while (iterator.hasNext()) {
                    ((m)iterator.next()).P("name", "player/base");
                }
                iterator = ((AbstractCollection)object).iterator();
                while (iterator.hasNext()) {
                    object = ((m)iterator.next()).c("src");
                    if (!((String)object).contains("base.js")) continue;
                    break block10;
                }
                try {
                    object = com.github.catvod.spider.merge.K1.d.g(b, (String)charSequence, 1);
                }
                catch (o o2) {
                    throw new i("Embedded watch page didn't provide JavaScript base player's URL", o2);
                }
            }
            object = l.a((String)object);
            try {
                new URL((String)object);
                return l.b((String)object);
            }
            catch (MalformedURLException malformedURLException) {
                throw new i("The extracted and built JavaScript URL is invalid", malformedURLException);
            }
        }
    }

    static String d() {
        String string;
        try {
            string = com.github.catvod.spider.merge.k1.l.a().d("https://www.youtube.com/iframe_api", null, e.c).c();
        }
        catch (Exception exception) {
            throw new i("Could not fetch IFrame resource", exception);
        }
        try {
            string = String.format("https://www.youtube.com/s/player/%s/player_ias.vflset/en_GB/base.js", com.github.catvod.spider.merge.K1.d.g(a, string, 1));
            return string;
        }
        catch (o o2) {
            throw new i("IFrame resource didn't provide JavaScript base player's hash", o2);
        }
    }
}

