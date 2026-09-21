/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.LocalFile;
import java.io.File;
import java.util.Comparator;

public final class \u0528
implements Comparator {
    public static final \u0528 \u037f = new \u0528();

    private /* synthetic */ \u0528() {
    }

    public final int compare(Object object, Object object2) {
        return LocalFile.\u0528((File)object, (File)object2);
    }
}

