/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.lang.reflect.Array;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;

public class NativeJavaArray
extends NativeJavaObject {
    private static final long serialVersionUID = -924022554283675333L;
    Object array;
    Class<?> cls;
    int length;

    public NativeJavaArray(Scriptable object, Object object2) {
        super((Scriptable)object, null, ScriptRuntime.ObjectClass);
        object = object2.getClass();
        if (((Class)object).isArray()) {
            this.array = object2;
            this.length = Array.getLength(object2);
            this.cls = ((Class)object).getComponentType();
            return;
        }
        throw new RuntimeException("Array expected");
    }

    public static NativeJavaArray wrap(Scriptable scriptable, Object object) {
        return new NativeJavaArray(scriptable, object);
    }

    @Override
    public void delete(Symbol symbol) {
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = object instanceof NativeJavaArray && Objects.equals(((NativeJavaArray)object).array, this.array);
        return bl;
    }

    @Override
    public Object get(int n2, Scriptable object) {
        if (n2 >= 0 && n2 < this.length) {
            object = Context.getContext();
            Object object2 = Array.get(this.array, n2);
            return ((Context)object).getWrapFactory().wrap((Context)object, this, object2, this.cls);
        }
        return Undefined.instance;
    }

    @Override
    public Object get(String string, Scriptable object) {
        if (string.equals("length")) {
            return this.length;
        }
        if ((object = super.get(string, (Scriptable)object)) == Scriptable.NOT_FOUND && !ScriptableObject.hasProperty(this.getPrototype(), string)) {
            throw Context.reportRuntimeErrorById("msg.java.member.not.found", this.array.getClass().getName(), string);
        }
        return object;
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        if (SymbolKey.IS_CONCAT_SPREADABLE.equals(symbol)) {
            return Boolean.TRUE;
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return "JavaArray";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        if (clazz != null && clazz != ScriptRuntime.StringClass) {
            if (clazz == ScriptRuntime.BooleanClass) {
                return Boolean.TRUE;
            }
            if (clazz == ScriptRuntime.NumberClass) {
                return ScriptRuntime.NaNobj;
            }
            return this;
        }
        return this.array.toString();
    }

    @Override
    public Object[] getIds() {
        int n2 = this.length;
        Object[] objectArray = new Object[n2];
        while (--n2 >= 0) {
            objectArray[n2] = n2;
        }
        return objectArray;
    }

    @Override
    public Scriptable getPrototype() {
        if (this.prototype == null) {
            this.prototype = ScriptableObject.getArrayPrototype(this.getParentScope());
        }
        return this.prototype;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        boolean bl = n2 >= 0 && n2 < this.length;
        return bl;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        boolean bl = string.equals("length") || super.has(string, scriptable);
        return bl;
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        return SymbolKey.IS_CONCAT_SPREADABLE.equals(symbol);
    }

    @Override
    public boolean hasInstance(Scriptable object) {
        if (!(object instanceof Wrapper)) {
            return false;
        }
        object = ((Wrapper)object).unwrap();
        return this.cls.isInstance(object);
    }

    @Override
    public int hashCode() {
        Object object = this.array;
        int n2 = object == null ? 0 : object.hashCode();
        return n2;
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        if (n2 >= 0 && n2 < this.length) {
            Array.set(this.array, n2, Context.jsToJava(object, this.cls));
            return;
        }
        throw Context.reportRuntimeErrorById("msg.java.array.index.out.of.bounds", String.valueOf(n2), String.valueOf(this.length - 1));
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        if (string.equals("length")) {
            return;
        }
        throw Context.reportRuntimeErrorById("msg.java.array.member.not.found", string);
    }

    @Override
    public Object unwrap() {
        return this.array;
    }
}

