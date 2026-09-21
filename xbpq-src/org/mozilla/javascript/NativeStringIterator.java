/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public final class NativeStringIterator
extends ES6Iterator {
    private static final String ITERATOR_TAG = "StringIterator";
    private static final long serialVersionUID = 1L;
    private int index;
    private String string;

    private NativeStringIterator() {
    }

    NativeStringIterator(Scriptable scriptable, Object object) {
        super(scriptable, ITERATOR_TAG);
        this.index = 0;
        this.string = ScriptRuntime.toString(object);
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        ES6Iterator.init(scriptableObject, bl, new NativeStringIterator(), ITERATOR_TAG);
    }

    @Override
    public String getClassName() {
        return "String Iterator";
    }

    @Override
    protected String getTag() {
        return ITERATOR_TAG;
    }

    @Override
    protected boolean isDone(Context context, Scriptable scriptable) {
        boolean bl = this.index >= this.string.length();
        return bl;
    }

    @Override
    protected Object nextValue(Context object, Scriptable scriptable) {
        int n2 = this.string.offsetByCodePoints(this.index, 1);
        object = this.string.substring(this.index, n2);
        this.index = n2;
        return object;
    }
}

