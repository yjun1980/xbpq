/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Arrays;
import org.mozilla.javascript.Wrapper;

class ResolvedOverload {
    final int index;
    final Class<?>[] types;

    ResolvedOverload(Object[] objectArray, int n2) {
        this.index = n2;
        this.types = new Class[objectArray.length];
        int n3 = objectArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            Class<?> clazz;
            Class<Object> object = clazz = objectArray[n2];
            if (clazz instanceof Wrapper) {
                object = ((Wrapper)((Object)clazz)).unwrap();
            }
            Class<?>[] classArray = this.types;
            object = object == null ? null : object.getClass();
            classArray[n2] = object;
        }
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof ResolvedOverload;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (ResolvedOverload)object;
        bl = bl2;
        if (Arrays.equals(this.types, ((ResolvedOverload)object).types)) {
            bl = bl2;
            if (this.index == ((ResolvedOverload)object).index) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        return Arrays.hashCode(this.types);
    }

    boolean matches(Object[] objectArray) {
        if (objectArray.length != this.types.length) {
            return false;
        }
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            Object object2 = object = objectArray[i2];
            if (object instanceof Wrapper) {
                object2 = ((Wrapper)object).unwrap();
            }
            if (!(object2 == null ? this.types[i2] != null : object2.getClass() != this.types[i2])) continue;
            return false;
        }
        return true;
    }
}

