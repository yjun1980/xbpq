/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class s
implements Callable {
    public static final s b = new s(0);
    public static final s c = new s(1);
    public static final s d = new s(2);
    public static final s e = new s(3);
    public static final s f = new s(4);
    public final int a;

    public /* synthetic */ s(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.i(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.n(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.o(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.I(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.q(context, scriptable, scriptable2, objectArray);
    }
}

