/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeObject$EntrySet$1;

class NativeObject$EntrySet
extends AbstractSet<Map.Entry<Object, Object>> {
    final NativeObject this$0;

    NativeObject$EntrySet(NativeObject nativeObject) {
        this.this$0 = nativeObject;
    }

    @Override
    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new NativeObject$EntrySet$1(this);
    }

    @Override
    public int size() {
        return this.this$0.size();
    }
}

