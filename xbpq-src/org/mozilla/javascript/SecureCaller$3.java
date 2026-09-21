/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import org.mozilla.javascript.SecureCaller;

final class SecureCaller$3
implements PrivilegedAction<Object> {
    SecureCaller$3() {
    }

    @Override
    public Object run() {
        return SecureCaller.access$100();
    }
}

