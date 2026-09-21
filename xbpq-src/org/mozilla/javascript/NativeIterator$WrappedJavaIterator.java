/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.Scriptable;

public class NativeIterator$WrappedJavaIterator {
    private Iterator<?> iterator;
    private Scriptable scope;

    NativeIterator$WrappedJavaIterator(Iterator<?> iterator, Scriptable scriptable) {
        this.iterator = iterator;
        this.scope = scriptable;
    }

    public Object __iterator__(boolean bl) {
        return this;
    }

    public Object next() {
        if (this.iterator.hasNext()) {
            return this.iterator.next();
        }
        throw new JavaScriptException(NativeIterator.getStopIterationObject(this.scope), null, 0);
    }
}

