/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.l0;

import java.util.Comparator;
import java.util.List;

public final class a
implements Comparator {
    public final List a;

    public /* synthetic */ a(List list) {
        this.a = list;
    }

    public final int compare(Object object, Object object2) {
        List list = this.a;
        object = (String)object;
        object2 = (String)object2;
        int n2 = list.indexOf(object);
        int n3 = list.indexOf(object2);
        int n4 = n2;
        if (n2 < 0) {
            n4 = Integer.MAX_VALUE;
        }
        n2 = n3;
        if (n3 < 0) {
            n2 = Integer.MAX_VALUE;
        }
        n4 = n4 != n2 ? Integer.compare(n4, n2) : String.valueOf(object).compareTo(String.valueOf(object2));
        return n4;
    }
}

