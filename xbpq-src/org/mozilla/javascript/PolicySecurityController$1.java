/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.CodeSource;
import java.security.PrivilegedAction;
import org.mozilla.javascript.PolicySecurityController;
import org.mozilla.javascript.PolicySecurityController$Loader;

class PolicySecurityController$1
implements PrivilegedAction<Object> {
    final PolicySecurityController this$0;
    final ClassLoader val$parent;
    final Object val$securityDomain;

    PolicySecurityController$1(PolicySecurityController policySecurityController, ClassLoader classLoader, Object object) {
        this.this$0 = policySecurityController;
        this.val$parent = classLoader;
        this.val$securityDomain = object;
    }

    @Override
    public Object run() {
        return new PolicySecurityController$Loader(this.val$parent, (CodeSource)this.val$securityDomain);
    }
}

