/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u02bc;
import com.github.catvod.spider.merge.\u0374;
import com.github.catvod.spider.merge.\u07f5;
import java.util.Iterator;
import java.util.regex.Pattern;

public class \u02d1 {
    private static final Pattern \u037f = Pattern.compile(SOY.d("26222A3F1A34153F331F1A1E1435151F1514083B251F1716161F30041F040779"));

    public static boolean \u037f(CharSequence charSequence, char ... cArray) {
        if (!\u02d1.\u058f(charSequence) && !\u0374.\u0529(cArray)) {
            int n2 = charSequence.length();
            int n3 = cArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = charSequence.charAt(i2);
                for (int i4 = 0; i4 < n3; ++i4) {
                    if (cArray[i4] != c2) continue;
                    if (Character.isHighSurrogate(c2)) {
                        if (i4 == n3 - 1) {
                            return true;
                        }
                        if (i2 >= n2 - 1 || cArray[i4 + 1] != charSequence.charAt(i2 + 1)) continue;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean \u0528(CharSequence charSequence, char ... cArray) {
        if (charSequence != null && cArray != null) {
            int n2 = charSequence.length();
            int n3 = cArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = charSequence.charAt(i2);
                for (int i4 = 0; i4 < n3; ++i4) {
                    if (cArray[i4] != c2) continue;
                    if (Character.isHighSurrogate(c2)) {
                        if (i4 == n3 - 1) {
                            return false;
                        }
                        if (i2 >= n2 - 1 || cArray[i4 + 1] != charSequence.charAt(i2 + 1)) continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static String \u0529(String string) {
        return \u02d1.\u052a(string, "");
    }

    public static String \u052a(String string, String string2) {
        String string3 = string;
        if (string == null) {
            string3 = string2;
        }
        return string3;
    }

    public static boolean \u052b(CharSequence charSequence, CharSequence charSequence2) {
        return \u02d1.\u052c(charSequence, charSequence2, false);
    }

    private static boolean \u052c(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        boolean bl2 = false;
        if (charSequence != null && charSequence2 != null) {
            if (charSequence2.length() > charSequence.length()) {
                return false;
            }
            return \u02bc.\u0528(charSequence, bl, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        }
        bl = bl2;
        if (charSequence == charSequence2) {
            bl = true;
        }
        return bl;
    }

    public static int \u052d(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence != null && charSequence2 != null) {
            return \u02bc.\u037f(charSequence, charSequence2, n2);
        }
        return -1;
    }

    public static int \u052e(CharSequence charSequence, CharSequence charSequence2, int n2) {
        if (charSequence != null && charSequence2 != null) {
            int n3;
            int n4 = n2;
            if (n2 < 0) {
                n4 = 0;
            }
            if (n4 > (n3 = charSequence.length() - charSequence2.length() + 1)) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return n4;
            }
            for (n2 = n4; n2 < n3; ++n2) {
                if (!\u02bc.\u0528(charSequence, true, n2, charSequence2, 0, charSequence2.length())) continue;
                return n2;
            }
        }
        return -1;
    }

    public static boolean \u052f(CharSequence charSequence) {
        int n2 = \u02d1.\u0782(charSequence);
        if (n2 == 0) {
            return true;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            if (Character.isWhitespace(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    public static boolean \u058f(CharSequence charSequence) {
        boolean bl = charSequence == null || charSequence.length() == 0;
        return bl;
    }

    public static boolean \u0620(CharSequence charSequence) {
        return \u02d1.\u052f(charSequence) ^ true;
    }

    public static String \u0780(Iterable<?> iterable, String string) {
        if (iterable == null) {
            return null;
        }
        return \u02d1.\u0781(iterable.iterator(), string);
    }

    public static String \u0781(Iterator<?> iterator, String string) {
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        Object obj = iterator.next();
        if (!iterator.hasNext()) {
            return \u07f5.\u037f(obj, "");
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        if (obj != null) {
            stringBuilder.append(obj);
        }
        while (iterator.hasNext()) {
            if (string != null) {
                stringBuilder.append(string);
            }
            if ((obj = iterator.next()) == null) continue;
            stringBuilder.append(obj);
        }
        return stringBuilder.toString();
    }

    public static int \u0782(CharSequence charSequence) {
        int n2 = charSequence == null ? 0 : charSequence.length();
        return n2;
    }

    public static String \u0783(String string, String string2) {
        String string3 = string;
        if (!\u02d1.\u058f(string)) {
            if (\u02d1.\u058f(string2)) {
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

    public static String \u0784(String string, String string2) {
        String string3 = string;
        if (!\u02d1.\u058f(string)) {
            if (\u02d1.\u058f(string2)) {
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

    public static String \u0785(String string, String string2, String string3) {
        return \u02d1.\u0786(string, string2, string3, -1);
    }

    public static String \u0786(String string, String string2, String string3, int n2) {
        return \u02d1.\u0787(string, string2, string3, n2, false);
    }

    private static String \u0787(String string, String charSequence, String string2, int n2, boolean bl) {
        String string3 = string;
        if (!\u02d1.\u058f(string)) {
            string3 = string;
            if (!\u02d1.\u058f(charSequence)) {
                string3 = string;
                if (string2 != null) {
                    if (n2 == 0) {
                        string3 = string;
                    } else {
                        string3 = charSequence;
                        if (bl) {
                            string3 = ((String)charSequence).toLowerCase();
                        }
                        int n3 = 0;
                        int n4 = bl ? \u02d1.\u052e(string, string3, 0) : \u02d1.\u052d(string, string3, 0);
                        if (n4 == -1) {
                            return string;
                        }
                        int n5 = string3.length();
                        int n6 = Math.max(string2.length() - n5, 0);
                        int n7 = n2 < 0 ? 16 : Math.min(n2, 64);
                        charSequence = new StringBuilder(string.length() + n6 * n7);
                        n7 = n2;
                        n2 = n3;
                        while (true) {
                            n3 = n2;
                            if (n4 == -1) break;
                            ((StringBuilder)charSequence).append(string, n2, n4);
                            ((StringBuilder)charSequence).append(string2);
                            n2 = n4 + n5;
                            if (--n7 == 0) {
                                n3 = n2;
                                break;
                            }
                            if (bl) {
                                n4 = \u02d1.\u052e(string, string3, n2);
                                continue;
                            }
                            n4 = \u02d1.\u052d(string, string3, n2);
                        }
                        ((StringBuilder)charSequence).append(string, n3, string.length());
                        string3 = ((StringBuilder)charSequence).toString();
                    }
                }
            }
        }
        return string3;
    }

    public static String \u0788(String string, int n2) {
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

    public static String \u0789(String string, int n2, int n3) {
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

    public static String \u078a(String string, String string2) {
        if (\u02d1.\u058f(string)) {
            return string;
        }
        if (string2 == null) {
            return "";
        }
        int n2 = string.indexOf(string2);
        if (n2 == -1) {
            return "";
        }
        return string.substring(n2 + string2.length());
    }

    public static String \u078b(String string, String string2) {
        if (\u02d1.\u058f(string)) {
            return string;
        }
        if (\u02d1.\u058f(string2)) {
            return "";
        }
        int n2 = string.lastIndexOf(string2);
        if (n2 != -1 && n2 != string.length() - string2.length()) {
            return string.substring(n2 + string2.length());
        }
        return "";
    }

    public static String \u078c(String string, String string2) {
        String string3 = string;
        if (!\u02d1.\u058f(string)) {
            if (string2 == null) {
                string3 = string;
            } else {
                if (string2.isEmpty()) {
                    return "";
                }
                int n2 = string.indexOf(string2);
                if (n2 == -1) {
                    return string;
                }
                string3 = string.substring(0, n2);
            }
        }
        return string3;
    }

    public static String \u078d(String string, String string2) {
        String string3 = string;
        if (!\u02d1.\u058f(string)) {
            if (\u02d1.\u058f(string2)) {
                string3 = string;
            } else {
                int n2 = string.lastIndexOf(string2);
                if (n2 == -1) {
                    return string;
                }
                string3 = string.substring(0, n2);
            }
        }
        return string3;
    }
}

