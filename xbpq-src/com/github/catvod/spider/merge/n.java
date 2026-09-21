/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.F;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rv;
import org.apache.logging.log4j.LogManager;

public class n
extends k {
    public n() {
        super("Log4j2");
        this.l8(LogManager.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        return new F(clazz);
    }
}

