/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Comparator;

public final class Sorting {
    private static final int SMALLSORT = 16;
    private static final Sorting sorting = new Sorting();

    private Sorting() {
    }

    public static Sorting get() {
        return sorting;
    }

    private void hybridSort(Object[] objectArray, int n2, int n3, Comparator<Object> comparator, int n4) {
        if (n2 < n3) {
            if (n4 != 0 && n3 - n2 > 16) {
                int n5 = this.partition(objectArray, n2, n3, comparator);
                this.hybridSort(objectArray, n2, n5, comparator, --n4);
                this.hybridSort(objectArray, n5 + 1, n3, comparator, n4);
            } else {
                Sorting.insertionSort(objectArray, n2, n3, comparator);
            }
        }
    }

    private static void insertionSort(Object[] objectArray, int n2, int n3, Comparator<Object> comparator) {
        for (int i2 = n2; i2 <= n3; ++i2) {
            Object object = objectArray[i2];
            for (int i4 = i2 - 1; i4 >= n2 && comparator.compare(objectArray[i4], object) > 0; --i4) {
                objectArray[i4 + 1] = objectArray[i4];
            }
            objectArray[i4 + 1] = object;
        }
    }

    private static int log2(int n2) {
        return (int)(Math.log10(n2) / Math.log10(2.0));
    }

    private int partition(Object[] objectArray, int n2, int n3, Comparator<Object> comparator) {
        int n4 = this.median(objectArray, n2, n3, comparator);
        Object object = objectArray[n4];
        objectArray[n4] = objectArray[n2];
        objectArray[n2] = object;
        n4 = n3 + 1;
        int n5 = n2;
        while (true) {
            int n6 = n5 + 1;
            n5 = n4;
            if (comparator.compare(objectArray[n6], object) < 0) {
                n5 = n6;
                if (n6 != n3) continue;
                n5 = n4;
            }
            while (comparator.compare(objectArray[n4 = n5 - 1], object) >= 0) {
                n5 = n4;
                if (n4 != n2) continue;
            }
            if (n6 >= n4) {
                Sorting.swap(objectArray, n2, n4);
                return n4;
            }
            Sorting.swap(objectArray, n6, n4);
            n5 = n6;
        }
    }

    private static void swap(Object[] objectArray, int n2, int n3) {
        Object object = objectArray[n2];
        objectArray[n2] = objectArray[n3];
        objectArray[n3] = object;
    }

    public void hybridSort(Object[] objectArray, Comparator<Object> comparator) {
        this.hybridSort(objectArray, 0, objectArray.length - 1, comparator, Sorting.log2(objectArray.length) * 2);
    }

    public void insertionSort(Object[] objectArray, Comparator<Object> comparator) {
        Sorting.insertionSort(objectArray, 0, objectArray.length - 1, comparator);
    }

    public int median(Object[] objectArray, int n2, int n3, Comparator<Object> comparator) {
        int n4 = (n3 - n2) / 2 + n2;
        int n5 = comparator.compare(objectArray[n2], objectArray[n4]) > 0 ? n4 : n2;
        int n6 = n5;
        if (comparator.compare(objectArray[n5], objectArray[n3]) > 0) {
            n6 = n3;
        }
        if (n6 == n2) {
            n2 = n3;
            if (comparator.compare(objectArray[n4], objectArray[n3]) < 0) {
                n2 = n4;
            }
            return n2;
        }
        if (n6 == n4) {
            if (comparator.compare(objectArray[n2], objectArray[n3]) >= 0) {
                n2 = n3;
            }
            return n2;
        }
        if (comparator.compare(objectArray[n2], objectArray[n4]) >= 0) {
            n2 = n4;
        }
        return n2;
    }
}

