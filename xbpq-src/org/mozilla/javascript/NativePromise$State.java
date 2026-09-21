/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class NativePromise$State
extends Enum<NativePromise$State> {
    private static final NativePromise$State[] $VALUES;
    public static final /* enum */ NativePromise$State FULFILLED;
    public static final /* enum */ NativePromise$State PENDING;
    public static final /* enum */ NativePromise$State REJECTED;

    static {
        NativePromise$State nativePromise$State;
        NativePromise$State nativePromise$State2;
        NativePromise$State nativePromise$State3;
        PENDING = nativePromise$State3 = new NativePromise$State();
        FULFILLED = nativePromise$State2 = new NativePromise$State();
        REJECTED = nativePromise$State = new NativePromise$State();
        $VALUES = new NativePromise$State[]{nativePromise$State3, nativePromise$State2, nativePromise$State};
    }

    public static NativePromise$State valueOf(String string) {
        return Enum.valueOf(NativePromise$State.class, string);
    }

    public static NativePromise$State[] values() {
        return (NativePromise$State[])$VALUES.clone();
    }
}

