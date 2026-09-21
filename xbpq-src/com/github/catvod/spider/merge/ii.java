/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.logging.LogFactory
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.L;
import com.github.catvod.spider.merge.k;
import com.github.catvod.spider.merge.rs;
import com.github.catvod.spider.merge.rv;
import org.apache.commons.logging.LogFactory;

public class ii
extends k {
    public ii() {
        super("Apache Common Logging");
        this.l8(LogFactory.class);
    }

    @Override
    public rv S(Class<?> clazz) {
        try {
            L l2 = new L(clazz);
            return l2;
        }
        catch (Exception exception) {
            return new rs(clazz);
        }
    }

    @Override
    protected void l8(Class<?> clazz) {
        super.l8(clazz);
        this.T4(ii.class);
    }
}

