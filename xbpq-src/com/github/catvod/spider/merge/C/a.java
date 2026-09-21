/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.A.g;
import com.github.catvod.spider.merge.A.i;
import java.util.Objects;

public final class a {
    public static int a(String string) {
        if (string == null) {
            return 0;
        }
        try {
            int n2 = a.d(string);
            return n2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return 0;
        }
    }

    public static g b(i i2, int n2, int n3) {
        i2.m(n2, n3);
        return new g();
    }

    public static StringBuilder c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        return stringBuilder;
    }

    public static /* synthetic */ int d(String string) {
        Objects.requireNonNull(string, "Name is null");
        if (string.equals("GET")) {
            return 1;
        }
        if (string.equals("PUT")) {
            return 2;
        }
        if (string.equals("POST")) {
            return 3;
        }
        if (string.equals("DELETE")) {
            return 4;
        }
        if (string.equals("HEAD")) {
            return 5;
        }
        if (string.equals("OPTIONS")) {
            return 6;
        }
        if (string.equals("TRACE")) {
            return 7;
        }
        if (string.equals("CONNECT")) {
            return 8;
        }
        if (string.equals("PATCH")) {
            return 9;
        }
        if (string.equals("PROPFIND")) {
            return 10;
        }
        if (string.equals("PROPPATCH")) {
            return 11;
        }
        if (string.equals("MKCOL")) {
            return 12;
        }
        if (string.equals("MOVE")) {
            return 13;
        }
        if (string.equals("COPY")) {
            return 14;
        }
        if (string.equals("LOCK")) {
            return 15;
        }
        if (string.equals("UNLOCK")) {
            return 16;
        }
        throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(string));
    }
}

