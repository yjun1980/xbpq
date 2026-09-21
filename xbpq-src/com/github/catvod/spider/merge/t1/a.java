/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.t1;

import com.github.catvod.spider.merge.F0.e;
import com.github.catvod.spider.merge.F0.f;
import com.github.catvod.spider.merge.F0.g;
import com.github.catvod.spider.merge.F0.h;
import com.github.catvod.spider.merge.F0.i;
import com.github.catvod.spider.merge.F0.k;
import com.github.catvod.spider.merge.F0.l;
import com.github.catvod.spider.merge.K1.p;
import com.github.catvod.spider.merge.o1.c;
import com.github.catvod.spider.merge.s1.b;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class a
extends c {
    private static final a a = new a();

    private a() {
    }

    public static a m() {
        return a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final String c(String string) {
        void var1_6;
        long l2;
        try {
            l2 = com.github.catvod.spider.merge.K1.f.d(com.github.catvod.spider.merge.k1.l.a().b(p.p(string)).c(), "data-band").f("id");
        }
        catch (h h2) {
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        }
        catch (com.github.catvod.spider.merge.n1.k k2) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return String.valueOf(l2);
        throw new com.github.catvod.spider.merge.n1.i("Download failed", (Throwable)var1_6);
    }

    @Override
    public final boolean h(String string) {
        String[] stringArray = (string = string.toLowerCase()).split("/");
        if (stringArray.length != 3 && stringArray.length != 4) {
            return false;
        }
        if (!(stringArray.length != 4 || stringArray[3].equals("releases") || stringArray[3].equals("music") || stringArray[3].equals("album") || stringArray[3].equals("track"))) {
            return false;
        }
        if (stringArray[2].equals("daily.bandcamp.com")) {
            return false;
        }
        return b.d(string);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * WARNING - void declaration
     */
    @Override
    public final String k(String object, List object2) {
        void var1_5;
        block4: {
            int n2 = b.b;
            try {
                object2 = g.d();
                com.github.catvod.spider.merge.m1.a a2 = com.github.catvod.spider.merge.k1.l.a();
                Map<String, List<String>> map = Collections.emptyMap();
                i i2 = k.a();
                i2.j();
                object = (i)i2.u("band_id", (String)object);
                ((l)object).g();
                object = (e)((f)object2).a(a2.e("https://bandcamp.com/api/mobile/22/band_details", map, ((i)object).w().getBytes(StandardCharsets.UTF_8)).c());
                if (((e)object).d("error")) break block4;
            }
            catch (h h2) {
            }
            catch (com.github.catvod.spider.merge.n1.k k2) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return p.p(((e)object).i("bandcamp_url", null));
        }
        throw new com.github.catvod.spider.merge.n1.i("JSON does not contain a channel URL (invalid id?) or is otherwise invalid");
        throw new com.github.catvod.spider.merge.n1.i("Could not download band details", (Throwable)var1_5);
    }
}

