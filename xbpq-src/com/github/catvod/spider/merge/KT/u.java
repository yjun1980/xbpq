/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.KT;

import com.github.catvod.spider.merge.KT.y;
import com.github.catvod.spider.merge.xc.e0.d;
import com.github.catvod.spider.merge.xc.g0.c;
import java.util.ArrayList;

public final class u
extends c {
    public Object c;
    public String d;
    public Object e;
    public ArrayList f;
    public ArrayList g;
    public Object h;
    public final y i;
    public int j;

    public u(y y2, d d2) {
        this.i = y2;
        super(d2);
    }

    @Override
    public final Object invokeSuspend(Object object) {
        this.h = object;
        this.j |= Integer.MIN_VALUE;
        return y.a(this.i, null, null, this);
    }
}

