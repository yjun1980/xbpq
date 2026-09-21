/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider;

import com.github.catvod.spider.LocalFile;
import java.io.File;
import java.util.Comparator;

public final class \u052a
implements Comparator {
    public static final \u052a \u037f = new \u052a();

    private /* synthetic */ \u052a() {
    }

    public final int compare(Object object, Object object2) {
        return LocalFile.\u0529((File)object, (File)object2);
    }
}

