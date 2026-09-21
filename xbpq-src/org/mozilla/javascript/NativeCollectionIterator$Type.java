/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class NativeCollectionIterator$Type
extends Enum<NativeCollectionIterator$Type> {
    private static final NativeCollectionIterator$Type[] $VALUES;
    public static final /* enum */ NativeCollectionIterator$Type BOTH;
    public static final /* enum */ NativeCollectionIterator$Type KEYS;
    public static final /* enum */ NativeCollectionIterator$Type VALUES;

    static {
        NativeCollectionIterator$Type nativeCollectionIterator$Type;
        NativeCollectionIterator$Type nativeCollectionIterator$Type2;
        NativeCollectionIterator$Type nativeCollectionIterator$Type3;
        KEYS = nativeCollectionIterator$Type3 = new NativeCollectionIterator$Type();
        VALUES = nativeCollectionIterator$Type2 = new NativeCollectionIterator$Type();
        BOTH = nativeCollectionIterator$Type = new NativeCollectionIterator$Type();
        $VALUES = new NativeCollectionIterator$Type[]{nativeCollectionIterator$Type3, nativeCollectionIterator$Type2, nativeCollectionIterator$Type};
    }

    public static NativeCollectionIterator$Type valueOf(String string) {
        return Enum.valueOf(NativeCollectionIterator$Type.class, string);
    }

    public static NativeCollectionIterator$Type[] values() {
        return (NativeCollectionIterator$Type[])$VALUES.clone();
    }
}

