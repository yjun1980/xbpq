/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.SOY;
import javax.annotation.Nullable;

public final class \u01c3 {
    public static void \u037f(String string) {
        throw new IllegalArgumentException(string);
    }

    public static void \u0528(boolean bl) {
        if (!bl) {
            return;
        }
        throw new IllegalArgumentException(SOY.d("3727220254151F72371718041F"));
    }

    public static void \u0529(boolean bl) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(SOY.d("3727220254151F7225040112"));
    }

    public static void \u052a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static void \u052b(Object[] objectArray) {
        \u01c3.\u052c(objectArray, SOY.d("3B2023170D57172722025419152671151B190E3338185416142B7118011B16723E141E12192622"));
    }

    public static void \u052c(Object[] objectArray, String string) {
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (objectArray[i2] != null) {
                continue;
            }
            throw new IllegalArgumentException(string);
        }
    }

    public static void \u052d(@Nullable String string) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(SOY.d("2926231F1A105A3F24050057143D255616125A373C06000E"));
    }

    public static void \u052e(@Nullable String string, String string2) {
        if (string != null && string.length() != 0) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static void \u052f(@Nullable Object object) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(SOY.d("35303B1317035A3F24050057143D255616125A3C241A18"));
    }

    public static void \u058f(@Nullable Object object, String string) {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(string);
    }
}

