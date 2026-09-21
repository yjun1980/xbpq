/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

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

public class ArrowFunction
extends BaseFunction {
    private static final long serialVersionUID = -7377989503697220633L;
    private final Scriptable boundThis;
    private final Callable targetFunction;

    public ArrowFunction(Context context, Scriptable object, Callable object2, Scriptable scriptable) {
        this.targetFunction = object2;
        this.boundThis = scriptable;
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

    static boolean equalObjectGraphs(ArrowFunction arrowFunction, ArrowFunction arrowFunction2, EqualObjectGraphs equalObjectGraphs) {
        boolean bl = equalObjectGraphs.equalGraphs(arrowFunction.boundThis, arrowFunction2.boundThis) && equalObjectGraphs.equalGraphs(arrowFunction.targetFunction, arrowFunction2.targetFunction);
        return bl;
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        scriptable2 = this.boundThis;
        if (scriptable2 == null) {
            scriptable2 = ScriptRuntime.getTopCallScope(context);
        }
        return this.targetFunction.call(context, scriptable, scriptable2, objectArray);
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw ScriptRuntime.typeErrorById("msg.not.ctor", this.decompile(0, 0));
    }

    @Override
    String decompile(int n2, int n3) {
        Callable callable = this.targetFunction;
        if (callable instanceof BaseFunction) {
            return ((BaseFunction)callable).decompile(n2, n3);
        }
        return super.decompile(n2, n3);
    }

    @Override
    public int getArity() {
        return this.getLength();
    }

    @Override
    public int getLength() {
        Callable callable = this.targetFunction;
        if (callable instanceof BaseFunction) {
            return ((BaseFunction)callable).getLength();
        }
        return 0;
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

