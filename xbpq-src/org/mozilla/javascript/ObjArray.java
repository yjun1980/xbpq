/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjArray
implements Serializable {
    private static final int FIELDS_STORE_SIZE = 5;
    private static final long serialVersionUID = 4174889037736658296L;
    private transient Object[] data;
    private transient Object f0;
    private transient Object f1;
    private transient Object f2;
    private transient Object f3;
    private transient Object f4;
    private boolean sealed;
    private int size;

    private void ensureCapacity(int n2) {
        int n3 = n2 - 5;
        if (n3 > 0) {
            Object[] objectArray = this.data;
            n2 = 10;
            if (objectArray == null) {
                if (10 >= n3) {
                    n3 = 10;
                }
                this.data = new Object[n3];
            } else {
                int n4 = objectArray.length;
                if (n4 < n3) {
                    if (n4 > 5) {
                        n2 = n4 * 2;
                    }
                    if (n2 >= n3) {
                        n3 = n2;
                    }
                    Object[] objectArray2 = new Object[n3];
                    n2 = this.size;
                    if (n2 > 5) {
                        System.arraycopy(objectArray, 0, objectArray2, 0, n2 - 5);
                    }
                    this.data = objectArray2;
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private Object getImpl(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return this.data[n2 - 5];
                        }
                        return this.f4;
                    }
                    return this.f3;
                }
                return this.f2;
            }
            return this.f1;
        }
        return this.f0;
    }

    private static RuntimeException onEmptyStackTopRead() {
        throw new RuntimeException("Empty stack");
    }

    private static RuntimeException onInvalidIndex(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n2);
        stringBuilder.append(" \u2209 [0, ");
        stringBuilder.append(n3);
        stringBuilder.append(')');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    private static RuntimeException onSeledMutation() {
        throw new IllegalStateException("Attempt to modify sealed array");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int n2 = this.size;
        if (n2 > 5) {
            this.data = new Object[n2 - 5];
        }
        for (int i2 = 0; i2 != n2; ++i2) {
            this.setImpl(i2, objectInputStream.readObject());
        }
    }

    private void setImpl(int n2, Object object) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            this.data[n2 - 5] = object;
                        } else {
                            this.f4 = object;
                        }
                    } else {
                        this.f3 = object;
                    }
                } else {
                    this.f2 = object;
                }
            } else {
                this.f1 = object;
            }
        } else {
            this.f0 = object;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        int n2 = this.size;
        for (int i2 = 0; i2 != n2; ++i2) {
            objectOutputStream.writeObject(this.getImpl(i2));
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void add(int var1_1, Object var2_2) {
        block11: {
            block12: {
                block13: {
                    var3_3 = this.size;
                    if (var1_1 < 0 || var1_1 > var3_3) break block11;
                    if (this.sealed) break block12;
                    if (var1_1 == 0) break block13;
                    var5_4 = var2_2 /* !! */ ;
                    if (var1_1 == 1) ** GOTO lbl20
                    var5_4 = var2_2 /* !! */ ;
                    if (var1_1 == 2) ** GOTO lbl26
                    var5_4 = var2_2 /* !! */ ;
                    if (var1_1 == 3) ** GOTO lbl32
                    var5_4 = var2_2 /* !! */ ;
                    if (var1_1 == 4) ** GOTO lbl38
                    ** GOTO lbl44
                }
                if (var3_3 == 0) {
                    this.f0 = var2_2 /* !! */ ;
                } else {
                    var5_4 = this.f0;
                    this.f0 = var2_2 /* !! */ ;
lbl20:
                    // 2 sources

                    if (var3_3 == 1) {
                        this.f1 = var5_4;
                    } else {
                        var2_2 /* !! */  = this.f1;
                        this.f1 = var5_4;
                        var5_4 = var2_2 /* !! */ ;
lbl26:
                        // 2 sources

                        if (var3_3 == 2) {
                            this.f2 = var5_4;
                        } else {
                            var2_2 /* !! */  = this.f2;
                            this.f2 = var5_4;
                            var5_4 = var2_2 /* !! */ ;
lbl32:
                            // 2 sources

                            if (var3_3 == 3) {
                                this.f3 = var5_4;
                            } else {
                                var2_2 /* !! */  = this.f3;
                                this.f3 = var5_4;
                                var5_4 = var2_2 /* !! */ ;
lbl38:
                                // 2 sources

                                if (var3_3 == 4) {
                                    this.f4 = var5_4;
                                } else {
                                    var2_2 /* !! */  = this.f4;
                                    this.f4 = var5_4;
                                    var1_1 = 5;
lbl44:
                                    // 2 sources

                                    this.ensureCapacity(var3_3 + 1);
                                    if (var1_1 != var3_3) {
                                        var5_4 = this.data;
                                        var4_5 = var1_1 - 5;
                                        System.arraycopy(var5_4, var4_5, var5_4, var4_5 + 1, var3_3 - var1_1);
                                    }
                                    this.data[var1_1 - 5] = var2_2 /* !! */ ;
                                }
                            }
                        }
                    }
                }
                this.size = var3_3 + 1;
                return;
            }
            throw ObjArray.onSeledMutation();
        }
        throw ObjArray.onInvalidIndex(var1_1, var3_3 + 1);
    }

    public final void add(Object object) {
        if (!this.sealed) {
            int n2 = this.size;
            if (n2 >= 5) {
                this.ensureCapacity(n2 + 1);
            }
            this.size = n2 + 1;
            this.setImpl(n2, object);
            return;
        }
        throw ObjArray.onSeledMutation();
    }

    public final void clear() {
        if (!this.sealed) {
            int n2 = this.size;
            for (int i2 = 0; i2 != n2; ++i2) {
                this.setImpl(i2, null);
            }
            this.size = 0;
            return;
        }
        throw ObjArray.onSeledMutation();
    }

    public final Object get(int n2) {
        if (n2 >= 0 && n2 < this.size) {
            return this.getImpl(n2);
        }
        throw ObjArray.onInvalidIndex(n2, this.size);
    }

    public int indexOf(Object object) {
        int n2 = this.size;
        for (int i2 = 0; i2 != n2; ++i2) {
            Object object2 = this.getImpl(i2);
            if (!(object2 == object || object2 != null && object2.equals(object))) {
                continue;
            }
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        boolean bl = this.size == 0;
        return bl;
    }

    public final boolean isSealed() {
        return this.sealed;
    }

    public int lastIndexOf(Object object) {
        int n2 = this.size;
        while (n2 != 0) {
            int n3 = n2 - 1;
            Object object2 = this.getImpl(n3);
            if (object2 != object) {
                n2 = n3;
                if (object2 == null) continue;
                n2 = n3;
                if (!object2.equals(object)) continue;
            }
            return n3;
        }
        return -1;
    }

    public final Object peek() {
        int n2 = this.size;
        if (n2 != 0) {
            return this.getImpl(n2 - 1);
        }
        throw ObjArray.onEmptyStackTopRead();
    }

    public final Object pop() {
        if (!this.sealed) {
            int n2 = this.size - 1;
            if (n2 != -1) {
                Object object;
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 != 4) {
                                    Object[] objectArray = this.data;
                                    int n3 = n2 - 5;
                                    object = objectArray[n3];
                                    objectArray[n3] = null;
                                } else {
                                    object = this.f4;
                                    this.f4 = null;
                                }
                            } else {
                                object = this.f3;
                                this.f3 = null;
                            }
                        } else {
                            object = this.f2;
                            this.f2 = null;
                        }
                    } else {
                        object = this.f1;
                        this.f1 = null;
                    }
                } else {
                    object = this.f0;
                    this.f0 = null;
                }
                this.size = n2;
                return object;
            }
            throw ObjArray.onEmptyStackTopRead();
        }
        throw ObjArray.onSeledMutation();
    }

    public final void push(Object object) {
        this.add(object);
    }

    /*
     * Unable to fully structure code
     */
    public final void remove(int var1_1) {
        block11: {
            block12: {
                block13: {
                    var2_2 = this.size;
                    if (var1_1 < 0 || var1_1 >= var2_2) break block11;
                    if (this.sealed) break block12;
                    --var2_2;
                    if (var1_1 == 0) break block13;
                    if (var1_1 == 1) ** GOTO lbl16
                    if (var1_1 == 2) ** GOTO lbl20
                    if (var1_1 == 3) ** GOTO lbl24
                    if (var1_1 == 4) ** GOTO lbl28
                    ** GOTO lbl33
                }
                if (var2_2 == 0) {
                    this.f0 = null;
                } else {
                    this.f0 = this.f1;
lbl16:
                    // 2 sources

                    if (var2_2 == 1) {
                        this.f1 = null;
                    } else {
                        this.f1 = this.f2;
lbl20:
                        // 2 sources

                        if (var2_2 == 2) {
                            this.f2 = null;
                        } else {
                            this.f2 = this.f3;
lbl24:
                            // 2 sources

                            if (var2_2 == 3) {
                                this.f3 = null;
                            } else {
                                this.f3 = this.f4;
lbl28:
                                // 2 sources

                                if (var2_2 == 4) {
                                    this.f4 = null;
                                } else {
                                    this.f4 = this.data[0];
                                    var1_1 = 5;
lbl33:
                                    // 2 sources

                                    if (var1_1 != var2_2) {
                                        var4_3 = this.data;
                                        var3_4 = var1_1 - 5;
                                        System.arraycopy(var4_3, var3_4 + 1, var4_3, var3_4, var2_2 - var1_1);
                                    }
                                    this.data[var2_2 - 5] = null;
                                }
                            }
                        }
                    }
                }
                this.size = var2_2;
                return;
            }
            throw ObjArray.onSeledMutation();
        }
        throw ObjArray.onInvalidIndex(var1_1, var2_2);
    }

    public final void seal() {
        this.sealed = true;
    }

    public final void set(int n2, Object object) {
        if (n2 >= 0 && n2 < this.size) {
            if (!this.sealed) {
                this.setImpl(n2, object);
                return;
            }
            throw ObjArray.onSeledMutation();
        }
        throw ObjArray.onInvalidIndex(n2, this.size);
    }

    public final void setSize(int n2) {
        if (n2 >= 0) {
            if (!this.sealed) {
                int n3 = this.size;
                if (n2 < n3) {
                    for (int i2 = n2; i2 != n3; ++i2) {
                        this.setImpl(i2, null);
                    }
                } else if (n2 > n3 && n2 > 5) {
                    this.ensureCapacity(n2);
                }
                this.size = n2;
                return;
            }
            throw ObjArray.onSeledMutation();
        }
        throw new IllegalArgumentException();
    }

    public final int size() {
        return this.size;
    }

    public final void toArray(Object[] objectArray) {
        this.toArray(objectArray, 0);
    }

    public final void toArray(Object[] objectArray, int n2) {
        int n3 = this.size;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            if (n3 != 5) {
                                System.arraycopy(this.data, 0, objectArray, n2 + 5, n3 - 5);
                            }
                            objectArray[n2 + 4] = this.f4;
                        }
                        objectArray[n2 + 3] = this.f3;
                    }
                    objectArray[n2 + 2] = this.f2;
                }
                objectArray[n2 + 1] = this.f1;
            }
            objectArray[n2 + 0] = this.f0;
        }
    }

    public final Object[] toArray() {
        Object[] objectArray = new Object[this.size];
        this.toArray(objectArray, 0);
        return objectArray;
    }
}

