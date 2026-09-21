/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.security.CodeSource;
import java.security.PrivilegedExceptionAction;
import org.mozilla.javascript.PolicySecurityController;
import org.mozilla.javascript.PolicySecurityController$Loader;
import org.mozilla.javascript.PolicySecurityController$SecureCaller;

class PolicySecurityController$3
implements PrivilegedExceptionAction<Object> {
    final PolicySecurityController this$0;
    final ClassLoader val$classLoader;
    final CodeSource val$codeSource;

    PolicySecurityController$3(PolicySecurityController policySecurityController, ClassLoader classLoader, CodeSource codeSource) {
        this.this$0 = policySecurityController;
        this.val$classLoader = classLoader;
        this.val$codeSource = codeSource;
    }

    @Override
    public Object run() {
        PolicySecurityController$Loader policySecurityController$Loader = new PolicySecurityController$Loader(this.val$classLoader, this.val$codeSource);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PolicySecurityController.SecureCaller.class.getName());
        stringBuilder.append("Impl");
        return policySecurityController$Loader.defineClass(stringBuilder.toString(), PolicySecurityController.access$000()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}

