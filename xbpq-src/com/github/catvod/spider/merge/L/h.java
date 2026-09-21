/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.L;

public final class h {
    public static boolean a(Object object, Object object2) {
        boolean bl = object == object2 || object != null && object.equals(object2);
        return bl;
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        int n2 = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (n2 != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2;
            char c3 = charSequence.charAt(i2);
            if (c3 == (c2 = charSequence2.charAt(i2)) || (c3 = (char)((c3 | 0x20) - 97)) < '\u001a' && c3 == (char)((c2 | 0x20) - 97)) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static final String c(Object object) {
        return object.getClass().getSimpleName();
    }

    public static final String d(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
    }
}

