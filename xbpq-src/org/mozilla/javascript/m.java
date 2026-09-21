/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaMap;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.Scriptable;

public final class m
implements Callable {
    public static final m b = new m(0);
    public static final m c = new m(1);
    public static final m d = new m(2);
    public static final m e = new m(3);
    public final int a;

    public /* synthetic */ m(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return NativeMath.H(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.u(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeJavaMap.b(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativeMath.p(context, scriptable, scriptable2, objectArray);
    }
}

