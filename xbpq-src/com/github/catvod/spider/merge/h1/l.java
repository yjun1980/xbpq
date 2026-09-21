/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.h1;

import java.util.function.BiConsumer;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.Scriptable;

public final class l
implements BiConsumer {
    public final Scriptable a;

    public /* synthetic */ l(Scriptable scriptable) {
        this.a = scriptable;
    }

    public final void accept(Object object, Object object2) {
        NativeObject.a(this.a, object, object2);
    }
}

