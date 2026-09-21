/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.J0;

import com.github.catvod.spider.merge.R0.e;

public final class f {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(String string) {
        int n2;
        boolean bl = e.c(string);
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            return false;
        }
        char[] cArray = string.toCharArray();
        int n3 = cArray.length;
        int n4 = cArray[0] != '-' && cArray[0] != '+' ? 0 : 1;
        int n5 = n4 + 1;
        if (n3 > n5 && cArray[n4] == '0' && (n2 = !e.c(string) && string.indexOf(46, 0) >= 0 ? 1 : 0) == 0) {
            if (cArray[n5] != 'x' && cArray[n5] != 'X') {
                if (Character.isDigit(cArray[n5])) {
                    n4 = n5;
                    while (n4 < cArray.length) {
                        if (cArray[n4] < '0') return false;
                        if (cArray[n4] > '7') return false;
                        ++n4;
                    }
                    return true;
                }
            } else {
                n4 = n2 = n4 + 2;
                if (n2 == n3) {
                    return false;
                }
                while (n4 < cArray.length) {
                    if (!(cArray[n4] >= '0' && cArray[n4] <= '9' || cArray[n4] >= 'a' && cArray[n4] <= 'f')) {
                        if (cArray[n4] < 'A') return false;
                        if (cArray[n4] > 'F') return false;
                    }
                    ++n4;
                }
                return true;
            }
        }
        int n6 = n3 - 1;
        int n7 = 0;
        bl = false;
        n3 = 0;
        n2 = 0;
        n5 = n4;
        while (true) {
            if (n5 >= n6 && (n5 >= n6 + 1 || n7 == 0 || bl)) {
                if (n5 < cArray.length) {
                    if (cArray[n5] >= '0' && cArray[n5] <= '9') {
                        return true;
                    }
                    boolean bl4 = bl3;
                    if (cArray[n5] == 'e') return bl4;
                    if (cArray[n5] == 'E') {
                        return bl3;
                    }
                    if (cArray[n5] == '.') {
                        if (n2 != 0) return false;
                        if (n3 == 0) return bl;
                        return false;
                    }
                    if (n7 == 0) {
                        if (cArray[n5] == 'd') return bl;
                        if (cArray[n5] == 'D') return bl;
                        if (cArray[n5] == 'f') return bl;
                        if (cArray[n5] == 'F') {
                            return bl;
                        }
                    }
                    if (cArray[n5] != 'l') {
                        if (cArray[n5] != 'L') return false;
                    }
                    bl4 = bl3;
                    if (!bl) return bl4;
                    bl4 = bl3;
                    if (n3 != 0) return bl4;
                    bl4 = bl3;
                    if (n2 != 0) return bl4;
                    return true;
                }
                boolean bl5 = bl2;
                if (n7 != 0) return bl5;
                bl5 = bl2;
                if (!bl) return bl5;
                return true;
            }
            if (cArray[n5] >= '0' && cArray[n5] <= '9') {
                n4 = 0;
                bl = true;
            } else if (cArray[n5] == '.') {
                if (n2 != 0) return false;
                if (n3 != 0) return false;
                n2 = 1;
                n4 = n7;
            } else if (cArray[n5] != 'e' && cArray[n5] != 'E') {
                if (cArray[n5] != '+') {
                    if (cArray[n5] != '-') return false;
                }
                if (n7 == 0) {
                    return false;
                }
                n4 = 0;
                bl = false;
            } else {
                if (n3 != 0) {
                    return false;
                }
                if (!bl) {
                    return false;
                }
                n4 = 1;
                n3 = 1;
            }
            ++n5;
            n7 = n4;
        }
    }
}

