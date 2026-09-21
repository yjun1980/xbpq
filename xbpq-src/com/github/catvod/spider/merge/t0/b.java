/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t0;

import com.github.catvod.spider.merge.n0.e;
import com.github.catvod.spider.merge.r0.h;
import com.github.catvod.spider.merge.s0.c;
import com.github.catvod.spider.merge.t0.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
implements a {
    private static final List<Pattern> b = Arrays.asList(Pattern.compile(";ytplayer\\.config = (\\{.*?\\})\\;ytplayer"), Pattern.compile(";ytplayer\\.config = (\\{.*?\\})\\;"), Pattern.compile("ytInitialPlayerResponse\\s*=\\s*(\\{.+?\\})\\s*\\;"));
    private static final List<Pattern> c = Arrays.asList(Pattern.compile("window\\[\"ytInitialData\"\\] = (\\{.*?\\});"), Pattern.compile("ytInitialData = (\\{.*?\\});"));
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private final com.github.catvod.spider.merge.q0.a a;

    static {
        Pattern.compile("lang_code=\"(.{2,3})\"");
        d = Pattern.compile("[0-9]+[0-9, ']*");
        e = Pattern.compile("\"assets\":.+?\"js\":\\s*\"([^\"]+)\"");
        f = Pattern.compile("\"jsUrl\":\\s*\"([^\"]+)\"");
    }

    public b(com.github.catvod.spider.merge.q0.a a2) {
        this.a = a2;
    }

    public final String a(com.github.catvod.spider.merge.y.e a2) {
        com.github.catvod.spider.merge.y.b b2 = ((com.github.catvod.spider.merge.y.e)a2).t("serviceTrackingParams");
        if (b2 == null) {
            return "2.20200720.00.02";
        }
        for (int i2 = 0; i2 < b2.size(); ++i2) {
            a2 = b2.p(i2).t("params");
            for (int i4 = 0; i4 < ((com.github.catvod.spider.merge.y.b)a2).size(); ++i4) {
                if (!((com.github.catvod.spider.merge.y.b)a2).p(i4).x("key").equals("cver")) continue;
                return ((com.github.catvod.spider.merge.y.b)a2).p(i4).x("value");
            }
        }
        return "2.20200720.00.02";
    }

    public final com.github.catvod.spider.merge.y.e b(String object) {
        Iterator<Pattern> iterator = c.iterator();
        String string = null;
        while (iterator.hasNext()) {
            Matcher matcher = iterator.next().matcher((CharSequence)object);
            if (!matcher.find()) continue;
            string = matcher.group(1);
        }
        if (string != null) {
            try {
                object = com.github.catvod.spider.merge.y.a.i(string);
                return object;
            }
            catch (Exception exception) {
                throw new e("Initial data contains invalid json");
            }
        }
        throw new e("Could not find initial data on web page");
    }

    public final int c(String object) {
        if (((Matcher)(object = d.matcher((CharSequence)object))).find()) {
            return Integer.parseInt(((Matcher)object).group(0).replaceAll("[, ']", ""));
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    public final String d(com.github.catvod.spider.merge.y.e var1_1, String var2_2) {
        block4: {
            block5: {
                block3: {
                    if (!var1_1.containsKey("assets")) break block3;
                    var1_1 = var1_1.u("assets").x("js");
                    break block4;
                }
                var1_1 = com.github.catvod.spider.merge.t0.b.e.matcher(var2_2 = (String)((c)this.a.b(new h(com.github.catvod.spider.merge.B.e.c("https://www.youtube.com/embed/", var2_2)))).a());
                if (!var1_1.find()) break block5;
                var1_1 = var1_1.group(1);
                ** GOTO lbl13
            }
            var1_1 = com.github.catvod.spider.merge.t0.b.f.matcher(var2_2);
            if (var1_1.find()) {
                var1_1 = var1_1.group(1);
lbl13:
                // 2 sources

                var1_1 = var1_1.replace("\\", "");
            } else {
                var1_1 = null;
            }
        }
        if (var1_1 != null) {
            return com.github.catvod.spider.merge.B.e.c("https://youtube.com", (String)var1_1);
        }
        throw new e("Could not extract js url: assets not found");
    }

    public final long e(String object) {
        if (((Matcher)(object = d.matcher((CharSequence)object))).find()) {
            return Long.parseLong(((Matcher)object).group(0).replaceAll("[, ']", ""));
        }
        return 0L;
    }

    public final com.github.catvod.spider.merge.y.e f(String object) {
        Object object2;
        Object object3;
        block5: {
            object3 = b.iterator();
            while (object3.hasNext()) {
                object2 = object3.next().matcher((CharSequence)object);
                if (!((Matcher)object2).find()) continue;
                object = ((Matcher)object2).group(1);
                break block5;
            }
            object = null;
        }
        if (object != null) {
            block6: {
                try {
                    object = com.github.catvod.spider.merge.y.a.i((String)object);
                    if (!((com.github.catvod.spider.merge.y.e)object).containsKey("args")) break block6;
                    return object;
                }
                catch (Exception exception) {
                    throw new e("Player config contains invalid json");
                }
            }
            object2 = new com.github.catvod.spider.merge.y.e();
            object3 = new com.github.catvod.spider.merge.y.e();
            ((com.github.catvod.spider.merge.y.e)object3).o("player_response", object);
            ((com.github.catvod.spider.merge.y.e)object2).o("args", object3);
            return object2;
        }
        throw new e("Could not find player config on web page");
    }
}

