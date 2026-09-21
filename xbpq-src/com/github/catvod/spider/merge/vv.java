/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.A0;
import com.github.catvod.spider.merge.Iw;
import com.github.catvod.spider.merge.Rz;
import com.github.catvod.spider.merge.hs;
import com.github.catvod.spider.merge.jk;

public class vv
extends Iw {
    private final jk v = new jk();

    public vv(hs hs2, String string, Rz rz) {
        super(hs2, string, rz);
    }

    public vv K() {
        return (vv)super.H();
    }

    @Override
    protected void d(A0 a02) {
        super.d(a02);
        this.v.remove(a02);
    }

    public vv g(Iw iw) {
        this.v.add(iw);
        return this;
    }
}

