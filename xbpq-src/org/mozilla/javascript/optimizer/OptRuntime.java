/*
 * Decompiled with CFR 0.152.
 */
package org.mozilla.javascript.optimizer;

import com.github.catvod.spider.merge.i1.a;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ES6Generator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.NativeIterator$StopIteration;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.optimizer.OptRuntime$GeneratorState;

public final class OptRuntime
extends ScriptRuntime {
    public static final Double minusOneObj;
    public static final Double oneObj;

    static {
        oneObj = 1.0;
        minusOneObj = -1.0;
    }

    public static /* synthetic */ Object a(String[] stringArray, Script script, Context context) {
        return OptRuntime.lambda$main$0(stringArray, script, context);
    }

    public static Object add(double d2, Object object, Context context) {
        if (object instanceof Double) {
            return (Double)object + d2;
        }
        if (object instanceof Integer) {
            return d2 + (double)((Integer)object).intValue();
        }
        return ScriptRuntime.add(d2, object, context);
    }

    public static Object add(Object object, double d2, Context context) {
        if (object instanceof Double) {
            return (Double)object + d2;
        }
        if (object instanceof Integer) {
            return (double)((Integer)object).intValue() + d2;
        }
        return ScriptRuntime.add(object, d2, context);
    }

    public static Function bindThis(NativeFunction nativeFunction, Context context, Scriptable scriptable, Scriptable scriptable2) {
        return new ArrowFunction(context, scriptable, nativeFunction, scriptable2);
    }

    public static Object call0(Callable callable, Scriptable scriptable, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, ScriptRuntime.emptyArgs);
    }

    public static Object call1(Callable callable, Scriptable scriptable, Object object, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, new Object[]{object});
    }

    public static Object call2(Callable callable, Scriptable scriptable, Object object, Object object2, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, new Object[]{object, object2});
    }

    public static Object callN(Callable callable, Scriptable scriptable, Object[] objectArray, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, objectArray);
    }

    public static Object callName(Object[] objectArray, String string, Context context, Scriptable scriptable) {
        return ScriptRuntime.getNameFunctionAndThis(string, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), objectArray);
    }

    public static Object callName0(String string, Context context, Scriptable scriptable) {
        return ScriptRuntime.getNameFunctionAndThis(string, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
    }

    public static Object callProp0(Object object, String string, Context context, Scriptable scriptable) {
        return ScriptRuntime.getPropFunctionAndThis(object, string, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
    }

    public static Object callSpecial(Context context, Callable callable, Scriptable scriptable, Object[] objectArray, Scriptable scriptable2, Scriptable scriptable3, int n2, String string, int n3) {
        return ScriptRuntime.callSpecial(context, callable, scriptable, objectArray, scriptable2, scriptable3, n2, string, n3);
    }

    public static Scriptable createNativeGenerator(NativeFunction nativeFunction, Scriptable scriptable, Scriptable object, int n2, int n3) {
        object = new OptRuntime$GeneratorState((Scriptable)object, n2, n3);
        if (Context.getCurrentContext().getLanguageVersion() >= 200) {
            return new ES6Generator(scriptable, nativeFunction, object);
        }
        return new NativeGenerator(scriptable, nativeFunction, object);
    }

    private static int[] decodeIntArray(String string, int n2) {
        if (n2 == 0) {
            if (string == null) {
                return null;
            }
            throw new IllegalArgumentException();
        }
        int n3 = string.length();
        if (n3 != n2 * 2 + 1 && string.charAt(0) != '\u0001') {
            throw new IllegalArgumentException();
        }
        int[] nArray = new int[n2];
        for (int i2 = 0; i2 != n2; ++i2) {
            n3 = i2 * 2 + 1;
            char c2 = string.charAt(n3);
            nArray[i2] = string.charAt(n3 + 1) | c2 << 16;
        }
        return nArray;
    }

    @Deprecated
    public static Object elemIncrDecr(Object object, double d2, Context context, int n2) {
        return OptRuntime.elemIncrDecr(object, d2, context, ScriptRuntime.getTopCallScope(context), n2);
    }

    public static Object elemIncrDecr(Object object, double d2, Context context, Scriptable scriptable, int n2) {
        return ScriptRuntime.elemIncrDecr(object, d2, context, scriptable, n2);
    }

    static String encodeIntArray(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int n2 = nArray.length;
        char[] cArray = new char[n2 * 2 + 1];
        cArray[0] = '\u0001';
        for (int i2 = 0; i2 != n2; ++i2) {
            int n3 = nArray[i2];
            int n4 = i2 * 2 + 1;
            cArray[n4] = (char)(n3 >>> 16);
            cArray[n4 + 1] = (char)n3;
        }
        return new String(cArray);
    }

    public static Object[] getGeneratorLocalsState(Object object) {
        object = (OptRuntime$GeneratorState)object;
        if (((OptRuntime$GeneratorState)object).localsState == null) {
            ((OptRuntime$GeneratorState)object).localsState = new Object[((OptRuntime$GeneratorState)object).maxLocals];
        }
        return ((OptRuntime$GeneratorState)object).localsState;
    }

    public static Object getGeneratorReturnValue(Object object) {
        Object object2;
        object = object2 = ((OptRuntime$GeneratorState)object).returnValue;
        if (object2 == null) {
            object = Undefined.instance;
        }
        return object;
    }

    public static Object[] getGeneratorStackState(Object object) {
        object = (OptRuntime$GeneratorState)object;
        if (((OptRuntime$GeneratorState)object).stackState == null) {
            ((OptRuntime$GeneratorState)object).stackState = new Object[((OptRuntime$GeneratorState)object).maxStack];
        }
        return ((OptRuntime$GeneratorState)object).stackState;
    }

    public static void initFunction(NativeFunction nativeFunction, int n2, Scriptable scriptable, Context context) {
        ScriptRuntime.initFunction(context, scriptable, nativeFunction, n2, false);
    }

    private static /* synthetic */ Object lambda$main$0(String[] stringArray, Script script, Context context) {
        ScriptableObject scriptableObject = ScriptRuntime.getGlobal(context);
        Object[] objectArray = new Object[stringArray.length];
        System.arraycopy(stringArray, 0, objectArray, 0, stringArray.length);
        scriptableObject.defineProperty("arguments", (Object)context.newArray((Scriptable)scriptableObject, objectArray), 2);
        script.exec(context, scriptableObject);
        return null;
    }

    public static void main(Script script, String[] stringArray) {
        ContextFactory.getGlobal().call(new a(stringArray, script));
    }

    public static Scriptable newArrayLiteral(Object[] objectArray, String string, int n2, Context context, Scriptable scriptable) {
        return ScriptRuntime.newArrayLiteral(objectArray, OptRuntime.decodeIntArray(string, n2), context, scriptable);
    }

    public static Object newObjectSpecial(Context context, Object object, Object[] objectArray, Scriptable scriptable, Scriptable scriptable2, int n2) {
        return ScriptRuntime.newSpecial(context, object, objectArray, scriptable, n2);
    }

    public static Object[] padStart(Object[] objectArray, int n2) {
        Object[] objectArray2 = new Object[objectArray.length + n2];
        System.arraycopy(objectArray, 0, objectArray2, n2, objectArray.length);
        return objectArray2;
    }

    public static void setGeneratorReturnValue(Object object, Object object2) {
        ((OptRuntime$GeneratorState)object).returnValue = object2;
    }

    public static void throwStopIteration(Object object, Object object2) {
        object = (object2 = OptRuntime.getGeneratorReturnValue(object2)) == Undefined.instance ? NativeIterator.getStopIterationObject((Scriptable)object) : new NativeIterator$StopIteration(object2);
        throw new JavaScriptException(object, "", 0);
    }

    public static Double wrapDouble(double d2) {
        if (d2 == 0.0) {
            if (1.0 / d2 > 0.0) {
                return ScriptRuntime.zeroObj;
            }
        } else {
            if (d2 == 1.0) {
                return oneObj;
            }
            if (d2 == -1.0) {
                return minusOneObj;
            }
            if (Double.isNaN(d2)) {
                return ScriptRuntime.NaNobj;
            }
        }
        return d2;
    }
}

