/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u01c3;
import com.github.catvod.spider.merge.\u020b;
import com.github.catvod.spider.merge.\u0719;
import com.github.catvod.spider.merge.\u07fa;
import com.github.catvod.spider.merge.\u0e33;
import java.util.IdentityHashMap;
import java.util.Iterator;
import javax.annotation.Nullable;

public class \u0393 {
    public static \u0e33 \u037f(String object, Iterable<\u013a> object2) {
        \u01c3.\u052d((String)object);
        \u01c3.\u052f(object2);
        \u020b \u020b2 = \u0719.\u0788((String)object);
        \u0e33 \u0e332 = new \u0e33();
        object = new IdentityHashMap();
        Iterator<\u013a> iterator = object2.iterator();
        while (iterator.hasNext()) {
            for (\u013a \u013a2 : \u0393.\u0529(\u020b2, iterator.next())) {
                if (((IdentityHashMap)object).put(\u013a2, Boolean.TRUE) != null) continue;
                \u0e332.add(\u013a2);
            }
        }
        return \u0e332;
    }

    public static \u0e33 \u0528(String string, \u013a \u013a2) {
        \u01c3.\u052d(string);
        return \u0393.\u0529(\u0719.\u0788(string), \u013a2);
    }

    public static \u0e33 \u0529(\u020b \u020b2, \u013a \u013a2) {
        \u01c3.\u052f(\u020b2);
        \u01c3.\u052f(\u013a2);
        return \u07fa.\u037f(\u020b2, \u013a2);
    }

    @Nullable
    public static \u013a \u052a(String string, \u013a \u013a2) {
        \u01c3.\u052d(string);
        return \u07fa.\u0528(\u0719.\u0788(string), \u013a2);
    }

    public static class \u037f
    extends IllegalStateException {
        public \u037f(String string, Object ... objectArray) {
            super(String.format(string, objectArray));
        }
    }
}

