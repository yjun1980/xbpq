/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.w0.g;
import com.github.catvod.spider.merge.y0.a;
import com.github.catvod.spider.merge.y0.c;
import com.github.catvod.spider.merge.y0.e;
import com.github.catvod.spider.merge.y0.f;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class d {
    private final List<g> a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public d(List object, Map map) {
        this.a = object;
        object = (f)map.get((Object)c.a);
        object = (e)map.get((Object)c.c);
        object = c.b;
        if (map.containsKey(object)) {
            Objects.requireNonNull((a)map.get(object));
        }
    }

    public final List<g> a() {
        return this.a;
    }
}

