/*
 * Decompiled with CFR 0.152.
 */
package com.github.catvod.spider.merge.xc.d0;

import com.github.catvod.spider.merge.mI.i;
import com.github.catvod.spider.merge.xc.a.a;
import com.github.catvod.spider.merge.xc.d0.g;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class f
extends AbstractList
implements List,
com.github.catvod.spider.merge.xc.n0.a {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    public final void a(int n2, Collection collection) {
        Iterator iterator = collection.iterator();
        int n3 = this.b.length;
        while (n2 < n3 && iterator.hasNext()) {
            this.b[n2] = iterator.next();
            ++n2;
        }
        n3 = this.a;
        for (n2 = 0; n2 < n3 && iterator.hasNext(); ++n2) {
            this.b[n2] = iterator.next();
        }
        n2 = this.c;
        this.c = collection.size() + n2;
    }

    public final void add(int n2, Object object) {
        int n3 = this.c;
        if (n2 >= 0 && n2 <= n3) {
            if (n2 == n3) {
                this.addLast(object);
                return;
            }
            if (n2 == 0) {
                this.g();
                this.b(this.c + 1);
                n2 = n3 = this.a;
                if (n3 == 0) {
                    Object[] objectArray = this.b;
                    i.e(objectArray, "<this>");
                    n2 = objectArray.length;
                }
                this.a = --n2;
                this.b[n2] = object;
                ++this.c;
                return;
            }
            this.g();
            this.b(this.c + 1);
            n3 = this.f(this.a + n2);
            int n4 = this.c;
            if (n2 < n4 + 1 >> 1) {
                Object[] objectArray;
                if (n3 == 0) {
                    objectArray = this.b;
                    i.e(objectArray, "<this>");
                    n2 = objectArray.length - 1;
                } else {
                    n2 = n3 - 1;
                }
                n3 = this.a;
                if (n3 == 0) {
                    objectArray = this.b;
                    i.e(objectArray, "<this>");
                    n3 = objectArray.length - 1;
                } else {
                    --n3;
                }
                n4 = this.a;
                if (n2 >= n4) {
                    objectArray = this.b;
                    objectArray[n3] = objectArray[n4];
                    g.S(objectArray, objectArray, n4, n4 + 1, n2 + 1);
                } else {
                    objectArray = this.b;
                    g.S(objectArray, objectArray, n4 - 1, n4, objectArray.length);
                    objectArray = this.b;
                    objectArray[objectArray.length - 1] = objectArray[0];
                    g.S(objectArray, objectArray, 0, 1, n2 + 1);
                }
                this.b[n2] = object;
                this.a = n3;
            } else {
                n2 = this.f(this.a + n4);
                if (n3 < n2) {
                    Object[] objectArray = this.b;
                    g.S(objectArray, objectArray, n3 + 1, n3, n2);
                } else {
                    Object[] objectArray = this.b;
                    g.S(objectArray, objectArray, 1, 0, n2);
                    objectArray = this.b;
                    objectArray[0] = objectArray[objectArray.length - 1];
                    g.S(objectArray, objectArray, n3 + 1, n3, objectArray.length - 1);
                }
                this.b[n3] = object;
            }
            ++this.c;
            return;
        }
        object = new StringBuilder("index: ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", size: ");
        ((StringBuilder)object).append(n3);
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    @Override
    public final boolean add(Object object) {
        this.addLast(object);
        return true;
    }

    public final boolean addAll(int n2, Collection object) {
        i.e(object, "elements");
        int n3 = this.c;
        if (n2 >= 0 && n2 <= n3) {
            if (object.isEmpty()) {
                return false;
            }
            if (n2 == this.c) {
                return this.addAll((Collection)object);
            }
            this.g();
            n3 = this.c;
            this.b(object.size() + n3);
            int n4 = this.f(this.a + this.c);
            n3 = this.f(this.a + n2);
            int n5 = object.size();
            if (n2 < this.c + 1 >> 1) {
                n4 = this.a;
                n2 = n4 - n5;
                if (n3 >= n4) {
                    if (n2 >= 0) {
                        Object[] objectArray = this.b;
                        g.S(objectArray, objectArray, n2, n4, n3);
                    } else {
                        Object[] objectArray = this.b;
                        int n6 = objectArray.length - (n2 += objectArray.length);
                        if (n6 >= n3 - n4) {
                            g.S(objectArray, objectArray, n2, n4, n3);
                        } else {
                            g.S(objectArray, objectArray, n2, n4, n4 + n6);
                            objectArray = this.b;
                            g.S(objectArray, objectArray, 0, this.a + n6, n3);
                        }
                    }
                } else {
                    Object[] objectArray = this.b;
                    g.S(objectArray, objectArray, n2, n4, objectArray.length);
                    if (n5 >= n3) {
                        objectArray = this.b;
                        g.S(objectArray, objectArray, objectArray.length - n5, 0, n3);
                    } else {
                        objectArray = this.b;
                        g.S(objectArray, objectArray, objectArray.length - n5, 0, n5);
                        objectArray = this.b;
                        g.S(objectArray, objectArray, 0, n5, n3);
                    }
                }
                this.a = n2;
                this.a(this.d(n3 - n5), (Collection)object);
            } else {
                n2 = n3 + n5;
                if (n3 < n4) {
                    Object[] objectArray = this.b;
                    if ((n5 += n4) <= objectArray.length) {
                        g.S(objectArray, objectArray, n2, n3, n4);
                    } else if (n2 >= objectArray.length) {
                        g.S(objectArray, objectArray, n2 - objectArray.length, n3, n4);
                    } else {
                        n5 = n4 - (n5 - objectArray.length);
                        g.S(objectArray, objectArray, 0, n5, n4);
                        objectArray = this.b;
                        g.S(objectArray, objectArray, n2, n3, n5);
                    }
                } else {
                    Object[] objectArray = this.b;
                    g.S(objectArray, objectArray, n5, 0, n4);
                    objectArray = this.b;
                    if (n2 >= objectArray.length) {
                        g.S(objectArray, objectArray, n2 - objectArray.length, n3, objectArray.length);
                    } else {
                        g.S(objectArray, objectArray, 0, objectArray.length - n5, objectArray.length);
                        objectArray = this.b;
                        g.S(objectArray, objectArray, n2, n3, objectArray.length - n5);
                    }
                }
                this.a(n3, (Collection)object);
            }
            return true;
        }
        object = new StringBuilder("index: ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", size: ");
        ((StringBuilder)object).append(n3);
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    @Override
    public final boolean addAll(Collection collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.g();
        int n2 = this.c;
        this.b(collection.size() + n2);
        this.a(this.f(this.a + this.c), collection);
        return true;
    }

    public final void addLast(Object object) {
        this.g();
        this.b(this.c + 1);
        this.b[this.f((int)(this.a + this.c))] = object;
        ++this.c;
    }

    public final void b(int n2) {
        if (n2 >= 0) {
            int n3;
            Object[] objectArray = this.b;
            if (n2 <= objectArray.length) {
                return;
            }
            if (objectArray == d) {
                int n4 = n2;
                if (n2 < 10) {
                    n4 = 10;
                }
                this.b = new Object[n4];
                return;
            }
            int n5 = objectArray.length;
            n5 = n3 = n5 + (n5 >> 1);
            if (n3 - n2 < 0) {
                n5 = n2;
            }
            n3 = n5;
            if (n5 - 0x7FFFFFF7 > 0) {
                n3 = n2 > 0x7FFFFFF7 ? Integer.MAX_VALUE : 0x7FFFFFF7;
            }
            Object[] objectArray2 = new Object[n3];
            g.S(objectArray, objectArray2, 0, this.a, objectArray.length);
            objectArray = this.b;
            n2 = objectArray.length;
            n5 = this.a;
            g.S(objectArray, objectArray2, n2 - n5, 0, n5);
            this.a = 0;
            this.b = objectArray2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int n2) {
        Object[] objectArray = this.b;
        i.e(objectArray, "<this>");
        n2 = n2 == objectArray.length - 1 ? 0 : ++n2;
        return n2;
    }

    @Override
    public final void clear() {
        if (this.isEmpty() ^ true) {
            this.g();
            int n2 = this.f(this.a + this.c);
            this.e(this.a, n2);
        }
        this.a = 0;
        this.c = 0;
    }

    @Override
    public final boolean contains(Object object) {
        boolean bl = this.indexOf(object) != -1;
        return bl;
    }

    public final int d(int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + this.b.length;
        }
        return n3;
    }

    public final void e(int n2, int n3) {
        if (n2 < n3) {
            Object[] objectArray = this.b;
            i.e(objectArray, "<this>");
            Arrays.fill(objectArray, n2, n3, null);
        } else {
            Object[] objectArray = this.b;
            Arrays.fill(objectArray, n2, objectArray.length, null);
            objectArray = this.b;
            i.e(objectArray, "<this>");
            Arrays.fill(objectArray, 0, n3, null);
        }
    }

    public final int f(int n2) {
        Object[] objectArray = this.b;
        int n3 = n2;
        if (n2 >= objectArray.length) {
            n3 = n2 - objectArray.length;
        }
        return n3;
    }

    public final void g() {
        ++this.modCount;
    }

    public final Object get(int n2) {
        int n3 = this.c;
        if (n2 >= 0 && n2 < n3) {
            return this.b[this.f(this.a + n2)];
        }
        StringBuilder stringBuilder = new StringBuilder("index: ");
        stringBuilder.append(n2);
        stringBuilder.append(", size: ");
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int indexOf(Object object) {
        int n2 = this.a;
        int n3 = this.f(this.a + this.c);
        if (n2 < n3) {
            while (n2 < n3) {
                if (i.a(object, this.b[n2])) {
                    n3 = this.a;
                    return n2 - n3;
                }
                ++n2;
            }
            return -1;
        }
        if (n2 < n3) return -1;
        int n4 = this.b.length;
        while (n2 < n4) {
            if (i.a(object, this.b[n2])) {
                n3 = this.a;
                return n2 - n3;
            }
            ++n2;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            if (!i.a(object, this.b[n2])) continue;
            n2 += this.b.length;
            n3 = this.a;
            return n2 - n3;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        boolean bl = this.c == 0;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int lastIndexOf(Object object) {
        int n2 = this.a;
        int n3 = this.f(this.a + this.c);
        if (n2 < n3) {
            if (n2 > --n3) return -1;
            while (true) {
                if (i.a(object, this.b[n3])) {
                    n2 = this.a;
                    return n3 - n2;
                }
                if (n3 == n2) return -1;
                --n3;
            }
        }
        if (n2 <= n3) return -1;
        --n3;
        while (-1 < n3) {
            if (i.a(object, this.b[n3])) {
                n3 += this.b.length;
                n2 = this.a;
                return n3 - n2;
            }
            --n3;
        }
        Object[] objectArray = this.b;
        i.e(objectArray, "<this>");
        n3 = objectArray.length - 1;
        n2 = this.a;
        if (n2 > n3) return -1;
        while (true) {
            if (i.a(object, this.b[n3])) {
                n2 = this.a;
                return n3 - n2;
            }
            if (n3 == n2) return -1;
            --n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object remove(int n2) {
        int n3 = this.c--;
        if (n2 >= 0 && n2 < n3) {
            Object object;
            if (n2 == this.size() - 1) {
                if (this.isEmpty()) throw new NoSuchElementException("ArrayDeque is empty.");
                this.g();
                n2 = this.a;
                n2 = this.f(this.size() - 1 + n2);
                Object[] objectArray = this.b;
                object = objectArray[n2];
                objectArray[n2] = null;
                return object;
            } else {
                if (n2 == 0) {
                    return this.removeFirst();
                }
                this.g();
                n3 = this.f(this.a + n2);
                Object[] objectArray = this.b;
                object = objectArray[n3];
                if (n2 < this.c >> 1) {
                    n2 = this.a;
                    if (n3 >= n2) {
                        g.S(objectArray, objectArray, n2 + 1, n2, n3);
                    } else {
                        g.S(objectArray, objectArray, 1, 0, n3);
                        objectArray = this.b;
                        objectArray[0] = objectArray[objectArray.length - 1];
                        n2 = this.a;
                        g.S(objectArray, objectArray, n2 + 1, n2, objectArray.length - 1);
                    }
                    objectArray = this.b;
                    n2 = this.a;
                    objectArray[n2] = null;
                    this.a = this.c(n2);
                } else {
                    n2 = this.a;
                    n2 = this.f(this.size() - 1 + n2);
                    if (n3 <= n2) {
                        objectArray = this.b;
                        g.S(objectArray, objectArray, n3, n3 + 1, n2 + 1);
                    } else {
                        objectArray = this.b;
                        g.S(objectArray, objectArray, n3, n3 + 1, objectArray.length);
                        objectArray = this.b;
                        objectArray[objectArray.length - 1] = objectArray[0];
                        g.S(objectArray, objectArray, 0, 1, n2 + 1);
                    }
                    this.b[n2] = null;
                }
                --this.c;
            }
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder("index: ");
        stringBuilder.append(n2);
        stringBuilder.append(", size: ");
        stringBuilder.append(n3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public final boolean remove(Object object) {
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        this.remove(n2);
        return true;
    }

    @Override
    public final boolean removeAll(Collection objectArray) {
        i.e(objectArray, "elements");
        boolean bl = this.isEmpty();
        int n2 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.b.length == 0) {
                bl4 = bl2;
            } else {
                int n3 = this.a;
                int n4 = this.f(this.a + this.c);
                if (n3 < n4) {
                    int n5 = n3;
                    bl2 = bl3;
                    while (n3 < n4) {
                        Object object = this.b[n3];
                        if (objectArray.contains(object) ^ true) {
                            this.b[n5] = object;
                            ++n5;
                        } else {
                            bl2 = true;
                        }
                        ++n3;
                    }
                    objectArray = this.b;
                    i.e(objectArray, "<this>");
                    Arrays.fill(objectArray, n5, n4, null);
                    n3 = n5;
                } else {
                    Object object;
                    Object[] objectArray2;
                    int n6 = this.b.length;
                    int n7 = n3;
                    bl2 = false;
                    while (n3 < n6) {
                        objectArray2 = this.b;
                        object = objectArray2[n3];
                        objectArray2[n3] = null;
                        if (objectArray.contains(object) ^ true) {
                            this.b[n7] = object;
                            ++n7;
                        } else {
                            bl2 = true;
                        }
                        ++n3;
                    }
                    n3 = this.f(n7);
                    for (n7 = n2; n7 < n4; ++n7) {
                        objectArray2 = this.b;
                        object = objectArray2[n7];
                        objectArray2[n7] = null;
                        if (objectArray.contains(object) ^ true) {
                            this.b[n3] = object;
                            n3 = this.c(n3);
                            continue;
                        }
                        bl2 = true;
                    }
                }
                bl4 = bl2;
                if (bl2) {
                    this.g();
                    this.c = this.d(n3 - this.a);
                    bl4 = bl2;
                }
            }
        }
        return bl4;
    }

    public final Object removeFirst() {
        if (!this.isEmpty()) {
            this.g();
            Object[] objectArray = this.b;
            int n2 = this.a;
            Object object = objectArray[n2];
            objectArray[n2] = null;
            this.a = this.c(n2);
            --this.c;
            return object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    public final void removeRange(int n2, int n3) {
        com.github.catvod.spider.merge.xc.a.a.d(n2, n3, this.c);
        int n4 = n3 - n2;
        if (n4 == 0) {
            return;
        }
        if (n4 == this.c) {
            this.clear();
            return;
        }
        if (n4 == 1) {
            this.remove(n2);
            return;
        }
        this.g();
        if (n2 < this.c - n3) {
            int n5 = this.f(n2 - 1 + this.a);
            int n6 = this.f(n3 - 1 + this.a);
            n3 = n5;
            while (n2 > 0) {
                int n7 = n3 + 1;
                n5 = Math.min(n2, Math.min(n7, n6 + 1));
                Object[] objectArray = this.b;
                g.S(objectArray, objectArray, (n6 -= n5) + 1, (n3 -= n5) + 1, n7);
                n3 = this.d(n3);
                n6 = this.d(n6);
                n2 -= n5;
            }
            n2 = this.f(this.a + n4);
            this.e(this.a, n2);
            this.a = n2;
        } else {
            int n8 = this.f(this.a + n3);
            n2 = this.f(this.a + n2);
            int n9 = this.c;
            int n10 = n3;
            n3 = n8;
            while ((n9 -= n10) > 0) {
                Object[] objectArray = this.b;
                n10 = Math.min(n9, Math.min(objectArray.length - n3, objectArray.length - n2));
                objectArray = this.b;
                n8 = n3 + n10;
                g.S(objectArray, objectArray, n2, n3, n8);
                n3 = this.f(n8);
                n2 = this.f(n2 + n10);
            }
            n2 = this.f(this.a + this.c);
            this.e(this.d(n2 - n4), n2);
        }
        this.c -= n4;
    }

    @Override
    public final boolean retainAll(Collection objectArray) {
        i.e(objectArray, "elements");
        boolean bl = this.isEmpty();
        int n2 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.b.length == 0) {
                bl4 = bl2;
            } else {
                int n3 = this.a;
                int n4 = this.f(this.a + this.c);
                if (n3 < n4) {
                    int n5 = n3;
                    while (n3 < n4) {
                        Object object = this.b[n3];
                        if (objectArray.contains(object)) {
                            this.b[n5] = object;
                            ++n5;
                        } else {
                            bl3 = true;
                        }
                        ++n3;
                    }
                    objectArray = this.b;
                    i.e(objectArray, "<this>");
                    Arrays.fill(objectArray, n5, n4, null);
                    n3 = n5;
                } else {
                    Object[] objectArray2;
                    Object object;
                    int n6 = this.b.length;
                    int n7 = n3;
                    bl3 = false;
                    while (n3 < n6) {
                        object = this.b;
                        objectArray2 = object[n3];
                        object[n3] = null;
                        if (objectArray.contains(objectArray2)) {
                            this.b[n7] = objectArray2;
                            ++n7;
                        } else {
                            bl3 = true;
                        }
                        ++n3;
                    }
                    n3 = this.f(n7);
                    for (n7 = n2; n7 < n4; ++n7) {
                        objectArray2 = this.b;
                        object = objectArray2[n7];
                        objectArray2[n7] = null;
                        if (objectArray.contains(object)) {
                            this.b[n3] = object;
                            n3 = this.c(n3);
                            continue;
                        }
                        bl3 = true;
                    }
                }
                bl4 = bl3;
                if (bl3) {
                    this.g();
                    this.c = this.d(n3 - this.a);
                    bl4 = bl3;
                }
            }
        }
        return bl4;
    }

    public final Object set(int n2, Object object) {
        int n3 = this.c;
        if (n2 >= 0 && n2 < n3) {
            n2 = this.f(this.a + n2);
            Object[] objectArray = this.b;
            Object object2 = objectArray[n2];
            objectArray[n2] = object;
            return object2;
        }
        object = new StringBuilder("index: ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(", size: ");
        ((StringBuilder)object).append(n3);
        throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public final Object[] toArray() {
        return this.toArray(new Object[this.c]);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        i.e(objectArray, "array");
        int n2 = objectArray.length;
        int n3 = this.c;
        if (n2 < n3) {
            objectArray = Array.newInstance(objectArray.getClass().getComponentType(), n3);
            i.c(objectArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        }
        n3 = this.f(this.a + this.c);
        n2 = this.a;
        if (n2 < n3) {
            g.S(this.b, objectArray, 0, n2, n3);
        } else if (this.isEmpty() ^ true) {
            Object[] objectArray2 = this.b;
            g.S(objectArray2, objectArray, 0, this.a, objectArray2.length);
            objectArray2 = this.b;
            g.S(objectArray2, objectArray, objectArray2.length - this.a, 0, n3);
        }
        n3 = this.c;
        if (n3 < objectArray.length) {
            objectArray[n3] = null;
        }
        return objectArray;
    }
}

