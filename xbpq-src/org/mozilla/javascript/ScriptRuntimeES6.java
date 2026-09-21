/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SymbolKey;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.o;

public class ScriptRuntimeES6 {
    public static /* synthetic */ Object a(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return scriptable2;
    }

    public static void addSymbolSpecies(Context context, Scriptable scriptable, IdScriptableObject idScriptableObject) {
        ScriptableObject scriptableObject = (ScriptableObject)context.newObject(scriptable);
        ScriptableObject.putProperty((Scriptable)scriptableObject, "enumerable", (Object)Boolean.FALSE);
        ScriptableObject.putProperty((Scriptable)scriptableObject, "configurable", (Object)Boolean.TRUE);
        ScriptableObject.putProperty((Scriptable)scriptableObject, "get", (Object)new LambdaFunction(scriptable, "get [Symbol.species]", 0, o.e));
        idScriptableObject.defineOwnProperty(context, SymbolKey.SPECIES, scriptableObject, false);
    }

    public static Object requireObjectCoercible(Context context, Object object, IdFunctionObject idFunctionObject) {
        if (object != null && !Undefined.isUndefined(object)) {
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.called.null.or.undefined", idFunctionObject.getTag(), idFunctionObject.getFunctionName());
    }
}

