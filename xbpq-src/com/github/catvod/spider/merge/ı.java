/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u01c3;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class \u0131 {
    static final String[] \u037f = new String[]{"", SOY.d("5A"), SOY.d("5A72"), SOY.d("5A7271"), SOY.d("5A727156"), SOY.d("5A72715654"), SOY.d("5A7271565457"), SOY.d("5A72715654575A"), SOY.d("5A72715654575A72"), SOY.d("5A72715654575A7271"), SOY.d("5A72715654575A727156"), SOY.d("5A72715654575A72715654"), SOY.d("5A72715654575A7271565457"), SOY.d("5A72715654575A72715654575A"), SOY.d("5A72715654575A72715654575A72"), SOY.d("5A72715654575A72715654575A7271"), SOY.d("5A72715654575A72715654575A727156"), SOY.d("5A72715654575A72715654575A72715654"), SOY.d("5A72715654575A72715654575A7271565457"), SOY.d("5A72715654575A72715654575A72715654575A"), SOY.d("5A72715654575A72715654575A72715654575A72")};
    private static Pattern \u0528 = Pattern.compile(SOY.d("247D795E285901637D440958537978"));
    private static final ThreadLocal<Stack<StringBuilder>> \u0529 = new ThreadLocal<Stack<StringBuilder>>(){

        protected Stack<StringBuilder> \u037f() {
            return new Stack<StringBuilder>();
        }
    };

    public static void \u037f(StringBuilder stringBuilder, String string, boolean bl) {
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
                        if (!\u0131.\u052b(n2)) break block6;
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
                if (!\u0131.\u052d(n2)) {
                    stringBuilder.appendCodePoint(n2);
                    bl5 = true;
                    bl4 = false;
                }
            }
            bl2 = bl5;
            bl3 = bl4;
        }
    }

    public static StringBuilder \u0528() {
        Serializable serializable = \u0529.get();
        serializable = serializable.empty() ? new StringBuilder(8192) : serializable.pop();
        return serializable;
    }

    public static boolean \u0529(String string, String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!stringArray[i2].equals(string)) continue;
            return true;
        }
        return false;
    }

    public static boolean \u052a(String string, String[] stringArray) {
        boolean bl = Arrays.binarySearch(stringArray, string) >= 0;
        return bl;
    }

    public static boolean \u052b(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13 || n2 == 160;
        return bl;
    }

    public static boolean \u052c(String string) {
        if (string != null && string.length() != 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (\u0131.\u052f(string.codePointAt(i2))) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean \u052d(int n2) {
        boolean bl = n2 == 8203 || n2 == 173;
        return bl;
    }

    public static boolean \u052e(String string) {
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

    public static boolean \u052f(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13;
        return bl;
    }

    public static String \u058f(Collection<?> collection, String string) {
        return \u0131.\u0620(collection.iterator(), string);
    }

    public static String \u0620(Iterator<?> iterator, String object) {
        if (!iterator.hasNext()) {
            return "";
        }
        String string = iterator.next().toString();
        if (!iterator.hasNext()) {
            return string;
        }
        object = new \u0528((String)object);
        ((\u0528)object).\u037f(string);
        while (iterator.hasNext()) {
            ((\u0528)object).\u037f(iterator.next());
        }
        return ((\u0528)object).\u0528();
    }

    public static String \u0780(int n2) {
        if (n2 >= 0) {
            Object[] objectArray = \u037f;
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
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(SOY.d("0D3B35021C571727220254151F726F5644"));
        throw illegalArgumentException;
    }

    public static String \u0781(StringBuilder stringBuilder) {
        \u01c3.\u052f(stringBuilder);
        String string = stringBuilder.toString();
        if (stringBuilder.length() > 8192) {
            stringBuilder = new StringBuilder(8192);
        } else {
            stringBuilder.delete(0, stringBuilder.length());
        }
        Stack<StringBuilder> stack = \u0529.get();
        stack.push(stringBuilder);
        while (stack.size() > 8) {
            stack.pop();
        }
        return string;
    }

    /*
     * Loose catch block
     */
    public static String \u0782(String string, String string2) {
        URL uRL = new URL(string);
        return \u0131.\u0783(uRL, string2).toExternalForm();
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

    public static URL \u0783(URL object, String string) {
        Object object2 = string;
        if (string.startsWith(SOY.d("45"))) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((URL)object).getPath());
            ((StringBuilder)object2).append(string);
            object2 = ((StringBuilder)object2).toString();
        }
        object2 = new URL((URL)object, (String)object2);
        string = \u0528.matcher(((URL)object2).getFile()).replaceFirst(SOY.d("55"));
        object = string;
        if (((URL)object2).getRef() != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(SOY.d("59"));
            ((StringBuilder)object).append(((URL)object2).getRef());
            object = ((StringBuilder)object).toString();
        }
        return new URL(((URL)object2).getProtocol(), ((URL)object2).getHost(), ((URL)object2).getPort(), (String)object);
    }

    public static class \u0528 {
        @Nullable
        StringBuilder \u037f = \u0131.\u0528();
        final String \u0528;
        boolean \u0529 = true;

        public \u0528(String string) {
            this.\u0528 = string;
        }

        public \u0528 \u037f(Object object) {
            \u01c3.\u052f(this.\u037f);
            if (!this.\u0529) {
                this.\u037f.append(this.\u0528);
            }
            this.\u037f.append(object);
            this.\u0529 = false;
            return this;
        }

        public String \u0528() {
            String string = \u0131.\u0781(this.\u037f);
            this.\u037f = null;
            return string;
        }
    }
}

