/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.util.Objects;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.Scriptable;

public final class NativeContinuation
extends IdScriptableObject
implements Function {
    private static final Object FTAG = "Continuation";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    private static final long serialVersionUID = 1794167133757605367L;
    private Object implementation;

    public static boolean equalImplementations(NativeContinuation nativeContinuation, NativeContinuation nativeContinuation2) {
        return Objects.equals(nativeContinuation.implementation, nativeContinuation2.implementation);
    }

    public static void init(Context context, Scriptable scriptable, boolean bl) {
        new NativeContinuation().exportAsJSClass(1, scriptable, bl);
    }

    public static boolean isContinuationConstructor(IdFunctionObject idFunctionObject) {
        return idFunctionObject.hasTag(FTAG) && idFunctionObject.methodId() == 1;
    }

    @Override
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return Interpreter.restartContinuation(this, context, scriptable, objectArray);
    }

    @Override
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objectArray) {
        throw Context.reportRuntimeError("Direct call is not supported");
    }

    @Override
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        if (!idFunctionObject.hasTag(FTAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objectArray);
        }
        int n2 = idFunctionObject.methodId();
        if (n2 != 1) {
            throw new IllegalArgumentException(String.valueOf(n2));
        }
        throw Context.reportRuntimeError("Direct call is not supported");
    }

    @Override
    protected int findPrototypeId(String string) {
        Objects.requireNonNull(string);
        int n2 = !string.equals("constructor") ? 0 : 1;
        return n2;
    }

    @Override
    public String getClassName() {
        return "Continuation";
    }

    public Object getImplementation() {
        return this.implementation;
    }

    public void initImplementation(Object object) {
        this.implementation = object;
    }

    @Override
    protected void initPrototypeId(int n2) {
        if (n2 == 1) {
            this.initPrototypeMethod(FTAG, n2, "constructor", 0);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(n2));
    }
}

