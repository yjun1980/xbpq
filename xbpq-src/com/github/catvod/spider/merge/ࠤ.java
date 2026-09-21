/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import java.util.Iterator;

public class \u0824 {
    public static String \u037f(String object, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object2 : (Object)((String)object).toCharArray()) {
            if (object2 == 32 && bl) {
                stringBuilder.append('\u00b7');
                continue;
            }
            if (object2 == 9) {
                stringBuilder.append(SOY.d("2626"));
                continue;
            }
            if (object2 == 10) {
                stringBuilder.append(SOY.d("263C"));
                continue;
            }
            if (object2 == 13) {
                stringBuilder.append(SOY.d("2620"));
                continue;
            }
            stringBuilder.append((char)object2);
        }
        return stringBuilder.toString();
    }

    public static <T> String \u0528(Iterator<T> iterator, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}

