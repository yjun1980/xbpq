package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.merge.cYh;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {
    static final String[] a = {"", cYh.d("47"), cYh.d("4770"), cYh.d("477061"), cYh.d("47706171"), cYh.d("4770617177"), cYh.d("47706171777A"), cYh.d("47706171777A47"), cYh.d("47706171777A4770"), cYh.d("47706171777A477061"), cYh.d("47706171777A47706171"), cYh.d("47706171777A4770617177"), cYh.d("47706171777A47706171777A"), cYh.d("47706171777A47706171777A47"), cYh.d("47706171777A47706171777A4770"), cYh.d("47706171777A47706171777A477061"), cYh.d("47706171777A47706171777A47706171"), cYh.d("47706171777A47706171777A4770617177"), cYh.d("47706171777A47706171777A47706171777A"), cYh.d("47706171777A47706171777A47706171777A47"), cYh.d("47706171777A47706171777A47706171777A4770")};
    private static Pattern b = Pattern.compile(cYh.d("397F69790B741C616D632A754E7B68"));
    private static final ThreadLocal<Stack<StringBuilder>> c = new a();
    public static final /* synthetic */ int d = 0;

    public static StringBuilder a() {
        Stack<StringBuilder> stack = c.get();
        return stack.empty() ? new StringBuilder(8192) : stack.pop();
    }

    public static boolean b(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean c(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!d(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    public static String e(Collection<?> collection, String str) {
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringBuilder a2 = a();
        com.github.catvod.spider.merge.N.a.k(a2);
        Object obj2 = obj;
        while (true) {
            a2.append(obj2);
            if (it.hasNext()) {
                Object next = it.next();
                a2.append(str);
                obj2 = next;
            } else {
                return g(a2);
            }
        }
    }

    public static String f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(cYh.d("103925253F7A0A253225773802707F7167"));
        }
        String[] strArr = a;
        if (i < 21) {
            return strArr[i];
        }
        int min = Math.min(i, 30);
        char[] cArr = new char[min];
        for (int i2 = 0; i2 < min; i2++) {
            cArr[i2] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String g(StringBuilder sb) {
        com.github.catvod.spider.merge.N.a.k(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = c.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static URL h(URL url, String str) {
        if (str.startsWith(cYh.d("58"))) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst(cYh.d("48"));
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + cYh.d("44") + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
