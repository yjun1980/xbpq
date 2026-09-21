/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.B8;
import com.github.catvod.spider.merge.Ig;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.O;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.cz;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.kJ;
import com.github.catvod.spider.merge.mt;
import com.github.catvod.spider.merge.rO;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

abstract class gx {
    private mt.i HM = new mt.i();
    protected rO N;
    protected ArrayList<Iw> OL;
    kJ S;
    Ig T4;
    protected g9 b;
    protected String l;
    protected B8 l8;
    private mt.XT n = new mt.XT();
    protected mt tT;

    gx() {
    }

    public boolean HM(String string, Rz rz) {
        mt.i i2 = this.HM;
        if (this.tT == i2) {
            return this.l(new mt.i().Bz(string, rz));
        }
        i2.hd();
        i2.Bz(string, rz);
        return this.l(i2);
    }

    protected boolean N(String string) {
        mt.i i2 = this.HM;
        if (this.tT == i2) {
            return this.l(new mt.i().rD(string));
        }
        return this.l(i2.hd().rD(string));
    }

    @ParametersAreNonnullByDefault
    g9 OL(Reader reader, String string, B8 b8) {
        this.b(reader, string, b8);
        this.n();
        this.S.b();
        this.S = null;
        this.T4 = null;
        this.OL = null;
        return this.b;
    }

    abstract rO S();

    protected void T4(String string) {
        O o2 = this.l8.l8();
        if (o2.l8()) {
            o2.add(new cz(this.S.Bz(), string));
        }
    }

    @ParametersAreNonnullByDefault
    protected void b(Reader reader, String string, B8 b8) {
        g9 g92;
        Rc.n(reader, "String input must not be null");
        Rc.n(string, "BaseURI must not be null");
        Rc.HM(b8);
        this.b = g92 = new g9(string);
        g92.Yr(b8);
        this.l8 = b8;
        this.N = b8.b();
        this.S = new kJ(reader);
        this.tT = null;
        this.T4 = new Ig(this.S, b8.l8());
        this.OL = new ArrayList(32);
        this.l = string;
    }

    protected abstract boolean l(mt var1);

    protected Iw l8() {
        int n2 = this.OL.size();
        Iw iw = n2 > 0 ? this.OL.get(n2 - 1) : null;
        return iw;
    }

    protected void n() {
        mt mt2;
        Ig ig = this.T4;
        mt.Q q2 = mt.Q.l;
        do {
            mt2 = ig.W();
            this.l(mt2);
            mt2.cD();
        } while (mt2.l8 != q2);
    }

    protected boolean tT(String string) {
        mt mt2 = this.tT;
        mt.XT xT = this.n;
        if (mt2 == xT) {
            return this.l(new mt.XT().rD(string));
        }
        return this.l(xT.hd().rD(string));
    }
}

