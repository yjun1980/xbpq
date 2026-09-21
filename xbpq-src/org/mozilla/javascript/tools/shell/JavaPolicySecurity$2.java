/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity$Loader;

class JavaPolicySecurity$2
implements PrivilegedAction<JavaPolicySecurity$Loader> {
    final JavaPolicySecurity this$0;
    final ProtectionDomain val$domain;
    final ClassLoader val$parentLoader;

    JavaPolicySecurity$2(JavaPolicySecurity javaPolicySecurity, ClassLoader classLoader, ProtectionDomain protectionDomain) {
        this.this$0 = javaPolicySecurity;
        this.val$parentLoader = classLoader;
        this.val$domain = protectionDomain;
    }

    @Override
    public JavaPolicySecurity$Loader run() {
        return new JavaPolicySecurity$Loader(this.val$parentLoader, this.val$domain);
    }
}

