package com.github.catvod.spider.merge.L;

/* loaded from: classes.dex */
public final class h {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i) && ((c = (char) ((r4 | ' ') - 97)) >= 26 || c != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static final String c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
