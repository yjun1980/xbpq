/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.E0.E;
import com.github.catvod.spider.merge.E0.F;
import com.github.catvod.spider.merge.E0.j0;
import com.github.catvod.spider.merge.E0.u;
import com.github.catvod.spider.merge.E0.v;
import com.github.catvod.spider.merge.E0.z;

final class w
extends v<F> {
    w() {
    }

    @Override
    final Object a(u u2, j0 j02, int n2) {
        return u2.a(j02, n2);
    }

    @Override
    final z<F> b(Object object) {
        return ((E)object).e;
    }

    @Override
    final z<F> c(Object object) {
        return ((E)object).u();
    }

    @Override
    final boolean d(j0 j02) {
        return j02 instanceof E;
    }

    @Override
    final void e(Object object) {
        ((E)object).e.k();
    }
}

