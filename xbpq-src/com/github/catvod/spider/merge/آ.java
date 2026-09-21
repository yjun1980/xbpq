/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02e1;
import com.github.catvod.spider.merge.\u02ee;
import java.text.Format;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

abstract class \u0622<F extends Format> {
    private static final ConcurrentMap<\u037f, String> \u037f = new ConcurrentHashMap<\u037f, String>(7);
    private final ConcurrentMap<\u037f, F> \u0528 = new ConcurrentHashMap<\u037f, F>(7);

    \u0622() {
    }

    protected abstract F \u037f(String var1, TimeZone var2, Locale var3);

    public F \u0528(String object, TimeZone object2, Locale cloneable) {
        \u02ee.\u0528(object, SOY.d("0A332502110514"), new Object[0]);
        TimeZone timeZone = object2;
        if (object2 == null) {
            timeZone = TimeZone.getDefault();
        }
        Locale locale = \u02e1.\u037f(cloneable);
        \u037f \u03f3 = new \u037f(object, timeZone, locale);
        cloneable = (Format)this.\u0528.get(\u03f3);
        object2 = cloneable;
        if (cloneable == null && (object = (Format)((Object)this.\u0528.putIfAbsent(\u03f3, object2 = this.\u037f((String)object, timeZone, locale)))) != null) {
            object2 = object;
        }
        return (F)object2;
    }

    private static final class \u037f {
        private final Object[] \u037f;
        private final int \u0528;

        \u037f(Object ... objectArray) {
            this.\u037f = objectArray;
            this.\u0528 = com.github.catvod.spider.merge.\u0622$\u037f.\u037f(objectArray);
        }

        private static int \u037f(Object[] objectArray) {
            return 31 + Arrays.hashCode(objectArray);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if (\u037f.class != object.getClass()) {
                return false;
            }
            object = (\u037f)object;
            return Arrays.deepEquals(this.\u037f, ((\u037f)object).\u037f);
        }

        public int hashCode() {
            return this.\u0528;
        }
    }
}

