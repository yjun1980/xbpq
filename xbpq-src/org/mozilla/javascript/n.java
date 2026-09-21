/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class n
implements Callable {
    public static final n b = new n(0);
    public static final n c = new n(1);
    public static final n d = new n(2);
    public static final n e = new n(3);
    public static final n f = new n(4);
    public final int a;

    public /* synthetic */ n(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.K(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.A(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.j(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeJavaObject.a(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.n(context, scriptable, scriptable2, objectArray);
    }
}

