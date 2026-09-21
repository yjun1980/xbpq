/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.debug.DebuggableScript;

final class InterpretedFunction
extends NativeFunction
implements Script {
    private static final long serialVersionUID = 541475680333911468L;
    InterpreterData idata;
    SecurityController securityController;
    Object securityDomain;

    private InterpretedFunction(InterpretedFunction interpretedFunction, int n2) {
        this.idata = interpretedFunction.idata.itsNestedFunctions[n2];
        this.securityController = interpretedFunction.securityController;
        this.securityDomain = interpretedFunction.securityDomain;
    }

    private InterpretedFunction(InterpreterData object, Object object2) {
        block4: {
            SecurityController securityController;
            block3: {
                block2: {
                    this.idata = object;
                    securityController = Context.getContext().getSecurityController();
                    if (securityController == null) break block2;
                    object = securityController.getDynamicSecurityDomain(object2);
                    break block3;
                }
                if (object2 != null) break block4;
                object = null;
            }
            this.securityController = securityController;
            this.securityDomain = object;
            return;
        }
        throw new IllegalArgumentException();
    }

    static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int n2) {
        interpretedFunction = new InterpretedFunction(interpretedFunction, n2);
        interpretedFunction.initScriptFunction(context, scriptable, interpretedFunction.idata.isES6Generator);
        return interpretedFunction;
    }

    static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpreterData serializable, Object object) {
        serializable = new InterpretedFunction((InterpreterData)serializable, object);
        ((NativeFunction)serializable).initScriptFunction(context, scriptable, ((InterpretedFunction)serializable).idata.isES6Generator);
        return serializable;
    }

    static InterpretedFunction createScript(InterpreterData interpreterData, Object object) {
        return new InterpretedFunction(interpreterData, object);
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(this, context, scriptable, scriptable2, objectArray, this.idata.isStrict);
        }
        return Interpreter.interpret(this, context, scriptable, scriptable2, objectArray);
    }

    @Override
    public Object exec(Context context, Scriptable object) {
        if (this.isScript()) {
            object = !ScriptRuntime.hasTopCall(context) ? ScriptRuntime.doTopCall(this, context, (Scriptable)object, (Scriptable)object, ScriptRuntime.emptyArgs, this.idata.isStrict) : Interpreter.interpret(this, context, (Scriptable)object, (Scriptable)object, ScriptRuntime.emptyArgs);
            context.processMicrotasks();
            return object;
        }
        throw new IllegalStateException();
    }

    @Override
    public DebuggableScript getDebuggableView() {
        return this.idata;
    }

    @Override
    public String getEncodedSource() {
        return Interpreter.getEncodedSource(this.idata);
    }

    @Override
    public String getFunctionName() {
        String string;
        String string2 = string = this.idata.itsName;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    @Override
    protected int getLanguageVersion() {
        return this.idata.languageVersion;
    }

    @Override
    protected int getParamAndVarCount() {
        return this.idata.argNames.length;
    }

    @Override
    protected int getParamCount() {
        int n2;
        InterpreterData interpreterData = this.idata;
        boolean bl = interpreterData.argsHasRest;
        int n3 = n2 = interpreterData.argCount;
        if (bl) {
            n3 = n2 - 1;
        }
        return n3;
    }

    @Override
    protected boolean getParamOrVarConst(int n2) {
        return this.idata.argIsConst[n2];
    }

    @Override
    protected String getParamOrVarName(int n2) {
        return this.idata.argNames[n2];
    }

    boolean hasFunctionNamed(String string) {
        for (int i2 = 0; i2 < this.idata.getFunctionCount(); ++i2) {
            InterpreterData interpreterData = (InterpreterData)this.idata.getFunction(i2);
            if (interpreterData.declaredAsFunctionExpression || !string.equals(interpreterData.getFunctionName())) continue;
            return false;
        }
        return true;
    }

    public boolean isScript() {
        boolean bl = this.idata.itsFunctionType == 0;
        return bl;
    }

    @Override
    public Object resumeGenerator(Context context, Scriptable scriptable, int n2, Object object, Object object2) {
        return Interpreter.resumeGenerator(context, scriptable, n2, object, object2);
    }
}

