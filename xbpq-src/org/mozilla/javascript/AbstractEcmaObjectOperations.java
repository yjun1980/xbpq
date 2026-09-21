/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.AbstractEcmaObjectOperations$INTEGRITY_LEVEL;
import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$StringIdOrIndex;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;

class AbstractEcmaObjectOperations {
    AbstractEcmaObjectOperations() {
    }

    static boolean hasOwnProperty(Context object, Object object2, Object object3) {
        boolean bl;
        object = ScriptableObject.ensureScriptable(object2);
        if (object3 instanceof Symbol) {
            bl = ScriptableObject.ensureSymbolScriptable(object2).has((Symbol)object3, (Scriptable)object);
        } else {
            object3 = ScriptRuntime.toStringIdOrIndex(object3);
            object2 = ((ScriptRuntime$StringIdOrIndex)object3).stringId;
            bl = object2 == null ? object.has(((ScriptRuntime$StringIdOrIndex)object3).index, (Scriptable)object) : object.has((String)object2, (Scriptable)object);
        }
        return bl;
    }

    static void put(Context object, Scriptable scriptable, int n2, Object object2, boolean bl) {
        Scriptable scriptable2 = ScriptableObject.getBase(scriptable, n2);
        object = scriptable2;
        if (scriptable2 == null) {
            object = scriptable;
        }
        if (object instanceof ScriptableObject) {
            if (((ScriptableObject)object).putImpl(null, n2, scriptable, object2, bl)) {
                return;
            }
            scriptable.put(n2, scriptable, object2);
        } else {
            object.put(n2, scriptable, object2);
        }
    }

    static void put(Context object, Scriptable scriptable, String string, Object object2, boolean bl) {
        Scriptable scriptable2 = ScriptableObject.getBase(scriptable, string);
        object = scriptable2;
        if (scriptable2 == null) {
            object = scriptable;
        }
        if (object instanceof ScriptableObject) {
            if (((ScriptableObject)object).putImpl(string, 0, scriptable, object2, bl)) {
                return;
            }
            scriptable.put(string, scriptable, object2);
        } else {
            object.put(string, scriptable, object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean setIntegrityLevel(Context context, Object object, AbstractEcmaObjectOperations$INTEGRITY_LEVEL abstractEcmaObjectOperations$INTEGRITY_LEVEL) {
        ScriptableObject scriptableObject = ScriptableObject.ensureScriptableObject(object);
        scriptableObject.preventExtensions();
        Object[] objectArray = scriptableObject.getIds(true, true);
        int n2 = objectArray.length;
        int n3 = 0;
        while (true) {
            block7: {
                Object object2;
                block9: {
                    block8: {
                        block6: {
                            if (n3 >= n2) {
                                return true;
                            }
                            object2 = objectArray[n3];
                            object = scriptableObject.getOwnPropertyDescriptor(context, object2);
                            if (abstractEcmaObjectOperations$INTEGRITY_LEVEL != AbstractEcmaObjectOperations$INTEGRITY_LEVEL.SEALED) break block6;
                            if (!Boolean.TRUE.equals(((ScriptableObject)object).get("configurable"))) break block7;
                            break block8;
                        }
                        if (ScriptableObject.isDataDescriptor((ScriptableObject)object) && Boolean.TRUE.equals(((ScriptableObject)object).get("writable"))) {
                            ((ScriptableObject)object).put("writable", (Scriptable)object, (Object)Boolean.FALSE);
                        }
                        if (!Boolean.TRUE.equals(((ScriptableObject)object).get("configurable"))) break block9;
                    }
                    ((ScriptableObject)object).put("configurable", (Scriptable)object, (Object)Boolean.FALSE);
                }
                scriptableObject.defineOwnProperty(context, object2, (ScriptableObject)object, false);
            }
            ++n3;
        }
    }

    static Constructable speciesConstructor(Context object, Scriptable object2, Constructable constructable) {
        if ((object2 = ScriptableObject.getProperty((Scriptable)object2, "constructor")) != (object = Scriptable.NOT_FOUND) && !Undefined.isUndefined(object2)) {
            if (ScriptRuntime.isObject(object2)) {
                if ((object2 = ScriptableObject.getProperty((Scriptable)object2, SymbolKey.SPECIES)) != object && object2 != null && !Undefined.isUndefined(object2)) {
                    if (object2 instanceof Constructable) {
                        return (Constructable)object2;
                    }
                    throw ScriptRuntime.typeErrorById("msg.not.ctor", ScriptRuntime.typeof(object2));
                }
                return constructable;
            }
            throw ScriptRuntime.typeErrorById("msg.arg.not.object", ScriptRuntime.typeof(object2));
        }
        return constructable;
    }

    static boolean testIntegrityLevel(Context context, Object object, AbstractEcmaObjectOperations$INTEGRITY_LEVEL abstractEcmaObjectOperations$INTEGRITY_LEVEL) {
        if (((ScriptableObject)(object = ScriptableObject.ensureScriptableObject(object))).isExtensible()) {
            return false;
        }
        Object[] objectArray = ((ScriptableObject)object).getIds(true, true);
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Boolean bl = Boolean.TRUE;
            ScriptableObject scriptableObject = ((ScriptableObject)object).getOwnPropertyDescriptor(context, objectArray[i2]);
            if (bl.equals(scriptableObject.get("configurable"))) {
                return false;
            }
            if (abstractEcmaObjectOperations$INTEGRITY_LEVEL != AbstractEcmaObjectOperations$INTEGRITY_LEVEL.FROZEN || !ScriptableObject.isDataDescriptor(scriptableObject) || !bl.equals(scriptableObject.get("writable"))) continue;
            return false;
        }
        return true;
    }
}

