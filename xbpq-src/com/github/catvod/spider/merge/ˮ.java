/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.\u02b9;
import java.util.Objects;

public class \u02ee {
    static /* synthetic */ String \u037f(String string, Object[] objectArray) {
        return String.format(string, objectArray);
    }

    public static <T> T \u0528(T t2, String string, Object ... objectArray) {
        Objects.requireNonNull(t2, new \u02b9(string, objectArray));
        return t2;
    }
}

