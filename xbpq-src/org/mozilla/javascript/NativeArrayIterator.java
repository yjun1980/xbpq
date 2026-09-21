/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeArrayIterator$ARRAY_ITERATOR_TYPE;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

public final class NativeArrayIterator
extends ES6Iterator {
    private static final String ITERATOR_TAG = "ArrayIterator";
    private static final long serialVersionUID = 1L;
    private Scriptable arrayLike;
    private int index;
    private NativeArrayIterator$ARRAY_ITERATOR_TYPE type;

    private NativeArrayIterator() {
    }

    public NativeArrayIterator(Scriptable scriptable, Scriptable scriptable2, NativeArrayIterator$ARRAY_ITERATOR_TYPE nativeArrayIterator$ARRAY_ITERATOR_TYPE) {
        super(scriptable, ITERATOR_TAG);
        this.index = 0;
        this.arrayLike = scriptable2;
        this.type = nativeArrayIterator$ARRAY_ITERATOR_TYPE;
    }

    static void init(ScriptableObject scriptableObject, boolean bl) {
        ES6Iterator.init(scriptableObject, bl, new NativeArrayIterator(), ITERATOR_TAG);
    }

    @Override
    public String getClassName() {
        return "Array Iterator";
    }

    @Override
    protected String getTag() {
        return ITERATOR_TAG;
    }

    @Override
    protected boolean isDone(Context context, Scriptable scriptable) {
        boolean bl = (long)this.index >= NativeArray.getLengthProperty(context, this.arrayLike);
        return bl;
    }

    @Override
    protected Object nextValue(Context context, Scriptable scriptable) {
        Object object;
        if (this.type == NativeArrayIterator$ARRAY_ITERATOR_TYPE.KEYS) {
            int n2 = this.index;
            this.index = n2 + 1;
            return n2;
        }
        Object object2 = this.arrayLike;
        object2 = object = object2.get(this.index, (Scriptable)object2);
        if (object == Scriptable.NOT_FOUND) {
            object2 = Undefined.instance;
        }
        object = object2;
        if (this.type == NativeArrayIterator$ARRAY_ITERATOR_TYPE.ENTRIES) {
            object = context.newArray(scriptable, new Object[]{this.index, object2});
        }
        ++this.index;
        return object;
    }
}

