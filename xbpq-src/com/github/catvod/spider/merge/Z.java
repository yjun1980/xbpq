/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.logtube.Logtube
 *  io.github.logtube.core.IEventLogger
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import io.github.logtube.Logtube;
import io.github.logtube.core.IEventLogger;

public class Z
extends U {
    private final IEventLogger S;

    public Z(IEventLogger iEventLogger) {
        this.S = iEventLogger;
    }

    public Z(Class<?> object) {
        object = object == null ? "null" : ((Class)object).getName();
        this((String)object);
    }

    public Z(String string) {
        this(Logtube.getLogger((String)string));
    }
}

