/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.G0;

import com.github.catvod.spider.merge.Bk.m;
import com.github.catvod.spider.merge.xc.D0.c;
import com.github.catvod.spider.merge.xc.E0.b;

public final class O {
    public final String a;
    public int b = 0;

    public O(String string) {
        com.github.catvod.spider.merge.xc.D0.b.A(string);
        this.a = string;
    }

    public static String m(String object) {
        StringBuilder stringBuilder = com.github.catvod.spider.merge.xc.E0.b.b();
        object = ((String)object).toCharArray();
        int n2 = ((Object)object).length;
        Object object2 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object3 = object[i2];
            if (object3 == 92) {
                if (object2 == 92) {
                    stringBuilder.append((char)object3);
                }
            } else {
                stringBuilder.append((char)object3);
            }
            object2 = object3;
        }
        return com.github.catvod.spider.merge.xc.E0.b.g(stringBuilder);
    }

    public final String a(char c2, char c3) {
        int n2 = 0;
        boolean bl = false;
        boolean bl2 = false;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        boolean bl3 = false;
        while (true) {
            boolean bl4;
            int n6;
            int n7;
            int n8;
            char c4;
            block25: {
                block20: {
                    block22: {
                        boolean bl5;
                        int n9;
                        int n10;
                        boolean bl6;
                        boolean bl7;
                        block24: {
                            block21: {
                                boolean bl8;
                                boolean bl9;
                                block23: {
                                    if (this.g()) break block20;
                                    c4 = this.c();
                                    if (n2 == 92) break block21;
                                    if (c4 == '\'' && c4 != c2 && !bl) {
                                        bl9 = bl2 ^ true;
                                        bl8 = bl;
                                    } else {
                                        bl8 = bl;
                                        bl9 = bl2;
                                        if (c4 == '\"') {
                                            bl8 = bl;
                                            bl9 = bl2;
                                            if (c4 != c2) {
                                                bl8 = bl;
                                                bl9 = bl2;
                                                if (!bl2) {
                                                    bl8 = bl ^ true;
                                                    bl9 = bl2;
                                                }
                                            }
                                        }
                                    }
                                    bl = bl8;
                                    bl2 = bl9;
                                    n8 = n3;
                                    n7 = n4;
                                    n6 = n5;
                                    bl4 = bl3;
                                    if (bl9) break block22;
                                    bl = bl8;
                                    bl2 = bl9;
                                    n8 = n3;
                                    n7 = n4;
                                    n6 = n5++;
                                    bl4 = bl3;
                                    if (bl8) break block22;
                                    if (!bl3) break block23;
                                    bl = bl8;
                                    bl2 = bl9;
                                    n8 = n3;
                                    n7 = n4;
                                    n6 = n5;
                                    bl4 = bl3;
                                    break block22;
                                }
                                if (c4 == c2) {
                                    bl7 = bl8;
                                    bl6 = bl9;
                                    n10 = n3;
                                    n9 = n5;
                                    bl5 = bl3;
                                    if (n3 == -1) {
                                        n10 = this.b;
                                        bl7 = bl8;
                                        bl6 = bl9;
                                        n9 = n5;
                                        bl5 = bl3;
                                    }
                                } else {
                                    bl7 = bl8;
                                    bl6 = bl9;
                                    n10 = n3;
                                    n9 = n5;
                                    bl5 = bl3;
                                    if (c4 == c3) {
                                        n9 = n5 - 1;
                                        bl7 = bl8;
                                        bl6 = bl9;
                                        n10 = n3;
                                        bl5 = bl3;
                                    }
                                }
                                break block24;
                            }
                            if (c4 == 'Q') {
                                bl5 = true;
                                bl7 = bl;
                                bl6 = bl2;
                                n10 = n3;
                                n9 = n5;
                            } else {
                                bl7 = bl;
                                bl6 = bl2;
                                n10 = n3;
                                n9 = n5;
                                bl5 = bl3;
                                if (c4 == 'E') {
                                    bl5 = false;
                                    n9 = n5;
                                    n10 = n3;
                                    bl6 = bl2;
                                    bl7 = bl;
                                }
                            }
                        }
                        bl = bl7;
                        bl2 = bl6;
                        n8 = n10;
                        n7 = n4;
                        n6 = n9;
                        bl4 = bl5;
                        if (n9 > 0) {
                            bl = bl7;
                            bl2 = bl6;
                            n8 = n10;
                            n7 = n4;
                            n6 = n9;
                            bl4 = bl5;
                            if (n2 != 0) {
                                n7 = this.b;
                                bl4 = bl5;
                                n6 = n9;
                                n8 = n10;
                                bl2 = bl6;
                                bl = bl7;
                            }
                        }
                    }
                    if (n6 > 0) break block25;
                    n5 = n6;
                    n4 = n7;
                    n3 = n8;
                }
                String string = n4 >= 0 ? this.a.substring(n3, n4) : "";
                if (n5 <= 0) {
                    return string;
                }
                throw new c(m.r("Did not find balanced marker at '", string, "'"));
            }
            n2 = c4;
            n3 = n8;
            n4 = n7;
            n5 = n6;
            bl3 = bl4;
        }
    }

    public final String b() {
        int n2 = this.b;
        String string = this.a;
        if ((n2 = string.indexOf(")", n2)) != -1) {
            string = string.substring(this.b, n2);
            n2 = this.b;
            this.b = string.length() + n2;
        } else {
            string = this.l();
        }
        this.h(")");
        return string;
    }

    public final char c() {
        int n2 = this.b;
        this.b = n2 + 1;
        return this.a.charAt(n2);
    }

    public final void d(String string) {
        if (this.i(string)) {
            int n2;
            int n3;
            int n4 = string.length();
            if (n4 <= (n3 = this.a.length()) - (n2 = this.b)) {
                this.b = n2 + n4;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String e() {
        int n2 = this.b;
        while (true) {
            block5: {
                boolean bl = this.g();
                String string = this.a;
                if (bl) return string.substring(n2, this.b);
                if (!this.k()) {
                    if (this.g()) {
                        return string.substring(n2, this.b);
                    }
                    int n3 = 0;
                    while (n3 < 2) {
                        char c2 = (new char[]{'-', '_'})[n3];
                        if (string.charAt(this.b) != c2) {
                            ++n3;
                            continue;
                        }
                        break block5;
                    }
                    return string.substring(n2, this.b);
                }
            }
            ++this.b;
        }
    }

    public final boolean f() {
        boolean bl = false;
        while (!this.g() && com.github.catvod.spider.merge.xc.E0.b.e(this.a.charAt(this.b))) {
            ++this.b;
            bl = true;
        }
        return bl;
    }

    public final boolean g() {
        boolean bl = this.a.length() - this.b == 0;
        return bl;
    }

    public final boolean h(String string) {
        if (this.i(string)) {
            int n2 = this.b;
            this.b = string.length() + n2;
            return true;
        }
        return false;
    }

    public final boolean i(String string) {
        int n2 = this.b;
        int n3 = string.length();
        return this.a.regionMatches(true, n2, string, 0, n3);
    }

    public final boolean j(String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.i(stringArray[i2])) continue;
            return true;
        }
        return false;
    }

    public final boolean k() {
        boolean bl = !this.g() && Character.isLetterOrDigit(this.a.charAt(this.b));
        return bl;
    }

    public final String l() {
        int n2 = this.b;
        String string = this.a;
        String string2 = string.substring(n2);
        this.b = string.length();
        return string2;
    }

    public final String toString() {
        return this.a.substring(this.b);
    }
}

