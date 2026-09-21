/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.z1;

import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.d;
import com.github.catvod.spider.merge.k1.m;
import com.github.catvod.spider.merge.n1.i;
import com.github.catvod.spider.merge.o1.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public final class b
extends c {
    private static final b a = new b();

    private b() {
    }

    public static b m() {
        return a;
    }

    @Override
    public final String c(String string) {
        try {
            String string2 = d.f("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", string, 2);
            return string2;
        }
        catch (i i2) {
            return d.f("/video-playlists/([^/?&#]*)", string, 1);
        }
    }

    /*
     * Loose catch block
     */
    @Override
    public final boolean h(String string) {
        new URL(string);
        {
            catch (i | MalformedURLException exception) {
                return false;
            }
        }
        try {
            d.f("(/videos/watch/playlist/|/w/p/)([^/?&#]*)", string, 2);
        }
        catch (i i2) {
            d.f("/video-playlists/([^/?&#]*)", string, 1);
        }
        return true;
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
    public final String l(String string, List list, String string2) {
        return s.a(string2, "/api/v1/video-playlists/", string);
    }
}

