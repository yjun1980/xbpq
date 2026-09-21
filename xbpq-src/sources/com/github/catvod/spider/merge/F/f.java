package com.github.catvod.spider.merge.F;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {
    public static String a(Iterator it, String str) {
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
