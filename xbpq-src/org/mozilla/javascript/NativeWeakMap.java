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
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public class NativeWeakMap
extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_delete = 2;
    private static final int Id_get = 3;
    private static final int Id_has = 4;
    private static final int Id_set = 5;
    private static final Object MAP_TAG = "WeakMap";
    private static final int MAX_PROTOTYPE_ID = 6;
    private static final Object NULL_VALUE = new Object();
    private static final int SymbolId_toStringTag = 6;
    private static final long serialVersionUID = 8670434366883930453L;
    private boolean instanceOfWeakMap = false;
    private transient WeakHashMap<Scriptable, Object> map = new WeakHashMap();

    static void init(Scriptable scriptable, boolean bl) {
        new NativeWeakMap().exportAsJSClass(6, scriptable, bl);
    }

    private Object js_delete(Object object) {
        if (!ScriptRuntime.isObject(object)) {
            return Boolean.FALSE;
        }
        boolean bl = this.map.remove(object) != null;
        return bl;
    }

    private Object js_get(Object object) {
        if (!ScriptRuntime.isObject(object)) {
            return Undefined.instance;
        }
        Object object2 = this.map.get(object);
        if (object2 == null) {
            return Undefined.instance;
        }
        object = object2;
        if (object2 == NULL_VALUE) {
            object = null;
        }
        return object;
    }

    private Object js_has(Object object) {
        if (!ScriptRuntime.isObject(object)) {
            return Boolean.FALSE;
        }
        return this.map.containsKey(object);
    }

    private Object js_set(Object object, Object object2) {
        if (ScriptRuntime.isObject(object)) {
            Object object3 = object2;
            if (object2 == null) {
                object3 = NULL_VALUE;
            }
            this.map.put((Scriptable)object, object3);
            return this;
        }
        throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.map = new WeakHashMap();
    }

    private static NativeWeakMap realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        scriptable = IdScriptableObject.ensureType(scriptable, NativeWeakMap.class, idFunctionObject);
        if (((NativeWeakMap)scriptable).instanceOfWeakMap) {
            return scriptable;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context object2, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(MAP_TAG)) {
            return super.execIdCall((IdFunctionObject)object, (Context)object2, scriptable, scriptable2, objectArray);
        }
        int n2 = ((IdFunctionObject)object).methodId();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 == 5) {
                            scriptable = NativeWeakMap.realThis(scriptable2, (IdFunctionObject)object);
                            object2 = NativeMap.key(objectArray);
                            object = objectArray.length > 1 ? objectArray[1] : Undefined.instance;
                            return super.js_set(object2, object);
                        }
                        object2 = a.c("WeakMap.prototype has no method: ");
                        ((StringBuilder)object2).append(((IdFunctionObject)object).getFunctionName());
                        throw new IllegalArgumentException(((StringBuilder)object2).toString());
                    }
                    return NativeWeakMap.realThis(scriptable2, (IdFunctionObject)object).js_has(NativeMap.key(objectArray));
                }
                return NativeWeakMap.realThis(scriptable2, (IdFunctionObject)object).js_get(NativeMap.key(objectArray));
            }
            return NativeWeakMap.realThis(scriptable2, (IdFunctionObject)object).js_delete(NativeMap.key(objectArray));
        }
        if (scriptable2 == null) {
            object = new NativeWeakMap();
            ((NativeWeakMap)object).instanceOfWeakMap = true;
            if (objectArray.length > 0) {
                NativeMap.loadFromIterable((Context)object2, scriptable, (ScriptableObject)object, NativeMap.key(objectArray));
            }
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.no.new", "WeakMap");
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 4;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 113762: {
                if (!string.equals("set")) break;
                n4 = 4;
                break;
            }
            case 103066: {
                if (!string.equals("has")) break;
                n4 = 3;
                break;
            }
            case 102230: {
                if (!string.equals("get")) break;
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
            case 4: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 2;
                break;
            }
            case 0: {
                n3 = 1;
            }
            case 3: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 6;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "WeakMap";
    }

    @Override
    protected void initPrototypeId(int n2) {
        int n3;
        String string;
        block6: {
            block1: {
                block7: {
                    block2: {
                        block3: {
                            block4: {
                                block5: {
                                    if (n2 == 6) {
                                        this.initPrototypeValue(6, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
                                        return;
                                    }
                                    if (n2 == 1) break block1;
                                    if (n2 == 2) break block2;
                                    if (n2 == 3) break block3;
                                    if (n2 == 4) break block4;
                                    if (n2 != 5) break block5;
                                    string = "set";
                                    n3 = 2;
                                    break block6;
                                }
                                throw new IllegalArgumentException(String.valueOf(n2));
                            }
                            string = "has";
                            break block7;
                        }
                        string = "get";
                        break block7;
                    }
                    string = "delete";
                }
                n3 = 1;
                break block6;
            }
            string = "constructor";
            n3 = 0;
        }
        this.initPrototypeMethod(MAP_TAG, n2, string, null, n3);
    }
}

