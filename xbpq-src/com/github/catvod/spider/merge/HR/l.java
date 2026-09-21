/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.d;
import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.xc.F0.h;
import java.util.AbstractCollection;
import java.util.AbstractList;

public class l
extends n {
    public final int a;
    public final int b;
    public final int c;

    public l(int n2, int n3, int n4) {
        this.c = n4;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final boolean a(com.github.catvod.spider.merge.xc.F0.l l2, com.github.catvod.spider.merge.xc.F0.l l3) {
        l2 = (com.github.catvod.spider.merge.xc.F0.l)l3.a;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = bl;
        if (l2 != null) {
            if (l2 instanceof h) {
                bl3 = bl;
            } else {
                int n2 = this.b(l3);
                int n3 = this.b;
                int n4 = this.a;
                if (n4 == 0) {
                    bl3 = bl2;
                    if (n2 == n3) {
                        bl3 = true;
                    }
                    return bl3;
                }
                n3 = n2 - n3;
                bl3 = bl;
                if (n3 * n4 >= 0) {
                    bl3 = bl;
                    if (n3 % n4 == 0) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public final int b(com.github.catvod.spider.merge.xc.F0.l l2) {
        switch (this.c) {
            default: {
                Object object = (com.github.catvod.spider.merge.xc.F0.l)l2.a;
                int n2 = 0;
                int n3 = 0;
                if (object != null) {
                    com.github.catvod.spider.merge.xc.F0.l l3;
                    object.getClass();
                    object = ((AbstractCollection)new d(((com.github.catvod.spider.merge.xc.F0.l)object).A())).iterator();
                    do {
                        n2 = n3;
                        if (!object.hasNext()) break;
                        l3 = (com.github.catvod.spider.merge.xc.F0.l)object.next();
                        n2 = n3;
                        if (l3.d.equals(l2.d)) {
                            n2 = n3 + 1;
                        }
                        n3 = n2;
                    } while (l3 != l2);
                }
                return n2;
            }
            case 2: {
                Cloneable cloneable = (com.github.catvod.spider.merge.xc.F0.l)l2.a;
                int n4 = 0;
                int n5 = 0;
                if (cloneable != null) {
                    cloneable.getClass();
                    cloneable = new d(((com.github.catvod.spider.merge.xc.F0.l)cloneable).A());
                    int n6 = l2.E();
                    while (true) {
                        n4 = n5;
                        if (n6 >= ((AbstractCollection)((Object)cloneable)).size()) break;
                        n4 = n5;
                        if (((com.github.catvod.spider.merge.xc.F0.l)((AbstractList)((Object)cloneable)).get((int)n6)).d.equals(l2.d)) {
                            n4 = n5 + 1;
                        }
                        ++n6;
                        n5 = n4;
                    }
                }
                return n4;
            }
            case 1: {
                int n7;
                com.github.catvod.spider.merge.xc.F0.l l4 = (com.github.catvod.spider.merge.xc.F0.l)l2.a;
                if (l4 == null) {
                    n7 = 0;
                } else {
                    l4.getClass();
                    n7 = ((AbstractCollection)new d(l4.A())).size() - l2.E();
                }
                return n7;
            }
            case 0: 
        }
        return l2.E() + 1;
    }

    public final String c() {
        switch (this.c) {
            default: {
                return "nth-of-type";
            }
            case 2: {
                return "nth-last-of-type";
            }
            case 1: {
                return "nth-last-child";
            }
            case 0: 
        }
        return "nth-child";
    }

    public String toString() {
        int n2 = this.b;
        int n3 = this.a;
        if (n3 == 0) {
            return String.format(":%s(%d)", this.c(), n2);
        }
        if (n2 == 0) {
            return String.format(":%s(%dn)", this.c(), n3);
        }
        return String.format(":%s(%dn%+d)", this.c(), n3, n2);
    }
}

