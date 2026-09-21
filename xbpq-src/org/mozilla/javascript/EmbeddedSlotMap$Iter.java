/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.Slot;

final class EmbeddedSlotMap$Iter
implements Iterator<Slot> {
    private Slot next;

    EmbeddedSlotMap$Iter(Slot slot) {
        this.next = slot;
    }

    @Override
    public boolean hasNext() {
        boolean bl = this.next != null;
        return bl;
    }

    @Override
    public Slot next() {
        Slot slot = this.next;
        if (slot != null) {
            this.next = slot.orderedNext;
            return slot;
        }
        throw new NoSuchElementException();
    }
}

