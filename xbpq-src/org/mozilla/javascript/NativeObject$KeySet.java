/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.AbstractSet;
import java.util.Iterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeObject$KeySet$1;

class NativeObject$KeySet
extends AbstractSet<Object> {
    final NativeObject this$0;

    NativeObject$KeySet(NativeObject nativeObject) {
        this.this$0 = nativeObject;
    }

    @Override
    public boolean contains(Object object) {
        return this.this$0.containsKey(object);
    }

    @Override
    public Iterator<Object> iterator() {
        return new NativeObject$KeySet$1(this);
    }

    @Override
    public int size() {
        return this.this$0.size();
    }
}

