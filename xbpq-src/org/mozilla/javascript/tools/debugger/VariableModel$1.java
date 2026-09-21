/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.debugger;

import java.util.Comparator;
import org.mozilla.javascript.tools.debugger.VariableModel;

class VariableModel$1
implements Comparator<Object> {
    final VariableModel this$0;

    VariableModel$1(VariableModel variableModel) {
        this.this$0 = variableModel;
    }

    @Override
    public int compare(Object object, Object object2) {
        if (object instanceof String) {
            if (object2 instanceof Integer) {
                return -1;
            }
            return ((String)object).compareToIgnoreCase((String)object2);
        }
        if (object2 instanceof String) {
            return 1;
        }
        return (Integer)object - (Integer)object2;
    }
}

