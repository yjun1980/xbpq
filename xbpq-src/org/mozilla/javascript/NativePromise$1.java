/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.NativePromise$ReactionType;

class NativePromise$1 {
    static final int[] $SwitchMap$org$mozilla$javascript$NativePromise$ReactionType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[NativePromise$ReactionType.values().length];
        $SwitchMap$org$mozilla$javascript$NativePromise$ReactionType = nArray;
        try {
            nArray[NativePromise$ReactionType.FULFILL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            NativePromise$1.$SwitchMap$org$mozilla$javascript$NativePromise$ReactionType[NativePromise$ReactionType.REJECT.ordinal()] = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

