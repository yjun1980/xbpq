/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.Method;
import java.util.Arrays;

final class JavaMembers$MethodSignature {
    private final Class<?>[] args;
    private final String name;

    private JavaMembers$MethodSignature(String string, Class<?>[] classArray) {
        this.name = string;
        this.args = classArray;
    }

    JavaMembers$MethodSignature(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof JavaMembers$MethodSignature;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (JavaMembers$MethodSignature)object;
            bl3 = bl;
            if (((JavaMembers$MethodSignature)object).name.equals(this.name)) {
                bl3 = bl;
                if (Arrays.equals(this.args, ((JavaMembers$MethodSignature)object).args)) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.args.length;
    }
}

