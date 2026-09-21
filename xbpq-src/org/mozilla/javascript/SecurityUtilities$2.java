/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import java.security.ProtectionDomain;

final class SecurityUtilities$2
implements PrivilegedAction<ProtectionDomain> {
    final Class val$clazz;

    SecurityUtilities$2(Class clazz) {
        this.val$clazz = clazz;
    }

    @Override
    public ProtectionDomain run() {
        return this.val$clazz.getProtectionDomain();
    }
}

