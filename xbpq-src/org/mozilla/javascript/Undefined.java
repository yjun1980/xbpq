/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined$1;

public class Undefined
implements Serializable {
    public static final Scriptable SCRIPTABLE_UNDEFINED;
    public static final Object instance;
    private static final int instanceHash;
    private static final long serialVersionUID = 9195680630202616767L;

    static {
        Undefined undefined = new Undefined();
        instance = undefined;
        instanceHash = System.identityHashCode(undefined);
        SCRIPTABLE_UNDEFINED = new Undefined$1();
    }

    private Undefined() {
    }

    static /* synthetic */ int access$000() {
        return instanceHash;
    }

    public static boolean isUndefined(Object object) {
        boolean bl = instance == object || SCRIPTABLE_UNDEFINED == object;
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl = Undefined.isUndefined(object) || super.equals(object);
        return bl;
    }

    public int hashCode() {
        return instanceHash;
    }

    public Object readResolve() {
        return instance;
    }
}

