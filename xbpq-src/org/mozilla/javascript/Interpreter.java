/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.CodeGenerator;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.ConstProperties;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ES6Generator$YieldStarResult;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Icode;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.InterpretedFunction;
import org.mozilla.javascript.Interpreter$CallFrame;
import org.mozilla.javascript.Interpreter$ContinuationJump;
import org.mozilla.javascript.Interpreter$GeneratorState;
import org.mozilla.javascript.InterpreterData;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ScriptRuntime$NoSuchMethodShim;
import org.mozilla.javascript.ScriptStackElement;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.UintMap;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.UniqueTag;
import org.mozilla.javascript.ast.ScriptNode;

public final class Interpreter
extends Icode
implements Evaluator {
    static final int EXCEPTION_HANDLER_SLOT = 2;
    static final int EXCEPTION_LOCAL_SLOT = 4;
    static final int EXCEPTION_SCOPE_SLOT = 5;
    static final int EXCEPTION_SLOT_SIZE = 6;
    static final int EXCEPTION_TRY_END_SLOT = 1;
    static final int EXCEPTION_TRY_START_SLOT = 0;
    static final int EXCEPTION_TYPE_SLOT = 3;
    InterpreterData itsData;

    static /* synthetic */ Object[] access$000(Object[] objectArray, double[] dArray, int n2, int n3) {
        return Interpreter.getArgsArray(objectArray, dArray, n2, n3);
    }

    static /* synthetic */ void access$100(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int n2) {
        Interpreter.initFunction(context, scriptable, interpretedFunction, n2);
    }

    static /* synthetic */ boolean access$200(InterpreterData interpreterData, InterpreterData interpreterData2) {
        return Interpreter.compareIdata(interpreterData, interpreterData2);
    }

    private static void addInstructionCount(Context context, Interpreter$CallFrame interpreter$CallFrame, int n2) {
        int n3 = context.instructionCount;
        context.instructionCount = n2 = interpreter$CallFrame.pc - interpreter$CallFrame.pcPrevBranch + n2 + n3;
        if (n2 > context.instructionThreshold) {
            context.observeInstructionCount(n2);
            context.instructionCount = 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int bytecodeSpan(int n2) {
        if (n2 == -66 || n2 == -65 || n2 == -54 || n2 == -23) return 3;
        if (n2 == -21) return 5;
        if (n2 == 50) return 3;
        if (n2 == 57) return 2;
        if (n2 == 73 || n2 == 5 || n2 == 6 || n2 == 7) return 3;
        switch (n2) {
            default: {
                switch (n2) {
                    default: {
                        switch (n2) {
                            default: {
                                switch (n2) {
                                    default: {
                                        switch (n2) {
                                            default: {
                                                if (!Icode.validBytecode(n2)) throw Kit.codeBug();
                                                return 1;
                                            }
                                            case -11: 
                                            case -10: 
                                            case -9: 
                                            case -8: 
                                            case -7: {
                                                return 2;
                                            }
                                            case -6: {
                                                return 3;
                                            }
                                        }
                                    }
                                    case -27: 
                                    case -26: {
                                        return 3;
                                    }
                                    case -28: 
                                }
                                return 5;
                            }
                            case -38: {
                                return 2;
                            }
                            case -39: {
                                return 3;
                            }
                            case -40: 
                        }
                        return 5;
                    }
                    case -45: {
                        return 2;
                    }
                    case -46: {
                        return 3;
                    }
                    case -47: {
                        return 5;
                    }
                    case -49: 
                    case -48: 
                }
            }
            case -61: {
                return 2;
            }
            case -63: 
            case -62: {
                return 3;
            }
        }
    }

    public static NativeContinuation captureContinuation(Context context) {
        Object object = context.lastInterpreterFrame;
        if (object != null && object instanceof Interpreter$CallFrame) {
            return Interpreter.captureContinuation(context, (Interpreter$CallFrame)object, true);
        }
        throw new IllegalStateException("Interpreter frames not found");
    }

    private static NativeContinuation captureContinuation(Context object, Interpreter$CallFrame interpreter$CallFrame, boolean bl) {
        NativeContinuation nativeContinuation = new NativeContinuation();
        ScriptRuntime.setObjectProtoAndParent(nativeContinuation, ScriptRuntime.getTopCallScope((Context)object));
        Object[] objectArray = object = interpreter$CallFrame;
        while (object != null && !object.frozen) {
            int n2;
            object.frozen = true;
            for (n2 = object.savedStackTop + 1; n2 != (objectArray = object.stack).length; ++n2) {
                objectArray[n2] = null;
                object.stackAttributes[n2] = 0;
            }
            n2 = object.savedCallOp;
            if (n2 == 38) {
                objectArray[object.savedStackTop] = null;
            } else if (n2 != 30) {
                Kit.codeBug();
            }
            Interpreter$CallFrame interpreter$CallFrame2 = object.parentFrame;
            objectArray = object;
            object = interpreter$CallFrame2;
        }
        if (bl) {
            while ((object = objectArray.parentFrame) != null) {
                objectArray = object;
            }
            if (!objectArray.isContinuationsTopFrame) {
                throw new IllegalStateException("Cannot capture continuation from JavaScript code not called directly by executeScriptWithContinuations or callFunctionWithContinuations");
            }
        }
        nativeContinuation.initImplementation(interpreter$CallFrame);
        return nativeContinuation;
    }

    private static Interpreter$CallFrame captureFrameForGenerator(Interpreter$CallFrame interpreter$CallFrame) {
        interpreter$CallFrame.frozen = true;
        Interpreter$CallFrame interpreter$CallFrame2 = interpreter$CallFrame.cloneFrozen();
        interpreter$CallFrame.frozen = false;
        interpreter$CallFrame2.parentFrame = null;
        interpreter$CallFrame2.frameIndex = 0;
        return interpreter$CallFrame2;
    }

    private static boolean compareIdata(InterpreterData interpreterData, InterpreterData interpreterData2) {
        boolean bl = interpreterData == interpreterData2 || Objects.equals(Interpreter.getEncodedSource(interpreterData), Interpreter.getEncodedSource(interpreterData2));
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void doAdd(Object[] objectArray, double[] object, int n2, Context object2) {
        Object object3;
        UniqueTag uniqueTag;
        Object object4;
        Object object5;
        block21: {
            double d2;
            boolean bl;
            block20: {
                void var2_6;
                block19: {
                    bl = var2_6 + true;
                    object5 = objectArray[bl];
                    object4 = objectArray[var2_6];
                    uniqueTag = UniqueTag.DOUBLE_MARK;
                    if (object5 != uniqueTag) break block19;
                    d2 = object[bl];
                    if (object4 == uniqueTag) {
                        object[var2_6] = object[var2_6] + d2;
                        return;
                    }
                    bl = true;
                    object5 = object4;
                    break block20;
                }
                if (object4 != uniqueTag) break block21;
                d2 = object[var2_6];
                bl = false;
            }
            if (object5 instanceof Scriptable) {
                void var1_4;
                Number number = ScriptRuntime.wrapNumber(d2);
                object4 = object5;
                Number number2 = number;
                if (!bl) {
                    object4 = number;
                    Object object6 = object5;
                }
                objectArray[var2_6] = ScriptRuntime.add(object4, var1_4, (Context)object3);
                return;
            } else if (object5 instanceof CharSequence) {
                ConsString consString;
                object3 = ScriptRuntime.numberToString(d2, 10);
                object5 = (CharSequence)object5;
                if (bl) {
                    consString = new ConsString((CharSequence)object5, (CharSequence)object3);
                    objectArray[var2_6] = consString;
                    return;
                } else {
                    consString = new ConsString((CharSequence)object3, (CharSequence)object5);
                    objectArray[var2_6] = consString;
                }
                return;
            } else {
                object3 = object5 instanceof Number ? (Number)((Number)object5) : (Number)ScriptRuntime.toNumeric(object5);
                if (object3 instanceof BigInteger) throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
                objectArray[var2_6] = uniqueTag;
                object[var2_6] = ((Number)object3).doubleValue() + d2;
            }
            return;
        }
        if (!(object4 instanceof Scriptable) && !(object5 instanceof Scriptable)) {
            if (object4 instanceof CharSequence) {
                objectArray[var2_6] = object5 instanceof CharSequence ? new ConsString((CharSequence)object4, (CharSequence)object5) : new ConsString((CharSequence)object4, ScriptRuntime.toCharSequence(object5));
                return;
            } else if (object5 instanceof CharSequence) {
                objectArray[var2_6] = new ConsString(ScriptRuntime.toCharSequence(object4), (CharSequence)object5);
                return;
            } else {
                object3 = object4 instanceof Number ? (Number)((Number)object4) : (Number)ScriptRuntime.toNumeric(object4);
                object5 = object5 instanceof Number ? (Number)((Number)object5) : (Number)ScriptRuntime.toNumeric(object5);
                boolean bl = object3 instanceof BigInteger;
                if (bl && object5 instanceof BigInteger) {
                    objectArray[var2_6] = ((BigInteger)object3).add((BigInteger)object5);
                    return;
                } else {
                    if (bl || object5 instanceof BigInteger) throw ScriptRuntime.typeErrorById("msg.cant.convert.to.number", "BigInt");
                    objectArray[var2_6] = uniqueTag;
                    double d3 = ((Number)object3).doubleValue();
                    object[var2_6] = ((Number)object5).doubleValue() + d3;
                }
            }
            return;
        } else {
            objectArray[var2_6] = ScriptRuntime.add(object4, object5, (Context)object3);
        }
    }

    private static int doArithmetic(Interpreter$CallFrame serializable, int n2, Object[] objectArray, double[] dArray, int n3) {
        Number number = Interpreter.stack_numeric((Interpreter$CallFrame)serializable, n3 - 1);
        serializable = Interpreter.stack_numeric((Interpreter$CallFrame)serializable, n3);
        --n3;
        if (n2 != 75) {
            switch (n2) {
                default: {
                    serializable = null;
                    break;
                }
                case 25: {
                    serializable = ScriptRuntime.remainder(number, (Number)serializable);
                    break;
                }
                case 24: {
                    serializable = ScriptRuntime.divide(number, (Number)serializable);
                    break;
                }
                case 23: {
                    serializable = ScriptRuntime.multiply(number, (Number)serializable);
                    break;
                }
                case 22: {
                    serializable = ScriptRuntime.subtract(number, (Number)serializable);
                    break;
                }
            }
        } else {
            serializable = ScriptRuntime.exponentiate(number, (Number)serializable);
        }
        if (serializable instanceof BigInteger) {
            objectArray[n3] = serializable;
        } else {
            objectArray[n3] = UniqueTag.DOUBLE_MARK;
            dArray[n3] = ((Number)serializable).doubleValue();
        }
        return n3;
    }

    private static int doBitNOT(Interpreter$CallFrame serializable, Object[] objectArray, double[] dArray, int n2) {
        if ((serializable = ScriptRuntime.bitwiseNOT(Interpreter.stack_numeric((Interpreter$CallFrame)serializable, n2))) instanceof BigInteger) {
            objectArray[n2] = serializable;
        } else {
            objectArray[n2] = UniqueTag.DOUBLE_MARK;
            dArray[n2] = ((Number)serializable).doubleValue();
        }
        return n2;
    }

    private static int doBitOp(Interpreter$CallFrame serializable, int n2, Object[] objectArray, double[] dArray, int n3) {
        Number number = Interpreter.stack_numeric((Interpreter$CallFrame)serializable, n3 - 1);
        serializable = Interpreter.stack_numeric((Interpreter$CallFrame)serializable, n3);
        --n3;
        if (n2 != 18) {
            if (n2 != 19) {
                switch (n2) {
                    default: {
                        serializable = null;
                        break;
                    }
                    case 11: {
                        serializable = ScriptRuntime.bitwiseAND(number, (Number)serializable);
                        break;
                    }
                    case 10: {
                        serializable = ScriptRuntime.bitwiseXOR(number, (Number)serializable);
                        break;
                    }
                    case 9: {
                        serializable = ScriptRuntime.bitwiseOR(number, (Number)serializable);
                        break;
                    }
                }
            } else {
                serializable = ScriptRuntime.signedRightShift(number, (Number)serializable);
            }
        } else {
            serializable = ScriptRuntime.leftShift(number, (Number)serializable);
        }
        if (serializable instanceof BigInteger) {
            objectArray[n3] = serializable;
        } else {
            objectArray[n3] = UniqueTag.DOUBLE_MARK;
            dArray[n3] = ((Number)serializable).doubleValue();
        }
        return n3;
    }

    private static int doCallSpecial(Context context, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, double[] dArray, int n2, byte[] object, int n3) {
        int n4 = interpreter$CallFrame.pc;
        int n5 = object[n4] & 0xFF;
        boolean bl = object[n4 + 1] != 0;
        n4 = Interpreter.getIndex(object, n4 + 2);
        if (bl) {
            Object object2 = objectArray[n2 -= n3];
            object = object2;
            if (object2 == UniqueTag.DOUBLE_MARK) {
                object = ScriptRuntime.wrapNumber(dArray[n2]);
            }
            objectArray[n2] = ScriptRuntime.newSpecial(context, object, Interpreter.getArgsArray(objectArray, dArray, n2 + 1, n3), interpreter$CallFrame.scope, n5);
        } else {
            object = (Scriptable)objectArray[(n2 -= n3 + 1) + 1];
            objectArray[n2] = ScriptRuntime.callSpecial(context, (Callable)objectArray[n2], (Scriptable)object, Interpreter.getArgsArray(objectArray, dArray, n2 + 2, n3), interpreter$CallFrame.scope, interpreter$CallFrame.thisObj, n5, interpreter$CallFrame.idata.itsSourceFile, n4);
        }
        interpreter$CallFrame.pc += 4;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int doCompare(Interpreter$CallFrame var0, int var1_1, Object[] var2_2, double[] var3_3, int var4_4) {
        block2: {
            var7_5 = --var4_4 + 1;
            var9_6 = var2_2[var7_5];
            var11_7 = var2_2[var4_4];
            var10_8 = UniqueTag.DOUBLE_MARK;
            if (var9_6 != var10_8) break block2;
            var3_3 /* !! */  = (double[])var3_3 /* !! */ [var7_5];
            var0 /* !! */  = Interpreter.stack_numeric(var0 /* !! */ , var4_4);
            ** GOTO lbl15
        }
        if (var11_7 == var10_8) {
            var0 /* !! */  = ScriptRuntime.toNumeric(var9_6);
            var5_9 = var3_3 /* !! */ [var4_4];
            var3_3 /* !! */  = (double[])var0 /* !! */ ;
            var0 /* !! */  = Double.valueOf(var5_9);
lbl15:
            // 2 sources

            var8_10 = ScriptRuntime.compare((Number)var0 /* !! */ , (Number)var3_3 /* !! */ , var1_1);
        } else {
            var8_10 = ScriptRuntime.compare(var11_7, var9_6, var1_1);
        }
        var2_2[var4_4] = ScriptRuntime.wrapBoolean(var8_10);
        return var4_4;
    }

    private static int doDelName(Context context, Interpreter$CallFrame object, int n2, Object[] objectArray, double[] dArray, int n3) {
        Object object2;
        Object object3 = objectArray[n3];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object4 = object3;
        if (object3 == uniqueTag) {
            object4 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        object3 = object2 = objectArray[--n3];
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        object = ((Interpreter$CallFrame)object).scope;
        boolean bl = n2 == 0;
        objectArray[n3] = ScriptRuntime.delete(object3, object4, context, (Scriptable)object, bl);
        return n3;
    }

    private static int doElemIncDec(Context context, Interpreter$CallFrame interpreter$CallFrame, byte[] byArray, Object[] objectArray, double[] dArray, int n2) {
        Object object;
        Object object2 = objectArray[n2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object3 = object2;
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object2 = object = objectArray[--n2];
        if (object == uniqueTag) {
            object2 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        objectArray[n2] = ScriptRuntime.elemIncrDecr(object2, object3, context, interpreter$CallFrame.scope, byArray[interpreter$CallFrame.pc]);
        ++interpreter$CallFrame.pc;
        return n2;
    }

    private static boolean doEquals(Object[] object, double[] dArray, int n2) {
        int n3 = n2 + 1;
        Object object2 = object[n3];
        Object object3 = object[n2];
        object = UniqueTag.DOUBLE_MARK;
        if (object2 == object) {
            if (object3 == object) {
                boolean bl = dArray[n2] == dArray[n3];
                return bl;
            }
            return ScriptRuntime.eqNumber(dArray[n3], object3);
        }
        if (object3 == object) {
            return ScriptRuntime.eqNumber(dArray[n2], object2);
        }
        return ScriptRuntime.eq(object3, object2);
    }

    private static int doGetElem(Context object, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, double[] dArray, int n2) {
        int n3 = n2 - 1;
        Object object2 = objectArray[n3];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object3 = object2;
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        object = (object2 = objectArray[n2 = n3 + 1]) != uniqueTag ? ScriptRuntime.getObjectElem(object3, object2, (Context)object, interpreter$CallFrame.scope) : ScriptRuntime.getObjectIndex(object3, dArray[n2], (Context)object, interpreter$CallFrame.scope);
        objectArray[n3] = object;
        return n3;
    }

    private static int doGetVar(Interpreter$CallFrame object, Object[] objectArray, double[] object2, int n2, Object[] objectArray2, double[] dArray, int n3) {
        ++n2;
        if (!((Interpreter$CallFrame)object).useActivation) {
            objectArray[n2] = objectArray2[n3];
            object2[n2] = dArray[n3];
        } else {
            object2 = ((Interpreter$CallFrame)object).idata.argNames[n3];
            object = ((Interpreter$CallFrame)object).scope;
            objectArray[n2] = object.get((String)object2, (Scriptable)object);
        }
        return n2;
    }

    private static int doInOrInstanceof(Context context, int n2, Object[] objectArray, double[] dArray, int n3) {
        Object object;
        Object object2 = objectArray[n3];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object3 = object2;
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        object2 = object = objectArray[--n3];
        if (object == uniqueTag) {
            object2 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        boolean bl = n2 == 52 ? ScriptRuntime.in(object2, object3, context) : ScriptRuntime.instanceOf(object2, object3, context);
        objectArray[n3] = ScriptRuntime.wrapBoolean(bl);
        return n3;
    }

    private static int doRefMember(Context context, Object[] objectArray, double[] dArray, int n2, int n3) {
        Object object;
        Object object2 = objectArray[n2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object3 = object2;
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object2 = object = objectArray[--n2];
        if (object == uniqueTag) {
            object2 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        objectArray[n2] = ScriptRuntime.memberRef(object2, object3, context, n3);
        return n2;
    }

    private static int doRefNsMember(Context context, Object[] objectArray, double[] dArray, int n2, int n3) {
        Object object;
        Object object2;
        Object object3 = objectArray[n2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object4 = object3;
        if (object3 == uniqueTag) {
            object4 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object3 = object2 = objectArray[--n2];
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object2 = object = objectArray[--n2];
        if (object == uniqueTag) {
            object2 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        objectArray[n2] = ScriptRuntime.memberRef(object2, object3, object4, context, n3);
        return n2;
    }

    private static int doRefNsName(Context context, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, double[] dArray, int n2, int n3) {
        Object object;
        Object object2 = objectArray[n2];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object3 = object2;
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object2 = object = objectArray[--n2];
        if (object == uniqueTag) {
            object2 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        objectArray[n2] = ScriptRuntime.nameRef(object2, object3, context, interpreter$CallFrame.scope, n3);
        return n2;
    }

    private static int doSetConstVar(Interpreter$CallFrame object, Object[] object2, double[] object3, int n2, Object[] object4, double[] dArray, int[] nArray, int n3) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        if (((Interpreter$CallFrame)object).useActivation) break block6;
                        if ((nArray[n3] & 1) == 0) break block7;
                        if ((nArray[n3] & 8) != 0) {
                            object4[n3] = object2[n2];
                            nArray[n3] = nArray[n3] & 0xFFFFFFF7;
                            dArray[n3] = object3[n2];
                        }
                        break block8;
                    }
                    throw Context.reportRuntimeErrorById("msg.var.redecl", ((Interpreter$CallFrame)object).idata.argNames[n3]);
                }
                object4 = object2[n2];
                object2 = object4;
                if (object4 == UniqueTag.DOUBLE_MARK) {
                    object2 = ScriptRuntime.wrapNumber(object3[n2]);
                }
                object3 = ((Interpreter$CallFrame)object).idata.argNames[n3];
                object = ((Interpreter$CallFrame)object).scope;
                if (!(object instanceof ConstProperties)) break block9;
                ((ConstProperties)object).putConst((String)object3, (Scriptable)object, object2);
            }
            return n2;
        }
        throw Kit.codeBug();
    }

    private static int doSetElem(Context object, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, double[] dArray, int n2) {
        Object object2;
        int n3 = (n2 -= 2) + 2;
        Object object3 = objectArray[n3];
        UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
        Object object4 = object3;
        if (object3 == uniqueTag) {
            object4 = ScriptRuntime.wrapNumber(dArray[n3]);
        }
        object3 = object2 = objectArray[n2];
        if (object2 == uniqueTag) {
            object3 = ScriptRuntime.wrapNumber(dArray[n2]);
        }
        object = (object2 = objectArray[n3 = n2 + 1]) != uniqueTag ? ScriptRuntime.setObjectElem(object3, object2, object4, (Context)object, interpreter$CallFrame.scope) : ScriptRuntime.setObjectIndex(object3, dArray[n3], object4, (Context)object, interpreter$CallFrame.scope);
        objectArray[n2] = object;
        return n2;
    }

    private static int doSetVar(Interpreter$CallFrame object, Object[] object2, double[] object3, int n2, Object[] object4, double[] dArray, int[] nArray, int n3) {
        if (!((Interpreter$CallFrame)object).useActivation) {
            if ((nArray[n3] & 1) == 0) {
                object4[n3] = object2[n2];
                dArray[n3] = object3[n2];
            }
        } else {
            object4 = object2[n2];
            object2 = object4;
            if (object4 == UniqueTag.DOUBLE_MARK) {
                object2 = ScriptRuntime.wrapNumber(object3[n2]);
            }
            object3 = ((Interpreter$CallFrame)object).idata.argNames[n3];
            object = ((Interpreter$CallFrame)object).scope;
            object.put((String)object3, (Scriptable)object, object2);
        }
        return n2;
    }

    private static boolean doShallowEquals(Object[] object, double[] dArray, int n2) {
        Object object2;
        block8: {
            boolean bl;
            block9: {
                double d2;
                double d3;
                boolean bl2;
                block6: {
                    UniqueTag uniqueTag;
                    block4: {
                        block7: {
                            block5: {
                                int n3 = n2 + 1;
                                object2 = object[n3];
                                object = object[n2];
                                uniqueTag = UniqueTag.DOUBLE_MARK;
                                bl2 = false;
                                if (object2 != uniqueTag) break block4;
                                d3 = dArray[n3];
                                if (object != uniqueTag) break block5;
                                d2 = dArray[n2];
                                break block6;
                            }
                            if (!(object instanceof Number) || object instanceof BigInteger) break block7;
                            d2 = ((Number)object).doubleValue();
                            break block6;
                        }
                        return false;
                    }
                    if (object != uniqueTag) break block8;
                    d2 = dArray[n2];
                    bl = bl2;
                    if (!(object2 instanceof Number)) break block9;
                    bl = bl2;
                    if (object2 instanceof BigInteger) break block9;
                    d3 = ((Number)object2).doubleValue();
                }
                bl = bl2;
                if (d2 == d3) {
                    bl = true;
                }
            }
            return bl;
        }
        return ScriptRuntime.shallowEq(object, object2);
    }

    private static int doVarIncDec(Context object, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, double[] object2, int n2, Object[] objectArray2, double[] dArray, int[] nArray, int n3) {
        int n4 = n2 + 1;
        Object object3 = interpreter$CallFrame.idata;
        byte by = ((InterpreterData)object3).itsICode[interpreter$CallFrame.pc];
        if (!interpreter$CallFrame.useActivation) {
            object3 = objectArray2[n3];
            double d2 = 0.0;
            object = null;
            UniqueTag uniqueTag = UniqueTag.DOUBLE_MARK;
            if (object3 == uniqueTag) {
                d2 = dArray[n3];
            } else {
                Number number = ScriptRuntime.toNumeric(object3);
                if (number instanceof BigInteger) {
                    object = (BigInteger)number;
                } else {
                    d2 = number.doubleValue();
                }
            }
            int n5 = 0;
            n2 = 0;
            if (object == null) {
                double d3 = (by & 1) == 0 ? 1.0 + d2 : d2 - 1.0;
                if ((by & 2) != 0) {
                    n2 = 1;
                }
                if ((nArray[n3] & 1) == 0) {
                    if (object3 != uniqueTag) {
                        objectArray2[n3] = uniqueTag;
                    }
                    dArray[n3] = d3;
                    objectArray[n4] = uniqueTag;
                    if (n2 == 0) {
                        d2 = d3;
                    }
                    object2[n4] = d2;
                } else if (n2 != 0 && object3 != uniqueTag) {
                    objectArray[n4] = object3;
                } else {
                    objectArray[n4] = uniqueTag;
                    if (n2 == 0) {
                        d2 = d3;
                    }
                    object2[n4] = d2;
                }
            } else {
                object2 = (by & 1) == 0 ? (Object)((BigInteger)object).add(BigInteger.ONE) : (Object)((BigInteger)object).subtract(BigInteger.ONE);
                n2 = n5;
                if ((by & 2) != 0) {
                    n2 = 1;
                }
                if ((nArray[n3] & 1) == 0) {
                    objectArray2[n3] = object2;
                    if (n2 == 0) {
                        object = object2;
                    }
                    objectArray[n4] = object;
                } else if (n2 != 0 && object3 != uniqueTag) {
                    objectArray[n4] = object3;
                } else {
                    if (n2 == 0) {
                        object = object2;
                    }
                    objectArray[n4] = object;
                }
            }
        } else {
            object2 = ((InterpreterData)object3).argNames[n3];
            objectArray[n4] = ScriptRuntime.nameIncrDecr(interpreter$CallFrame.scope, (String)object2, (Context)object, by);
        }
        ++interpreter$CallFrame.pc;
        return n4;
    }

    static void dumpICode(InterpreterData interpreterData) {
    }

    private static void enterFrame(Context context, Interpreter$CallFrame interpreter$CallFrame, Object[] objectArray, boolean bl) {
        block6: {
            Scriptable scriptable;
            boolean bl2;
            boolean bl3;
            block4: {
                Scriptable scriptable2;
                block5: {
                    bl3 = interpreter$CallFrame.idata.itsNeedsActivation;
                    bl2 = interpreter$CallFrame.debuggerFrame != null;
                    if (!bl3 && !bl2) break block6;
                    scriptable2 = interpreter$CallFrame.scope;
                    if (scriptable2 == null) break block5;
                    scriptable = scriptable2;
                    if (!bl) break block4;
                    while (true) {
                        scriptable = scriptable2;
                        if (!(scriptable2 instanceof NativeWith)) break block4;
                        scriptable2 = scriptable = scriptable2.getParentScope();
                        if (scriptable == null) break block5;
                        Interpreter$CallFrame interpreter$CallFrame2 = interpreter$CallFrame.parentFrame;
                        scriptable2 = scriptable;
                        if (interpreter$CallFrame2 == null) continue;
                        scriptable2 = scriptable;
                        if (interpreter$CallFrame2.scope == scriptable) break;
                    }
                    scriptable2 = scriptable;
                }
                Kit.codeBug();
                scriptable = scriptable2;
            }
            if (bl2) {
                interpreter$CallFrame.debuggerFrame.onEnter(context, scriptable, interpreter$CallFrame.thisObj, objectArray);
            }
            if (bl3) {
                ScriptRuntime.enterActivationFunction(context, scriptable);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void exitFrame(Context context, Interpreter$CallFrame interpreter$CallFrame, Object object) {
        Object object2;
        if (interpreter$CallFrame.idata.itsNeedsActivation) {
            ScriptRuntime.exitActivationFunction(context);
        }
        if ((object2 = interpreter$CallFrame.debuggerFrame) == null) return;
        try {
            if (object instanceof Throwable) {
                object2.onExit(context, true, object);
                return;
            }
            Interpreter$ContinuationJump interpreter$ContinuationJump = (Interpreter$ContinuationJump)object;
            object = interpreter$ContinuationJump == null ? interpreter$CallFrame.result : interpreter$ContinuationJump.result;
            object2 = object;
            if (object == UniqueTag.DOUBLE_MARK) {
                double d2 = interpreter$ContinuationJump == null ? interpreter$CallFrame.resultDbl : interpreter$ContinuationJump.resultDbl;
                object2 = ScriptRuntime.wrapNumber(d2);
            }
            interpreter$CallFrame.debuggerFrame.onExit(context, false, object2);
            return;
        }
        catch (Throwable throwable) {
            System.err.println("RHINO USAGE WARNING: onExit terminated with exception");
            throwable.printStackTrace(System.err);
        }
    }

    private static Object freezeGenerator(Context object, Interpreter$CallFrame interpreter$CallFrame, int n2, Interpreter$GeneratorState interpreter$GeneratorState, boolean bl) {
        if (interpreter$GeneratorState.operation != 2) {
            interpreter$CallFrame.frozen = true;
            interpreter$CallFrame.result = interpreter$CallFrame.stack[n2];
            interpreter$CallFrame.resultDbl = interpreter$CallFrame.sDbl[n2];
            interpreter$CallFrame.savedStackTop = n2;
            --interpreter$CallFrame.pc;
            ScriptRuntime.exitActivationFunction((Context)object);
            object = interpreter$CallFrame.result;
            if (object == UniqueTag.DOUBLE_MARK) {
                object = ScriptRuntime.wrapNumber(interpreter$CallFrame.resultDbl);
            }
            if (bl) {
                return new ES6Generator$YieldStarResult(object);
            }
            return object;
        }
        throw ScriptRuntime.typeErrorById("msg.yield.closing", new Object[0]);
    }

    private static Object[] getArgsArray(Object[] objectArray, double[] dArray, int n2, int n3) {
        if (n3 == 0) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] objectArray2 = new Object[n3];
        int n4 = 0;
        while (n4 != n3) {
            Object object;
            Object object2 = object = objectArray[n2];
            if (object == UniqueTag.DOUBLE_MARK) {
                object2 = ScriptRuntime.wrapNumber(dArray[n2]);
            }
            objectArray2[n4] = object2;
            ++n4;
            ++n2;
        }
        return objectArray2;
    }

    static String getEncodedSource(InterpreterData interpreterData) {
        String string = interpreterData.encodedSource;
        if (string == null) {
            return null;
        }
        return string.substring(interpreterData.encodedSourceStart, interpreterData.encodedSourceEnd);
    }

    /*
     * Unable to fully structure code
     */
    private static int getExceptionHandler(Interpreter$CallFrame var0, boolean var1_1) {
        var12_2 = var0.idata.itsExceptionTable;
        var8_3 = -1;
        if (var12_2 == null) {
            return -1;
        }
        var11_4 = var0.pc - 1;
        var5_6 = 0;
        var4_7 = 0;
        for (var2_5 = 0; var2_5 != var12_2.length; var2_5 += 6) {
            block6: {
                block8: {
                    block7: {
                        var10_12 = var12_2[var2_5 + 0];
                        var9_11 = var12_2[var2_5 + 1];
                        var7_10 = var8_3;
                        var6_9 = var5_6;
                        var3_8 = var4_7;
                        if (var10_12 > var11_4) break block6;
                        if (var11_4 < var9_11) break block7;
                        var7_10 = var8_3;
                        var6_9 = var5_6;
                        var3_8 = var4_7;
                        break block6;
                    }
                    if (!var1_1 || var12_2[var2_5 + 3] == 1) break block8;
                    var7_10 = var8_3;
                    var6_9 = var5_6;
                    var3_8 = var4_7;
                    break block6;
                }
                if (var8_3 < 0) ** GOTO lbl39
                if (var5_6 < var9_11) {
                    var7_10 = var8_3;
                    var6_9 = var5_6;
                    var3_8 = var4_7;
                } else {
                    if (var4_7 > var10_12) {
                        Kit.codeBug();
                    }
                    if (var5_6 == var9_11) {
                        Kit.codeBug();
                    }
lbl39:
                    // 4 sources

                    var7_10 = var2_5;
                    var3_8 = var10_12;
                    var6_9 = var9_11;
                }
            }
            var8_3 = var7_10;
            var5_6 = var6_9;
            var4_7 = var3_8;
        }
        return var8_3;
    }

    private static int getIndex(byte[] byArray, int n2) {
        byte by = byArray[n2];
        return byArray[n2 + 1] & 0xFF | (by & 0xFF) << 8;
    }

    private static int getInt(byte[] byArray, int n2) {
        byte by = byArray[n2];
        byte by2 = byArray[n2 + 1];
        byte by3 = byArray[n2 + 2];
        return byArray[n2 + 3] & 0xFF | (by << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    static int[] getLineNumbers(InterpreterData object) {
        int n2;
        UintMap uintMap = new UintMap();
        object = ((InterpreterData)object).itsICode;
        int n3 = ((Object)object).length;
        for (int i2 = 0; i2 != n3; i2 += n2) {
            Object object2 = object[i2];
            n2 = Interpreter.bytecodeSpan((int)object2);
            if (object2 != -26) continue;
            if (n2 != 3) {
                Kit.codeBug();
            }
            uintMap.put(Interpreter.getIndex((byte[])object, i2 + 1), 0);
        }
        return uintMap.getKeys();
    }

    private static int getShort(byte[] byArray, int n2) {
        byte by = byArray[n2];
        return byArray[n2 + 1] & 0xFF | by << 8;
    }

    private static Interpreter$CallFrame initFrame(Context context, Scriptable scriptable, Scriptable object, Object[] objectArray, double[] dArray, int n2, int n3, InterpretedFunction interpretedFunction, Interpreter$CallFrame interpreter$CallFrame) {
        object = new Interpreter$CallFrame(context, (Scriptable)object, interpretedFunction, interpreter$CallFrame);
        ((Interpreter$CallFrame)object).initializeArgs(context, scriptable, objectArray, dArray, n2, n3);
        Interpreter.enterFrame(context, (Interpreter$CallFrame)object, objectArray, false);
        return object;
    }

    private static Interpreter$CallFrame initFrameForApplyOrCall(Context object, Interpreter$CallFrame objectArray, int n2, Object[] objectArray2, double[] dArray, int n3, int n4, Scriptable scriptable, IdFunctionObject idFunctionObject, InterpretedFunction interpretedFunction) {
        Object object2;
        Object object3;
        int n5;
        Object[] objectArray3 = objectArray;
        if (n2 != 0) {
            n5 = n3 + 2;
            object2 = object3 = objectArray2[n5];
            if (object3 == UniqueTag.DOUBLE_MARK) {
                object2 = ScriptRuntime.wrapNumber(dArray[n5]);
            }
            object2 = ScriptRuntime.toObjectOrNull((Context)object, object2, objectArray3.scope);
        } else {
            object2 = null;
        }
        object3 = object2;
        if (object2 == null) {
            object3 = ScriptRuntime.getTopCallScope((Context)object);
        }
        if (n4 == -55) {
            Interpreter.exitFrame((Context)object, (Interpreter$CallFrame)objectArray, null);
            objectArray3 = objectArray3.parentFrame;
        } else {
            objectArray3.savedStackTop = n3;
            objectArray3.savedCallOp = n4;
        }
        if (BaseFunction.isApply(idFunctionObject)) {
            objectArray = n2 < 2 ? ScriptRuntime.emptyArgs : ScriptRuntime.getApplyArguments((Context)object, objectArray2[n3 + 3]);
            object = Interpreter.initFrame((Context)object, scriptable, (Scriptable)object3, objectArray, null, 0, objectArray.length, interpretedFunction, (Interpreter$CallFrame)objectArray3);
        } else {
            for (n4 = 1; n4 < n2; ++n4) {
                n5 = n3 + 1 + n4;
                int n6 = n3 + 2 + n4;
                objectArray2[n5] = objectArray2[n6];
                dArray[n5] = dArray[n6];
            }
            n2 = n2 < 2 ? 0 : --n2;
            object = Interpreter.initFrame((Context)object, scriptable, (Scriptable)object3, objectArray2, dArray, n3 + 2, n2, interpretedFunction, (Interpreter$CallFrame)objectArray3);
        }
        return object;
    }

    private static Interpreter$CallFrame initFrameForNoSuchMethod(Context object, Interpreter$CallFrame interpreter$CallFrame, int n2, Object[] object2, double[] object3, int n3, int n4, Scriptable scriptable, Scriptable scriptable2, ScriptRuntime$NoSuchMethodShim object4, InterpretedFunction interpretedFunction) {
        int n5 = n3 + 2;
        Object[] objectArray = new Object[n2];
        int n6 = 0;
        while (n6 < n2) {
            Object object5;
            Object object6 = object5 = object2[n5];
            if (object5 == UniqueTag.DOUBLE_MARK) {
                object6 = ScriptRuntime.wrapNumber(object3[n5]);
            }
            objectArray[n6] = object6;
            ++n6;
            ++n5;
        }
        object3 = ((ScriptRuntime$NoSuchMethodShim)object4).methodName;
        object4 = ((Context)object).newArray(scriptable2, objectArray);
        if (n4 == -55) {
            object2 = interpreter$CallFrame.parentFrame;
            Interpreter.exitFrame((Context)object, interpreter$CallFrame, null);
        } else {
            object2 = interpreter$CallFrame;
        }
        object = Interpreter.initFrame((Context)object, scriptable2, scriptable, new Object[]{object3, object4}, null, 0, 2, interpretedFunction, (Interpreter$CallFrame)object2);
        if (n4 != -55) {
            interpreter$CallFrame.savedStackTop = n3;
            interpreter$CallFrame.savedCallOp = n4;
        }
        return object;
    }

    private static void initFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int n2) {
        InterpretedFunction interpretedFunction2 = InterpretedFunction.createFunction(context, scriptable, interpretedFunction, n2);
        ScriptRuntime.initFunction(context, scriptable, interpretedFunction2, interpretedFunction2.idata.itsFunctionType, interpretedFunction.idata.evalScriptFlag);
    }

    static Object interpret(InterpretedFunction object, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objectArray) {
        Object object2;
        Object object3;
        if (!ScriptRuntime.hasTopCall(context)) {
            Kit.codeBug();
        }
        if ((object3 = context.interpreterSecurityDomain) != (object2 = ((InterpretedFunction)object).securityDomain)) {
            context.interpreterSecurityDomain = object2;
            try {
                object = ((InterpretedFunction)object).securityController.callWithDomain(object2, context, (Callable)object, scriptable, scriptable2, objectArray);
                return object;
            }
            finally {
                context.interpreterSecurityDomain = object3;
            }
        }
        object = Interpreter.initFrame(context, scriptable, scriptable2, objectArray, null, 0, objectArray.length, (InterpretedFunction)object, null);
        ((Interpreter$CallFrame)object).isContinuationsTopFrame = context.isContinuationsTopCall;
        context.isContinuationsTopCall = false;
        return Interpreter.interpretLoop(context, (Interpreter$CallFrame)object, null);
    }

    /*
     * Exception decompiling
     */
    private static Object interpretLoop(Context var0, Interpreter$CallFrame var1_1, Object var2_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 266->274)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Interpreter$CallFrame processThrowable(Context object, Object object2, Interpreter$CallFrame object3, int object4, boolean bl) {
        if (object4 >= 0) {
            object = object3;
            if (object3.frozen) {
                object = object3.cloneFrozen();
            }
            object3 = ((Interpreter$CallFrame)object).idata.itsExceptionTable;
            Object object5 = object3[object4 + 2];
            ((Interpreter$CallFrame)object).pc = (int)object5;
            if (bl) {
                ((Interpreter$CallFrame)object).pcPrevBranch = (int)object5;
            }
            ((Interpreter$CallFrame)object).savedStackTop = ((Interpreter$CallFrame)object).emptyStackTop;
            object5 = ((Interpreter$CallFrame)object).localShift;
            Object object6 = object3[object4 + 5];
            object4 = object3[object4 + 4];
            object3 = ((Interpreter$CallFrame)object).stack;
            ((Interpreter$CallFrame)object).scope = (Scriptable)object3[object6 + object5];
            object3[object5 + object4] = object2;
        } else {
            int n2;
            Interpreter$ContinuationJump interpreter$ContinuationJump = (Interpreter$ContinuationJump)object2;
            if (interpreter$ContinuationJump.branchFrame != object3) {
                Kit.codeBug();
            }
            if (interpreter$ContinuationJump.capturedFrame == null) {
                Kit.codeBug();
            }
            Interpreter$CallFrame interpreter$CallFrame = interpreter$ContinuationJump.capturedFrame;
            object4 = interpreter$CallFrame.frameIndex + 1;
            object2 = interpreter$ContinuationJump.branchFrame;
            int n3 = object4;
            if (object2 != null) {
                n3 = object4 - object2.frameIndex;
            }
            int n4 = 0;
            object2 = null;
            object4 = 0;
            while (true) {
                n2 = object4;
                if (n4 == n3) break;
                if (!interpreter$CallFrame.frozen) {
                    Kit.codeBug();
                }
                n2 = object4;
                object3 = object2;
                if (interpreter$CallFrame.useActivation) {
                    object3 = object2;
                    if (object2 == null) {
                        object3 = new Interpreter$CallFrame[n3 - n4];
                    }
                    object3[object4] = interpreter$CallFrame;
                    n2 = object4 + 1;
                }
                interpreter$CallFrame = interpreter$CallFrame.parentFrame;
                ++n4;
                object4 = n2;
                object2 = object3;
            }
            while (n2 != 0) {
                Interpreter.enterFrame((Context)object, (Interpreter$CallFrame)object2[--n2], ScriptRuntime.emptyArgs, true);
            }
            object = interpreter$ContinuationJump.capturedFrame.cloneFrozen();
            Interpreter.setCallResult((Interpreter$CallFrame)object, interpreter$ContinuationJump.result, interpreter$ContinuationJump.resultDbl);
        }
        ((Interpreter$CallFrame)object).throwable = null;
        return object;
    }

    public static Object restartContinuation(NativeContinuation serializable, Context context, Scriptable object, Object[] objectArray) {
        if (!ScriptRuntime.hasTopCall(context)) {
            return ScriptRuntime.doTopCall(serializable, context, (Scriptable)object, null, objectArray, context.isTopLevelStrict);
        }
        object = objectArray.length == 0 ? Undefined.instance : objectArray[0];
        if ((Interpreter$CallFrame)serializable.getImplementation() == null) {
            return object;
        }
        serializable = new Interpreter$ContinuationJump((NativeContinuation)serializable, null);
        ((Interpreter$ContinuationJump)serializable).result = object;
        return Interpreter.interpretLoop(context, null, serializable);
    }

    public static Object resumeGenerator(Context object, Scriptable object2, int n2, Object object3, Object object4) {
        object3 = (Interpreter$CallFrame)object3;
        object2 = new Interpreter$GeneratorState(n2, object4);
        if (n2 == 2) {
            try {
                object = Interpreter.interpretLoop((Context)object, (Interpreter$CallFrame)object3, object2);
                return object;
            }
            catch (RuntimeException runtimeException) {
                if (runtimeException == object4) {
                    return Undefined.instance;
                }
                throw runtimeException;
            }
        }
        object = Interpreter.interpretLoop((Context)object, (Interpreter$CallFrame)object3, object2);
        object2 = ((Interpreter$GeneratorState)object2).returnedException;
        if (object2 == null) {
            return object;
        }
        throw object2;
    }

    private static void setCallResult(Interpreter$CallFrame interpreter$CallFrame, Object object, double d2) {
        int n2 = interpreter$CallFrame.savedCallOp;
        if (n2 == 38) {
            Object[] objectArray = interpreter$CallFrame.stack;
            n2 = interpreter$CallFrame.savedStackTop;
            objectArray[n2] = object;
            interpreter$CallFrame.sDbl[n2] = d2;
        } else if (n2 == 30) {
            if (object instanceof Scriptable) {
                interpreter$CallFrame.stack[interpreter$CallFrame.savedStackTop] = object;
            }
        } else {
            Kit.codeBug();
        }
        interpreter$CallFrame.savedCallOp = 0;
    }

    private static boolean stack_boolean(Interpreter$CallFrame interpreter$CallFrame, int n2) {
        Object object = interpreter$CallFrame.stack[n2];
        boolean bl = Boolean.TRUE.equals(object);
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            return true;
        }
        if (Boolean.FALSE.equals(object)) {
            return false;
        }
        if (object == UniqueTag.DOUBLE_MARK) {
            double d2 = interpreter$CallFrame.sDbl[n2];
            if (Double.isNaN(d2) || d2 == 0.0) {
                bl3 = false;
            }
            return bl3;
        }
        if (object != null && object != Undefined.instance) {
            if (object instanceof BigInteger) {
                return object.equals(BigInteger.ZERO) ^ true;
            }
            if (object instanceof Number) {
                double d3 = ((Number)object).doubleValue();
                bl3 = !Double.isNaN(d3) && d3 != 0.0 ? bl2 : false;
                return bl3;
            }
            return ScriptRuntime.toBoolean(object);
        }
        return false;
    }

    private static double stack_double(Interpreter$CallFrame interpreter$CallFrame, int n2) {
        Object object = interpreter$CallFrame.stack[n2];
        if (object != UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toNumber(object);
        }
        return interpreter$CallFrame.sDbl[n2];
    }

    private static int stack_int32(Interpreter$CallFrame interpreter$CallFrame, int n2) {
        Object object = interpreter$CallFrame.stack[n2];
        if (object == UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toInt32(interpreter$CallFrame.sDbl[n2]);
        }
        return ScriptRuntime.toInt32(object);
    }

    private static Number stack_numeric(Interpreter$CallFrame interpreter$CallFrame, int n2) {
        Object object = interpreter$CallFrame.stack[n2];
        if (object != UniqueTag.DOUBLE_MARK) {
            return ScriptRuntime.toNumeric(object);
        }
        return interpreter$CallFrame.sDbl[n2];
    }

    private static Object thawGenerator(Interpreter$CallFrame interpreter$CallFrame, int n2, Interpreter$GeneratorState interpreter$GeneratorState, int n3) {
        interpreter$CallFrame.frozen = false;
        int n4 = Interpreter.getIndex(interpreter$CallFrame.idata.itsICode, interpreter$CallFrame.pc);
        interpreter$CallFrame.pc += 2;
        int n5 = interpreter$GeneratorState.operation;
        if (n5 == 1) {
            return new JavaScriptException(interpreter$GeneratorState.value, interpreter$CallFrame.idata.itsSourceFile, n4);
        }
        if (n5 == 2) {
            return interpreter$GeneratorState.value;
        }
        if (n5 == 0) {
            if (n3 == 73 || n3 == -66) {
                interpreter$CallFrame.stack[n2] = interpreter$GeneratorState.value;
            }
            return Scriptable.NOT_FOUND;
        }
        throw Kit.codeBug();
    }

    @Override
    public void captureStackInfo(RhinoException rhinoException) {
        Object object = Context.getCurrentContext();
        if (object != null && ((Context)object).lastInterpreterFrame != null) {
            int n2;
            int n3;
            Object[] objectArray = ((Context)object).previousInterpreterInvocations;
            if (objectArray != null && objectArray.size() != 0) {
                n2 = n3 = ((Context)object).previousInterpreterInvocations.size();
                if (((Context)object).previousInterpreterInvocations.peek() == ((Context)object).lastInterpreterFrame) {
                    n2 = n3 - 1;
                }
                objectArray = new Interpreter$CallFrame[n2 + 1];
                ((Context)object).previousInterpreterInvocations.toArray(objectArray);
            } else {
                objectArray = new Interpreter$CallFrame[1];
            }
            objectArray[objectArray.length - 1] = (Interpreter$CallFrame)((Context)object).lastInterpreterFrame;
            n2 = 0;
            for (n3 = 0; n3 != objectArray.length; ++n3) {
                n2 += ((Interpreter$CallFrame)objectArray[n3]).frameIndex + 1;
            }
            int[] nArray = new int[n2];
            int n4 = objectArray.length;
            block1: while (n4 != 0) {
                int n5 = n4 - 1;
                object = objectArray[n5];
                n3 = n2;
                while (true) {
                    n4 = n5;
                    n2 = n3--;
                    if (object == null) continue block1;
                    nArray[n3] = ((Interpreter$CallFrame)object).pcSourceLineStart;
                    object = ((Interpreter$CallFrame)object).parentFrame;
                }
            }
            if (n2 != 0) {
                Kit.codeBug();
            }
            rhinoException.interpreterStackInfo = objectArray;
            rhinoException.interpreterLineData = nArray;
            return;
        }
        rhinoException.interpreterStackInfo = null;
        rhinoException.interpreterLineData = null;
    }

    @Override
    public Object compile(CompilerEnvirons object, ScriptNode scriptNode, String string, boolean bl) {
        this.itsData = object = new CodeGenerator().compile((CompilerEnvirons)object, scriptNode, string, bl);
        return object;
    }

    @Override
    public Function createFunctionObject(Context context, Scriptable scriptable, Object object, Object object2) {
        if (object != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createFunction(context, scriptable, this.itsData, object2);
    }

    @Override
    public Script createScriptObject(Object object, Object object2) {
        if (object != this.itsData) {
            Kit.codeBug();
        }
        return InterpretedFunction.createScript(this.itsData, object2);
    }

    @Override
    public String getPatchedStack(RhinoException serializable, String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() + 1000);
        String string2 = SecurityUtilities.getSystemProperty("line.separator");
        Interpreter$CallFrame[] interpreter$CallFrameArray = (Interpreter$CallFrame[])serializable.interpreterStackInfo;
        int[] nArray = serializable.interpreterLineData;
        int n2 = interpreter$CallFrameArray.length;
        int n3 = nArray.length;
        int n4 = 0;
        while (n2 != 0) {
            char c2;
            --n2;
            int n5 = string.indexOf("org.mozilla.javascript.Interpreter.interpretLoop", n4);
            if (n5 < 0) break;
            n5 += 48;
            while (n5 != string.length() && (c2 = string.charAt(n5)) != '\n' && c2 != '\r') {
                ++n5;
            }
            stringBuilder.append(string, n4, n5);
            serializable = interpreter$CallFrameArray[n2];
            while (serializable != null) {
                if (n3 == 0) {
                    Kit.codeBug();
                }
                --n3;
                InterpreterData interpreterData = ((Interpreter$CallFrame)serializable).idata;
                stringBuilder.append(string2);
                stringBuilder.append("\tat script");
                String string3 = interpreterData.itsName;
                if (string3 != null && string3.length() != 0) {
                    stringBuilder.append('.');
                    stringBuilder.append(interpreterData.itsName);
                }
                stringBuilder.append('(');
                stringBuilder.append(interpreterData.itsSourceFile);
                n4 = nArray[n3];
                if (n4 >= 0) {
                    stringBuilder.append(':');
                    stringBuilder.append(Interpreter.getIndex(interpreterData.itsICode, n4));
                }
                stringBuilder.append(')');
                serializable = ((Interpreter$CallFrame)serializable).parentFrame;
            }
            n4 = n5;
        }
        stringBuilder.append(string.substring(n4));
        return stringBuilder.toString();
    }

    @Override
    public List<String> getScriptStack(RhinoException serializable) {
        ScriptStackElement[][] scriptStackElementArray = this.getScriptStackElements((RhinoException)serializable);
        ArrayList<String> arrayList = new ArrayList<String>(scriptStackElementArray.length);
        String string = SecurityUtilities.getSystemProperty("line.separator");
        for (ScriptStackElement[] scriptStackElementArray2 : scriptStackElementArray) {
            serializable = new StringBuilder();
            int n2 = scriptStackElementArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                scriptStackElementArray2[i2].renderJavaStyle((StringBuilder)serializable);
                ((StringBuilder)serializable).append(string);
            }
            arrayList.add(((StringBuilder)serializable).toString());
        }
        return arrayList;
    }

    public ScriptStackElement[][] getScriptStackElements(RhinoException serializable) {
        if (serializable.interpreterStackInfo == null) {
            return null;
        }
        ArrayList<ScriptStackElement[]> arrayList = new ArrayList<ScriptStackElement[]>();
        Interpreter$CallFrame[] interpreter$CallFrameArray = (Interpreter$CallFrame[])serializable.interpreterStackInfo;
        int[] nArray = serializable.interpreterLineData;
        int n2 = interpreter$CallFrameArray.length;
        int n3 = nArray.length;
        while (n2 != 0) {
            serializable = interpreter$CallFrameArray[--n2];
            ArrayList<ScriptStackElement> arrayList2 = new ArrayList<ScriptStackElement>();
            while (serializable != null) {
                if (n3 == 0) {
                    Kit.codeBug();
                }
                int n4 = n3 - 1;
                Object object = ((Interpreter$CallFrame)serializable).idata;
                String string = ((InterpreterData)object).itsSourceFile;
                n3 = nArray[n4];
                n3 = n3 >= 0 ? Interpreter.getIndex(((InterpreterData)object).itsICode, n3) : -1;
                String string2 = ((InterpreterData)object).itsName;
                object = string2 != null && string2.length() != 0 ? ((InterpreterData)object).itsName : null;
                serializable = ((Interpreter$CallFrame)serializable).parentFrame;
                arrayList2.add(new ScriptStackElement(string, (String)object, n3));
                n3 = n4;
            }
            arrayList.add(arrayList2.toArray(new ScriptStackElement[0]));
        }
        return (ScriptStackElement[][])arrayList.toArray((T[])new ScriptStackElement[arrayList.size()][]);
    }

    @Override
    public String getSourcePositionFromStack(Context object, int[] nArray) {
        object = (Interpreter$CallFrame)((Context)object).lastInterpreterFrame;
        InterpreterData interpreterData = ((Interpreter$CallFrame)object).idata;
        int n2 = ((Interpreter$CallFrame)object).pcSourceLineStart;
        nArray[0] = n2 >= 0 ? Interpreter.getIndex(interpreterData.itsICode, n2) : 0;
        return interpreterData.itsSourceFile;
    }

    @Override
    public void setEvalScriptFlag(Script script) {
        ((InterpretedFunction)script).idata.evalScriptFlag = true;
    }
}

