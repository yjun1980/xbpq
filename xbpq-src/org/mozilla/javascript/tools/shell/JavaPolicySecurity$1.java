/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.tools.shell.Main;

class JavaPolicySecurity$1
implements PrivilegedAction<Object> {
    final JavaPolicySecurity this$0;
    final Context val$cx;
    final String val$filename;
    final Scriptable val$scope;

    JavaPolicySecurity$1(JavaPolicySecurity javaPolicySecurity, String string, Context context, Scriptable scriptable) {
        this.this$0 = javaPolicySecurity;
        this.val$filename = string;
        this.val$cx = context;
        this.val$scope = scriptable;
    }

    @Override
    public Object run() {
        URL uRL = JavaPolicySecurity.access$000(this.this$0, this.val$filename);
        ProtectionDomain protectionDomain = JavaPolicySecurity.access$100(this.this$0, uRL);
        try {
            Main.processFileSecure(this.val$cx, this.val$scope, uRL.toExternalForm(), protectionDomain);
            return null;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

