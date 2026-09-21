/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pmw.tinylog.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.X0;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rv;
import org.pmw.tinylog.Logger;

public class ff
extends k {
    public ff() {
        super("TinyLog");
        this.l8(Logger.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        return new X0(clazz);
    }
}

