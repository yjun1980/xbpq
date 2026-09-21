/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;

final class SecurityUtilities$1
implements PrivilegedAction<String> {
    final String val$name;

    SecurityUtilities$1(String string) {
        this.val$name = string;
    }

    @Override
    public String run() {
        return System.getProperty(this.val$name);
    }
}

