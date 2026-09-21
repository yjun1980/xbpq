/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.A0;

import com.github.catvod.spider.merge.A0.a;
import com.github.catvod.spider.merge.B0.c;
import com.github.catvod.spider.merge.B0.f;
import java.util.LinkedList;
import java.util.List;

public final class b {
    private final a a;
    private final List<c> b;
    private final List<com.github.catvod.spider.merge.z0.a> c;

    public b(a a2, List<c> list, List<com.github.catvod.spider.merge.z0.a> list2) {
        this.a = a2;
        this.b = list;
        this.c = list2;
    }

    public final List<com.github.catvod.spider.merge.B0.a> a() {
        LinkedList<com.github.catvod.spider.merge.B0.a> linkedList = new LinkedList<com.github.catvod.spider.merge.B0.a>();
        for (c c2 : this.b) {
            if (!(c2 instanceof com.github.catvod.spider.merge.B0.a)) continue;
            linkedList.add((com.github.catvod.spider.merge.B0.a)c2);
        }
        return linkedList;
    }

    public final a b() {
        return this.a;
    }

    public final List<f> c() {
        LinkedList<f> linkedList = new LinkedList<f>();
        for (c c2 : this.b) {
            if (!(c2 instanceof f)) continue;
            linkedList.add((f)c2);
        }
        return linkedList;
    }
}

