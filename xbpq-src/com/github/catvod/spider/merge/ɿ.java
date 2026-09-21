/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u020b;

abstract class \u027f
extends \u020b {
    \u020b \u037f;

    \u027f() {
    }

    static class \u037f
    extends \u027f {
        public \u037f(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("403A30055C52097B"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a22, \u013a \u013a3) {
            for (\u013a \u013a22 : \u013a3.\u086a()) {
                if (\u013a22 == \u013a3 || !this.\u037f.\u037f(\u013a3, \u013a22)) continue;
                return true;
            }
            return false;
        }
    }

    static class \u0528
    extends \u027f {
        public \u0528(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("5F21714854"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = false;
            if (\u013a2 == \u013a3) {
                return false;
            }
            \u013a3 = \u013a3.\u08ad();
            boolean bl2 = bl;
            if (\u013a3 != null) {
                bl2 = bl;
                if (this.\u037f.\u037f(\u013a2, \u013a3)) {
                    bl2 = true;
                }
            }
            return bl2;
        }
    }

    static class \u052a
    extends \u027f {
        public \u052a(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("5F21715D54"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = false;
            if (\u013a2 == \u013a3) {
                return false;
            }
            \u013a3 = \u013a3.\u08b0();
            boolean bl2 = bl;
            if (\u013a3 != null) {
                bl2 = bl;
                if (this.\u037f.\u037f(\u013a2, \u013a3)) {
                    bl2 = true;
                }
            }
            return bl2;
        }
    }

    static class \u052c
    extends \u027f {
        public \u052c(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("403C3E025C52097B"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            return this.\u037f.\u037f(\u013a2, \u013a3) ^ true;
        }
    }

    static class \u052e
    extends \u027f {
        public \u052e(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("5F2171"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            if (\u013a2 == \u013a3) {
                return false;
            }
            for (\u013a3 = \u013a3.\u08ad(); \u013a3 != null; \u013a3 = \u013a3.\u08ad()) {
                if (this.\u037f.\u037f(\u013a2, \u013a3)) {
                    return true;
                }
                if (\u013a3 == \u013a2) break;
            }
            return false;
        }
    }

    static class \u058f
    extends \u027f {
        public \u058f(\u020b \u020b2) {
            this.\u037f = \u020b2;
        }

        public String toString() {
            \u020b \u020b2 = this.\u037f;
            return String.format(SOY.d("5F21710854"), \u020b2);
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            if (\u013a2 == \u013a3) {
                return false;
            }
            for (\u013a3 = \u013a3.\u08b0(); \u013a3 != null; \u013a3 = \u013a3.\u08b0()) {
                if (!this.\u037f.\u037f(\u013a2, \u013a3)) continue;
                return true;
            }
            return false;
        }
    }

    static class \u0620
    extends \u020b {
        \u0620() {
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            boolean bl = \u013a2 == \u013a3;
            return bl;
        }
    }
}

