/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Consumer;
import org.mozilla.javascript.Hashtable$Entry;

public final class b
implements Consumer {
    public static final b a = new b();

    private /* synthetic */ b() {
    }

    public final void accept(Object object) {
        ((Hashtable$Entry)object).clear();
    }
}

