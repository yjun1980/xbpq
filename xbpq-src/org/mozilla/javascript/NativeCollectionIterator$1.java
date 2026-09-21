/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.NativeCollectionIterator$Type;

class NativeCollectionIterator$1 {
    static final int[] $SwitchMap$org$mozilla$javascript$NativeCollectionIterator$Type;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[NativeCollectionIterator$Type.values().length];
        $SwitchMap$org$mozilla$javascript$NativeCollectionIterator$Type = nArray;
        try {
            nArray[NativeCollectionIterator$Type.KEYS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            NativeCollectionIterator$1.$SwitchMap$org$mozilla$javascript$NativeCollectionIterator$Type[NativeCollectionIterator$Type.VALUES.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            NativeCollectionIterator$1.$SwitchMap$org$mozilla$javascript$NativeCollectionIterator$Type[NativeCollectionIterator$Type.BOTH.ordinal()] = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

