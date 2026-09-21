/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

final class FieldOrMethodRef {
    private String className;
    private int hashCode = -1;
    private String name;
    private String type;

    FieldOrMethodRef(String string, String string2, String string3) {
        this.className = string;
        this.name = string2;
        this.type = string3;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof FieldOrMethodRef;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (FieldOrMethodRef)object;
        bl = bl2;
        if (this.className.equals(((FieldOrMethodRef)object).className)) {
            bl = bl2;
            if (this.name.equals(((FieldOrMethodRef)object).name)) {
                bl = bl2;
                if (this.type.equals(((FieldOrMethodRef)object).type)) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    public String getClassName() {
        return this.className;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == -1) {
            this.hashCode = this.className.hashCode() ^ this.name.hashCode() ^ this.type.hashCode();
        }
        return this.hashCode;
    }
}

