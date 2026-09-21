/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import java.util.Iterator;
import java.util.Objects;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Hashtable;
import org.mozilla.javascript.Hashtable$Entry;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.IteratorLikeIterable;
import org.mozilla.javascript.NativeCollectionIterator;
import org.mozilla.javascript.NativeCollectionIterator$Type;
import org.mozilla.javascript.NativeMap;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public class NativeSet
extends IdScriptableObject {
    static final SymbolKey GETSIZE;
    static final String ITERATOR_TAG = "Set Iterator";
    private static final int Id_add = 2;
    private static final int Id_clear = 5;
    private static final int Id_constructor = 1;
    private static final int Id_delete = 3;
    private static final int Id_entries = 7;
    private static final int Id_forEach = 8;
    private static final int Id_has = 4;
    private static final int Id_keys = 6;
    private static final int Id_values = 6;
    private static final int MAX_PROTOTYPE_ID = 10;
    private static final Object SET_TAG;
    private static final int SymbolId_getSize = 9;
    private static final int SymbolId_toStringTag = 10;
    private static final long serialVersionUID = -8442212766987072986L;
    private final Hashtable entries = new Hashtable();
    private boolean instanceOfSet = false;

    static {
        SET_TAG = "Set";
        GETSIZE = new SymbolKey("[Symbol.getSize]");
    }

    static void init(Context context, Scriptable scriptable, boolean bl) {
        NativeSet nativeSet = new NativeSet();
        IdFunctionObject idFunctionObject = nativeSet.exportAsJSClass(10, scriptable, false);
        ScriptableObject scriptableObject = (ScriptableObject)context.newObject(scriptable);
        scriptableObject.put("enumerable", (Scriptable)scriptableObject, (Object)Boolean.FALSE);
        scriptableObject.put("configurable", (Scriptable)scriptableObject, (Object)Boolean.TRUE);
        scriptableObject.put("get", (Scriptable)scriptableObject, nativeSet.get(GETSIZE, (Scriptable)nativeSet));
        nativeSet.defineOwnProperty(context, "size", scriptableObject);
        ScriptRuntimeES6.addSymbolSpecies(context, scriptable, idFunctionObject);
        if (bl) {
            nativeSet.sealObject();
        }
    }

    private Object js_add(Object object) {
        Object object2 = object;
        if (object instanceof Number) {
            object2 = object;
            if (((Number)object).doubleValue() == ScriptRuntime.negativeZero) {
                object2 = ScriptRuntime.zeroObj;
            }
        }
        this.entries.put(object2, object2);
        return this;
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
                object = hashtable$Entry.value;
                callable.call(context, scriptable, (Scriptable)object3, new Object[]{object, object, this});
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.notFunctionError(object);
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

    static void loadFromIterable(Context context, Scriptable scriptable, ScriptableObject scriptableObject, Object object) {
        Object object2;
        if (object != null && !(object2 = Undefined.instance).equals(object)) {
            if (object2.equals(object = ScriptRuntime.callIterator(object, context, scriptable))) {
                return;
            }
            Callable callable = ScriptRuntime.getPropFunctionAndThis(ScriptableObject.ensureScriptableObject(context.newObject(scriptable, scriptableObject.getClassName())).getPrototype(), "add", context, scriptable);
            ScriptRuntime.lastStoredScriptable(context);
            IteratorLikeIterable iteratorLikeIterable = new IteratorLikeIterable(context, scriptable, object);
            try {
                Iterator iterator = iteratorLikeIterable.iterator();
                while (iterator.hasNext()) {
                    object = object2 = iterator.next();
                }
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        iteratorLikeIterable.close();
                    }
                    catch (Throwable throwable3) {
                        throwable.addSuppressed(throwable3);
                    }
                    throw throwable2;
                }
            }
            {
                if (object2 == Scriptable.NOT_FOUND) {
                    object = Undefined.instance;
                }
                callable.call(context, scriptable, scriptableObject, new Object[]{object});
                continue;
            }
            iteratorLikeIterable.close();
            return;
        }
    }

    private static NativeSet realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        scriptable = IdScriptableObject.ensureType(scriptable, NativeSet.class, idFunctionObject);
        if (((NativeSet)scriptable).instanceOfSet) {
            return scriptable;
        }
        throw ScriptRuntime.typeErrorById("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    @Override
    public Object execIdCall(IdFunctionObject object, Context object2, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!((IdFunctionObject)object).hasTag(SET_TAG)) {
            return super.execIdCall((IdFunctionObject)object, (Context)object2, scriptable, scriptable2, objectArray);
        }
        switch (((IdFunctionObject)object).methodId()) {
            default: {
                object2 = a.c("Set.prototype has no method: ");
                ((StringBuilder)object2).append(((IdFunctionObject)object).getFunctionName());
                throw new IllegalArgumentException(((StringBuilder)object2).toString());
            }
            case 9: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_getSize();
            }
            case 8: {
                scriptable2 = NativeSet.realThis(scriptable2, (IdFunctionObject)object);
                Object object3 = NativeMap.key(objectArray);
                object = objectArray.length > 1 ? objectArray[1] : Undefined.instance;
                return super.js_forEach((Context)object2, scriptable, object3, object);
            }
            case 7: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_iterator(scriptable, NativeCollectionIterator$Type.BOTH);
            }
            case 6: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_iterator(scriptable, NativeCollectionIterator$Type.VALUES);
            }
            case 5: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_clear();
            }
            case 4: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_has(NativeMap.key(objectArray));
            }
            case 3: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_delete(NativeMap.key(objectArray));
            }
            case 2: {
                return NativeSet.realThis(scriptable2, (IdFunctionObject)object).js_add(NativeMap.key(objectArray));
            }
            case 1: 
        }
        if (scriptable2 == null) {
            object = new NativeSet();
            ((NativeSet)object).instanceOfSet = true;
            if (objectArray.length > 0) {
                NativeSet.loadFromIterable((Context)object2, scriptable, (ScriptableObject)object, NativeMap.key(objectArray));
            }
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.no.new", "Set");
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 8;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 94746189: {
                if (!string.equals("clear")) break;
                n4 = 8;
                break;
            }
            case 3288564: {
                if (!string.equals("keys")) break;
                n4 = 7;
                break;
            }
            case 103066: {
                if (!string.equals("has")) break;
                n4 = 6;
                break;
            }
            case 96417: {
                if (!string.equals("add")) break;
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
            case 8: {
                n3 = 5;
                break;
            }
            case 3: 
            case 7: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 4;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 0: {
                n3 = 7;
            }
            case 4: 
        }
        return n3;
    }

    @Override
    protected int findPrototypeId(Symbol symbol) {
        if (GETSIZE.equals(symbol)) {
            return 9;
        }
        if (SymbolKey.ITERATOR.equals(symbol)) {
            return 6;
        }
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 10;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return "Set";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block10: {
            block11: {
                block13: {
                    block12: {
                        if (var1_1 == 9) break block10;
                        if (var1_1 == 10) break block11;
                        switch (var1_1) {
                            default: {
                                throw new IllegalArgumentException(String.valueOf(var1_1));
                            }
                            case 8: {
                                var3_2 = "forEach";
                                ** GOTO lbl26
                            }
                            case 7: {
                                var3_2 = "entries";
                                break block12;
                            }
                            case 6: {
                                var3_2 = "values";
                                break block12;
                            }
                            case 5: {
                                var3_2 = "clear";
                                break block12;
                            }
                            case 4: {
                                var3_2 = "has";
                                ** GOTO lbl26
                            }
                            case 3: {
                                var3_2 = "delete";
                                ** GOTO lbl26
                            }
                            case 2: {
                                var3_2 = "add";
lbl26:
                                // 4 sources

                                var2_3 = 1;
                                break block13;
                            }
                            case 1: 
                        }
                        var3_2 = "constructor";
                    }
                    var2_3 = 0;
                }
                this.initPrototypeMethod(NativeSet.SET_TAG, var1_1, var3_2, null, var2_3);
                return;
            }
            this.initPrototypeValue(10, SymbolKey.TO_STRING_TAG, (Object)this.getClassName(), 3);
            return;
        }
        this.initPrototypeMethod(NativeSet.SET_TAG, var1_1, NativeSet.GETSIZE, "get size", 0);
    }
}

