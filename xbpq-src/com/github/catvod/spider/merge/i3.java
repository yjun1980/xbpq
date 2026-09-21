/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.DQ;
import com.github.catvod.spider.merge.E2;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Oi;
import com.github.catvod.spider.merge.Rc;
import com.github.catvod.spider.merge.g9;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.in;
import com.github.catvod.spider.merge.kA;
import com.github.catvod.spider.merge.qF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

public abstract class i3 {
    protected i3() {
    }

    public abstract boolean l8(Iw var1, Iw var2);

    public static final class D
    extends i3 {
        @Override
        public boolean l8(Iw object, Iw iw) {
            boolean bl;
            object = iw.L();
            boolean bl2 = bl = false;
            if (object != null) {
                if (object instanceof g9) {
                    bl2 = bl;
                } else {
                    object = ((Iw)object).im().iterator();
                    int n2 = 0;
                    while (object.hasNext()) {
                        if (!((Iw)object.next()).cE().equals(iw.cE())) continue;
                        ++n2;
                    }
                    bl2 = bl;
                    if (n2 == 1) {
                        bl2 = true;
                    }
                }
            }
            return bl2;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class F
    extends i3 {
        @Override
        public boolean l8(Iw iw, Iw iw2) {
            iw = iw2.L();
            boolean bl = true;
            if (iw == null || iw instanceof g9 || iw2.t2() != iw.im().size() - 1) {
                bl = false;
            }
            return bl;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class G
    extends i3 {
        private final String l8;

        public G(String string) {
            this.l8 = string;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.m().endsWith(this.l8);
        }

        public String toString() {
            return String.format("%s", this.l8);
        }
    }

    public static final class L
    extends rs {
        public L(int n2) {
            super(n2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.t2() == this.l8;
            return bl;
        }

        public String toString() {
            return String.format(":eq(%d)", this.l8);
        }
    }

    public static final class MN
    extends i3 {
        private final String l8;

        public MN(String string) {
            this.l8 = string;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.m().equals(this.l8);
        }

        public String toString() {
            return String.format("%s", this.l8);
        }
    }

    public static final class No
    extends r {
        public No(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int S(Iw iw, Iw iw2) {
            if (iw2.L() == null) {
                return 0;
            }
            return iw2.L().im().size() - iw2.t2();
        }

        @Override
        protected String T4() {
            return "nth-last-child";
        }
    }

    public static final class O5
    extends i3 {
        private final Pattern l8;

        public O5(Pattern pattern) {
            this.l8 = pattern;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.matcher(iw2.GO()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.l8);
        }
    }

    public static final class OD
    extends Y {
        public OD(String string, String string2) {
            super(string, string2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).contains(this.S);
            return bl;
        }

        public String toString() {
            return String.format("[%s*=%s]", this.l8, this.S);
        }
    }

    public static final class Ph
    extends Y {
        public Ph(String string, String string2) {
            super(string, string2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return this.S.equalsIgnoreCase(iw2.T4(this.l8)) ^ true;
        }

        public String toString() {
            return String.format("[%s!=%s]", this.l8, this.S);
        }
    }

    public static final class Q
    extends Y {
        public Q(String string, String string2) {
            super(string, string2, false);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).startsWith(this.S);
            return bl;
        }

        public String toString() {
            return String.format("[%s^=%s]", this.l8, this.S);
        }
    }

    public static final class U
    extends i3 {
        private final String l8;

        public U(String string) {
            this.l8 = kA.l8(string);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.GO()).contains(this.l8);
        }

        public String toString() {
            return String.format(":contains(%s)", this.l8);
        }
    }

    public static final class VT
    extends i3 {
        @Override
        public boolean l8(Iw iw, Iw iw2) {
            iw = iw2.L();
            boolean bl = iw != null && !(iw instanceof g9) && iw2.t2() == 0;
            return bl;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class X0
    extends i3 {
        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw instanceof g9;
            boolean bl2 = false;
            Iw iw3 = iw;
            if (bl) {
                iw3 = iw.U(0);
            }
            if (iw2 == iw3) {
                bl2 = true;
            }
            return bl2;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class XT
    extends Y {
        public XT(String string, String string2) {
            super(string, string2, false);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.Kf(this.l8) && kA.l8(iw2.T4(this.l8)).endsWith(this.S);
            return bl;
        }

        public String toString() {
            return String.format("[%s$=%s]", this.l8, this.S);
        }
    }

    public static abstract class Y
    extends i3 {
        String S;
        String l8;

        public Y(String string, String string2) {
            this(string, string2, true);
        }

        public Y(String string, String string2, boolean bl) {
            Rc.tT(string);
            Rc.tT(string2);
            this.l8 = kA.S(string);
            boolean bl2 = string2.startsWith("'") && string2.endsWith("'") || string2.startsWith("\"") && string2.endsWith("\"");
            string = string2;
            if (bl2) {
                string = string2.substring(1, string2.length() - 1);
            }
            string = bl ? kA.S(string) : kA.T4(string, bl2);
            this.S = string;
        }
    }

    public static final class Z
    extends r {
        public Z(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int S(Iw iw, Iw iw2) {
            return iw2.t2() + 1;
        }

        @Override
        protected String T4() {
            return "nth-child";
        }
    }

    public static final class Zv
    extends rs {
        public Zv(int n2) {
            super(n2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw != iw2 && iw2.t2() < this.l8;
            return bl;
        }

        public String toString() {
            return String.format(":lt(%d)", this.l8);
        }
    }

    public static final class a
    extends i3 {
        private final String l8;

        public a(String string) {
            this.l8 = string;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Jb(this.l8);
        }

        public String toString() {
            return String.format(".%s", this.l8);
        }
    }

    public static final class aA
    extends i3 {
        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class b
    extends i3 {
        private final String l8;

        public b(String string) {
            this.l8 = kA.l8(string);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.J()).contains(this.l8);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.l8);
        }
    }

    public static final class c
    extends i3 {
        private final String l8;

        public c(String string) {
            Rc.tT(string);
            this.l8 = kA.l8(string);
        }

        @Override
        public boolean l8(Iw object, Iw iw) {
            object = iw.OL().l().iterator();
            while (object.hasNext()) {
                if (!kA.l8(((in)object.next()).S()).startsWith(this.l8)) continue;
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.l8);
        }
    }

    public static final class cI
    extends i3 {
        private final String l8;

        public cI(String string) {
            this.l8 = kA.l8(string);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return kA.l8(iw2.UM()).contains(this.l8);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.l8);
        }
    }

    public static final class cp
    extends i3 {
        @Override
        public boolean l8(Iw iw, Iw iw2) {
            iw = iw2.L();
            boolean bl = iw != null && !(iw instanceof g9) && iw2.Ut().isEmpty();
            return bl;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class dY
    extends j {
        public dY() {
            super(0, 1);
        }

        @Override
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class ff
    extends i3 {
        @Override
        public boolean l8(Iw object, Iw iw) {
            if (iw instanceof E2) {
                return true;
            }
            for (DQ dQ : iw.KP()) {
                E2 e2 = new E2(hs.s(iw.F()), iw.l(), iw.OL());
                dQ.H6(e2);
                e2.f(dQ);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    public static final class i
    extends i3 {
        Pattern S;
        String l8;

        public i(String string, Pattern pattern) {
            this.l8 = kA.S(string);
            this.S = pattern;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.Kf(this.l8) && this.S.matcher(iw2.T4(this.l8)).find();
            return bl;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.l8, this.S.toString());
        }
    }

    public static final class ib
    extends i3 {
        @Override
        public boolean l8(Iw a022, Iw object) {
            Iterator<A0> iterator;
            for (A0 a02 : ((A0)((Object)iterator)).n()) {
                if (a02 instanceof qF || a02 instanceof Oi) continue;
                return false;
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class ii
    extends rs {
        public ii(int n2) {
            super(n2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.t2() > this.l8;
            return bl;
        }

        public String toString() {
            return String.format(":gt(%d)", this.l8);
        }
    }

    public static class j
    extends r {
        public j(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int S(Iw object, Iw iw) {
            int n2;
            Iw iw2;
            object = iw.L();
            int n3 = 0;
            if (object == null) {
                return 0;
            }
            object = iw.L().im().iterator();
            do {
                n2 = n3;
                if (!object.hasNext()) break;
                iw2 = (Iw)object.next();
                n2 = n3;
                if (iw2.cE().equals(iw.cE())) {
                    n2 = n3 + 1;
                }
                n3 = n2;
            } while (iw2 != iw);
            return n2;
        }

        @Override
        protected String T4() {
            return "nth-of-type";
        }
    }

    public static final class k
    extends i3 {
        private final String l8;

        public k(String string) {
            this.l8 = string;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.equals(iw2.h());
        }

        public String toString() {
            return String.format("#%s", this.l8);
        }
    }

    public static final class n
    extends ok {
        public n() {
            super(0, 1);
        }

        @Override
        public String toString() {
            return ":last-of-type";
        }
    }

    public static class ok
    extends r {
        public ok(int n2, int n3) {
            super(n2, n3);
        }

        @Override
        protected int S(Iw cloneable, Iw iw) {
            cloneable = iw.L();
            int n2 = 0;
            if (cloneable == null) {
                return 0;
            }
            cloneable = iw.L().im();
            for (int i2 = iw.t2(); i2 < ((ArrayList)cloneable).size(); ++i2) {
                int n3 = n2;
                if (((Iw)((ArrayList)cloneable).get(i2)).cE().equals(iw.cE())) {
                    n3 = n2 + 1;
                }
                n2 = n3;
            }
            return n2;
        }

        @Override
        protected String T4() {
            return "nth-last-of-type";
        }
    }

    public static final class p
    extends i3 {
        private final Pattern l8;

        public p(Pattern pattern) {
            this.l8 = pattern;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.matcher(iw2.UM()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.l8);
        }
    }

    public static abstract class r
    extends i3 {
        protected final int S;
        protected final int l8;

        public r(int n2, int n3) {
            this.l8 = n2;
            this.S = n3;
        }

        protected abstract int S(Iw var1, Iw var2);

        protected abstract String T4();

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            Iw iw3 = iw2.L();
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = bl;
            if (iw3 != null) {
                if (iw3 instanceof g9) {
                    bl3 = bl;
                } else {
                    int n2 = this.S(iw, iw2);
                    int n3 = this.l8;
                    if (n3 == 0) {
                        bl3 = bl2;
                        if (n2 == this.S) {
                            bl3 = true;
                        }
                        return bl3;
                    }
                    int n4 = this.S;
                    bl3 = bl;
                    if ((n2 - n4) * n3 >= 0) {
                        bl3 = bl;
                        if ((n2 - n4) % n3 == 0) {
                            bl3 = true;
                        }
                    }
                }
            }
            return bl3;
        }

        public String toString() {
            if (this.l8 == 0) {
                return String.format(":%s(%d)", this.T4(), this.S);
            }
            if (this.S == 0) {
                return String.format(":%s(%dn)", this.T4(), this.l8);
            }
            return String.format(":%s(%dn%+d)", this.T4(), this.l8, this.S);
        }
    }

    public static abstract class rs
    extends i3 {
        int l8;

        public rs(int n2) {
            this.l8 = n2;
        }
    }

    public static final class ut
    extends i3 {
        private final String l8;

        public ut(String string) {
            this.l8 = string;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return iw2.Kf(this.l8);
        }

        public String toString() {
            return String.format("[%s]", this.l8);
        }
    }

    public static final class xq
    extends Y {
        public xq(String string, String string2) {
            super(string, string2);
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw2.Kf(this.l8) && this.S.equalsIgnoreCase(iw2.T4(this.l8).trim());
            return bl;
        }

        public String toString() {
            return String.format("[%s=%s]", this.l8, this.S);
        }
    }
}

