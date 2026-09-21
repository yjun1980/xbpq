/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.commonjs.module.provider;

import java.io.Serializable;
import java.net.URLConnection;
import org.mozilla.javascript.commonjs.module.provider.UrlConnectionExpiryCalculator;

public class DefaultUrlConnectionExpiryCalculator
implements UrlConnectionExpiryCalculator,
Serializable {
    private static final long serialVersionUID = 1L;
    private final long relativeExpiry;

    public DefaultUrlConnectionExpiryCalculator() {
        this(60000L);
    }

    public DefaultUrlConnectionExpiryCalculator(long l2) {
        if (l2 >= 0L) {
            this.relativeExpiry = l2;
            return;
        }
        throw new IllegalArgumentException("relativeExpiry < 0");
    }

    @Override
    public long calculateExpiry(URLConnection uRLConnection) {
        return System.currentTimeMillis() + this.relativeExpiry;
    }
}

