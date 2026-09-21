/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.r0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.r0.e;
import com.github.catvod.spider.merge.xc.r0.l;

public abstract class m
extends l {
    public static final boolean J(String string, String string2, int n2, int n3, boolean bl) {
        i.e(string, "<this>");
        i.e(string2, "other");
        bl = !bl ? string.regionMatches(0, string2, n2, n3) : string.regionMatches(bl, 0, string2, n2, n3);
        return bl;
    }

    public static String K(String object, String string, String string2) {
        block6: {
            block5: {
                int n2;
                int n3;
                i.e(object, "<this>");
                int n4 = e.O(0, (CharSequence)object, string, false);
                if (n4 < 0) break block5;
                int n5 = string.length();
                int n6 = 1;
                if (n5 >= 1) {
                    n6 = n5;
                }
                int n7 = ((String)object).length();
                n7 = string2.length() + (n7 - n5);
                if (n7 < 0) break block6;
                StringBuilder stringBuilder = new StringBuilder(n7);
                n7 = 0;
                do {
                    stringBuilder.append((CharSequence)object, n7, n4);
                    stringBuilder.append(string2);
                    n2 = n4 + n5;
                    if (n4 >= ((String)object).length()) break;
                    n4 = n3 = e.O(n4 + n6, (CharSequence)object, string, false);
                    n7 = n2;
                } while (n3 > 0);
                stringBuilder.append((CharSequence)object, n2, ((String)object).length());
                object = stringBuilder.toString();
                i.d(object, "toString(...)");
            }
            return object;
        }
        object = new OutOfMemoryError();
        throw object;
    }

    public static boolean L(String string, String string2) {
        i.e(string, "<this>");
        i.e(string2, "prefix");
        return string.startsWith(string2);
    }
}

