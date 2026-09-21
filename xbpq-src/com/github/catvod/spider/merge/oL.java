/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Oi;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.gx;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.in;
import com.github.catvod.spider.merge.m;
import com.github.catvod.spider.merge.mt;
import com.github.catvod.spider.merge.rO;
import com.github.catvod.spider.merge.tv;
import com.github.catvod.spider.merge.xU;
import java.util.ArrayList;

abstract class oL
extends Enum<oL> {
    public static final /* enum */ oL A;
    public static final /* enum */ oL C;
    public static final /* enum */ oL E9;
    public static final /* enum */ oL HM;
    public static final /* enum */ oL Kf;
    public static final /* enum */ oL N;
    public static final /* enum */ oL OL;
    private static final String OY;
    public static final /* enum */ oL Q;
    public static final /* enum */ oL S;
    public static final /* enum */ oL T4;
    public static final /* enum */ oL W;
    public static final /* enum */ oL b;
    public static final /* enum */ oL c;
    public static final /* enum */ oL cD;
    public static final /* enum */ oL eD;
    public static final /* enum */ oL hR;
    public static final /* enum */ oL l;
    public static final /* enum */ oL l8;
    public static final /* enum */ oL n;
    private static final oL[] r1;
    public static final /* enum */ oL s;
    public static final /* enum */ oL tT;
    public static final /* enum */ oL uS;
    public static final /* enum */ oL v;

    static {
        oL oL2;
        oL oL3;
        oL oL4;
        oL oL5;
        oL oL6;
        oL oL7;
        oL oL8;
        oL oL9;
        oL oL10;
        oL oL11;
        oL oL12;
        oL oL13;
        oL oL14;
        oL oL15;
        oL oL16;
        oL oL17;
        oL oL18;
        oL oL19;
        oL oL20;
        oL oL21;
        oL oL22;
        oL oL23;
        oL oL24;
        l8 = oL24 = new oL(){

            @Override
            boolean n(mt object, xU xU2) {
                block7: {
                    block6: {
                        block5: {
                            if (oL.HM((mt)object)) {
                                return true;
                            }
                            if (!((mt)object).N()) break block5;
                            xU2.Lw(((mt)object).S());
                            break block6;
                        }
                        if (!((mt)object).HM()) break block7;
                        mt.xq xq2 = ((mt)object).T4();
                        object = new Oi(xU2.N.T4(xq2.Kf()), xq2.uS(), xq2.c());
                        ((Oi)object).FG(xq2.E9());
                        xU2.r1().f((A0)object);
                        if (xq2.eD()) {
                            xU2.r1().E7(g9.ut.S);
                        }
                        xU2.T(S);
                    }
                    return true;
                }
                xU2.T(S);
                return xU2.l((mt)object);
            }
        };
        S = oL23 = new oL(){

            private boolean v(mt mt2, xU xU2) {
                xU2.U("html");
                xU2.T(T4);
                return xU2.l(mt2);
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                block9: {
                    block7: {
                        block8: {
                            block6: {
                                if (mt2.HM()) {
                                    xU2.uS(this);
                                    return false;
                                }
                                if (!mt2.N()) break block6;
                                xU2.Lw(mt2.S());
                                break block7;
                            }
                            if (!oL.HM(mt2)) break block8;
                            xU2.M(mt2.l8());
                            break block7;
                        }
                        if (!mt2.A() || !mt2.OL().A0().equals("html")) break block9;
                        xU2.y(mt2.OL());
                        xU2.T(T4);
                    }
                    return true;
                }
                if (mt2.v() && tv.b(mt2.b().A0(), com.github.catvod.spider.merge.oL$n.OL)) {
                    return this.v(mt2, xU2);
                }
                if (mt2.v()) {
                    xU2.uS(this);
                    return false;
                }
                return this.v(mt2, xU2);
            }
        };
        T4 = oL22 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block10: {
                    block8: {
                        block9: {
                            block7: {
                                if (!oL.HM(mt2)) break block7;
                                xU2.M(mt2.l8());
                                break block8;
                            }
                            if (!mt2.N()) break block9;
                            xU2.Lw(mt2.S());
                            break block8;
                        }
                        if (mt2.HM()) {
                            xU2.uS(this);
                            return false;
                        }
                        if (mt2.A() && mt2.OL().A0().equals("html")) {
                            return tT.n(mt2, xU2);
                        }
                        if (!mt2.A() || !mt2.OL().A0().equals("head")) break block10;
                        xU2.K(xU2.y(mt2.OL()));
                        xU2.T(b);
                    }
                    return true;
                }
                if (mt2.v() && tv.b(mt2.b().A0(), com.github.catvod.spider.merge.oL$n.OL)) {
                    xU2.N("head");
                    return xU2.l(mt2);
                }
                if (mt2.v()) {
                    xU2.uS(this);
                    return false;
                }
                xU2.N("head");
                return xU2.l(mt2);
            }
        };
        b = oL21 = new oL(){

            private boolean v(mt mt2, gx gx2) {
                gx2.tT("head");
                return gx2.l(mt2);
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            boolean n(mt object, xU xU2) {
                if (oL.HM((mt)object)) {
                    xU2.M(((mt)object).l8());
                    return true;
                }
                int n2 = k.l8[((mt)object).l8.ordinal()];
                if (n2 == 1) {
                    xU2.Lw(((mt)object).S());
                    return true;
                }
                if (n2 == 2) {
                    xU2.uS(this);
                    return false;
                }
                if (n2 != 3) {
                    if (n2 != 4) {
                        return this.v((mt)object, xU2);
                    }
                    String string = ((mt)object).b().A0();
                    if (string.equals("head")) {
                        xU2.OT();
                        xU2.T(l);
                        return true;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.T4)) {
                        return this.v((mt)object, xU2);
                    }
                    xU2.uS(this);
                    return false;
                }
                mt.i i2 = ((mt)object).OL();
                String string = i2.A0();
                if (string.equals("html")) {
                    return tT.n((mt)object, xU2);
                }
                if (tv.b(string, com.github.catvod.spider.merge.oL$n.l8)) {
                    object = xU2.DL(i2);
                    if (!string.equals("base")) return true;
                    if (!((A0)object).Kf("href")) return true;
                    xU2.nZ((Iw)object);
                    return true;
                }
                if (string.equals("meta")) {
                    xU2.DL(i2);
                    return true;
                }
                if (string.equals("title")) {
                    oL.tT(i2, xU2);
                    return true;
                }
                if (tv.b(string, com.github.catvod.spider.merge.oL$n.S)) {
                    oL.l(i2, xU2);
                    return true;
                }
                if (string.equals("noscript")) {
                    xU2.y(i2);
                    xU2.T(OL);
                    return true;
                }
                if (string.equals("script")) {
                    xU2.T4.C(m.l);
                    xU2.Jb();
                    xU2.T(N);
                    xU2.y(i2);
                    return true;
                }
                if (!string.equals("head")) return this.v((mt)object, xU2);
                xU2.uS(this);
                return false;
            }
        };
        OL = oL20 = new oL(){

            private boolean v(mt mt2, xU xU2) {
                xU2.uS(this);
                xU2.M(new mt.Y().Kf(mt2.toString()));
                return true;
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                block9: {
                    block8: {
                        block7: {
                            if (!mt2.HM()) break block7;
                            xU2.uS(this);
                            break block8;
                        }
                        if (mt2.A() && mt2.OL().A0().equals("html")) {
                            return xU2.b6(mt2, tT);
                        }
                        if (!mt2.v() || !mt2.b().A0().equals("noscript")) break block9;
                        xU2.OT();
                        xU2.T(b);
                    }
                    return true;
                }
                if (!(oL.HM(mt2) || mt2.N() || mt2.A() && tv.b(mt2.OL().A0(), com.github.catvod.spider.merge.oL$n.l))) {
                    if (mt2.v() && mt2.b().A0().equals("br")) {
                        return this.v(mt2, xU2);
                    }
                    if (mt2.A() && tv.b(mt2.OL().A0(), com.github.catvod.spider.merge.oL$n.PP) || mt2.v()) {
                        xU2.uS(this);
                        return false;
                    }
                    return this.v(mt2, xU2);
                }
                return xU2.b6(mt2, b);
            }
        };
        l = oL19 = new oL(){

            private boolean v(mt mt2, xU xU2) {
                xU2.N("body");
                xU2.c(true);
                return xU2.l(mt2);
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            boolean n(mt mt2, xU xU2) {
                if (oL.HM(mt2)) {
                    xU2.M(mt2.l8());
                    return true;
                }
                if (mt2.N()) {
                    xU2.Lw(mt2.S());
                    return true;
                }
                if (mt2.HM()) {
                    xU2.uS(this);
                    return true;
                }
                if (mt2.A()) {
                    Object object = mt2.OL();
                    String string = ((mt.Ph)object).A0();
                    if (string.equals("html")) {
                        return xU2.b6(mt2, tT);
                    }
                    if (string.equals("body")) {
                        xU2.y((mt.i)object);
                        xU2.c(false);
                        xU2.T(tT);
                        return true;
                    }
                    if (string.equals("frameset")) {
                        xU2.y((mt.i)object);
                        xU2.T(c);
                        return true;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.tT)) {
                        xU2.uS(this);
                        object = xU2.G();
                        xU2.L((Iw)object);
                        xU2.b6(mt2, b);
                        xU2.LD((Iw)object);
                        return true;
                    }
                    if (string.equals("head")) {
                        xU2.uS(this);
                        return false;
                    }
                    this.v(mt2, xU2);
                    return true;
                }
                if (!mt2.v()) {
                    this.v(mt2, xU2);
                    return true;
                }
                if (tv.b(mt2.b().A0(), com.github.catvod.spider.merge.oL$n.b)) {
                    this.v(mt2, xU2);
                    return true;
                }
                xU2.uS(this);
                return false;
            }
        };
        tT = oL18 = new oL(){

            private boolean A(mt stringArray, xU xU2) {
                mt.XT xT = stringArray.b();
                String string = xT.A0();
                string.hashCode();
                int n2 = string.hashCode();
                int n3 = -1;
                switch (n2) {
                    default: {
                        break;
                    }
                    case 1869063452: {
                        if (!string.equals("sarcasm")) break;
                        n3 = 15;
                        break;
                    }
                    case 3536714: {
                        if (!string.equals("span")) break;
                        n3 = 14;
                        break;
                    }
                    case 3213227: {
                        if (!string.equals("html")) break;
                        n3 = 13;
                        break;
                    }
                    case 3148996: {
                        if (!string.equals("form")) break;
                        n3 = 12;
                        break;
                    }
                    case 3029410: {
                        if (!string.equals("body")) break;
                        n3 = 11;
                        break;
                    }
                    case 3453: {
                        if (!string.equals("li")) break;
                        n3 = 10;
                        break;
                    }
                    case 3278: {
                        if (!string.equals("h6")) break;
                        n3 = 9;
                        break;
                    }
                    case 3277: {
                        if (!string.equals("h5")) break;
                        n3 = 8;
                        break;
                    }
                    case 3276: {
                        if (!string.equals("h4")) break;
                        n3 = 7;
                        break;
                    }
                    case 3275: {
                        if (!string.equals("h3")) break;
                        n3 = 6;
                        break;
                    }
                    case 3274: {
                        if (!string.equals("h2")) break;
                        n3 = 5;
                        break;
                    }
                    case 3273: {
                        if (!string.equals("h1")) break;
                        n3 = 4;
                        break;
                    }
                    case 3216: {
                        if (!string.equals("dt")) break;
                        n3 = 3;
                        break;
                    }
                    case 3200: {
                        if (!string.equals("dd")) break;
                        n3 = 2;
                        break;
                    }
                    case 3152: {
                        if (!string.equals("br")) break;
                        n3 = 1;
                        break;
                    }
                    case 112: {
                        if (!string.equals("p")) break;
                        n3 = 0;
                    }
                }
                switch (n3) {
                    default: {
                        if (tv.b(string, com.github.catvod.spider.merge.oL$n.c)) {
                            return this.cD((mt)stringArray, xU2);
                        }
                        if (tv.b(string, com.github.catvod.spider.merge.oL$n.uS)) {
                            if (!xU2.d(string)) {
                                xU2.uS(this);
                                return false;
                            }
                            xU2.Q();
                            if (!xU2.l8().m().equals(string)) {
                                xU2.uS(this);
                            }
                            xU2.e(string);
                            break;
                        }
                        if (tv.b(string, com.github.catvod.spider.merge.oL$n.cD)) {
                            if (xU2.d("name")) break;
                            if (!xU2.d(string)) {
                                xU2.uS(this);
                                return false;
                            }
                            xU2.Q();
                            if (!xU2.l8().m().equals(string)) {
                                xU2.uS(this);
                            }
                            xU2.e(string);
                            xU2.cD();
                            break;
                        }
                        return this.v((mt)stringArray, xU2);
                    }
                    case 14: 
                    case 15: {
                        return this.v((mt)stringArray, xU2);
                    }
                    case 13: {
                        if (!xU2.tT("body")) break;
                        return xU2.l(xT);
                    }
                    case 12: {
                        stringArray = xU2.R();
                        xU2.KP(null);
                        if (stringArray != null && xU2.d(string)) {
                            xU2.Q();
                            if (!xU2.l8().m().equals(string)) {
                                xU2.uS(this);
                            }
                            xU2.LD((Iw)stringArray);
                            break;
                        }
                        xU2.uS(this);
                        return false;
                    }
                    case 11: {
                        if (!xU2.d("body")) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.T(uS);
                        break;
                    }
                    case 10: {
                        if (!xU2.hd(string)) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.W(string);
                        if (!xU2.l8().m().equals(string)) {
                            xU2.uS(this);
                        }
                        xU2.e(string);
                        break;
                    }
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: {
                        stringArray = com.github.catvod.spider.merge.oL$n.HM;
                        if (!xU2.Bz(stringArray)) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.W(string);
                        if (!xU2.l8().m().equals(string)) {
                            xU2.uS(this);
                        }
                        xU2.m(stringArray);
                        break;
                    }
                    case 2: 
                    case 3: {
                        if (!xU2.d(string)) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.W(string);
                        if (!xU2.l8().m().equals(string)) {
                            xU2.uS(this);
                        }
                        xU2.e(string);
                        break;
                    }
                    case 1: {
                        xU2.uS(this);
                        xU2.N("br");
                        return false;
                    }
                    case 0: {
                        if (!xU2.A0(string)) {
                            xU2.uS(this);
                            xU2.N(string);
                            return xU2.l(xT);
                        }
                        xU2.W(string);
                        if (!xU2.l8().m().equals(string)) {
                            xU2.uS(this);
                        }
                        xU2.e(string);
                    }
                }
                return true;
            }

            private boolean cD(mt mt2, xU xU2) {
                String string = mt2.b().A0();
                ArrayList<Iw> arrayList = xU2.oH();
                for (int i2 = 0; i2 < 8; ++i2) {
                    int n2;
                    Object object;
                    A0[] a0Array;
                    Iw iw = xU2.C(string);
                    if (iw == null) {
                        return this.v(mt2, xU2);
                    }
                    if (!xU2.h(iw)) {
                        xU2.uS(this);
                        xU2.DX(iw);
                        return true;
                    }
                    if (!xU2.d(iw.m())) {
                        xU2.uS(this);
                        return false;
                    }
                    if (xU2.l8() != iw) {
                        xU2.uS(this);
                    }
                    int n3 = arrayList.size();
                    int n4 = -1;
                    Object object2 = null;
                    Iw iw2 = null;
                    int n5 = 0;
                    boolean bl = false;
                    while (true) {
                        boolean bl2;
                        a0Array = object2;
                        if (n5 >= n3) break;
                        a0Array = object2;
                        if (n5 >= 64) break;
                        object = arrayList.get(n5);
                        if (object == iw) {
                            a0Array = arrayList.get(n5 - 1);
                            n2 = xU2.UM((Iw)object);
                            bl2 = true;
                        } else {
                            n2 = n4;
                            bl2 = bl;
                            a0Array = iw2;
                            if (bl) {
                                n2 = n4;
                                bl2 = bl;
                                a0Array = iw2;
                                if (xU2.r0((Iw)object)) {
                                    a0Array = object;
                                    break;
                                }
                            }
                        }
                        ++n5;
                        n4 = n2;
                        bl = bl2;
                        iw2 = a0Array;
                    }
                    if (a0Array == null) {
                        xU2.e(iw.m());
                        xU2.DX(iw);
                        return true;
                    }
                    object = a0Array;
                    A0[] a0Array2 = object;
                    for (n5 = 0; n5 < 3; ++n5) {
                        object2 = object;
                        if (xU2.h((Iw)object)) {
                            object2 = xU2.v((Iw)object);
                        }
                        if (!xU2.I((Iw)object2)) {
                            xU2.LD((Iw)object2);
                        } else {
                            if (object2 == iw) break;
                            object = new Iw(hs.hR(object2.Q(), rO.S), xU2.OY());
                            xU2.Ut((Iw)object2, (Iw)object);
                            xU2.F((Iw)object2, (Iw)object);
                            if (a0Array2 == a0Array) {
                                n4 = xU2.UM((Iw)object) + 1;
                            }
                            if (a0Array2.L() != null) {
                                a0Array2.hd();
                            }
                            ((Iw)object).f((A0)a0Array2);
                            a0Array2 = object2 = object;
                        }
                        object = object2;
                    }
                    if (iw2 != null) {
                        if (tv.b(iw2.m(), com.github.catvod.spider.merge.oL$n.eD)) {
                            if (a0Array2.L() != null) {
                                a0Array2.hd();
                            }
                            xU2.x((A0)a0Array2);
                        } else {
                            if (a0Array2.L() != null) {
                                a0Array2.hd();
                            }
                            iw2.f((A0)a0Array2);
                        }
                    }
                    object = new Iw(iw.cE(), xU2.OY());
                    ((Iw)object).OL().OL(iw.OL());
                    object2 = a0Array.n().toArray(new A0[0]);
                    n2 = ((A0[])object2).length;
                    for (n5 = 0; n5 < n2; ++n5) {
                        ((Iw)object).f(object2[n5]);
                    }
                    a0Array.f((A0)object);
                    xU2.DX(iw);
                    xU2.W8((Iw)object, n4);
                    xU2.LD(iw);
                    xU2.Y((Iw)a0Array, (Iw)object);
                }
                return true;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            private boolean s(mt object, xU object22) {
                Object object32 = ((mt)object).OL();
                Object object4 = ((mt.Ph)object32).A0();
                ((String)object4).hashCode();
                int n2 = ((String)object4).hashCode();
                int n3 = -1;
                switch (n2) {
                    default: {
                        break;
                    }
                    case 2115613112: {
                        if (!((String)object4).equals("noembed")) break;
                        n3 = 35;
                        break;
                    }
                    case 2091304424: {
                        if (!((String)object4).equals("isindex")) break;
                        n3 = 34;
                        break;
                    }
                    case 1973234167: {
                        if (!((String)object4).equals("plaintext")) break;
                        n3 = 33;
                        break;
                    }
                    case 181975684: {
                        if (!((String)object4).equals("listing")) break;
                        n3 = 32;
                        break;
                    }
                    case 110115790: {
                        if (!((String)object4).equals("table")) break;
                        n3 = 31;
                        break;
                    }
                    case 100358090: {
                        if (!((String)object4).equals("input")) break;
                        n3 = 30;
                        break;
                    }
                    case 100313435: {
                        if (!((String)object4).equals("image")) break;
                        n3 = 29;
                        break;
                    }
                    case 3536714: {
                        if (!((String)object4).equals("span")) break;
                        n3 = 28;
                        break;
                    }
                    case 3386833: {
                        if (!((String)object4).equals("nobr")) break;
                        n3 = 27;
                        break;
                    }
                    case 3344136: {
                        if (!((String)object4).equals("math")) break;
                        n3 = 26;
                        break;
                    }
                    case 3213227: {
                        if (!((String)object4).equals("html")) break;
                        n3 = 25;
                        break;
                    }
                    case 3148996: {
                        if (!((String)object4).equals("form")) break;
                        n3 = 24;
                        break;
                    }
                    case 3029410: {
                        if (!((String)object4).equals("body")) break;
                        n3 = 23;
                        break;
                    }
                    case 118811: {
                        if (!((String)object4).equals("xmp")) break;
                        n3 = 22;
                        break;
                    }
                    case 114276: {
                        if (!((String)object4).equals("svg")) break;
                        n3 = 21;
                        break;
                    }
                    case 111267: {
                        if (!((String)object4).equals("pre")) break;
                        n3 = 20;
                        break;
                    }
                    case 3650: {
                        if (!((String)object4).equals("rt")) break;
                        n3 = 19;
                        break;
                    }
                    case 3646: {
                        if (!((String)object4).equals("rp")) break;
                        n3 = 18;
                        break;
                    }
                    case 3453: {
                        if (!((String)object4).equals("li")) break;
                        n3 = 17;
                        break;
                    }
                    case 3338: {
                        if (!((String)object4).equals("hr")) break;
                        n3 = 16;
                        break;
                    }
                    case 3278: {
                        if (!((String)object4).equals("h6")) break;
                        n3 = 15;
                        break;
                    }
                    case 3277: {
                        if (!((String)object4).equals("h5")) break;
                        n3 = 14;
                        break;
                    }
                    case 3276: {
                        if (!((String)object4).equals("h4")) break;
                        n3 = 13;
                        break;
                    }
                    case 3275: {
                        if (!((String)object4).equals("h3")) break;
                        n3 = 12;
                        break;
                    }
                    case 3274: {
                        if (!((String)object4).equals("h2")) break;
                        n3 = 11;
                        break;
                    }
                    case 3273: {
                        if (!((String)object4).equals("h1")) break;
                        n3 = 10;
                        break;
                    }
                    case 3216: {
                        if (!((String)object4).equals("dt")) break;
                        n3 = 9;
                        break;
                    }
                    case 3200: {
                        if (!((String)object4).equals("dd")) break;
                        n3 = 8;
                        break;
                    }
                    case 97: {
                        if (!((String)object4).equals("a")) break;
                        n3 = 7;
                        break;
                    }
                    case -80773204: {
                        if (!((String)object4).equals("optgroup")) break;
                        n3 = 6;
                        break;
                    }
                    case -906021636: {
                        if (!((String)object4).equals("select")) break;
                        n3 = 5;
                        break;
                    }
                    case -1003243718: {
                        if (!((String)object4).equals("textarea")) break;
                        n3 = 4;
                        break;
                    }
                    case -1010136971: {
                        if (!((String)object4).equals("option")) break;
                        n3 = 3;
                        break;
                    }
                    case -1191214428: {
                        if (!((String)object4).equals("iframe")) break;
                        n3 = 2;
                        break;
                    }
                    case -1377687758: {
                        if (!((String)object4).equals("button")) break;
                        n3 = 1;
                        break;
                    }
                    case -1644953643: {
                        if (!((String)object4).equals("frameset")) break;
                        n3 = 0;
                    }
                }
                switch (n3) {
                    default: {
                        if (tv.b((String)object4, com.github.catvod.spider.merge.oL$n.s)) {
                            ((xU)object22).Nb();
                            ((xU)object22).DL((mt.i)object32);
                            ((xU)object22).c(false);
                            return true;
                        } else if (tv.b((String)object4, com.github.catvod.spider.merge.oL$n.N)) {
                            if (((xU)object22).A0("p")) {
                                ((gx)object22).tT("p");
                            }
                            ((xU)object22).y((mt.i)object32);
                            return true;
                        } else {
                            if (tv.b(object4, com.github.catvod.spider.merge.oL$n.tT)) {
                                return ((xU)object22).b6((mt)object, b);
                            }
                            if (tv.b(object4, com.github.catvod.spider.merge.oL$n.A)) {
                                ((xU)object22).Nb();
                                ((xU)object22).Kw(((xU)object22).y((mt.i)object32));
                                return true;
                            } else if (tv.b(object4, com.github.catvod.spider.merge.oL$n.cD)) {
                                ((xU)object22).Nb();
                                ((xU)object22).y((mt.i)object32);
                                ((xU)object22).FG();
                                ((xU)object22).c(false);
                                return true;
                            } else if (tv.b((String)object4, com.github.catvod.spider.merge.oL$n.hR)) {
                                ((xU)object22).DL((mt.i)object32);
                                return true;
                            } else {
                                if (tv.b((String)object4, com.github.catvod.spider.merge.oL$n.E9)) {
                                    ((xU)object22).uS(this);
                                    return false;
                                }
                                ((xU)object22).Nb();
                                ((xU)object22).y((mt.i)object32);
                            }
                        }
                        return true;
                    }
                    case 35: {
                        oL.l((mt.i)object32, (xU)object22);
                        return true;
                    }
                    case 34: {
                        ((xU)object22).uS(this);
                        if (((xU)object22).R() != null) {
                            return false;
                        }
                        ((gx)object22).N("form");
                        if (((mt.Ph)object32).r1("action")) {
                            ((xU)object22).R().B("action", ((mt.Ph)object32).n.v("action"));
                        }
                        ((gx)object22).N("hr");
                        ((gx)object22).N("label");
                        object = ((mt.Ph)object32).r1("prompt") ? ((mt.Ph)object32).n.v("prompt") : "This is a searchable index. Enter search keywords: ";
                        ((xU)object22).l(new mt.Y().Kf((String)object));
                        object = new Rz();
                        if (((mt.Ph)object32).R()) {
                            for (Object object32 : ((mt.Ph)object32).n) {
                                if (tv.b(((in)object32).S(), com.github.catvod.spider.merge.oL$n.Kf)) continue;
                                ((Rz)object).C((in)object32);
                            }
                        }
                        ((Rz)object).W("name", "isindex");
                        ((xU)object22).HM("input", (Rz)object);
                        ((gx)object22).tT("label");
                        ((gx)object22).N("hr");
                        ((gx)object22).tT("form");
                        return true;
                    }
                    case 33: {
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).y((mt.i)object32);
                        ((gx)object22).T4.C(m.tT);
                        return true;
                    }
                    case 31: {
                        if (((xU)object22).r1().Qy() != g9.ut.S && ((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).y((mt.i)object32);
                        ((xU)object22).c(false);
                        ((xU)object22).T(HM);
                        return true;
                    }
                    case 30: {
                        ((xU)object22).Nb();
                        if (((xU)object22).DL((mt.i)object32).T4("type").equalsIgnoreCase("hidden")) return true;
                        ((xU)object22).c(false);
                        return true;
                    }
                    case 29: {
                        if (((xU)object22).bc("svg") == null) {
                            return ((xU)object22).l(((mt.Ph)object32).rD("img"));
                        }
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 28: {
                        ((xU)object22).Nb();
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 27: {
                        ((xU)object22).Nb();
                        if (((xU)object22).d("nobr")) {
                            ((xU)object22).uS(this);
                            ((gx)object22).tT("nobr");
                            ((xU)object22).Nb();
                        }
                        ((xU)object22).Kw(((xU)object22).y((mt.i)object32));
                        return true;
                    }
                    case 26: {
                        ((xU)object22).Nb();
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 25: {
                        ((xU)object22).uS(this);
                        object = ((xU)object22).oH().get(0);
                        if (!((mt.Ph)object32).R()) return true;
                        for (Object object22 : ((mt.Ph)object32).n) {
                            if (((A0)object).Kf(((in)object22).S())) continue;
                            ((Iw)object).OL().C((in)object22);
                        }
                        return true;
                    }
                    case 24: {
                        if (((xU)object22).R() != null) {
                            ((xU)object22).uS(this);
                            return false;
                        }
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).f((mt.i)object32, true);
                        return true;
                    }
                    case 23: {
                        ((xU)object22).uS(this);
                        object = ((xU)object22).oH();
                        if (((ArrayList)object).size() == 1 || ((ArrayList)object).size() > 2 && !((Iw)((ArrayList)object).get(1)).m().equals("body")) return false;
                        ((xU)object22).c(false);
                        object = (Iw)((ArrayList)object).get(1);
                        if (!((mt.Ph)object32).R()) return true;
                        for (Object object22 : ((mt.Ph)object32).n) {
                            if (((A0)object).Kf(((in)object22).S())) continue;
                            ((Iw)object).OL().C((in)object22);
                        }
                        return true;
                    }
                    case 22: {
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).Nb();
                        ((xU)object22).c(false);
                        oL.l((mt.i)object32, (xU)object22);
                        return true;
                    }
                    case 21: {
                        ((xU)object22).Nb();
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 20: 
                    case 32: {
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).y((mt.i)object32);
                        ((gx)object22).S.OY("\n");
                        ((xU)object22).c(false);
                        return true;
                    }
                    case 18: 
                    case 19: {
                        if (!((xU)object22).d("ruby")) return true;
                        ((xU)object22).Q();
                        if (!((gx)object22).l8().m().equals("ruby")) {
                            ((xU)object22).uS(this);
                            ((xU)object22).vi("ruby");
                        }
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 17: {
                        ((xU)object22).c(false);
                        object = ((xU)object22).oH();
                        for (n3 = ((ArrayList)object).size() - 1; n3 > 0; --n3) {
                            object4 = (Iw)((ArrayList)object).get(n3);
                            if (((Iw)object4).m().equals("li")) {
                                ((gx)object22).tT("li");
                                break;
                            }
                            if (((xU)object22).r0((Iw)object4) && !tv.b(((Iw)object4).m(), com.github.catvod.spider.merge.oL$n.n)) break;
                        }
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 16: {
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).DL((mt.i)object32);
                        ((xU)object22).c(false);
                        return true;
                    }
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: {
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        if (tv.b(((gx)object22).l8().m(), com.github.catvod.spider.merge.oL$n.HM)) {
                            ((xU)object22).uS(this);
                            ((xU)object22).OT();
                        }
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 8: 
                    case 9: {
                        ((xU)object22).c(false);
                        object4 = ((xU)object22).oH();
                        for (n3 = ((ArrayList)object4).size() - 1; n3 > 0; --n3) {
                            object = ((ArrayList)object4).get(n3);
                            if (tv.b(((Iw)object).m(), com.github.catvod.spider.merge.oL$n.v)) {
                                ((gx)object22).tT(((Iw)object).m());
                                break;
                            }
                            if (((xU)object22).r0((Iw)object) && !tv.b(((Iw)object).m(), com.github.catvod.spider.merge.oL$n.n)) break;
                        }
                        if (((xU)object22).A0("p")) {
                            ((gx)object22).tT("p");
                        }
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 7: {
                        if (((xU)object22).C("a") != null) {
                            ((xU)object22).uS(this);
                            ((gx)object22).tT("a");
                            object = ((xU)object22).bc("a");
                            if (object != null) {
                                ((xU)object22).DX((Iw)object);
                                ((xU)object22).LD((Iw)object);
                            }
                        }
                        ((xU)object22).Nb();
                        ((xU)object22).Kw(((xU)object22).y((mt.i)object32));
                        return true;
                    }
                    case 5: {
                        ((xU)object22).Nb();
                        ((xU)object22).y((mt.i)object32);
                        ((xU)object22).c(false);
                        object = ((xU)object22).Yr();
                        if (!(((Enum)object).equals((Object)HM) || ((Enum)object).equals((Object)v) || ((Enum)object).equals((Object)cD) || ((Enum)object).equals((Object)s) || ((Enum)object).equals((Object)hR))) {
                            ((xU)object22).T(Kf);
                            return true;
                        } else {
                            ((xU)object22).T(E9);
                        }
                        return true;
                    }
                    case 4: {
                        ((xU)object22).y((mt.i)object32);
                        if (((mt.Ph)object32).bc()) return true;
                        ((gx)object22).T4.C(m.T4);
                        ((xU)object22).Jb();
                        ((xU)object22).c(false);
                        ((xU)object22).T(N);
                        return true;
                    }
                    case 3: 
                    case 6: {
                        if (((gx)object22).l8().m().equals("option")) {
                            ((gx)object22).tT("option");
                        }
                        ((xU)object22).Nb();
                        ((xU)object22).y((mt.i)object32);
                        return true;
                    }
                    case 2: {
                        ((xU)object22).c(false);
                        oL.l((mt.i)object32, (xU)object22);
                        return true;
                    }
                    case 1: {
                        if (((xU)object22).A0("button")) {
                            ((xU)object22).uS(this);
                            ((gx)object22).tT("button");
                            ((xU)object22).l((mt)object32);
                            return true;
                        } else {
                            ((xU)object22).Nb();
                            ((xU)object22).y((mt.i)object32);
                            ((xU)object22).c(false);
                        }
                        return true;
                    }
                    case 0: 
                }
                ((xU)object22).uS(this);
                object4 = ((xU)object22).oH();
                if (((ArrayList)object4).size() == 1 || ((ArrayList)object4).size() > 2 && !((ArrayList)object4).get(1).m().equals("body")) return false;
                if (!((xU)object22).eD()) {
                    return false;
                }
                object = (Iw)((ArrayList)object4).get(1);
                if (((Iw)object).L() != null) {
                    ((A0)object).hd();
                }
                while (((ArrayList)object4).size() > 1) {
                    ((ArrayList)object4).remove(((ArrayList)object4).size() - 1);
                }
                ((xU)object22).y((mt.i)object32);
                ((xU)object22).T(c);
                return true;
            }

            /*
             * Enabled aggressive block sorting
             */
            @Override
            boolean n(mt mt2, xU xU2) {
                int n2 = k.l8[mt2.l8.ordinal()];
                if (n2 == 1) {
                    xU2.Lw(mt2.S());
                    return true;
                }
                if (n2 == 2) {
                    xU2.uS(this);
                    return false;
                }
                if (n2 == 3) return this.s(mt2, xU2);
                if (n2 == 4) return this.A(mt2, xU2);
                if (n2 != 5) {
                    return true;
                }
                if (((mt.Y)(mt2 = mt2.l8())).E9().equals(OY)) {
                    xU2.uS(this);
                    return false;
                }
                if (xU2.eD() && oL.HM(mt2)) {
                    xU2.Nb();
                    xU2.M((mt.Y)mt2);
                    return true;
                }
                xU2.Nb();
                xU2.M((mt.Y)mt2);
                xU2.c(false);
                return true;
            }

            boolean v(mt object, xU xU2) {
                object = ((mt)object).b().T4;
                ArrayList<Iw> arrayList = xU2.oH();
                for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
                    Iw iw = arrayList.get(i2);
                    if (iw.m().equals(object)) {
                        xU2.W((String)object);
                        if (!((String)object).equals(xU2.l8().m())) {
                            xU2.uS(this);
                        }
                        xU2.e((String)object);
                        break;
                    }
                    if (!xU2.r0(iw)) continue;
                    xU2.uS(this);
                    return false;
                }
                return true;
            }
        };
        N = oL17 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                if (mt2.tT()) {
                    xU2.M(mt2.l8());
                } else {
                    if (mt2.n()) {
                        xU2.uS(this);
                        xU2.OT();
                        xU2.T(xU2.n6());
                        return xU2.l(mt2);
                    }
                    if (mt2.v()) {
                        xU2.OT();
                        xU2.T(xU2.n6());
                    }
                }
                return true;
            }
        };
        HM = oL16 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block18: {
                    block26: {
                        block20: {
                            String string;
                            mt.i i2;
                            block24: {
                                block25: {
                                    block23: {
                                        block22: {
                                            block21: {
                                                block19: {
                                                    if (mt2.tT()) {
                                                        xU2.Xc();
                                                        xU2.Jb();
                                                        xU2.T(n);
                                                        return xU2.l(mt2);
                                                    }
                                                    if (mt2.N()) {
                                                        xU2.Lw(mt2.S());
                                                        return true;
                                                    }
                                                    if (mt2.HM()) {
                                                        xU2.uS(this);
                                                        return false;
                                                    }
                                                    if (!mt2.A()) break block18;
                                                    i2 = mt2.OL();
                                                    string = i2.A0();
                                                    if (!string.equals("caption")) break block19;
                                                    xU2.Kf();
                                                    xU2.FG();
                                                    xU2.y(i2);
                                                    xU2.T(v);
                                                    break block20;
                                                }
                                                if (!string.equals("colgroup")) break block21;
                                                xU2.Kf();
                                                xU2.y(i2);
                                                xU2.T(A);
                                                break block20;
                                            }
                                            if (string.equals("col")) {
                                                xU2.N("colgroup");
                                                return xU2.l(mt2);
                                            }
                                            if (!tv.b(string, com.github.catvod.spider.merge.oL$n.Q)) break block22;
                                            xU2.Kf();
                                            xU2.y(i2);
                                            xU2.T(cD);
                                            break block20;
                                        }
                                        if (tv.b(string, com.github.catvod.spider.merge.oL$n.W)) {
                                            xU2.N("tbody");
                                            return xU2.l(mt2);
                                        }
                                        if (!string.equals("table")) break block23;
                                        xU2.uS(this);
                                        if (xU2.tT("table")) {
                                            return xU2.l(mt2);
                                        }
                                        break block20;
                                    }
                                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.C)) {
                                        return xU2.b6(mt2, b);
                                    }
                                    if (!string.equals("input")) break block24;
                                    if (!i2.R() || !i2.n.v("type").equalsIgnoreCase("hidden")) break block25;
                                    xU2.DL(i2);
                                    break block20;
                                }
                                return this.v(mt2, xU2);
                            }
                            if (!string.equals("form")) break block26;
                            xU2.uS(this);
                            if (xU2.R() != null) {
                                return false;
                            }
                            xU2.f(i2, false);
                        }
                        return true;
                    }
                    return this.v(mt2, xU2);
                }
                if (mt2.v()) {
                    String string = mt2.b().A0();
                    if (string.equals("table")) {
                        if (!xU2.mF(string)) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.e("table");
                        xU2.GO();
                        return true;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.G)) {
                        xU2.uS(this);
                        return false;
                    }
                    return this.v(mt2, xU2);
                }
                if (mt2.n()) {
                    if (xU2.l8().m().equals("html")) {
                        xU2.uS(this);
                    }
                    return true;
                }
                return this.v(mt2, xU2);
            }

            boolean v(mt mt2, xU xU2) {
                boolean bl;
                xU2.uS(this);
                if (tv.b(xU2.l8().m(), com.github.catvod.spider.merge.oL$n.rD)) {
                    xU2.g(true);
                    bl = xU2.b6(mt2, tT);
                    xU2.g(false);
                } else {
                    bl = xU2.b6(mt2, tT);
                }
                return bl;
            }
        };
        n = oL15 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                if (mt2.l8 == mt.Q.OL) {
                    if (((mt.Y)(mt2 = mt2.l8())).E9().equals(OY)) {
                        xU2.uS(this);
                        return false;
                    }
                    xU2.rD().add(((mt.Y)mt2).E9());
                    return true;
                }
                if (xU2.rD().size() > 0) {
                    for (String string : xU2.rD()) {
                        if (!oL.N(string)) {
                            xU2.uS(this);
                            if (tv.b(xU2.l8().m(), com.github.catvod.spider.merge.oL$n.rD)) {
                                xU2.g(true);
                                xU2.b6(new mt.Y().Kf(string), tT);
                                xU2.g(false);
                                continue;
                            }
                            xU2.b6(new mt.Y().Kf(string), tT);
                            continue;
                        }
                        xU2.M(new mt.Y().Kf(string));
                    }
                    xU2.Xc();
                }
                xU2.T(xU2.n6());
                return xU2.l(mt2);
            }
        };
        v = oL14 = new oL(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            boolean n(mt mt2, xU xU2) {
                if (!mt2.v() || !mt2.b().A0().equals("caption")) {
                    if (mt2.A() && tv.b(mt2.OL().A0(), com.github.catvod.spider.merge.oL$n.bc) || mt2.v() && mt2.b().A0().equals("table")) {
                        xU2.uS(this);
                        if (!xU2.tT("caption")) return true;
                        return xU2.l(mt2);
                    }
                } else {
                    if (!xU2.mF(mt2.b().A0())) {
                        xU2.uS(this);
                        return false;
                    }
                    xU2.Q();
                    if (!xU2.l8().m().equals("caption")) {
                        xU2.uS(this);
                    }
                    xU2.e("caption");
                    xU2.cD();
                    xU2.T(HM);
                    return true;
                }
                if (!mt2.v() || !tv.b(mt2.b().A0(), com.github.catvod.spider.merge.oL$n.o)) return xU2.b6(mt2, tT);
                xU2.uS(this);
                return false;
            }
        };
        A = oL13 = new oL(){

            private boolean v(mt mt2, gx gx2) {
                if (gx2.tT("colgroup")) {
                    return gx2.l(mt2);
                }
                return true;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            boolean n(mt mt2, xU xU2) {
                if (oL.HM(mt2)) {
                    xU2.M(mt2.l8());
                    return true;
                }
                int n2 = k.l8[mt2.l8.ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 6) {
                                    return this.v(mt2, xU2);
                                }
                                if (!xU2.l8().m().equals("html")) return this.v(mt2, xU2);
                                return true;
                            }
                            if (!mt2.b().T4.equals("colgroup")) return this.v(mt2, xU2);
                            if (xU2.l8().m().equals("html")) {
                                xU2.uS(this);
                                return false;
                            }
                            xU2.OT();
                            xU2.T(HM);
                            return true;
                        } else {
                            mt.i i2 = mt2.OL();
                            String string = i2.A0();
                            string.hashCode();
                            if (!string.equals("col")) {
                                if (string.equals("html")) return xU2.b6(mt2, tT);
                                return this.v(mt2, xU2);
                            }
                            xU2.DL(i2);
                        }
                        return true;
                    } else {
                        xU2.uS(this);
                    }
                    return true;
                } else {
                    xU2.Lw(mt2.S());
                }
                return true;
            }
        };
        cD = oL12 = new oL(){

            private boolean A(mt mt2, xU xU2) {
                if (!(xU2.mF("tbody") || xU2.mF("thead") || xU2.d("tfoot"))) {
                    xU2.uS(this);
                    return false;
                }
                xU2.hR();
                xU2.tT(xU2.l8().m());
                return xU2.l(mt2);
            }

            private boolean v(mt mt2, xU xU2) {
                return xU2.b6(mt2, HM);
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                String string;
                mt.i i2;
                block13: {
                    block11: {
                        block12: {
                            block9: {
                                String string2;
                                block10: {
                                    int n2 = k.l8[mt2.l8.ordinal()];
                                    if (n2 == 3) break block9;
                                    if (n2 != 4) {
                                        return this.v(mt2, xU2);
                                    }
                                    string2 = mt2.b().A0();
                                    if (!tv.b(string2, com.github.catvod.spider.merge.oL$n.H6)) break block10;
                                    if (!xU2.mF(string2)) {
                                        xU2.uS(this);
                                        return false;
                                    }
                                    xU2.hR();
                                    xU2.OT();
                                    xU2.T(HM);
                                    break block11;
                                }
                                if (string2.equals("table")) {
                                    return this.A(mt2, xU2);
                                }
                                if (tv.b(string2, com.github.catvod.spider.merge.oL$n.A0)) {
                                    xU2.uS(this);
                                    return false;
                                }
                                return this.v(mt2, xU2);
                            }
                            i2 = mt2.OL();
                            string = i2.A0();
                            if (!string.equals("template")) break block12;
                            xU2.y(i2);
                            break block11;
                        }
                        if (!string.equals("tr")) break block13;
                        xU2.hR();
                        xU2.y(i2);
                        xU2.T(s);
                    }
                    return true;
                }
                if (tv.b(string, com.github.catvod.spider.merge.oL$n.OY)) {
                    xU2.uS(this);
                    xU2.N("tr");
                    return xU2.l(i2);
                }
                if (tv.b(string, com.github.catvod.spider.merge.oL$n.oH)) {
                    return this.A(mt2, xU2);
                }
                return this.v(mt2, xU2);
            }
        };
        s = oL11 = new oL(){

            private boolean A(mt mt2, gx gx2) {
                if (gx2.tT("tr")) {
                    return gx2.l(mt2);
                }
                return false;
            }

            private boolean v(mt mt2, xU xU2) {
                return xU2.b6(mt2, HM);
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                block11: {
                    String string;
                    block13: {
                        block14: {
                            block9: {
                                block12: {
                                    block7: {
                                        String string2;
                                        block10: {
                                            mt.i i2;
                                            block8: {
                                                if (!mt2.A()) break block7;
                                                i2 = mt2.OL();
                                                string2 = i2.A0();
                                                if (!string2.equals("template")) break block8;
                                                xU2.y(i2);
                                                break block9;
                                            }
                                            if (!tv.b(string2, com.github.catvod.spider.merge.oL$n.OY)) break block10;
                                            xU2.E9();
                                            xU2.y(i2);
                                            xU2.T(hR);
                                            xU2.FG();
                                            break block9;
                                        }
                                        if (tv.b(string2, com.github.catvod.spider.merge.oL$n.hd)) {
                                            return this.A(mt2, xU2);
                                        }
                                        return this.v(mt2, xU2);
                                    }
                                    if (!mt2.v()) break block11;
                                    string = mt2.b().A0();
                                    if (!string.equals("tr")) break block12;
                                    if (!xU2.mF(string)) {
                                        xU2.uS(this);
                                        return false;
                                    }
                                    xU2.E9();
                                    xU2.OT();
                                    xU2.T(cD);
                                    break block9;
                                }
                                if (string.equals("table")) {
                                    return this.A(mt2, xU2);
                                }
                                if (!tv.b(string, com.github.catvod.spider.merge.oL$n.Q)) break block13;
                                if (!xU2.mF(string) || !xU2.mF("tr")) break block14;
                                xU2.E9();
                                xU2.OT();
                                xU2.T(cD);
                            }
                            return true;
                        }
                        xU2.uS(this);
                        return false;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.d)) {
                        xU2.uS(this);
                        return false;
                    }
                    return this.v(mt2, xU2);
                }
                return this.v(mt2, xU2);
            }
        };
        hR = oL10 = new oL(){

            private void A(xU xU2) {
                if (xU2.mF("td")) {
                    xU2.tT("td");
                } else {
                    xU2.tT("th");
                }
            }

            private boolean v(mt mt2, xU xU2) {
                return xU2.b6(mt2, tT);
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                if (mt2.v()) {
                    String string = mt2.b().A0();
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.OY)) {
                        if (!xU2.mF(string)) {
                            xU2.uS(this);
                            xU2.T(s);
                            return false;
                        }
                        xU2.Q();
                        if (!xU2.l8().m().equals(string)) {
                            xU2.uS(this);
                        }
                        xU2.e(string);
                        xU2.cD();
                        xU2.T(s);
                        return true;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.r1)) {
                        xU2.uS(this);
                        return false;
                    }
                    if (tv.b(string, com.github.catvod.spider.merge.oL$n.R)) {
                        if (!xU2.mF(string)) {
                            xU2.uS(this);
                            return false;
                        }
                        this.A(xU2);
                        return xU2.l(mt2);
                    }
                    return this.v(mt2, xU2);
                }
                if (mt2.A() && tv.b(mt2.OL().A0(), com.github.catvod.spider.merge.oL$n.bc)) {
                    if (!xU2.mF("td") && !xU2.mF("th")) {
                        xU2.uS(this);
                        return false;
                    }
                    this.A(xU2);
                    return xU2.l(mt2);
                }
                return this.v(mt2, xU2);
            }
        };
        Kf = oL9 = new oL(){

            private boolean v(mt mt2, xU xU2) {
                xU2.uS(this);
                return false;
            }

            @Override
            boolean n(mt mt2, xU xU2) {
                block0 : switch (k.l8[mt2.l8.ordinal()]) {
                    default: {
                        return this.v(mt2, xU2);
                    }
                    case 6: {
                        if (xU2.l8().m().equals("html")) break;
                        xU2.uS(this);
                        break;
                    }
                    case 5: {
                        mt2 = mt2.l8();
                        if (((mt.Y)mt2).E9().equals(OY)) {
                            xU2.uS(this);
                            return false;
                        }
                        xU2.M((mt.Y)mt2);
                        break;
                    }
                    case 4: {
                        String string = mt2.b().A0();
                        string.hashCode();
                        int n2 = -1;
                        switch (string.hashCode()) {
                            default: {
                                break;
                            }
                            case -80773204: {
                                if (!string.equals("optgroup")) break;
                                n2 = 2;
                                break;
                            }
                            case -906021636: {
                                if (!string.equals("select")) break;
                                n2 = 1;
                                break;
                            }
                            case -1010136971: {
                                if (!string.equals("option")) break;
                                n2 = 0;
                            }
                        }
                        switch (n2) {
                            default: {
                                return this.v(mt2, xU2);
                            }
                            case 2: {
                                if (xU2.l8().m().equals("option") && xU2.v(xU2.l8()) != null && xU2.v(xU2.l8()).m().equals("optgroup")) {
                                    xU2.tT("option");
                                }
                                if (xU2.l8().m().equals("optgroup")) {
                                    xU2.OT();
                                    break block0;
                                }
                                xU2.uS(this);
                                break block0;
                            }
                            case 1: {
                                if (!xU2.H6(string)) {
                                    xU2.uS(this);
                                    return false;
                                }
                                xU2.e(string);
                                xU2.GO();
                                break block0;
                            }
                            case 0: 
                        }
                        if (xU2.l8().m().equals("option")) {
                            xU2.OT();
                            break;
                        }
                        xU2.uS(this);
                        break;
                    }
                    case 3: {
                        mt.i i2 = mt2.OL();
                        String string = i2.A0();
                        if (string.equals("html")) {
                            return xU2.b6(i2, tT);
                        }
                        if (string.equals("option")) {
                            if (xU2.l8().m().equals("option")) {
                                xU2.tT("option");
                            }
                            xU2.y(i2);
                            break;
                        }
                        if (string.equals("optgroup")) {
                            if (xU2.l8().m().equals("option")) {
                                xU2.tT("option");
                            }
                            if (xU2.l8().m().equals("optgroup")) {
                                xU2.tT("optgroup");
                            }
                            xU2.y(i2);
                            break;
                        }
                        if (string.equals("select")) {
                            xU2.uS(this);
                            return xU2.tT("select");
                        }
                        if (tv.b(string, com.github.catvod.spider.merge.oL$n.O)) {
                            xU2.uS(this);
                            if (!xU2.H6("select")) {
                                return false;
                            }
                            xU2.tT("select");
                            return xU2.l(i2);
                        }
                        if (string.equals("script")) {
                            return xU2.b6(mt2, b);
                        }
                        return this.v(mt2, xU2);
                    }
                    case 2: {
                        xU2.uS(this);
                        return false;
                    }
                    case 1: {
                        xU2.Lw(mt2.S());
                    }
                }
                return true;
            }
        };
        E9 = oL8 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                if (mt2.A() && tv.b(mt2.OL().A0(), com.github.catvod.spider.merge.oL$n.Bz)) {
                    xU2.uS(this);
                    xU2.tT("select");
                    return xU2.l(mt2);
                }
                if (mt2.v() && tv.b(mt2.b().A0(), com.github.catvod.spider.merge.oL$n.Bz)) {
                    xU2.uS(this);
                    if (xU2.mF(mt2.b().A0())) {
                        xU2.tT("select");
                        return xU2.l(mt2);
                    }
                    return false;
                }
                return xU2.b6(mt2, Kf);
            }
        };
        uS = oL7 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block10: {
                    block7: {
                        block9: {
                            block8: {
                                block6: {
                                    if (!oL.HM(mt2)) break block6;
                                    xU2.M(mt2.l8());
                                    break block7;
                                }
                                if (!mt2.N()) break block8;
                                xU2.Lw(mt2.S());
                                break block7;
                            }
                            if (mt2.HM()) {
                                xU2.uS(this);
                                return false;
                            }
                            if (mt2.A() && mt2.OL().A0().equals("html")) {
                                return xU2.b6(mt2, tT);
                            }
                            if (!mt2.v() || !mt2.b().A0().equals("html")) break block9;
                            if (xU2.J()) {
                                xU2.uS(this);
                                return false;
                            }
                            xU2.T(Q);
                            break block7;
                        }
                        if (!mt2.n()) break block10;
                    }
                    return true;
                }
                xU2.uS(this);
                xU2.T(tT);
                return xU2.l(mt2);
            }
        };
        c = oL6 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block25: {
                    block21: {
                        block24: {
                            block23: {
                                block22: {
                                    block20: {
                                        if (!oL.HM(mt2)) break block20;
                                        xU2.M(mt2.l8());
                                        break block21;
                                    }
                                    if (!mt2.N()) break block22;
                                    xU2.Lw(mt2.S());
                                    break block21;
                                }
                                if (mt2.HM()) {
                                    xU2.uS(this);
                                    return false;
                                }
                                if (!mt2.A()) break block23;
                                mt2 = mt2.OL();
                                String string = ((mt.Ph)mt2).A0();
                                string.hashCode();
                                int n2 = -1;
                                switch (string.hashCode()) {
                                    default: {
                                        break;
                                    }
                                    case 1192721831: {
                                        if (!string.equals("noframes")) break;
                                        n2 = 3;
                                        break;
                                    }
                                    case 97692013: {
                                        if (!string.equals("frame")) break;
                                        n2 = 2;
                                        break;
                                    }
                                    case 3213227: {
                                        if (!string.equals("html")) break;
                                        n2 = 1;
                                        break;
                                    }
                                    case -1644953643: {
                                        if (!string.equals("frameset")) break;
                                        n2 = 0;
                                    }
                                }
                                switch (n2) {
                                    default: {
                                        xU2.uS(this);
                                        return false;
                                    }
                                    case 3: {
                                        return xU2.b6(mt2, b);
                                    }
                                    case 2: {
                                        xU2.DL((mt.i)mt2);
                                        break;
                                    }
                                    case 1: {
                                        return xU2.b6(mt2, tT);
                                    }
                                    case 0: {
                                        xU2.y((mt.i)mt2);
                                        break;
                                    }
                                }
                                break block21;
                            }
                            if (!mt2.v() || !mt2.b().A0().equals("frameset")) break block24;
                            if (xU2.l8().m().equals("html")) {
                                xU2.uS(this);
                                return false;
                            }
                            xU2.OT();
                            if (!xU2.J() && !xU2.l8().m().equals("frameset")) {
                                xU2.T(eD);
                            }
                            break block21;
                        }
                        if (!mt2.n()) break block25;
                        if (!xU2.l8().m().equals("html")) {
                            xU2.uS(this);
                        }
                    }
                    return true;
                }
                xU2.uS(this);
                return false;
            }
        };
        eD = oL5 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block10: {
                    block7: {
                        block9: {
                            block8: {
                                block6: {
                                    if (!oL.HM(mt2)) break block6;
                                    xU2.M(mt2.l8());
                                    break block7;
                                }
                                if (!mt2.N()) break block8;
                                xU2.Lw(mt2.S());
                                break block7;
                            }
                            if (mt2.HM()) {
                                xU2.uS(this);
                                return false;
                            }
                            if (mt2.A() && mt2.OL().A0().equals("html")) {
                                return xU2.b6(mt2, tT);
                            }
                            if (!mt2.v() || !mt2.b().A0().equals("html")) break block9;
                            xU2.T(W);
                            break block7;
                        }
                        if (mt2.A() && mt2.OL().A0().equals("noframes")) {
                            return xU2.b6(mt2, b);
                        }
                        if (!mt2.n()) break block10;
                    }
                    return true;
                }
                xU2.uS(this);
                return false;
            }
        };
        Q = oL4 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block4: {
                    block6: {
                        block3: {
                            block5: {
                                block2: {
                                    if (!mt2.N()) break block2;
                                    xU2.Lw(mt2.S());
                                    break block3;
                                }
                                if (mt2.HM() || mt2.A() && mt2.OL().A0().equals("html")) break block4;
                                if (!oL.HM(mt2)) break block5;
                                Iw iw = xU2.e("html");
                                xU2.M(mt2.l8());
                                xU2.OL.add(iw);
                                xU2.OL.add(iw.pu("body"));
                                break block3;
                            }
                            if (!mt2.n()) break block6;
                        }
                        return true;
                    }
                    xU2.uS(this);
                    xU2.T(tT);
                    return xU2.l(mt2);
                }
                return xU2.b6(mt2, tT);
            }
        };
        W = oL3 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                block6: {
                    block7: {
                        block5: {
                            block4: {
                                if (!mt2.N()) break block4;
                                xU2.Lw(mt2.S());
                                break block5;
                            }
                            if (mt2.HM() || oL.HM(mt2) || mt2.A() && mt2.OL().A0().equals("html")) break block6;
                            if (!mt2.n()) break block7;
                        }
                        return true;
                    }
                    if (mt2.A() && mt2.OL().A0().equals("noframes")) {
                        return xU2.b6(mt2, b);
                    }
                    xU2.uS(this);
                    return false;
                }
                return xU2.b6(mt2, tT);
            }
        };
        C = oL2 = new oL(){

            @Override
            boolean n(mt mt2, xU xU2) {
                return true;
            }
        };
        r1 = new oL[]{oL24, oL23, oL22, oL21, oL20, oL19, oL18, oL17, oL16, oL15, oL14, oL13, oL12, oL11, oL10, oL9, oL8, oL7, oL6, oL5, oL4, oL3, oL2};
        OY = String.valueOf('\u0000');
    }

    private static boolean HM(mt mt2) {
        if (mt2.tT()) {
            return tv.l(mt2.l8().E9());
        }
        return false;
    }

    private static boolean N(String string) {
        return tv.l(string);
    }

    private static void l(mt.i i2, xU xU2) {
        xU2.T4.C(m.OL);
        xU2.Jb();
        xU2.T(N);
        xU2.y(i2);
    }

    private static void tT(mt.i i2, xU xU2) {
        xU2.T4.C(m.T4);
        xU2.Jb();
        xU2.T(N);
        xU2.y(i2);
    }

    abstract boolean n(mt var1, xU var2);

    static final class n {
        static final String[] A;
        static final String[] A0;
        static final String[] Bz;
        static final String[] C;
        static final String[] E9;
        static final String[] G;
        static final String[] H6;
        static final String[] HM;
        static final String[] Kf;
        static final String[] N;
        static final String[] O;
        static final String[] OL;
        static final String[] OY;
        static final String[] PP;
        static final String[] Q;
        static final String[] R;
        static final String[] S;
        static final String[] T4;
        static final String[] W;
        static final String[] b;
        static final String[] bc;
        static final String[] c;
        static final String[] cD;
        static final String[] d;
        static final String[] eD;
        static final String[] hR;
        static final String[] hd;
        static final String[] l;
        static final String[] l8;
        static final String[] n;
        static final String[] o;
        static final String[] oH;
        static final String[] r1;
        static final String[] rD;
        static final String[] s;
        static final String[] tT;
        static final String[] uS;
        static final String[] v;

        static {
            l8 = new String[]{"base", "basefont", "bgsound", "command", "link"};
            S = new String[]{"noframes", "style"};
            T4 = new String[]{"body", "br", "html"};
            b = new String[]{"body", "html"};
            OL = new String[]{"body", "br", "head", "html"};
            l = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            tT = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            N = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            HM = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            n = new String[]{"address", "div", "p"};
            v = new String[]{"dd", "dt"};
            A = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
            cD = new String[]{"applet", "marquee", "object"};
            s = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            hR = new String[]{"param", "source", "track"};
            Kf = new String[]{"action", "name", "prompt"};
            E9 = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            uS = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            c = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            eD = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            Q = new String[]{"tbody", "tfoot", "thead"};
            W = new String[]{"td", "th", "tr"};
            C = new String[]{"script", "style"};
            OY = new String[]{"td", "th"};
            r1 = new String[]{"body", "caption", "col", "colgroup", "html"};
            R = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            bc = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            G = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            rD = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            oH = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            A0 = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            hd = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            d = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            O = new String[]{"input", "keygen", "textarea"};
            Bz = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            H6 = new String[]{"tbody", "tfoot", "thead"};
            PP = new String[]{"head", "noscript"};
            o = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        }
    }
}

