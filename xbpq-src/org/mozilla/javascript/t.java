/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class t
implements Callable {
    public static final t b = new t(0);
    public static final t c = new t(1);
    public static final t d = new t(2);
    public static final t e = new t(3);
    public static final t f = new t(4);
    public final int a;

    public /* synthetic */ t(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.x(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.L(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.t(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.g(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.g(context, scriptable, scriptable2, objectArray);
    }
}

