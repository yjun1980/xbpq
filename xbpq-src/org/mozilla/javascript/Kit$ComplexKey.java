/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

final class Kit$ComplexKey {
    private int hash;
    private Object key1;
    private Object key2;

    Kit$ComplexKey(Object object, Object object2) {
        this.key1 = object;
        this.key2 = object2;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof Kit$ComplexKey;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (Kit$ComplexKey)object;
        bl = bl2;
        if (this.key1.equals(((Kit$ComplexKey)object).key1)) {
            bl = bl2;
            if (this.key2.equals(((Kit$ComplexKey)object).key2)) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        if (this.hash == 0) {
            this.hash = this.key1.hashCode() ^ this.key2.hashCode();
        }
        return this.hash;
    }
}

