/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Ig;
import com.github.catvod.spider.merge.kJ;
import com.github.catvod.spider.merge.mt;

abstract class m
extends Enum<m> {
    public static final /* enum */ m A;
    public static final /* enum */ m A0;
    public static final /* enum */ m B;
    public static final /* enum */ m Bz;
    public static final /* enum */ m C;
    public static final /* enum */ m DL;
    public static final /* enum */ m E9;
    public static final /* enum */ m FG;
    public static final /* enum */ m G;
    public static final /* enum */ m H;
    public static final /* enum */ m H6;
    public static final /* enum */ m HM;
    public static final /* enum */ m I;
    public static final /* enum */ m J;
    public static final /* enum */ m Jb;
    public static final /* enum */ m Kf;
    private static final m[] Kw;
    private static final String L;
    public static final /* enum */ m Lw;
    public static final /* enum */ m M;
    public static final /* enum */ m N;
    public static final /* enum */ m O;
    public static final /* enum */ m OL;
    public static final /* enum */ m OT;
    public static final /* enum */ m OY;
    public static final /* enum */ m PP;
    public static final /* enum */ m Q;
    public static final /* enum */ m R;
    public static final /* enum */ m S;
    public static final /* enum */ m T4;
    public static final /* enum */ m U;
    static final char[] UM;
    public static final /* enum */ m W;
    public static final /* enum */ m Ws;
    public static final /* enum */ m Xc;
    public static final /* enum */ m Y;
    public static final /* enum */ m b;
    static final char[] b6;
    public static final /* enum */ m bc;
    public static final /* enum */ m c;
    public static final /* enum */ m cD;
    public static final /* enum */ m d;
    public static final /* enum */ m e;
    public static final /* enum */ m eD;
    public static final /* enum */ m ec;
    public static final /* enum */ m f;
    public static final /* enum */ m gh;
    public static final /* enum */ m h;
    public static final /* enum */ m hR;
    public static final /* enum */ m hd;
    public static final /* enum */ m im;
    public static final /* enum */ m l;
    public static final /* enum */ m l8;
    public static final /* enum */ m m;
    public static final /* enum */ m mF;
    public static final /* enum */ m n;
    public static final /* enum */ m n6;
    public static final /* enum */ m nZ;
    public static final /* enum */ m o;
    public static final /* enum */ m oH;
    public static final /* enum */ m r0;
    public static final /* enum */ m r1;
    public static final /* enum */ m rD;
    public static final /* enum */ m s;
    public static final /* enum */ m t2;
    public static final /* enum */ m tT;
    public static final /* enum */ m uS;
    public static final /* enum */ m v;
    public static final /* enum */ m vi;
    public static final /* enum */ m x;
    public static final /* enum */ m y;

    static {
        l8 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '&') {
                        if (c2 != '<') {
                            if (c2 != '\uffff') {
                                ig.v(kJ2.tT());
                            } else {
                                ig.cD(new mt.OD());
                            }
                        } else {
                            ig.l8(N);
                        }
                    } else {
                        ig.l8(S);
                    }
                } else {
                    ig.eD(this);
                    ig.n(kJ2.OL());
                }
            }
        };
        S = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.n(ig, l8);
            }
        };
        T4 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '&') {
                        if (c2 != '<') {
                            if (c2 != '\uffff') {
                                ig.v(kJ2.tT());
                            } else {
                                ig.cD(new mt.OD());
                            }
                        } else {
                            ig.l8(v);
                        }
                    } else {
                        ig.l8(b);
                    }
                } else {
                    ig.eD(this);
                    kJ2.l8();
                    ig.n('\ufffd');
                }
            }
        };
        b = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.n(ig, T4);
            }
        };
        OL = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.A(ig, kJ2, (m)this, s);
            }
        };
        l = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.A(ig, kJ2, (m)this, E9);
            }
        };
        tT = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '\uffff') {
                        ig.v(kJ2.s('\u0000'));
                    } else {
                        ig.cD(new mt.OD());
                    }
                } else {
                    ig.eD(this);
                    kJ2.l8();
                    ig.n('\ufffd');
                }
            }
        };
        N = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '!') {
                    if (c2 != '/') {
                        if (c2 != '?') {
                            if (kJ2.hd()) {
                                ig.N(true);
                                ig.C(n);
                            } else {
                                ig.eD(this);
                                ig.n('<');
                                ig.C(l8);
                            }
                        } else {
                            ig.OL();
                            ig.l8(Lw);
                        }
                    } else {
                        ig.l8(HM);
                    }
                } else {
                    ig.l8(DL);
                }
            }
        };
        HM = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.Q()) {
                    ig.uS(this);
                    ig.v("</");
                    ig.C(l8);
                } else if (kJ2.hd()) {
                    ig.N(false);
                    ig.C(n);
                } else if (kJ2.R('>')) {
                    ig.eD(this);
                    ig.l8(l8);
                } else {
                    ig.eD(this);
                    ig.OL();
                    ig.l8(Lw);
                }
            }
        };
        n = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                block6: {
                    block0: {
                        block1: {
                            block2: {
                                block4: {
                                    block3: {
                                        block5: {
                                            String string = kJ2.cD();
                                            ig.v.W(string);
                                            char c2 = kJ2.OL();
                                            if (c2 == '\u0000') break block0;
                                            if (c2 == ' ') break block1;
                                            if (c2 == '/') break block2;
                                            if (c2 == '<') break block3;
                                            if (c2 == '>') break block4;
                                            if (c2 == '\uffff') break block5;
                                            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block1;
                                            ig.v.Q(c2);
                                            break block6;
                                        }
                                        ig.uS(this);
                                        ig.C(l8);
                                        break block6;
                                    }
                                    kJ2.o();
                                    ig.eD(this);
                                }
                                ig.E9();
                                ig.C(l8);
                                break block6;
                            }
                            ig.C(M);
                            break block6;
                        }
                        ig.C(O);
                        break block6;
                    }
                    ig.v.W(L);
                }
            }
        };
        v = new m(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.R('/')) {
                    ig.HM();
                    ig.l8(A);
                    return;
                }
                if (kJ2.hd() && ig.S() != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("</");
                    stringBuilder.append(ig.S());
                    if (!kJ2.c(stringBuilder.toString())) {
                        ig.v = ig.N(false).rD(ig.S());
                        ig.E9();
                        ig.C(N);
                        return;
                    }
                }
                ig.v("<");
                ig.C(T4);
            }
        };
        A = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.hd()) {
                    ig.N(false);
                    ig.v.Q(kJ2.eD());
                    ig.n.append(kJ2.eD());
                    ig.l8(cD);
                } else {
                    ig.v("</");
                    ig.C(T4);
                }
            }
        };
        cD = new m(){

            private void cD(Ig ig, kJ kJ2) {
                ig.v("</");
                ig.A(ig.n);
                kJ2.o();
                ig.C(T4);
            }

            @Override
            void HM(Ig ig, kJ object) {
                if (((kJ)object).hd()) {
                    object = ((kJ)object).n();
                    ig.v.W((String)object);
                    ig.n.append((String)object);
                    return;
                }
                char c2 = ((kJ)object).OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '/') {
                        if (c2 != '>') {
                            this.cD(ig, (kJ)object);
                        } else if (ig.Q()) {
                            ig.E9();
                            ig.C(l8);
                        } else {
                            this.cD(ig, (kJ)object);
                        }
                    } else if (ig.Q()) {
                        ig.C(M);
                    } else {
                        this.cD(ig, (kJ)object);
                    }
                } else if (ig.Q()) {
                    ig.C(O);
                } else {
                    this.cD(ig, (kJ)object);
                }
            }
        };
        s = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.R('/')) {
                    ig.HM();
                    ig.l8(hR);
                } else {
                    ig.n('<');
                    ig.C(OL);
                }
            }
        };
        hR = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.v(ig, kJ2, Kf, OL);
            }
        };
        Kf = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.N(ig, kJ2, OL);
            }
        };
        E9 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '!') {
                    if (c2 != '/') {
                        if (c2 != '\uffff') {
                            ig.v("<");
                            kJ2.o();
                            ig.C(l);
                        } else {
                            ig.v("<");
                            ig.uS(this);
                            ig.C(l8);
                        }
                    } else {
                        ig.HM();
                        ig.C(uS);
                    }
                } else {
                    ig.v("<!");
                    ig.C(eD);
                }
            }
        };
        uS = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.v(ig, kJ2, c, l);
            }
        };
        c = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.N(ig, kJ2, l);
            }
        };
        eD = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.R('-')) {
                    ig.n('-');
                    ig.l8(Q);
                } else {
                    ig.C(l);
                }
            }
        };
        Q = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.R('-')) {
                    ig.n('-');
                    ig.l8(OY);
                } else {
                    ig.C(l);
                }
            }
        };
        W = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.Q()) {
                    ig.uS(this);
                    ig.C(l8);
                    return;
                }
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            ig.v(kJ2.Kf('-', '<', '\u0000'));
                        } else {
                            ig.l8(r1);
                        }
                    } else {
                        ig.n('-');
                        ig.l8(C);
                    }
                } else {
                    ig.eD(this);
                    kJ2.l8();
                    ig.n('\ufffd');
                }
            }
        };
        C = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.Q()) {
                    ig.uS(this);
                    ig.C(l8);
                    return;
                }
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            ig.n(c2);
                            ig.C(W);
                        } else {
                            ig.C(r1);
                        }
                    } else {
                        ig.n(c2);
                        ig.C(OY);
                    }
                } else {
                    ig.eD(this);
                    ig.n('\ufffd');
                    ig.C(W);
                }
            }
        };
        OY = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.Q()) {
                    ig.uS(this);
                    ig.C(l8);
                    return;
                }
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            if (c2 != '>') {
                                ig.n(c2);
                                ig.C(W);
                            } else {
                                ig.n(c2);
                                ig.C(l);
                            }
                        } else {
                            ig.C(r1);
                        }
                    } else {
                        ig.n(c2);
                    }
                } else {
                    ig.eD(this);
                    ig.n('\ufffd');
                    ig.C(W);
                }
            }
        };
        r1 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.hd()) {
                    ig.HM();
                    ig.n.append(kJ2.eD());
                    ig.v("<");
                    ig.n(kJ2.eD());
                    ig.l8(G);
                } else if (kJ2.R('/')) {
                    ig.HM();
                    ig.l8(R);
                } else {
                    ig.n('<');
                    ig.C(W);
                }
            }
        };
        R = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.hd()) {
                    ig.N(false);
                    ig.v.Q(kJ2.eD());
                    ig.n.append(kJ2.eD());
                    ig.l8(bc);
                } else {
                    ig.v("</");
                    ig.C(W);
                }
            }
        };
        bc = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.N(ig, kJ2, W);
            }
        };
        G = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.tT(ig, kJ2, rD, W);
            }
        };
        rD = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            if (c2 != '\uffff') {
                                ig.v(kJ2.Kf('-', '<', '\u0000'));
                            } else {
                                ig.uS(this);
                                ig.C(l8);
                            }
                        } else {
                            ig.n(c2);
                            ig.l8(hd);
                        }
                    } else {
                        ig.n(c2);
                        ig.l8(oH);
                    }
                } else {
                    ig.eD(this);
                    kJ2.l8();
                    ig.n('\ufffd');
                }
            }
        };
        oH = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            if (c2 != '\uffff') {
                                ig.n(c2);
                                ig.C(rD);
                            } else {
                                ig.uS(this);
                                ig.C(l8);
                            }
                        } else {
                            ig.n(c2);
                            ig.C(hd);
                        }
                    } else {
                        ig.n(c2);
                        ig.C(A0);
                    }
                } else {
                    ig.eD(this);
                    ig.n('\ufffd');
                    ig.C(rD);
                }
            }
        };
        A0 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '<') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.n(c2);
                                    ig.C(rD);
                                } else {
                                    ig.uS(this);
                                    ig.C(l8);
                                }
                            } else {
                                ig.n(c2);
                                ig.C(l);
                            }
                        } else {
                            ig.n(c2);
                            ig.C(hd);
                        }
                    } else {
                        ig.n(c2);
                    }
                } else {
                    ig.eD(this);
                    ig.n('\ufffd');
                    ig.C(rD);
                }
            }
        };
        hd = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.R('/')) {
                    ig.n('/');
                    ig.HM();
                    ig.l8(d);
                } else {
                    ig.C(rD);
                }
            }
        };
        d = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                com.github.catvod.spider.merge.m.tT(ig, kJ2, W, rD);
            }
        };
        O = new m(){

            /*
             * Unable to fully structure code
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            void HM(Ig var1_1, kJ var2_2) {
                block5: {
                    var3_3 = var2_2.OL();
                    if (var3_3 == '\u0000') break block5;
                    if (var3_3 == ' ') return;
                    if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
                    if (var3_3 == '/') ** GOTO lbl24
                    if (var3_3 == '\uffff') ** GOTO lbl21
                    if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
                    switch (var3_3) {
                        default: {
                            var1_1.v.oH();
                            var2_2.o();
                            var1_1.C(com.github.catvod.spider.merge.m.Bz);
                            return;
                        }
                        case '<': {
                            var2_2.o();
                            var1_1.eD(this);
                        }
                        case '>': {
                            var1_1.E9();
                            var1_1.C(com.github.catvod.spider.merge.m.l8);
                            return;
                        }
lbl21:
                        // 1 sources

                        var1_1.uS(this);
                        var1_1.C(com.github.catvod.spider.merge.m.l8);
                        return;
lbl24:
                        // 1 sources

                        var1_1.C(com.github.catvod.spider.merge.m.M);
                        return;
                        case '=': lbl-1000:
                        // 2 sources

                        {
                            var1_1.eD(this);
                            var1_1.v.oH();
                            var1_1.v.Kf(var3_3);
                            var1_1.C(com.github.catvod.spider.merge.m.Bz);
                            return;
                        }
                    }
                }
                var2_2.o();
                var1_1.eD(this);
                var1_1.v.oH();
                var1_1.C(com.github.catvod.spider.merge.m.Bz);
            }
        };
        Bz = new m(){

            /*
             * Unable to fully structure code
             */
            @Override
            void HM(Ig var1_1, kJ var2_2) {
                block8: {
                    block6: {
                        block7: {
                            var4_3 = var2_2.E9(com.github.catvod.spider.merge.m.UM);
                            var1_1.v.E9(var4_3);
                            var3_4 = var2_2.OL();
                            if (var3_4 == '\u0000') break block6;
                            if (var3_4 == ' ') break block7;
                            if (var3_4 == '\"' || var3_4 == '\'') ** GOTO lbl-1000
                            if (var3_4 == '/') ** GOTO lbl25
                            if (var3_4 == '\uffff') ** GOTO lbl-1000
                            if (var3_4 != '\t' && var3_4 != '\n' && var3_4 != '\f' && var3_4 != '\r') {
                                switch (var3_4) {
                                    default: {
                                        var1_1.v.Kf(var3_4);
                                        break;
                                    }
                                    case '>': {
                                        var1_1.E9();
                                        var1_1.C(com.github.catvod.spider.merge.m.l8);
                                        break;
                                    }
                                    case '=': {
                                        var1_1.C(com.github.catvod.spider.merge.m.PP);
                                        break;
                                    }
                                }
                            }
                            break block7;
lbl-1000:
                            // 1 sources

                            {
                                var1_1.uS(this);
                                var1_1.C(com.github.catvod.spider.merge.m.l8);
                                break;
lbl25:
                                // 1 sources

                                var1_1.C(com.github.catvod.spider.merge.m.M);
                                break;
                                case '<': lbl-1000:
                                // 2 sources

                                {
                                    var1_1.eD(this);
                                    var1_1.v.Kf(var3_4);
                                    break;
                                }
                            }
                            break block8;
                        }
                        var1_1.C(com.github.catvod.spider.merge.m.H6);
                        break block8;
                    }
                    var1_1.eD(this);
                    var1_1.v.Kf('\ufffd');
                }
            }
        };
        H6 = new m(){

            /*
             * Unable to fully structure code
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            void HM(Ig var1_1, kJ var2_2) {
                block5: {
                    var3_3 = var2_2.OL();
                    if (var3_3 == '\u0000') break block5;
                    if (var3_3 == ' ') return;
                    if (var3_3 == '\"' || var3_3 == '\'') ** GOTO lbl-1000
                    if (var3_3 == '/') ** GOTO lbl24
                    if (var3_3 == '\uffff') ** GOTO lbl21
                    if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') return;
                    switch (var3_3) {
                        default: {
                            var1_1.v.oH();
                            var2_2.o();
                            var1_1.C(com.github.catvod.spider.merge.m.Bz);
                            return;
                        }
                        case '>': {
                            var1_1.E9();
                            var1_1.C(com.github.catvod.spider.merge.m.l8);
                            return;
                        }
                        case '=': {
                            var1_1.C(com.github.catvod.spider.merge.m.PP);
                            return;
                        }
lbl21:
                        // 1 sources

                        var1_1.uS(this);
                        var1_1.C(com.github.catvod.spider.merge.m.l8);
                        return;
lbl24:
                        // 1 sources

                        var1_1.C(com.github.catvod.spider.merge.m.M);
                        return;
                        case '<': lbl-1000:
                        // 2 sources

                        {
                            var1_1.eD(this);
                            var1_1.v.oH();
                            var1_1.v.Kf(var3_3);
                            var1_1.C(com.github.catvod.spider.merge.m.Bz);
                            return;
                        }
                    }
                }
                var1_1.eD(this);
                var1_1.v.Kf('\ufffd');
                var1_1.C(com.github.catvod.spider.merge.m.Bz);
            }
        };
        PP = new m(){

            /*
             * Unable to fully structure code
             */
            @Override
            void HM(Ig var1_1, kJ var2_2) {
                block5: {
                    block4: {
                        block6: {
                            var3_3 = var2_2.OL();
                            if (var3_3 == '\u0000') break block4;
                            if (var3_3 == ' ') break block5;
                            if (var3_3 == '\"') break block6;
                            if (var3_3 == '`') ** GOTO lbl-1000
                            if (var3_3 == '\uffff') ** GOTO lbl25
                            if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r') break block5;
                            if (var3_3 == '&') ** GOTO lbl22
                            if (var3_3 == '\'') ** GOTO lbl20
                            switch (var3_3) {
                                default: {
                                    var2_2.o();
                                    var1_1.C(com.github.catvod.spider.merge.m.y);
                                    break;
                                }
                                case '>': {
                                    var1_1.eD(this);
                                    var1_1.E9();
                                    var1_1.C(com.github.catvod.spider.merge.m.l8);
                                    break;
                                }
lbl20:
                                // 1 sources

                                var1_1.C(com.github.catvod.spider.merge.m.mF);
                                break;
lbl22:
                                // 1 sources

                                var2_2.o();
                                var1_1.C(com.github.catvod.spider.merge.m.y);
                                break;
lbl25:
                                // 1 sources

                                var1_1.uS(this);
                                var1_1.E9();
                                var1_1.C(com.github.catvod.spider.merge.m.l8);
                                break;
                                case '<': 
                                case '=': lbl-1000:
                                // 2 sources

                                {
                                    var1_1.eD(this);
                                    var1_1.v.uS(var3_3);
                                    var1_1.C(com.github.catvod.spider.merge.m.y);
                                    break;
                                }
                            }
                            break block5;
                        }
                        var1_1.C(com.github.catvod.spider.merge.m.o);
                        break block5;
                    }
                    var1_1.eD(this);
                    var1_1.v.uS('\ufffd');
                    var1_1.C(com.github.catvod.spider.merge.m.y);
                }
            }
        };
        o = new m(){

            @Override
            void HM(Ig ig, kJ object) {
                String string = ((kJ)object).l(false);
                if (string.length() > 0) {
                    ig.v.c(string);
                } else {
                    ig.v.d();
                }
                char c2 = ((kJ)object).OL();
                if (c2 != '\u0000') {
                    if (c2 != '\"') {
                        if (c2 != '&') {
                            if (c2 != '\uffff') {
                                ig.v.uS(c2);
                            } else {
                                ig.uS(this);
                                ig.C(l8);
                            }
                        } else {
                            object = ig.b(Character.valueOf('\"'), true);
                            if (object != null) {
                                ig.v.eD((int[])object);
                            } else {
                                ig.v.uS('&');
                            }
                        }
                    } else {
                        ig.C(Ws);
                    }
                } else {
                    ig.eD(this);
                    ig.v.uS('\ufffd');
                }
            }
        };
        mF = new m(){

            @Override
            void HM(Ig ig, kJ object) {
                String string = ((kJ)object).l(true);
                if (string.length() > 0) {
                    ig.v.c(string);
                } else {
                    ig.v.d();
                }
                char c2 = ((kJ)object).OL();
                if (c2 != '\u0000') {
                    if (c2 != '\uffff') {
                        if (c2 != '&') {
                            if (c2 != '\'') {
                                ig.v.uS(c2);
                            } else {
                                ig.C(Ws);
                            }
                        } else {
                            object = ig.b(Character.valueOf('\''), true);
                            if (object != null) {
                                ig.v.eD((int[])object);
                            } else {
                                ig.v.uS('&');
                            }
                        }
                    } else {
                        ig.uS(this);
                        ig.C(l8);
                    }
                } else {
                    ig.eD(this);
                    ig.v.uS('\ufffd');
                }
            }
        };
        y = new m(){

            /*
             * Unable to fully structure code
             */
            @Override
            void HM(Ig var1_1, kJ var2_2) {
                block9: {
                    block7: {
                        block8: {
                            var4_3 = var2_2.E9(com.github.catvod.spider.merge.m.b6);
                            if (var4_3.length() > 0) {
                                var1_1.v.c(var4_3);
                            }
                            if ((var3_4 = var2_2.OL()) == '\u0000') break block7;
                            if (var3_4 == ' ') break block8;
                            if (var3_4 == '\"' || var3_4 == '`') ** GOTO lbl-1000
                            if (var3_4 == '\uffff') ** GOTO lbl26
                            if (var3_4 == '\t' || var3_4 == '\n' || var3_4 == '\f' || var3_4 == '\r') break block8;
                            if (var3_4 == '&') ** GOTO lbl-1000
                            if (var3_4 != '\'') {
                                switch (var3_4) {
                                    default: {
                                        var1_1.v.uS(var3_4);
                                        break;
                                    }
                                    case '>': {
                                        var1_1.E9();
                                        var1_1.C(com.github.catvod.spider.merge.m.l8);
                                        break;
                                    }
                                }
                            }
                            ** GOTO lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var2_2 = var1_1.b(Character.valueOf('>'), true);
                                if (var2_2 != null) {
                                    var1_1.v.eD((int[])var2_2);
                                    break;
                                }
                                var1_1.v.uS('&');
                                break;
lbl26:
                                // 1 sources

                                var1_1.uS(this);
                                var1_1.C(com.github.catvod.spider.merge.m.l8);
                                break;
                                case '<': 
                                case '=': lbl-1000:
                                // 3 sources

                                {
                                    var1_1.eD(this);
                                    var1_1.v.uS(var3_4);
                                    break;
                                }
                            }
                            break block9;
                        }
                        var1_1.C(com.github.catvod.spider.merge.m.O);
                        break block9;
                    }
                    var1_1.eD(this);
                    var1_1.v.uS('\ufffd');
                }
            }
        };
        Ws = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '/') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                kJ2.o();
                                ig.eD(this);
                                ig.C(O);
                            } else {
                                ig.uS(this);
                                ig.C(l8);
                            }
                        } else {
                            ig.E9();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(M);
                    }
                } else {
                    ig.C(O);
                }
            }
        };
        M = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '>') {
                    if (c2 != '\uffff') {
                        kJ2.o();
                        ig.eD(this);
                        ig.C(O);
                    } else {
                        ig.uS(this);
                        ig.C(l8);
                    }
                } else {
                    ig.v.HM = true;
                    ig.E9();
                    ig.C(l8);
                }
            }
        };
        Lw = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                kJ2.o();
                ig.Kf.E9(kJ2.s('>'));
                char c2 = kJ2.OL();
                if (c2 == '>' || c2 == '\uffff') {
                    ig.hR();
                    ig.C(l8);
                }
            }
        };
        DL = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.OY("--")) {
                    ig.l();
                    ig.C(f);
                } else if (kJ2.r1("DOCTYPE")) {
                    ig.C(ec);
                } else if (kJ2.OY("[CDATA[")) {
                    ig.HM();
                    ig.C(m);
                } else {
                    ig.eD(this);
                    ig.OL();
                    ig.l8(Lw);
                }
            }
        };
        f = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                kJ2.o();
                                ig.C(FG);
                            } else {
                                ig.uS(this);
                                ig.hR();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(x);
                    }
                } else {
                    ig.eD(this);
                    ig.Kf.Kf('\ufffd');
                    ig.C(FG);
                }
            }
        };
        x = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.Kf.Kf(c2);
                                ig.C(FG);
                            } else {
                                ig.uS(this);
                                ig.hR();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(x);
                    }
                } else {
                    ig.eD(this);
                    ig.Kf.Kf('\ufffd');
                    ig.C(FG);
                }
            }
        };
        FG = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.eD();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '\uffff') {
                            ig.Kf.E9(kJ2.Kf('-', '\u0000'));
                        } else {
                            ig.uS(this);
                            ig.hR();
                            ig.C(l8);
                        }
                    } else {
                        ig.l8(B);
                    }
                } else {
                    ig.eD(this);
                    kJ2.l8();
                    ig.Kf.Kf('\ufffd');
                }
            }
        };
        B = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '\uffff') {
                            ig.Kf.Kf('-').Kf(c2);
                            ig.C(FG);
                        } else {
                            ig.uS(this);
                            ig.hR();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(Y);
                    }
                } else {
                    ig.eD(this);
                    ig.Kf.Kf('-').Kf('\ufffd');
                    ig.C(FG);
                }
            }
        };
        Y = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '!') {
                        if (c2 != '-') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.Kf.E9("--").Kf(c2);
                                    ig.C(FG);
                                } else {
                                    ig.uS(this);
                                    ig.hR();
                                    ig.C(l8);
                                }
                            } else {
                                ig.hR();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.Kf.Kf('-');
                        }
                    } else {
                        ig.eD(this);
                        ig.C(U);
                    }
                } else {
                    ig.eD(this);
                    ig.Kf.E9("--").Kf('\ufffd');
                    ig.C(FG);
                }
            }
        };
        U = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '-') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.Kf.E9("--!").Kf(c2);
                                ig.C(FG);
                            } else {
                                ig.uS(this);
                                ig.hR();
                                ig.C(l8);
                            }
                        } else {
                            ig.hR();
                            ig.C(l8);
                        }
                    } else {
                        ig.Kf.E9("--!");
                        ig.C(B);
                    }
                } else {
                    ig.eD(this);
                    ig.Kf.E9("--!").Kf('\ufffd');
                    ig.C(FG);
                }
            }
        };
        ec = new m(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            ig.eD(this);
                            ig.C(im);
                            return;
                        }
                        ig.uS(this);
                    }
                    ig.eD(this);
                    ig.tT();
                    ig.hR.l = true;
                    ig.Kf();
                    ig.C(l8);
                    return;
                }
                ig.C(im);
            }
        };
        im = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.hd()) {
                    ig.tT();
                    ig.C(H);
                    return;
                }
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != ' ') {
                        if (c2 != '\uffff') {
                            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r') {
                                ig.tT();
                                ig.hR.S.append(c2);
                                ig.C(H);
                            }
                        } else {
                            ig.uS(this);
                            ig.tT();
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    }
                } else {
                    ig.eD(this);
                    ig.tT();
                    ig.hR.S.append('\ufffd');
                    ig.C(H);
                }
            }
        };
        H = new m(){

            @Override
            void HM(Ig ig, kJ object) {
                block5: {
                    block1: {
                        block2: {
                            block3: {
                                block4: {
                                    if (((kJ)object).hd()) {
                                        object = ((kJ)object).n();
                                        ig.hR.S.append((String)object);
                                        return;
                                    }
                                    char c2 = ((kJ)object).OL();
                                    if (c2 == '\u0000') break block1;
                                    if (c2 == ' ') break block2;
                                    if (c2 == '>') break block3;
                                    if (c2 == '\uffff') break block4;
                                    if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r') break block2;
                                    ig.hR.S.append(c2);
                                    break block5;
                                }
                                ig.uS(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                                break block5;
                            }
                            ig.Kf();
                            ig.C(l8);
                            break block5;
                        }
                        ig.C(J);
                        break block5;
                    }
                    ig.eD(this);
                    ig.hR.S.append('\ufffd');
                }
            }
        };
        J = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                if (kJ2.Q()) {
                    ig.uS(this);
                    ig.hR.l = true;
                    ig.Kf();
                    ig.C(l8);
                    return;
                }
                if (kJ2.G('\t', '\n', '\r', '\f', ' ')) {
                    kJ2.l8();
                } else if (kJ2.R('>')) {
                    ig.Kf();
                    ig.l8(l8);
                } else if (kJ2.r1("PUBLIC")) {
                    ig.hR.T4 = "PUBLIC";
                    ig.C(I);
                } else if (kJ2.r1("SYSTEM")) {
                    ig.hR.T4 = "SYSTEM";
                    ig.C(Xc);
                } else {
                    ig.eD(this);
                    ig.hR.l = true;
                    ig.l8(e);
                }
            }
        };
        I = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.C(e);
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.eD(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.C(gh);
                        }
                    } else {
                        ig.eD(this);
                        ig.C(r0);
                    }
                } else {
                    ig.C(t2);
                }
            }
        };
        t2 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.C(e);
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.eD(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.C(gh);
                        }
                    } else {
                        ig.C(r0);
                    }
                }
            }
        };
        r0 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '\"') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.hR.b.append(c2);
                            } else {
                                ig.uS(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(Jb);
                    }
                } else {
                    ig.eD(this);
                    ig.hR.b.append('\ufffd');
                }
            }
        };
        gh = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.hR.b.append(c2);
                            } else {
                                ig.uS(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(Jb);
                    }
                } else {
                    ig.eD(this);
                    ig.hR.b.append('\ufffd');
                }
            }
        };
        Jb = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.C(e);
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.C(OT);
                        }
                    } else {
                        ig.eD(this);
                        ig.C(n6);
                    }
                } else {
                    ig.C(nZ);
                }
            }
        };
        nZ = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.C(e);
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.C(OT);
                        }
                    } else {
                        ig.eD(this);
                        ig.C(n6);
                    }
                }
            }
        };
        Xc = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.eD(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.C(OT);
                        }
                    } else {
                        ig.eD(this);
                        ig.C(n6);
                    }
                } else {
                    ig.C(h);
                }
            }
        };
        h = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '\"') {
                        if (c2 != '\'') {
                            if (c2 != '>') {
                                if (c2 != '\uffff') {
                                    ig.eD(this);
                                    ig.hR.l = true;
                                    ig.C(e);
                                } else {
                                    ig.uS(this);
                                    ig.hR.l = true;
                                    ig.Kf();
                                    ig.C(l8);
                                }
                            } else {
                                ig.eD(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.C(OT);
                        }
                    } else {
                        ig.C(n6);
                    }
                }
            }
        };
        n6 = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '\"') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.hR.OL.append(c2);
                            } else {
                                ig.uS(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(vi);
                    }
                } else {
                    ig.eD(this);
                    ig.hR.OL.append('\ufffd');
                }
            }
        };
        OT = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\u0000') {
                    if (c2 != '\'') {
                        if (c2 != '>') {
                            if (c2 != '\uffff') {
                                ig.hR.OL.append(c2);
                            } else {
                                ig.uS(this);
                                ig.hR.l = true;
                                ig.Kf();
                                ig.C(l8);
                            }
                        } else {
                            ig.eD(this);
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    } else {
                        ig.C(vi);
                    }
                } else {
                    ig.eD(this);
                    ig.hR.OL.append('\ufffd');
                }
            }
        };
        vi = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '>') {
                        if (c2 != '\uffff') {
                            ig.eD(this);
                            ig.C(e);
                        } else {
                            ig.uS(this);
                            ig.hR.l = true;
                            ig.Kf();
                            ig.C(l8);
                        }
                    } else {
                        ig.Kf();
                        ig.C(l8);
                    }
                }
            }
        };
        e = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                char c2 = kJ2.OL();
                if (c2 != '>') {
                    if (c2 == '\uffff') {
                        ig.Kf();
                        ig.C(l8);
                    }
                } else {
                    ig.Kf();
                    ig.C(l8);
                }
            }
        };
        m = new m(){

            @Override
            void HM(Ig ig, kJ kJ2) {
                String string = kJ2.hR("]]>");
                ig.n.append(string);
                if (kJ2.OY("]]>") || kJ2.Q()) {
                    ig.cD(new mt.ut(ig.n.toString()));
                    ig.C(l8);
                }
            }
        };
        Kw = new m[]{l8, S, T4, b, OL, l, tT, N, HM, n, v, A, cD, s, hR, Kf, E9, uS, c, eD, Q, W, C, OY, r1, R, bc, G, rD, oH, A0, hd, d, O, Bz, H6, PP, o, mF, y, Ws, M, Lw, DL, f, x, FG, B, Y, U, ec, im, H, J, I, t2, r0, gh, Jb, nZ, Xc, h, n6, OT, vi, e, m};
        UM = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        b6 = new char[]{'\u0000', '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        L = String.valueOf('\ufffd');
    }

    private static void A(Ig ig, kJ kJ2, m m2, m m3) {
        char c2 = kJ2.eD();
        if (c2 != '\u0000') {
            if (c2 != '<') {
                if (c2 != '\uffff') {
                    ig.v(kJ2.A());
                } else {
                    ig.cD(new mt.OD());
                }
            } else {
                ig.l8(m3);
            }
        } else {
            ig.eD(m2);
            kJ2.l8();
            ig.n('\ufffd');
        }
    }

    private static void N(Ig ig, kJ object, m m2) {
        boolean bl;
        if (((kJ)object).hd()) {
            object = ((kJ)object).n();
            ig.v.W((String)object);
            ig.n.append((String)object);
            return;
        }
        boolean bl2 = false;
        boolean bl3 = ig.Q();
        boolean bl4 = bl = true;
        if (bl3) {
            bl4 = bl;
            if (!((kJ)object).Q()) {
                char c2 = ((kJ)object).OL();
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 != '/') {
                        if (c2 != '>') {
                            ig.n.append(c2);
                            bl4 = true;
                        } else {
                            ig.E9();
                            ig.C(l8);
                            bl4 = bl2;
                        }
                    } else {
                        ig.C(M);
                        bl4 = bl2;
                    }
                } else {
                    ig.C(O);
                    bl4 = bl2;
                }
            }
        }
        if (bl4) {
            ig.v("</");
            ig.A(ig.n);
            ig.C(m2);
        }
    }

    private static void n(Ig ig, m m2) {
        int[] nArray = ig.b(null, false);
        if (nArray == null) {
            ig.n('&');
        } else {
            ig.s(nArray);
        }
        ig.C(m2);
    }

    private static void tT(Ig ig, kJ object, m m2, m m3) {
        if (((kJ)object).hd()) {
            object = ((kJ)object).n();
            ig.n.append((String)object);
            ig.v((String)object);
            return;
        }
        char c2 = ((kJ)object).OL();
        if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ' && c2 != '/' && c2 != '>') {
            ((kJ)object).o();
            ig.C(m3);
        } else {
            if (ig.n.toString().equals("script")) {
                ig.C(m2);
            } else {
                ig.C(m3);
            }
            ig.n(c2);
        }
    }

    private static void v(Ig ig, kJ kJ2, m m2, m m3) {
        if (kJ2.hd()) {
            ig.N(false);
            ig.C(m2);
        } else {
            ig.v("</");
            ig.C(m3);
        }
    }

    abstract void HM(Ig var1, kJ var2);
}

