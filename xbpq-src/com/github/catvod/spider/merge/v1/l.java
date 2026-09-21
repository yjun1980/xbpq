/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.v1;

import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.k1.c;
import com.github.catvod.spider.merge.m1.a;
import com.github.catvod.spider.merge.n1.e;
import com.github.catvod.spider.merge.n1.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class l {
    private static final Pattern a = Pattern.compile("\\w+/\\w+");
    private static com.github.catvod.spider.merge.F0.c b = null;
    public static final int c = 0;

    /*
     * WARNING - void declaration
     */
    public static com.github.catvod.spider.merge.F0.c a(a object, com.github.catvod.spider.merge.p1.e e2) {
        block5: {
            if (b == null) {
                void var0_4;
                try {
                    object = ((a)object).d("https://streaming.media.ccc.de/streams/v2.json", null, e2).c();
                    b = g.b().a((String)object);
                    break block5;
                }
                catch (h h2) {
                    throw new e("Could not parse JSON.", h2);
                }
                catch (k k2) {
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                throw new e("Could not get live stream JSON.", (Throwable)var0_4);
            }
        }
        return b;
    }

    public static List<c> b(com.github.catvod.spider.merge.F0.e e2) {
        return l.c(e2, "thumb", "poster");
    }

    private static List<c> c(com.github.catvod.spider.merge.F0.e object, String string, String string2) {
        ArrayList<c> arrayList = new ArrayList<c>(2);
        if (!p.j(string = ((com.github.catvod.spider.merge.F0.e)object).i(string, null))) {
            arrayList.add(new c(string, -1, -1, 2));
        }
        if (!p.j((String)(object = ((com.github.catvod.spider.merge.F0.e)object).i(string2, null)))) {
            arrayList.add(new c((String)object, -1, -1, 1));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<c> d(com.github.catvod.spider.merge.F0.e e2) {
        return l.c(e2, "thumb_url", "poster_url");
    }

    public static boolean e(String string) {
        return a.matcher(string).find();
    }
}

