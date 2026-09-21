/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Comparator;

public final class ScriptableObject$KeyComparator
implements Comparator<Object>,
Serializable {
    private static final long serialVersionUID = 6411335891523988149L;

    @Override
    public int compare(Object object, Object object2) {
        if (object instanceof Integer) {
            if (object2 instanceof Integer) {
                return ((Integer)object).compareTo((Integer)object2);
            }
            return -1;
        }
        if (object2 instanceof Integer) {
            return 1;
        }
        return 0;
    }
}

