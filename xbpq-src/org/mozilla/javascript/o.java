/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;

public final class o
implements Callable {
    public static final o b = new o(0);
    public static final o c = new o(1);
    public static final o d = new o(2);
    public static final o e = new o(3);
    public final int a;

    public /* synthetic */ o(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return NativeMath.k(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.d(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeMath.q(context, scriptable, scriptable2, objectArray);
            }
        }
        return ScriptRuntimeES6.a(context, scriptable, scriptable2, objectArray);
    }
}

