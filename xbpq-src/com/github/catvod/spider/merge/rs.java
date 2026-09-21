/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class rs
extends U {
    private final transient Log S;
    private final String T4;

    public rs(Class<?> object) {
        Log log = LogFactory.getLog(object);
        object = object == null ? "null" : ((Class)object).getName();
        this(log, (String)object);
    }

    public rs(Log log, String string) {
        this.S = log;
        this.T4 = string;
    }
}

