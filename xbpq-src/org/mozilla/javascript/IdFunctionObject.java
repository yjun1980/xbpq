/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import com.github.catvod.spider.merge.C.a;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EqualObjectGraphs;
import org.mozilla.javascript.IdFunctionCall;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

public class IdFunctionObject
extends BaseFunction {
    private static final long serialVersionUID = -5332312783643935019L;
    private int arity;
    private String functionName;
    private final IdFunctionCall idcall;
    private final int methodId;
    private final Object tag;
    private boolean useCallAsConstructor;

    public IdFunctionObject(IdFunctionCall idFunctionCall, Object object, int n2, int n3) {
        if (n3 >= 0) {
            this.idcall = idFunctionCall;
            this.tag = object;
            this.methodId = n2;
            this.arity = n3;
            return;
        }
        throw new IllegalArgumentException();
    }

    public IdFunctionObject(IdFunctionCall idFunctionCall, Object object, int n2, String string, int n3, Scriptable scriptable) {
        super(scriptable, null);
        if (n3 >= 0) {
            if (string != null) {
                this.idcall = idFunctionCall;
                this.tag = object;
                this.methodId = n2;
                this.arity = n3;
                this.functionName = string;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    static boolean equalObjectGraphs(IdFunctionObject idFunctionObject, IdFunctionObject idFunctionObject2, EqualObjectGraphs equalObjectGraphs) {
        boolean bl = idFunctionObject.methodId == idFunctionObject2.methodId && idFunctionObject.hasTag(idFunctionObject2.tag) && equalObjectGraphs.equalGraphs(idFunctionObject.idcall, idFunctionObject2.idcall);
        return bl;
    }

    public final void addAsProperty(Scriptable scriptable) {
        ScriptableObject.defineProperty(scriptable, this.functionName, this, 2);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.idcall.execIdCall(this, context, scriptable, scriptable2, objectArray);
    }

    @Override
    public Scriptable createObject(Context context, Scriptable scriptable) {
        if (this.useCallAsConstructor) {
            return null;
        }
        throw ScriptRuntime.typeErrorById("msg.not.ctor", this.functionName);
    }

    @Override
    String decompile(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        n2 = 1;
        if ((n3 & 1) == 0) {
            n2 = 0;
        }
        if (n2 == 0) {
            stringBuilder.append("function ");
            stringBuilder.append(this.getFunctionName());
            stringBuilder.append("() { ");
        }
        stringBuilder.append("[native code for ");
        Object object = this.idcall;
        if (object instanceof Scriptable) {
            stringBuilder.append(((Scriptable)object).getClassName());
            stringBuilder.append('.');
        }
        stringBuilder.append(this.getFunctionName());
        stringBuilder.append(", arity=");
        stringBuilder.append(this.getArity());
        object = n2 != 0 ? "]\n" : "] }\n";
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public void exportAsScopeProperty() {
        this.addAsProperty(this.getParentScope());
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String getFunctionName() {
        String string;
        String string2 = string = this.functionName;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    public int getLength() {
        return this.getArity();
    }

    @Override
    public Scriptable getPrototype() {
        Scriptable scriptable;
        Scriptable scriptable2 = scriptable = super.getPrototype();
        if (scriptable == null) {
            scriptable2 = ScriptableObject.getFunctionPrototype(this.getParentScope());
            this.setPrototype(scriptable2);
        }
        return scriptable2;
    }

    public Object getTag() {
        return this.tag;
    }

    public final boolean hasTag(Object object) {
        boolean bl = object == null ? this.tag == null : object.equals(this.tag);
        return bl;
    }

    public void initFunction(String string, Scriptable scriptable) {
        if (string != null) {
            if (scriptable != null) {
                this.functionName = string;
                this.setParentScope(scriptable);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final void markAsConstructor(Scriptable scriptable) {
        this.useCallAsConstructor = true;
        this.setImmunePrototypeProperty(scriptable);
    }

    public final int methodId() {
        return this.methodId;
    }

    public final RuntimeException unknown() {
        StringBuilder stringBuilder = a.c("BAD FUNCTION ID=");
        stringBuilder.append(this.methodId);
        stringBuilder.append(" MASTER=");
        stringBuilder.append(this.idcall);
        return new IllegalArgumentException(stringBuilder.toString());
    }
}

