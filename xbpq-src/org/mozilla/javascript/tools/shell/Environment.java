/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.tools.shell;

import java.util.Dictionary;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class Environment
extends ScriptableObject {
    static final long serialVersionUID = -430727378460177065L;
    private Environment thePrototypeInstance = null;

    public Environment() {
        this.thePrototypeInstance = this;
    }

    public Environment(ScriptableObject object) {
        this.setParentScope((Scriptable)object);
        object = ScriptRuntime.getTopLevelProp((Scriptable)object, "Environment");
        if (object != null && object instanceof Scriptable) {
            object = (Scriptable)object;
            this.setPrototype((Scriptable)object.get("prototype", (Scriptable)object));
        }
    }

    private Object[] collectIds() {
        return System.getProperties().keySet().toArray();
    }

    public static void defineClass(ScriptableObject scriptableObject) {
        try {
            ScriptableObject.defineClass(scriptableObject, Environment.class);
            return;
        }
        catch (Exception exception) {
            throw new Error(exception.getMessage());
        }
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        if (this == this.thePrototypeInstance) {
            return super.get(string, scriptable);
        }
        if ((string = System.getProperty(string)) != null) {
            return ScriptRuntime.toObject(this.getParentScope(), string);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public Object[] getAllIds() {
        if (this == this.thePrototypeInstance) {
            return super.getAllIds();
        }
        return this.collectIds();
    }

    @Override
    public String getClassName() {
        return "Environment";
    }

    @Override
    public Object[] getIds() {
        if (this == this.thePrototypeInstance) {
            return super.getIds();
        }
        return this.collectIds();
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        if (this == this.thePrototypeInstance) {
            return super.has(string, scriptable);
        }
        boolean bl = System.getProperty(string) != null;
        return bl;
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        if (this == this.thePrototypeInstance) {
            super.put(string, scriptable, object);
        } else {
            ((Dictionary)System.getProperties()).put(string, ScriptRuntime.toString(object));
        }
    }
}

