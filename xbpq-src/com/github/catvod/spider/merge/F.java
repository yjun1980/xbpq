/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class F
extends U {
    private final transient Logger S;

    public F(Class<?> clazz) {
        this(LogManager.getLogger(clazz));
    }

    public F(Logger logger) {
        this.S = logger;
    }
}

