/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolScriptable;

public class NativeWith
implements Scriptable,
SymbolScriptable,
IdFunctionCall,
Serializable {
    private static final Object FTAG = "With";
    private static final int Id_constructor = 1;
    private static final long serialVersionUID = 1L;
    protected Scriptable parent;
    protected Scriptable prototype;

    private NativeWith() {
    }

    protected NativeWith(Scriptable scriptable, Scriptable scriptable2) {
        this.parent = scriptable;
        this.prototype = scriptable2;
    }

    static void init(Scriptable scriptable, boolean bl) {
        NativeWith nativeWith = new NativeWith();
        nativeWith.setParentScope(scriptable);
        nativeWith.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        scriptable = new IdFunctionObject(nativeWith, FTAG, 1, "With", 0, scriptable);
        ((IdFunctionObject)scriptable).markAsConstructor(nativeWith);
        if (bl) {
            ((ScriptableObject)scriptable).sealObject();
        }
        ((IdFunctionObject)scriptable).exportAsScopeProperty();
    }

    static boolean isWithFunction(Object object) {
        boolean bl;
        boolean bl2 = object instanceof IdFunctionObject;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (IdFunctionObject)object;
            bl3 = bl;
            if (((IdFunctionObject)object).hasTag(FTAG)) {
                bl3 = bl;
                if (((IdFunctionObject)object).methodId() == 1) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    static Object newWithSpecial(Context object, Scriptable scriptable, Object[] objectArray) {
        ScriptRuntime.checkDeprecated((Context)object, "With");
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        NativeWith nativeWith = new NativeWith();
        object = objectArray.length == 0 ? ScriptableObject.getObjectPrototype(scriptable) : ScriptRuntime.toObject((Context)object, scriptable, objectArray[0]);
        nativeWith.setPrototype((Scriptable)object);
        nativeWith.setParentScope(scriptable);
        return nativeWith;
    }

    @Override
    public void delete(int n2) {
        this.prototype.delete(n2);
    }

    @Override
    public void delete(String string) {
        this.prototype.delete(string);
    }

    @Override
    public void delete(Symbol symbol) {
        Scriptable scriptable = this.prototype;
        if (scriptable instanceof SymbolScriptable) {
            ((SymbolScriptable)((Object)scriptable)).delete(symbol);
        }
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1) {
            throw Context.reportRuntimeErrorById("msg.cant.call.indirect", "With");
        }
        throw idFunctionObject.unknown();
    }

    @Override
    public Object get(int n2, Scriptable scriptable) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        return this.prototype.get(n2, scriptable2);
    }

    @Override
    public Object get(String string, Scriptable scriptable) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        return this.prototype.get(string, scriptable2);
    }

    @Override
    public Object get(Symbol symbol, Scriptable scriptable) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        if ((scriptable = this.prototype) instanceof SymbolScriptable) {
            return ((SymbolScriptable)((Object)scriptable)).get(symbol, scriptable2);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override
    public String getClassName() {
        return "With";
    }

    @Override
    public Object getDefaultValue(Class<?> clazz) {
        return this.prototype.getDefaultValue(clazz);
    }

    @Override
    public Object[] getIds() {
        return this.prototype.getIds();
    }

    @Override
    public Scriptable getParentScope() {
        return this.parent;
    }

    @Override
    public Scriptable getPrototype() {
        return this.prototype;
    }

    @Override
    public boolean has(int n2, Scriptable scriptable) {
        scriptable = this.prototype;
        return scriptable.has(n2, scriptable);
    }

    @Override
    public boolean has(String string, Scriptable scriptable) {
        scriptable = this.prototype;
        return scriptable.has(string, scriptable);
    }

    @Override
    public boolean has(Symbol symbol, Scriptable scriptable) {
        scriptable = this.prototype;
        if (scriptable instanceof SymbolScriptable) {
            return ((SymbolScriptable)((Object)scriptable)).has(symbol, scriptable);
        }
        return false;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        return this.prototype.hasInstance(scriptable);
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        this.prototype.put(n2, scriptable2, object);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        this.prototype.put(string, scriptable2, object);
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        Scriptable scriptable2 = scriptable;
        if (scriptable == this) {
            scriptable2 = this.prototype;
        }
        if ((scriptable = this.prototype) instanceof SymbolScriptable) {
            ((SymbolScriptable)((Object)scriptable)).put(symbol, scriptable2, object);
        }
    }

    @Override
    public void setParentScope(Scriptable scriptable) {
        this.parent = scriptable;
    }

    @Override
    public void setPrototype(Scriptable scriptable) {
        this.prototype = scriptable;
    }

    protected Object updateDotQuery(boolean bl) {
        throw new IllegalStateException();
    }
}

