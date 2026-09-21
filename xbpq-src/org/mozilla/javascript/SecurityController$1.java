/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;

class SecurityController$1
implements Script {
    final SecurityController this$0;
    final Object[] val$args;
    final Callable val$callable;
    final Scriptable val$thisObj;

    SecurityController$1(SecurityController securityController, Callable callable, Scriptable scriptable, Object[] objectArray) {
        this.this$0 = securityController;
        this.val$callable = callable;
        this.val$thisObj = scriptable;
        this.val$args = objectArray;
    }

    @Override
    public Object exec(Context context, Scriptable scriptable) {
        return this.val$callable.call(context, scriptable, this.val$thisObj, this.val$args);
    }
}

