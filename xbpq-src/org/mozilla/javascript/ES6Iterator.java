/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public abstract class ES6Iterator
extends IdScriptableObject {
    public static final String DONE_PROPERTY = "done";
    private static final int Id_next = 1;
    private static final int MAX_PROTOTYPE_ID = 3;
    public static final String NEXT_METHOD = "next";
    public static final String RETURN_METHOD = "return";
    public static final String RETURN_PROPERTY = "return";
    private static final int SymbolId_iterator = 2;
    private static final int SymbolId_toStringTag = 3;
    public static final String VALUE_PROPERTY = "value";
    private static final long serialVersionUID = 2438373029140003950L;
    protected boolean exhausted = false;
    private String tag;

    protected ES6Iterator() {
    }

    protected ES6Iterator(Scriptable scriptable, String string) {
        this.tag = string;
        scriptable = ScriptableObject.getTopLevelScope(scriptable);
        this.setParentScope(scriptable);
        this.setPrototype((IdScriptableObject)ScriptableObject.getTopScopeValue(scriptable, string));
    }

    protected static void init(ScriptableObject scriptableObject, boolean bl, IdScriptableObject idScriptableObject, String string) {
        if (scriptableObject != null) {
            idScriptableObject.setParentScope(scriptableObject);
            idScriptableObject.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        }
        idScriptableObject.activatePrototypeMap(3);
        if (bl) {
            idScriptableObject.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(string, idScriptableObject);
        }
    }

    static Scriptable makeIteratorResult(Context context, Scriptable scriptable, Boolean bl) {
        return ES6Iterator.makeIteratorResult(context, scriptable, bl, Undefined.instance);
    }

    static Scriptable makeIteratorResult(Context object, Scriptable scriptable, Boolean bl, Object object2) {
        object = ((Context)object).newObject(scriptable);
        ScriptableObject.putProperty((Scriptable)object, VALUE_PROPERTY, object2);
        ScriptableObject.putProperty((Scriptable)object, DONE_PROPERTY, (Object)bl);
        return object;
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(this.getTag())) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        idScriptableObject = IdScriptableObject.ensureType(scriptable2, ES6Iterator.class, (IdFunctionObject)idScriptableObject);
        if (n2 != 1) {
            if (n2 == 2) {
                return idScriptableObject;
            }
            throw new IllegalArgumentException(String.valueOf(n2));
        }
        return ((ES6Iterator)idScriptableObject).next(context, scriptable);
    }

    @Override
    protected int findPrototypeId(String string) {
        if (NEXT_METHOD.equals(string)) {
            return 1;
        }
        return 0;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 2;
        }
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 3;
        }
        return 0;
    }

    protected String getTag() {
        return this.tag;
    }

    @Override
    protected void initPrototypeId(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    this.initPrototypeValue(3, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
                    return;
                }
                throw new IllegalArgumentException(String.valueOf(n2));
            }
            this.initPrototypeMethod((Object)this.getTag(), n2, SymbolKey.ITERATOR, "[Symbol.iterator]", 3);
            return;
        }
        this.initPrototypeMethod(this.getTag(), n2, NEXT_METHOD, 0);
    }

    protected abstract boolean isDone(Context var1, Scriptable var2);

    protected Object next(Context context, Scriptable scriptable) {
        Object object = Undefined.instance;
        boolean bl = this.isDone(context, scriptable) || this.exhausted;
        if (!bl) {
            object = this.nextValue(context, scriptable);
        } else {
            this.exhausted = true;
        }
        return ES6Iterator.makeIteratorResult(context, scriptable, bl, object);
    }

    protected abstract Object nextValue(Context var1, Scriptable var2);
}

