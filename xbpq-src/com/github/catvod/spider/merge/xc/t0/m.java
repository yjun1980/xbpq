/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.t0;

import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.c0.c;
import java.io.Serializable;

public abstract class m {
    public static final boolean a;

    static {
        Serializable serializable;
        try {
            serializable = Class.forName("android.os.Build");
        }
        catch (Throwable throwable) {
            serializable = com.github.catvod.spider.merge.xc.a.a.h(throwable);
        }
        a = serializable instanceof c ^ true;
    }
}

