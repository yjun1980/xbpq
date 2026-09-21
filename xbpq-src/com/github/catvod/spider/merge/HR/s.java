/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.HR;

import com.github.catvod.spider.merge.HR.n;
import com.github.catvod.spider.merge.HR.t;
import com.github.catvod.spider.merge.xc.F0.l;

public final class s
extends t {
    public final int b;

    public s(n n2, int n3) {
        this.b = n3;
        switch (n3) {
            default: {
                this.a = n2;
                return;
            }
            case 4: {
                this.a = n2;
                return;
            }
            case 3: {
                super();
                this.a = n2;
                return;
            }
            case 2: {
                super();
                this.a = n2;
                return;
            }
            case 1: 
        }
        super();
        this.a = n2;
    }

    @Override
    public final boolean a(l l2, l l3) {
        boolean bl;
        switch (this.b) {
            default: {
                boolean bl2;
                boolean bl3 = false;
                if (l2 == l3) {
                    bl2 = bl3;
                } else {
                    l3 = l3.K();
                    while (true) {
                        bl2 = bl3;
                        if (l3 == null) break;
                        if (this.a.a(l2, l3)) {
                            bl2 = true;
                            break;
                        }
                        l3 = l3.K();
                    }
                }
                return bl2;
            }
            case 3: {
                boolean bl4;
                boolean bl5 = false;
                if (l2 == l3) {
                    bl4 = bl5;
                } else {
                    l3 = (l)l3.a;
                    while (true) {
                        bl4 = bl5;
                        if (l3 == null) break;
                        if (this.a.a(l2, l3)) {
                            bl4 = true;
                            break;
                        }
                        if (l3 == l2) {
                            bl4 = bl5;
                            break;
                        }
                        l3 = (l)l3.a;
                    }
                }
                return bl4;
            }
            case 2: {
                return this.a.a(l2, l3) ^ true;
            }
            case 1: {
                boolean bl6;
                boolean bl7 = false;
                if (l2 == l3) {
                    bl6 = bl7;
                } else {
                    l3 = l3.K();
                    bl6 = bl7;
                    if (l3 != null) {
                        bl6 = bl7;
                        if (this.a.a(l2, l3)) {
                            bl6 = true;
                        }
                    }
                }
                return bl6;
            }
            case 0: 
        }
        boolean bl8 = false;
        if (l2 == l3) {
            bl = bl8;
        } else {
            l3 = (l)l3.a;
            bl = bl8;
            if (l3 != null) {
                bl = bl8;
                if (this.a.a(l2, l3)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public final String toString() {
        switch (this.b) {
            default: {
                return String.format("%s ~ ", this.a);
            }
            case 3: {
                return String.format("%s ", this.a);
            }
            case 2: {
                return String.format(":not(%s)", this.a);
            }
            case 1: {
                return String.format("%s + ", this.a);
            }
            case 0: 
        }
        return String.format("%s > ", this.a);
    }
}

