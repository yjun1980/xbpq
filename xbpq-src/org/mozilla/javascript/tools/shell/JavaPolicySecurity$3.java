/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.security.PrivilegedAction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;

class JavaPolicySecurity$3
implements PrivilegedAction<Object> {
    final JavaPolicySecurity this$0;
    final Object[] val$args;
    final Callable val$callable;
    final Context val$cx;
    final Scriptable val$scope;
    final Scriptable val$thisObj;

    JavaPolicySecurity$3(JavaPolicySecurity javaPolicySecurity, Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        this.this$0 = javaPolicySecurity;
        this.val$callable = callable;
        this.val$cx = context;
        this.val$scope = scriptable;
        this.val$thisObj = scriptable2;
        this.val$args = objectArray;
    }

    @Override
    public Object run() {
        return this.val$callable.call(this.val$cx, this.val$scope, this.val$thisObj, this.val$args);
    }
}

