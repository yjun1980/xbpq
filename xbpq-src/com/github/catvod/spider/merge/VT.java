/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.apache.log4j.Logger;

public class VT
extends U {
    private final Logger S;

    public VT(Class<?> object) {
        object = object == null ? "null" : ((Class)object).getName();
        this((String)object);
    }

    public VT(String string) {
        this(Logger.getLogger((String)string));
    }

    public VT(Logger logger) {
        this.S = logger;
    }
}

