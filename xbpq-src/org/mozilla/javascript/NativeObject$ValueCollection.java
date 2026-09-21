/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.AbstractCollection;
import java.util.Iterator;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeObject$ValueCollection$1;

class NativeObject$ValueCollection
extends AbstractCollection<Object> {
    final NativeObject this$0;

    NativeObject$ValueCollection(NativeObject nativeObject) {
        this.this$0 = nativeObject;
    }

    @Override
    public Iterator<Object> iterator() {
        return new NativeObject$ValueCollection$1(this);
    }

    @Override
    public int size() {
        return this.this$0.size();
    }
}

