/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.o0;

import com.github.catvod.spider.merge.xc.n0.a;
import com.github.catvod.spider.merge.xc.o0.c;
import java.util.Iterator;

public class b
implements Iterable,
a {
    public final int a;
    public final int b;
    public final int c;

    public b(int n2, int n3, int n4) {
        block12: {
            block13: {
                block16: {
                    block15: {
                        block14: {
                            if (n4 == 0) break block12;
                            if (n4 == Integer.MIN_VALUE) break block13;
                            this.a = n2;
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
                    this.b = n3;
                    this.c = n4;
                    return;
                }
                throw new IllegalArgumentException("Step is zero.");
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof b)) return false;
        if (this.isEmpty()) {
            if (((b)object).isEmpty()) return true;
        }
        object = (b)object;
        int n2 = ((b)object).a;
        if (this.a != n2) return false;
        if (this.b != ((b)object).b) return false;
        if (this.c != ((b)object).c) return false;
        return true;
    }

    public int hashCode() {
        int n2 = this.isEmpty() ? -1 : (this.a * 31 + this.b) * 31 + this.c;
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isEmpty() {
        int n2 = this.c;
        boolean bl = false;
        int n3 = this.b;
        int n4 = this.a;
        if (n2 > 0) {
            if (n4 <= n3) return bl;
            return true;
        }
        if (n4 >= n3) return bl;
        return true;
    }

    public final Iterator iterator() {
        int n2 = this.c;
        return new c(this.a, this.b, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        StringBuilder stringBuilder;
        int n2 = this.b;
        int n3 = this.a;
        int n4 = this.c;
        if (n4 > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            stringBuilder.append("..");
            stringBuilder.append(n2);
            stringBuilder.append(" step ");
            stringBuilder.append(n4);
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append(" downTo ");
        stringBuilder.append(n2);
        stringBuilder.append(" step ");
        stringBuilder.append(-n4);
        return stringBuilder.toString();
    }
}

