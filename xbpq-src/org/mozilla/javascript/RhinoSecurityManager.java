/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.PolicySecurityController$SecureCaller;

public class RhinoSecurityManager
extends SecurityManager {
    protected Class<?> getCurrentScriptClass() {
        for (Class<?> clazz : this.getClassContext()) {
            if ((clazz == InterpretedFunction.class || !NativeFunction.class.isAssignableFrom(clazz)) && !PolicySecurityController$SecureCaller.class.isAssignableFrom(clazz)) continue;
            return clazz;
        }
        return null;
    }
}

