/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Iterator;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EmbeddedSlotMap$Iter;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;

public class EmbeddedSlotMap
implements SlotMap {
    static final boolean $assertionsDisabled = false;
    private static final int INITIAL_SLOT_SIZE = 4;
    private int count;
    private Slot firstAdded;
    private Slot lastAdded;
    private Slot[] slots;

    private static void addKnownAbsentSlot(Slot[] slotArray, Slot slot) {
        int n2 = EmbeddedSlotMap.getSlotIndex(slotArray.length, slot.indexOrHash);
        Slot slot2 = slotArray[n2];
        slotArray[n2] = slot;
        slot.next = slot2;
    }

    private static void copyTable(Slot[] slotArray, Slot[] slotArray2) {
        for (Slot slot : slotArray) {
            while (slot != null) {
                Slot slot2 = slot.next;
                slot.next = null;
                EmbeddedSlotMap.addKnownAbsentSlot(slotArray2, slot);
                slot = slot2;
            }
        }
    }

    private Slot createSlot(Object object, int n2, int n3) {
        Slot[] slotArray;
        int n4 = this.count;
        if (n4 == 0) {
            this.slots = new Slot[4];
        }
        if ((n4 + 1) * 4 > (slotArray = this.slots).length * 3) {
            Slot[] slotArray2 = new Slot[slotArray.length * 2];
            EmbeddedSlotMap.copyTable(slotArray, slotArray2);
            this.slots = slotArray2;
        }
        object = new Slot(object, n2, n3);
        this.insertNewSlot((Slot)object);
        return object;
    }

    private static int getSlotIndex(int n2, int n3) {
        return n2 - 1 & n3;
    }

    private void insertNewSlot(Slot slot) {
        ++this.count;
        Slot slot2 = this.lastAdded;
        if (slot2 != null) {
            slot2.orderedNext = slot;
        }
        if (this.firstAdded == null) {
            this.firstAdded = slot;
        }
        this.lastAdded = slot;
        EmbeddedSlotMap.addKnownAbsentSlot(this.slots, slot);
    }

    @Override
    public void add(Slot slot) {
        if (this.slots == null) {
            this.slots = new Slot[4];
        }
        this.insertNewSlot(slot);
    }

    @Override
    public boolean isEmpty() {
        boolean bl = this.count == 0;
        return bl;
    }

    @Override
    public Iterator<Slot> iterator() {
        return new EmbeddedSlotMap$Iter(this.firstAdded);
    }

    @Override
    public Slot modify(Object object, int n2, int n3) {
        Object object2;
        if (object != null) {
            n2 = object.hashCode();
        }
        if ((object2 = this.slots) != null) {
            int n4 = EmbeddedSlotMap.getSlotIndex(((Slot[])object2).length, n2);
            object2 = this.slots[n4];
            while (!(object2 == null || n2 == object2.indexOrHash && Objects.equals(object2.name, object))) {
                object2 = object2.next;
            }
            if (object2 != null) {
                return object2;
            }
        }
        return this.createSlot(object, n2, n3);
    }

    @Override
    public Slot query(Object object, int n2) {
        if (this.slots == null) {
            return null;
        }
        if (object != null) {
            n2 = object.hashCode();
        }
        int n3 = EmbeddedSlotMap.getSlotIndex(this.slots.length, n2);
        Slot slot = this.slots[n3];
        while (slot != null) {
            if (n2 == slot.indexOrHash && Objects.equals(slot.name, object)) {
                return slot;
            }
            slot = slot.next;
        }
        return null;
    }

    @Override
    public void remove(Object object, int n2) {
        if (object != null) {
            n2 = object.hashCode();
        }
        if (this.count != 0) {
            Slot slot;
            int n3 = EmbeddedSlotMap.getSlotIndex(this.slots.length, n2);
            Slot slot2 = slot = this.slots[n3];
            while (!(slot == null || slot.indexOrHash == n2 && Objects.equals(slot.name, object))) {
                Slot slot3 = slot.next;
                slot2 = slot;
                slot = slot3;
            }
            if (slot != null) {
                if ((slot.getAttributes() & 4) != 0) {
                    if (!Context.getContext().isStrictMode()) {
                        return;
                    }
                    throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", object);
                }
                --this.count;
                if (slot2 == slot) {
                    this.slots[n3] = slot.next;
                } else {
                    slot2.next = slot.next;
                }
                slot2 = this.firstAdded;
                object = slot2;
                if (slot == slot2) {
                    object = null;
                    this.firstAdded = slot.orderedNext;
                } else {
                    while ((slot2 = ((Slot)object).orderedNext) != slot) {
                        object = slot2;
                    }
                    ((Slot)object).orderedNext = slot.orderedNext;
                }
                if (slot == this.lastAdded) {
                    this.lastAdded = object;
                }
            }
        }
    }

    @Override
    public void replace(Slot slot, Slot slot2) {
        Slot slot3;
        int n2 = EmbeddedSlotMap.getSlotIndex(this.slots.length, slot.indexOrHash);
        Slot slot4 = slot3 = this.slots[n2];
        while (slot3 != null && slot3 != slot) {
            Slot slot5 = slot3.next;
            slot4 = slot3;
            slot3 = slot5;
        }
        if (slot4 == slot) {
            this.slots[n2] = slot2;
        } else {
            slot4.next = slot2;
        }
        slot2.next = slot.next;
        slot3 = slot4 = this.firstAdded;
        if (slot == slot4) {
            this.firstAdded = slot2;
        } else {
            while (slot3 != null && (slot4 = slot3.orderedNext) != slot) {
                slot3 = slot4;
            }
            if (slot3 != null) {
                slot3.orderedNext = slot2;
            }
        }
        slot2.orderedNext = slot.orderedNext;
        if (slot == this.lastAdded) {
            this.lastAdded = slot2;
        }
    }

    @Override
    public int size() {
        return this.count;
    }
}

