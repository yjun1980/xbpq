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

public final class l
implements Callable {
    public static final l b = new l(0);
    public static final l c = new l(1);
    public static final l d = new l(2);
    public static final l e = new l(3);
    public static final l f = new l(4);
    public final int a;

    public /* synthetic */ l(int n2) {
        this.a = n2;
    }

    @Override
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                return NativeMath.F(context, scriptable, scriptable2, objectArray);
            }
            case 2: {
                return NativeMath.z(context, scriptable, scriptable2, objectArray);
            }
            case 1: {
                return NativeMath.l(context, scriptable, scriptable2, objectArray);
            }
            case 0: {
                return NativeJSON.a(context, scriptable, scriptable2, objectArray);
            }
        }
        return NativePromise.m(context, scriptable, scriptable2, objectArray);
    }
}

