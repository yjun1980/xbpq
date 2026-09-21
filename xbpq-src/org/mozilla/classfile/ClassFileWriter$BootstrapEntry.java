/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

import java.util.Arrays;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.classfile.ClassFileWriter$MHandle;

final class ClassFileWriter$BootstrapEntry {
    final byte[] code;
    final ClassFileWriter this$0;

    ClassFileWriter$BootstrapEntry(ClassFileWriter classFileWriter, ClassFileWriter.MHandle mHandle, Object ... objectArray) {
        this.this$0 = classFileWriter;
        byte[] byArray = new byte[objectArray.length * 2 + 4];
        this.code = byArray;
        short s2 = ClassFileWriter.access$500(classFileWriter).addMethodHandle(mHandle);
        ClassFileWriter.putInt16(s2, byArray, 0);
        ClassFileWriter.putInt16(objectArray.length, byArray, 2);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            ClassFileWriter.putInt16(ClassFileWriter.access$500(classFileWriter).addConstant(objectArray[i2]), this.code, i2 * 2 + 4);
        }
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof ClassFileWriter$BootstrapEntry && Arrays.equals(this.code, ((ClassFileWriter$BootstrapEntry)object).code);
        return bl;
    }

    public int hashCode() {
        return ~Arrays.hashCode(this.code);
    }
}

