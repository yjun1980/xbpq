/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Wrapper;

public class Synchronizer
extends Delegator {
    private Object syncObject;

    public Synchronizer(Scriptable scriptable) {
        super(scriptable);
    }

    public Synchronizer(Scriptable scriptable, Object object) {
        super(scriptable);
        this.syncObject = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object call(Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Object object2 = this.syncObject;
        if (object2 == null) {
            object2 = scriptable2;
        }
        Object object3 = object2;
        if (object2 instanceof Wrapper) {
            object3 = ((Wrapper)object2).unwrap();
        }
        synchronized (object3) {
            return ((Function)this.obj).call((Context)object, scriptable, scriptable2, objectArray);
        }
    }
}

