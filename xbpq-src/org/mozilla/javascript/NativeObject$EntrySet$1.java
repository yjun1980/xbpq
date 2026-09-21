/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.NativeObject$EntrySet;
import org.mozilla.javascript.NativeObject$EntrySet$1$1;

class NativeObject$EntrySet$1
implements Iterator<Map.Entry<Object, Object>> {
    Object[] ids;
    int index;
    Object key;
    final NativeObject$EntrySet this$1;

    NativeObject$EntrySet$1(NativeObject$EntrySet nativeObject$EntrySet) {
        this.this$1 = nativeObject$EntrySet;
        this.ids = nativeObject$EntrySet.this$0.getIds();
        this.key = null;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.index < this.ids.length;
        return bl;
    }

    @Override
    public Map.Entry<Object, Object> next() {
        Object object = this.ids;
        int n2 = this.index;
        this.index = n2 + 1;
        this.key = object = object[n2];
        return new NativeObject$EntrySet$1$1(this, object, this.this$1.this$0.get(object));
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

