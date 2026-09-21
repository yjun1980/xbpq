/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.classfile.ConstantPool;
import org.mozilla.classfile.TypeInfo;

final class SuperBlock {
    private int end;
    private int index;
    private boolean isInQueue;
    private boolean isInitialized;
    private int[] locals;
    private int[] stack;
    private int start;

    SuperBlock(int n2, int n3, int n4, int[] nArray) {
        this.index = n2;
        this.start = n3;
        this.end = n4;
        int[] nArray2 = new int[nArray.length];
        this.locals = nArray2;
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        this.stack = new int[0];
        this.isInitialized = false;
        this.isInQueue = false;
    }

    private static boolean mergeState(int[] nArray, int[] nArray2, int n2, ConstantPool constantPool) {
        boolean bl = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = nArray[i2];
            nArray[i2] = TypeInfo.merge(nArray[i2], nArray2[i2], constantPool);
            if (n3 == nArray[i2]) continue;
            bl = true;
        }
        return bl;
    }

    int getEnd() {
        return this.end;
    }

    int getIndex() {
        return this.index;
    }

    int[] getLocals() {
        int[] nArray = this.locals;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        return nArray2;
    }

    int[] getStack() {
        int[] nArray = this.stack;
        int[] nArray2 = new int[nArray.length];
        System.arraycopy(nArray, 0, nArray2, 0, nArray.length);
        return nArray2;
    }

    int getStart() {
        return this.start;
    }

    int[] getTrimmedLocals() {
        int n2;
        int[] nArray;
        int n3;
        for (n3 = this.locals.length - 1; n3 >= 0 && (nArray = this.locals)[n3] == 0 && !TypeInfo.isTwoWords(nArray[n3 - 1]); --n3) {
        }
        int n4 = n3 + 1;
        int n5 = 0;
        int n6 = n4;
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = n6;
            if (TypeInfo.isTwoWords(this.locals[n3])) {
                n2 = n6 - 1;
            }
            n6 = n2;
        }
        int[] nArray2 = new int[n6];
        n3 = 0;
        for (n2 = n5; n2 < n6; ++n2) {
            nArray = this.locals;
            nArray2[n2] = nArray[n3];
            n5 = n3;
            if (TypeInfo.isTwoWords(nArray[n3])) {
                n5 = n3 + 1;
            }
            n3 = n5 + 1;
        }
        return nArray2;
    }

    boolean isInQueue() {
        return this.isInQueue;
    }

    boolean isInitialized() {
        return this.isInitialized;
    }

    boolean merge(int[] nArray, int n2, int[] nArray2, int n3, ConstantPool constantPool) {
        boolean bl = this.isInitialized;
        boolean bl2 = true;
        if (!bl) {
            System.arraycopy(nArray, 0, this.locals, 0, n2);
            nArray = new int[n3];
            this.stack = nArray;
            System.arraycopy(nArray2, 0, nArray, 0, n3);
            this.isInitialized = true;
            return true;
        }
        int[] nArray3 = this.locals;
        if (nArray3.length == n2 && this.stack.length == n3) {
            boolean bl3 = SuperBlock.mergeState(nArray3, nArray, n2, constantPool);
            boolean bl4 = SuperBlock.mergeState(this.stack, nArray2, n3, constantPool);
            bl = bl2;
            if (!bl3) {
                bl = bl4 ? bl2 : false;
            }
            return bl;
        }
        throw new IllegalArgumentException("bad merge attempt");
    }

    void setInQueue(boolean bl) {
        this.isInQueue = bl;
    }

    void setInitialized(boolean bl) {
        this.isInitialized = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = a.c("sb ");
        stringBuilder.append(this.index);
        return stringBuilder.toString();
    }
}

