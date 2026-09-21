/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Comparator;
import org.mozilla.javascript.EqualObjectGraphs;

public final class a
implements Comparator {
    public static final a a = new a();

    private /* synthetic */ a() {
    }

    public final int compare(Object object, Object object2) {
        return EqualObjectGraphs.a(object, object2);
    }
}

