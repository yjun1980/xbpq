/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.AccessController;
import java.security.ProtectionDomain;
import org.mozilla.javascript.RhinoSecurityManager;
import org.mozilla.javascript.SecurityUtilities$1;
import org.mozilla.javascript.SecurityUtilities$2;
import org.mozilla.javascript.SecurityUtilities$3;

public class SecurityUtilities {
    public static ProtectionDomain getProtectionDomain(Class<?> clazz) {
        return AccessController.doPrivileged(new SecurityUtilities$2(clazz));
    }

    public static ProtectionDomain getScriptProtectionDomain() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager instanceof RhinoSecurityManager) {
            return AccessController.doPrivileged(new SecurityUtilities$3(securityManager));
        }
        return null;
    }

    public static String getSystemProperty(String string) {
        return AccessController.doPrivileged(new SecurityUtilities$1(string));
    }
}

