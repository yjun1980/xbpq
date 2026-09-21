/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.LazilyLoadedCtor;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Slot;

public class LazyLoadSlot
extends Slot {
    LazyLoadSlot(Slot slot) {
        super(slot);
    }

    @Override
    public Object getValue(Scriptable object) {
        Object object2;
        object = object2 = this.value;
        if (object2 instanceof LazilyLoadedCtor) {
            object2 = (LazilyLoadedCtor)object2;
            try {
                ((LazilyLoadedCtor)object2).init();
                this.value = object = ((LazilyLoadedCtor)object2).getValue();
            }
            catch (Throwable throwable) {
                this.value = ((LazilyLoadedCtor)object2).getValue();
                throw throwable;
            }
        }
        return object;
    }
}

