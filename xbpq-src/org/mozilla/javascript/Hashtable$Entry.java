/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.math.BigInteger;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;

public final class Hashtable$Entry
implements Serializable {
    private static final long serialVersionUID = 4086572107122965503L;
    protected boolean deleted;
    private final int hashCode;
    protected Object key;
    protected Hashtable$Entry next;
    protected Hashtable$Entry prev;
    protected Object value;

    Hashtable$Entry() {
        this.hashCode = 0;
    }

    /*
     * Unable to fully structure code
     */
    Hashtable$Entry(Object var1_1, Object var2_2) {
        block5: {
            super();
            if (!(var1_1 instanceof Number)) break block5;
            if (var1_1 instanceof Double || var1_1 instanceof BigInteger) ** GOTO lbl-1000
            var3_3 = ((Number)var1_1).doubleValue();
            ** GOTO lbl9
        }
        if (var1_1 instanceof ConsString) {
            var3_3 = var1_1.toString();
lbl9:
            // 2 sources

            this.key = var3_3;
        } else lbl-1000:
        // 2 sources

        {
            this.key = var1_1;
        }
        if (this.key == null) {
            while (true) {
                this.hashCode = 0;
                break;
            }
        } else {
            if (var1_1.equals(ScriptRuntime.negativeZeroObj)) ** continue;
            this.hashCode = this.key.hashCode();
        }
        this.value = var2_2;
    }

    void clear() {
        Object object;
        this.key = object = Undefined.instance;
        this.value = object;
        this.deleted = true;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        try {
            boolean bl = ScriptRuntime.sameZero(this.key, ((Hashtable$Entry)object).key);
            return bl;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object key() {
        return this.key;
    }

    public Object value() {
        return this.value;
    }
}

