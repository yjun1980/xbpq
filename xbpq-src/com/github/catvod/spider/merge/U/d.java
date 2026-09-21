/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.U.i;
import com.github.catvod.spider.merge.cYh;
import java.util.Objects;

public final class d {
    public static void a(StringBuffer stringBuffer, Object object) {
        Objects.requireNonNull(object, new i(cYh.d("08322B34342E"), new Object[0]));
        String string = object.getClass().getName();
        object = Integer.toHexString(System.identityHashCode(object));
        int n2 = stringBuffer.length();
        int n3 = string.length();
        stringBuffer.ensureCapacity(((String)object).length() + (n3 + n2 + 1));
        stringBuffer.append(string);
        stringBuffer.append('@');
        stringBuffer.append((String)object);
    }
}

