/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.concurrent.locks.StampedLock;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMapContainer;

class ThreadSafeSlotMapContainer
extends SlotMapContainer {
    static final boolean $assertionsDisabled = false;
    private final StampedLock lock = new StampedLock();

    ThreadSafeSlotMapContainer() {
    }

    ThreadSafeSlotMapContainer(int n2) {
        super(n2);
    }

    @Override
    public void add(Slot slot) {
        long l2 = this.lock.writeLock();
        try {
            this.checkMapSize();
            this.map.add(slot);
            return;
        }
        finally {
            this.lock.unlockWrite(l2);
        }
    }

    @Override
    protected void checkMapSize() {
        super.checkMapSize();
    }

    @Override
    public int dirtySize() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        long l2 = this.lock.tryOptimisticRead();
        boolean bl = this.map.isEmpty();
        if (this.lock.validate(l2)) {
            return bl;
        }
        l2 = this.lock.readLock();
        try {
            bl = this.map.isEmpty();
            return bl;
        }
        finally {
            this.lock.unlockRead(l2);
        }
    }

    @Override
    public Iterator<Slot> iterator() {
        return this.map.iterator();
    }

    @Override
    public Slot modify(Object object, int n2, int n3) {
        long l2 = this.lock.writeLock();
        try {
            this.checkMapSize();
            object = this.map.modify(object, n2, n3);
            return object;
        }
        finally {
            this.lock.unlockWrite(l2);
        }
    }

    @Override
    public Slot query(Object object, int n2) {
        long l2 = this.lock.tryOptimisticRead();
        Slot slot = this.map.query(object, n2);
        if (this.lock.validate(l2)) {
            return slot;
        }
        l2 = this.lock.readLock();
        try {
            object = this.map.query(object, n2);
            return object;
        }
        finally {
            this.lock.unlockRead(l2);
        }
    }

    @Override
    public long readLock() {
        return this.lock.readLock();
    }

    @Override
    public void remove(Object object, int n2) {
        long l2 = this.lock.writeLock();
        try {
            this.map.remove(object, n2);
            return;
        }
        finally {
            this.lock.unlockWrite(l2);
        }
    }

    @Override
    public void replace(Slot slot, Slot slot2) {
        long l2 = this.lock.writeLock();
        try {
            this.map.replace(slot, slot2);
            return;
        }
        finally {
            this.lock.unlockWrite(l2);
        }
    }

    @Override
    public int size() {
        long l2 = this.lock.tryOptimisticRead();
        int n2 = this.map.size();
        if (this.lock.validate(l2)) {
            return n2;
        }
        l2 = this.lock.readLock();
        try {
            n2 = this.map.size();
            return n2;
        }
        finally {
            this.lock.unlockRead(l2);
        }
    }

    @Override
    public void unlockRead(long l2) {
        this.lock.unlockRead(l2);
    }
}

