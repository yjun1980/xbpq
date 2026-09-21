/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Map;
import org.mozilla.javascript.NativeObject$EntrySet$1;

class NativeObject$EntrySet$1$1
implements Map.Entry<Object, Object> {
    final NativeObject$EntrySet.1 this$2;
    final Object val$ekey;
    final Object val$value;

    NativeObject$EntrySet$1$1(NativeObject$EntrySet.1 var1_1, Object object, Object object2) {
        this.this$2 = var1_1;
        this.val$ekey = object;
        this.val$value = object2;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl;
        block5: {
            block8: {
                Map.Entry entry;
                boolean bl2;
                block7: {
                    block6: {
                        block4: {
                            bl = object instanceof Map.Entry;
                            bl2 = false;
                            if (!bl) {
                                return false;
                            }
                            entry = (Map.Entry)object;
                            object = this.val$ekey;
                            if (object != null) break block4;
                            bl = bl2;
                            if (entry.getKey() != null) break block5;
                            break block6;
                        }
                        bl = bl2;
                        if (!object.equals(entry.getKey())) break block5;
                    }
                    object = this.val$value;
                    entry = entry.getValue();
                    if (object != null) break block7;
                    bl = bl2;
                    if (entry != null) break block5;
                    break block8;
                }
                bl = bl2;
                if (!object.equals(entry)) break block5;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public Object getKey() {
        return this.val$ekey;
    }

    @Override
    public Object getValue() {
        return this.val$value;
    }

    @Override
    public int hashCode() {
        Object object = this.val$ekey;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.val$value;
        if (object != null) {
            n2 = object.hashCode();
        }
        return n3 ^ n2;
    }

    @Override
    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.val$ekey);
        stringBuilder.append("=");
        stringBuilder.append(this.val$value);
        return stringBuilder.toString();
    }
}

