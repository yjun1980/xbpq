/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ContextFactory$GlobalSetter;

class ContextFactory$1GlobalSetterImpl
implements ContextFactory$GlobalSetter {
    ContextFactory$1GlobalSetterImpl() {
    }

    @Override
    public ContextFactory getContextFactoryGlobal() {
        return ContextFactory.access$000();
    }

    @Override
    public void setContextFactoryGlobal(ContextFactory contextFactory) {
        ContextFactory contextFactory2 = contextFactory;
        if (contextFactory == null) {
            contextFactory2 = new ContextFactory();
        }
        ContextFactory.access$002(contextFactory2);
    }
}

