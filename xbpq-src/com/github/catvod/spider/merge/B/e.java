/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.catvod.crawler.SpiderDebug
 */
package com.github.catvod.spider.merge.B;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.B.f;

public final class e {
    public static char a(int n2, int n3, int n4, f f2) {
        return f2.Q(n2 + n3 + n4);
    }

    public static String b(String string, long l2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(l2);
        return stringBuilder.toString();
    }

    public static String c(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static void d(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        SpiderDebug.log((String)stringBuilder.toString());
    }
}

