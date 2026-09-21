/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;

public class HashSlotMap
implements SlotMap {
    private final LinkedHashMap<Object, Slot> map = new LinkedHashMap();

    private Slot createSlot(Object object, int n2, int n3) {
        object = new Slot(object, n2, n3);
        this.add((Slot)object);
        return object;
    }

    private Object makeKey(Object object, int n2) {
        Object object2 = object;
        if (object == null) {
            object2 = String.valueOf(n2);
        }
        return object2;
    }

    private Object makeKey(Slot slot) {
        Object object;
        Object object2 = object = slot.name;
        if (object == null) {
            object2 = String.valueOf(slot.indexOrHash);
        }
        return object2;
    }

    @Override
    public void add(Slot slot) {
        Object object = this.makeKey(slot);
        ((AbstractMap)this.map).put(object, slot);
    }

    @Override
    public boolean isEmpty() {
        return ((AbstractMap)this.map).isEmpty();
    }

    @Override
    public Iterator<Slot> iterator() {
        return this.map.values().iterator();
    }

    @Override
    public Slot modify(Object object, int n2, int n3) {
        Object object2 = this.makeKey(object, n2);
        if ((object2 = this.map.get(object2)) != null) {
            return object2;
        }
        return this.createSlot(object, n2, n3);
    }

    @Override
    public Slot query(Object object, int n2) {
        object = this.makeKey(object, n2);
        return this.map.get(object);
    }

    @Override
    public void remove(Object object, int n2) {
        Object object2 = this.makeKey(object, n2);
        Slot slot = this.map.get(object2);
        if (slot != null) {
            if ((slot.getAttributes() & 4) != 0) {
                if (!Context.getContext().isStrictMode()) {
                    return;
                }
                throw ScriptRuntime.typeErrorById("msg.delete.property.with.configurable.false", object);
            }
            ((AbstractMap)this.map).remove(object2);
        }
    }

    @Override
    public void replace(Slot object, Slot slot) {
        object = this.makeKey((Slot)object);
        ((AbstractMap)this.map).put(object, slot);
    }

    @Override
    public int size() {
        return ((AbstractMap)this.map).size();
    }
}

