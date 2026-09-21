/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Comparator;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

public final class NativeArray$ElementComparator
implements Comparator<Object>,
Serializable {
    private static final long serialVersionUID = -1189948017688708858L;
    private final Comparator<Object> child;

    public NativeArray$ElementComparator() {
        this.child = NativeArray.access$200();
    }

    public NativeArray$ElementComparator(Comparator<Object> comparator) {
        this.child = comparator;
    }

    @Override
    public int compare(Object object, Object object2) {
        Object object3 = Undefined.instance;
        int n2 = 1;
        if (object == object3) {
            if (object2 == object3) {
                return 0;
            }
            if (object2 == Scriptable.NOT_FOUND) {
                return -1;
            }
            return 1;
        }
        Object object4 = Scriptable.NOT_FOUND;
        if (object == object4) {
            if (object2 == object4) {
                n2 = 0;
            }
            return n2;
        }
        if (object2 == object4) {
            return -1;
        }
        if (object2 == object3) {
            return -1;
        }
        return this.child.compare(object, object2);
    }
}

