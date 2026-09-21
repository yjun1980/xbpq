/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import com.github.catvod.spider.merge.\u0131;
import com.github.catvod.spider.merge.\u013a;
import com.github.catvod.spider.merge.\u020b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

abstract class \u012d
extends \u020b {
    final ArrayList<\u020b> \u037f = new ArrayList();
    int \u0528 = 0;

    \u012d() {
    }

    \u012d(Collection<\u020b> collection) {
        this();
        this.\u037f.addAll(collection);
        this.\u052a();
    }

    void \u0528(\u020b \u020b2) {
        this.\u037f.set(this.\u0528 - 1, \u020b2);
    }

    @Nullable
    \u020b \u0529() {
        int n2 = this.\u0528;
        \u020b \u020b2 = n2 > 0 ? this.\u037f.get(n2 - 1) : null;
        return \u020b2;
    }

    void \u052a() {
        this.\u0528 = this.\u037f.size();
    }

    static final class \u037f
    extends \u012d {
        \u037f(Collection<\u020b> collection) {
            super(collection);
        }

        \u037f(\u020b ... \u020bArray) {
            this(Arrays.asList(\u020bArray));
        }

        public String toString() {
            return \u0131.\u058f(this.\u037f, "");
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            for (int i2 = this.\u0528 - 1; i2 >= 0; --i2) {
                if (this.\u037f.get(i2).\u037f(\u013a2, \u013a3)) continue;
                return false;
            }
            return true;
        }
    }

    static final class \u0528
    extends \u012d {
        \u0528() {
        }

        \u0528(Collection<\u020b> collection) {
            if (this.\u0528 > 1) {
                this.\u037f.add(new \u037f(collection));
            } else {
                this.\u037f.addAll(collection);
            }
            this.\u052a();
        }

        \u0528(\u020b ... \u020bArray) {
            this(Arrays.asList(\u020bArray));
        }

        public String toString() {
            return \u0131.\u058f(this.\u037f, SOY.d("5672"));
        }

        @Override
        public boolean \u037f(\u013a \u013a2, \u013a \u013a3) {
            for (int i2 = 0; i2 < this.\u0528; ++i2) {
                if (!this.\u037f.get(i2).\u037f(\u013a2, \u013a3)) continue;
                return true;
            }
            return false;
        }

        public void \u052b(\u020b \u020b2) {
            this.\u037f.add(\u020b2);
            this.\u052a();
        }
    }
}

