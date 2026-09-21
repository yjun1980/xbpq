/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import com.github.catvod.spider.merge.I.r;
import com.github.catvod.spider.merge.h1.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.AbstractEcmaObjectOperations$INTEGRITY_LEVEL;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeObject$EntrySet;
import org.mozilla.javascript.NativeObject$KeySet;
import org.mozilla.javascript.NativeObject$ValueCollection;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolScriptable;
import org.mozilla.javascript.Undefined;

public class NativeObject
extends IdScriptableObject
implements Map {
    private static final int ConstructorId_assign = -16;
    private static final int ConstructorId_create = -10;
    private static final int ConstructorId_defineProperties = -9;
    private static final int ConstructorId_defineProperty = -6;
    private static final int ConstructorId_entries = -19;
    private static final int ConstructorId_freeze = -14;
    private static final int ConstructorId_fromEntries = -20;
    private static final int ConstructorId_getOwnPropertyDescriptor = -4;
    private static final int ConstructorId_getOwnPropertyDescriptors = -5;
    private static final int ConstructorId_getOwnPropertyNames = -3;
    private static final int ConstructorId_getOwnPropertySymbols = -15;
    private static final int ConstructorId_getPrototypeOf = -1;
    private static final int ConstructorId_hasOwn = -22;
    private static final int ConstructorId_is = -17;
    private static final int ConstructorId_isExtensible = -7;
    private static final int ConstructorId_isFrozen = -12;
    private static final int ConstructorId_isSealed = -11;
    private static final int ConstructorId_keys = -2;
    private static final int ConstructorId_preventExtensions = -8;
    private static final int ConstructorId_seal = -13;
    private static final int ConstructorId_setPrototypeOf = -18;
    private static final int ConstructorId_values = -21;
    private static final int Id___defineGetter__ = 9;
    private static final int Id___defineSetter__ = 10;
    private static final int Id___lookupGetter__ = 11;
    private static final int Id___lookupSetter__ = 12;
    private static final int Id_constructor = 1;
    private static final int Id_hasOwnProperty = 5;
    private static final int Id_isPrototypeOf = 7;
    private static final int Id_propertyIsEnumerable = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 8;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 12;
    private static final Object OBJECT_TAG = "Object";
    private static final long serialVersionUID = -6345305608474346996L;

    public static /* synthetic */ void a(Scriptable scriptable, Object object, Object object2) {
        NativeObject.lambda$execIdCall$0(scriptable, object, object2);
    }

    private static Scriptable getCompatibleObject(Context context, Scriptable scriptable, Object object) {
        if (context.getLanguageVersion() >= 200) {
            return ScriptableObject.ensureScriptable(ScriptRuntime.toObject(context, scriptable, object));
        }
        return ScriptableObject.ensureScriptable(object);
    }

    static void init(Scriptable scriptable, boolean bl) {
        new NativeObject().exportAsJSClass(12, scriptable, bl);
    }

    private boolean isEnumerable(int n2, Object object) {
        boolean bl;
        boolean bl2 = object instanceof ScriptableObject;
        boolean bl3 = bl = true;
        if (bl2) {
            bl3 = (((ScriptableObject)object).getAttributes(n2) & 2) == 0 ? bl : false;
        }
        return bl3;
    }

    private boolean isEnumerable(String string, Object object) {
        boolean bl;
        boolean bl2 = object instanceof ScriptableObject;
        boolean bl3 = bl = true;
        if (bl2) {
            bl3 = (((ScriptableObject)object).getAttributes(string) & 2) == 0 ? bl : false;
        }
        return bl3;
    }

    private boolean isEnumerable(Symbol symbol, Object object) {
        boolean bl;
        boolean bl2 = object instanceof ScriptableObject;
        boolean bl3 = bl = true;
        if (bl2) {
            bl3 = (((ScriptableObject)object).getAttributes(symbol) & 2) == 0 ? bl : false;
        }
        return bl3;
    }

    private static /* synthetic */ void lambda$execIdCall$0(Scriptable scriptable, Object object, Object object2) {
        if (object instanceof Integer) {
            scriptable.put((Integer)object, scriptable, object2);
        } else if (object instanceof Symbol && scriptable instanceof SymbolScriptable) {
            ((SymbolScriptable)((Object)scriptable)).put((Symbol)object, scriptable, object2);
        } else {
            scriptable.put(ScriptRuntime.toString(object), scriptable, object2);
        }
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsKey(Object object) {
        if (object instanceof String) {
            return this.has((String)object, (Scriptable)this);
        }
        if (object instanceof Number) {
            return this.has(((Number)object).intValue(), (Scriptable)this);
        }
        return false;
    }

    @Override
    public boolean containsValue(Object object) {
        for (Object object2 : this.values()) {
            if (object != object2 && (object == null || !object.equals(object2))) continue;
            return true;
        }
        return false;
    }

    public Set<Map.Entry<Object, Object>> entrySet() {
        return new NativeObject$EntrySet(this);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public Object execIdCall(IdFunctionObject var1_1, Context var2_2, Scriptable var3_3, Scriptable var4_4, Object[] var5_6) {
        if (!var1_1.hasTag(NativeObject.OBJECT_TAG)) {
            return super.execIdCall((IdFunctionObject)var1_1, (Context)var2_2, (Scriptable)var3_3 /* !! */ , (Scriptable)var4_4, var5_6 /* !! */ );
        }
        var11_7 = var1_1.methodId();
        var18_8 = null;
        var17_9 = null;
        var16_10 = "undef";
        var19_11 = "null";
        var14_12 = false;
        var13_13 = false;
        var9_14 = 0;
        var10_15 = 0;
        var8_17 = 0;
        var12_19 = false;
        var15_20 = true;
        switch (var11_7) {
            default: {
                throw new IllegalArgumentException(String.valueOf(var11_7));
            }
            case 11: 
            case 12: {
                if (var5_6 /* !! */ .length >= 1 && var4_4 instanceof ScriptableObject) {
                    var2_2 = (ScriptableObject)var4_4;
                    var3_3 /* !! */  = ScriptRuntime.toStringIdOrIndex(var5_6 /* !! */ [0]);
                    var6_16 = var3_3 /* !! */ .stringId != null ? 0 : var3_3 /* !! */ .index;
                    var1_1 = var2_2;
                    if (var11_7 == 12) {
                        var12_19 = true;
                        var1_1 = var2_2;
                    }
                    while ((var2_2 = var1_1.getGetterOrSetter(var3_3 /* !! */ .stringId, var6_16, this, var12_19)) == null && (var1_1 = var1_1.getPrototype()) != null && var1_1 instanceof ScriptableObject) {
                        var1_1 = (ScriptableObject)var1_1;
                    }
                    if (var2_2 != null) {
                        return var2_2;
                    }
                    return Undefined.instance;
                }
                return Undefined.instance;
            }
            case 9: 
            case 10: {
                if (var5_6 /* !! */ .length >= 2 && var5_6 /* !! */ [1] instanceof Callable) {
                    if (!(var4_4 instanceof ScriptableObject)) {
                        var1_1 = var4_4 == null ? var19_11 : var4_4.getClass().getName();
                        throw Context.reportRuntimeErrorById("msg.extend.scriptable", new Object[]{var1_1, String.valueOf(var5_6 /* !! */ [0])});
                    }
                    var1_1 = (ScriptableObject)var4_4;
                    var3_3 /* !! */  = ScriptRuntime.toStringIdOrIndex(var5_6 /* !! */ [0]);
                    var2_2 = var3_3 /* !! */ .stringId;
                    var6_16 = var2_2 != null ? 0 : var3_3 /* !! */ .index;
                    var3_3 /* !! */  = (Callable)var5_6 /* !! */ [1];
                    var12_19 = var11_7 == 10 ? var15_20 : false;
                    var1_1.setGetterOrSetter((String)var2_2, var6_16, (Callable)var3_3 /* !! */ , var12_19);
                    if (var1_1 instanceof NativeArray) {
                        ((NativeArray)var1_1).setDenseOnly(false);
                    }
                    return Undefined.instance;
                }
                var1_1 = var5_6 /* !! */ .length >= 2 ? var5_6 /* !! */ [1] : Undefined.instance;
                throw ScriptRuntime.notFunctionError(var1_1);
            }
            case 8: {
                return ScriptRuntime.defaultObjectToSource((Context)var2_2, (Scriptable)var3_3 /* !! */ , (Scriptable)var4_4, var5_6 /* !! */ );
            }
            case 7: {
                if (var2_2.getLanguageVersion() >= 180 && (var4_4 == null || Undefined.isUndefined(var4_4))) {
                    var1_1 = a.c("msg.");
                    if (var4_4 == null) {
                        var16_10 = "null";
                    }
                    throw ScriptRuntime.typeErrorById(r.c((StringBuilder)var1_1, (String)var16_10, ".to.object"), new Object[0]);
                }
                var12_19 = var14_12;
                if (var5_6 /* !! */ .length == 0) ** GOTO lbl71
                var12_19 = var14_12;
                if (!(var5_6 /* !! */ [0] instanceof Scriptable)) ** GOTO lbl71
                var1_1 = (Scriptable)var5_6 /* !! */ [0];
                do {
                    if ((var2_2 = var1_1.getPrototype()) != var4_4) ** GOTO lbl68
                    var12_19 = true;
                    ** GOTO lbl71
lbl68:
                    // 1 sources

                    var1_1 = var2_2;
                } while (var2_2 != null);
                var12_19 = var14_12;
lbl71:
                // 4 sources

                return ScriptRuntime.wrapBoolean(var12_19);
            }
            case 6: {
                if (var2_2.getLanguageVersion() >= 180 && (var4_4 == null || Undefined.isUndefined(var4_4))) {
                    var1_1 = a.c("msg.");
                    if (var4_4 == null) {
                        var16_10 = "null";
                    }
                    throw ScriptRuntime.typeErrorById(r.c((StringBuilder)var1_1, (String)var16_10, ".to.object"), new Object[0]);
                }
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (!(var1_1 instanceof Symbol)) ** GOTO lbl87
                var2_2 = (SymbolScriptable)var4_4;
                var1_1 = (Symbol)var1_1;
                var12_19 = var13_13;
                if (!var2_2.has((Symbol)var1_1, (Scriptable)var4_4)) ** GOTO lbl113
                var12_19 = var13_13;
                if (!this.isEnumerable((Symbol)var1_1, var4_4)) ** GOTO lbl113
                ** GOTO lbl104
lbl87:
                // 1 sources

                var3_3 /* !! */  = ScriptRuntime.toStringIdOrIndex(var1_1);
                var1_1 = var3_3 /* !! */ .stringId;
                if (var1_1 != null) ** GOTO lbl98
                var12_19 = var13_13;
                if (!var4_4.has(var3_3 /* !! */ .index, (Scriptable)var4_4)) ** GOTO lbl113
                var12_19 = var13_13;
                if (!this.isEnumerable(var3_3 /* !! */ .index, var4_4)) ** GOTO lbl113
                ** GOTO lbl104
lbl98:
                // 1 sources

                var12_19 = var13_13;
                try {
                    if (!var4_4.has((String)var1_1, (Scriptable)var4_4)) ** GOTO lbl113
                    var14_12 = this.isEnumerable(var3_3 /* !! */ .stringId, var4_4);
                    var12_19 = var13_13;
                    if (!var14_12) ** GOTO lbl113
                }
                catch (EvaluatorException var4_5) {
                    var5_6 /* !! */  = var4_5.getMessage();
                    var1_1 = var2_2 = var3_3 /* !! */ .stringId;
                    if (var2_2 == null) {
                        var1_1 = Integer.toString(var3_3 /* !! */ .index);
                    }
                    if (!var5_6 /* !! */ .startsWith(ScriptRuntime.getMessageById("msg.prop.not.found", new Object[]{var1_1}))) ** GOTO lbl114
                    var12_19 = var13_13;
                }
lbl104:
                // 3 sources

                var12_19 = true;
                {
                }
lbl113:
                // 8 sources

                return ScriptRuntime.wrapBoolean(var12_19);
lbl114:
                // 1 sources

                throw var4_5;
            }
            case 5: {
                if (var2_2.getLanguageVersion() >= 180 && (var4_4 == null || Undefined.isUndefined(var4_4))) {
                    var1_1 = a.c("msg.");
                    if (var4_4 == null) {
                        var16_10 = "null";
                    }
                    throw ScriptRuntime.typeErrorById(r.c((StringBuilder)var1_1, (String)var16_10, ".to.object"), new Object[0]);
                }
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                return AbstractEcmaObjectOperations.hasOwnProperty((Context)var2_2, var4_4, var1_1);
            }
            case 4: {
                if (var2_2.getLanguageVersion() >= 180 && (var4_4 == null || Undefined.isUndefined(var4_4))) {
                    var1_1 = a.c("msg.");
                    if (var4_4 == null) {
                        var16_10 = "null";
                    }
                    throw ScriptRuntime.typeErrorById(r.c((StringBuilder)var1_1, (String)var16_10, ".to.object"), new Object[0]);
                }
                return var4_4;
            }
            case 3: {
                if (var4_4 != null) {
                    var1_1 = ScriptableObject.getProperty((Scriptable)var4_4, "toString");
                    if (var1_1 instanceof Callable) {
                        return ((Callable)var1_1).call((Context)var2_2, (Scriptable)var3_3 /* !! */ , (Scriptable)var4_4, ScriptRuntime.emptyArgs);
                    }
                    throw ScriptRuntime.notFunctionError(var1_1);
                }
                throw ScriptRuntime.notFunctionError(null);
            }
            case 2: {
                if (var2_2.hasFeature(4)) {
                    var2_2 = ScriptRuntime.defaultObjectToSource((Context)var2_2, (Scriptable)var3_3 /* !! */ , (Scriptable)var4_4, var5_6 /* !! */ );
                    var6_16 = var2_2.length();
                    var1_1 = var2_2;
                    if (var6_16 != 0) {
                        var1_1 = var2_2;
                        if (var2_2.charAt(0) == '(') {
                            var1_1 = var2_2;
                            if (var2_2.charAt(--var6_16) == ')') {
                                var1_1 = var2_2.substring(1, var6_16);
                            }
                        }
                    }
                    return var1_1;
                }
                return ScriptRuntime.defaultObjectToString((Scriptable)var4_4);
            }
            case 1: {
                if (var4_4 != null) {
                    return var1_1.construct((Context)var2_2, (Scriptable)var3_3 /* !! */ , var5_6 /* !! */ );
                }
                if (var5_6 /* !! */ .length != 0 && var5_6 /* !! */ [0] != null && !Undefined.isUndefined(var5_6 /* !! */ [0])) {
                    return ScriptRuntime.toObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var5_6 /* !! */ [0]);
                }
                return var2_2.newObject((Scriptable)var3_3 /* !! */ );
            }
            case -1: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                return NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1).getPrototype();
            }
            case -2: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1).getIds();
                for (var6_16 = var9_14; var6_16 < ((Object[])var1_1).length; ++var6_16) {
                    var1_1[var6_16] = ScriptRuntime.toString(var1_1[var6_16]);
                }
                return var2_2.newArray((Scriptable)var3_3 /* !! */ , (Object[])var1_1);
            }
            case -3: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = ScriptableObject.ensureScriptableObject(NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1)).getIds(true, false);
                for (var6_16 = var10_15; var6_16 < ((Object[])var1_1).length; ++var6_16) {
                    var1_1[var6_16] = ScriptRuntime.toString(var1_1[var6_16]);
                }
                return var2_2.newArray((Scriptable)var3_3 /* !! */ , (Object[])var1_1);
            }
            case -4: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var3_3 /* !! */  = ScriptableObject.ensureScriptableObject(NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1));
                var1_1 = var5_6 /* !! */ .length < 2 ? Undefined.instance : var5_6 /* !! */ [1];
                var1_1 = var2_2 = var3_3 /* !! */ .getOwnPropertyDescriptor((Context)var2_2, var1_1);
                if (var2_2 == null) {
                    var1_1 = Undefined.instance;
                }
                return var1_1;
            }
            case -5: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = ScriptableObject.ensureScriptableObject(NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1));
                var16_10 = (ScriptableObject)var2_2.newObject((Scriptable)var3_3 /* !! */ );
                for (Object var4_4 : var1_1.getIds(true, true)) {
                    var5_6 /* !! */  = var1_1.getOwnPropertyDescriptor((Context)var2_2, var4_4);
                    if (var5_6 /* !! */  == null) continue;
                    if (var4_4 instanceof Symbol) {
                        var16_10.put((Symbol)var4_4, (Scriptable)var16_10, (Object)var5_6 /* !! */ );
                        continue;
                    }
                    if (var4_4 instanceof Integer) {
                        var16_10.put((Integer)var4_4, (Scriptable)var16_10, (Object)var5_6 /* !! */ );
                        continue;
                    }
                    var16_10.put(ScriptRuntime.toString(var4_4), (Scriptable)var16_10, (Object)var5_6 /* !! */ );
                }
                return var16_10;
            }
            case -6: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var4_4 = ScriptableObject.ensureScriptableObject(var1_1);
                var1_1 = var5_6 /* !! */ .length < 2 ? Undefined.instance : var5_6 /* !! */ [1];
                var3_3 /* !! */  = var5_6 /* !! */ .length < 3 ? Undefined.instance : var5_6 /* !! */ [2];
                var4_4.defineOwnProperty((Context)var2_2, var1_1, ScriptableObject.ensureScriptableObject(var3_3 /* !! */ ));
                return var4_4;
            }
            case -7: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return Boolean.FALSE;
                }
                return ScriptableObject.ensureScriptableObject(var1_1).isExtensible();
            }
            case -8: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return var1_1;
                }
                var1_1 = ScriptableObject.ensureScriptableObject(var1_1);
                var1_1.preventExtensions();
                return var1_1;
            }
            case -9: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var4_4 = ScriptableObject.ensureScriptableObject(var1_1);
                var1_1 = var5_6 /* !! */ .length < 2 ? Undefined.instance : var5_6 /* !! */ [1];
                var4_4.defineOwnProperties((Context)var2_2, ScriptableObject.ensureScriptableObject(Context.toObject(var1_1, (Scriptable)var3_3 /* !! */ )));
                return var4_4;
            }
            case -10: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = var1_1 == null ? var17_9 : ScriptableObject.ensureScriptable(var1_1);
                var4_4 = new NativeObject();
                var4_4.setParentScope((Scriptable)var3_3 /* !! */ );
                var4_4.setPrototype((Scriptable)var1_1);
                if (var5_6 /* !! */ .length > 1 && !Undefined.isUndefined(var5_6 /* !! */ [1])) {
                    var4_4.defineOwnProperties((Context)var2_2, ScriptableObject.ensureScriptableObject(Context.toObject(var5_6 /* !! */ [1], (Scriptable)var3_3 /* !! */ )));
                }
                return var4_4;
            }
            case -11: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return Boolean.TRUE;
                }
                return AbstractEcmaObjectOperations.testIntegrityLevel((Context)var2_2, var1_1, AbstractEcmaObjectOperations$INTEGRITY_LEVEL.SEALED);
            }
            case -12: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return Boolean.TRUE;
                }
                return AbstractEcmaObjectOperations.testIntegrityLevel((Context)var2_2, var1_1, AbstractEcmaObjectOperations$INTEGRITY_LEVEL.FROZEN);
            }
            case -13: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return var1_1;
                }
                AbstractEcmaObjectOperations.setIntegrityLevel((Context)var2_2, var1_1, AbstractEcmaObjectOperations$INTEGRITY_LEVEL.SEALED);
                return var1_1;
            }
            case -14: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                if (var2_2.getLanguageVersion() >= 200 && !(var1_1 instanceof ScriptableObject)) {
                    return var1_1;
                }
                AbstractEcmaObjectOperations.setIntegrityLevel((Context)var2_2, var1_1, AbstractEcmaObjectOperations$INTEGRITY_LEVEL.FROZEN);
                return var1_1;
            }
            case -15: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = ScriptableObject.ensureScriptableObject(NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1)).getIds(true, true);
                var4_4 = new ArrayList<E>();
                var7_18 = ((Object[])var1_1).length;
                for (var6_16 = var8_17; var6_16 < var7_18; ++var6_16) {
                    var5_6 /* !! */  = var1_1[var6_16];
                    if (!(var5_6 /* !! */  instanceof Symbol)) continue;
                    var4_4.add(var5_6 /* !! */ );
                }
                return var2_2.newArray((Scriptable)var3_3 /* !! */ , var4_4.toArray());
            }
            case -16: {
                var1_1 = var5_6 /* !! */ .length > 0 ? var5_6 /* !! */ [0] : Undefined.instance;
                var16_10 = ScriptRuntime.toObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1);
                for (var6_16 = 1; var6_16 < var5_6 /* !! */ .length; ++var6_16) {
                    if (var5_6 /* !! */ [var6_16] == null || Undefined.isUndefined(var5_6 /* !! */ [var6_16])) continue;
                    var1_1 = ScriptRuntime.toObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var5_6 /* !! */ [var6_16]);
                    for (Object var17_9 : var1_1.getIds()) {
                        if (var17_9 instanceof Integer) {
                            var9_14 = (Integer)var17_9;
                            if (!var1_1.has(var9_14, (Scriptable)var1_1) || !this.isEnumerable(var9_14, var1_1)) continue;
                            AbstractEcmaObjectOperations.put((Context)var2_2, (Scriptable)var16_10, var9_14, var1_1.get(var9_14, (Scriptable)var1_1), true);
                            continue;
                        }
                        if (!var1_1.has((String)(var17_9 = ScriptRuntime.toString(var17_9)), (Scriptable)var1_1) || !this.isEnumerable((String)var17_9, var1_1)) continue;
                        AbstractEcmaObjectOperations.put((Context)var2_2, (Scriptable)var16_10, (String)var17_9, var1_1.get((String)var17_9, (Scriptable)var1_1), true);
                    }
                }
                return var16_10;
            }
            case -17: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var2_2 = var5_6 /* !! */ .length < 2 ? Undefined.instance : var5_6 /* !! */ [1];
                return ScriptRuntime.wrapBoolean(ScriptRuntime.same(var1_1, var2_2));
            }
            case -18: {
                if (var5_6 /* !! */ .length >= 2) {
                    var3_3 /* !! */  = var5_6 /* !! */ [1] == null ? var18_8 : ScriptableObject.ensureScriptable(var5_6 /* !! */ [1]);
                    if (!(var3_3 /* !! */  instanceof Symbol)) {
                        var4_4 = var5_6 /* !! */ [0];
                        if (var2_2.getLanguageVersion() >= 200) {
                            ScriptRuntimeES6.requireObjectCoercible((Context)var2_2, var4_4, (IdFunctionObject)var1_1);
                        }
                        if (!(var4_4 instanceof ScriptableObject)) {
                            return var4_4;
                        }
                        var2_2 = (ScriptableObject)var4_4;
                        if (var2_2.isExtensible()) {
                            for (var1_1 = var3_3 /* !! */ ; var1_1 != null; var1_1 = var1_1.getPrototype()) {
                                if (var1_1 != var2_2) {
                                    continue;
                                }
                                throw ScriptRuntime.typeErrorById("msg.object.cyclic.prototype", new Object[]{var2_2.getClass().getSimpleName()});
                            }
                            var2_2.setPrototype((Scriptable)var3_3 /* !! */ );
                            return var2_2;
                        }
                        throw ScriptRuntime.typeErrorById("msg.not.extensible", new Object[0]);
                    }
                    throw ScriptRuntime.typeErrorById("msg.arg.not.object", new Object[]{ScriptRuntime.typeof(var3_3 /* !! */ )});
                }
                throw ScriptRuntime.typeErrorById("msg.method.missing.parameter", new Object[]{"Object.setPrototypeOf", "2", Integer.toString(var5_6 /* !! */ .length)});
            }
            case -19: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1);
                var4_4 = var1_1.getIds();
                var6_16 = 0;
                for (var7_18 = 0; var7_18 < ((Object[])var4_4).length; ++var7_18) {
                    if (!(var4_4[var7_18] instanceof Integer)) ** GOTO lbl327
                    var9_14 = (Integer)var4_4[var7_18];
                    var8_17 = var6_16;
                    if (!var1_1.has(var9_14, (Scriptable)var1_1)) ** GOTO lbl337
                    var8_17 = var6_16;
                    if (!this.isEnumerable(var9_14, var1_1)) ** GOTO lbl337
                    var16_10 = ScriptRuntime.toString(var4_4[var7_18]);
                    var5_6 /* !! */  = var1_1.get(var9_14, (Scriptable)var1_1);
                    var8_17 = var6_16 + 1;
                    var4_4[var6_16] = var2_2.newArray((Scriptable)var3_3 /* !! */ , new Object[]{var16_10, var5_6 /* !! */ });
                    var6_16 = var8_17;
                    ** GOTO lbl336
lbl327:
                    // 1 sources

                    var5_6 /* !! */  = ScriptRuntime.toString(var4_4[var7_18]);
                    var8_17 = var6_16;
                    if (!var1_1.has((String)var5_6 /* !! */ , (Scriptable)var1_1)) ** GOTO lbl337
                    var8_17 = var6_16;
                    if (!this.isEnumerable((String)var5_6 /* !! */ , var1_1)) ** GOTO lbl337
                    var16_10 = var1_1.get((String)var5_6 /* !! */ , (Scriptable)var1_1);
                    var8_17 = var6_16 + 1;
                    var4_4[var6_16] = var2_2.newArray((Scriptable)var3_3 /* !! */ , new Object[]{var5_6 /* !! */ , var16_10});
                    var6_16 = var8_17;
lbl336:
                    // 2 sources

                    var8_17 = var6_16;
lbl337:
                    // 5 sources

                    var6_16 = var8_17;
                }
                var1_1 = var4_4;
                if (var6_16 != ((Object[])var4_4).length) {
                    var1_1 = Arrays.copyOf(var4_4, var6_16);
                }
                return var2_2.newArray((Scriptable)var3_3 /* !! */ , (Object[])var1_1);
            }
            case -20: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1);
                var4_4 = var2_2.newObject((Scriptable)var3_3 /* !! */ );
                ScriptRuntime.loadFromIterable((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1, new l((Scriptable)var4_4));
                return var4_4;
            }
            case -21: {
                var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
                var1_1 = NativeObject.getCompatibleObject((Context)var2_2, (Scriptable)var3_3 /* !! */ , var1_1);
                var4_4 = var1_1.getIds();
                var6_16 = 0;
                for (var7_18 = 0; var7_18 < ((Object[])var4_4).length; ++var7_18) {
                    if (!(var4_4[var7_18] instanceof Integer)) ** GOTO lbl366
                    var9_14 = (Integer)var4_4[var7_18];
                    var8_17 = var6_16;
                    if (!var1_1.has(var9_14, (Scriptable)var1_1)) ** GOTO lbl375
                    var8_17 = var6_16;
                    if (!this.isEnumerable(var9_14, var1_1)) ** GOTO lbl375
                    var8_17 = var6_16 + 1;
                    var4_4[var6_16] = var1_1.get(var9_14, (Scriptable)var1_1);
                    var6_16 = var8_17;
                    ** GOTO lbl374
lbl366:
                    // 1 sources

                    var5_6 /* !! */  = ScriptRuntime.toString(var4_4[var7_18]);
                    var8_17 = var6_16;
                    if (!var1_1.has((String)var5_6 /* !! */ , (Scriptable)var1_1)) ** GOTO lbl375
                    var8_17 = var6_16;
                    if (!this.isEnumerable((String)var5_6 /* !! */ , var1_1)) ** GOTO lbl375
                    var8_17 = var6_16 + 1;
                    var4_4[var6_16] = var1_1.get((String)var5_6 /* !! */ , (Scriptable)var1_1);
                    var6_16 = var8_17;
lbl374:
                    // 2 sources

                    var8_17 = var6_16;
lbl375:
                    // 5 sources

                    var6_16 = var8_17;
                }
                var1_1 = var4_4;
                if (var6_16 != ((Object[])var4_4).length) {
                    var1_1 = Arrays.copyOf(var4_4, var6_16);
                }
                return var2_2.newArray((Scriptable)var3_3 /* !! */ , (Object[])var1_1);
            }
            case -22: 
        }
        var1_1 = var5_6 /* !! */ .length < 1 ? Undefined.instance : var5_6 /* !! */ [0];
        var3_3 /* !! */  = var5_6 /* !! */ .length < 2 ? Undefined.instance : var5_6 /* !! */ [1];
        return AbstractEcmaObjectOperations.hasOwnProperty((Context)var2_2, var1_1, var3_3 /* !! */ );
    }

    @Override
    protected void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object object = OBJECT_TAG;
        this.addIdFunctionProperty(idFunctionObject, object, -1, "getPrototypeOf", 1);
        if (Context.getCurrentContext().version >= 200) {
            this.addIdFunctionProperty(idFunctionObject, object, -18, "setPrototypeOf", 2);
            this.addIdFunctionProperty(idFunctionObject, object, -19, "entries", 1);
            this.addIdFunctionProperty(idFunctionObject, object, -20, "fromEntries", 1);
            this.addIdFunctionProperty(idFunctionObject, object, -21, "values", 1);
            this.addIdFunctionProperty(idFunctionObject, object, -22, "hasOwn", 1);
        }
        this.addIdFunctionProperty(idFunctionObject, object, -2, "keys", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -3, "getOwnPropertyNames", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -15, "getOwnPropertySymbols", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -4, "getOwnPropertyDescriptor", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -5, "getOwnPropertyDescriptors", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -6, "defineProperty", 3);
        this.addIdFunctionProperty(idFunctionObject, object, -7, "isExtensible", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -8, "preventExtensions", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -9, "defineProperties", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -10, "create", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -11, "isSealed", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -12, "isFrozen", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -13, "seal", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -14, "freeze", 1);
        this.addIdFunctionProperty(idFunctionObject, object, -16, "assign", 2);
        this.addIdFunctionProperty(idFunctionObject, object, -17, "is", 2);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = string.hashCode();
        int n3 = 11;
        int n4 = -1;
        switch (n2) {
            default: {
                break;
            }
            case 1976759526: {
                if (!string.equals("__defineGetter__")) break;
                n4 = 11;
                break;
            }
            case 1415647066: {
                if (!string.equals("__defineSetter__")) break;
                n4 = 10;
                break;
            }
            case 1373279653: {
                if (!string.equals("__lookupGetter__")) break;
                n4 = 9;
                break;
            }
            case 812167193: {
                if (!string.equals("__lookupSetter__")) break;
                n4 = 8;
                break;
            }
            case 231605032: {
                if (!string.equals("valueOf")) break;
                n4 = 7;
                break;
            }
            case -582702329: {
                if (!string.equals("propertyIsEnumerable")) break;
                n4 = 6;
                break;
            }
            case -1324414193: {
                if (!string.equals("isPrototypeOf")) break;
                n4 = 5;
                break;
            }
            case -1588406278: {
                if (!string.equals("constructor")) break;
                n4 = 4;
                break;
            }
            case -1776922004: {
                if (!string.equals("toString")) break;
                n4 = 3;
                break;
            }
            case -1781441930: {
                if (!string.equals("toSource")) break;
                n4 = 2;
                break;
            }
            case -1789698943: {
                if (!string.equals("hasOwnProperty")) break;
                n4 = 1;
                break;
            }
            case -2020003546: {
                if (!string.equals("toLocaleString")) break;
                n4 = 0;
            }
        }
        switch (n4) {
            default: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 0: {
                n3 = 3;
            }
            case 9: 
        }
        return n3;
    }

    @Override
    public String getClassName() {
        return "Object";
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void initPrototypeId(int var1_1) {
        block14: {
            var2_2 = 1;
            switch (var1_1) {
                default: {
                    throw new IllegalArgumentException(String.valueOf(var1_1));
                }
                case 12: {
                    var3_3 = "__lookupSetter__";
                    break block14;
                }
                case 11: {
                    var3_3 = "__lookupGetter__";
                    break block14;
                }
                case 10: {
                    var3_3 = "__defineSetter__";
                    ** GOTO lbl16
                }
                case 9: {
                    var3_3 = "__defineGetter__";
lbl16:
                    // 2 sources

                    var2_2 = 2;
                    break block14;
                }
                case 8: {
                    var3_3 = "toSource";
                    ** GOTO lbl38
                }
                case 7: {
                    var3_3 = "isPrototypeOf";
                    break block14;
                }
                case 6: {
                    var3_3 = "propertyIsEnumerable";
                    break block14;
                }
                case 5: {
                    var3_3 = "hasOwnProperty";
                    break block14;
                }
                case 4: {
                    var3_3 = "valueOf";
                    ** GOTO lbl38
                }
                case 3: {
                    var3_3 = "toLocaleString";
                    ** GOTO lbl38
                }
                case 2: {
                    var3_3 = "toString";
lbl38:
                    // 4 sources

                    var2_2 = 0;
                    break block14;
                }
                case 1: 
            }
            var3_3 = "constructor";
        }
        this.initPrototypeMethod(NativeObject.OBJECT_TAG, var1_1, var3_3, var2_2);
    }

    public Set<Object> keySet() {
        return new NativeObject$KeySet(this);
    }

    public Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public Object remove(Object object) {
        Object object2 = this.get(object);
        if (object instanceof String) {
            this.delete((String)object);
        } else if (object instanceof Number) {
            this.delete(((Number)object).intValue());
        }
        return object2;
    }

    public String toString() {
        return ScriptRuntime.defaultObjectToString(this);
    }

    public Collection<Object> values() {
        return new NativeObject$ValueCollection(this);
    }
}

