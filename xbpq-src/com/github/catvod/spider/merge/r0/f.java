/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.r0;

import com.github.catvod.spider.merge.o0.d;
import com.github.catvod.spider.merge.r0.a;
import com.github.catvod.spider.merge.r0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class f
extends a<f, com.github.catvod.spider.merge.w0.d> {
    private final String b;
    private Map<Integer, com.github.catvod.spider.merge.x0.a> c = new HashMap<Integer, com.github.catvod.spider.merge.x0.a>();

    public f(String string) {
        this.b = string;
    }

    public final String c() {
        int n2;
        int n3;
        Iterator iterator;
        Object object;
        boolean bl = ((HashMap)this.c).isEmpty();
        Object object2 = null;
        if (bl) {
            return null;
        }
        if (!((HashMap)this.c).isEmpty()) {
            object = new ArrayList(((HashMap)this.c).values());
            ((ArrayList)object).sort(e.a);
            iterator = ((ArrayList)object).iterator();
            n3 = 0;
            while (true) {
                object2 = object;
                n2 = n3;
                if (iterator.hasNext()) {
                    n3 += ((com.github.catvod.spider.merge.x0.a)iterator.next()).length();
                    continue;
                }
                break;
            }
        } else {
            n2 = 0;
        }
        n3 = object2 != null ? n2 + 2 : n2;
        object = new byte[n3];
        if (object2 != null) {
            object[0] = 18;
            object[1] = (byte)n2;
            iterator = object2.iterator();
            n2 = 2;
            while (iterator.hasNext()) {
                object2 = (com.github.catvod.spider.merge.x0.a)iterator.next();
                System.arraycopy(object2.data(), 0, object, n2, object2.length());
                n2 += object2.length();
            }
        }
        return ((d)com.github.catvod.spider.merge.o0.a.a()).a((byte[])object).replace("=", "%253D");
    }

    public final String d() {
        return this.b;
    }
}

