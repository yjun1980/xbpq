/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

public final class ClassFileWriter$MHandle {
    final String desc;
    final String name;
    final String owner;
    final byte tag;

    public ClassFileWriter$MHandle(byte by, String string, String string2, String string3) {
        this.tag = by;
        this.owner = string;
        this.name = string2;
        this.desc = string3;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof ClassFileWriter$MHandle)) {
            return false;
        }
        object = (ClassFileWriter$MHandle)object;
        if (!(this.tag == ((ClassFileWriter$MHandle)object).tag && this.owner.equals(((ClassFileWriter$MHandle)object).owner) && this.name.equals(((ClassFileWriter$MHandle)object).name) && this.desc.equals(((ClassFileWriter$MHandle)object).desc))) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        byte by = this.tag;
        int n2 = this.owner.hashCode();
        int n3 = this.name.hashCode();
        return this.desc.hashCode() * (n3 * n2) + by;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.owner);
        stringBuilder.append('.');
        stringBuilder.append(this.name);
        stringBuilder.append(this.desc);
        stringBuilder.append(" (");
        stringBuilder.append(this.tag);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

