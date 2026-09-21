/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.h1.k;
import java.util.Objects;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Delegator;
import org.mozilla.javascript.Hashtable;
import org.mozilla.javascript.Hashtable$Entry;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeCollectionIterator;
import org.mozilla.javascript.NativeCollectionIterator$Type;
import org.mozilla.javascript.NativeSet;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public class NativeMap
extends IdScriptableObject {
    static final String ITERATOR_TAG = "Map Iterator";
    private static final int Id_clear = 6;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 4;
    private static final int Id_entries = 9;
    private static final int Id_forEach = 10;
    private static final int Id_get = 3;
    private static final int Id_has = 5;
    private static final int Id_keys = 7;
    private static final int Id_set = 2;
    private static final int Id_values = 8;
    private static final Object MAP_TAG = "Map";
    private static final int MAX_PROTOTYPE_ID = 12;
    private static final int SymbolId_getSize = 11;
    private static final int SymbolId_toStringTag = 12;
    private static final long serialVersionUID = 1171922614280016891L;
    private final Hashtable entries = new Hashtable();
    private boolean instanceOfMap = false;

    public static /* synthetic */ void a(Callable callable, Context context, Scriptable scriptable, ScriptableObject scriptableObject, Object object, Object object2) {
        callable.call(context, scriptable, scriptableObject, new Object[]{object, object2});
    }

    static void init(Context context, Scriptable scriptable, boolean bl) {
        NativeMap nativeMap = new NativeMap();
        IdFunctionObject idFunctionObject = nativeMap.exportAsJSClass(12, scriptable, false);
        ScriptableObject scriptableObject = (ScriptableObject)context.newObject(scriptable);
        scriptableObject.put("enumerable", (Scriptable)scriptableObject, (Object)Boolean.FALSE);
        scriptableObject.put("configurable", (Scriptable)scriptableObject, (Object)Boolean.TRUE);
        scriptableObject.put("get", (Scriptable)scriptableObject, nativeMap.get(NativeSet.GETSIZE, (Scriptable)nativeMap));
        nativeMap.defineOwnProperty(context, "size", scriptableObject);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, idFunctionObject);
        if (bl) {
            nativeMap.sealObject();
        }
    }

    private Object js_clear() {
        this.entries.clear();
        return Undefined.instance;
    }

    private Object js_delete(Object object) {
        return this.entries.deleteEntry(object);
    }

    private Object js_forEach(Context context, Scriptable scriptable, Object object, Object object2) {
        if (object instanceof Callable) {
            Callable callable = (Callable)object;
            boolean bl = context.isStrictMode();
            for (Hashtable$Entry hashtable$Entry : this.entries) {
                Object object3;
                object = object3 = ScriptRuntime.toObjectOrNull(context, object2, scriptable);
                if (object3 == null) {
                    object = object3;
                    if (!bl) {
                        object = scriptable;
                    }
                }
                object3 = object;
                if (object == null) {
                    object3 = Undefined.SCRIPTABLE_UNDEFINED;
                }
                callable.call(context, scriptable, (Scriptable)object3, new Object[]{hashtable$Entry.value, hashtable$Entry.key, this});
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.typeErrorById("msg.isnt.function", object, ScriptRuntime.typeof(object));
    }

    private Object js_get(Object object) {
        if ((object = this.entries.getEntry(object)) == null) {
            return Undefined.instance;
        }
        return ((Hashtable$Entry)object).value;
    }

    private Object js_getSize() {
        return this.entries.size();
    }

    private Object js_has(Object object) {
        return this.entries.has(object);
    }

    private Object js_iterator(Scriptable scriptable, NativeCollectionIterator$Type nativeCollectionIterator$Type) {
        return new NativeCollectionIterator(scriptable, ITERATOR_TAG, nativeCollectionIterator$Type, this.entries.iterator());
    }

    private Object js_set(Object object, Object object2) {
        Object object3 = object;
        if (object instanceof Number) {
            object3 = object;
            if (((Number)object).doubleValue() == ScriptRuntime.negativeZero) {
                object3 = ScriptRuntime.zeroObj;
            }
        }
        this.entries.put(object3, object2);
        return this;
    }

    static Object key(Object[] object) {
        if (((Object[])object).length > 0) {
            Object object2 = object[0];
            object = object2;
            if (object2 instanceof Delegator) {
                object = ((Delegator)object2).getDelegee();
            }
            return object;
        }
        return Undefined.instance;
    }

    static void loadFromIterable(Context context, Scriptable scriptable, ScriptableObject scriptableObject, Object object) {
        Object object2;
        if (object != null && !(object2 = Undefined.instance).equals(object)) {
            if (object2.equals(ScriptRuntime.callIterator(object, context, scriptable))) {
                return;
            }
            object2 = ScriptRuntime.getPropFunctionAndThis(ScriptableObject.getClassPrototype(scriptable, scriptableObject.getClassName()), "set", context, scriptable);
            ScriptRuntime.lastStoredScriptable(context);
            ScriptRuntime.loadFromIterable(context, scriptable, object, new k((Callable)object2, context, scriptable, scriptableObject));
        }
    }

    private static NativeMap realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        scriptable = IdScriptableObject.ensureType(scriptable, NativeMap.class, idFunctionObject);
        if (((NativeMap)scriptable).instanceOfMap) {
            return scriptable;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context object2, Scriptable object3, Scriptable object4, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(MAP_TAG)) {
            return super.execIdCall((IdFunctionObject)object, (Context)object2, (Scriptable)object3, (Scriptable)object4, objectArray);
        }
        switch (((IdFunctionObject)object).methodId()) {
            default: {
                object2 = a.c("Map.prototype has no method: ");
                ((StringBuilder)object2).append(((IdFunctionObject)object).getFunctionName());
                throw new IllegalArgumentException(((StringBuilder)object2).toString());
            }
            case 11: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_getSize();
            }
            case 10: {
                NativeMap nativeMap = NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object);
                object = objectArray.length > 0 ? objectArray[0] : Undefined.instance;
                object4 = objectArray.length > 1 ? objectArray[1] : Undefined.instance;
                return nativeMap.js_forEach((Context)object2, (Scriptable)object3, object, object4);
            }
            case 9: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_iterator((Scriptable)object3, NativeCollectionIterator$Type.BOTH);
            }
            case 8: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_iterator((Scriptable)object3, NativeCollectionIterator$Type.VALUES);
            }
            case 7: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_iterator((Scriptable)object3, NativeCollectionIterator$Type.KEYS);
            }
            case 6: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_clear();
            }
            case 5: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_has(NativeMap.key(objectArray));
            }
            case 4: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_delete(NativeMap.key(objectArray));
            }
            case 3: {
                return NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object).js_get(NativeMap.key(objectArray));
            }
            case 2: {
                object2 = NativeMap.realThis((Scriptable)object4, (IdFunctionObject)object);
                object3 = NativeMap.key(objectArray);
                object = objectArray.length > 1 ? objectArray[1] : Undefined.instance;
                return super.js_set(object3, object);
            }
            case 1: 
        }
        if (object4 == null) {
            object = new NativeMap();
            ((NativeMap)object).instanceOfMap = true;
            if (objectArray.length > 0) {
                NativeMap.loadFromIterable((Context)object2, (Scriptable)object3, (ScriptableObject)object, NativeMap.key(objectArray));
            }
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.no.new", "Map");
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 9;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 94746189: {
                if (!string.equals("clear")) break;
                n4 = 9;
                break;
            }
            case 3288564: {
                if (!string.equals("keys")) break;
                n4 = 8;
                break;
            }
            case 113762: {
                if (!string.equals("set")) break;
                n4 = 7;
                break;
            }
            case 103066: {
                if (!string.equals("has")) break;
                n4 = 6;
                break;
            }
            case 102230: {
                if (!string.equals("get")) break;
                n4 = 5;
                break;
            }
            case -678635926: {
                if (!string.equals("forEach")) break;
                n4 = 4;
                break;
            }
            case -823812830: {
                if (!string.equals("values")) break;
                n4 = 3;
                break;
            }
            case -1335458389: {
                if (!string.equals("delete")) break;
                n4 = 2;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 1;
                break;
            }
            case -1591573360: {
                if (!string.equals("entries")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 3;
                break;
            }
            case 4: {
                n3 = 10;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 1;
            }
            case 0: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (NativeSet.GETSIZE.equals(symbol)) {
            return 11;
        }
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 9;
        }
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 12;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "Map";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block12: {
            block13: {
                block15: {
                    block14: {
                        if (var1_1 == 11) break block12;
                        if (var1_1 == 12) break block13;
                        switch (var1_1) {
                            default: {
                                throw new IllegalArgumentException(String.valueOf(var1_1));
                            }
                            case 10: {
                                var3_2 = "forEach";
                                ** GOTO lbl29
                            }
                            case 9: {
                                var3_2 = "entries";
                                break block14;
                            }
                            case 8: {
                                var3_2 = "values";
                                break block14;
                            }
                            case 7: {
                                var3_2 = "keys";
                                break block14;
                            }
                            case 6: {
                                var3_2 = "clear";
                                break block14;
                            }
                            case 5: {
                                var3_2 = "has";
                                ** GOTO lbl29
                            }
                            case 4: {
                                var3_2 = "delete";
                                ** GOTO lbl29
                            }
                            case 3: {
                                var3_2 = "get";
lbl29:
                                // 4 sources

                                var2_3 = 1;
                                break block15;
                            }
                            case 2: {
                                var3_2 = "set";
                                var2_3 = 2;
                                break block15;
                            }
                            case 1: 
                        }
                        var3_2 = "constructor";
                    }
                    var2_3 = 0;
                }
                this.initPrototypeMethod(NativeMap.MAP_TAG, var1_1, var3_2, null, var2_3);
                return;
            }
            this.initPrototypeValue(12, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
            return;
        }
        this.initPrototypeMethod(NativeMap.MAP_TAG, var1_1, NativeSet.GETSIZE, "get size", 0);
    }
}

