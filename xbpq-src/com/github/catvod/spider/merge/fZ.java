/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Lk;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.jk;
import com.github.catvod.spider.merge.sB;
import com.github.catvod.spider.merge.uM;
import javax.annotation.Nullable;

public class fZ {
    @Nullable
    public static Iw S(i3 object, Iw iw) {
        object = new ut(iw, (i3)object);
        uM.l8((sB)object, iw);
        return ((ut)object).S;
    }

    public static jk l8(i3 i32, Iw iw) {
        jk jk2 = new jk();
        uM.S(new aA(iw, jk2, i32), iw);
        return jk2;
    }

    private static class aA
    implements Lk {
        private final jk S;
        private final i3 T4;
        private final Iw l8;

        aA(Iw iw, jk jk2, i3 i32) {
            this.l8 = iw;
            this.S = jk2;
            this.T4 = i32;
        }

        @Override
        public void S(A0 a02, int n2) {
            if (a02 instanceof Iw && this.T4.l8(this.l8, (Iw)(a02 = (Iw)a02))) {
                this.S.add(a02);
            }
        }

        @Override
        public void l8(A0 a02, int n2) {
        }
    }

    private static class ut
    implements sB {
        @Nullable
        private Iw S = null;
        private final i3 T4;
        private final Iw l8;

        ut(Iw iw, i3 i32) {
            this.l8 = iw;
            this.T4 = i32;
        }

        @Override
        public sB.aA S(A0 a02, int n2) {
            if (a02 instanceof Iw && this.T4.l8(this.l8, (Iw)(a02 = (Iw)a02))) {
                this.S = a02;
                return sB.aA.OL;
            }
            return sB.aA.l8;
        }

        @Override
        public sB.aA l8(A0 a02, int n2) {
            return sB.aA.l8;
        }
    }
}

