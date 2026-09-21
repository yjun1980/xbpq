/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import org.mozilla.classfile.ClassFileWriter;

final class ClassFileField {
    private short itsAttr1;
    private short itsAttr2;
    private short itsAttr3;
    private short itsFlags;
    private boolean itsHasAttributes;
    private int itsIndex;
    private short itsNameIndex;
    private short itsTypeIndex;

    ClassFileField(short s2, short s3, short s4) {
        this.itsNameIndex = s2;
        this.itsTypeIndex = s3;
        this.itsFlags = s4;
        this.itsHasAttributes = false;
    }

    int getWriteSize() {
        int n2 = !this.itsHasAttributes ? 8 : 16;
        return n2;
    }

    void setAttributes(short s2, short s3, short s4, int n2) {
        this.itsHasAttributes = true;
        this.itsAttr1 = s2;
        this.itsAttr2 = s3;
        this.itsAttr3 = s4;
        this.itsIndex = n2;
    }

    int write(byte[] byArray, int n2) {
        n2 = ClassFileWriter.putInt16(this.itsFlags, byArray, n2);
        n2 = ClassFileWriter.putInt16(this.itsNameIndex, byArray, n2);
        int n3 = ClassFileWriter.putInt16(this.itsTypeIndex, byArray, n2);
        if (!this.itsHasAttributes) {
            n2 = 0;
        } else {
            n2 = ClassFileWriter.putInt16(1, byArray, n3);
            n2 = ClassFileWriter.putInt16(this.itsAttr1, byArray, n2);
            n2 = ClassFileWriter.putInt16(this.itsAttr2, byArray, n2);
            n3 = ClassFileWriter.putInt16(this.itsAttr3, byArray, n2);
            n2 = this.itsIndex;
        }
        return ClassFileWriter.putInt16(n2, byArray, n3);
    }
}

