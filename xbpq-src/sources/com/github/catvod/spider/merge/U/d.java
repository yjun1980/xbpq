package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.cYh;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {
    public static void a(StringBuffer stringBuffer, Object obj) {
        Objects.requireNonNull(obj, new i(cYh.d("08322B34342E"), new Object[0]));
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        stringBuffer.ensureCapacity(hexString.length() + name.length() + stringBuffer.length() + 1);
        stringBuffer.append(name);
        stringBuffer.append('@');
        stringBuffer.append(hexString);
    }
}
