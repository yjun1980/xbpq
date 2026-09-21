/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.security.Permission;
import java.util.Enumeration;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions;

class JavaPolicySecurity$ContextPermissions$1
implements Enumeration<Permission> {
    final JavaPolicySecurity.ContextPermissions this$0;

    JavaPolicySecurity$ContextPermissions$1(JavaPolicySecurity.ContextPermissions contextPermissions) {
        this.this$0 = contextPermissions;
    }

    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Permission nextElement() {
        return null;
    }
}

