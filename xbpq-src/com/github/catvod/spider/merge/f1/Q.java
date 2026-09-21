/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.f1;

import com.github.catvod.spider.merge.c1.d;
import com.github.catvod.spider.merge.d1.c;

public final class Q {
    private String a;
    private int b = 0;

    public Q(String string) {
        d.j(string);
        this.a = string;
    }

    public static String o(String object) {
        StringBuilder stringBuilder = c.b();
        object = ((String)object).toCharArray();
        int n2 = ((Object)object).length;
        Object object2 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object3 = object[i2];
            if (object3 != 92 || object2 == 92) {
                stringBuilder.append((char)object3);
            }
            object2 = object3;
        }
        return c.i(stringBuilder);
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
                                    if (this.i()) break block20;
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
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Did not find balanced marker at '");
                stringBuilder.append(string);
                stringBuilder.append("'");
                d.c(stringBuilder.toString());
                throw null;
            }
            n2 = c4;
            n3 = n8;
            n4 = n7;
            n5 = n6;
            bl3 = bl4;
        }
    }

    public final String b() {
        String string;
        int n2 = this.a.indexOf(")", this.b);
        if (n2 != -1) {
            string = this.a.substring(this.b, n2);
            n2 = this.b;
            this.b = string.length() + n2;
        } else {
            string = this.n();
        }
        this.j(")");
        return string;
    }

    public final char c() {
        String string = this.a;
        int n2 = this.b;
        this.b = n2 + 1;
        return string.charAt(n2);
    }

    public final void d(String string) {
        if (this.k(string)) {
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

    public final String e() {
        int n2 = this.b;
        while (!this.i()) {
            if (!this.m()) {
                char c2;
                boolean bl = this.i();
                char c3 = '\u0000';
                if (bl) {
                    c2 = c3;
                } else {
                    int n3 = 0;
                    while (true) {
                        c2 = c3;
                        if (n3 >= 2) break;
                        c2 = (new char[]{'-', '_'})[n3];
                        if (this.a.charAt(this.b) == c2) {
                            c2 = '\u0001';
                            break;
                        }
                        ++n3;
                    }
                }
                if (c2 == '\u0000') break;
            }
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final String f() {
        int n2 = this.b;
        while (!this.i() && (this.m() || this.l("*|", "|", "_", "-"))) {
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final String g(String ... stringArray) {
        int n2 = this.b;
        while (!this.i() && !this.l(stringArray)) {
            ++this.b;
        }
        return this.a.substring(n2, this.b);
    }

    public final boolean h() {
        boolean bl;
        boolean bl2 = false;
        while (bl = !this.i() && c.e(this.a.charAt(this.b))) {
            ++this.b;
            bl2 = true;
        }
        return bl2;
    }

    public final boolean i() {
        boolean bl = this.a.length() - this.b == 0;
        return bl;
    }

    public final boolean j(String string) {
        if (this.k(string)) {
            int n2 = this.b;
            this.b = string.length() + n2;
            return true;
        }
        return false;
    }

    public final boolean k(String string) {
        return this.a.regionMatches(true, this.b, string, 0, string.length());
    }

    public final boolean l(String ... stringArray) {
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.k(stringArray[i2])) continue;
            return true;
        }
        return false;
    }

    public final boolean m() {
        boolean bl = !this.i() && Character.isLetterOrDigit(this.a.charAt(this.b));
        return bl;
    }

    public final String n() {
        String string = this.a.substring(this.b);
        this.b = this.a.length();
        return string;
    }

    public final String toString() {
        return this.a.substring(this.b);
    }
}

