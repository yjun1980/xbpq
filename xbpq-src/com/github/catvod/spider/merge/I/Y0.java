/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.I;

public final class Y0<T> {
    private final T a;
    private final String b;

    private Y0(T t2, String string) {
        this.a = t2;
        this.b = string;
    }

    public static <T> Y0<T> a(String string) {
        return new Y0<Object>(null, string);
    }

    public static <T> Y0<T> d(T t2) {
        return new Y0<T>(t2, null);
    }

    public final T b() {
        if (this.b == null) {
            return this.a;
        }
        throw new RuntimeException(this.b);
    }

    public final boolean c() {
        boolean bl = this.b == null;
        return bl;
    }
}

