/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.PrivilegedAction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.PolicySecurityController;

class PolicySecurityController$2
implements PrivilegedAction<Object> {
    final PolicySecurityController this$0;
    final Context val$cx;

    PolicySecurityController$2(PolicySecurityController policySecurityController, Context context) {
        this.this$0 = policySecurityController;
        this.val$cx = context;
    }

    @Override
    public Object run() {
        return this.val$cx.getApplicationClassLoader();
    }
}

