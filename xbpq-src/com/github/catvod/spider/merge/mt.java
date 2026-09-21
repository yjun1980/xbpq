/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.kA;

abstract class mt {
    Q l8;

    private mt() {
    }

    static void s(StringBuilder stringBuilder) {
        if (stringBuilder != null) {
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    final boolean A() {
        boolean bl = this.l8 == Q.S;
        return bl;
    }

    final boolean HM() {
        boolean bl = this.l8 == Q.l8;
        return bl;
    }

    final boolean N() {
        boolean bl = this.l8 == Q.b;
        return bl;
    }

    final i OL() {
        return (i)this;
    }

    final c S() {
        return (c)this;
    }

    final xq T4() {
        return (xq)this;
    }

    final XT b() {
        return (XT)this;
    }

    abstract mt cD();

    String hR() {
        return this.getClass().getSimpleName();
    }

    final boolean l() {
        return this instanceof ut;
    }

    final Y l8() {
        return (Y)this;
    }

    final boolean n() {
        boolean bl = this.l8 == Q.l;
        return bl;
    }

    final boolean tT() {
        boolean bl = this.l8 == Q.OL;
        return bl;
    }

    final boolean v() {
        boolean bl = this.l8 == Q.T4;
        return bl;
    }

    static final class OD
    extends mt {
        OD() {
            this.l8 = Q.l;
        }

        @Override
        mt cD() {
            return this;
        }

        public String toString() {
            return "";
        }
    }

    static abstract class Ph
    extends mt {
        boolean HM = false;
        private boolean N = false;
        private StringBuilder OL = new StringBuilder();
        protected String S;
        protected String T4;
        private String b;
        private String l;
        Rz n;
        private boolean tT = false;

        Ph() {
        }

        private void C() {
            this.N = true;
            String string = this.l;
            if (string != null) {
                this.OL.append(string);
                this.l = null;
            }
        }

        final String A0() {
            return this.T4;
        }

        final void E9(String string) {
            String string2 = this.b;
            if (string2 != null) {
                string = string2.concat(string);
            }
            this.b = string;
        }

        final String G() {
            String string = this.S;
            boolean bl = string == null || string.length() == 0;
            Rc.S(bl);
            return this.S;
        }

        final void Kf(char c2) {
            this.E9(String.valueOf(c2));
        }

        final String O() {
            String string = this.S;
            if (string == null) {
                string = "[unset]";
            }
            return string;
        }

        final void OY() {
            if (this.b != null) {
                this.oH();
            }
        }

        final void Q(char c2) {
            this.W(String.valueOf(c2));
        }

        final boolean R() {
            boolean bl = this.n != null;
            return bl;
        }

        final void W(String string) {
            String string2 = this.S;
            if (string2 != null) {
                string = string2.concat(string);
            }
            this.S = string;
            this.T4 = kA.l8(string);
        }

        final boolean bc() {
            return this.HM;
        }

        final void c(String string) {
            this.C();
            if (this.OL.length() == 0) {
                this.l = string;
            } else {
                this.OL.append(string);
            }
        }

        final void d() {
            this.tT = true;
        }

        final void eD(int[] nArray) {
            this.C();
            for (int n2 : nArray) {
                this.OL.appendCodePoint(n2);
            }
        }

        Ph hd() {
            this.S = null;
            this.T4 = null;
            this.b = null;
            mt.s(this.OL);
            this.l = null;
            this.tT = false;
            this.N = false;
            this.HM = false;
            this.n = null;
            return this;
        }

        final void oH() {
            String string;
            if (this.n == null) {
                this.n = new Rz();
            }
            if ((string = this.b) != null) {
                this.b = string = string.trim();
                if (string.length() > 0) {
                    string = this.N ? (this.OL.length() > 0 ? this.OL.toString() : this.l) : (this.tT ? "" : null);
                    this.n.b(this.b, string);
                }
            }
            this.b = null;
            this.tT = false;
            this.N = false;
            mt.s(this.OL);
            this.l = null;
        }

        final boolean r1(String string) {
            Rz rz = this.n;
            boolean bl = rz != null && rz.cD(string);
            return bl;
        }

        final Ph rD(String string) {
            this.S = string;
            this.T4 = kA.l8(string);
            return this;
        }

        final void uS(char c2) {
            this.C();
            this.OL.append(c2);
        }
    }

    public static final class Q
    extends Enum<Q> {
        public static final /* enum */ Q OL;
        public static final /* enum */ Q S;
        public static final /* enum */ Q T4;
        public static final /* enum */ Q b;
        public static final /* enum */ Q l;
        public static final /* enum */ Q l8;
        private static final Q[] tT;

        static {
            Q q2;
            Q q3;
            Q q4;
            Q q5;
            Q q6;
            Q q7;
            l8 = q7 = new Q();
            S = q6 = new Q();
            T4 = q5 = new Q();
            b = q4 = new Q();
            OL = q3 = new Q();
            l = q2 = new Q();
            tT = new Q[]{q7, q6, q5, q4, q3, q2};
        }

        public static Q[] l8() {
            return (Q[])tT.clone();
        }
    }

    static final class XT
    extends Ph {
        XT() {
            this.l8 = Q.T4;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("</");
            stringBuilder.append(this.O());
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    static class Y
    extends mt {
        private String S;

        Y() {
            this.l8 = Q.OL;
        }

        String E9() {
            return this.S;
        }

        Y Kf(String string) {
            this.S = string;
            return this;
        }

        @Override
        mt cD() {
            this.S = null;
            return this;
        }

        public String toString() {
            return this.E9();
        }
    }

    static final class c
    extends mt {
        private final StringBuilder S = new StringBuilder();
        private String T4;
        boolean b = false;

        c() {
            this.l8 = Q.b;
        }

        private void uS() {
            String string = this.T4;
            if (string != null) {
                this.S.append(string);
                this.T4 = null;
            }
        }

        final c E9(String string) {
            this.uS();
            if (this.S.length() == 0) {
                this.T4 = string;
            } else {
                this.S.append(string);
            }
            return this;
        }

        final c Kf(char c2) {
            this.uS();
            this.S.append(c2);
            return this;
        }

        String c() {
            String string = this.T4;
            if (string == null) {
                string = this.S.toString();
            }
            return string;
        }

        @Override
        mt cD() {
            mt.s(this.S);
            this.T4 = null;
            this.b = false;
            return this;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<!--");
            stringBuilder.append(this.c());
            stringBuilder.append("-->");
            return stringBuilder.toString();
        }
    }

    static final class i
    extends Ph {
        i() {
            this.l8 = Q.S;
        }

        i Bz(String string, Rz rz) {
            this.S = string;
            this.n = rz;
            this.T4 = kA.l8(string);
            return this;
        }

        @Override
        Ph hd() {
            super.hd();
            this.n = null;
            return this;
        }

        public String toString() {
            if (this.R() && this.n.size() > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<");
                stringBuilder.append(this.O());
                stringBuilder.append(" ");
                stringBuilder.append(this.n.toString());
                stringBuilder.append(">");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<");
            stringBuilder.append(this.O());
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    static final class ut
    extends Y {
        ut(String string) {
            this.Kf(string);
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<![CDATA[");
            stringBuilder.append(this.E9());
            stringBuilder.append("]]>");
            return stringBuilder.toString();
        }
    }

    static final class xq
    extends mt {
        final StringBuilder OL;
        final StringBuilder S = new StringBuilder();
        String T4 = null;
        final StringBuilder b = new StringBuilder();
        boolean l = false;

        xq() {
            this.OL = new StringBuilder();
            this.l8 = Q.l8;
        }

        String E9() {
            return this.T4;
        }

        String Kf() {
            return this.S.toString();
        }

        public String c() {
            return this.OL.toString();
        }

        @Override
        mt cD() {
            mt.s(this.S);
            this.T4 = null;
            mt.s(this.b);
            mt.s(this.OL);
            this.l = false;
            return this;
        }

        public boolean eD() {
            return this.l;
        }

        String uS() {
            return this.b.toString();
        }
    }
}

