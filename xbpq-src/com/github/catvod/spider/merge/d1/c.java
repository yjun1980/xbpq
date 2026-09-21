/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.d1;

import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.b;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

public final class c {
    static final String[] a = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final Pattern d = Pattern.compile("[\\x00-\\x1f]*");
    private static final ThreadLocal<Stack<StringBuilder>> e = new b();
    public static final int f = 0;

    public static void a(StringBuilder stringBuilder, String string, boolean bl) {
        int n2;
        int n3 = string.length();
        boolean bl2 = false;
        boolean bl3 = false;
        for (int i2 = 0; i2 < n3; i2 += Character.charCount(n2)) {
            boolean bl4;
            boolean bl5;
            block8: {
                block6: {
                    block7: {
                        n2 = string.codePointAt(i2);
                        bl5 = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13 || n2 == 160;
                        if (!bl5) break block6;
                        if (!bl) break block7;
                        bl4 = bl2;
                        bl5 = bl3;
                        if (!bl2) break block8;
                    }
                    if (bl3) {
                        bl4 = bl2;
                        bl5 = bl3;
                    } else {
                        stringBuilder.append(' ');
                        bl5 = true;
                        bl4 = bl2;
                    }
                    break block8;
                }
                boolean bl6 = n2 == 8203 || n2 == 173;
                bl4 = bl2;
                bl5 = bl3;
                if (!bl6) {
                    stringBuilder.appendCodePoint(n2);
                    bl4 = true;
                    bl5 = false;
                }
            }
            bl2 = bl4;
            bl3 = bl5;
        }
    }

    public static StringBuilder b() {
        Serializable serializable = e.get();
        serializable = serializable.empty() ? new StringBuilder(8192) : serializable.pop();
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
                if (com.github.catvod.spider.merge.d1.c.e(string.codePointAt(i2))) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean e(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13;
        return bl;
    }

    public static String f(Collection<?> object, String string) {
        Iterator<?> iterator = object.iterator();
        if (!iterator.hasNext()) {
            object = "";
        } else {
            object = iterator.next().toString();
            if (iterator.hasNext()) {
                StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
                com.github.catvod.spider.merge.c1.d.j(stringBuilder);
                while (true) {
                    stringBuilder.append(object);
                    if (!iterator.hasNext()) break;
                    object = iterator.next();
                    stringBuilder.append(string);
                }
                object = com.github.catvod.spider.merge.d1.c.i(stringBuilder);
            }
        }
        return object;
    }

    public static String g(String string) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.d1.c.b();
        com.github.catvod.spider.merge.d1.c.a(stringBuilder, string, false);
        return com.github.catvod.spider.merge.d1.c.i(stringBuilder);
    }

    public static String h(int n2, int n3) {
        boolean bl = true;
        int n4 = 0;
        boolean bl2 = n2 >= 0;
        com.github.catvod.spider.merge.c1.d.g(bl2, "width must be >= 0");
        bl2 = n3 >= -1 ? bl : false;
        com.github.catvod.spider.merge.c1.d.f(bl2);
        int n5 = n2;
        if (n3 != -1) {
            n5 = Math.min(n2, n3);
        }
        Object[] objectArray = a;
        if (n5 < 21) {
            return objectArray[n5];
        }
        objectArray = new char[n5];
        for (n2 = n4; n2 < n5; ++n2) {
            objectArray[n2] = (String)32;
        }
        return String.valueOf((char[])objectArray);
    }

    public static String i(StringBuilder stringBuilder) {
        com.github.catvod.spider.merge.c1.d.j(stringBuilder);
        String string = stringBuilder.toString();
        if (stringBuilder.length() > 8192) {
            stringBuilder = new StringBuilder(8192);
        } else {
            stringBuilder.delete(0, stringBuilder.length());
        }
        Stack<StringBuilder> stack = e.get();
        stack.push(stringBuilder);
        while (((AbstractCollection)stack).size() > 8) {
            stack.pop();
        }
        return string;
    }

    /*
     * Loose catch block
     */
    public static String j(String string, String object) {
        String string2 = com.github.catvod.spider.merge.d1.c.l(string);
        string = com.github.catvod.spider.merge.d1.c.l((String)object);
        object = new URL(string2);
        return com.github.catvod.spider.merge.d1.c.k((URL)object, string).toExternalForm();
        {
            catch (MalformedURLException malformedURLException) {
                if (!c.matcher(string).find()) {
                    string = "";
                }
                return string;
            }
        }
        catch (MalformedURLException malformedURLException) {
            Object object2 = new URL(string);
            object2 = ((URL)object2).toExternalForm();
            return object2;
        }
    }

    public static URL k(URL object, String charSequence) {
        Object object2 = com.github.catvod.spider.merge.d1.c.l((String)charSequence);
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
            object = r.d((String)charSequence, "#");
            ((StringBuilder)object).append(((URL)object2).getRef());
            object = ((StringBuilder)object).toString();
        }
        return new URL(((URL)object2).getProtocol(), ((URL)object2).getHost(), ((URL)object2).getPort(), (String)object);
    }

    private static String l(String string) {
        return d.matcher(string).replaceAll("");
    }
}

