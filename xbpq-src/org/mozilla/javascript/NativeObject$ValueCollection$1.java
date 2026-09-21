/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeObject$ValueCollection;

class NativeObject$ValueCollection$1
implements Iterator<Object> {
    Object[] ids;
    int index;
    Object key;
    final NativeObject$ValueCollection this$1;

    NativeObject$ValueCollection$1(NativeObject$ValueCollection nativeObject$ValueCollection) {
        this.this$1 = nativeObject$ValueCollection;
        this.ids = nativeObject$ValueCollection.this$0.getIds();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.index < this.ids.length;
        return bl;
    }

    @Override
    public Object next() {
        NativeObject nativeObject = this.this$1.this$0;
        Object object = this.ids;
        int n2 = this.index;
        this.index = n2 + 1;
        this.key = object = object[n2];
        return nativeObject.get(object);
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

