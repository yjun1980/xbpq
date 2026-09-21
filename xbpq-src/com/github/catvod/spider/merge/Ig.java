/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.O;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.cz;
import com.github.catvod.spider.merge.kJ;
import com.github.catvod.spider.merge.m;
import com.github.catvod.spider.merge.mt;
import java.util.Arrays;

final class Ig {
    static final int[] S;
    private static final char[] l8;
    mt.i A;
    private String E9;
    private StringBuilder HM;
    mt.c Kf;
    private String N = null;
    private m OL = m.l8;
    private final kJ T4;
    private final O b;
    private final int[] c;
    mt.XT cD;
    mt.xq hR;
    private mt l;
    StringBuilder n;
    mt.Y s;
    private boolean tT = false;
    private final int[] uS;
    mt.Ph v;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[7];
        cArray[0] = 9;
        cArray2[1] = 10;
        cArray2[2] = 13;
        cArray2[3] = 12;
        cArray2[4] = 32;
        cArray2[5] = 60;
        cArray2[6] = 38;
        l8 = cArray;
        S = new int[]{8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
        Arrays.sort(cArray);
    }

    Ig(kJ kJ2, O o2) {
        this.HM = new StringBuilder(1024);
        this.n = new StringBuilder(1024);
        this.A = new mt.i();
        this.cD = new mt.XT();
        this.s = new mt.Y();
        this.hR = new mt.xq();
        this.Kf = new mt.c();
        this.uS = new int[1];
        this.c = new int[2];
        this.T4 = kJ2;
        this.b = o2;
    }

    private void T4(String string) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Invalid character reference: %s", string));
        }
    }

    void A(StringBuilder stringBuilder) {
        if (this.N == null) {
            this.N = stringBuilder.toString();
        } else {
            if (this.HM.length() == 0) {
                this.HM.append(this.N);
            }
            this.HM.append((CharSequence)stringBuilder);
        }
    }

    void C(m m2) {
        this.OL = m2;
    }

    void E9() {
        this.v.OY();
        this.cD(this.v);
    }

    void HM() {
        mt.s(this.n);
    }

    void Kf() {
        this.cD(this.hR);
    }

    mt.Ph N(boolean bl) {
        mt.Ph ph = bl ? this.A.hd() : this.cD.hd();
        this.v = ph;
        return ph;
    }

    void OL() {
        this.Kf.cD();
        this.Kf.b = true;
    }

    boolean Q() {
        boolean bl = this.E9 != null && this.v.G().equalsIgnoreCase(this.E9);
        return bl;
    }

    String S() {
        return this.E9;
    }

    mt W() {
        while (!this.tT) {
            this.OL.HM(this, this.T4);
        }
        Object object = this.HM;
        if (((StringBuilder)object).length() != 0) {
            String string = ((StringBuilder)object).toString();
            ((StringBuilder)object).delete(0, ((StringBuilder)object).length());
            this.N = null;
            return this.s.Kf(string);
        }
        object = this.N;
        if (object != null) {
            object = this.s.Kf((String)object);
            this.N = null;
            return object;
        }
        this.tT = false;
        return this.l;
    }

    int[] b(Character object, boolean bl) {
        if (this.T4.Q()) {
            return null;
        }
        if (object != null && ((Character)object).charValue() == this.T4.eD()) {
            return null;
        }
        if (this.T4.rD(l8)) {
            return null;
        }
        Object object2 = this.uS;
        this.T4.C();
        if (this.T4.OY("#")) {
            bl = this.T4.r1("X");
            object = this.T4;
            object = bl ? ((kJ)object).HM() : ((kJ)object).N();
            if (((String)object).length() == 0) {
                this.T4("numeric reference with no numerals");
                this.T4.PP();
                return null;
            }
            this.T4.mF();
            if (!this.T4.OY(";")) {
                this.T4("missing semicolon");
            }
            int n2 = bl ? 16 : 10;
            try {
                n2 = Integer.valueOf((String)object, n2);
            }
            catch (NumberFormatException numberFormatException) {
                n2 = -1;
            }
            if (n2 != -1 && (n2 < 55296 || n2 > 57343) && n2 <= 0x10FFFF) {
                Object object3 = n2;
                if (n2 >= 128) {
                    object = S;
                    object3 = n2;
                    if (n2 < ((Object)object).length + 128) {
                        this.T4("character is not a valid unicode code point");
                        object3 = object[n2 - 128];
                    }
                }
                object2[0] = object3;
            } else {
                this.T4("character outside of valid range");
                object2[0] = 65533;
            }
            return object2;
        }
        object = this.T4.v();
        boolean bl2 = this.T4.R(';');
        int n3 = !(Y9.l((String)object) || Y9.tT((String)object) && bl2) ? 0 : 1;
        if (n3 == 0) {
            this.T4.PP();
            if (bl2) {
                this.T4("invalid named reference");
            }
            return null;
        }
        if (bl && (this.T4.hd() || this.T4.oH() || this.T4.G('=', '-', '_'))) {
            this.T4.PP();
            return null;
        }
        this.T4.mF();
        if (!this.T4.OY(";")) {
            this.T4("missing semicolon");
        }
        if ((n3 = Y9.b((String)object, this.c)) == 1) {
            object2[0] = this.c[0];
            return object2;
        }
        if (n3 == 2) {
            return this.c;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unexpected characters returned for ");
        ((StringBuilder)object2).append((String)object);
        Rc.l8(((StringBuilder)object2).toString());
        return this.c;
    }

    void c(String string) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), string));
        }
    }

    void cD(mt mt2) {
        Rc.S(this.tT);
        this.l = mt2;
        this.tT = true;
        mt.Q q2 = mt2.l8;
        if (q2 == mt.Q.S) {
            this.E9 = ((mt.i)mt2).S;
        } else if (q2 == mt.Q.T4 && ((mt.XT)mt2).R()) {
            this.c("Attributes incorrectly present on end tag");
        }
    }

    void eD(m m2) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(this.T4.eD()), m2}));
        }
    }

    void hR() {
        this.cD(this.Kf);
    }

    void l() {
        this.Kf.cD();
    }

    void l8(m m2) {
        this.T4.l8();
        this.OL = m2;
    }

    void n(char c2) {
        if (this.N == null) {
            this.N = String.valueOf(c2);
        } else {
            if (this.HM.length() == 0) {
                this.HM.append(this.N);
            }
            this.HM.append(c2);
        }
    }

    void s(int[] nArray) {
        this.v(new String(nArray, 0, nArray.length));
    }

    void tT() {
        this.hR.cD();
    }

    void uS(m m2) {
        if (this.b.l8()) {
            this.b.add(new cz(this.T4.Bz(), "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{m2}));
        }
    }

    void v(String string) {
        if (this.N == null) {
            this.N = string;
        } else {
            if (this.HM.length() == 0) {
                this.HM.append(this.N);
            }
            this.HM.append(string);
        }
    }
}

