/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.Bk;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.xc.e0.g;
import java.util.HashMap;

public abstract class m {
    public static int a(String string, int n2, int n3) {
        return (string.hashCode() + n2) * n3;
    }

    public static /* synthetic */ AssertionError b(String string, AssertionError assertionError) {
        try {
            assertionError = (AssertionError)AssertionError.class.getDeclaredConstructor(String.class, Throwable.class).newInstance(string, assertionError);
            return assertionError;
        }
        catch (Exception exception) {
            return new AssertionError((Object)string);
        }
    }

    public static String c(int n2, String charSequence) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(n2);
        return ((StringBuilder)charSequence).toString();
    }

    public static String d(String string, int n2, int n3) {
        return string.substring(n3, string.length() - n2);
    }

    public static String e(String charSequence, long l2) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(l2);
        return ((StringBuilder)charSequence).toString();
    }

    public static String f(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String g(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static String h(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static StringBuilder i(String charSequence, String string, String string2) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(string2);
        return charSequence;
    }

    public static HashMap j(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        return hashMap;
    }

    public static HashMap k(String string, String string2, String string3, String string4) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        hashMap.put(string3, string4);
        return hashMap;
    }

    public static /* synthetic */ void l(g g2) {
        if (g2 == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void m(Exception exception, StringBuilder stringBuilder) {
        stringBuilder.append(exception.getMessage());
        SpiderDebug.log((String)stringBuilder.toString());
    }

    public static /* synthetic */ void n(Object object) {
        if (object == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static void o(String charSequence, String string) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(string);
        SpiderDebug.log((String)((StringBuilder)charSequence).toString());
    }

    public static void p(Throwable throwable, StringBuilder stringBuilder) {
        stringBuilder.append(throwable.getMessage());
        SpiderDebug.log((String)stringBuilder.toString());
    }

    public static String q(String charSequence, String string) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(string);
        return ((StringBuilder)charSequence).toString();
    }

    public static String r(String charSequence, String string, String string2) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }
}

