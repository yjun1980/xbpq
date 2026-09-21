/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolScriptable;

public class Delegator
implements Function,
SymbolScriptable {
    protected Scriptable obj;

    public Delegator() {
        this.obj = null;
    }

    public Delegator(Scriptable scriptable) {
        this.obj = scriptable;
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return ((Function)this.getDelegee()).call(context, scriptable, scriptable2, objectArray);
    }

    @Override
    public Scriptable construct(Context object, Scriptable scriptable, Object[] objectArray) {
        Scriptable scriptable2 = this.getDelegee();
        if (scriptable2 == null) {
            scriptable2 = this.newInstance();
            object = objectArray.length == 0 ? ((Context)object).newObject(scriptable) : ScriptRuntime.toObject((Context)object, scriptable, objectArray[0]);
            ((Delegator)scriptable2).setDelegee((Scriptable)object);
            return scriptable2;
        }
        return ((Function)scriptable2).construct((Context)object, scriptable, objectArray);
    }

    @Override
    public void delete(int n2) {
        this.getDelegee().delete(n2);
    }

    @Override
    public void delete(String string) {
        this.getDelegee().delete(string);
    }

    @Override
    public void delete(Symbol symbol) {
        Scriptable scriptable = this.getDelegee();
        if (scriptable instanceof SymbolScriptable) {
            ((SymbolScriptable)((Object)scriptable)).delete(symbol);
        }
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        return this.getDelegee().get(n2, scriptable);
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        return this.getDelegee().get(string, scriptable);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        Scriptable scriptable2 = this.getDelegee();
        if (scriptable2 instanceof SymbolScriptable) {
            return ((SymbolScriptable)((Object)scriptable2)).get(symbol, scriptable);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return this.getDelegee().getClassName();
    }

    @Override
    public Object getDefaultValue(Class<?> object) {
        object = object != null && object != ScriptRuntime.ScriptableClass && object != ScriptRuntime.FunctionClass ? this.getDelegee().getDefaultValue((Class<?>)object) : this;
        return object;
    }

    public Scriptable getDelegee() {
        return this.obj;
    }

    @Override
    public Object[] getIds() {
        return this.getDelegee().getIds();
    }

    @Override
    public Scriptable getParentScope() {
        return this.getDelegee().getParentScope();
    }

    @Override
    public Scriptable getPrototype() {
        return this.getDelegee().getPrototype();
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        return this.getDelegee().has(n2, scriptable);
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        return this.getDelegee().has(string, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        Scriptable scriptable2 = this.getDelegee();
        if (scriptable2 instanceof SymbolScriptable) {
            return ((SymbolScriptable)((Object)scriptable2)).has(symbol, scriptable);
        }
        return false;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return this.getDelegee().hasInstance(scriptable);
    }

    protected Delegator newInstance() {
        try {
            Delegator delegator = (Delegator)this.getClass().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            return delegator;
        }
        catch (Exception exception) {
            throw Context.throwAsScriptRuntimeEx(exception);
        }
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        this.getDelegee().put(n2, scriptable, object);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        this.getDelegee().put(string, scriptable, object);
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        Scriptable scriptable2 = this.getDelegee();
        if (scriptable2 instanceof SymbolScriptable) {
            ((SymbolScriptable)((Object)scriptable2)).put(symbol, scriptable, object);
        }
    }

    public void setDelegee(Scriptable scriptable) {
        this.obj = scriptable;
    }

    @Override
    public void setParentScope(Scriptable scriptable) {
        this.getDelegee().setParentScope(scriptable);
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
        this.getDelegee().setPrototype(scriptable);
    }
}

