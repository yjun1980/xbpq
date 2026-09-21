/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

final class Undefined$1
implements Scriptable {
    Undefined$1() {
    }

    @Override
    public void delete(int n2) {
    }

    @Override
    public void delete(String string) {
    }

    public boolean equals(Object object) {
        boolean bl = Undefined.isUndefined(object) || super.equals(object);
        return bl;
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        return Scriptable.NOT_FOUND;
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return "undefined";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        if (clazz != null && clazz != ScriptRuntime.StringClass) {
            return null;
        }
        return this.toString();
    }

    @Override
    public Object[] getIds() {
        return ScriptRuntime.emptyArgs;
    }

    @Override
    public Scriptable getParentScope() {
        return null;
    }

    @Override
    public Scriptable getPrototype() {
        return null;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        return false;
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        return false;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return false;
    }

    public int hashCode() {
        return Undefined.access$000();
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
    }

    @Override
    public void setParentScope(Scriptable scriptable) {
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
    }

    public String toString() {
        return "undefined";
    }
}

