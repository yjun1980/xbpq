/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeMath;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class k
implements Callable {
    public static final k b = new k(0);
    public static final k c = new k(1);
    public static final k d = new k(2);
    public static final k e = new k(3);
    public static final k f = new k(4);
    public final int a;

    public /* synthetic */ k(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.C(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.w(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.m(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeJSON.c(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.a(context, scriptable, scriptable2, objectArray);
    }
}

