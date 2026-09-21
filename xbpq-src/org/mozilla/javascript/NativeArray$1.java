/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Comparator;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

final class NativeArray$1
implements Comparator<Object> {
    final Object[] val$cmpBuf;
    final Context val$cx;
    final Scriptable val$funThis;
    final Callable val$jsCompareFunction;
    final Scriptable val$scope;

    NativeArray$1(Object[] objectArray, Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2) {
        this.val$cmpBuf = objectArray;
        this.val$jsCompareFunction = callable;
        this.val$cx = context;
        this.val$scope = scriptable;
        this.val$funThis = scriptable2;
    }

    @Override
    public int compare(Object object, Object object2) {
        Object[] objectArray = this.val$cmpBuf;
        objectArray[0] = object;
        objectArray[1] = object2;
        int n2 = Double.compare(ScriptRuntime.toNumber(this.val$jsCompareFunction.call(this.val$cx, this.val$scope, this.val$funThis, objectArray)), 0.0);
        if (n2 < 0) {
            return -1;
        }
        if (n2 > 0) {
            return 1;
        }
        return 0;
    }
}

