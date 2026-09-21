/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Constructable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.LambdaFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Symbol;

public class LambdaConstructor
extends LambdaFunction {
    public static final int CONSTRUCTOR_DEFAULT = 3;
    public static final int CONSTRUCTOR_FUNCTION = 1;
    public static final int CONSTRUCTOR_NEW = 2;
    private static final long serialVersionUID = 2691205302914111400L;
    private final int flags;
    private final transient Constructable targetConstructor;

    public LambdaConstructor(Scriptable scriptable, String string, int n2, int n3, Constructable constructable) {
        super(scriptable, string, n2, null);
        this.targetConstructor = constructable;
        this.flags = n3;
    }

    public LambdaConstructor(Scriptable scriptable, String string, int n2, Constructable constructable) {
        super(scriptable, string, n2, null);
        this.targetConstructor = constructable;
        this.flags = 3;
    }

    public static <T> T convertThisObject(Scriptable scriptable, Class<T> clazz) {
        if (clazz.isInstance(scriptable)) {
            return (T)scriptable;
        }
        throw ScriptRuntime.typeErrorById("msg.this.not.instance", new Object[0]);
    }

    private ScriptableObject getPrototypeScriptable() {
        Object object = this.getPrototypeProperty();
        if (object instanceof ScriptableObject) {
            return (ScriptableObject)object;
        }
        throw ScriptRuntime.typeError("Not properly a lambda constructor");
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if ((this.flags & 1) != 0) {
            return this.targetConstructor.construct(context, scriptable, objectArray);
        }
        throw ScriptRuntime.typeErrorById("msg.constructor.no.function", this.getFunctionName());
    }

    @Override
    public Scriptable construct(Context object, Scriptable scriptable, Object[] objectArray) {
        if ((this.flags & 2) != 0) {
            object = this.targetConstructor.construct((Context)object, scriptable, objectArray);
            object.setPrototype(this.getClassPrototype());
            object.setParentScope(scriptable);
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.no.new", this.getFunctionName());
    }

    public void defineConstructorMethod(Scriptable scriptable, String string, int n2, Callable callable, int n3) {
        this.defineProperty(string, (Object)new LambdaFunction(scriptable, string, n2, callable), n3);
    }

    public void defineConstructorMethod(Scriptable scriptable, String string, int n2, Callable callable, int n3, int n4) {
        scriptable = new LambdaFunction(scriptable, string, n2, callable);
        ((BaseFunction)scriptable).setStandardPropertyAttributes(n4);
        this.defineProperty(string, (Object)scriptable, n3);
    }

    public void defineConstructorMethod(Scriptable scriptable, Symbol symbol, String string, int n2, Callable callable, int n3) {
        this.defineProperty(symbol, (Object)new LambdaFunction(scriptable, string, n2, callable), n3);
    }

    public void definePrototypeMethod(Scriptable scriptable, String string, int n2, Callable callable) {
        scriptable = new LambdaFunction(scriptable, string, n2, callable);
        this.getPrototypeScriptable().defineProperty(string, (Object)scriptable, 0);
    }

    public void definePrototypeMethod(Scriptable scriptable, String string, int n2, Callable callable, int n3, int n4) {
        scriptable = new LambdaFunction(scriptable, string, n2, callable);
        ((BaseFunction)scriptable).setStandardPropertyAttributes(n4);
        this.getPrototypeScriptable().defineProperty(string, (Object)scriptable, n3);
    }

    public void definePrototypeProperty(String string, Object object, int n2) {
        this.getPrototypeScriptable().defineProperty(string, object, n2);
    }

    public void definePrototypeProperty(Symbol symbol, Object object, int n2) {
        this.getPrototypeScriptable().defineProperty(symbol, object, n2);
    }
}

