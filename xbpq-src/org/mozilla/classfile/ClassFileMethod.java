/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import org.mozilla.classfile.ClassFileWriter;

final class ClassFileMethod {
    private byte[] itsCodeAttribute;
    private short itsFlags;
    private String itsName;
    private short itsNameIndex;
    private String itsType;
    private short itsTypeIndex;

    ClassFileMethod(String string, short s2, String string2, short s3, short s4) {
        this.itsName = string;
        this.itsNameIndex = s2;
        this.itsType = string2;
        this.itsTypeIndex = s3;
        this.itsFlags = s4;
    }

    short getFlags() {
        return this.itsFlags;
    }

    String getName() {
        return this.itsName;
    }

    String getType() {
        return this.itsType;
    }

    int getWriteSize() {
        return this.itsCodeAttribute.length + 8;
    }

    void setCodeAttribute(byte[] byArray) {
        this.itsCodeAttribute = byArray;
    }

    int write(byte[] byArray, int n2) {
        n2 = ClassFileWriter.putInt16(this.itsFlags, byArray, n2);
        n2 = ClassFileWriter.putInt16(this.itsNameIndex, byArray, n2);
        n2 = ClassFileWriter.putInt16(1, byArray, ClassFileWriter.putInt16(this.itsTypeIndex, byArray, n2));
        byte[] byArray2 = this.itsCodeAttribute;
        System.arraycopy(byArray2, 0, byArray, n2, byArray2.length);
        return n2 + this.itsCodeAttribute.length;
    }
}

