/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.Scriptable;

public final class p
implements Callable {
    public static final p b = new p(0);
    public static final p c = new p(1);
    public static final p d = new p(2);
    public static final p e = new p(3);
    public final int a;

    public /* synthetic */ p(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return NativeMath.r(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.D(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.v(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativeMath.B(context, scriptable, scriptable2, objectArray);
    }
}

