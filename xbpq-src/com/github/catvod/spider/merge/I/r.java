/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.I;

import com.github.catvod.crawler.SpiderDebug;
import java.util.HashMap;

public final class r {
    public static String a(String string, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    public static String b(String string, String string2, String string3, String string4, String string5) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        stringBuilder.append(string5);
        return stringBuilder.toString();
    }

    public static String c(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static StringBuilder d(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder;
    }

    public static HashMap e(String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(string, string2);
        return hashMap;
    }

    public static void f(Exception exception, StringBuilder stringBuilder) {
        stringBuilder.append(exception.getMessage());
        SpiderDebug.log((String)stringBuilder.toString());
    }
}

