/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.UniqueTag;

public class ObjToIntMap$Iterator {
    private int cursor;
    private Object[] keys;
    ObjToIntMap master;
    private int remaining;
    private int[] values;

    ObjToIntMap$Iterator(ObjToIntMap objToIntMap) {
        this.master = objToIntMap;
    }

    public boolean done() {
        boolean bl = this.remaining < 0;
        return bl;
    }

    public Object getKey() {
        Object object;
        Object object2 = object = this.keys[this.cursor];
        if (object == UniqueTag.NULL_VALUE) {
            object2 = null;
        }
        return object2;
    }

    public int getValue() {
        return this.values[this.cursor];
    }

    final void init(Object[] objectArray, int[] nArray, int n2) {
        this.keys = objectArray;
        this.values = nArray;
        this.cursor = -1;
        this.remaining = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void next() {
        if (this.remaining == -1) {
            Kit.codeBug();
        }
        if (this.remaining == 0) {
            this.remaining = -1;
            this.cursor = -1;
            return;
        }
        int n2 = this.cursor;
        while (true) {
            this.cursor = n2 + 1;
            Object object = this.keys[this.cursor];
            if (object != null && object != ObjToIntMap.access$000()) {
                --this.remaining;
                return;
            }
            n2 = this.cursor;
        }
    }

    public void setValue(int n2) {
        this.values[this.cursor] = n2;
    }

    public void start() {
        this.master.initIterator(this);
        this.next();
    }
}

