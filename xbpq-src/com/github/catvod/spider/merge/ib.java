/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jboss.logging.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Zv;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rv;
import org.jboss.logging.Logger;

public class ib
extends k {
    public ib() {
        super("JBoss Logging");
        this.l8(Logger.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        return new Zv(clazz);
    }
}

