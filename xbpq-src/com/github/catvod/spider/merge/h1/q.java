/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativePromise;
import org.mozilla.javascript.Scriptable;

public final class q
implements Constructable {
    public static final q a = new q();

    private /* synthetic */ q() {
    }

    @Override
    public final Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        return NativePromise.l(context, scriptable, objectArray);
    }
}

