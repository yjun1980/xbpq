/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

public class LambdaFunction
extends BaseFunction {
    private static final long serialVersionUID = -8388132362854748293L;
    private final int length;
    private final String name;
    private final transient Callable target;

    public LambdaFunction(Scriptable scriptable, int n2, Callable callable) {
        this.target = callable;
        this.length = n2;
        this.name = "";
        ScriptRuntime.setFunctionProtoAndParent((BaseFunction)this, Context.getCurrentContext(), scriptable);
    }

    public LambdaFunction(Scriptable scriptable, String string, int n2, Callable callable) {
        this.target = callable;
        this.name = string;
        this.length = n2;
        ScriptRuntime.setFunctionProtoAndParent((BaseFunction)this, Context.getCurrentContext(), scriptable);
        this.setupDefaultPrototype();
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.target.call(context, scriptable, scriptable2, objectArray);
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw ScriptRuntime.typeErrorById("msg.no.new", this.getFunctionName());
    }

    @Override
    public int getArity() {
        return this.length;
    }

    @Override
    public String getFunctionName() {
        return this.name;
    }

    @Override
    public int getLength() {
        return this.length;
    }
}

