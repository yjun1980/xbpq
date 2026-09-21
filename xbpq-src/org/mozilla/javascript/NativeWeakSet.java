/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.io.ObjectInputStream;
import java.util.Objects;
import java.util.WeakHashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeMap;
import org.mozilla.javascript.NativeSet;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;

public class NativeWeakSet
extends IdScriptableObject {
    private static final int Id_add = 2;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 3;
    private static final int Id_has = 4;
    private static final Object MAP_TAG = "WeakSet";
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final int SymbolId_toStringTag = 5;
    private static final long serialVersionUID = 2065753364224029534L;
    private boolean instanceOfWeakSet = false;
    private transient WeakHashMap<Scriptable, Boolean> map = new WeakHashMap();

    static void init(Scriptable scriptable, boolean bl) {
        new NativeWeakSet().exportAsJSClass(5, scriptable, bl);
    }

    private Object js_add(Object object) {
        if (ScriptRuntime.isObject(object)) {
            this.map.put((Scriptable)object, Boolean.TRUE);
            return this;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object));
    }

    private Object js_delete(Object object) {
        if (!ScriptRuntime.isObject(object)) {
            return Boolean.FALSE;
        }
        boolean bl = this.map.remove(object) != null;
        return bl;
    }

    private Object js_has(Object object) {
        if (!ScriptRuntime.isObject(object)) {
            return Boolean.FALSE;
        }
        return this.map.containsKey(object);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.map = new WeakHashMap();
    }

    private static NativeWeakSet realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        scriptable = IdScriptableObject.ensureType(scriptable, NativeWeakSet.class, idFunctionObject);
        if (((NativeWeakSet)scriptable).instanceOfWeakSet) {
            return scriptable;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override
    public Object execIdCall(IdFunctionObject idScriptableObject, Context object, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)idScriptableObject).hasTag(MAP_TAG)) {
            return super.execIdCall((IdFunctionObject)idScriptableObject, (Context)object, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)idScriptableObject).methodId();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 == 4) {
                        return NativeWeakSet.realThis(scriptable2, (IdFunctionObject)idScriptableObject).js_has(NativeMap.key(objectArray));
                    }
                    object = a.c("WeakMap.prototype has no method: ");
                    ((StringBuilder)object).append(((IdFunctionObject)idScriptableObject).getFunctionName());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                return NativeWeakSet.realThis(scriptable2, (IdFunctionObject)idScriptableObject).js_delete(NativeMap.key(objectArray));
            }
            return NativeWeakSet.realThis(scriptable2, (IdFunctionObject)idScriptableObject).js_add(NativeMap.key(objectArray));
        }
        if (scriptable2 == null) {
            idScriptableObject = new NativeWeakSet();
            ((NativeWeakSet)idScriptableObject).instanceOfWeakSet = true;
            if (objectArray.length > 0) {
                NativeSet.loadFromIterable((Context)object, scriptable, idScriptableObject, NativeMap.key(objectArray));
            }
            return idScriptableObject;
        }
        throw ScriptRuntime.typeErrorById("msg.no.new", "WeakSet");
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 3;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 103066: {
                if (!string.equals("has")) break;
                n4 = 3;
                break;
            }
            case 96417: {
                if (!string.equals("add")) break;
                n4 = 2;
                break;
            }
            case -1335458389: {
                if (!string.equals("delete")) break;
                n4 = 1;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 4;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 1: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 5;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "WeakSet";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void initPrototypeId(int n2) {
        int n3;
        String string;
        if (n2 == 5) {
            this.initPrototypeValue(5, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
            return;
        }
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) throw new IllegalArgumentException(String.valueOf(n2));
                    string = "has";
                } else {
                    string = "delete";
                }
            } else {
                string = "add";
            }
            n3 = 1;
        } else {
            string = "constructor";
            n3 = 0;
        }
        this.initPrototypeMethod(MAP_TAG, n2, string, null, n3);
    }
}

