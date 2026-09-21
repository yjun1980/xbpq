/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class Slot
implements Serializable {
    private static final long serialVersionUID = -6090581677123995491L;
    private short attributes;
    int indexOrHash;
    Object name;
    transient Slot next;
    transient Slot orderedNext;
    Object value;

    Slot(Object object, int n2, int n3) {
        this.name = object;
        this.indexOrHash = n2;
        this.attributes = (short)n3;
    }

    protected Slot(Slot slot) {
        this.name = slot.name;
        this.indexOrHash = slot.indexOrHash;
        this.attributes = slot.attributes;
        this.value = slot.value;
        this.next = slot.next;
        this.orderedNext = slot.orderedNext;
    }

    private void readObject(ObjectInputStream object) {
        ((ObjectInputStream)object).defaultReadObject();
        object = this.name;
        if (object != null) {
            this.indexOrHash = object.hashCode();
        }
    }

    int getAttributes() {
        return this.attributes;
    }

    Function getGetterFunction(String string, Scriptable scriptable) {
        return null;
    }

    ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
        return ScriptableObject.buildDataDescriptor(scriptable, this.value, this.attributes);
    }

    Function getSetterFunction(String string, Scriptable scriptable) {
        return null;
    }

    public Object getValue(Scriptable scriptable) {
        return this.value;
    }

    boolean isSetterSlot() {
        return false;
    }

    boolean isValueSlot() {
        return true;
    }

    void setAttributes(int n2) {
        synchronized (this) {
            ScriptableObject.checkValidAttributes(n2);
            this.attributes = (short)n2;
            return;
        }
    }

    public final boolean setValue(Object object, Scriptable scriptable, Scriptable scriptable2) {
        return this.setValue(object, scriptable, scriptable2, Context.isCurrentContextStrict());
    }

    public boolean setValue(Object object, Scriptable scriptable, Scriptable scriptable2, boolean bl) {
        if ((this.attributes & 1) != 0) {
            if (!bl) {
                return true;
            }
            throw ScriptRuntime.typeErrorById("msg.modify.readonly", this.name);
        }
        if (scriptable == scriptable2) {
            this.value = object;
            return true;
        }
        return false;
    }

    protected void throwNoSetterException(Scriptable object, Object object2) {
        Object object3 = Context.getContext();
        if (!((Context)object3).isStrictMode() && !((Context)object3).hasFeature(11)) {
            return;
        }
        if (this.name != null) {
            object3 = a.c("[");
            ((StringBuilder)object3).append(object.getClassName());
            ((StringBuilder)object3).append("].");
            ((StringBuilder)object3).append(this.name);
            object = ((StringBuilder)object3).toString();
        } else {
            object = "";
        }
        throw ScriptRuntime.typeErrorById("msg.set.prop.no.setter", object, Context.toString(object2));
    }
}

