/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Comparator;
import org.mozilla.javascript.ScriptRuntime;

public final class NativeArray$StringLikeComparator
implements Comparator<Object>,
Serializable {
    private static final long serialVersionUID = 5299017659728190979L;

    @Override
    public int compare(Object object, Object object2) {
        return ScriptRuntime.toString(object).compareTo(ScriptRuntime.toString(object2));
    }
}

