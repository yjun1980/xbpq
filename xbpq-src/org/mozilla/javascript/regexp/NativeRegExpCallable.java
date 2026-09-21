/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.regexp.NativeRegExp;
import org.mozilla.javascript.regexp.RECompiled;

class NativeRegExpCallable
extends NativeRegExp
implements Function {
    NativeRegExpCallable() {
    }

    NativeRegExpCallable(Scriptable scriptable, RECompiled rECompiled) {
        super(scriptable, rECompiled);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.execSub(context, scriptable, objectArray, 1);
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        return (Scriptable)this.execSub(context, scriptable, objectArray, 1);
    }
}

