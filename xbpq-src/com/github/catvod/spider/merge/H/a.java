/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.H.b;
import com.github.catvod.spider.merge.cYh;
import java.util.Iterator;

public class a
implements Iterable<Integer> {
    private final int c;
    private final int d;
    private final int e;

    public a(int n2, int n3, int n4) {
        block12: {
            block13: {
                block16: {
                    block15: {
                        block14: {
                            if (n4 == 0) break block12;
                            if (n4 == Integer.MIN_VALUE) break block13;
                            this.c = n2;
                            if (n4 <= 0) break block14;
                            if (n2 < n3) {
                                int n5 = n3 % n4;
                                if (n5 < 0) {
                                    n5 += n4;
                                }
                                if ((n2 %= n4) < 0) {
                                    n2 += n4;
                                }
                                n2 = (n5 - n2) % n4;
                                if (n2 < 0) {
                                    n2 += n4;
                                }
                                n3 -= n2;
                            }
                            break block15;
                        }
                        if (n4 >= 0) break block16;
                        if (n2 > n3) {
                            int n6 = -n4;
                            if ((n2 %= n6) < 0) {
                                n2 += n6;
                            }
                            int n7 = n3 % n6;
                            if (n7 < 0) {
                                n7 += n6;
                            }
                            n2 = (n2 - n7) % n6;
                            if (n2 < 0) {
                                n2 += n6;
                            }
                            n3 += n2;
                        }
                    }
                    this.d = n3;
                    this.e = n4;
                    return;
                }
                throw new IllegalArgumentException(cYh.d("34242421773314703B34253549"));
            }
            throw new IllegalArgumentException(cYh.d("34242421773712233571353F47373334362E022261253F3B0970083F23742A190F0E011B2B05047123354731373E3E3E473F3734253C0B3F36713834473E2436362E0E3F2F7F"));
        }
        throw new IllegalArgumentException(cYh.d("34242421773712233571353F473E2E3F7A2002222E7F"));
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof a)) return false;
        if (this.isEmpty()) {
            if (((a)object).isEmpty()) return true;
        }
        int n2 = this.c;
        object = (a)object;
        if (n2 != ((a)object).c) return false;
        if (this.d != ((a)object).d) return false;
        if (this.e != ((a)object).e) return false;
        return true;
    }

    public int hashCode() {
        int n2 = this.isEmpty() ? -1 : (this.c * 31 + this.d) * 31 + this.e;
        return n2;
    }

    public boolean isEmpty() {
        int n2 = this.e;
        boolean bl = true;
        if (!(n2 > 0 ? this.c > this.d : this.c < this.d)) {
            bl = false;
        }
        return bl;
    }

    @Override
    public final Iterator iterator() {
        return new b(this.c, this.d, this.e);
    }

    public String toString() {
        StringBuilder stringBuilder;
        int n2 = this.e;
        String string = cYh.d("47233534277A");
        if (n2 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(cYh.d("497E"));
            stringBuilder.append(this.d);
            stringBuilder.append(string);
            n2 = this.e;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(cYh.d("47342E26390E0870"));
            stringBuilder.append(this.d);
            stringBuilder.append(string);
            n2 = -this.e;
        }
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

