/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.tinylog.configuration.Configuration
 *  org.tinylog.format.AdvancedMessageFormatter
 *  org.tinylog.format.MessageFormatter
 *  org.tinylog.provider.LoggingProvider
 *  org.tinylog.provider.ProviderRegistry
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.U;
import org.tinylog.configuration.Configuration;
import org.tinylog.format.AdvancedMessageFormatter;
import org.tinylog.format.MessageFormatter;
import org.tinylog.provider.LoggingProvider;
import org.tinylog.provider.ProviderRegistry;

public class cp
extends U {
    private static final LoggingProvider S = ProviderRegistry.getLoggingProvider();
    private static final MessageFormatter T4 = new AdvancedMessageFormatter(Configuration.getLocale(), Configuration.isEscapingEnabled());
    private final String OL;
    private final int b;

    public cp(Class<?> object) {
        object = object == null ? "null" : ((Class)object).getName();
        this((String)object);
    }

    public cp(String string) {
        this.OL = string;
        this.b = S.getMinimumLevel().ordinal();
    }
}

