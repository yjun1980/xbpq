/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.Lk;
import com.github.catvod.spider.merge.sB;

public class uM {
    public static void S(Lk lk, A0 a02) {
        A0 a03 = a02;
        int n2 = 0;
        while (a03 != null) {
            int n3;
            A0 a04 = a03.rD();
            lk.S(a03, n2);
            A0 a05 = a03;
            if (a04 != null) {
                a05 = a03;
                if (!a03.uS()) {
                    a05 = a04.N(a03.Ws());
                }
            }
            a03 = a05;
            if (a05.HM() > 0) {
                a03 = a05.N(0);
                continue;
            }
            for (n3 = n2++; a03.eD() == null && n3 > 0; --n3) {
                lk.l8(a03, n3);
                a03 = a03.rD();
            }
            lk.l8(a03, n3);
            if (a03 == a02) break;
            a03 = a03.eD();
            n2 = n3;
        }
    }

    public static sB.aA l8(sB sB2, A0 a02) {
        Object object = a02;
        int n2 = 0;
        while (object != null) {
            Object object2;
            int n3;
            A0 a03;
            block19: {
                block18: {
                    sB.aA aA2 = sB2.S((A0)object, n2);
                    if (aA2 == sB.aA.OL) {
                        return aA2;
                    }
                    a03 = object;
                    n3 = n2;
                    object2 = aA2;
                    if (aA2 == sB.aA.l8) {
                        a03 = object;
                        n3 = n2++;
                        object2 = aA2;
                        if (object.HM() > 0) {
                            object = object.N(0);
                            continue;
                        }
                    }
                    while (a03.eD() == null && n3 > 0) {
                        block17: {
                            block16: {
                                aA2 = sB.aA.l8;
                                if (object2 == aA2) break block16;
                                object = object2;
                                if (object2 != sB.aA.S) break block17;
                            }
                            object2 = sB2.l8(a03, n3);
                            object = object2;
                            if (object2 == sB.aA.OL) {
                                return object2;
                            }
                        }
                        A0 a04 = a03.rD();
                        --n3;
                        if (object == sB.aA.b) {
                            a03.hd();
                        }
                        object2 = aA2;
                        a03 = a04;
                    }
                    if (object2 == sB.aA.l8) break block18;
                    object = object2;
                    if (object2 != sB.aA.S) break block19;
                }
                object2 = sB2.l8(a03, n3);
                object = object2;
                if (object2 == sB.aA.OL) {
                    return object2;
                }
            }
            if (a03 == a02) {
                return object;
            }
            object2 = a03.eD();
            if (object == sB.aA.b) {
                a03.hd();
            }
            object = object2;
            n2 = n3;
        }
        return sB.aA.l8;
    }
}

