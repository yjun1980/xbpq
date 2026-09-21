/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

public class NativeSymbol
extends IdScriptableObject
implements Symbol {
    public static final String CLASS_NAME = "Symbol";
    private static final Object CONSTRUCTOR_SLOT;
    private static final int ConstructorId_for = -1;
    private static final int ConstructorId_keyFor = -2;
    private static final Object GLOBAL_TABLE_KEY;
    private static final int Id_constructor = 1;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final int SymbolId_toPrimitive = 5;
    private static final int SymbolId_toStringTag = 3;
    public static final String TYPE_NAME = "symbol";
    private static final long serialVersionUID = -589539749749830003L;
    private final SymbolKey key;
    private final NativeSymbol symbolData;

    static {
        GLOBAL_TABLE_KEY = new Object();
        CONSTRUCTOR_SLOT = new Object();
    }

    private NativeSymbol(String string) {
        this.key = new SymbolKey(string);
        this.symbolData = null;
    }

    public NativeSymbol(NativeSymbol nativeSymbol) {
        this.key = nativeSymbol.key;
        this.symbolData = nativeSymbol.symbolData;
    }

    NativeSymbol(SymbolKey symbolKey) {
        this.key = symbolKey;
        this.symbolData = this;
    }

    public static NativeSymbol construct(Context context, Scriptable scriptable, Object[] objectArray) {
        Object object = CONSTRUCTOR_SLOT;
        context.putThreadLocal(object, Boolean.TRUE);
        try {
            scriptable = (NativeSymbol)context.newObject(scriptable, CLASS_NAME, objectArray);
            context.removeThreadLocal(object);
            return scriptable;
        }
        catch (Throwable throwable) {
            context.removeThreadLocal(CONSTRUCTOR_SLOT);
            throw throwable;
        }
    }

    private static void createStandardSymbol(Context context, Scriptable scriptable, ScriptableObject scriptableObject, String string, SymbolKey symbolKey) {
        scriptableObject.defineProperty(string, (Object)context.newObject(scriptable, CLASS_NAME, new Object[]{string, symbolKey}), 7);
    }

    private Map<String, NativeSymbol> getGlobalMap() {
        HashMap hashMap;
        ScriptableObject scriptableObject = (ScriptableObject)ScriptableObject.getTopLevelScope(this);
        Object object = GLOBAL_TABLE_KEY;
        HashMap hashMap2 = hashMap = (HashMap)scriptableObject.getAssociatedValue(object);
        if (hashMap == null) {
            hashMap2 = new HashMap();
            scriptableObject.associateValue(object, hashMap2);
        }
        return hashMap2;
    }

    private static NativeSymbol getSelf(Context object, Scriptable scriptable, Object object2) {
        try {
            object = (NativeSymbol)ScriptRuntime.toObject((Context)object, scriptable, object2);
            return object;
        }
        catch (ClassCastException classCastException) {
            throw ScriptRuntime.typeErrorById("msg.invalid.type", object2.getClass().getName());
        }
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        IdFunctionObject idFunctionObject = new NativeSymbol("").exportAsJSClass(5, scriptable, false);
        Object object = CONSTRUCTOR_SLOT;
        context.putThreadLocal(object, Boolean.TRUE);
        try {
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "iterator", SymbolKey.ITERATOR);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "species", SymbolKey.SPECIES);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "toStringTag", SymbolKey.TO_STRING_TAG);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "hasInstance", SymbolKey.HAS_INSTANCE);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "isConcatSpreadable", SymbolKey.IS_CONCAT_SPREADABLE);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "isRegExp", SymbolKey.IS_REGEXP);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "toPrimitive", SymbolKey.TO_PRIMITIVE);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "match", SymbolKey.MATCH);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "replace", SymbolKey.REPLACE);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "search", SymbolKey.SEARCH);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "split", SymbolKey.SPLIT);
            NativeSymbol.createStandardSymbol(context, scriptable, idFunctionObject, "unscopables", SymbolKey.UNSCOPABLES);
            context.removeThreadLocal(object);
            if (bl) {
                idFunctionObject.sealObject();
            }
            return;
        }
        catch (Throwable throwable) {
            context.removeThreadLocal(CONSTRUCTOR_SLOT);
            throw throwable;
        }
    }

    private static boolean isStrictMode() {
        Context context = Context.getCurrentContext();
        boolean bl = context != null && context.isStrictMode();
        return bl;
    }

    private static NativeSymbol js_constructor(Object[] objectArray) {
        String string;
        int n2 = objectArray.length;
        String string2 = string = "";
        if (n2 > 0) {
            string2 = Undefined.instance.equals(objectArray[0]) ? string : ScriptRuntime.toString(objectArray[0]);
        }
        if (objectArray.length > 1) {
            return new NativeSymbol((SymbolKey)objectArray[1]);
        }
        return new NativeSymbol(new SymbolKey(string2));
    }

    private Object js_for(Context context, Scriptable scriptable, Object[] object) {
        object = ((Object[])object).length > 0 ? object[0] : Undefined.instance;
        String string = ScriptRuntime.toString(object);
        Map<String, NativeSymbol> map = this.getGlobalMap();
        NativeSymbol nativeSymbol = map.get(string);
        object = nativeSymbol;
        if (nativeSymbol == null) {
            object = NativeSymbol.construct(context, scriptable, new Object[]{string});
            map.put(string, (NativeSymbol)object);
        }
        return object;
    }

    private Object js_keyFor(Context object, Scriptable object22, Object[] object3) {
        Object object2;
        if ((object2 = ((void)object2).length > 0 ? object2[0] : Undefined.instance) instanceof NativeSymbol) {
            object2 = (NativeSymbol)object2;
            for (Map.Entry<String, NativeSymbol> entry : this.getGlobalMap().entrySet()) {
                if (entry.getValue().key != ((NativeSymbol)object2).key) continue;
                return entry.getKey();
            }
            return Undefined.instance;
        }
        throw ScriptRuntime.throwCustomError((Context)((Object)object), (Scriptable)object22, "TypeError", "Not a Symbol");
    }

    private Object js_valueOf() {
        return this.symbolData;
    }

    public boolean equals(Object object) {
        return this.key.equals(object);
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(CLASS_NAME)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        if (n2 != -2) {
            if (n2 != -1) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 4 && n2 != 5) {
                            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
                        }
                        return NativeSymbol.getSelf(context, scriptable, scriptable2).js_valueOf();
                    }
                    return NativeSymbol.getSelf(context, scriptable, scriptable2).toString();
                }
                if (scriptable2 == null) {
                    if (context.getThreadLocal(CONSTRUCTOR_SLOT) != null) {
                        return NativeSymbol.js_constructor(objectArray);
                    }
                    throw ScriptRuntime.typeErrorById("msg.no.symbol.new", new Object[0]);
                }
                return NativeSymbol.construct(context, scriptable, objectArray);
            }
            return this.js_for(context, scriptable, objectArray);
        }
        return this.js_keyFor(context, scriptable, objectArray);
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        super.fillConstructorProperties(idFunctionObject);
        this.addIdFunctionProperty(idFunctionObject, CLASS_NAME, -1, "for", 1);
        this.addIdFunctionProperty(idFunctionObject, CLASS_NAME, -2, "keyFor", 1);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 2;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 2;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 1;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
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
        if (SymbolKey.TO_STRING_TAG.equals(symbol)) {
            return 3;
        }
        if (SymbolKey.TO_PRIMITIVE.equals(symbol)) {
            return 5;
        }
        return 0;
    }

    @Override
    public String getClassName() {
        return CLASS_NAME;
    }

    SymbolKey getKey() {
        return this.key;
    }

    @Override
    public String getTypeOf() {
        String string = this.isSymbol() ? TYPE_NAME : super.getTypeOf();
        return string;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    protected void initPrototypeId(int n2) {
        block6: {
            String string;
            block7: {
                block2: {
                    block3: {
                        block4: {
                            block5: {
                                if (n2 == 1) break block2;
                                if (n2 == 2) break block3;
                                if (n2 == 3) break block4;
                                if (n2 == 4) break block5;
                                if (n2 != 5) {
                                    super.initPrototypeId(n2);
                                } else {
                                    this.initPrototypeMethod((Object)CLASS_NAME, n2, SymbolKey.TO_PRIMITIVE, "Symbol.toPrimitive", 1);
                                }
                                break block6;
                            }
                            string = "valueOf";
                            break block7;
                        }
                        this.initPrototypeValue(n2, SymbolKey.TO_STRING_TAG, (Object)CLASS_NAME, 3);
                        break block6;
                    }
                    string = "toString";
                    break block7;
                }
                string = "constructor";
            }
            this.initPrototypeMethod(CLASS_NAME, n2, string, 0);
        }
    }

    public boolean isSymbol() {
        boolean bl = this.symbolData == this;
        return bl;
    }

    @Override
    public void put(int n2, Scriptable scriptable, Object object) {
        block4: {
            block3: {
                block2: {
                    if (this.isSymbol()) break block2;
                    super.put(n2, scriptable, object);
                    break block3;
                }
                if (NativeSymbol.isStrictMode()) break block4;
            }
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
    }

    @Override
    public void put(String string, Scriptable scriptable, Object object) {
        block4: {
            block3: {
                block2: {
                    if (this.isSymbol()) break block2;
                    super.put(string, scriptable, object);
                    break block3;
                }
                if (NativeSymbol.isStrictMode()) break block4;
            }
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
    }

    @Override
    public void put(Symbol symbol, Scriptable scriptable, Object object) {
        block4: {
            block3: {
                block2: {
                    if (this.isSymbol()) break block2;
                    super.put(symbol, scriptable, object);
                    break block3;
                }
                if (NativeSymbol.isStrictMode()) break block4;
            }
            return;
        }
        throw ScriptRuntime.typeErrorById("msg.no.assign.symbol.strict", new Object[0]);
    }

    public String toString() {
        return this.key.toString();
    }
}

