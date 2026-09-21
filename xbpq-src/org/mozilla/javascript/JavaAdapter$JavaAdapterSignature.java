/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Arrays;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.ObjToIntMap$Iterator;

class JavaAdapter$JavaAdapterSignature {
    Class<?>[] interfaces;
    ObjToIntMap names;
    Class<?> superClass;

    JavaAdapter$JavaAdapterSignature(Class<?> clazz, Class<?>[] classArray, ObjToIntMap objToIntMap) {
        this.superClass = clazz;
        this.interfaces = classArray;
        this.names = objToIntMap;
    }

    public boolean equals(Object object) {
        int n2;
        if (!(object instanceof JavaAdapter$JavaAdapterSignature)) {
            return false;
        }
        object = (JavaAdapter$JavaAdapterSignature)object;
        if (this.superClass != ((JavaAdapter$JavaAdapterSignature)object).superClass) {
            return false;
        }
        Object object2 = this.interfaces;
        Object object3 = ((JavaAdapter$JavaAdapterSignature)object).interfaces;
        if (object2 != object3) {
            if (((Class<?>[])object2).length != ((Class<?>[])object3).length) {
                return false;
            }
            for (n2 = 0; n2 < ((Class<?>[])(object3 = this.interfaces)).length; ++n2) {
                if (object3[n2] == ((JavaAdapter$JavaAdapterSignature)object).interfaces[n2]) continue;
                return false;
            }
        }
        if (this.names.size() != ((JavaAdapter$JavaAdapterSignature)object).names.size()) {
            return false;
        }
        object3 = new ObjToIntMap$Iterator(this.names);
        ((ObjToIntMap$Iterator)object3).start();
        while (!((ObjToIntMap$Iterator)object3).done()) {
            object2 = (String)((ObjToIntMap$Iterator)object3).getKey();
            n2 = ((ObjToIntMap$Iterator)object3).getValue();
            if (n2 != ((JavaAdapter$JavaAdapterSignature)object).names.get(object2, n2 + 1)) {
                return false;
            }
            ((ObjToIntMap$Iterator)object3).next();
        }
        return true;
    }

    public int hashCode() {
        return this.superClass.hashCode() + Arrays.hashCode(this.interfaces) ^ this.names.size();
    }
}

