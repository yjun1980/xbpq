/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.D1;

import com.github.catvod.spider.merge.D1.A;
import com.github.catvod.spider.merge.D1.c;
import com.github.catvod.spider.merge.F0.d;
import com.github.catvod.spider.merge.F0.k;
import com.github.catvod.spider.merge.I.s;
import com.github.catvod.spider.merge.K1.f;
import com.github.catvod.spider.merge.k1.l;
import com.github.catvod.spider.merge.p1.a;
import com.github.catvod.spider.merge.p1.e;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class D {
    private static void a(d<com.github.catvod.spider.merge.F0.e> d2, String string, String string2) {
        d2.f("videoId", string);
        if (string2 != null) {
            d2.f("cpn", string2);
        }
        d2.g("contentCheckOk", true);
        d2.g("racyCheckOk", true);
    }

    public static com.github.catvod.spider.merge.F0.e b(a object, e e2, String string, String string2) {
        AbstractMap.SimpleEntry simpleEntry;
        c c2 = c.a();
        int n2 = A.j;
        Object object2 = e2 != null ? e2 : e.c;
        List<Object> list = s.a("com.google.visionos.youtube/1.04(RealityDevice17,1; U; CPU visionOS 26_6_0 like Mac OS X; ", ((e)object2).a(), ")");
        int n3 = 0;
        object2 = new ArrayList(1);
        for (n2 = 0; n2 < 1; ++n2) {
            simpleEntry = (new Object[]{list})[n2];
            Objects.requireNonNull(simpleEntry);
            ((ArrayList)object2).add(simpleEntry);
        }
        object2 = Collections.unmodifiableList(object2);
        list = new ArrayList(1);
        for (n2 = 0; n2 < 1; ++n2) {
            simpleEntry = (new Object[]{"2"})[n2];
            Objects.requireNonNull(simpleEntry);
            ((ArrayList)list).add((Object)simpleEntry);
        }
        list = Collections.unmodifiableList(list);
        object2 = new AbstractMap.SimpleEntry<String, Object>("User-Agent", object2);
        simpleEntry = new AbstractMap.SimpleEntry("X-Goog-Api-Format-Version", list);
        HashMap hashMap = new HashMap(2);
        for (n2 = n3; n2 < 2; ++n2) {
            Map.Entry entry = (new Map.Entry[]{object2, simpleEntry})[n2];
            list = entry.getKey();
            Objects.requireNonNull(list);
            entry = entry.getValue();
            Objects.requireNonNull(entry);
            if (hashMap.put(list, entry) == null) {
                continue;
            }
            throw new IllegalArgumentException(com.github.catvod.spider.merge.A.c.a("duplicate key: ", list));
        }
        object2 = Collections.unmodifiableMap(hashMap);
        c2.a.c = A.t(c2, e2, (a)object, (Map)object2);
        object = A.D(e2, (a)object, c2);
        D.a((d<com.github.catvod.spider.merge.F0.e>)object, string, string2);
        object = k.b(((d)object).b()).getBytes(StandardCharsets.UTF_8);
        string = com.github.catvod.spider.merge.G1.a.a("https://youtubei.googleapis.com/youtubei/v1/player?prettyPrint=false&t=", A.i(), "&id=", string);
        return f.j(A.s(l.a().f(string, (Map<String, List<String>>)object2, (byte[])object, e2)));
    }

    public static com.github.catvod.spider.merge.F0.e c(e e2, a object, String string) {
        c c2 = c.b();
        c2.a.b = A.k();
        Map<String, List<String>> map = A.u();
        c2.a.c = A.t(c2, e2, (a)object, map);
        object = A.D(e2, (a)object, c2);
        D.a((d<com.github.catvod.spider.merge.F0.e>)object, string, null);
        object = k.b(((d)object).b()).getBytes(StandardCharsets.UTF_8);
        return f.j(A.s(l.a().f("https://www.youtube.com/youtubei/v1/player?prettyPrint=false&$fields=microformat,videoDetails.thumbnail.thumbnails,videoDetails.videoId", map, (byte[])object, e2)));
    }
}

