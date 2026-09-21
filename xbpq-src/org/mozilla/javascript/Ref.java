/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public abstract class Ref
implements Serializable {
    private static final long serialVersionUID = 4044540354730911424L;

    public boolean delete(Context context) {
        return false;
    }

    public abstract Object get(Context var1);

    public boolean has(Context context) {
        return true;
    }

    @Deprecated
    public abstract Object set(Context var1, Object var2);

    public Object set(Context context, Scriptable scriptable, Object object) {
        return this.set(context, object);
    }
}

