/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.UY;

import com.github.catvod.spider.merge.UY.k;
import com.github.catvod.spider.merge.UY.l;
import java.util.Comparator;

public final class j
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n2;
        object = (k)object;
        object2 = (k)object2;
        int n3 = l.a(((k)object).b);
        n3 = n3 != (n2 = l.a(((k)object2).b)) ? (n3 -= n2) : ((k)object).b.compareToIgnoreCase(((k)object2).b);
        return n3;
    }
}

