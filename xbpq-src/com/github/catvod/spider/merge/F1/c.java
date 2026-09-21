/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.B.e;
import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.F1.b;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.b.a;
import com.github.catvod.spider.merge.n1.f;
import com.github.catvod.spider.merge.n1.i;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
extends a {
    private static final Pattern a = Pattern.compile("^([a-zA-Z0-9_-]{11})");
    private static final c b = new c();
    private static final List<String> c;

    static {
        ArrayList<Object> arrayList = new ArrayList<Object>(6);
        for (int i2 = 0; i2 < 6; ++i2) {
            Object object = (new Object[]{"embed/", "live/", "shorts/", "watch/", "v/", "w/"})[i2];
            Objects.requireNonNull(object);
            arrayList.add(object);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    private c() {
    }

    private static String i(String string) {
        if ((string = com.github.catvod.spider.merge.F1.c.j(string)) != null) {
            return string;
        }
        throw new i("The given string is not a YouTube video ID");
    }

    private static String j(String object) {
        String string;
        String string2 = string = null;
        if (object != null) {
            object = a.matcher((CharSequence)object);
            string2 = string;
            if (((Matcher)object).find()) {
                string2 = ((Matcher)object).group(1);
            }
        }
        return string2;
    }

    private String k(String string) {
        for (String string2 : c) {
            if (!string.startsWith(string2)) continue;
            return com.github.catvod.spider.merge.F1.c.i(string.substring(string2.length()));
        }
        return null;
    }

    public static c l() {
        return b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String c(String var1_1) {
        block58: {
            block57: {
                var2_4 = 2;
                try {
                    var5_5 = new URI((String)var1_1);
                    var4_6 = var5_5.getScheme();
                    var3_7 = var1_1;
                    if (var4_6 == null) break block57;
                    if (!var4_6.equals("vnd.youtube")) {
                        var3_7 = var1_1;
                        if (!var4_6.equals("vnd.youtube.launch")) break block57;
                    }
                    if (!(var3_7 = var5_5.getSchemeSpecificPart()).startsWith("//")) {
                        return com.github.catvod.spider.merge.F1.c.i((String)var3_7);
                    }
                    var4_6 = com.github.catvod.spider.merge.F1.c.j(var3_7.substring(2));
                    if (var4_6 != null) {
                        return var4_6;
                    }
                    var4_6 = new StringBuilder();
                    var4_6.append("https:");
                    var4_6.append((String)var3_7);
                    var3_7 = var4_6.toString();
                }
                catch (URISyntaxException var3_8) {
                    var3_7 = var1_1;
                }
            }
            try {
                var5_5 = p.q((String)var3_7);
                var6_9 = var5_5.getHost();
                var4_6 = var5_5.getPath();
                var1_1 = var4_6;
                if (var4_6.isEmpty()) break block58;
                var1_1 = var4_6.substring(1);
            }
            catch (MalformedURLException var1_3) {
                throw new i("The given URL is not valid", var1_3);
            }
        }
        if (p.i((URL)var5_5) && (A.B((URL)var5_5) || A.A((URL)var5_5) || A.x((URL)var5_5) || var5_5.getHost().equalsIgnoreCase("y2u.be"))) {
            if (com.github.catvod.spider.merge.F1.b.m().h((String)var3_7) != false) throw new i(e.c("Error: no suitable URL: ", (String)var3_7));
            var4_6 = var6_9.toUpperCase();
            Objects.requireNonNull(var4_6);
            tmp = -1;
            switch (var4_6.hashCode()) {
                case 2075880438: {
                    if (!var4_6.equals("YOUTUBE.COM")) break;
                    tmp = 1;
                    break;
                }
                case 2022964729: {
                    if (!var4_6.equals("WWW.YOUTUBE-NOCOOKIE.COM")) break;
                    tmp = 2;
                    break;
                }
                case 1720784822: {
                    if (!var4_6.equals("REDIRECT.INVIDIOUS.IO")) break;
                    tmp = 3;
                    break;
                }
                case 1018577871: {
                    if (!var4_6.equals("INVIDIOUS.TIEKOETTER.COM")) break;
                    tmp = 4;
                    break;
                }
                case 941554175: {
                    if (!var4_6.equals("WWW.YOUTUBE.COM")) break;
                    tmp = 5;
                    break;
                }
                case 436628053: {
                    if (!var4_6.equals("YT.CHOCOLATEMOO53.COM")) break;
                    tmp = 6;
                    break;
                }
                case 103276081: {
                    if (!var4_6.equals("YOUTU.BE")) break;
                    tmp = 7;
                    break;
                }
                case -52807283: {
                    if (!var4_6.equals("MUSIC.YOUTUBE.COM")) break;
                    tmp = 8;
                    break;
                }
                case -124567835: {
                    if (!var4_6.equals("YEWTU.BE")) break;
                    tmp = 9;
                    break;
                }
                case -436097853: {
                    if (!var4_6.equals("PIPED.VIDEO")) break;
                    tmp = 10;
                    break;
                }
                case -587628892: {
                    if (!var4_6.equals("INV.NADEKO.NET")) break;
                    tmp = 11;
                    break;
                }
                case -1092206675: {
                    if (!var4_6.equals("PIPED.KAVIN.ROCKS")) break;
                    tmp = 12;
                    break;
                }
                case -1092858110: {
                    if (!var4_6.equals("INVIDIOUS.NERDVPN.DE")) break;
                    tmp = 13;
                    break;
                }
                case -1334094473: {
                    if (!var4_6.equals("INVIDIOUS.F5.SI")) break;
                    tmp = 14;
                    break;
                }
                case -1693444139: {
                    if (!var4_6.equals("M.YOUTUBE.COM")) break;
                    tmp = 15;
                    break;
                }
                case -1698218251: {
                    if (!var4_6.equals("Y2U.BE")) break;
                    tmp = 16;
                    break;
                }
            }
            switch (tmp) {
                default: {
                    ** break;
                }
                case 1: {
                    var2_4 = 15;
                    break;
                }
                case 2: {
                    var2_4 = 14;
                    break;
                }
                case 3: {
                    var2_4 = 13;
                    break;
                }
                case 4: {
                    var2_4 = 12;
                    break;
                }
                case 5: {
                    var2_4 = 11;
                    break;
                }
                case 6: {
                    var2_4 = 10;
                    break;
                }
                case 7: {
                    var2_4 = 9;
                    break;
                }
                case 8: {
                    var2_4 = 8;
                    break;
                }
                case 9: {
                    var2_4 = 7;
                    break;
                }
                case 10: {
                    var2_4 = 6;
                    break;
                }
                case 11: {
                    var2_4 = 5;
                    break;
                }
                case 12: {
                    var2_4 = 4;
                    break;
                }
                case 13: {
                    var2_4 = 3;
                    break;
                }
                case 15: {
                    var2_4 = 1;
                    break;
                }
                case 16: {
                    var2_4 = 0;
                    break;
                }
lbl154:
                // 1 sources

                var2_4 = -1;
                break;
                case 14: 
            }
            switch (var2_4) {
                default: {
                    throw new i(e.c("Error: no suitable URL: ", (String)var3_7));
                }
                case 14: {
                    if (var1_1.startsWith("embed/") == false) throw new i(e.c("Error: no suitable URL: ", (String)var3_7));
                    var1_1 = var1_1.substring(6);
                    return com.github.catvod.spider.merge.F1.c.i((String)var1_1);
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 10: 
                case 12: 
                case 13: {
                    if (var1_1.equals("watch") && (var3_7 = p.f((URL)var5_5, "v")) != null) {
                        return com.github.catvod.spider.merge.F1.c.i((String)var3_7);
                    }
                    var3_7 = this.k((String)var1_1);
                    if (var3_7 != null) {
                        return var3_7;
                    }
                    var3_7 = p.f((URL)var5_5, "v");
                    if (var3_7 == null) return com.github.catvod.spider.merge.F1.c.i((String)var1_1);
                    return com.github.catvod.spider.merge.F1.c.i((String)var3_7);
                }
                case 1: 
                case 8: 
                case 11: 
                case 15: {
                    if (var1_1.equals("attribution_link")) {
                        var1_1 = p.f((URL)var5_5, "u");
                        try {
                            var4_6 = new StringBuilder();
                            var4_6.append("https://www.youtube.com");
                            var4_6.append((String)var1_1);
                            var1_1 = p.q(var4_6.toString());
                        }
                        catch (MalformedURLException var1_2) {
                            throw new i(e.c("Error: no suitable URL: ", (String)var3_7));
                        }
                        var1_1 = p.f((URL)var1_1, "v");
                        return com.github.catvod.spider.merge.F1.c.i((String)var1_1);
                    }
                    if ((var1_1 = this.k((String)var1_1)) != null) {
                        return var1_1;
                    }
                    var1_1 = p.f((URL)var5_5, "v");
                    return com.github.catvod.spider.merge.F1.c.i((String)var1_1);
                }
                case 0: 
                case 9: 
            }
            var3_7 = p.f((URL)var5_5, "v");
            if (var3_7 == null) return com.github.catvod.spider.merge.F1.c.i((String)var1_1);
            return com.github.catvod.spider.merge.F1.c.i((String)var3_7);
        }
        if (var6_9.equalsIgnoreCase("googleads.g.doubleclick.net") == false) throw new i("The URL is not a YouTube URL");
        throw new f(e.c("Error: found ad: ", (String)var3_7));
    }

    @Override
    public final String e(String string) {
        return e.c("https://www.youtube.com/watch?v=", string);
    }

    @Override
    public final boolean h(String string) {
        try {
            this.c(string);
            return true;
        }
        catch (i i2) {
            return false;
        }
        catch (f f2) {
            throw f2;
        }
    }
}

