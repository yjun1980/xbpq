/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.classfile;

final class ConstantEntry {
    private int hashcode;
    private int intval;
    private long longval;
    private String str1;
    private String str2;
    private int type;

    ConstantEntry(int n2, int n3, String string, String string2) {
        this.type = n2;
        this.intval = n3;
        this.str1 = string;
        this.str2 = string2;
        int n4 = string.hashCode();
        this.hashcode = n2 ^ string2.hashCode() * n4 + n3;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof ConstantEntry;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        if (!bl) {
            return false;
        }
        object = (ConstantEntry)object;
        int n2 = this.type;
        if (n2 != ((ConstantEntry)object).type) {
            return false;
        }
        if (n2 != 3 && n2 != 4) {
            if (n2 != 5 && n2 != 6) {
                if (n2 != 12) {
                    if (n2 == 18) {
                        bl3 = bl5;
                        if (this.intval == ((ConstantEntry)object).intval) {
                            bl3 = bl5;
                            if (this.str1.equals(((ConstantEntry)object).str1)) {
                                bl3 = bl5;
                                if (this.str2.equals(((ConstantEntry)object).str2)) {
                                    bl3 = true;
                                }
                            }
                        }
                        return bl3;
                    }
                    throw new RuntimeException("unsupported constant type");
                }
                bl3 = bl2;
                if (this.str1.equals(((ConstantEntry)object).str1)) {
                    bl3 = bl2;
                    if (this.str2.equals(((ConstantEntry)object).str2)) {
                        bl3 = true;
                    }
                }
                return bl3;
            }
            if (this.longval == ((ConstantEntry)object).longval) {
                bl3 = true;
            }
            return bl3;
        }
        bl3 = bl4;
        if (this.intval == ((ConstantEntry)object).intval) {
            bl3 = true;
        }
        return bl3;
    }

    public int hashCode() {
        return this.hashcode;
    }
}

