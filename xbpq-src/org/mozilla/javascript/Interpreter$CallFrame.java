/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.io.Serializable;
import java.util.Arrays;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EqualObjectGraphs;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.Interpreter;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.c;
import org.mozilla.javascript.d;
import org.mozilla.javascript.debug.DebugFrame;

class Interpreter$CallFrame
implements Cloneable,
Serializable {
    private static final long serialVersionUID = -2843792508994958978L;
    final DebugFrame debuggerFrame;
    final int emptyStackTop;
    final InterpretedFunction fnOrScript;
    int frameIndex;
    boolean frozen;
    final InterpreterData idata;
    boolean isContinuationsTopFrame;
    final int localShift;
    Interpreter$CallFrame parentFrame;
    int pc;
    int pcPrevBranch;
    int pcSourceLineStart;
    Object result;
    double resultDbl;
    double[] sDbl;
    int savedCallOp;
    int savedStackTop;
    Scriptable scope;
    Object[] stack;
    int[] stackAttributes;
    final Scriptable thisObj;
    Object throwable;
    final boolean useActivation;
    final Interpreter$CallFrame varSource;

    Interpreter$CallFrame(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, Interpreter$CallFrame interpreter$CallFrame) {
        int n2;
        InterpreterData interpreterData;
        this.idata = interpreterData = interpretedFunction.idata;
        Object object = context.debugger;
        object = object != null ? object.getFrame(context, interpreterData) : null;
        this.debuggerFrame = object;
        int n3 = 0;
        boolean bl = object != null || interpreterData.itsNeedsActivation;
        this.useActivation = bl;
        int n4 = interpreterData.itsMaxVars;
        this.emptyStackTop = n2 = interpreterData.itsMaxLocals + n4 - 1;
        this.fnOrScript = interpretedFunction;
        this.varSource = this;
        this.localShift = n4;
        this.thisObj = scriptable;
        this.parentFrame = interpreter$CallFrame;
        if (interpreter$CallFrame != null) {
            n3 = interpreter$CallFrame.frameIndex + 1;
        }
        this.frameIndex = n3;
        if (n3 <= context.getMaximumInterpreterStackDepth()) {
            this.result = Undefined.instance;
            this.pcSourceLineStart = interpreterData.firstLinePC;
            this.savedStackTop = n2;
            return;
        }
        throw Context.reportRuntimeError("Exceeded maximum stack depth");
    }

    public static /* synthetic */ Boolean a(Interpreter$CallFrame interpreter$CallFrame, Object object, EqualObjectGraphs equalObjectGraphs) {
        return interpreter$CallFrame.lambda$equalsInTopScope$1(object, equalObjectGraphs);
    }

    public static /* synthetic */ Object b(Interpreter$CallFrame interpreter$CallFrame, Object object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return interpreter$CallFrame.lambda$equals$0(object, context, scriptable, scriptable2, objectArray);
    }

    private static Boolean equals(Interpreter$CallFrame interpreter$CallFrame, Interpreter$CallFrame interpreter$CallFrame2, EqualObjectGraphs equalObjectGraphs) {
        while (true) {
            if (interpreter$CallFrame == interpreter$CallFrame2) {
                return Boolean.TRUE;
            }
            if (interpreter$CallFrame == null || interpreter$CallFrame2 == null) break;
            if (!interpreter$CallFrame.fieldsEqual(interpreter$CallFrame2, equalObjectGraphs)) {
                return Boolean.FALSE;
            }
            interpreter$CallFrame = interpreter$CallFrame.parentFrame;
            interpreter$CallFrame2 = interpreter$CallFrame2.parentFrame;
        }
        return Boolean.FALSE;
    }

    private Boolean equalsInTopScope(Object object) {
        return (Boolean)EqualObjectGraphs.withThreadLocal(new c(this, object));
    }

    private boolean fieldsEqual(Interpreter$CallFrame interpreter$CallFrame, EqualObjectGraphs equalObjectGraphs) {
        boolean bl = this.frameIndex == interpreter$CallFrame.frameIndex && this.pc == interpreter$CallFrame.pc && Interpreter.access$200(this.idata, interpreter$CallFrame.idata) && equalObjectGraphs.equalGraphs(this.varSource.stack, interpreter$CallFrame.varSource.stack) && Arrays.equals(this.varSource.sDbl, interpreter$CallFrame.varSource.sDbl) && equalObjectGraphs.equalGraphs(this.thisObj, interpreter$CallFrame.thisObj) && equalObjectGraphs.equalGraphs(this.fnOrScript, interpreter$CallFrame.fnOrScript) && equalObjectGraphs.equalGraphs(this.scope, interpreter$CallFrame.scope);
        return bl;
    }

    private boolean isStrictTopFrame() {
        Interpreter$CallFrame interpreter$CallFrame = this;
        Interpreter$CallFrame interpreter$CallFrame2;
        while ((interpreter$CallFrame2 = interpreter$CallFrame.parentFrame) != null) {
            interpreter$CallFrame = interpreter$CallFrame2;
        }
        return interpreter$CallFrame.idata.isStrict;
    }

    private /* synthetic */ Object lambda$equals$0(Object object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        return this.equalsInTopScope(object);
    }

    private /* synthetic */ Boolean lambda$equalsInTopScope$1(Object object, EqualObjectGraphs equalObjectGraphs) {
        return Interpreter$CallFrame.equals(this, (Interpreter$CallFrame)object, equalObjectGraphs);
    }

    Interpreter$CallFrame cloneFrozen() {
        Interpreter$CallFrame interpreter$CallFrame;
        if (!this.frozen) {
            Kit.codeBug();
        }
        try {
            interpreter$CallFrame = (Interpreter$CallFrame)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException();
        }
        interpreter$CallFrame.stack = (Object[])this.stack.clone();
        interpreter$CallFrame.stackAttributes = (int[])this.stackAttributes.clone();
        interpreter$CallFrame.sDbl = (double[])this.sDbl.clone();
        interpreter$CallFrame.frozen = false;
        return interpreter$CallFrame;
    }

    public boolean equals(Object object) {
        if (object instanceof Interpreter$CallFrame) {
            Context context;
            block11: {
                context = Context.enter();
                try {
                    if (!ScriptRuntime.hasTopCall(context)) break block11;
                    boolean bl = this.equalsInTopScope(object);
                    if (context != null) {
                        context.close();
                    }
                    return bl;
                }
                catch (Throwable throwable) {
                    try {
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        if (context != null) {
                            try {
                                context.close();
                            }
                            catch (Throwable throwable3) {
                                throwable.addSuppressed(throwable3);
                            }
                        }
                        throw throwable2;
                    }
                }
            }
            Scriptable scriptable = ScriptableObject.getTopLevelScope(this.scope);
            d d2 = new d(this, object);
            boolean bl = (Boolean)ScriptRuntime.doTopCall(d2, context, scriptable, scriptable, ScriptRuntime.emptyArgs, this.isStrictTopFrame());
            if (context != null) {
                context.close();
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        int n2 = 0;
        int n3 = 0;
        Interpreter$CallFrame interpreter$CallFrame = this;
        while (true) {
            n2 = (n2 * 31 + interpreter$CallFrame.pc) * 31 + interpreter$CallFrame.idata.icodeHashCode();
            interpreter$CallFrame = interpreter$CallFrame.parentFrame;
            if (interpreter$CallFrame == null || n3 >= 8) break;
            ++n3;
        }
        return n2;
    }

    void initializeArgs(Context context, Scriptable object, Object[] object2, double[] object3, int n2, int n3) {
        boolean bl = this.useActivation;
        int n4 = 0;
        Object[] objectArray = object2;
        double[] dArray = object3;
        int n5 = n2;
        if (bl) {
            objectArray = object2;
            if (object3 != null) {
                objectArray = Interpreter.access$000(object2, object3, n2, n3);
            }
            dArray = null;
            n5 = 0;
        }
        if (this.idata.itsFunctionType != 0) {
            object = this.fnOrScript.getParentScope();
            this.scope = object;
            if (this.useActivation) {
                object2 = this.idata;
                object = object2.itsFunctionType == 4 ? ScriptRuntime.createArrowFunctionActivation(this.fnOrScript, context, (Scriptable)object, objectArray, object2.isStrict, object2.argsHasRest) : ScriptRuntime.createFunctionActivation(this.fnOrScript, context, (Scriptable)object, objectArray, object2.isStrict, object2.argsHasRest);
                this.scope = object;
            }
        } else {
            this.scope = object;
            object2 = this.fnOrScript;
            ScriptRuntime.initScript((NativeFunction)object2, this.thisObj, context, (Scriptable)object, object2.idata.evalScriptFlag);
        }
        object = this.idata;
        if (object.itsNestedFunctions != null) {
            if (object.itsFunctionType != 0 && !object.itsNeedsActivation) {
                Kit.codeBug();
            }
            for (n2 = 0; n2 < ((InterpreterData[])(object = this.idata.itsNestedFunctions)).length; ++n2) {
                if (object[n2].itsFunctionType != 1) continue;
                Interpreter.access$100(context, this.scope, this.fnOrScript, n2);
            }
        }
        object = this.idata;
        n2 = object.itsMaxFrameArray;
        if (n2 != this.emptyStackTop + object.itsMaxStack + 1) {
            Kit.codeBug();
        }
        this.stack = new Object[n2];
        this.stackAttributes = new int[n2];
        this.sDbl = new double[n2];
        int n6 = this.idata.getParamAndVarCount();
        for (n2 = 0; n2 < n6; ++n2) {
            if (!this.idata.getParamOrVarConst(n2)) continue;
            this.stackAttributes[n2] = 13;
        }
        n2 = n6 = this.idata.argCount;
        if (n6 > n3) {
            n2 = n3;
        }
        System.arraycopy(objectArray, n5, this.stack, 0, n2);
        n6 = n2;
        if (dArray != null) {
            System.arraycopy(dArray, n5, this.sDbl, 0, n2);
            n6 = n2;
        }
        while (true) {
            object = this.idata;
            if (n6 == object.itsMaxVars) break;
            this.stack[n6] = Undefined.instance;
            ++n6;
        }
        if (object.argsHasRest) {
            n2 = object.argCount;
            n6 = n2 - 1;
            if (n3 >= n2) {
                int n7 = n3 - n6;
                object2 = new Object[n7];
                n3 = n5 + n6;
                n2 = n4;
                while (true) {
                    object = object2;
                    if (n2 != n7) {
                        object3 = objectArray[n3];
                        object = object3;
                        if (object3 == UniqueTag.DOUBLE_MARK) {
                            object = ScriptRuntime.wrapNumber(dArray[n3]);
                        }
                        object2[n2] = object;
                        ++n3;
                        ++n2;
                        continue;
                    }
                    break;
                }
            } else {
                object = ScriptRuntime.emptyArgs;
            }
            this.stack[n6] = context.newArray(this.scope, (Object[])object);
        }
    }
}

