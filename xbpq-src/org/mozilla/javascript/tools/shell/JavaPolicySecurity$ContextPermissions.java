/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.security.AccessControlContext;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.util.Enumeration;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions$1;

class JavaPolicySecurity$ContextPermissions
extends PermissionCollection {
    static final long serialVersionUID = -1721494496320750721L;
    AccessControlContext _context = AccessController.getContext();
    PermissionCollection _statisPermissions;

    JavaPolicySecurity$ContextPermissions(ProtectionDomain protectionDomain) {
        if (protectionDomain != null) {
            this._statisPermissions = protectionDomain.getPermissions();
        }
        this.setReadOnly();
    }

    @Override
    public void add(Permission permission) {
        throw new RuntimeException("NOT IMPLEMENTED");
    }

    @Override
    public Enumeration<Permission> elements() {
        return new JavaPolicySecurity$ContextPermissions$1(this);
    }

    @Override
    public boolean implies(Permission permission) {
        PermissionCollection permissionCollection = this._statisPermissions;
        if (permissionCollection != null && !permissionCollection.implies(permission)) {
            return false;
        }
        try {
            this._context.checkPermission(permission);
            return true;
        }
        catch (AccessControlException accessControlException) {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" (context=");
        stringBuilder.append(this._context);
        stringBuilder.append(", static_permitions=");
        stringBuilder.append(this._statisPermissions);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

