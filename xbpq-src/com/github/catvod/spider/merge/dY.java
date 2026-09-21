/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.VT;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rv;
import org.apache.log4j.Logger;

public class dY
extends k {
    public dY() {
        super("Log4j");
        this.l8(Logger.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        return new VT(clazz);
    }
}

