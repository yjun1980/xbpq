/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.NativeObject$KeySet;

class NativeObject$KeySet$1
implements Iterator<Object> {
    Object[] ids;
    int index;
    Object key;
    final NativeObject$KeySet this$1;

    NativeObject$KeySet$1(NativeObject$KeySet nativeObject$KeySet) {
        this.this$1 = nativeObject$KeySet;
        this.ids = nativeObject$KeySet.this$0.getIds();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.index < this.ids.length;
        return bl;
    }

    @Override
    public Object next() {
        int n2;
        Object object;
        try {
            object = this.ids;
            n2 = this.index;
            this.index = n2 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            this.key = null;
            throw new NoSuchElementException();
        }
        object = object[n2];
        this.key = object;
        return object;
    }

    @Override
    public void remove() {
        Object object = this.key;
        if (object != null) {
            this.this$1.this$0.remove(object);
            this.key = null;
            return;
        }
        throw new IllegalStateException();
    }
}

