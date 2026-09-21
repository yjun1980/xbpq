/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import javax.annotation.Nullable;

public final class Rc {
    public static void HM(@Nullable Object object) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException("Object must not be null");
    }

    public static void N(@Nullable String string, String string2) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static void OL(Object[] objectArray) {
        Rc.l(objectArray, "Array must not contain any null objects");
    }

    public static void S(boolean bl) {
        if (!bl) {
            return;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public static void T4(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public static void b(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static void l(Object[] objectArray, String string) {
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (objectArray[i2] != null) {
                continue;
            }
            throw new IllegalArgumentException(string);
        }
    }

    public static void l8(String string) {
        throw new IllegalArgumentException(string);
    }

    public static void n(@Nullable Object object, String string) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static void tT(@Nullable String string) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }
}

