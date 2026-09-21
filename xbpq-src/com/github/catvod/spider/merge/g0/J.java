/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.g0;

import com.github.catvod.spider.\u5149\u9e2d\u793e\u533a;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class J
implements Comparator {
    public static final J a = new J();

    private /* synthetic */ J() {
    }

    public final int compare(Object object, Object object2) {
        object = (Map.Entry)object;
        object2 = (Map.Entry)object2;
        int n2 = \u5149\u9e2d\u793e\u533a.x;
        return Integer.compare(((List)object2.getValue()).size(), ((List)object.getValue()).size());
    }
}

