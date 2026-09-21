/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.E0;

import com.github.catvod.spider.merge.xc.E0.a;
import java.io.Serializable;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

public abstract class b {
    public static final String[] a = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    public static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    public static final a e = new a();

    public static void a(StringBuilder stringBuilder, String string, boolean bl) {
        int n2;
        int n3 = string.length();
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = 0; i2 < n3; i2 += Character.charCount(n2)) {
            boolean bl4;
            boolean bl5;
            block11: {
                block12: {
                    block10: {
                        n2 = string.codePointAt(i2);
                        if (n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13 || n2 == 160) break block10;
                        bl5 = bl2;
                        bl4 = bl3;
                        if (n2 != 8203) {
                            if (n2 == 173) {
                                bl5 = bl2;
                                bl4 = bl3;
                            } else {
                                stringBuilder.appendCodePoint(n2);
                                bl5 = true;
                                bl4 = false;
                            }
                        }
                        break block11;
                    }
                    if (!bl) break block12;
                    bl5 = bl2;
                    bl4 = bl3;
                    if (!bl2) break block11;
                }
                if (bl3) {
                    bl5 = bl2;
                    bl4 = bl3;
                } else {
                    stringBuilder.append(' ');
                    bl4 = true;
                    bl5 = bl2;
                }
            }
            bl2 = bl5;
            bl3 = bl4;
        }
    }

    public static StringBuilder b() {
        Serializable serializable = (Stack)e.get();
        serializable = serializable.empty() ? new StringBuilder(8192) : (StringBuilder)serializable.pop();
        return serializable;
    }

    public static boolean c(String string, String[] stringArray) {
        boolean bl = Arrays.binarySearch(stringArray, string) >= 0;
        return bl;
    }

    public static boolean d(String string) {
        if (string != null && string.length() != 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (com.github.catvod.spider.merge.xc.E0.b.e(string.codePointAt(i2))) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean e(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13;
        return bl;
    }

    public static String f(String object, ArrayList object2) {
        Iterator iterator = ((ArrayList)object2).iterator();
        if (!iterator.hasNext()) {
            object = "";
        } else {
            object2 = iterator.next().toString();
            if (!iterator.hasNext()) {
                object = object2;
            } else {
                StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
                com.github.catvod.spider.merge.xc.D0.b.A(stringBuilder);
                stringBuilder.append(object2);
                while (iterator.hasNext()) {
                    object2 = iterator.next();
                    stringBuilder.append((String)object);
                    stringBuilder.append(object2);
                }
                object = com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
            }
        }
        return object;
    }

    public static String g(StringBuilder stringBuilder) {
        com.github.catvod.spider.merge.xc.D0.b.A(stringBuilder);
        String string = stringBuilder.toString();
        if (stringBuilder.length() > 8192) {
            stringBuilder = new StringBuilder(8192);
        } else {
            stringBuilder.delete(0, stringBuilder.length());
        }
        Stack stack = (Stack)e.get();
        stack.push(stringBuilder);
        while (((AbstractCollection)stack).size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static URL h(URL object, String charSequence) {
        Object object2 = d.matcher(charSequence).replaceAll("");
        charSequence = object2;
        if (((String)object2).startsWith("?")) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(((URL)object).getPath());
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object2 = new URL((URL)object, (String)charSequence);
        charSequence = b.matcher(((URL)object2).getFile()).replaceFirst("/");
        object = charSequence;
        if (((URL)object2).getRef() != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append("#");
            ((StringBuilder)object).append(((URL)object2).getRef());
            object = ((StringBuilder)object).toString();
        }
        return new URL(((URL)object2).getProtocol(), ((URL)object2).getHost(), ((URL)object2).getPort(), (String)object);
    }
}

