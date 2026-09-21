/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.A0;

import com.github.catvod.spider.merge.xc.A0.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class c {
    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static boolean a(CharSequence ... charSequenceArray) {
        int n2 = Array.getLength(charSequenceArray) == 0 ? 1 : 0;
        if (n2 != 0) {
            return true;
        }
        int n3 = charSequenceArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            if (!c.d(charSequenceArray[n2])) continue;
            return false;
        }
        return true;
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

    public static boolean c(CharSequence ... charSequenceArray) {
        boolean bl;
        int n2 = Array.getLength(charSequenceArray);
        boolean bl2 = false;
        if ((n2 = n2 == 0 ? 1 : 0) != 0) {
            bl = bl2;
        } else {
            int n3 = charSequenceArray.length;
            n2 = 0;
            while (true) {
                bl = bl2;
                if (n2 >= n3) break;
                if (c.b(charSequenceArray[n2])) {
                    bl = true;
                    break;
                }
                ++n2;
            }
        }
        return bl ^ true;
    }

    public static boolean d(CharSequence charSequence) {
        return c.b(charSequence) ^ true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String e(String string, List iterator) {
        if ((iterator = iterator.iterator()) == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        Object t2 = iterator.next();
        if (!iterator.hasNext()) {
            if (t2 != null) return t2.toString();
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        if (t2 != null) {
            stringBuilder.append(t2);
        }
        while (iterator.hasNext()) {
            stringBuilder.append(string);
            t2 = iterator.next();
            if (t2 == null) continue;
            stringBuilder.append(t2);
        }
        return stringBuilder.toString();
    }

    public static String[] f(String stringArray, String string) {
        if (stringArray == null) {
            stringArray = null;
        } else {
            int n2 = stringArray.length();
            String[] stringArray2 = a.b;
            if (n2 == 0) {
                stringArray = stringArray2;
            } else {
                int n3;
                boolean bl;
                int n4;
                ArrayList<String> arrayList = new ArrayList<String>();
                if (string.length() == 1) {
                    char c2 = string.charAt(0);
                    int n5 = 0;
                    boolean bl2 = false;
                    int n6 = 0;
                    int n7 = 1;
                    while (true) {
                        n4 = ++n5;
                        bl = bl2;
                        n3 = n6;
                        if (n5 < n2) {
                            if (stringArray.charAt(n5) == c2) {
                                if (bl2) {
                                    if (n7 == -1) {
                                        n5 = n2;
                                    }
                                    arrayList.add(stringArray.substring(n6, n5));
                                    ++n7;
                                    bl2 = false;
                                }
                                n5 = n6 = n5 + 1;
                                continue;
                            }
                            bl2 = true;
                            continue;
                        }
                        break;
                    }
                } else {
                    int n8 = 0;
                    boolean bl3 = false;
                    int n9 = 0;
                    int n10 = 1;
                    while (true) {
                        n4 = ++n8;
                        bl = bl3;
                        n3 = n9;
                        if (n8 >= n2) break;
                        if (string.indexOf(stringArray.charAt(n8)) >= 0) {
                            if (bl3) {
                                if (n10 == -1) {
                                    n8 = n2;
                                }
                                arrayList.add(stringArray.substring(n9, n8));
                                ++n10;
                                bl3 = false;
                            }
                            n8 = n9 = n8 + 1;
                            continue;
                        }
                        bl3 = true;
                    }
                }
                if (bl) {
                    arrayList.add(stringArray.substring(n3, n4));
                }
                stringArray = arrayList.toArray(stringArray2);
            }
        }
        return stringArray;
    }
}

