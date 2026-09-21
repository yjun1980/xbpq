/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.WrapFactory;

final class NativeJavaObject$JavaIterableIterator
extends ES6Iterator {
    private static final String ITERATOR_TAG = "JavaIterableIterator";
    private static final long serialVersionUID = 1L;
    private Iterator iterator;

    private NativeJavaObject$JavaIterableIterator() {
    }

    NativeJavaObject$JavaIterableIterator(Scriptable scriptable, Iterable iterable) {
        super(scriptable, ITERATOR_TAG);
        this.iterator = iterable.iterator();
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        ES6Iterator.init(scriptableObject, bl, new NativeJavaObject$JavaIterableIterator(), ITERATOR_TAG);
    }

    @Override
    public String getClassName() {
        return "Java Iterable Iterator";
    }

    @Override
    protected String getTag() {
        return ITERATOR_TAG;
    }

    @Override
    protected boolean isDone(Context context, Scriptable scriptable) {
        return this.iterator.hasNext() ^ true;
    }

    @Override
    protected Object nextValue(Context context, Scriptable object) {
        if (!this.iterator.hasNext()) {
            return Undefined.instance;
        }
        Object e2 = this.iterator.next();
        WrapFactory wrapFactory = context.getWrapFactory();
        object = e2 == null ? null : e2.getClass();
        return wrapFactory.wrap(context, this, e2, (Class<?>)object);
    }
}

