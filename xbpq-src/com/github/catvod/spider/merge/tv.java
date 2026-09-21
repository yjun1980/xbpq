/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class tv {
    private static Pattern S;
    private static final ThreadLocal<Stack<StringBuilder>> T4;
    static final String[] l8;

    static {
        l8 = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
        S = Pattern.compile("^/((\\.{1,2}/)+)");
        T4 = new ThreadLocal<Stack<StringBuilder>>(){

            protected Stack<StringBuilder> l8() {
                return new Stack<StringBuilder>();
            }
        };
    }

    public static String A(int n2) {
        if (n2 >= 0) {
            Object[] objectArray = l8;
            if (n2 < objectArray.length) {
                return objectArray[n2];
            }
            int n3 = Math.min(n2, 30);
            objectArray = new char[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                objectArray[n2] = (String)32;
            }
            return String.valueOf((char[])objectArray);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("width must be > 0");
        throw illegalArgumentException;
    }

    public static boolean HM(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13;
        return bl;
    }

    public static boolean N(String string) {
        if (string != null && string.length() != 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (Character.isDigit(string.codePointAt(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean OL(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13 || n2 == 160;
        return bl;
    }

    public static StringBuilder S() {
        Serializable serializable = T4.get();
        serializable = serializable.empty() ? new StringBuilder(8192) : serializable.pop();
        return serializable;
    }

    public static boolean T4(String string, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!stringArray[i2].equals(string)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(String string, String[] stringArray) {
        boolean bl = Arrays.binarySearch(stringArray, string) >= 0;
        return bl;
    }

    public static String cD(StringBuilder stringBuilder) {
        Rc.HM(stringBuilder);
        String string = stringBuilder.toString();
        if (stringBuilder.length() > 8192) {
            stringBuilder = new StringBuilder(8192);
        } else {
            stringBuilder.delete(0, stringBuilder.length());
        }
        Stack<StringBuilder> stack = T4.get();
        stack.push(stringBuilder);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static URL hR(URL object, String string) {
        Object object2 = string;
        if (string.startsWith("?")) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((URL)object).getPath());
            ((StringBuilder)object2).append(string);
            object2 = ((StringBuilder)object2).toString();
        }
        object2 = new URL((URL)object, (String)object2);
        string = S.matcher(((URL)object2).getFile()).replaceFirst("/");
        object = string;
        if (((URL)object2).getRef() != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("#");
            ((StringBuilder)object).append(((URL)object2).getRef());
            object = ((StringBuilder)object).toString();
        }
        return new URL(((URL)object2).getProtocol(), ((URL)object2).getHost(), ((URL)object2).getPort(), (String)object);
    }

    public static boolean l(String string) {
        if (string != null && string.length() != 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (tv.HM(string.codePointAt(i2))) continue;
                return false;
            }
        }
        return true;
    }

    public static void l8(StringBuilder stringBuilder, String string, boolean bl) {
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
                        if (!tv.OL(n2)) break block6;
                        if (!bl) break block7;
                        bl5 = bl2;
                        bl4 = bl3;
                        if (!bl2) break block8;
                    }
                    if (bl3) {
                        bl5 = bl2;
                        bl4 = bl3;
                    } else {
                        stringBuilder.append(' ');
                        bl4 = true;
                        bl5 = bl2;
                    }
                    break block8;
                }
                bl5 = bl2;
                bl4 = bl3;
                if (!tv.tT(n2)) {
                    stringBuilder.appendCodePoint(n2);
                    bl5 = true;
                    bl4 = false;
                }
            }
            bl2 = bl5;
            bl3 = bl4;
        }
    }

    public static String n(Collection<?> collection, String string) {
        return tv.v(collection.iterator(), string);
    }

    /*
     * Loose catch block
     */
    public static String s(String string, String string2) {
        URL uRL = new URL(string);
        return tv.hR(uRL, string2).toExternalForm();
        {
            catch (MalformedURLException malformedURLException) {
                return "";
            }
        }
        catch (MalformedURLException malformedURLException) {
            Object object = new URL(string2);
            object = ((URL)object).toExternalForm();
            return object;
        }
    }

    public static boolean tT(int n2) {
        boolean bl = n2 == 8203 || n2 == 173;
        return bl;
    }

    public static String v(Iterator<?> iterator, String object) {
        if (!iterator.hasNext()) {
            return "";
        }
        String string = iterator.next().toString();
        if (!iterator.hasNext()) {
            return string;
        }
        object = new ut((String)object);
        ((ut)object).l8(string);
        while (iterator.hasNext()) {
            ((ut)object).l8(iterator.next());
        }
        return ((ut)object).S();
    }

    public static class ut {
        final String S;
        boolean T4 = true;
        @Nullable
        StringBuilder l8 = tv.S();

        public ut(String string) {
            this.S = string;
        }

        public String S() {
            String string = tv.cD(this.l8);
            this.l8 = null;
            return string;
        }

        public ut l8(Object object) {
            Rc.HM(this.l8);
            if (!this.T4) {
                this.l8.append(this.S);
            }
            this.l8.append(object);
            this.T4 = false;
            return this;
        }
    }
}

