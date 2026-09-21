/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.R0;

import com.github.catvod.spider.merge.R0.a;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Pattern;

public final class e {
    public static final int a = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null) {
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            return com.github.catvod.spider.merge.R0.a.b(charSequence, 0, charSequence2, charSequence.length());
        }
        return false;
    }

    public static boolean b(CharSequence charSequence) {
        int n2 = charSequence == null ? 0 : charSequence.length();
        if (n2 == 0) {
            return true;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        boolean bl = charSequence == null || charSequence.length() == 0;
        return bl;
    }

    public static boolean d(CharSequence charSequence) {
        return e.b(charSequence) ^ true;
    }

    public static boolean e(CharSequence charSequence) {
        return e.c(charSequence) ^ true;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static String f(Iterable object) {
        Iterator iterator = object.iterator();
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        object = iterator.next();
        if (!iterator.hasNext()) {
            return Objects.toString(object, "");
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        if (object != null) {
            stringBuilder.append(object);
        }
        while (iterator.hasNext()) {
            stringBuilder.append(",");
            object = iterator.next();
            if (object == null) continue;
            stringBuilder.append(object);
        }
        return stringBuilder.toString();
    }

    public static String g(String string, String string2, String string3) {
        CharSequence charSequence = string;
        if (!e.c(string)) {
            charSequence = string;
            if (!e.c(string2)) {
                charSequence = string;
                if (string3 != null) {
                    int n2 = 0;
                    int n3 = string != null && string2 != null ? com.github.catvod.spider.merge.R0.a.a(string, string2, 0) : -1;
                    if (n3 == -1) {
                        charSequence = string;
                    } else {
                        int n4 = string2.length();
                        int n5 = Math.max(string3.length() - n4, 0);
                        charSequence = new StringBuilder(string.length() + n5 * 16);
                        n5 = -1;
                        int n6 = n3;
                        n3 = n2;
                        while (true) {
                            n2 = n3;
                            if (n6 == -1) break;
                            ((StringBuilder)charSequence).append(string, n3, n6);
                            ((StringBuilder)charSequence).append(string3);
                            n3 = n6 + n4;
                            if (--n5 == 0) {
                                n2 = n3;
                                break;
                            }
                            n6 = com.github.catvod.spider.merge.R0.a.a(string, string2, n3);
                        }
                        ((StringBuilder)charSequence).append(string, n2, string.length());
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
            }
        }
        return charSequence;
    }
}

