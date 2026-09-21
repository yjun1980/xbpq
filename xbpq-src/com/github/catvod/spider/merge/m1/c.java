/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.m1;

import com.github.catvod.spider.merge.G1.a;
import com.github.catvod.spider.merge.m1.b;
import com.github.catvod.spider.merge.p1.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class c {
    private final String a;
    private final String b;
    private final Map<String, List<String>> c;
    private final byte[] d;
    private final e e;

    c(b object) {
        String string = com.github.catvod.spider.merge.m1.b.d((b)object);
        String string2 = com.github.catvod.spider.merge.m1.b.f((b)object);
        Map map = com.github.catvod.spider.merge.m1.b.c((b)object);
        Object object2 = com.github.catvod.spider.merge.m1.b.b((b)object);
        e e2 = com.github.catvod.spider.merge.m1.b.e((b)object);
        boolean bl = com.github.catvod.spider.merge.m1.b.a((b)object);
        Objects.requireNonNull(string, "Request's httpMethod is null");
        this.a = string;
        Objects.requireNonNull(string2, "Request's url is null");
        this.b = string2;
        this.d = object2;
        this.e = e2;
        object2 = new LinkedHashMap();
        if (map != null) {
            object2.putAll(map);
        }
        if (bl && e2 != null) {
            object = e2.b();
            if (!e2.a().isEmpty()) {
                object = com.github.catvod.spider.merge.G1.a.a(e2.c(), ", ", (String)object, ";q=0.9");
            }
            object2.putAll(Collections.singletonMap("Accept-Language", Collections.singletonList(object)));
        }
        this.c = Collections.unmodifiableMap(object2);
    }

    public final byte[] a() {
        return this.d;
    }

    public final Map<String, List<String>> b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && c.class == object.getClass()) {
            object = (c)object;
            if (!(this.a.equals(((c)object).a) && this.b.equals(((c)object).b) && this.c.equals(((c)object).c) && Arrays.equals(this.d, ((c)object).d) && Objects.equals(this.e, ((c)object).e))) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = Objects.hash(this.a, this.b, this.c, this.e);
        return Arrays.hashCode(this.d) + n2 * 31;
    }
}

