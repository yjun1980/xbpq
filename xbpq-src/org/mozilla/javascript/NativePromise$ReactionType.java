/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class NativePromise$ReactionType
extends Enum<NativePromise$ReactionType> {
    private static final NativePromise$ReactionType[] $VALUES;
    public static final /* enum */ NativePromise$ReactionType FULFILL;
    public static final /* enum */ NativePromise$ReactionType REJECT;

    static {
        NativePromise$ReactionType nativePromise$ReactionType;
        NativePromise$ReactionType nativePromise$ReactionType2;
        FULFILL = nativePromise$ReactionType2 = new NativePromise$ReactionType();
        REJECT = nativePromise$ReactionType = new NativePromise$ReactionType();
        $VALUES = new NativePromise$ReactionType[]{nativePromise$ReactionType2, nativePromise$ReactionType};
    }

    public static NativePromise$ReactionType valueOf(String string) {
        return Enum.valueOf(NativePromise$ReactionType.class, string);
    }

    public static NativePromise$ReactionType[] values() {
        return (NativePromise$ReactionType[])$VALUES.clone();
    }
}

