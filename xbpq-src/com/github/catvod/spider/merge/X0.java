/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pmw.tinylog.Logger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.pmw.tinylog.Logger;

public class X0
extends U {
    private final int S;
    private final String T4;

    public X0(Class<?> object) {
        object = object == null ? "null" : ((Class)object).getName();
        this((String)object);
    }

    public X0(String string) {
        this.T4 = string;
        this.S = Logger.getLevel((String)string).ordinal();
    }
}

