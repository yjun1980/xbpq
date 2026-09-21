/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.B8;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.qS;
import com.github.catvod.spider.merge.rO;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

public class g9
extends Iw {
    private static final i3 v = new i3.MN("title");
    private aA A = new aA();
    private boolean Kf = false;
    private B8 cD;
    private final String hR;
    private ut s = ut.l8;

    public g9(String string) {
        super(hs.hR("#root", rO.l8), string);
        this.hR = string;
        this.cD = B8.S();
    }

    @Override
    public String C() {
        return super.Xc();
    }

    public g9 E7(ut ut2) {
        this.s = ut2;
        return this;
    }

    public aA K() {
        return this.A;
    }

    @Override
    public String Q() {
        return "#document";
    }

    public ut Qy() {
        return this.s;
    }

    public B8 T() {
        return this.cD;
    }

    public g9 Yr(B8 b8) {
        this.cD = b8;
        return this;
    }

    public g9 g() {
        g9 g92 = (g9)super.H();
        g92.A = this.A.T4();
        return g92;
    }

    public static class com.github.catvod.spider.merge.g9$aA
    implements Cloneable {
        private aA N;
        private boolean OL = true;
        private Charset S;
        private final ThreadLocal<CharsetEncoder> T4;
        @Nullable
        Y9.ut b;
        private boolean l = false;
        private Y9.Y l8 = Y9.Y.S;
        private int tT = 1;

        public com.github.catvod.spider.merge.g9$aA() {
            this.S = qS.S;
            this.T4 = new ThreadLocal();
            this.N = aA.l8;
        }

        public boolean HM() {
            return this.OL;
        }

        CharsetEncoder N() {
            CharsetEncoder charsetEncoder = this.S.newEncoder();
            this.T4.set(charsetEncoder);
            this.b = Y9.ut.l8(charsetEncoder.charset().name());
            return charsetEncoder;
        }

        public Y9.Y OL() {
            return this.l8;
        }

        public com.github.catvod.spider.merge.g9$aA S(Charset charset) {
            this.S = charset;
            return this;
        }

        public com.github.catvod.spider.merge.g9$aA T4() {
            com.github.catvod.spider.merge.g9$aA aA2;
            try {
                aA2 = (com.github.catvod.spider.merge.g9$aA)super.clone();
                aA2.l8(this.S.name());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new RuntimeException(cloneNotSupportedException);
            }
            aA2.l8 = Y9.Y.v(this.l8.name());
            return aA2;
        }

        CharsetEncoder b() {
            CharsetEncoder charsetEncoder = this.T4.get();
            if (charsetEncoder == null) {
                charsetEncoder = this.N();
            }
            return charsetEncoder;
        }

        public int l() {
            return this.tT;
        }

        public com.github.catvod.spider.merge.g9$aA l8(String string) {
            this.S(Charset.forName(string));
            return this;
        }

        public aA n() {
            return this.N;
        }

        public boolean tT() {
            return this.l;
        }

        public static final class aA
        extends Enum<aA> {
            public static final /* enum */ aA S;
            private static final aA[] T4;
            public static final /* enum */ aA l8;

            static {
                aA aA2;
                aA aA3;
                l8 = aA3 = new aA();
                S = aA2 = new aA();
                T4 = new aA[]{aA3, aA2};
            }
        }
    }

    public static final class ut
    extends Enum<ut> {
        public static final /* enum */ ut S;
        public static final /* enum */ ut T4;
        private static final ut[] b;
        public static final /* enum */ ut l8;

        static {
            ut ut2;
            ut ut3;
            ut ut4;
            l8 = ut4 = new ut();
            S = ut3 = new ut();
            T4 = ut2 = new ut();
            b = new ut[]{ut4, ut3, ut2};
        }
    }
}

