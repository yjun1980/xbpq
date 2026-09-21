/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.mozilla.javascript.Kit;

public class UintMap
implements Serializable {
    private static final int A = -1640531527;
    private static final int DELETED = -2;
    private static final int EMPTY = -1;
    private static final boolean check = false;
    private static final long serialVersionUID = 4242698212885848444L;
    private transient int ivaluesShift;
    private int keyCount;
    private transient int[] keys;
    private transient int occupiedCount;
    private int power;
    private transient Object[] values;

    public UintMap() {
        this(4);
    }

    public UintMap(int n2) {
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

    private int ensureIndex(int n2, boolean bl) {
        block14: {
            int n3;
            block13: {
                int n4;
                int[] nArray;
                block12: {
                    nArray = this.keys;
                    int n5 = -1;
                    if (nArray != null) {
                        int n6 = -1640531527 * n2;
                        int n7 = this.power;
                        n4 = n6 >>> 32 - n7;
                        int n8 = nArray[n4];
                        if (n8 == n2) {
                            return n4;
                        }
                        n3 = n4;
                        if (n8 != -1) {
                            int n9;
                            n3 = n8 == -2 ? n4 : -1;
                            n8 = (1 << n7) - 1;
                            n6 = UintMap.tableLookupStep(n6, n8, n7);
                            n5 = n3;
                            n7 = n4;
                            do {
                                if ((n9 = nArray[n3 = n7 + n6 & n8]) == n2) {
                                    return n3;
                                }
                                n4 = n5;
                                if (n9 == -2) {
                                    n4 = n5;
                                    if (n5 < 0) {
                                        n4 = n3;
                                    }
                                }
                                n7 = n3;
                                n5 = n4;
                            } while (n9 != -1);
                            n5 = n4;
                        }
                    } else {
                        n3 = -1;
                    }
                    if (n5 < 0) break block12;
                    n3 = n5;
                    break block13;
                }
                if (nArray == null || (n4 = this.occupiedCount) * 4 >= (1 << this.power) * 3) break block14;
                this.occupiedCount = n4 + 1;
            }
            nArray[n3] = n2;
            ++this.keyCount;
            return n3;
        }
        this.rehashTable(bl);
        return this.insertNewKey(n2);
    }

    private int findIndex(int n2) {
        int[] nArray = this.keys;
        if (nArray != null) {
            int n3 = -1640531527 * n2;
            int n4 = this.power;
            int n5 = n3 >>> 32 - n4;
            int n6 = nArray[n5];
            if (n6 == n2) {
                return n5;
            }
            if (n6 != -1) {
                n6 = (1 << n4) - 1;
                n4 = UintMap.tableLookupStep(n3, n6, n4);
                do {
                    if ((n3 = nArray[n5 = n5 + n4 & n6]) != n2) continue;
                    return n5;
                } while (n3 != -1);
            }
        }
        return -1;
    }

    private int insertNewKey(int n2) {
        int n3;
        int[] nArray = this.keys;
        int n4 = -1640531527 * n2;
        int n5 = this.power;
        int n6 = n3 = n4 >>> 32 - n5;
        if (nArray[n3] != -1) {
            int n7 = (1 << n5) - 1;
            n5 = UintMap.tableLookupStep(n4, n7, n5);
            do {
                n3 = n6 = n3 + n5 & n7;
            } while (nArray[n6] != -1);
        }
        nArray[n6] = n2;
        ++this.occupiedCount;
        ++this.keyCount;
        return n6;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = this.keyCount;
        if (n2 != 0) {
            int n3;
            int n4 = 0;
            this.keyCount = 0;
            boolean bl = objectInputStream.readBoolean();
            boolean bl2 = objectInputStream.readBoolean();
            int n5 = 1 << this.power;
            if (bl) {
                this.keys = new int[n5 * 2];
                this.ivaluesShift = n5;
            } else {
                this.keys = new int[n5];
            }
            for (n3 = 0; n3 != n5; ++n3) {
                this.keys[n3] = -1;
            }
            n3 = n4;
            if (bl2) {
                this.values = new Object[n5];
                n3 = n4;
            }
            while (n3 != n2) {
                n4 = this.insertNewKey(objectInputStream.readInt());
                if (bl) {
                    this.keys[this.ivaluesShift + n4] = n5 = objectInputStream.readInt();
                }
                if (bl2) {
                    this.values[n4] = objectInputStream.readObject();
                }
                ++n3;
            }
        }
    }

    private void rehashTable(boolean bl) {
        int n2;
        int[] nArray = this.keys;
        if (nArray != null && this.keyCount * 2 >= this.occupiedCount) {
            ++this.power;
        }
        int n3 = 1 << this.power;
        int n4 = this.ivaluesShift;
        if (n4 == 0 && !bl) {
            this.keys = new int[n3];
        } else {
            this.ivaluesShift = n3;
            this.keys = new int[n3 * 2];
        }
        int n5 = 0;
        for (n2 = 0; n2 != n3; ++n2) {
            this.keys[n2] = -1;
        }
        Object[] objectArray = this.values;
        if (objectArray != null) {
            this.values = new Object[n3];
        }
        n3 = this.keyCount;
        this.occupiedCount = 0;
        if (n3 != 0) {
            this.keyCount = 0;
            n2 = n5;
            n5 = n3;
            while (n5 != 0) {
                int n6 = nArray[n2];
                n3 = n5;
                if (n6 != -1) {
                    n3 = n5;
                    if (n6 != -2) {
                        n3 = this.insertNewKey(n6);
                        if (objectArray != null) {
                            this.values[n3] = objectArray[n2];
                        }
                        if (n4 != 0) {
                            this.keys[this.ivaluesShift + n3] = nArray[n4 + n2];
                        }
                        n3 = n5 - 1;
                    }
                }
                ++n2;
                n5 = n3;
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
        if (n2 != 0) {
            int n3 = this.ivaluesShift;
            boolean bl = true;
            int n4 = 0;
            boolean bl2 = n3 != 0;
            if (this.values == null) {
                bl = false;
            }
            objectOutputStream.writeBoolean(bl2);
            objectOutputStream.writeBoolean(bl);
            while (n2 != 0) {
                int n5 = this.keys[n4];
                n3 = n2;
                if (n5 != -1) {
                    n3 = n2--;
                    if (n5 != -2) {
                        objectOutputStream.writeInt(n5);
                        if (bl2) {
                            objectOutputStream.writeInt(this.keys[this.ivaluesShift + n4]);
                        }
                        n3 = n2;
                        if (bl) {
                            objectOutputStream.writeObject(this.values[n4]);
                            n3 = n2;
                        }
                    }
                }
                ++n4;
                n2 = n3;
            }
        }
    }

    public void clear() {
        int n2 = 1 << this.power;
        if (this.keys != null) {
            int n3;
            for (n3 = 0; n3 != n2; ++n3) {
                this.keys[n3] = -1;
            }
            if (this.values != null) {
                for (n3 = 0; n3 != n2; ++n3) {
                    this.values[n3] = null;
                }
            }
        }
        this.ivaluesShift = 0;
        this.keyCount = 0;
        this.occupiedCount = 0;
    }

    public int getExistingInt(int n2) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        if ((n2 = this.findIndex(n2)) >= 0) {
            int n3 = this.ivaluesShift;
            if (n3 != 0) {
                return this.keys[n3 + n2];
            }
            return 0;
        }
        Kit.codeBug();
        return 0;
    }

    public int getInt(int n2, int n3) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        if ((n2 = this.findIndex(n2)) >= 0) {
            n3 = this.ivaluesShift;
            if (n3 != 0) {
                return this.keys[n3 + n2];
            }
            return 0;
        }
        return n3;
    }

    public int[] getKeys() {
        int[] nArray = this.keys;
        int n2 = this.keyCount;
        int[] nArray2 = new int[n2];
        int n3 = 0;
        while (n2 != 0) {
            int n4 = nArray[n3];
            int n5 = n2;
            if (n4 != -1) {
                n5 = n2;
                if (n4 != -2) {
                    n5 = n2 - 1;
                    nArray2[n5] = n4;
                }
            }
            ++n3;
            n2 = n5;
        }
        return nArray2;
    }

    public Object getObject(int n2) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        if (this.values != null && (n2 = this.findIndex(n2)) >= 0) {
            return this.values[n2];
        }
        return null;
    }

    public boolean has(int n2) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        boolean bl = this.findIndex(n2) >= 0;
        return bl;
    }

    public boolean isEmpty() {
        boolean bl = this.keyCount == 0;
        return bl;
    }

    public void put(int n2, int n3) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        int n4 = this.ensureIndex(n2, true);
        if (this.ivaluesShift == 0) {
            int[] nArray = this.keys;
            n2 = nArray.length;
            int n5 = 1 << this.power;
            int n6 = n5 * 2;
            if (n2 != n6) {
                int[] nArray2 = new int[n6];
                System.arraycopy(nArray, 0, nArray2, 0, n5);
                this.keys = nArray2;
            }
            this.ivaluesShift = n5;
        }
        this.keys[this.ivaluesShift + n4] = n3;
    }

    public void put(int n2, Object object) {
        if (n2 < 0) {
            Kit.codeBug();
        }
        n2 = this.ensureIndex(n2, false);
        if (this.values == null) {
            this.values = new Object[1 << this.power];
        }
        this.values[n2] = object;
    }

    public void remove(int n2) {
        int n3;
        if (n2 < 0) {
            Kit.codeBug();
        }
        if ((n3 = this.findIndex(n2)) >= 0) {
            int[] nArray = this.keys;
            nArray[n3] = -2;
            --this.keyCount;
            Object[] objectArray = this.values;
            if (objectArray != null) {
                objectArray[n3] = null;
            }
            if ((n2 = this.ivaluesShift) != 0) {
                nArray[n2 + n3] = 0;
            }
        }
    }

    public int size() {
        return this.keyCount;
    }
}

