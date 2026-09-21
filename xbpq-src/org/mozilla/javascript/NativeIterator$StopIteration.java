/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

public class NativeIterator$StopIteration
extends NativeObject {
    private static final long serialVersionUID = 2485151085722377663L;
    private Object value;

    public NativeIterator$StopIteration() {
        this.value = Undefined.instance;
    }

    public NativeIterator$StopIteration(Object object) {
        Object object2 = Undefined.instance;
        this.value = object;
    }

    @Override
    public String getClassName() {
        return "StopIteration";
    }

    public Object getValue() {
        return this.value;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return scriptable instanceof NativeIterator$StopIteration;
    }
}

