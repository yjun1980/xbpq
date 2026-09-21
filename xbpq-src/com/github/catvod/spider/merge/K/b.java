/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.K;

class b {
    public static final boolean a(char c2, char c3, boolean bl) {
        boolean bl2 = true;
        if (c2 == c3) {
            return true;
        }
        if (!bl) {
            return false;
        }
        c2 = Character.toUpperCase(c2);
        c3 = Character.toUpperCase(c3);
        bl = bl2;
        if (c2 != c3) {
            bl = Character.toLowerCase(c2) == Character.toLowerCase(c3) ? bl2 : false;
        }
        return bl;
    }
}

