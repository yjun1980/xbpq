/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class r
implements Callable {
    public static final r b = new r(0);
    public static final r c = new r(1);
    public static final r d = new r(2);
    public static final r e = new r(3);
    public static final r f = new r(4);
    public final int a;

    public /* synthetic */ r(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.a(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.f(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.c(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.s(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.s(context, scriptable, scriptable2, objectArray);
    }
}

