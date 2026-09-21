/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.n;

final class s
extends Enum<s> {
    public static final /* enum */ s c;
    public static final /* enum */ s d;
    private static final s[] e;

    static {
        s s2;
        s s3;
        c = s3 = new s();
        d = s2 = new s();
        e = new s[]{s3, s2};
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    public static s[] values() {
        return (s[])e.clone();
    }
}

