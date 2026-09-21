/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u0142;
import com.github.catvod.spider.merge.\u020b;
import com.github.catvod.spider.merge.\u027e;
import com.github.catvod.spider.merge.\u0582;
import com.github.catvod.spider.merge.\u0e33;
import com.github.catvod.spider.merge.\u0f6c;
import javax.annotation.Nullable;

public class \u07fa {
    public static \u0e33 \u037f(\u020b \u020b2, \u013a \u013a2) {
        \u0e33 \u0e332 = new \u0e33();
        \u027e.\u0528(new \u037f(\u013a2, \u0e332, \u020b2), \u013a2);
        return \u0e332;
    }

    @Nullable
    public static \u013a \u0528(\u020b object, \u013a \u013a2) {
        object = new \u0528(\u013a2, (\u020b)object);
        \u027e.\u037f((\u0142)object, \u013a2);
        return ((\u0528)object).\u0528;
    }

    private static class \u037f
    implements \u0f6c {
        private final \u013a \u037f;
        private final \u0e33 \u0528;
        private final \u020b \u0529;

        \u037f(\u013a \u013a2, \u0e33 \u0e332, \u020b \u020b2) {
            this.\u037f = \u013a2;
            this.\u0528 = \u0e332;
            this.\u0529 = \u020b2;
        }

        @Override
        public void \u037f(\u0582 \u05822, int n2) {
        }

        @Override
        public void \u0528(\u0582 \u05822, int n2) {
            if (\u05822 instanceof \u013a && this.\u0529.\u037f(this.\u037f, (\u013a)(\u05822 = (\u013a)\u05822))) {
                this.\u0528.add(\u05822);
            }
        }
    }

    private static class \u0528
    implements \u0142 {
        private final \u013a \u037f;
        @Nullable
        private \u013a \u0528 = null;
        private final \u020b \u0529;

        \u0528(\u013a \u013a2, \u020b \u020b2) {
            this.\u037f = \u013a2;
            this.\u0529 = \u020b2;
        }

        @Override
        public \u0142.\u037f \u037f(\u0582 \u05822, int n2) {
            return \u0142.\u037f.\u037f;
        }

        @Override
        public \u0142.\u037f \u0528(\u0582 \u05822, int n2) {
            if (\u05822 instanceof \u013a && this.\u0529.\u037f(this.\u037f, (\u013a)(\u05822 = (\u013a)\u05822))) {
                this.\u0528 = \u05822;
                return \u0142.\u037f.\u052b;
            }
            return \u0142.\u037f.\u037f;
        }
    }
}

