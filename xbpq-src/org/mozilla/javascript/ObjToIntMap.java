/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.ObjToIntMap$Iterator;
import org.mozilla.javascript.UniqueTag;

public class ObjToIntMap
implements Serializable {
    private static final int A = -1640531527;
    private static final Object DELETED = new Object();
    private static final boolean check = false;
    private static final long serialVersionUID = -1542220580748809402L;
    private int keyCount;
    private transient Object[] keys;
    private transient int occupiedCount;
    private int power;
    private transient int[] values;

    public ObjToIntMap() {
        this(4);
    }

    public ObjToIntMap(int n2) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        int n3 = n2 * 4 / 3;
        n2 = 2;
        while (1 << n2 < n3) {
            ++n2;
        }
        this.power = n2;
    }

    static /* synthetic */ Object access$000() {
        return DELETED;
    }

    private int ensureIndex(Object object) {
        int n2;
        block18: {
            int n3;
            block17: {
                int n4;
                block16: {
                    int n5;
                    block15: {
                        n2 = object.hashCode();
                        Object object2 = this.keys;
                        int n6 = -1;
                        if (object2 != null) {
                            int n7 = -1640531527 * n2;
                            int n8 = this.power;
                            n4 = n7 >>> 32 - n8;
                            object2 = object2[n4];
                            n5 = n6;
                            n3 = n4;
                            if (object2 != null) {
                                n8 = 1 << n8;
                                n5 = n4;
                                if (object2 != object) {
                                    if (this.values[n8 + n4] == n2 && object2.equals(object)) {
                                        n5 = n4;
                                    } else {
                                        n3 = n6;
                                        if (object2 == DELETED) {
                                            n3 = n4;
                                        }
                                        n6 = n8 - 1;
                                        n7 = ObjToIntMap.tableLookupStep(n7, n6, this.power);
                                        n5 = n4;
                                        while (true) {
                                            if ((object2 = this.keys[n4 = n5 + n7 & n6]) == null) {
                                                n5 = n3;
                                                n3 = n4;
                                                break block15;
                                            }
                                            n5 = n4;
                                            if (object2 == object) break;
                                            if (this.values[n8 + n4] == n2 && object2.equals(object)) {
                                                n5 = n4;
                                                break;
                                            }
                                            n5 = n4;
                                            if (object2 != DELETED) continue;
                                            n5 = n4;
                                            if (n3 >= 0) continue;
                                            n3 = n4;
                                            n5 = n4;
                                        }
                                    }
                                }
                                return n5;
                            }
                        } else {
                            n3 = -1;
                            n5 = n6;
                        }
                    }
                    if (n5 < 0) break block16;
                    n3 = n5;
                    break block17;
                }
                if (this.keys == null || (n4 = this.occupiedCount) * 4 >= (1 << this.power) * 3) break block18;
                this.occupiedCount = n4 + 1;
            }
            this.keys[n3] = object;
            this.values[(1 << this.power) + n3] = n2;
            ++this.keyCount;
            return n3;
        }
        this.rehashTable();
        return this.insertNewKey(object, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int findIndex(Object object) {
        int n2;
        if (this.keys == null) return -1;
        int n3 = object.hashCode();
        int n4 = -1640531527 * n3;
        int n5 = n4 >>> 32 - (n2 = this.power);
        Object object2 = this.keys[n5];
        if (object2 == null) return -1;
        int n6 = 1 << n2;
        n2 = n5;
        if (object2 == object) return n2;
        if (this.values[n6 + n5] == n3 && object2.equals(object)) {
            return n5;
        }
        int n7 = n6 - 1;
        n4 = ObjToIntMap.tableLookupStep(n4, n7, this.power);
        n2 = n5;
        while ((object2 = this.keys[n5 = n2 + n4 & n7]) != null) {
            n2 = n5;
            if (object2 == object) return n2;
            n2 = n5;
            if (this.values[n6 + n5] != n3) continue;
            n2 = n5;
            if (!object2.equals(object)) continue;
            return n5;
        }
        return -1;
    }

    private int insertNewKey(Object object, int n2) {
        int n3 = -1640531527 * n2;
        int n4 = this.power;
        int n5 = n3 >>> 32 - n4;
        int n6 = 1 << n4;
        int n7 = n5;
        if (this.keys[n5] != null) {
            int n8 = n6 - 1;
            n4 = ObjToIntMap.tableLookupStep(n3, n8, n4);
            n7 = n5;
            do {
                n7 = n5 = n7 + n4 & n8;
            } while (this.keys[n5] != null);
            n7 = n5;
        }
        this.keys[n7] = object;
        this.values[n6 + n7] = n2;
        ++this.occupiedCount;
        ++this.keyCount;
        return n7;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = this.keyCount;
        if (n2 != 0) {
            this.keyCount = 0;
            int n3 = 1 << this.power;
            this.keys = new Object[n3];
            this.values = new int[n3 * 2];
            for (int i2 = 0; i2 != n2; ++i2) {
                Object object = objectInputStream.readObject();
                n3 = this.insertNewKey(object, object.hashCode());
                this.values[n3] = objectInputStream.readInt();
            }
        }
    }

    private void rehashTable() {
        Object[] objectArray = this.keys;
        if (objectArray == null) {
            int n2 = 1 << this.power;
            this.keys = new Object[n2];
            this.values = new int[n2 * 2];
        } else {
            int n3 = this.keyCount;
            if (n3 * 2 >= this.occupiedCount) {
                ++this.power;
            }
            int n4 = 1 << this.power;
            int[] nArray = this.values;
            int n5 = objectArray.length;
            this.keys = new Object[n4];
            this.values = new int[n4 * 2];
            n4 = 0;
            this.keyCount = 0;
            this.occupiedCount = 0;
            while (n3 != 0) {
                Object object = objectArray[n4];
                int n6 = n3;
                if (object != null) {
                    n6 = n3;
                    if (object != DELETED) {
                        n6 = this.insertNewKey(object, nArray[n5 + n4]);
                        this.values[n6] = nArray[n4];
                        n6 = n3 - 1;
                    }
                }
                ++n4;
                n3 = n6;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int tableLookupStep(int n2, int n3, int n4) {
        if ((n4 = 32 - n4 * 2) >= 0) {
            n2 >>>= n4;
            return n2 & n3 | 1;
        }
        n3 >>>= -n4;
        return n2 & n3 | 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        int n2 = this.keyCount;
        int n3 = 0;
        while (n2 != 0) {
            Object object = this.keys[n3];
            int n4 = n2;
            if (object != null) {
                n4 = n2;
                if (object != DELETED) {
                    n4 = n2 - 1;
                    objectOutputStream.writeObject(object);
                    objectOutputStream.writeInt(this.values[n3]);
                }
            }
            ++n3;
            n2 = n4;
        }
    }

    public void clear() {
        int n2 = this.keys.length;
        while (n2 != 0) {
            Object[] objectArray = this.keys;
            objectArray[--n2] = null;
        }
        this.keyCount = 0;
        this.occupiedCount = 0;
    }

    public int get(Object object, int n2) {
        int n3;
        Object object2 = object;
        if (object == null) {
            object2 = UniqueTag.NULL_VALUE;
        }
        if ((n3 = this.findIndex(object2)) >= 0) {
            return this.values[n3];
        }
        return n2;
    }

    public int getExisting(Object object) {
        int n2;
        Object object2 = object;
        if (object == null) {
            object2 = UniqueTag.NULL_VALUE;
        }
        if ((n2 = this.findIndex(object2)) >= 0) {
            return this.values[n2];
        }
        Kit.codeBug();
        return 0;
    }

    public void getKeys(Object[] objectArray, int n2) {
        int n3 = this.keyCount;
        int n4 = 0;
        int n5 = n2;
        n2 = n4;
        while (n3 != 0) {
            Object object = this.keys[n2];
            int n6 = n3;
            n4 = n5;
            if (object != null) {
                n6 = n3;
                n4 = n5;
                if (object != DELETED) {
                    Object object2 = object;
                    if (object == UniqueTag.NULL_VALUE) {
                        object2 = null;
                    }
                    objectArray[n5] = object2;
                    n4 = n5 + 1;
                    n6 = n3 - 1;
                }
            }
            ++n2;
            n3 = n6;
            n5 = n4;
        }
    }

    public Object[] getKeys() {
        Object[] objectArray = new Object[this.keyCount];
        this.getKeys(objectArray, 0);
        return objectArray;
    }

    public boolean has(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = UniqueTag.NULL_VALUE;
        }
        boolean bl = this.findIndex(object2) >= 0;
        return bl;
    }

    final void initIterator(ObjToIntMap$Iterator objToIntMap$Iterator) {
        objToIntMap$Iterator.init(this.keys, this.values, this.keyCount);
    }

    public Object intern(Object object) {
        boolean bl;
        if (object == null) {
            object = UniqueTag.NULL_VALUE;
            bl = true;
        } else {
            bl = false;
        }
        int n2 = this.ensureIndex(object);
        this.values[n2] = 0;
        object = bl ? null : this.keys[n2];
        return object;
    }

    public boolean isEmpty() {
        boolean bl = this.keyCount == 0;
        return bl;
    }

    public ObjToIntMap$Iterator newIterator() {
        return new ObjToIntMap$Iterator(this);
    }

    public void put(Object object, int n2) {
        Object object2 = object;
        if (object == null) {
            object2 = UniqueTag.NULL_VALUE;
        }
        int n3 = this.ensureIndex(object2);
        this.values[n3] = n2;
    }

    public void remove(Object object) {
        int n2;
        Object object2 = object;
        if (object == null) {
            object2 = UniqueTag.NULL_VALUE;
        }
        if ((n2 = this.findIndex(object2)) >= 0) {
            this.keys[n2] = DELETED;
            --this.keyCount;
        }
    }

    public int size() {
        return this.keyCount;
    }
}

