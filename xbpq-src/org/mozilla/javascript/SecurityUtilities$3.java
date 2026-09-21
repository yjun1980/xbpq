/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import org.mozilla.javascript.RhinoSecurityManager;

final class SecurityUtilities$3
implements PrivilegedAction<ProtectionDomain> {
    final SecurityManager val$securityManager;

    SecurityUtilities$3(SecurityManager securityManager) {
        this.val$securityManager = securityManager;
    }

    @Override
    public ProtectionDomain run() {
        Class<?> clazz = ((RhinoSecurityManager)this.val$securityManager).getCurrentScriptClass();
        clazz = clazz == null ? null : clazz.getProtectionDomain();
        return clazz;
    }
}

