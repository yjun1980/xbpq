/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.Hashtable;
import org.mozilla.javascript.Hashtable$Entry;

final class Hashtable$Iter
implements Iterator<Hashtable$Entry> {
    private Hashtable$Entry pos;

    Hashtable$Iter(Hashtable$Entry hashtable$Entry) {
        Hashtable$Entry hashtable$Entry2 = Hashtable.access$000();
        hashtable$Entry2.next = hashtable$Entry;
        this.pos = hashtable$Entry2;
    }

    private void skipDeleted() {
        Hashtable$Entry hashtable$Entry;
        while ((hashtable$Entry = this.pos.next) != null && hashtable$Entry.deleted) {
            this.pos = hashtable$Entry;
        }
    }

    @Override
    public boolean hasNext() {
        this.skipDeleted();
        Hashtable$Entry hashtable$Entry = this.pos;
        boolean bl = hashtable$Entry != null && hashtable$Entry.next != null;
        return bl;
    }

    @Override
    public Hashtable$Entry next() {
        this.skipDeleted();
        Hashtable$Entry hashtable$Entry = this.pos;
        if (hashtable$Entry != null && (hashtable$Entry = hashtable$Entry.next) != null) {
            this.pos = hashtable$Entry;
            return hashtable$Entry;
        }
        throw new NoSuchElementException();
    }
}

