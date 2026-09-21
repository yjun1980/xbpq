/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.function.Consumer;
import java.util.function.Supplier;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;

public class LambdaSlot
extends Slot {
    private static final long serialVersionUID = -3046681698806493052L;
    transient Supplier<Object> getter;
    transient Consumer<Object> setter;

    LambdaSlot(Slot slot) {
        super(slot);
    }

    @Override
    ScriptableObject getPropertyDescriptor(Context supplier, Scriptable scriptable) {
        scriptable = (ScriptableObject)((Context)((Object)supplier)).newObject(scriptable);
        supplier = this.getter;
        supplier = supplier != null ? supplier.get() : this.value;
        ((ScriptableObject)scriptable).defineProperty("value", supplier, 0);
        ((ScriptableObject)scriptable).setCommonDescriptorProperties(this.getAttributes(), true);
        return scriptable;
    }

    @Override
    public Object getValue(Scriptable scriptable) {
        Supplier<Object> supplier = this.getter;
        if (supplier != null) {
            return supplier.get();
        }
        return super.getValue(scriptable);
    }

    @Override
    boolean isSetterSlot() {
        return false;
    }

    @Override
    boolean isValueSlot() {
        return false;
    }

    @Override
    public boolean setValue(Object object, Scriptable scriptable, Scriptable scriptable2, boolean bl) {
        Consumer<Object> consumer = this.setter;
        if (consumer != null) {
            if (scriptable == scriptable2) {
                consumer.accept(object);
                return true;
            }
            return false;
        }
        return super.setValue(object, scriptable, scriptable2, bl);
    }
}

