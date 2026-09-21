/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.merge.b0.a;
import com.github.catvod.spider.merge.cYh;
import java.io.Serializable;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

public final class b {
    static final String[] a = new String[]{"", cYh.d("47"), cYh.d("4770"), cYh.d("477061"), cYh.d("47706171"), cYh.d("4770617177"), cYh.d("47706171777A"), cYh.d("47706171777A47"), cYh.d("47706171777A4770"), cYh.d("47706171777A477061"), cYh.d("47706171777A47706171"), cYh.d("47706171777A4770617177"), cYh.d("47706171777A47706171777A"), cYh.d("47706171777A47706171777A47"), cYh.d("47706171777A47706171777A4770"), cYh.d("47706171777A47706171777A477061"), cYh.d("47706171777A47706171777A47706171"), cYh.d("47706171777A47706171777A4770617177"), cYh.d("47706171777A47706171777A47706171777A"), cYh.d("47706171777A47706171777A47706171777A47"), cYh.d("47706171777A47706171777A47706171777A4770")};
    private static Pattern b = Pattern.compile(cYh.d("397F69790B741C616D632A754E7B68"));
    private static final ThreadLocal<Stack<StringBuilder>> c = new a();
    public static final int d = 0;

    public static StringBuilder a() {
        Serializable serializable = c.get();
        serializable = serializable.empty() ? new StringBuilder(8192) : serializable.pop();
        return serializable;
    }

    public static boolean b(String string, String[] stringArray) {
        boolean bl = Arrays.binarySearch(stringArray, string) >= 0;
        return bl;
    }

    public static boolean c(String string) {
        if (string != null && string.length() != 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (com.github.catvod.spider.merge.b0.b.d(string.codePointAt(i2))) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean d(int n2) {
        boolean bl = n2 == 32 || n2 == 9 || n2 == 10 || n2 == 12 || n2 == 13;
        return bl;
    }

    public static String e(Collection<?> object, String string) {
        Iterator<?> iterator = object.iterator();
        if (!iterator.hasNext()) {
            object = "";
        } else {
            object = iterator.next().toString();
            if (iterator.hasNext()) {
                StringBuilder stringBuilder = com.github.catvod.spider.merge.b0.b.a();
                com.github.catvod.spider.merge.N.a.k(stringBuilder);
                while (true) {
                    stringBuilder.append(object);
                    if (!iterator.hasNext()) break;
                    object = iterator.next();
                    stringBuilder.append(string);
                }
                object = com.github.catvod.spider.merge.b0.b.g(stringBuilder);
            }
        }
        return object;
    }

    public static String f(int n2) {
        if (n2 >= 0) {
            Object[] objectArray = a;
            if (n2 < 21) {
                return objectArray[n2];
            }
            int n3 = Math.min(n2, 30);
            objectArray = new char[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                objectArray[n2] = (String)32;
            }
            return String.valueOf((char[])objectArray);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(cYh.d("103925253F7A0A253225773802707F7167"));
        throw illegalArgumentException;
    }

    public static String g(StringBuilder stringBuilder) {
        com.github.catvod.spider.merge.N.a.k(stringBuilder);
        String string = stringBuilder.toString();
        if (stringBuilder.length() > 8192) {
            stringBuilder = new StringBuilder(8192);
        } else {
            stringBuilder.delete(0, stringBuilder.length());
        }
        Stack<StringBuilder> stack = c.get();
        stack.push(stringBuilder);
        while (((AbstractCollection)stack).size() > 8) {
            stack.pop();
        }
        return string;
    }

    public static URL h(URL object, String string) {
        Object object2 = string;
        if (string.startsWith(cYh.d("58"))) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((URL)object).getPath());
            ((StringBuilder)object2).append(string);
            object2 = ((StringBuilder)object2).toString();
        }
        object2 = new URL((URL)object, (String)object2);
        string = b.matcher(((URL)object2).getFile()).replaceFirst(cYh.d("48"));
        object = string;
        if (((URL)object2).getRef() != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(cYh.d("44"));
            ((StringBuilder)object).append(((URL)object2).getRef());
            object = ((StringBuilder)object).toString();
        }
        return new URL(((URL)object2).getProtocol(), ((URL)object2).getHost(), ((URL)object2).getPort(), (String)object);
    }
}

