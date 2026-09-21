/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.tinylog.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.cp;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rv;
import org.tinylog.Logger;

public class D
extends k {
    public D() {
        super("TinyLog");
        this.l8(Logger.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        return new cp(clazz);
    }
}

