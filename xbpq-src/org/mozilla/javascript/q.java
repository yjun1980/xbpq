/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.Scriptable;

public final class q
implements Callable {
    public static final q b = new q(0);
    public static final q c = new q(1);
    public static final q d = new q(2);
    public static final q e = new q(3);
    public final int a;

    public /* synthetic */ q(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return NativeMath.J(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.y(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.E(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativeMath.G(context, scriptable, scriptable2, objectArray);
    }
}

