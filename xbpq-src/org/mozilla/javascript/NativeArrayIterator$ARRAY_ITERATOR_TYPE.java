/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

public final class NativeArrayIterator$ARRAY_ITERATOR_TYPE
extends Enum<NativeArrayIterator$ARRAY_ITERATOR_TYPE> {
    private static final NativeArrayIterator$ARRAY_ITERATOR_TYPE[] $VALUES;
    public static final /* enum */ NativeArrayIterator$ARRAY_ITERATOR_TYPE ENTRIES;
    public static final /* enum */ NativeArrayIterator$ARRAY_ITERATOR_TYPE KEYS;
    public static final /* enum */ NativeArrayIterator$ARRAY_ITERATOR_TYPE VALUES;

    static {
        NativeArrayIterator$ARRAY_ITERATOR_TYPE nativeArrayIterator$ARRAY_ITERATOR_TYPE;
        NativeArrayIterator$ARRAY_ITERATOR_TYPE nativeArrayIterator$ARRAY_ITERATOR_TYPE2;
        NativeArrayIterator$ARRAY_ITERATOR_TYPE nativeArrayIterator$ARRAY_ITERATOR_TYPE3;
        ENTRIES = nativeArrayIterator$ARRAY_ITERATOR_TYPE3 = new NativeArrayIterator$ARRAY_ITERATOR_TYPE();
        KEYS = nativeArrayIterator$ARRAY_ITERATOR_TYPE2 = new NativeArrayIterator$ARRAY_ITERATOR_TYPE();
        VALUES = nativeArrayIterator$ARRAY_ITERATOR_TYPE = new NativeArrayIterator$ARRAY_ITERATOR_TYPE();
        $VALUES = new NativeArrayIterator$ARRAY_ITERATOR_TYPE[]{nativeArrayIterator$ARRAY_ITERATOR_TYPE3, nativeArrayIterator$ARRAY_ITERATOR_TYPE2, nativeArrayIterator$ARRAY_ITERATOR_TYPE};
    }

    public static NativeArrayIterator$ARRAY_ITERATOR_TYPE valueOf(String string) {
        return Enum.valueOf(NativeArrayIterator$ARRAY_ITERATOR_TYPE.class, string);
    }

    public static NativeArrayIterator$ARRAY_ITERATOR_TYPE[] values() {
        return (NativeArrayIterator$ARRAY_ITERATOR_TYPE[])$VALUES.clone();
    }
}

