/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.merge.J.j;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

class Douyu$1
extends BaseFunction {
    Douyu$1() {
    }

    @Override
    public Object call(Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        object = objectArray != null && objectArray.length != 0 ? Context.toString(objectArray[0]) : "";
        return j.c((String)object);
    }
}

