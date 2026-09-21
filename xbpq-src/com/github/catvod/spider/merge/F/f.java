/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.F;

import java.util.Iterator;

public final class f {
    public static String a(Iterator iterator, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

