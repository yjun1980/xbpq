/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.i3;
import com.github.catvod.spider.merge.tv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

abstract class Wf
extends i3 {
    int S = 0;
    final ArrayList<i3> l8 = new ArrayList();

    Wf() {
    }

    Wf(Collection<i3> collection) {
        this();
        this.l8.addAll(collection);
        this.b();
    }

    void S(i3 i32) {
        this.l8.set(this.S - 1, i32);
    }

    @Nullable
    i3 T4() {
        int n2 = this.S;
        i3 i32 = n2 > 0 ? this.l8.get(n2 - 1) : null;
        return i32;
    }

    void b() {
        this.S = this.l8.size();
    }

    static final class aA
    extends Wf {
        aA(Collection<i3> collection) {
            super(collection);
        }

        aA(i3 ... i3Array) {
            this(Arrays.asList(i3Array));
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            for (int i2 = this.S - 1; i2 >= 0; --i2) {
                if (this.l8.get(i2).l8(iw, iw2)) continue;
                return false;
            }
            return true;
        }

        public String toString() {
            return tv.n(this.l8, "");
        }
    }

    static final class ut
    extends Wf {
        ut() {
        }

        ut(Collection<i3> collection) {
            if (this.S > 1) {
                this.l8.add(new aA(collection));
            } else {
                this.l8.addAll(collection);
            }
            this.b();
        }

        ut(i3 ... i3Array) {
            this(Arrays.asList(i3Array));
        }

        public void OL(i3 i32) {
            this.l8.add(i32);
            this.b();
        }

        @Override
        public boolean l8(Iw iw, Iw iw2) {
            for (int i2 = 0; i2 < this.S; ++i2) {
                if (!this.l8.get(i2).l8(iw, iw2)) continue;
                return true;
            }
            return false;
        }

        public String toString() {
            return tv.n(this.l8, ", ");
        }
    }
}

