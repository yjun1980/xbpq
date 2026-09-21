/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jboss.logging.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.jboss.logging.Logger;

public class Zv
extends U {
    private final transient Logger S;

    public Zv(Class<?> object) {
        object = object == null ? "null" : ((Class)object).getName();
        this((String)object);
    }

    public Zv(String string) {
        this(Logger.getLogger((String)string));
    }

    public Zv(Logger logger) {
        this.S = logger;
    }
}

