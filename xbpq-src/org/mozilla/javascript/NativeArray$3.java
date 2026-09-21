/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.AbstractList;
import org.mozilla.javascript.NativeArray;

class NativeArray$3
extends AbstractList {
    private int modCount;
    final NativeArray this$0;
    final int val$fromIndex;
    final int val$toIndex;

    NativeArray$3(NativeArray nativeArray, int n2, int n3) {
        this.this$0 = nativeArray;
        this.val$fromIndex = n2;
        this.val$toIndex = n3;
        this.modCount = NativeArray.access$000(nativeArray);
    }

    @Override
    public Object get(int n2) {
        NativeArray.access$100(this.this$0, this.modCount);
        return this.this$0.get(n2 + this.val$fromIndex);
    }

    @Override
    public int size() {
        NativeArray.access$100(this.this$0, this.modCount);
        return this.val$toIndex - this.val$fromIndex;
    }
}

