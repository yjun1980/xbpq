/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.U.a;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class h {
    public static final int a = 0;

    static {
        Pattern.compile(cYh.d("3B203A183919083D2338393309370538363915393538343B0B1D20233C291A7B"));
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        boolean bl = false;
        if (charSequence != null && charSequence2 != null) {
            if (charSequence2.length() <= charSequence.length()) {
                bl = com.github.catvod.spider.merge.U.a.b(charSequence, false, charSequence.length() - charSequence2.length(), charSequence2, charSequence2.length());
            }
        } else if (charSequence == charSequence2) {
            bl = true;
        }
        return bl;
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
        return h.b(charSequence) ^ true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static String e(Iterable<?> object, String string) {
        StringBuilder stringBuilder = null;
        if (object == null) {
            return null;
        }
        Iterator iterator = object.iterator();
        if (iterator == null) {
            return stringBuilder;
        }
        if (iterator.hasNext()) {
            object = iterator.next();
            if (!iterator.hasNext()) {
                if (object == null) return "";
                return object.toString();
            }
        } else {
            return "";
        }
        stringBuilder = new StringBuilder(256);
        if (object != null) {
            stringBuilder.append(object);
        }
        while (iterator.hasNext()) {
            if (string != null) {
                stringBuilder.append(string);
            }
            if ((object = iterator.next()) == null) continue;
            stringBuilder.append(object);
        }
        return stringBuilder.toString();
    }

    public static String f(String string, String string2) {
        String string3 = string;
        if (!h.c(string)) {
            if (h.c(string2)) {
                string3 = string;
            } else {
                string3 = string;
                if (string.endsWith(string2)) {
                    string3 = string.substring(0, string.length() - string2.length());
                }
            }
        }
        return string3;
    }

    public static String g(String string, String string2) {
        String string3 = string;
        if (!h.c(string)) {
            if (h.c(string2)) {
                string3 = string;
            } else {
                string3 = string;
                if (string.startsWith(string2)) {
                    string3 = string.substring(string2.length());
                }
            }
        }
        return string3;
    }

    public static String h(String string, String string2, String string3) {
        CharSequence charSequence = string;
        if (!h.c(string)) {
            charSequence = string;
            if (!h.c(string2)) {
                charSequence = string;
                if (string3 != null) {
                    int n2 = 0;
                    int n3 = string != null && string2 != null ? com.github.catvod.spider.merge.U.a.a(string, string2, 0) : -1;
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
                            n6 = com.github.catvod.spider.merge.U.a.a(string, string2, n3);
                        }
                        ((StringBuilder)charSequence).append(string, n2, string.length());
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
            }
        }
        return charSequence;
    }

    public static String i(String string, int n2) {
        if (string == null) {
            return null;
        }
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + string.length();
        }
        n2 = n3;
        if (n3 < 0) {
            n2 = 0;
        }
        if (n2 > string.length()) {
            return "";
        }
        return string.substring(n2);
    }

    public static String j(String string, int n2, int n3) {
        if (string == null) {
            return null;
        }
        int n4 = n3;
        if (n3 < 0) {
            n4 = n3 + string.length();
        }
        n3 = n2;
        if (n2 < 0) {
            n3 = n2 + string.length();
        }
        n2 = n4;
        if (n4 > string.length()) {
            n2 = string.length();
        }
        if (n3 > n2) {
            return "";
        }
        n4 = n3;
        if (n3 < 0) {
            n4 = 0;
        }
        n3 = n2;
        if (n2 < 0) {
            n3 = 0;
        }
        return string.substring(n4, n3);
    }
}

