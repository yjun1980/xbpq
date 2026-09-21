/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02ee;
import java.io.Serializable;

public class \u02b4 {
    public static final \u037f \u037f = new \u037f();

    public static void \u037f(StringBuffer stringBuffer, Object object) {
        \u02ee.\u0528(object, SOY.d("15303B131703"), new Object[0]);
        String string = object.getClass().getName();
        object = Integer.toHexString(System.identityHashCode(object));
        stringBuffer.ensureCapacity(stringBuffer.length() + string.length() + 1 + ((String)object).length());
        stringBuffer.append(string);
        stringBuffer.append('@');
        stringBuffer.append((String)object);
    }

    public static class \u037f
    implements Serializable {
        \u037f() {
        }
    }
}

