/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

final class ExceptionTableEntry {
    short itsCatchType;
    int itsEndLabel;
    int itsHandlerLabel;
    int itsStartLabel;

    ExceptionTableEntry(int n2, int n3, int n4, short s2) {
        this.itsStartLabel = n2;
        this.itsEndLabel = n3;
        this.itsHandlerLabel = n4;
        this.itsCatchType = s2;
    }
}

