/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.i3;

abstract class cE
extends i3 {
    i3 l8;

    cE() {
    }

    static class OD
    extends cE {
        public OD(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            if (iw == iw2) {
                return false;
            }
            for (iw2 = iw2.W8(); iw2 != null; iw2 = iw2.W8()) {
                if (!this.l8.l8(iw, iw2)) continue;
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.l8);
        }
    }

    static class XT
    extends i3 {
        XT() {
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = iw == iw2;
            return bl;
        }
    }

    static class Y
    extends cE {
        public Y(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = false;
            if (iw == iw2) {
                return false;
            }
            iw2 = iw2.W8();
            boolean bl2 = bl;
            if (iw2 != null) {
                bl2 = bl;
                if (this.l8.l8(iw, iw2)) {
                    bl2 = true;
                }
            }
            return bl2;
        }

        public String toString() {
            return String.format("%s + ", this.l8);
        }
    }

    static class aA
    extends cE {
        public aA(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw3, Iw iw2) {
            for (Iw iw3 : iw2.gh()) {
                if (iw3 == iw2 || !this.l8.l8(iw2, iw3)) continue;
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.l8);
        }
    }

    static class c
    extends cE {
        public c(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            return this.l8.l8(iw, iw2) ^ true;
        }

        public String toString() {
            return String.format(":not(%s)", this.l8);
        }
    }

    static class ut
    extends cE {
        public ut(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            boolean bl = false;
            if (iw == iw2) {
                return false;
            }
            iw2 = iw2.L();
            boolean bl2 = bl;
            if (iw2 != null) {
                bl2 = bl;
                if (this.l8.l8(iw, iw2)) {
                    bl2 = true;
                }
            }
            return bl2;
        }

        public String toString() {
            return String.format("%s > ", this.l8);
        }
    }

    static class xq
    extends cE {
        public xq(i3 i32) {
            this.l8 = i32;
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            if (iw == iw2) {
                return false;
            }
            for (iw2 = iw2.L(); iw2 != null; iw2 = iw2.L()) {
                if (this.l8.l8(iw, iw2)) {
                    return true;
                }
                if (iw2 == iw) break;
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", this.l8);
        }
    }
}

