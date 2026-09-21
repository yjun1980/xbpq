/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import org.mozilla.javascript.EmbeddedSlotMap;
import org.mozilla.javascript.HashSlotMap;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;

class SlotMapContainer
implements SlotMap {
    private static final int DEFAULT_SIZE = 10;
    private static final int LARGE_HASH_SIZE = 2000;
    protected SlotMap map;

    SlotMapContainer() {
        this(10);
    }

    SlotMapContainer(int n2) {
        SlotMap slotMap = n2 > 2000 ? new HashSlotMap() : new EmbeddedSlotMap();
        this.map = slotMap;
    }

    @Override
    public void add(Slot slot) {
        this.checkMapSize();
        this.map.add(slot);
    }

    protected void checkMapSize() {
        SlotMap slotMap = this.map;
        if (slotMap instanceof EmbeddedSlotMap && slotMap.size() >= 2000) {
            slotMap = new HashSlotMap();
            Iterator iterator = this.map.iterator();
            while (iterator.hasNext()) {
                slotMap.add((Slot)iterator.next());
            }
            this.map = slotMap;
        }
    }

    public int dirtySize() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public Iterator<Slot> iterator() {
        return this.map.iterator();
    }

    @Override
    public Slot modify(Object object, int n2, int n3) {
        this.checkMapSize();
        return this.map.modify(object, n2, n3);
    }

    @Override
    public Slot query(Object object, int n2) {
        return this.map.query(object, n2);
    }

    public long readLock() {
        return 0L;
    }

    @Override
    public void remove(Object object, int n2) {
        this.map.remove(object, n2);
    }

    @Override
    public void replace(Slot slot, Slot slot2) {
        this.map.replace(slot, slot2);
    }

    @Override
    public int size() {
        return this.map.size();
    }

    public void unlockRead(long l2) {
    }
}

