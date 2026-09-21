/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EqualObjectGraphs;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel$Builtins;

public class BoundFunction
extends BaseFunction {
    private static final long serialVersionUID = 2118137342826470729L;
    private final Object[] boundArgs;
    private final Scriptable boundThis;
    private final int length;
    private final Callable targetFunction;

    public BoundFunction(Context context, Scriptable object, Callable object2, Scriptable scriptable, Object[] objectArray) {
        this.targetFunction = object2;
        this.boundThis = scriptable;
        this.boundArgs = objectArray;
        this.length = object2 instanceof BaseFunction ? Math.max(0, ((BaseFunction)object2).getLength() - objectArray.length) : 0;
        ScriptRuntime.setFunctionProtoAndParent(this, context, (Scriptable)object, false);
        scriptable = ScriptRuntime.typeErrorThrower(context);
        object2 = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent((ScriptableObject)object2, (Scriptable)object, TopLevel$Builtins.Object);
        ((IdScriptableObject)object2).put("get", (Scriptable)object2, (Object)scriptable);
        ((IdScriptableObject)object2).put("set", (Scriptable)object2, (Object)scriptable);
        object = Boolean.FALSE;
        ((IdScriptableObject)object2).put("enumerable", (Scriptable)object2, object);
        ((IdScriptableObject)object2).put("configurable", (Scriptable)object2, object);
        ((ScriptableObject)object2).preventExtensions();
        this.defineOwnProperty(context, "caller", (ScriptableObject)object2, false);
        this.defineOwnProperty(context, "arguments", (ScriptableObject)object2, false);
    }

    private static Object[] concat(Object[] objectArray, Object[] objectArray2) {
        Object[] objectArray3 = new Object[objectArray.length + objectArray2.length];
        System.arraycopy(objectArray, 0, objectArray3, 0, objectArray.length);
        System.arraycopy(objectArray2, 0, objectArray3, objectArray.length, objectArray2.length);
        return objectArray3;
    }

    static boolean equalObjectGraphs(BoundFunction boundFunction, BoundFunction boundFunction2, EqualObjectGraphs equalObjectGraphs) {
        boolean bl = equalObjectGraphs.equalGraphs(boundFunction.boundThis, boundFunction2.boundThis) && equalObjectGraphs.equalGraphs(boundFunction.targetFunction, boundFunction2.targetFunction) && equalObjectGraphs.equalGraphs(boundFunction.boundArgs, boundFunction2.boundArgs);
        return bl;
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Scriptable scriptable3;
        scriptable2 = scriptable3 = this.boundThis;
        if (scriptable3 == null) {
            scriptable2 = scriptable3;
            if (ScriptRuntime.hasTopCall(context)) {
                scriptable2 = ScriptRuntime.getTopCallScope(context);
            }
        }
        scriptable3 = scriptable2;
        if (scriptable2 == null) {
            scriptable3 = ScriptableObject.getTopLevelScope(scriptable);
        }
        return this.targetFunction.call(context, scriptable, scriptable3, BoundFunction.concat(this.boundArgs, objectArray));
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        Callable callable = this.targetFunction;
        if (callable instanceof Function) {
            return ((Function)callable).construct(context, scriptable, BoundFunction.concat(this.boundArgs, objectArray));
        }
        throw ScriptRuntime.typeErrorById("msg.not.ctor", new Object[0]);
    }

    @Override
    public String getFunctionName() {
        if (this.targetFunction instanceof BaseFunction) {
            StringBuilder stringBuilder = a.c("bound ");
            stringBuilder.append(((BaseFunction)this.targetFunction).getFunctionName());
            return stringBuilder.toString();
        }
        return "";
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public boolean hasInstance(Scriptable scriptable) {
        Callable callable = this.targetFunction;
        if (callable instanceof Function) {
            return ((Function)callable).hasInstance(scriptable);
        }
        throw ScriptRuntime.typeErrorById("msg.not.ctor", new Object[0]);
    }
}

