/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K1;

import com.github.catvod.spider.merge.K1.a;
import com.github.catvod.spider.merge.K1.h;
import java.util.Objects;

public final class b {
    private static final h a;
    private static volatile h b;

    static {
        a a2 = new a();
        a = a2;
        b = a2;
    }

    public static void a(String string, Object ... objectArray) {
        if (b != a && objectArray.length != 0) {
            int n2 = string.length();
            StringBuilder stringBuilder = new StringBuilder(Math.min(32, objectArray.length * 16) + n2);
            int n3 = string.length();
            n2 = 0;
            int n4 = 0;
            while (n2 < n3) {
                int n5;
                int n6 = string.charAt(n2);
                if (n6 == 123 && (n5 = n2 + 1) < n3 && string.charAt(n5) == '{' || n6 == 125 && (n5 = n2 + 1) < n3 && string.charAt(n5) == '}') {
                    n2 += 2;
                    continue;
                }
                if (n6 == 123) {
                    n6 = string.indexOf(125, n2 + 1);
                    if (n6 < 0) {
                        stringBuilder.append(string, n2, n3);
                        break;
                    }
                    if (n4 < objectArray.length) {
                        Objects.toString(objectArray[n4]);
                        ++n4;
                    } else {
                        stringBuilder.append(string, n2, n6 + 1);
                    }
                    n2 = n6 + 1;
                    continue;
                }
                ++n2;
            }
        }
    }
}

